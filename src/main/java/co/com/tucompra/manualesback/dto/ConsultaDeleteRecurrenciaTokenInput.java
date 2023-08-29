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
public class ConsultaDeleteRecurrenciaTokenInput {
    
    private String terminal;
    private String tipoBorrado;
    private String identificacion;
    private String tipoDocumento;
    private String ultimosDigitos;
    private String tokenSeguridad;
}
