/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Estudiante
 */
public class ejercicio1 {

    private String email;

    public ejercicio1(String pEmail) {
        this.email = pEmail;
    }

    public String validarcorreo() {
        String mensaje = "El mensaje no contiene @";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                mensaje = "El correo si contiene @";
            }
        }
        return mensaje;

    }
}
