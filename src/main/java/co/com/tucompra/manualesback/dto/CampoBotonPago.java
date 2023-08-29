/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.tucompra.manualesback.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author jeffr
 */
@Data
@Builder
public class CampoBotonPago {

    String nombrecampo;
    String obligatorio;
    String tipodato;
    String tipocampo;
    List<String> listaopcionseleccion;    
}
