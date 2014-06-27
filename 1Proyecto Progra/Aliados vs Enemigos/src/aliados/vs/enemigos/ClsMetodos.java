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

    private int p = 1;
    private int turno = 1;
    private Scanner teclado;
    private char[][] matriz;
    private char[][] matriz2;
    private char[][] matrizAt;
    private String re;
    private int p1, p2, a1, a2, e1, e2;
    private char jug = 'a';
    private char jug2 = 'a';
    private int contA = 0;
    private int contE = 0;
    private char c='s';
    private char rendirse='S';
    private int partjug=0;
    private int partjug2=0;

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

 public void AcertarBlancoAliado() {

        
        if (matriz[a1][a2] == 'A') {
            System.out.println("Ataque acertado");
            matriz[a1][a2] =' ';
            turno = 0;
            SumarAliadosDestruidos();
            imprirmatriz();
            imp(matriz, "Enemigo", "Aliado",matriz2);
        }
        FallarBlancoAliado();

    }

 public void FallarBlancoAliado() {

        System.out.println("Ataque fallado");
        matriz[a1][a2] =' ';
        turno = 1;
        Turno();

    }

 public void FallarBlancoEnemigo() {
        System.out.println("Ataque fallado");
        matriz[a1][a2] =' ';
        turno = 0;
        Turno();
    }

 public void AcertarBlancoEnemigo() {

        if (matriz2[e1][e2] == 'E') {
            System.out.println("Ataque acertado");
            matriz2[e1][e2] =' ';
            turno = 1;
            SumarEnemigosDestruidos();
            imprirmatriz();
            imp(matriz2, "Aliado", "Enemigo",matriz);
        }
        FallarBlancoEnemigo();
    }

 public void EscogerCeldaAliado() {
        
        System.out.println("Digite la posicion en la que desea atacar");
        a1 = Integer.parseInt(teclado.nextLine());
        a2 = Integer.parseInt(teclado.nextLine());
        if(matriz[a1][a2]==' ')
        {
            System.out.println("El blanco ya fue atacado");
            Rendirse(matriz2);
            EscogerCeldaAliado();
        }else
        {
        AcertarBlancoAliado();
        }
    }

 public void EscogerCeldaEnemigo() {
        System.out.println("Digite la posicion en la que desea atacar");
        e1 = Integer.parseInt(teclado.nextLine());
        e2 = Integer.parseInt(teclado.nextLine());
        if(matriz2[e1][e2]==' ')
        {
            System.out.println("El blanco ya fue atacado");
            Rendirse(matriz);
            EscogerCeldaEnemigo();
        }else
        {
        AcertarBlancoEnemigo();
        }
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
        System.out.println("Cantidad de partidas jugadas: "+ p);

    }

 public void Turno() {
        if (turno == 1) {
            EscogerCeldaEnemigo();

        } else {
            EscogerCeldaAliado();
        }
    }

 public void Ganador(String jugador) {
        System.out.println("El ganador es: "+jugador); 
        
    }

 public void Perdedor(String jugador) {
        System.out.println("El perdedor es: "+jugador);
        TotalDeAliadosDestruidos();
        TotalDeEnemigosDestruidos();
        IniciarNuevaPartida();
        
    }

 public void SumarAliadosDestruidos() {
       
        contA++;
       
     
    }
    
 public void TotalDeAliadosDestruidos() {
        System.out.println("TotalDeAliadosDestruidos("+contA+")");
    }
    
 public void TotalDeEnemigosDestruidos() {
       
        
        System.out.println("TotalDeEnemigosDestruidos("+contE+")");
    }

 public void SumarEnemigosDestruidos() {
        contE++;
      

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
    
 public void imp(char[][] mat, String jugador1, String jugador2,char[][] mat2)
    {
    for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                if(mat[f][c]==' ' || mat[f][c]==0){
                
                }else{
                    Rendirse(mat2);
                    Turno();
                }
            }
    }
        Ganador(jugador1);
        Perdedor(jugador2);
    }
    
 public void	Rendirse(char[][] mat)
   {
       
       
       System.out.println("Desea rendirse S para si y cualquier tecla para no");
        rendirse=teclado.nextLine().charAt(0);
        
        
        if(rendirse=='s'||rendirse=='S')
        {
            
            p--;
            for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
               mat[f][c]=' ';
            }}
           if(mat==matriz)
        {
         imp(matriz, "Enemigo", "Aliado",matriz2);   
        }
          imp(matriz2, "Aliado", "Enemigo",matriz); 
        } 
        }
        
   
 public void IniciarNuevaPartida()  
 {
            boolean x=true;  
            if(jug=='A'){
             
                for (int f = 0; f < matriz2.length; f++) {
                        for (int c = 0; c < matriz2[f].length; c++) {
                            if(matriz2[f][c]==' ' || matriz2[f][c]==0 && x){
                                x=true;
                            }else{
                            x=false;
                            }
                        }
                }
                if(x){
                    partjug++;
                }else{
                    partjug2++;
                }
             }else{
             
                for (int f = 0; f < matriz.length; f++) {
                        for (int c = 0; c < matriz[f].length; c++) {
                            if(matriz[f][c]==' ' || matriz[f][c]==0 && x){
                                x=true;
                            }else{
                            x=false;
                            }
                        }
                }
                if(x){
                    partjug2++;
                }else{
                    partjug++;
                }
             }
            System.out.println("Desea jugar otra partida S/N ");
            c = teclado.nextLine().charAt(0);
            if(c=='s'||c=='S')
            {
             
             contA = 0;
             contE = 0;
             p++;
           
                jugar();
            }
            
            VerEstadisticas();
            System.exit(0);
      
  
 } 
 
 
 public void CantidadDePartidasGanadasJugador1()
{
    System.out.println("Cantidad de partidas ganadas jugador 1: "+partjug);
}

 public void CantidadDePartidasGanadasJugador2()
{
System.out.println("Cantidad de partidas ganadas jugador 2: "+partjug2);
}

 public void CantidadDePartidasPerdidasJugador1()
{
System.out.println("Cantidad de partidas perdidas jugador 1: "+partjug2);
}

 public void CantidadDePartidasPerdidasJugador2()
{
System.out.println("Cantidad de partidas perdidas jugador 2: "+partjug);
}
 
 public void VerEstadisticas()
{
    System.out.println("Estadisticas:");
    CantidadDePartidasJugadas();
    CantidadDePartidasGanadasJugador1();
    CantidadDePartidasGanadasJugador2();
    CantidadDePartidasPerdidasJugador1();
    CantidadDePartidasPerdidasJugador2();
}

}
