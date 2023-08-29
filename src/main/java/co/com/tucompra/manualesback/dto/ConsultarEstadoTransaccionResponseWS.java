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
@Builder
@Data
public class ConsultarEstadoTransaccionResponseWS {
    
    protected String codigoRespuesta;
    protected String descripcionRespuesta;
    private String serialfacturacion;
    private String idfactura;
    private String metodoDePago;
    private String banco;
    private String valorPagado;
    private String valorTotal;
    private String valorBase;
    private String valorIva;
    private String valorReteiva;
    private String valorReteica;
    private String valorRetefuente;
    private String descripcion;
    private String descripcion2;
    private String detalle;
    private String fechaPago;
    private String fechaPagopse;
    private String horaPago;
    private String transaccionConfirmada;
    private String codigoAutorizacion;
    private String numeroCoutas;
    private String correoComprador;
    private String nombreComprador;
    private String apellidosComprador;
    private String documentoComprador;
    private String telefonoComprador;
    private String direccionComprador;
    private String ipComprador;
    private String ciudadComprador;
    private String paisComprador;
    private String estadoPago;
    private String razonRechazo;
    private String numeroTransaccion;
    private String paisemisor;
    private String valorComisionbancaria;
    private String valorDepositoBanco;
    private String bancoRecaudador;
    private String codigoTransaccion;
    private String campoextra1;
    private String campoextra2;
    private String campoextra3;
    private String campoextra4;
    private String campoextra5;
    private String campoextra6;
    private String campoextra7;
    private String campoextra8;
    private String campoextra9;
}
