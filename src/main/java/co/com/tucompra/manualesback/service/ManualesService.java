/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.tucompra.manualesback.service;

import co.com.tucompra.manualesback.Client.ManualesClient;
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
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jeffr
 */
@Slf4j
@Service
public class ManualesService {
    
    @Autowired
    private ManualesClient manualesClient;
    
    public AutenticacionResponseWS getAutenticar(AutenticacionUsuarioInput data) {

        return manualesClient.autenticar(data);
    }
    
    public ConsultarEstadoTransaccionResponseWS getConsultarEstadoTransaccion(EstadoTransaccionInputWS data) {

        return manualesClient.consultarEstadoTransaccion(data);
    }
    
    public ConsultaTokenTarjetaResponse getConsultaInfoToken( ConsultaTokenTarjetaInput data) {

        return manualesClient.consultaInfoToken(data);
    }
    
    public ResponseDelete getEliminarRecurrenciaToken( ConsultaDeleteRecurrenciaTokenInput data) {

        return manualesClient.eliminarRecurrenciaToken(data);
    }
    
    public ResponseDelete getReversarTransaccionTarjeta( ConsultaReversaTransaccion data) {

        return manualesClient.reversarTransaccionTarjeta(data);
    }
    
    public List<BancosWS> getListarBancosController( ListaBancosInputWS data) {

        return manualesClient.listarBancos(data);
    }
    
    public ConfirmacionTransaccionMedioPagoResponseWS getConfirmacionTransaccionMedioPago( ConfirmacionTransaccionMedioPagoInput data) {

        return manualesClient.confirmacionTransaccionMedioPago(data);
    }
    
    public BotonPagoResponse getCrearBotonPago( BotonPagoInput data) {

        return manualesClient.crearBotonPago(data);
    }
    
    public ConfirmacionTransaccionMedioPagoResponseWS getCrearTokenTarjeta( ConfirmacionTransaccionMedioPagoInput data) {

        return manualesClient.crearTokenTarjeta(data);
    }
    
    
}
