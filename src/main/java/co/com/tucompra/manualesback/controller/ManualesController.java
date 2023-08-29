/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.tucompra.manualesback.controller;

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
import co.com.tucompra.manualesback.service.ManualesService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jeffr
 */
@Slf4j
@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class ManualesController {
    
    @Autowired
    private ManualesService manualesService;
    
    @PostMapping(value = "autenticar")
    public AutenticacionResponseWS autenticarController(@RequestBody AutenticacionUsuarioInput data) {

        log.info("autenticarController(), terminal: [{}]",data.getTerminal());
        return manualesService.getAutenticar(data);
    }
    
    @PostMapping(value = "consultarEstadoTransaccion")
    public ConsultarEstadoTransaccionResponseWS consultarEstadoTransaccionController(@RequestBody EstadoTransaccionInputWS data) {

        log.info("consultarEstadoTransaccionController(), terminal: [{}]",data.getTerminal());
        return manualesService.getConsultarEstadoTransaccion(data);
    }
    
    @PostMapping(value = "consultaInfoToken")
    public ConsultaTokenTarjetaResponse consultaInfoTokenController(@RequestBody ConsultaTokenTarjetaInput data) {

        log.info("consultaInfoTokenController(), terminal: [{}]",data.getTerminal());
        return manualesService.getConsultaInfoToken(data);
    }
    
    @PostMapping(value = "eliminarRecurrenciaToken")
    public ResponseDelete eliminarRecurrenciaTokenController(@RequestBody ConsultaDeleteRecurrenciaTokenInput data) {

        log.info("eliminarRecurrenciaTokenController(), terminal: [{}]",data.getTerminal());
        return manualesService.getEliminarRecurrenciaToken(data);
    }
    
    @PostMapping(value = "reversarTransaccionTarjeta")
    public ResponseDelete reversarTransaccionTarjetaController(@RequestBody ConsultaReversaTransaccion data) {

        log.info("reversarTransaccionTarjetaController(), terminal: [{}]",data.getTerminal());
        return manualesService.getReversarTransaccionTarjeta(data);
    }
    
    @PostMapping(value = "listarBancos")
    public List<BancosWS> listarBancosController(@RequestBody ListaBancosInputWS data) {

        log.info("listarBancosController(), terminal: [{}]",data.getTerminal());
        return manualesService.getListarBancosController(data);
    }
    
    @PostMapping(value = "confirmacionTransaccionMedioPago")
    public ConfirmacionTransaccionMedioPagoResponseWS confirmacionTransaccionMedioPagoController(@RequestBody ConfirmacionTransaccionMedioPagoInput data) {

        log.info("confirmacionTransaccionMedioPagoController(), terminal: [{}]",data.getTerminal());
        return manualesService.getConfirmacionTransaccionMedioPago(data);
    }
    
    @PostMapping(value = "crearBotonPago")
    public BotonPagoResponse crearBotonPagoController(@RequestBody BotonPagoInput data) {

        log.info("crearBotonPagoController(), terminal: [{}]",data.getTerminal());
        return manualesService.getCrearBotonPago(data);
    }
    
    @PostMapping(value = "crearTokenTarjeta")
    public ConfirmacionTransaccionMedioPagoResponseWS crearTokenTarjetaController(@RequestBody ConfirmacionTransaccionMedioPagoInput data) {

        log.info("crearTokenTarjetaController(), terminal: [{}]",data.getTerminal());
        return manualesService.getCrearTokenTarjeta(data);
    }
}
