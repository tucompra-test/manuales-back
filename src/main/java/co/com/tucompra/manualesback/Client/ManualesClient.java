/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.tucompra.manualesback.Client;

import co.com.tucompra.manualesback.dto.AutenticacionResponseWS;
import co.com.tucompra.manualesback.dto.AutenticacionUsuarioInput;
import co.com.tucompra.manualesback.dto.BancosWS;
import co.com.tucompra.manualesback.dto.BotonPagoInput;
import co.com.tucompra.manualesback.dto.BotonPagoResponse;
import co.com.tucompra.manualesback.dto.ConfirmacionTransaccionMedioPagoInput;
import co.com.tucompra.manualesback.dto.ConfirmacionTransaccionMedioPagoResponseWS;
import co.com.tucompra.manualesback.dto.ConsultaDeleteRecurrenciaTokenInput;
import co.com.tucompra.manualesback.dto.ConsultaReversaTransaccion;
import co.com.tucompra.manualesback.dto.ConsultaTokenTarjetaInput;
import co.com.tucompra.manualesback.dto.ConsultaTokenTarjetaResponse;
import co.com.tucompra.manualesback.dto.ConsultarEstadoTransaccionResponseWS;
import co.com.tucompra.manualesback.dto.EstadoTransaccionInputWS;
import co.com.tucompra.manualesback.dto.ListaBancosInputWS;
import co.com.tucompra.manualesback.dto.ResponseDelete;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jeffr
 */
@FeignClient(name = "manuales", url = "${url.manuales}")
@RequestMapping("tcWSDRest/api")
public interface ManualesClient {
    
    @PostMapping(value = "autenticar")
    public AutenticacionResponseWS autenticar(@RequestBody AutenticacionUsuarioInput data);
    
    @PostMapping(value = "consultarEstadoTransaccion")
    public ConsultarEstadoTransaccionResponseWS consultarEstadoTransaccion(@RequestBody EstadoTransaccionInputWS data);
    
    @PostMapping(value = "consultaInfoToken")
    public ConsultaTokenTarjetaResponse consultaInfoToken(@RequestBody ConsultaTokenTarjetaInput data);
    
    @PostMapping(value = "eliminarRecurrenciaToken")
    public ResponseDelete eliminarRecurrenciaToken(@RequestBody ConsultaDeleteRecurrenciaTokenInput data);
    
    @PostMapping(value = "reversarTransaccionTarjeta")
    public ResponseDelete reversarTransaccionTarjeta(@RequestBody ConsultaReversaTransaccion data);
    
    @PostMapping(value = "listarBancos")
    public List<BancosWS> listarBancos(@RequestBody ListaBancosInputWS data);
    
    @PostMapping(value = "confirmacionTransaccionMedioPago")
    public ConfirmacionTransaccionMedioPagoResponseWS confirmacionTransaccionMedioPago(@RequestBody ConfirmacionTransaccionMedioPagoInput data);
    
    @PostMapping(value = "crearBotonPago")
    public BotonPagoResponse crearBotonPago(@RequestBody BotonPagoInput data);
    
    @PostMapping(value = "crearTokenTarjeta")
    public ConfirmacionTransaccionMedioPagoResponseWS crearTokenTarjeta(@RequestBody ConfirmacionTransaccionMedioPagoInput data);
    
}
