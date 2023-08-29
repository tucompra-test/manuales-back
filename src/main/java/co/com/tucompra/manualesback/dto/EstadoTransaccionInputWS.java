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
public class EstadoTransaccionInputWS {
    
    private boolean serialfacturacion;
    private boolean idfactura;
    private boolean metodoDePago;
    private boolean banco;
    private boolean valorPagado;
    private boolean valorTotal;
    private boolean valorBase;
    private boolean valorIva;
    private boolean valorReteiva;
    private boolean valorReteica;
    private boolean valorRetefuente;
    private boolean descripcion;
    private boolean descripcion2;
    private boolean detalle;
    private boolean fechaPago;
    private boolean fechaPagopse;
    private boolean horaPago;
    private boolean transaccionConfirmada;
    private boolean codigoAutorizacion;
    private boolean numeroCoutas;
    private boolean correoComprador;
    private boolean nombreComprador;
    private boolean apellidosComprador;
    private boolean documentoComprador;
    private boolean telefonoComprador;
    private boolean direccionComprador;
    private boolean ipComprador;
    private boolean ciudadComprador;
    private boolean paisComprador;
    private boolean estadoPago;
    private boolean razonRechazo;
    private boolean numeroTransaccion;
    private boolean paisemisor;
    private boolean valorComisionbancaria;
    private boolean valorDepositoBanco;
    private boolean bancoRecaudador;
    private boolean codigoTransaccion;
    private boolean campoextra1;
    private boolean campoextra2;
    private boolean campoextra3;
    private boolean campoextra4;
    private boolean campoextra5;
    private boolean campoextra6;
    private boolean campoextra7;
    private boolean campoextra8;
    private boolean campoextra9;
    private String terminal;
    private String codigoSeguimiento;
    private String referencia;
    private String tokenSeguridad;
}
