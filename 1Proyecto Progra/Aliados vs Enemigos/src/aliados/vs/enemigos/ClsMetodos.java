/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliados.vs.enemigos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dinier
 */
public class ClsMetodos {

    private int p = 0;
    private int turno = 1;
    private Scanner teclado;
    private char[][] matriz;
    private char[][] matriz2;
    private char[][] matrizAt;
    private String re;
    private int p1, p2, a1, a2, e1, e2;
    private char jug = 'a';
    private char jug2 = 'a';

    public void cargar(int cant, int largo, int ancho) {

        Random random = new Random();

        matriz = new char[largo][ancho];

        for (int i = cant; i > 0; i--) {

            int x = random.nextInt(largo);
            int y = random.nextInt(ancho);
            int p = 0;
            while (p == 0) {
                if (matriz[x][y] == 0) {

                    if (turno == 1) {
                        matriz[x][y] = jug;
                    } else {
                        matriz[x][y] = jug2;
                    }

                    p++;
                } else {
                    x = random.nextInt(largo);
                    y = random.nextInt(ancho);
                }
            }
        }
        //NAVEGA POR FILAS
        for (int f = 0; f < matriz.length; f++) {
            //NAVEGA POR COLUMNAS
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.println("[" + f + "][" + c + "]=" + matriz[f][c]);
            }
        }
        System.out.println();

        matriz2 = new char[largo][ancho];

        for (int i = cant; i > 0; i--) {

            int x = random.nextInt(largo);
            int y = random.nextInt(ancho);
            int p = 0;
            while (p == 0) {
                if (matriz2[x][y] == 0) {

                    if (turno == 1) {
                        matriz2[x][y] = jug2;
                    } else {
                        matriz2[x][y] = jug;
                    }
                    p++;
                } else {
                    x = random.nextInt(largo);
                    y = random.nextInt(ancho);
                }
            }
        }
        //NAVEGA POR FILAS
        for (int f = 0; f < matriz2.length; f++) {
            //NAVEGA POR COLUMNAS
            for (int c = 0; c < matriz2[f].length; c++) {
                System.out.println("[" + f + "][" + c + "]=" + matriz2[f][c]);
            }
        }
        System.out.println();

        Turno();

    }

    public boolean AcertarBlancoAliado() {

        int cont = 0;
        if (matriz[a1][a2] != 0) {
            System.out.println("Ataque acertado");
            matriz[a1][a2] = 0;
            turno = 0;
            cont++;
            imprirmatriz();
            Turno();
            return true;

        }
        FallarBlancoAliado();
        return false;

    }

    public void FallarBlancoAliado() {

        System.out.println("Ataque es Erroneo");
        turno = 1;
        Turno();

    }

    public void FallarBlancoEnemigo() {
        System.out.println("Ataque es Erroneo");
        turno = 0;
        Turno();
    }

    public boolean AcertarBlancoEnemigo() {

        if (matriz2[e1][e2] != 0) {
            System.out.println("Ataque acertado");
            matriz2[e1][e2] = 0;
            turno = 1;
            Turno();
            return true;
        }
        FallarBlancoEnemigo();
        return false;
    }

    public void EscogerCeldaAliado() {
        System.out.println("Digite la posicion en la que desea atacar");
        a1 = Integer.parseInt(teclado.nextLine());
        a2 = Integer.parseInt(teclado.nextLine());
        AcertarBlancoAliado();
    }

    public void EscogerCeldaEnemigo() {
        System.out.println("Digite la posicion en la que desea atacar");
        e1 = Integer.parseInt(teclado.nextLine());
        e2 = Integer.parseInt(teclado.nextLine());
        AcertarBlancoEnemigo();
    }

    public void EscogerJugadorAliado() {
        turno = 1;
        jug = 'A';
        jug2 = 'E';

    }

    public void EscogerJugadorEnemigo() {
        turno = 0;
        jug = 'E';
        jug2 = 'A';
    }

    public void CantidadDePartidasJugadas() {
        p++;

    }

    public void Turno() {
        if (turno == 1) {
            EscogerCeldaEnemigo();

        } else {
            EscogerCeldaAliado();
        }
    }

    public void Ganador() {

    }

    public void Perdedor() {

    }

    public void SumarAliadosDestruidos() {

    }

    public void SumarEnemigosDestruidos() {

    }

    public void jugar() {
        String j1, j2;
        int opcion;
        int c = 1;
        int cant;
        int largo, ancho;

        teclado = new Scanner(System.in);

        do {

            System.out.println("Digite que jugador quiere ser" + "\n" + "1.Aliados" + "\n" + "2.Enemigos");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:

                    EscogerJugadorAliado();
                    break;
                case 2:

                    EscogerJugadorEnemigo();

                    break;

            }

            System.out.println("Digite la cantidad de elementos a participar dentro la de la partida ");
            cant = Integer.parseInt(teclado.nextLine());

            System.out.println("Digite la profundidad del área de juego (Largo y ancho)");
            System.out.print("Largo: ");
            largo = Integer.parseInt(teclado.nextLine());
            System.out.print("Ancho: ");
            ancho = Integer.parseInt(teclado.nextLine());

            cargar(cant, largo, ancho);

        } while (opcion == 1 || opcion == 2);

    }

    public void imprirmatriz() {
        for (int f = 0; f < matriz.length; f++) {
            //NAVEGA POR COLUMNAS
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.println("[" + f + "][" + c + "]=" + matriz[f][c]);
            }
        }
        System.out.println();

        //NAVEGA POR FILAS
        for (int f = 0; f < matriz2.length; f++) {
            //NAVEGA POR COLUMNAS
            for (int c = 0; c < matriz2[f].length; c++) {
                System.out.println("[" + f + "][" + c + "]=" + matriz2[f][c]);
            }
        }
        System.out.println();
    }

}
