package co.com.tucompra.manualesback.Config;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Slf4j
@Configuration
public class WebConfig {

    @Value("${corsfilter.origins}")
    private String[] origins;

    @Value("${corsfilter.headers}")
    private String[] headers;

    @Value("${corsfilter.methods}")
    private String[] methods;
    
    @Value("${resttemplate.timeout}")
    private int timeoutRestTemplate;
    
    @Bean
    public WebMvcConfigurer corsConfigurer(HttpInterceptor httpInterceptor) {

        return new WebMvcConfigurer() {
            
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                
                log.info( "cors: {}, headers: {}, methods{} ", origins, headers, methods);
                
                registry.addMapping("/**")
                .allowedOrigins(origins)
                .allowedHeaders(headers)
                .allowedMethods(methods);
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(httpInterceptor);
            }
        };
    }

    @Bean
    public MessageSource messageValidationSource() {
        
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/mensajes/excepciones/mensajes");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean(name = "normal")
    public RestTemplate getRestTemplateNormal() {
        return new RestTemplate(getClientHttpRequestFactory());
    }

    private ClientHttpRequestFactory getClientHttpRequestFactory() {

        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory
        = new HttpComponentsClientHttpRequestFactory(
            
            HttpClientBuilder
                .create()
                .setMaxConnTotal(20)
                .setMaxConnPerRoute(5)
            .build()
        );
        
        clientHttpRequestFactory.setConnectTimeout(timeoutRestTemplate);
        clientHttpRequestFactory.setConnectionRequestTimeout(timeoutRestTemplate);
        clientHttpRequestFactory.setReadTimeout(timeoutRestTemplate);
        
        log.info("[{}]",timeoutRestTemplate);
        
        return clientHttpRequestFactory;
    }
}