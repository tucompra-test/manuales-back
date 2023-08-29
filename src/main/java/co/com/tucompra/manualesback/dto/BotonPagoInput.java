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
public class BotonPagoInput {
    
    String nombreBoton;
    String valorTotal;
    String valorBase;
    String valorIVA;
    String tipoMoneda;
    String descripcion;
    String usaValorVariable;
    String montoMinimo;
    String montoMaximo;
    String usaFechaVencimiento;
    String fechaVencimiento;
    String cantidadUsosBoton;
    String urlRedirect;
    List<CampoBotonPago> listaCampos;
    String terminal;
    String tokenSeguridad;
    String esCobroRecurrente;
    String cantidadCobrosRecurrencia;
    String cantidadDiasRecurrencia;
    String cobroAdicional;
    String valorCobroFijo;
    String valorCobroPorcentual;
}
