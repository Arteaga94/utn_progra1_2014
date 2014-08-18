/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Estudiante
 */
public class class1 {

    int ult = 0;
    int rest;
    double r;
    String re;
    int ma, nd = 0;
    int dia;
    String dia2;
    int x;

    public String mes(int mes) {

        switch (mes) {
            case 1:
                return "Enero";

            case 2:
                return "febrero";

            case 3:
                return "Marzo";

            case 4:
                return "Abril";

            case 5:
                return "Mayo";

            case 6:
                return "Junio";

            case 7:
                return "Julio";

            case 8:
                return "Agosto";

            case 9:
                return "septiembre";

            case 10:
                return "Octubre";

            case 11:
                return "Noviembre";

            case 12:
                return "Diciembre";
            default:
                return "No existe";

        }

    }

    public double Mcuadrado(int cuadrado) {

        ult = cuadrado % 10;

        if (ult == 2 || ult == 5 || ult == 8 || cuadrado == 2 || cuadrado == 5 || cuadrado == 8) {
            r = Math.pow(cuadrado, 2);
        }

        if (ult == 4 || ult == 7 || ult == 9 || cuadrado == 4 || cuadrado == 7 || cuadrado == 9) {
            r = cuadrado * 5;

        }

        if (ult == 0 || ult == 1 || ult == 3 || ult == 6 || cuadrado == 0 || cuadrado == 1 || cuadrado == 3 || cuadrado == 6) {
            r = cuadrado;

        }

        return r;

    }

    public String capacidad(String Letra) {


        if (Letra.equals("a")) {
            re = "Excelente";
        }
        if (Letra.equals("b")) {
            re = "Bueno";
        }
        if (Letra.equals("c")) {
            re = "Regular";
        }
        if (Letra.equals("d")) {
            re = "Malo";
        }
        if (Letra.equals("e")) {
            re = "Pésimo";
        }

        return re;

    }

    public int dias(int mes, int ano) {

        switch (mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10:  // Octubre
            case 12: // Diciembre
                rest = 31;

            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                rest = 30;
            case 2:  // Febrero
                if (((ano % 100 == 0) && (ano % 400 == 0))
                        || ((ano % 100 != 0) && (ano % 4 == 0))) {
                    rest = 29;  // Año Bisiesto
                } else {
                    rest = 28;
                }
            default:
                return rest;


        }
    }

    public String antdia(int dia, int m2, int a) {
        String p;
        ma = m2 - 1;
        if (ma == 0) {
            ma = 12;
        }

        switch (ma) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nd = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nd = 30;
                break;
            case 2:
                if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
                    nd = 29;
                } else {
                    nd = 28;
                }
                break;
        }
        dia = dia - 1;
        if (dia == 0) {
            dia = nd;
            m2 = m2 - 1;
            if (m2 == 0) {
                m2 = 12;
                a = a - 1;
            }
        }
        p = dia + "-" + m2 + "-" + a;
        return p;
    }

    public String fecha(int dia) {
        switch (dia % 7) {
            case 0:
                re = "Domingo";
                break;
            case 1:
                re = "Lunes";
                break;
            case 2:
                re = "Martes";
                break;
            case 3:
                re = "Miercoles";
                break;
            case 4:
                re = "Jueves";
                break;
            case 5:
                re = "Viernes";
                break;
            case 6:
                re = "Sabado";
                break;
        }
        return re;
    }

    public int fecha2(int dia1) {
        switch (dia1) {
            case 'L':
            case 'l':
                x = 0;
                break;
            case 'M':
            case 'm':
                x = 1;
                break;
            case 'X':
            case 'x':
                x = 2;
                break;
            case 'J':
            case 'j':
                x = 3;
                break;
            case 'V':
            case 'v':
                x = 4;
                break;
            case 'S':
            case 's':
                x = 5;
                break;
            case 'D':
            case 'd':
                x = 6;
                break;

        }
        return x;

    }
}
