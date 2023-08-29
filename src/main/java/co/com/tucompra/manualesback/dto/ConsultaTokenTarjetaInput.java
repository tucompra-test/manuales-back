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
public class ConsultaTokenTarjetaInput {
    
    private String terminal;
    private String tokenSeguridad;    
    private String tokenTarjeta;
    private String documentoCliente;
}
