package co.com.tucompra.manualesback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

@EnableFeignClients
@EnableRetry
@SpringBootApplication
public class ManualesBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManualesBackApplication.class, args);
    }
}
