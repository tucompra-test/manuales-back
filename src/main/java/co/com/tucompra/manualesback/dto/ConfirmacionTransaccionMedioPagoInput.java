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
public class ConfirmacionTransaccionMedioPagoInput {
    
    protected MetodoPago metodopago;
    protected String referencia;
    protected String valortotal;
    protected String valorbase;
    protected String valoriva;
    protected String terminal;
    protected String descripcion;
    protected String documento;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String telefono;
    protected String celular;
    protected String ciudad;
    protected String pais;
    protected String FechaVcm;
    protected String correo;
    protected String extra1;
    protected String extra2;
    protected String extra3;
    protected String extra4;
    protected String extra5;
    protected String extra6;
    protected String extra7;
    protected String extra8;
    protected String extra9;    
    protected String ip;
    protected String tokenSeguridad;
    protected boolean esEmcali;
}
