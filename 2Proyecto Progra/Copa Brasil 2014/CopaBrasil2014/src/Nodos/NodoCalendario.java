/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Dinier
 */
public class NodoCalendario {
     private String fecha;
     private String fecha2;
     private String fecha3;
     private String fecha4;
     private String marcador;
     private String clima;
     private NodoCalendario siguienteClima;
    private NodoCalendario siguienteFecha;
    private String Cpersonas;
    private String Fecha_hora;

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the siguienteFecha
     */
    public NodoCalendario getSiguienteFecha() {
        return siguienteFecha;
    }

    /**
     * @param siguienteFecha the siguienteFecha to set
     */
    public void setSiguienteFecha(NodoCalendario siguienteFecha) {
        this.siguienteFecha = siguienteFecha;
    }

    /**
     * @return the clima
     */
    public String getClima() {
        return clima;
    }

    /**
     * @param clima the clima to set
     */
    public void setClima(String clima) {
        this.clima = clima;
    }

    /**
     * @return the siguienteClima
     */
    public NodoCalendario getSiguienteClima() {
        return siguienteClima;
    }

    /**
     * @param siguienteClima the siguienteClima to set
     */
    public void setSiguienteClima(NodoCalendario siguienteClima) {
        this.siguienteClima = siguienteClima;
    }

    /**
     * @param Cpersonas the Cpersonas to set
     */
    public void setCpersonas(String Cpersonas) {
        this.Cpersonas = Cpersonas;
    }

    /**
     * @return the Cpersonas
     */
    public String getCpersonas() {
        return Cpersonas;
    }

    /**
     * @return the marcador
     */
    public String getMarcador() {
        return marcador;
    }

    /**
     * @param marcador the marcador to set
     */
    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    /**
     * @return the fecha2
     */
    public String getFecha2() {
        return fecha2;
    }

    /**
     * @param fecha2 the fecha2 to set
     */
    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    /**
     * @return the fecha3
     */
    public String getFecha3() {
        return fecha3;
    }

    /**
     * @param fecha3 the fecha3 to set
     */
    public void setFecha3(String fecha3) {
        this.fecha3 = fecha3;
    }

    /**
     * @return the fecha4
     */
    public String getFecha4() {
        return fecha4;
    }

    /**
     * @param fecha4 the fecha4 to set
     */
    public void setFecha4(String fecha4) {
        this.fecha4 = fecha4;
    }

    /**
     * @return the Fecha_hora
     */
    public String getFecha_hora() {
        return Fecha_hora;
    }

    /**
     * @param Fecha_hora the Fecha_hora to set
     */
    public void setFecha_hora(String Fecha_hora) {
        this.Fecha_hora = Fecha_hora;
    }
  
    
    
}
