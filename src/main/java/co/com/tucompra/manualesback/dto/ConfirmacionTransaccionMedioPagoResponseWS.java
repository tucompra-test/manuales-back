/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.tucompra.manualesback.dto;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author jeffr
 */
@Data
@Builder
public class ConfirmacionTransaccionMedioPagoResponseWS {
    
    protected String codigoRespuesta;
    protected String descripcion;
    protected String codigoSeguimiento;
    protected String estado;
    protected String numeroAutorizacion;
    protected String referencia;
    protected String valor;
    protected String numeroTransaccion;
    protected String tokenTarjeta;
    protected String urlBanco;
}
