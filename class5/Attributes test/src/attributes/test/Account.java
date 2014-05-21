/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes.test;

/**
 *
 * @author Estudiante
 */
public class Account {

    private double saldoInicial;
    private boolean hayError;
    //metodo constructor

    public Account() {
        saldoInicial = 0;
        hayError = false;
    }

    //Este metodo sirve para aumentar la cuenta del usuario 
    public void Deposito(double monto) {

        setSaldoInicial(getSaldoInicial() + monto);


    }
    //Este metodo sirve para disminuir la cuenta del usuario 

    public void Retiro(double monto) {
        
        if (getSaldoInicial() >= monto) 
            setSaldoInicial(getSaldoInicial() - monto);
        else
          setHayError(true);  
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
}