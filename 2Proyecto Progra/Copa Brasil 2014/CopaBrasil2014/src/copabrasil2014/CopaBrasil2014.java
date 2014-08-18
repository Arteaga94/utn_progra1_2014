/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package copabrasil2014;

/*
 * import Listas.*; import Nodos.NodoJugador; import java.util.Scanner; import
 * Nodos.NodoEquipo; import Nodos.NodoEstadio;
 */
import Nodos.NodoJugador;
import Listas.ListaEquipo;
import Listas.ListaJugador;
import Listas.ListaEstadio;
import Nodos.NodoEstadio;
import Listas.ListaGrupo;
import Nodos.NodoGrupo;
import Nodos.NodoCalendario;
import Listas.ListaCalendario;
import Nodos.*;
import java.util.Scanner;

/**
 *
 * @author Dinier
 */
public class CopaBrasil2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        int opcion;
        int opcion2;
        char c = 's';
        String nombre;
        String nombre2;
        String nombreNuevo;
        int edad;
        int goles;
        String Ciudad;
        int CantidadP;
        int PartidosJ;

        ListaEquipo equipo = new ListaEquipo();

        ListaJugador argentina = new ListaJugador();
        argentina.Insertar("Lionel Messi", 27, 4);
        argentina.Insertar("Angel Di Maria", 26, 1);
        argentina.Insertar("Marcos Rojo", 29, 1);
        argentina.Insertar("Gonzalo Higuain ", 26, 1);
        argentina.Insertar("Maxi Rodriguez", 33, 0);
        equipo.InsertarE("Argentina", argentina, 3, 3, 0, 0, 6, 3, 3, 9);

        ListaJugador argelia = new ListaJugador();
        argelia.Insertar("Abdelmoumene Djabou", 27, 2);
        argelia.Insertar("Yacine Brahimi", 29, 1);
        argelia.Insertar("Islam Slimani", 26, 2);
        argelia.Insertar("Sofiane Feghouli", 24, 1);
        argelia.Insertar("Rafik Halliche", 27, 1);
        equipo.InsertarE("Argelia", argelia, 3, 1, 1, 1, 6, 5, 1, 4);

        ListaJugador australia = new ListaJugador();
        australia.Insertar("Tim Cahill", 34, 2);
        australia.Insertar("James Troisi", 26, 0);
        australia.Insertar("Ryan McGowan ", 24, 0);
        australia.Insertar("James Troisi", 26, 0);
        australia.Insertar("Tommy Oar", 22, 0);
        equipo.InsertarE("Australia", australia, 3, 0, 0, 3, 3, 9, -6, 0);

        ListaJugador belgica = new ListaJugador();
        belgica.Insertar("Romelu Lukaku", 21, 1);
        belgica.Insertar("Divock Origi", 19, 1);
        belgica.Insertar("Dries Mertens", 27, 1);
        belgica.Insertar("Kevin DE Bruyne ", 23, 1);
        belgica.Insertar("Marouane Fellaini", 26, 1);
        equipo.InsertarE("Belgica", belgica, 3, 3, 0, 0, 4, 1, 3, 9);

        ListaJugador bosniayherzegovina = new ListaJugador();
        bosniayherzegovina.Insertar("Miralem PJANIC", 24, 1);
        bosniayherzegovina.Insertar("Edin Džeko", 28, 1);
        bosniayherzegovina.Insertar("Vedad IBISEVIC", 30, 1);
        bosniayherzegovina.Insertar("Avdija VRSAJEVIC", 28, 1);
        bosniayherzegovina.Insertar("Edin Dzeko", 28, 0);
        equipo.InsertarE("Bosnia y Herzegovina", bosniayherzegovina, 3, 1, 0, 2, 4, 4, 0, 3);

        ListaJugador brasil = new ListaJugador();
        brasil.Insertar("Neymar", 24, 4);
        brasil.Insertar("Oscar", 22, 2);
        brasil.Insertar("David Luiz", 27, 2);
        brasil.Insertar("Thiago Silva", 29, 1);
        brasil.Insertar("Fernandinho", 29, 1);
        equipo.InsertarE("Brasil", brasil, 3, 2, 1, 0, 7, 2, 5, 7);

        ListaJugador camerun = new ListaJugador();
        camerun.Insertar("Samuel Eto'o", 33, 0);
        camerun.Insertar("Alexandre Song", 26, 0);
        camerun.Insertar("Joël Matip", 23, 1);
        camerun.Insertar("Eric Choupo", 25, 0);
        camerun.Insertar("Benjamin", 25, 0);
        equipo.InsertarE("Camerun", camerun, 3, 0, 0, 3, 1, 9, -8, 0);

        ListaJugador colombia = new ListaJugador();
        colombia.Insertar("James Rodiguez", 22, 6);
        colombia.Insertar("Pablo Armero", 27, 1);
        colombia.Insertar("Juan Cuadrado", 26, 1);
        colombia.Insertar("Jackson Martinez", 27, 2);
        colombia.Insertar("Teofilo Gutierrez", 29, 1);
        equipo.InsertarE("Colombia", colombia, 3, 3, 0, 0, 9, 2, 7, 9);

        ListaJugador costaRica = new ListaJugador();
        costaRica.Insertar("Campbell", 22, 1);
        costaRica.Insertar("Ruiz", 28, 2);
        costaRica.Insertar("Navas", 26, 0);
        costaRica.Insertar("Duarte", 25, 1);
        costaRica.Insertar("Ureña", 24, 1);
        equipo.InsertarE("Costa Rica", costaRica, 3, 2, 1, 0, 4, 1, 3, 7);

        ListaJugador costademarfil = new ListaJugador();
        costademarfil.Insertar("Didier Drogba", 36, 0);
        costademarfil.Insertar("Yaya Toure", 31, 0);
        costademarfil.Insertar("Wilfried Bony", 25, 2);
        costademarfil.Insertar("GERVINHO ", 27, 2);
        costademarfil.Insertar("salomon Kalou", 29, 0);
        equipo.InsertarE("Costa de Marfil", costademarfil, 3, 1, 0, 2, 4, 5, -1, 3);

        ListaJugador chile = new ListaJugador();
        chile.Insertar("Alexis Sanches", 28, 2);
        chile.Insertar("Jorge Valvidia", 30, 1);
        chile.Insertar("Charles Aanguiz", 25, 1);
        chile.Insertar("Mauricio Pinilla", 30, 0);
        chile.Insertar("ArturoVidal", 27, 0);
        equipo.InsertarE("Chile ", chile, 3, 2, 0, 1, 5, 3, 2, 6);

        ListaJugador croacia = new ListaJugador();
        croacia.Insertar("Ivan Perisic", 25, 2);
        croacia.Insertar("Ivica Olic", 34, 1);
        croacia.Insertar("Mario Mandžukic", 29, 2);
        croacia.Insertar("Milan Badelj", 25, 0);
        croacia.Insertar("Ognjen Vukojevic", 30, 0);
        equipo.InsertarE("Croacia", croacia, 3, 1, 0, 2, 6, 6, 0, 3);

        ListaJugador ecuador = new ListaJugador();
        ecuador.Insertar("Enner Valencia", 24, 3);
        ecuador.Insertar("Alexander Domínguez", 27, 0);
        ecuador.Insertar("Édison Méndez", 25, 0);
        ecuador.Insertar("Felipe Caceido", 25, 0);
        ecuador.Insertar("Axel Ibarra", 23, 0);
        equipo.InsertarE("Ecuador", ecuador, 3, 1, 1, 1, 3, 3, 0, 4);

        ListaJugador españa = new ListaJugador();
        españa.Insertar("Fernando Torres", 30, 1);
        españa.Insertar("David Villa", 31, 0);
        españa.Insertar("Andres Iniesta", 32, 0);
        españa.Insertar("xavi Hernandez", 34, 0);
        españa.Insertar("Xabi Alonso", 32, 1);
        equipo.InsertarE("España", españa, 3, 1, 0, 2, 4, 7, -3, 3);

        ListaJugador francia = new ListaJugador();
        francia.Insertar("Karin Benzema", 26, 3);
        francia.Insertar("Olivier Giroud", 27, 1);
        francia.Insertar("Moussa Sissoko", 24, 1);
        francia.Insertar("Blaise Matuidi", 27, 1);
        francia.Insertar("Matheiu Valbuena", 29, 0);
        equipo.InsertarE("Francia", francia, 3, 2, 1, 0, 8, 2, 6, 7);

        ListaJugador ghana = new ListaJugador();
        ghana.Insertar("Asamoah Gyan", 28, 2);
        ghana.Insertar("Andre Ayew", 24, 2);
        ghana.Insertar("Majeed Waris", 22, 0);
        ghana.Insertar("Kevin Prince", 27, 0);
        ghana.Insertar("Michael Essien", 31, 0);
        equipo.InsertarE("Ghana", ghana, 3, 0, 1, 2, 4, 6, -2, 1);

        ListaJugador grecia = new ListaJugador();
        grecia.Insertar("Georgios Samaras", 29, 1);
        grecia.Insertar("Sokratis PAPASTATHOPOULOS", 26, 1);
        grecia.Insertar("Kyriakos Papadopoulos", 22, 0);
        grecia.Insertar("Konstantinos katsouranis", 35, 0);
        grecia.Insertar("Pangiotis Kone", 27, 0);
        equipo.InsertarE("Grecia", grecia, 3, 1, 1, 1, 2, 4, -2, 4);

        ListaJugador holanda = new ListaJugador();
        holanda.Insertar("Arjen Robben", 29, 3);
        holanda.Insertar("Robin Van Persie", 31, 4);
        holanda.Insertar(" Memphis DEPAY", 20, 2);
        holanda.Insertar("Daley Blind ", 30, 1);
        holanda.Insertar("Wesley Sneijder", 30, 1);
        equipo.InsertarE("Holanda", holanda, 3, 3, 0, 0, 10, 3, 7, 9);

        ListaJugador honduras = new ListaJugador();
        honduras.Insertar("Minor Figueroa", 28, 0);
        honduras.Insertar("Carlo COSTLY", 32, 1);
        honduras.Insertar("Wilson Palacios", 30, 0);
        honduras.Insertar("Jerry Palacios", 32, 0);
        honduras.Insertar("Roger Espinoza", 27, 0);
        equipo.InsertarE("Honduras", honduras, 3, 0, 0, 3, 1, 8, -7, 0);

        ListaJugador iran = new ListaJugador();
        iran.Insertar("Alireza Haghighi", 26, 0);
        iran.Insertar("Ashkan Dejagah", 28, 0);
        iran.Insertar("Daniel Davari", 25, 0);
        iran.Insertar("Reza Haghighi", 25, 1);
        iran.Insertar("JavadNekounam ", 33, 0);
        equipo.InsertarE("Iran", iran, 3, 0, 1, 2, 1, 4, -3, 1);

        ListaJugador italia = new ListaJugador();
        italia.Insertar("Andrea Pirlo", 34, 0);
        italia.Insertar("Gianluigi Buffon", 37, 0);
        italia.Insertar("Salvatore Bocchetti ", 27, 0);
        italia.Insertar("Mario Baloteli", 23, 1);
        italia.Insertar("Claudio Marchisio", 28, 1);
        equipo.InsertarE("Italia", italia, 3, 1, 0, 2, 2, 3, -1, 3);

        ListaJugador inglaterra = new ListaJugador();
        inglaterra.Insertar("Frank Lampard", 34, 0);
        inglaterra.Insertar("Steven Gerrard", 36, 0);
        inglaterra.Insertar("Wayne Rooney", 32, 1);
        inglaterra.Insertar("Chris Smalling", 24, 0);
        inglaterra.Insertar("Daniel Sturrigde", 24, 1);
        equipo.InsertarE("Inglaterra", inglaterra, 3, 0, 1, 2, 2, 4, -2, 1);

        ListaJugador japon = new ListaJugador();
        japon.Insertar("Shinji Okazaki", 27, 1);
        japon.Insertar("Atsudo Uchida", 26, 0);
        japon.Insertar("Yuto Nagatomo", 27, 0);
        japon.Insertar("Keisuke HONDA", 28, 1);
        japon.Insertar("Hiroshi Kiyotake", 24, 0);
        equipo.InsertarE("Japon", japon, 3, 0, 1, 2, 2, 6, -4, 1);

        ListaJugador mexico = new ListaJugador();
        mexico.Insertar("Andres Guardado", 27, 1);
        mexico.Insertar("Rafael Marquez", 37, 1);
        mexico.Insertar("Javier Hernandez", 26, 1);
        mexico.Insertar("Carlos Pena", 24, 0);
        mexico.Insertar("Oribe Peralta", 30, 1);
        equipo.InsertarE("Mexico", mexico, 3, 2, 1, 0, 4, 1, 3, 7);

        ListaJugador nigeria = new ListaJugador();
        nigeria.Insertar("Ahmed MUSA", 21, 2);
        nigeria.Insertar("Peter ODEMWINGIE", 33, 1);
        nigeria.Insertar("Emmanuel EMENIKE", 27, 0);
        nigeria.Insertar("Ruben GABRIEL", 23, 0);
        nigeria.Insertar("Okechukwu UCHEBO", 24, 0);
        equipo.InsertarE("Nigeria", nigeria, 3, 1, 1, 1, 3, 3, 0, 4);

        ListaJugador portugal = new ListaJugador();
        portugal.Insertar("Cristiano Ronaldo", 29, 1);
        portugal.Insertar("Pepe", 31, 0);
        portugal.Insertar("Nani", 27, 1);
        portugal.Insertar("Varela", 2, 1);
        portugal.Insertar("Luis ", 26, 0);
        equipo.InsertarE("Portugal", portugal, 3, 1, 1, 1, 4, 7, -3, 4);

        ListaJugador republicadekorea = new ListaJugador();
        republicadekorea.Insertar("Park Ji-Sung", 33, 0);
        republicadekorea.Insertar("Yoo Byung-Soo", 26, 0);
        republicadekorea.Insertar("KOO Jacheol", 25, 1);
        republicadekorea.Insertar("SON Heungmin", 22, 1);
        republicadekorea.Insertar("LEE Keunho", 29, 1);
        equipo.InsertarE("Republica de Korea", republicadekorea, 3, 0, 1, 2, 3, 6, -3, 1);


        ListaJugador rusia = new ListaJugador();
        rusia.Insertar("Igor Akinfeev", 28, 0);
        rusia.Insertar("Dmitri Kombarov", 27, 0);
        rusia.Insertar("Alexander Kokorin ", 23, 1);
        rusia.Insertar("Aleksandr KERZHAKOV", 31, 1);
        rusia.Insertar("Denis GLUSHAKOV", 27, 0);
        equipo.InsertarE("Rusia", rusia, 3, 0, 2, 1, 2, 3, -1, 2);

        ListaJugador suiza = new ListaJugador();
        suiza.Insertar("Xherdan Shaqiri", 22, 3);
        suiza.Insertar("Blerim DZEMAILI", 28, 1);
        suiza.Insertar("Admir Mehmedi", 23, 1);
        suiza.Insertar("Haris SEFEROVIC", 22, 1);
        suiza.Insertar("Valon BEHRAMI", 29, 0);
        equipo.InsertarE("Suiza ", suiza, 3, 2, 0, 1, 7, 6, 1, 6);
        
        ListaJugador usa = new ListaJugador();
        usa.Insertar("Julian GREEN", 19, 1);
        usa.Insertar("John BROOKS ", 21, 1);
        usa.Insertar("Jermaine JONES", 32, 1);
        usa.Insertar("Kyle Beckerman", 32, 0);
        usa.Insertar("Clint Dempsey ", 31, 2);
        equipo.InsertarE("Usa", usa, 3, 1, 1, 1, 4, 4, 0, 4);
        
        
        ListaJugador uruguay = new ListaJugador();
        uruguay.Insertar("Edinson Cavani", 28, 1);
        uruguay.Insertar("Luis Suares", 30, 2);
        uruguay.Insertar("Diego Godin", 28, 1);
        uruguay.Insertar("Cristian RODRIGUEZ", 28, 0);
        uruguay.Insertar("Diego PEREZ", 34, 0);
        equipo.InsertarE("Uruguay", uruguay, 3, 2, 0, 1, 4, 4, 0, 6);
        
        ListaJugador alemania = new ListaJugador();
        alemania.Insertar("Thomas Mueller", 24, 5);
        alemania.Insertar("Andre Schuerrle", 23, 3);
        alemania.Insertar("Toni Kroos", 24, 2);
        alemania.Insertar("Mario Goetze", 22, 2);
        alemania.Insertar("Sami khedira", 27, 1);
        equipo.InsertarE("Alemania", alemania, 3, 2, 1, 0, 7, 2, 5, 7);

       //equipo.arreglo();
       //equipo.Imprimir();


        String nom1;
        String nom2;
        String nom3;
        String nom4;

        nom1 = "Brasil";
        nom2 = "Mexico";
        nom3 = "Croacia";
        nom4 = "Camerun";

        ListaGrupo grupo = new ListaGrupo();
        grupo.InsertarGR("A", equipo.BuscarEQ(nom1), equipo.BuscarEQ(nom2), equipo.BuscarEQ(nom3), equipo.BuscarEQ(nom4));

        nom1 = "Holanda";
        nom2 = "Chile";
        nom3 = "España";
        nom4 = "Australia";

        grupo.InsertarGR("B", equipo.BuscarEQ(nom1), equipo.BuscarEQ(nom2), equipo.BuscarEQ(nom3), equipo.BuscarEQ(nom4));

        nom1 = "Colombia";
        nom2 = "Grecia";
        nom3 = "Costa de Marfil";
        nom4 = "Japon";

        grupo.InsertarGR("C", equipo.BuscarEQ(nom1), equipo.BuscarEQ(nom2), equipo.BuscarEQ(nom3), equipo.BuscarEQ(nom4));

        nom1 = "Costa Rica";
        nom2 = "Uruguay";
        nom3 = "Italia";
        nom4 = "Inglaterra";

        grupo.InsertarGR("D", equipo.BuscarEQ(nom1), equipo.BuscarEQ(nom2), equipo.BuscarEQ(nom3), equipo.BuscarEQ(nom4));

        nom1 = "Francia";
        nom2 = "Grecia";
        nom3 = "Ecuador";
        nom4 = "Honduras";

        grupo.InsertarGR("E", equipo.BuscarEQ(nom1), equipo.BuscarEQ(nom2), equipo.BuscarEQ(nom3), equipo.BuscarEQ(nom4));

        nom1 = "Argentina";
        nom2 = "Nigeria";
        nom3 = "Bosnia y Herzegovina";
        nom4 = "Iran";

        grupo.InsertarGR("F", equipo.BuscarEQ(nom1), equipo.BuscarEQ(nom2), equipo.BuscarEQ(nom3), equipo.BuscarEQ(nom4));

        nom1 = "Alemania";
        nom2 = "Usa";
        nom3 = "Portugal";
        nom4 = "Ghana";

        grupo.InsertarGR("G", equipo.BuscarEQ(nom1), equipo.BuscarEQ(nom2), equipo.BuscarEQ(nom3), equipo.BuscarEQ(nom4));

        nom1 = "Belgica";
        nom2 = "Argelia";
        nom3 = "Rusia";
        nom4 = "Republica de Korea";

        grupo.InsertarGR("H", equipo.BuscarEQ(nom1), equipo.BuscarEQ(nom2), equipo.BuscarEQ(nom3), equipo.BuscarEQ(nom4));
        //grupo.Imprimir();


        ListaCalendario primerPartido = new ListaCalendario();
        primerPartido.Insertar("Brasil vs Croacia 12/06/2014 | 17:00 horas Marcador 0 vs 2", "", "", "");

        ListaCalendario segundoPartido = new ListaCalendario();
        segundoPartido.Insertar("Mexico vs Camerun Marcador 1 vs 0 Goles O. PERALTA 61' Fecha 13/06/2014 | 13:00 horas Marcador 0 vs 2   ",
                "España vs Holanda Marcador 1 vs 5 Goles ALONSO 27' GP V. PERSIE 44', 72'ROBBEN 53', 80' DE VRIJ 65 Fecha 13/06/2014 | 16:00 horas",
                " Chile vs Australia Fecha 13/06/2014 | 18:00 horas", "");

        
     

        ListaCalendario tercPartido = new ListaCalendario();
        tercPartido.Insertar("Colombia vs Grecia Marcador 3 vs 0 goles P.ARMERO,5'TEO 58'JAMES 90'+3 Fecha 14/06/2014 | 13:00 horas ", "Uruguay vs CostaRica  Marcador 1 vs 3 Goles E. CAVANI 24' GP CAMPBELL J. 54' DUARTE O. 57' UREÑA M. 84  Fecha 14/06/2014 | 16:00 horas", "Inglaterra  vs Italia Fecha 14/06/2014 | 18:00 horas", "CostadeMarfil vs Japon 14/06/2014 | 22:00 horas");

        ListaCalendario cuarPartido = new ListaCalendario();
        cuarPartido.Insertar("Suiza vs Ecuador Marcador 2 vs 1 Goles MEHMEDI 48' SEFEROVIC 90'+3 E. VALENCIA 22' Fecha 15/06/2014 | 13:00 horas ", "Francia vs Honduras Marcador 3 vs 0 Goles BENZEMA 45' GP, 72'VALLADARES 48' GPM Fecha 15/06/2014 | 16:00 horas", "Argentina vs BosniayHerzegovina Marcador 2 vs 1 KOLAŠINAC 3'MESSI 65'IBIŠEVIĆ 85 Goles  Fecha 15/06/2014 | 19:00 horas", "");

        ListaCalendario ciPartido = new ListaCalendario();
        ciPartido.Insertar("Alemania vs Portugal Marcador 4 vs 0 Goles MÜLLER 12' GP, 45'+1, 78' HUMMELS 32'  Fecha 16/06/2014 | 13:00 horas ", "Iran vs Nigeria  Marcador 0 vs 0 Fecha 16/06/2014 | 16:00 horas", "Ghana vs EEUU Marcador 1 vs 2 Goles A. AYEW 82'DEMPSEY 1'BROOKS 86 Fecha 16/06/2014 | 18:00 horas", "");

        ListaCalendario sixPartido = new ListaCalendario();
        sixPartido.Insertar("Belgica vs Argelia Marcador 2 vs 1 goles FELLAINI 70' MERTENS 80'FEGHOULI 25'   Fecha 17/06/2014 | 13:00 horas ", "Brasil vs Mexico Marcador 0 vs 0 Fecha 17/06/2014 | 16:00 horas", "Rusia vs Republicacheca Fecha 17/06/2014 | 19:00 horas", "");

        ListaCalendario sevPartido = new ListaCalendario();
        sevPartido.Insertar("Australia vs Holanda Marcador 2 vs 3 Goles CAHILL 21'JEDINAK 54' GP ROBBEN 20'V. PERSIE 58' MEMPHIS 68 Fecha 18/06/2014 | 13:00 horas ", "España vs Chile Marcador 0 vs 2 GolesVARGAS 20' CH. ARÁNGUIZ 43 Fecha 18/06/2014 | 16:00 horas", "Camerun vs Croacia Fecha 18/06/2014 | 18:00 horas", "");

        ListaCalendario octPartido = new ListaCalendario();
        octPartido.Insertar("Colombia vs CostadeMarfil Marcador 2 vs 1 Goles JAMES 64' QUINTERO 70'GERVINHO 73 Fecha 19/06/2014 | 13:00 horas ", "Uruguay vs Inglaterra Fecha 19/06/2014 | 16:00 horas", "Japon vs Grecia Marcador 0 vs 0 Fecha 19/06/2014 | 19:00 horas", "");

        ListaCalendario ninPartido = new ListaCalendario();
        ninPartido.Insertar("Italia vs CostaRica Fecha 20/06/2014 | 13:00 horas ", "Suiza vs Francia Marcador 2 vs 5 Goles DZEMAILI 81'XHAKA 87'GIROUD 17'MATUIDI 18'VALBUENA 40'BENZEMA 67'SISSOKO 73 Fecha 20/06/2014 | 16:00 horas", "Honduras vs Ecuador  Marcador 1 vs 2 Goles COSTLY  31'E. VALENCIA 34', 65' Fecha 20/06/2014 | 18:00 horas", "");

        ListaCalendario tenPartido = new ListaCalendario();
        tenPartido.Insertar("Argentina vs Iran Marcador 1 vs 0 goles  MESSI 90'+1 Fecha 21/06/2014 | 13:00 horas ", "Alemania vs Ghana Marcador 2 vs 2 Goles GÖTZE 51' KLOSE 71' A. AYEW 54' A. GYAN 63   Fecha 21/06/2014 | 16:00 horas", "Nigeria vs BosniayHerzegovina Fecha 21/06/2014 | 18:00 horas", "");

        ListaCalendario oncPartido = new ListaCalendario();
        oncPartido.Insertar("Belgica vs Rusia  Marcador 1 vs 0 Goles ORIGI 88 Fecha 22/06/2014 | 13:00 horas ", "Republicadekorea vs Argelia Marcador 2 vs 4 Goles H M SON 50' J C KOO 72'SLIMANI 26' HALLICHE 28' DJABOU 38' BRAHIMI 62 Fecha 22/06/2014 | 16:00 horas", "EEUU vs Portugal Fecha 22/06/2014 | 18:00 horas", "");

        ListaCalendario docPartido = new ListaCalendario();
        docPartido.Insertar("Holanda vs Chile Fecha 23/06/2014 | 13:00 horas ", "Australia vs España Marcador 0 vs 3 Goles DAVID VILLA 36'TORRES 69'MATA 82 Fecha 23/06/2014 | 13:00 horas", "Camerun vs Brasil Marcador 1 vs 4 Goles MATIP 26'NEYMAR JR 17', 35' FRED 49' FERNANDINHO 84  Fecha 23/06/2014 | 17:00 horas", "Croacia vs Mexico Fecha 23/06/2014 | 17:00 horas");

        ListaCalendario trecPartido = new ListaCalendario();
        trecPartido.Insertar("Italia vs Uruguay Marcador 0 vs 1 Goles D. GODIN 81' Fecha 24/06/2014 | 13:00 horas ", "CostaRica vs Inglaterra Marcador 0 vs 0 Fecha 24/06/2014 | 13:00 horas", "Japon vs Colombia Fecha 24/06/2014 | 16:00 horas", "Grecia vs CostadeMarfil Marcador 2 vs 1 Goles SAMARIS 42' SAMARAS 90'+3 GPB. WILFRIED 74   Fecha 24/06/2014 | 17:00 horas");

        ListaCalendario catPartido = new ListaCalendario();
        catPartido.Insertar("Nigeria vs Argentina Marcador 2 vs 3 Goles MUSA 4', 47'MESSI 3', 45'+1 ROJO 50   Fecha 25/06/2014 | 13:00 horas ", "BosniayHerzagovina vs Iran Marcador 3 vs 1 GolesDŽEKO 23' PJANIĆ 59'VRŠAJEVIĆ 83'REZA 82  Fecha 25/06/2014 | 13:00 horas", "Honduras vs Suiza Fecha 25/06/2014 | 16:00 horas", "Ecuador vs Francia  Marcador 0 vs 0 Fecha 25/06/2014 | 17:00 horas");

        ListaCalendario quiPartido = new ListaCalendario();
        quiPartido.Insertar("Portugal vs Ghana Marcador 2 vs 1Goles BOYE 31' GPM RONALDO 80' A. GYAN 57 Fecha 26/06/2014 | 13:00 horas ", "EEUU vs Alemania Fecha 26/06/2014 | 13:00 horas", "Republicadekorea vs Belgica Fecha 26/06/2014 | 17:00 horas", "Argelia vs Rusia Marcador 1 vs 1 Goles SLIMANI 60' KOKORIN 6 Fecha 26/06/2014 | 17:00 horas");

        ListaCalendario diePartido = new ListaCalendario();
        diePartido.Insertar("Brasil vs Chile Marcador 1 vs 1 Goles DAVID LUIZ 18'ALEXIS 32 Fecha 28/06/2014 | 13:00 horas ", "Colombia vs Uruguay Fecha 28/06/2014 | 17:00 horas", "", "");

        ListaCalendario diesPartido = new ListaCalendario();
        diesPartido.Insertar("Holanda vs Mexico Marcador 2 vs 1 Goles SNEIJDER 88'HUNTELAAR 90'+4 GP G. DOS SANTOS 48' Fecha 29/06/2014 | 13:00 horas ", "CostaRica vs Grecia Fecha 29/06/2014 | 17:00 horas", "", "");

        ListaCalendario dieocPartido = new ListaCalendario();
        dieocPartido.Insertar("Francia vs Nigeria Marcador 2 vs 0 Goles POGBA 79' YOBO 90'+2 GPM  Fecha 30/06/2014 | 13:00 horas ", "Alemania vs Argelia Marcador 2 vs 1 Goles SCHÜRRLE 92' ÖZIL 120'DJABOU 120'+1 Fecha 30/06/2014 | 17:00 horas", "", "");

        ListaCalendario dienuPartido = new ListaCalendario();
        dienuPartido.Insertar("Argentina vs Suiza Fecha 01/06/2014 | 13:00 horas ", "Belgica vs EEUU Marcador 2 vs 1 Goles DE BRUYNE 93' LUKAKU 105' GREEN 107  Fecha 01/06/2014 | 17:00 horas", "", "");

        ListaCalendario vePartido = new ListaCalendario();
        vePartido.Insertar("Francia vs Alemania Marcador 0 vs 1 Goles HUMMELS 13  Fecha 04/06/2014 | 13:00 horas ", "Brasil vs Colombia Marcador 2 vs 1 Goles T SILVA 7'DAVID LUIZ 69' Fecha 04/06/2014 | 17:00 horas", "", "");

        ListaCalendario veunoPartido = new ListaCalendario();
        veunoPartido.Insertar("Argentina vs Belgica Marcador  1 vs 0  Goles HIGUAIN 8' Fecha 05/06/2014 | 13:00 horas ", "Holanda vs CostaRica Marcador 0 vs 0Fecha 05/06/2014 | 17:00 horas", "", "");

        ListaCalendario vedosPartido = new ListaCalendario();
        vedosPartido.Insertar("Basil vs Alemania Marcador 1 vs 7 Goles OSCAR 90'MÜLLER 11' KLOSE 23'KROOS 24', 26'KHEDIRA29' SCHÜRRLE 69', 79' Fecha 08/06/2014 | 17:00 horas ", "", "", "");

        ListaCalendario vetresPartido = new ListaCalendario();
        vetresPartido.Insertar("Holanda vs Argentina Fecha 09/06/2014 | 17:00 horas ", "", "", "");

        ListaCalendario vecuaPartido = new ListaCalendario();
        vecuaPartido.Insertar("Brasil vs Holanda Marcador 0 vs 3 Goles V. PERSIE 3' GP BLIND 17' WIJNALDUM 90'+1 Fecha 12/06/2014 | 16:00 horas ", "", "", "");

        ListaCalendario vecinqPartido = new ListaCalendario();
        vecinqPartido.Insertar("Alemania vs Argentina Marcador 1 vs 0 Goles GÖTZE 113' Fecha 13/06/2014 | 16:00 horas ", "", "", "");
        
        ListaEstadio EstadioMineirão = new ListaEstadio();
        EstadioMineirão.InsertarEs("Estadio Mineirao", "Belo Horizonte", 58170, 6);

        ListaEstadio EstadioArenadaBaixada = new ListaEstadio();
        EstadioArenadaBaixada.InsertarEs("Estadio Arenada Baixada", "Curitiba", 39631, 4);

        ListaEstadio EstadioDasDunas = new ListaEstadio();
        EstadioDasDunas.InsertarEs("Estadio Das Dunas", "Natal", 39971, 4);

        ListaEstadio EstadioMaracaña = new ListaEstadio();
        EstadioMaracaña.InsertarEs("Estadio Maracaña", "Río de Janeiro", 74738, 7);

        ListaEstadio EstadioNacionalBrasilia = new ListaEstadio();
        EstadioNacionalBrasilia.InsertarEs("Estadio Nacional Brasilia", " Brasilia", 69349, 7);

        ListaEstadio EstadioCastelao = new ListaEstadio();
        EstadioCastelao.InsertarEs("Estadio Castelao", "Fortaleza", 60342, 6);

        ListaEstadio EstadioBeiraRio = new ListaEstadio();
        EstadioBeiraRio.InsertarEs("Estadi Beira-Rio", "Porto Alegre", 43394, 5);

        ListaEstadio EstadioFonteaArenaNova = new ListaEstadio();
        EstadioFonteaArenaNova.InsertarEs("Estadio Fontea Arena Nova", "Salvador", 51900, 6);

        ListaEstadio EstadioArenaPantanal = new ListaEstadio();
        EstadioArenaPantanal.InsertarEs("Estadio Arena Pantanal", "Cuiabá", 41112, 4);

        ListaEstadio EstadioArenaAmazonia = new ListaEstadio();
        EstadioArenaAmazonia.InsertarEs("Estadio Arena Amazonia", "Manaos", 40549, 4);

        ListaEstadio EstadioArenaPernambuco = new ListaEstadio();
        EstadioArenaPernambuco.InsertarEs("Estadio Arena Pernambuco", "Recife", 42610, 5);

        ListaEstadio EstadioArenadeSãoPaul = new ListaEstadio();
        EstadioArenadeSãoPaul.InsertarEs("Estadio Arena de São Paulo", "São Paulo", 62601, 6);
        
        

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Lista");
            System.out.println("Digite el numero del ejercicio: " + "\n" + "1.Insercion,Modificar y Eliminar"
                    + "\n" + "2.Consultas"
                    + "\n" + "3.Reportes"
                    + "\n" + "4.Calendario");

            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Sub lista");
                        System.out.println("Digite el numero de lo que desea hacer:" + "\n" + "1.Insertar Jugador"
                                + "\n" + "2.Modificar Jugador"
                                + "\n" + "3.Eliminar Jugador"
                                + "\n" + "4.Modificar Estadio");
                        opcion2 = Integer.parseInt(teclado.nextLine());
                        switch (opcion2) {
                            case 1:
                                do {
                                    System.out.println("Escoja cual equipo:"
                                            + "SUBMENU DE EQUIPOS"
                                            + "\n1:   Alemania."
                                            + "\n2:   Costa Rica."
                                            + "\n3:   Argentina."
                                            + "\n4:   EEUU."
                                            + "\n5:   Belgica."
                                            + "\n6:   Argelia."
                                            + "\n7:   Camerun."
                                            + "\n8:   Costa de Marfil."
                                            + "\n9:   Ghana."
                                            + "\n10:  Australia."
                                            + "\n11:  Iran."
                                            + "\n12:  Japon."
                                            + "\n13:  Republica de korea ."
                                            + "\n14:  Bosnia y Herzegovina ."
                                            + "\n15:  Croacia."
                                            + "\n16:  Inglaterra."
                                            + "\n17:  Francia."
                                            + "\n18:  Grecia ."
                                            + "\n19:  Italia."
                                            + "\n20:  Portugal."
                                            + "\n21:  Rusia."
                                            + "\n22:  Holanda."
                                            + "\n23:  España."
                                            + "\n24:  Suiza."
                                            + "\n25:  Honduras."
                                            + "\n26:  Mexico."
                                            + "\n27:  Brasil."
                                            + "\n28:  Chile."
                                            + "\n29:  Colombia."
                                            + "\n30:  Ecuador."
                                            + "\n31:  Uruguay."
                                            + "\n32:  Nigeria.");
                                    opcion2 = Integer.parseInt(teclado.nextLine());
                                    switch (opcion2) {
                                        case 1:
                                            System.out.println("Digite el nombre del jugador de Alemania a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Alemania a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Alemania a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            alemania.Insertar(nombre, edad, goles);
                                            alemania.Imprimir();

                                            break;
                                        case 2:
                                            System.out.println("Digite el nombre del jugador de Costa Rica a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Costa Rica a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite la goles del jugador de Costa Rica a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            costaRica.Insertar(nombre, edad, goles);
                                            costaRica.Imprimir();
                                            break;
                                        case 3:
                                            System.out.println("Digite el nombre del jugador de Argentina a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Argentina a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Argentina a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            argentina.Insertar(nombre, edad, goles);
                                            argentina.Imprimir();
                                            break;
                                        case 4:
                                            System.out.println("Digite el nombre del jugador de EEUU a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de EEUU a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de EEUU a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            usa.Insertar(nombre, edad, goles);
                                            usa.Imprimir();
                                            break;
                                        case 5:
                                            System.out.println("Digite el nombre del jugador de Belgica a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Belgica a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Belgica a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            belgica.Insertar(nombre, edad, goles);
                                            belgica.Imprimir();
                                            break;
                                        case 6:
                                            System.out.println("Digite el nombre del jugador de Argelia a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Argelia a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Argelia a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            argelia.Insertar(nombre, edad, goles);
                                            argelia.Imprimir();
                                            break;
                                        case 7:
                                            System.out.println("Digite el nombre del jugador de Camerun a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Camerun a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Camerun a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            camerun.Insertar(nombre, edad, goles);
                                            camerun.Imprimir();
                                            break;
                                        case 8:
                                            System.out.println("Digite el nombre del jugador de Costa de Marfil a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Costa de Marfil a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Costa de Marfil a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            costademarfil.Insertar(nombre, edad, goles);
                                            costademarfil.Imprimir();
                                            break;
                                        case 9:
                                            System.out.println("Digite el nombre del jugador de Ghana a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Ghana a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Ghana a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            ghana.Insertar(nombre, edad, goles);
                                            ghana.Imprimir();
                                            break;
                                        case 10:
                                            System.out.println("Digite el nombre del jugador de Australia a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Australia a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Australia a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            australia.Insertar(nombre, edad, goles);
                                            australia.Imprimir();
                                            break;
                                        case 11:
                                            System.out.println("Digite el nombre del jugador de Iran a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Iran a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Iran a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            iran.Insertar(nombre, edad, goles);
                                            iran.Imprimir();
                                            break;
                                        case 12:
                                            System.out.println("Digite el nombre del jugador de Japon a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Japon a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Japon a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            japon.Insertar(nombre, edad, goles);
                                            japon.Imprimir();
                                            break;
                                        case 13:
                                            System.out.println("Digite el nombre del jugador de Republica de korea a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();


                                            System.out.println("Digite la edad del jugador de Republica de korea a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Republica de korea a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            republicadekorea.Insertar(nombre, edad, goles);
                                            republicadekorea.Imprimir();
                                            break;
                                        case 14:
                                            System.out.println("Digite el nombre del jugador de Bosnia y Herzegovina a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Bosnia y Herzegovina a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Bosnia y Herzegovina a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            bosniayherzegovina.Insertar(nombre, edad, goles);
                                            bosniayherzegovina.Imprimir();
                                            break;
                                        case 15:
                                            System.out.println("Digite el nombre del jugador de Croacia a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Croacia a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Croacia a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            croacia.Insertar(nombre, edad, goles);
                                            croacia.Imprimir();
                                            break;
                                        case 16:
                                            System.out.println("Digite el nombre del jugador de Inglaterra a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Inglaterra a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Inglaterra a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            inglaterra.Insertar(nombre, edad, goles);
                                            inglaterra.Imprimir();
                                            break;
                                        case 17:
                                            System.out.println("Digite el nombre del jugador de Francia a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Francia a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Francia a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            francia.Insertar(nombre, edad, goles);
                                            francia.Imprimir();
                                            break;
                                        case 18:
                                            System.out.println("Digite el nombre del jugador de Grecia a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Grecia a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Grecia a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            grecia.Insertar(nombre, edad, goles);
                                            grecia.Imprimir();
                                            break;
                                        case 19:
                                            System.out.println("Digite el nombre del jugador de Italia a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Italia a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Italia a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            italia.Insertar(nombre, edad, goles);
                                            italia.Imprimir();
                                            break;
                                        case 20:
                                            System.out.println("Digite el nombre del jugador de Portugal a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Portugal a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Portugal a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            portugal.Insertar(nombre, edad, goles);
                                            portugal.Imprimir();
                                            break;
                                        case 21:
                                            System.out.println("Digite el nombre del jugador de Rusia a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Rusia a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Rusia a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            rusia.Insertar(nombre, edad, goles);
                                            rusia.Imprimir();
                                            break;
                                        case 22:
                                            System.out.println("Digite el nombre del jugador de Holanda a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Holanda a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Holanda a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            holanda.Insertar(nombre, edad, goles);
                                            holanda.Imprimir();

                                            break;
                                        case 23:
                                            System.out.println("Digite el nombre del jugador de España a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de España a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de España a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            españa.Insertar(nombre, edad, goles);
                                            españa.Imprimir();
                                            break;
                                        case 24:
                                            System.out.println("Digite el nombre del jugador de Suiza a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Suiza a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Suiza a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            suiza.Insertar(nombre, edad, goles);
                                            suiza.Imprimir();
                                            break;
                                        case 25:
                                            System.out.println("Digite el nombre del jugador de Honduras a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Honduras a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Honduras a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            honduras.Insertar(nombre, edad, goles);
                                            honduras.Imprimir();
                                            break;
                                        case 26:
                                            System.out.println("Digite el nombre del jugador de Mexico a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Mexico a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Mexico a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            mexico.Insertar(nombre, edad, goles);
                                            mexico.Imprimir();
                                            break;
                                        case 27:
                                            System.out.println("Digite el nombre del jugador de Brasil a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Brasil a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Brasil a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            brasil.Insertar(nombre, edad, goles);
                                            brasil.Imprimir();
                                            break;
                                        case 28:
                                            System.out.println("Digite el nombre del jugador de Chile a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Chile a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Chile a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            chile.Insertar(nombre, edad, goles);
                                            chile.Imprimir();
                                            break;
                                        case 29:
                                            System.out.println("Digite el nombre del jugador de Colombia a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Colombia a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Colombia a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            colombia.Insertar(nombre, edad, goles);
                                            colombia.Imprimir();
                                            break;
                                        case 30:
                                            System.out.println("Digite el nombre del jugador de Ecuador a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Ecuador a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Ecuador a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            ecuador.Insertar(nombre, edad, goles);
                                            ecuador.Imprimir();
                                            break;
                                        case 31:
                                            System.out.println("Digite el nombre del jugador de Uruguay a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Uruguay a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Uruguay a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            uruguay.Insertar(nombre, edad, goles);
                                            uruguay.Imprimir();
                                            break;
                                        case 32:
                                            System.out.println("Digite el nombre del jugador de Nigeria a Insertar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Nigeria a Insertar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();

                                            System.out.println("Digite los goles del jugador de Nigeria a Insertar");
                                            teclado = new Scanner(System.in);
                                            goles = teclado.nextInt();

                                            nigeria.Insertar(nombre, edad, goles);
                                            nigeria.Imprimir();
                                            break;
                                    }
                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);

                                } while (c == 'S' || c == 's');

                                break;
                            case 2:
                                do {
                                    System.out.println("Escoja cual equipo:"
                                            + "SUBMENU DE EQUIPOS"
                                            + "\n1:   Alemania."
                                            + "\n2:   Costa Rica."
                                            + "\n3:   Argentina."
                                            + "\n4:   EEUU."
                                            + "\n5:   Belgica."
                                            + "\n6:   Argelia."
                                            + "\n7:   Camerun."
                                            + "\n8:   Costa de Marfil."
                                            + "\n9:   Ghana."
                                            + "\n10:  Australia."
                                            + "\n11:  Iran."
                                            + "\n12:  Japon."
                                            + "\n13:  Republica de korea ."
                                            + "\n14:  Bosnia y Herzegovina ."
                                            + "\n15:  Croacia."
                                            + "\n16:  Inglaterra."
                                            + "\n17:  Francia."
                                            + "\n18:  Grecia ."
                                            + "\n19:  Italia."
                                            + "\n20:  Portugal."
                                            + "\n21:  Rusia."
                                            + "\n22:  Holanda."
                                            + "\n23:  España."
                                            + "\n24:  Suiza."
                                            + "\n25:  Honduras."
                                            + "\n26:  Mexico."
                                            + "\n27:  Brasil."
                                            + "\n28:  Chile."
                                            + "\n29:  Colombia."
                                            + "\n30:  Ecuador."
                                            + "\n31:  Uruguay."
                                            + "\n32:  Nigeria.");
                                    opcion2 = Integer.parseInt(teclado.nextLine());
                                    switch (opcion2) {
                                        case 1:
                                            System.out.println("Digite el nombre del jugador de Alemania a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Alemania a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Alemania a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            alemania.ModificarJugador(nombre, nombreNuevo, edad);
                                            alemania.Imprimir();

                                            break;
                                        case 2:
                                            System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            costaRica.ModificarJugador(nombre, nombreNuevo, edad);
                                            costaRica.Imprimir();
                                            break;
                                        case 3:
                                            System.out.println("Digite el nombre del jugador de Argentina a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Argentina a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Argentina a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            argentina.ModificarJugador(nombre, nombreNuevo, edad);
                                            argentina.Imprimir();
                                            break;
                                        case 4:
                                            System.out.println("Digite el nombre del jugador de EEUU a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de EEUU a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de EEUU a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            usa.ModificarJugador(nombre, nombreNuevo, edad);
                                            usa.Imprimir();
                                            break;
                                        case 5:
                                            System.out.println("Digite el nombre del jugador de Belgica a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Belgica a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Belgica a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            belgica.ModificarJugador(nombre, nombreNuevo, edad);
                                            belgica.Imprimir();
                                            break;
                                        case 6:
                                            System.out.println("Digite el nombre del jugador de Argelia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Argelia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Argelia a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            argelia.ModificarJugador(nombre, nombreNuevo, edad);
                                            argelia.Imprimir();
                                            break;
                                        case 7:
                                            System.out.println("Digite el nombre del jugador de Camerun a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Camerun a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Camerun a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            camerun.ModificarJugador(nombre, nombreNuevo, edad);
                                            camerun.Imprimir();
                                            break;
                                        case 8:
                                            System.out.println("Digite el nombre del jugador de Costa de Marfil a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Costa de Marfil a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Costa de Marfil a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            costademarfil.ModificarJugador(nombre, nombreNuevo, edad);
                                            costademarfil.Imprimir();
                                            break;
                                        case 9:
                                            System.out.println("Digite el nombre del jugador de Ghana a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Ghana a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Ghana a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            ghana.ModificarJugador(nombre, nombreNuevo, edad);
                                            ghana.Imprimir();
                                            break;
                                        case 10:
                                            System.out.println("Digite el nombre del jugador de Australia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Australia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Australia a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            australia.ModificarJugador(nombre, nombreNuevo, edad);
                                            australia.Imprimir();
                                            break;
                                        case 11:
                                            System.out.println("Digite el nombre del jugador de Iran a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Iran a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Iran a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            iran.ModificarJugador(nombre, nombreNuevo, edad);
                                            iran.Imprimir();
                                            break;
                                        case 12:
                                            System.out.println("Digite el nombre del jugador de Japon a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Japon a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Japon a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            japon.ModificarJugador(nombre, nombreNuevo, edad);
                                            japon.Imprimir();
                                            break;
                                        case 13:
                                            System.out.println("Digite el nombre del jugador de Republica de korea a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Republica de korea a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Republica de korea a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            republicadekorea.ModificarJugador(nombre, nombreNuevo, edad);
                                            republicadekorea.Imprimir();
                                            break;
                                        case 14:
                                            System.out.println("Digite el nombre del jugador de Bosnia y Herzegovina a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Bosnia y Herzegovina a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Bosnia y Herzegovina a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            bosniayherzegovina.ModificarJugador(nombre, nombreNuevo, edad);
                                            bosniayherzegovina.Imprimir();
                                            break;
                                        case 15:
                                            System.out.println("Digite el nombre del jugador de Croacia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Croacia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Croacia a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            croacia.ModificarJugador(nombre, nombreNuevo, edad);
                                            croacia.Imprimir();
                                            break;
                                        case 16:
                                            System.out.println("Digite el nombre del jugador de Inglaterra a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Inglaterra a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Inglaterra a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            inglaterra.ModificarJugador(nombre, nombreNuevo, edad);
                                            inglaterra.Imprimir();
                                            break;
                                        case 17:
                                            System.out.println("Digite el nombre del jugador de Francia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Francia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Francia a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            francia.ModificarJugador(nombre, nombreNuevo, edad);
                                            francia.Imprimir();
                                            break;
                                        case 18:
                                            System.out.println("Digite el nombre del jugador de Grecia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Grecia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Grecia a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            grecia.ModificarJugador(nombre, nombreNuevo, edad);
                                            grecia.Imprimir();
                                            break;
                                        case 19:
                                            System.out.println("Digite el nombre del jugador de Italia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Italia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Italia a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            italia.ModificarJugador(nombre, nombreNuevo, edad);
                                            italia.Imprimir();
                                            break;
                                        case 20:
                                            System.out.println("Digite el nombre del jugador de Portugal a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Portugal a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Portugal a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            portugal.ModificarJugador(nombre, nombreNuevo, edad);
                                            portugal.Imprimir();
                                            break;
                                        case 21:
                                            System.out.println("Digite el nombre del jugador de Rusia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Rusia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Rusia a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            rusia.ModificarJugador(nombre, nombreNuevo, edad);
                                            rusia.Imprimir();
                                            break;
                                        case 22:
                                            System.out.println("Digite el nombre del jugador de Holanda a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Holanda a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Holanda a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            holanda.ModificarJugador(nombre, nombreNuevo, edad);
                                            holanda.Imprimir();

                                            break;
                                        case 23:
                                            System.out.println("Digite el nombre del jugador de España a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de España a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de España a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            españa.ModificarJugador(nombre, nombreNuevo, edad);
                                            españa.Imprimir();
                                            break;
                                        case 24:
                                            System.out.println("Digite el nombre del jugador de Suiza a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Suiza a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Suiza a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            suiza.ModificarJugador(nombre, nombreNuevo, edad);
                                            suiza.Imprimir();
                                            break;
                                        case 25:
                                            System.out.println("Digite el nombre del jugador de Honduras a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Honduras a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Honduras a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            honduras.ModificarJugador(nombre, nombreNuevo, edad);
                                            honduras.Imprimir();
                                            break;
                                        case 26:
                                            System.out.println("Digite el nombre del jugador de Mexico a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Mexico a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Mexico a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            mexico.ModificarJugador(nombre, nombreNuevo, edad);
                                            mexico.Imprimir();
                                            break;
                                        case 27:
                                            System.out.println("Digite el nombre del jugador de Brasil a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Brasil a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Brasil a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            brasil.ModificarJugador(nombre, nombreNuevo, edad);
                                            brasil.Imprimir();
                                            break;
                                        case 28:
                                            System.out.println("Digite el nombre del jugador de Chile a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Chile a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Chile a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            chile.ModificarJugador(nombre, nombreNuevo, edad);
                                            chile.Imprimir();
                                            break;
                                        case 29:
                                            System.out.println("Digite el nombre del jugador de Colombia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Colombia a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Colombia a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            colombia.ModificarJugador(nombre, nombreNuevo, edad);
                                            colombia.Imprimir();
                                            break;
                                        case 30:
                                            System.out.println("Digite el nombre del jugador de Ecuador a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Ecuador a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Ecuador a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            ecuador.ModificarJugador(nombre, nombreNuevo, edad);
                                            ecuador.Imprimir();
                                            break;
                                        case 31:
                                            System.out.println("Digite el nombre del jugador de Uruguay a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Uruguay a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Uruguay a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            uruguay.ModificarJugador(nombre, nombreNuevo, edad);
                                            uruguay.Imprimir();
                                            break;
                                        case 32:
                                            System.out.println("Digite el nombre del jugador de Nigeria a modificar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();

                                            System.out.println("Digite el nuevo nombre del jugador de Nigeria a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la edad del jugador de Nigeria a modificar");
                                            teclado = new Scanner(System.in);
                                            edad = teclado.nextInt();
                                            nigeria.ModificarJugador(nombre, nombreNuevo, edad);
                                            nigeria.Imprimir();
                                            break;
                                    }
                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);

                                } while (c == 'S' || c == 's');
                            case 3:
                                do {
                                    System.out.println("Escoja cual equipo:"
                                            + "SUBMENU DE EQUIPOS"
                                            + "\n1:   Alemania."
                                            + "\n2:   Costa Rica."
                                            + "\n3:   Argentina."
                                            + "\n4:   EEUU."
                                            + "\n5:   Belgica."
                                            + "\n6:   Argelia."
                                            + "\n7:   Camerun."
                                            + "\n8:   Costa de Marfil."
                                            + "\n9:   Ghana."
                                            + "\n10:  Australia."
                                            + "\n11:  Iran."
                                            + "\n12:  Japon."
                                            + "\n13:  Republica de korea ."
                                            + "\n14:  Bosnia y Herzegovina ."
                                            + "\n15:  Croacia."
                                            + "\n16:  Inglaterra."
                                            + "\n17:  Francia."
                                            + "\n18:  Grecia ."
                                            + "\n19:  Italia."
                                            + "\n20:  Portugal."
                                            + "\n21:  Rusia."
                                            + "\n22:  Holanda."
                                            + "\n23:  España."
                                            + "\n24:  Suiza."
                                            + "\n25:  Honduras."
                                            + "\n26:  Mexico."
                                            + "\n27:  Brasil."
                                            + "\n28:  Chile."
                                            + "\n29:  Colombia."
                                            + "\n30:  Ecuador."
                                            + "\n31:  Uruguay."
                                            + "\n32:  Nigeria.");
                                    opcion2 = Integer.parseInt(teclado.nextLine());
                                    switch (opcion2) {
                                        case 1:
                                            System.out.println("Digite el nombre del jugador de Alemania a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            alemania.EliminarJugador(nombre);
                                            alemania.Imprimir();
                                            break;
                                        case 2:
                                            System.out.println("Digite el nombre del jugador de Costa Rica a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            costaRica.EliminarJugador(nombre);
                                            costaRica.Imprimir();
                                            break;
                                        case 3:
                                            System.out.println("Digite el nombre del jugador de Argentina a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            argentina.EliminarJugador(nombre);
                                            argentina.Imprimir();
                                            break;
                                        case 4:
                                            System.out.println("Digite el nombre del jugador de USA a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            usa.EliminarJugador(nombre);
                                            usa.Imprimir();
                                            break;
                                        case 5:
                                            System.out.println("Digite el nombre del jugador de Belgica a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            belgica.EliminarJugador(nombre);
                                            belgica.Imprimir();
                                            break;
                                        case 6:
                                            System.out.println("Digite el nombre del jugador de Argelia a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            argelia.EliminarJugador(nombre);
                                            argelia.Imprimir();
                                            break;
                                        case 7:
                                            System.out.println("Digite el nombre del jugador de Camerun a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            camerun.EliminarJugador(nombre);
                                            camerun.Imprimir();
                                            break;
                                        case 8:
                                            System.out.println("Digite el nombre del jugador de Costa de Marfil a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            costademarfil.EliminarJugador(nombre);
                                            costademarfil.Imprimir();
                                            break;
                                        case 9:
                                            System.out.println("Digite el nombre del jugador de Ghana a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            ghana.EliminarJugador(nombre);
                                            ghana.Imprimir();
                                            break;
                                        case 10:
                                            System.out.println("Digite el nombre del jugador de Australia a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            australia.EliminarJugador(nombre);
                                            australia.Imprimir();
                                            break;
                                        case 11:
                                            System.out.println("Digite el nombre del jugador de Iran a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            iran.EliminarJugador(nombre);
                                            iran.Imprimir();
                                            break;
                                        case 12:
                                            System.out.println("Digite el nombre del jugador de Japon a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            japon.EliminarJugador(nombre);
                                            japon.Imprimir();
                                            break;
                                        case 13:
                                            System.out.println("Digite el nombre del jugador de Republica de korea a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            republicadekorea.EliminarJugador(nombre);
                                            republicadekorea.Imprimir();
                                            break;
                                        case 14:
                                            System.out.println("Digite el nombre del jugador de Bosnia y Herzegovina a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            bosniayherzegovina.EliminarJugador(nombre);
                                            bosniayherzegovina.Imprimir();
                                            break;
                                        case 15:
                                            System.out.println("Digite el nombre del jugador de Croacia a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            croacia.EliminarJugador(nombre);
                                            croacia.Imprimir();
                                            break;
                                        case 16:
                                            System.out.println("Digite el nombre del jugador de Inglaterra a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            inglaterra.EliminarJugador(nombre);
                                            inglaterra.Imprimir();
                                            break;
                                        case 17:
                                            System.out.println("Digite el nombre del jugador de Francia a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            francia.EliminarJugador(nombre);
                                            francia.Imprimir();
                                            break;
                                        case 18:
                                            System.out.println("Digite el nombre del jugador de Grecia a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            grecia.EliminarJugador(nombre);
                                            grecia.Imprimir();
                                            break;
                                        case 19:
                                            System.out.println("Digite el nombre del jugador de Italia a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            italia.EliminarJugador(nombre);
                                            italia.Imprimir();
                                            break;
                                        case 20:
                                            System.out.println("Digite el nombre del jugador de Portugal a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            portugal.EliminarJugador(nombre);
                                            portugal.Imprimir();
                                            break;
                                        case 21:
                                            System.out.println("Digite el nombre del jugador de Rusia a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            rusia.EliminarJugador(nombre);
                                            rusia.Imprimir();
                                            break;
                                        case 22:
                                            System.out.println("Digite el nombre del jugador de Holanda a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            holanda.EliminarJugador(nombre);
                                            holanda.Imprimir();

                                            break;
                                        case 23:
                                            System.out.println("Digite el nombre del jugador de España a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            españa.EliminarJugador(nombre);
                                            españa.Imprimir();
                                            break;
                                        case 24:
                                            System.out.println("Digite el nombre del jugador de Suiza a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            suiza.EliminarJugador(nombre);
                                            suiza.Imprimir();
                                            break;
                                        case 25:
                                            System.out.println("Digite el nombre del jugador de Honduras a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            honduras.EliminarJugador(nombre);
                                            honduras.Imprimir();
                                            break;
                                        case 26:
                                            System.out.println("Digite el nombre del jugador de Mexico a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            mexico.EliminarJugador(nombre);
                                            mexico.Imprimir();
                                            break;
                                        case 27:
                                            System.out.println("Digite el nombre del jugador de Brasil a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            brasil.EliminarJugador(nombre);
                                            brasil.Imprimir();
                                            break;
                                        case 28:
                                            System.out.println("Digite el nombre del jugador de Chile a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            chile.EliminarJugador(nombre);
                                            chile.Imprimir();
                                            break;
                                        case 29:
                                            System.out.println("Digite el nombre del jugador de Colombia a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            colombia.EliminarJugador(nombre);
                                            colombia.Imprimir();
                                            break;
                                        case 30:
                                            System.out.println("Digite el nombre del jugador de Ecuador a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            ecuador.EliminarJugador(nombre);
                                            ecuador.Imprimir();
                                            break;
                                        case 31:
                                            System.out.println("Digite el nombre del jugador de Uruguay a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            uruguay.EliminarJugador(nombre);
                                            uruguay.Imprimir();
                                            break;
                                        case 32:
                                            System.out.println("Digite el nombre del jugador de Nigeria a eliminar");
                                            teclado = new Scanner(System.in);
                                            nombre = teclado.nextLine();
                                            nigeria.EliminarJugador(nombre);
                                            nigeria.Imprimir();
                                            break;

                                    }
                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);

                                } while (c == 'S' || c == 's');

                                break;
                            case 4:
                                
                                do {
                                    System.out.println("Escoja cual Estadio:"
                                            + "\n" + "SubMenu de Estadios"
                                            + "\n1." + "Estadio Mineirao"
                                            + "\n2." + "Estadio Arenada Baixada"
                                            + "\n3." + "Estadio Das Dunas"
                                            + "\n4." + "Estadio Maracaña"
                                            + "\n5." + "Estadio Nacional Brasilia"
                                            + "\n6." + "Estadio Castelao"
                                            + "\n7." + "Estadi Beira-Rio"
                                            + "\n8." + "Estadio Fontea Arena Nova"
                                            + "\n9." + "Estadio Arena Pantanal"
                                            + "\n10." + "Estadio Arena Amazonia"
                                            + "\n11." + "Estadio Arena Pernambuco"
                                            + "\n12." + "Estadio Arena de São Paulo");
                                    opcion2 = Integer.parseInt(teclado.nextLine());
                                    switch (opcion2) {

                                        case 1:
                                            System.out.println("Digite el nuevo Nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioMineirão.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioMineirão.Imprimir();


                                            break;
                                        case 2:
                                           

                                            System.out.println("Digite el nuevo Nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioArenadaBaixada.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioArenadaBaixada.Imprimir();


                                            break;
                                        case 3:
                                            
                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioDasDunas.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioDasDunas.Imprimir();


                                            break;
                                        case 4:

                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioMaracaña.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioMaracaña.Imprimir();


                                            break;
                                        case 5:
                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioNacionalBrasilia.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioNacionalBrasilia.Imprimir();


                                            break;
                                        case 6:
                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioCastelao.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioCastelao.Imprimir();


                                            break;
                                        case 7:

                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                           System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioBeiraRio.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioBeiraRio.Imprimir();


                                            break;
                                        case 8:
                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioFonteaArenaNova.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioFonteaArenaNova.Imprimir();


                                            break;
                                        case 9:
                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();
                                            
                                            EstadioArenaPantanal.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioArenaPantanal.Imprimir();


                                            break;
                                        case 10:
                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                            System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioArenaAmazonia.ModificarEstadio( nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioArenaAmazonia.Imprimir();


                                            break;
                                        case 11:

                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                           System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioArenaPernambuco.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioArenaPernambuco.Imprimir();


                                            break;

                                        case 12:
                                            System.out.println("Digite el nuevo nombre del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            nombreNuevo = teclado.nextLine();

                                          System.out.println("Digite la nueva Ciudad del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            Ciudad = teclado.nextLine();

                                            System.out.println("Digite la nueva Capacidad de Personas del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            CantidadP = teclado.nextInt();

                                            System.out.println("Digite la nueva Cantidad de Partidos del Estadio a modificar");
                                            teclado = new Scanner(System.in);
                                            PartidosJ = teclado.nextInt();

                                            EstadioArenadeSãoPaul.ModificarEstadio(nombreNuevo, Ciudad, CantidadP, PartidosJ);
                                            EstadioArenadeSãoPaul.Imprimir();
                                            break;
                                    }
                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    teclado = new Scanner(System.in);
                                    c = teclado.nextLine().charAt(0);

                                } while (c == 'S' || c == 's');
                           break;
                                }
                        System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);

                    } while (c == 'S' || c == 's');
                       

                    break;

                case 2:
                    do {
                        System.out.println("Sub lista");
                        System.out.println("Digite el numero de lo que desea hacer:"
                                + "\n" + "1.Jugador mas Joven de un equipo (x)"
                                + "\n" + "2.Jugador mas Viejo de un equipo (x)"
                                + "\n" + "3.Resultado de un partido (x)");
                        opcion2 = Integer.parseInt(teclado.nextLine());
                        switch (opcion2) {
                            case 1:
                                System.out.println("Jugador mas Joven de un equipo (x)");
                                do {
                                    System.out.println("Escoja cual equipo:"
                                            + "SUBMENU DE EQUIPOS"
                                            + "\n1:   Alemania."
                                            + "\n2:   Costa Rica."
                                            + "\n3:   Argentina."
                                            + "\n4:   EEUU."
                                            + "\n5:   Belgica."
                                            + "\n6:   Argelia."
                                            + "\n7:   Camerun."
                                            + "\n8:   Costa de Marfil."
                                            + "\n9:   Ghana."
                                            + "\n10:  Australia."
                                            + "\n11:  Iran."
                                            + "\n12:  Japon."
                                            + "\n13:  Republica de korea ."
                                            + "\n14:  Bosnia y Herzegovina ."
                                            + "\n15:  Croacia."
                                            + "\n16:  Inglaterra."
                                            + "\n17:  Francia."
                                            + "\n18:  Grecia ."
                                            + "\n19:  Italia."
                                            + "\n20:  Portugal."
                                            + "\n21:  Rusia."
                                            + "\n22:  Holanda."
                                            + "\n23:  España."
                                            + "\n24:  Suiza."
                                            + "\n25:  Honduras."
                                            + "\n26:  Mexico."
                                            + "\n27:  Brasil."
                                            + "\n28:  Chile."
                                            + "\n29:  Colombia."
                                            + "\n30:  Ecuador."
                                            + "\n31:  Uruguay."
                                            + "\n32:  Nigeria.");
                                    opcion2 = Integer.parseInt(teclado.nextLine());
                                    switch (opcion2) {
                                        case 1:
                                            System.out.println("El jugador mas joven de Alemania es: " + alemania.jugadorJoven(alemania));
                                            break;
                                        case 2:
                                            System.out.println("El jugador mas joven de Costa Rica es: " + costaRica.jugadorJoven(costaRica));
                                            break;
                                        case 3:
                                            System.out.println("El jugador mas joven de Argentina es: " + argentina.jugadorJoven(argentina));
                                            break;
                                        case 4:
                                            System.out.println("El jugador mas joven de EEUU es: " + usa.jugadorJoven(usa));
                                            break;
                                        case 5:
                                            System.out.println("El jugador mas joven de Belgica es: " + belgica.jugadorJoven(belgica));
                                            break;
                                        case 6:
                                            System.out.println("El jugador mas joven de Argelia es: " + argelia.jugadorJoven(argelia));
                                            break;
                                        case 7:
                                            System.out.println("El jugador mas joven de Camerun es: " + camerun.jugadorJoven(camerun));
                                            break;
                                        case 8:
                                            System.out.println("El jugador mas joven de Costa de Marfil es: " + costademarfil.jugadorJoven(costademarfil));
                                            break;
                                        case 9:
                                            System.out.println("El jugador mas joven de Ghana es: " + ghana.jugadorJoven(ghana));
                                            break;
                                        case 10:
                                            System.out.println("El jugador mas joven de Australia es: " + australia.jugadorJoven(australia));
                                            break;
                                        case 11:
                                            System.out.println("El jugador mas joven de Iran es: " + iran.jugadorJoven(iran));
                                            break;
                                        case 12:
                                            System.out.println("El jugador mas joven de Japon es: " + japon.jugadorJoven(japon));
                                            break;
                                        case 13:
                                            System.out.println("El jugador mas joven de Republica de korea es: " + republicadekorea.jugadorJoven(republicadekorea));
                                            break;
                                        case 14:
                                            System.out.println("El jugador mas joven de Bosnia y Herzegovina es: " + bosniayherzegovina.jugadorJoven(bosniayherzegovina));
                                            break;
                                        case 15:
                                            System.out.println("El jugador mas joven de Croacia es: " + croacia.jugadorJoven(croacia));
                                            break;
                                        case 16:
                                            System.out.println("El jugador mas joven de Inglaterra es: " + inglaterra.jugadorJoven(inglaterra));
                                            break;
                                        case 17:
                                            System.out.println("El jugador mas joven de Francia es: " + francia.jugadorJoven(francia));
                                            break;
                                        case 18:
                                            System.out.println("El jugador mas joven de Grecia es: " + grecia.jugadorJoven(grecia));
                                            break;
                                        case 19:
                                            System.out.println("El jugador mas joven de Italia es: " + italia.jugadorJoven(italia));
                                            break;
                                        case 20:
                                            System.out.println("El jugador mas joven de Portugal es: " + portugal.jugadorJoven(portugal));
                                            break;
                                        case 21:
                                            System.out.println("El jugador mas joven de Rusia es: " + rusia.jugadorJoven(rusia));
                                            break;
                                        case 22:
                                            System.out.println("El jugador mas joven de Holanda es: " + holanda.jugadorJoven(holanda));
                                            break;
                                        case 23:
                                            System.out.println("El jugador mas joven de España es: " + españa.jugadorJoven(españa));
                                            break;
                                        case 24:
                                            System.out.println("El jugador mas joven de Suiza es: " + suiza.jugadorJoven(suiza));
                                            break;
                                        case 25:
                                            System.out.println("El jugador mas joven de Honduras es: " + honduras.jugadorJoven(honduras));
                                            break;
                                        case 26:
                                            System.out.println("El jugador mas joven de Mexico es: " + mexico.jugadorJoven(mexico));
                                            break;
                                        case 27:
                                            System.out.println("El jugador mas joven de Brasil es: " + brasil.jugadorJoven(brasil));
                                            break;
                                        case 28:
                                            System.out.println("El jugador mas joven de Chile es: " + chile.jugadorJoven(chile));
                                            break;
                                        case 29:
                                            System.out.println("El jugador mas joven de Colombia es: " + colombia.jugadorJoven(colombia));
                                            break;
                                        case 30:
                                            System.out.println("El jugador mas joven de Ecuador es: " + ecuador.jugadorJoven(ecuador));
                                            break;
                                        case 31:
                                            System.out.println("El jugador mas joven de Uruguay es: " + uruguay.jugadorJoven(uruguay));
                                            break;
                                        case 32:
                                            System.out.println("El jugador mas joven de Nigeria es: " + nigeria.jugadorJoven(nigeria));
                                            break;



                                    }

                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);

                                } while (c == 'S' || c == 's');




                                break;
                            case 2:
                                do {
                                    System.out.println("Escoja cual equipo:"
                                            + "SUBMENU DE EQUIPOS"
                                            + "\n1:   Alemania."
                                            + "\n2:   Costa Rica."
                                            + "\n3:   Argentina."
                                            + "\n4:   EEUU."
                                            + "\n5:   Belgica."
                                            + "\n6:   Argelia."
                                            + "\n7:   Camerun."
                                            + "\n8:   Costa de Marfil."
                                            + "\n9:   Ghana."
                                            + "\n10:  Australia."
                                            + "\n11:  Iran."
                                            + "\n12:  Japon."
                                            + "\n13:  Republica de korea ."
                                            + "\n14:  Bosnia y Herzegovina ."
                                            + "\n15:  Croacia."
                                            + "\n16:  Inglaterra."
                                            + "\n17:  Francia."
                                            + "\n18:  Grecia ."
                                            + "\n19:  Italia."
                                            + "\n20:  Portugal."
                                            + "\n21:  Rusia."
                                            + "\n22:  Holanda."
                                            + "\n23:  España."
                                            + "\n24:  Suiza."
                                            + "\n25:  Honduras."
                                            + "\n26:  Mexico."
                                            + "\n27:  Brasil."
                                            + "\n28:  Chile."
                                            + "\n29:  Colombia."
                                            + "\n30:  Ecuador."
                                            + "\n31:  Uruguay."
                                            + "\n32:  Nigeria.");
                                    opcion2 = Integer.parseInt(teclado.nextLine());
                                    switch (opcion2) {
                                        case 1:
                                            System.out.println("El jugador mas viejo de Alemania es: " + alemania.jugadorViejo(alemania));
                                            break;
                                        case 2:
                                            System.out.println("El jugador mas viejo de Costa Rica es: " + costaRica.jugadorViejo(costaRica));
                                            break;
                                        case 3:
                                            System.out.println("El jugador mas viejo de Argentina es: " + argentina.jugadorViejo(argentina));
                                            break;
                                        case 4:
                                            System.out.println("El jugador mas viejo de EEUU es: " + usa.jugadorViejo(usa));
                                            break;
                                        case 5:
                                            System.out.println("El jugador mas viejo de Belgica es: " + belgica.jugadorViejo(belgica));
                                            break;
                                        case 6:
                                            System.out.println("El jugador mas viejo de Argelia es: " + argelia.jugadorViejo(argelia));
                                            break;
                                        case 7:
                                            System.out.println("El jugador mas viejo de Camerun es: " + camerun.jugadorViejo(camerun));
                                            break;
                                        case 8:
                                            System.out.println("El jugador mas viejo de Costa de Marfil es: " + costademarfil.jugadorViejo(costademarfil));
                                            break;
                                        case 9:
                                            System.out.println("El jugador mas viejo de Ghana es: " + ghana.jugadorJoven(ghana));
                                            break;
                                        case 10:
                                            System.out.println("El jugador mas viejo de Australia es: " + australia.jugadorViejo(australia));
                                            break;
                                        case 11:
                                            System.out.println("El jugador mas viejo de Iran es: " + iran.jugadorViejo(iran));
                                            break;
                                        case 12:
                                            System.out.println("El jugador mas viejo de Japon es: " + japon.jugadorViejo(japon));
                                            break;
                                        case 13:
                                            System.out.println("El jugador mas viejo de Republica de korea es: " + republicadekorea.jugadorViejo(republicadekorea));
                                            break;
                                        case 14:
                                            System.out.println("El jugador mas viejo de Bosnia y Herzegovina es: " + bosniayherzegovina.jugadorViejo(bosniayherzegovina));
                                            break;
                                        case 15:
                                            System.out.println("El jugador mas viejo de Croacia es: " + croacia.jugadorViejo(croacia));
                                            break;
                                        case 16:
                                            System.out.println("El jugador mas viejo de Inglaterra es: " + inglaterra.jugadorViejo(inglaterra));
                                            break;
                                        case 17:
                                            System.out.println("El jugador mas viejo de Francia es: " + francia.jugadorViejo(francia));
                                            break;
                                        case 18:
                                            System.out.println("El jugador mas viejo de Grecia es: " + grecia.jugadorViejo(grecia));
                                            break;
                                        case 19:
                                            System.out.println("El jugador mas viejo de Italia es: " + italia.jugadorViejo(italia));
                                            break;
                                        case 20:
                                            System.out.println("El jugador mas viejo de Portugal es: " + portugal.jugadorViejo(portugal));
                                            break;
                                        case 21:
                                            System.out.println("El jugador mas viejo de Rusia es: " + rusia.jugadorViejo(rusia));
                                            break;
                                        case 22:
                                            System.out.println("El jugador mas viejo de Holanda es: " + holanda.jugadorViejo(holanda));
                                            break;
                                        case 23:
                                            System.out.println("El jugador mas viejo de España es: " + españa.jugadorViejo(españa));
                                            break;
                                        case 24:
                                            System.out.println("El jugador mas viejo de Suiza es: " + suiza.jugadorViejo(suiza));
                                            break;
                                        case 25:
                                            System.out.println("El jugador mas viejo de Honduras es: " + honduras.jugadorViejo(honduras));
                                            break;
                                        case 26:
                                            System.out.println("El jugador mas viejo de Mexico es: " + mexico.jugadorViejo(mexico));
                                            break;
                                        case 27:
                                            System.out.println("El jugador mas viejo de Brasil es: " + brasil.jugadorViejo(brasil));
                                            break;
                                        case 28:
                                            System.out.println("El jugador mas viejo de Chile es: " + chile.jugadorViejo(chile));
                                            break;
                                        case 29:
                                            System.out.println("El jugador mas viejo de Colombia es: " + colombia.jugadorViejo(colombia));
                                            break;
                                        case 30:
                                            System.out.println("El jugador mas viejo de Ecuador es: " + ecuador.jugadorViejo(ecuador));
                                            break;
                                        case 31:
                                            System.out.println("El jugador mas viejo de Uruguay es: " + uruguay.jugadorViejo(uruguay));
                                            break;
                                        case 32:
                                            System.out.println("El jugador mas viejo de Nigeria es: " + nigeria.jugadorViejo(nigeria));
                                            break;
                                    }

                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);

                                } while (c == 'S' || c == 's');
                                break;
                            case 3:
                                System.out.println("Resultado de un partido (x)");
                                int cont = 0;
                                System.out.println("Digite cualquier nombre de estos equipos:"
                                            + "SUBMENU DE EQUIPOS"
                                            + "\n Alemania"
                                            + "\n CostaRica"
                                            + "\n Argentina"
                                            + "\n EEUU"
                                            + "\n Belgica"
                                            + "\n Argelia"
                                            + "\n Camerun"
                                            + "\n CostadeMarfil"
                                            + "\n Ghana"
                                            + "\n Australia"
                                            + "\n Iran"
                                            + "\n Japon"
                                            + "\n Republicadekorea"
                                            + "\n BosniayHerzegovina"
                                            + "\n Croacia"
                                            + "\n Inglaterra"
                                            + "\n Francia"
                                            + "\n Grecia"
                                            + "\n Italia"
                                            + "\n Portugal"
                                            + "\n Rusia"
                                            + "\n Holanda"
                                            + "\n España"
                                            + "\n Suiza"
                                            + "\n Honduras"
                                            + "\n Mexico"
                                            + "\n Brasil"
                                            + "\n Chile"
                                            + "\n Colombia"
                                            + "\n Ecuador"
                                            + "\n Uruguay"
                                            + "\n Nigeria");
                                do {
                                    

                                    System.out.println("Digite los Equipos para Buscar El partido Respectivo");
                                    System.out.println("Digite el nombre del Primer Equipo:");
                                    nombre = teclado.nextLine();
                                    System.out.println("Digite el nombre del Segundo Equipo:");
                                    nombre2 = teclado.nextLine();
                                    cont = primerPartido.rc(nombre, nombre2, cont);
                                    cont = segundoPartido.rc(nombre, nombre2, cont);
                                    cont = tercPartido.rc(nombre, nombre2, cont);
                                    cont = cuarPartido.rc(nombre, nombre2, cont);
                                    cont = ciPartido.rc(nombre, nombre2, cont);
                                    cont = sixPartido.rc(nombre, nombre2, cont);
                                    cont = sevPartido.rc(nombre, nombre2, cont);
                                    cont = octPartido.rc(nombre, nombre2, cont);
                                    cont = ninPartido.rc(nombre, nombre2, cont);
                                    cont = tenPartido.rc(nombre, nombre2, cont);
                                    cont = oncPartido.rc(nombre, nombre2, cont);
                                    cont = docPartido.rc(nombre, nombre2, cont);
                                    cont = trecPartido.rc(nombre, nombre2, cont);
                                    cont = catPartido.rc(nombre, nombre2, cont);
                                    cont = quiPartido.rc(nombre, nombre2, cont);
                                    cont = diePartido.rc(nombre, nombre2, cont);
                                    cont = diesPartido.rc(nombre, nombre2, cont);
                                    cont = dieocPartido.rc(nombre, nombre2, cont);
                                    cont = dienuPartido.rc(nombre, nombre2, cont);
                                    cont = vePartido.rc(nombre, nombre2, cont);
                                    cont = veunoPartido.rc(nombre, nombre2, cont);
                                    cont = vedosPartido.rc(nombre, nombre2, cont);
                                    cont = vetresPartido.rc(nombre, nombre2, cont);
                                    cont = vecuaPartido.rc(nombre, nombre2, cont);
                                    cont = vecinqPartido.rc(nombre, nombre2, cont);

                                    if (cont == 0) {
                                        System.out.println("Este partido no existe" + "\n" + "Digite otra vez los equipos");
                                    }
                                } while (cont == 0);
                                break;
                        }
                        System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                    } while (c == 'S' || c == 's');
                    break;

                case 3:
                    do {
                        System.out.println("Sub lista");
                        System.out.println("Digite el numero de lo que desea hacer:" + "\n" + "1.Estadios con toda la información respectiva"
                                + "\n" + "2.Equipos con toda la información respectiva"
                                + "\n" + "3.Grupos con toda la información respectiva"
                                + "\n" + "4.Mostrar los goleadores "
                                + "\n" + "5.Tabla de posiciones "
                                + "\n" + "6.Informacion de Climas de los Estadios ");
                        opcion2 = Integer.parseInt(teclado.nextLine());
                        switch (opcion2) {

                            case 1:
                                System.out.println("Calendario de los Estadios con su informacion respectiva.");

                                do {
                                    System.out.println("Escoja cual Estadio:"
                                            + "\n" + "SubMenu de Estadios"
                                            + "\n1." + "Estadio Mineirao"
                                            + "\n2." + "Estadio Arenada Baixada"
                                            + "\n3." + "Estadio Das Dunas"
                                            + "\n4." + "Estadio Maracaña"
                                            + "\n5." + "Estadio Nacional Brasilia"
                                            + "\n6." + "Estadio Castelao"
                                            + "\n7." + "Estadi Beira-Rio"
                                            + "\n8." + "Estadio Fontea Arena Nova"
                                            + "\n9." + "Estadio Arena Pantanal"
                                            + "\n10." + "Estadio Arena Amazonia"
                                            + "\n11." + "Estadio Arena Pernambuco"
                                            + "\n12." + "Estadio Arena de São Paulo");
                                    opcion = Integer.parseInt(teclado.nextLine());
                                    switch (opcion) {

                                        case 1:
                                            EstadioMineirão.Imprimir();
                                            break;
                                        case 2:
                                            EstadioArenadaBaixada.Imprimir();
                                            break;
                                        case 3:
                                            EstadioDasDunas.Imprimir();

                                            break;
                                        case 4:
                                            EstadioMaracaña.Imprimir();
                                            break;
                                        case 5:
                                            EstadioNacionalBrasilia.Imprimir();
                                            break;
                                        case 6:
                                            EstadioCastelao.Imprimir();
                                            break;
                                        case 7:
                                            EstadioBeiraRio.Imprimir();
                                            break;
                                        case 8:
                                            EstadioFonteaArenaNova.Imprimir();
                                            break;
                                        case 9:
                                            EstadioArenaPantanal.Imprimir();
                                            break;
                                        case 10:
                                            EstadioArenaAmazonia.Imprimir();
                                            break;
                                        case 11:
                                            EstadioArenaPernambuco.Imprimir();
                                            break;
                                        case 12:
                                            EstadioArenadeSãoPaul.Imprimir();
                                            break;

                                    }

                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);
                                } while (c == 'S' || c == 's');

                                break;


                            case 2:
                                System.out.println("Equipos con toda la información respectiva");

                                do {
                                    System.out.println(" SUBMENU DE EQUIPOS"
                                            + "\n1:   Alemania."
                                            + "\n2:   Costa Rica."
                                            + "\n3:   Argentina."
                                            + "\n4:   EEUU."
                                            + "\n5:   Belgica."
                                            + "\n6:   Argelia."
                                            + "\n7:   Camerun."
                                            + "\n8:   Costa de Marfil."
                                            + "\n9:   Ghana."
                                            + "\n10:  Australia."
                                            + "\n11:  Iran."
                                            + "\n12:  Japon."
                                            + "\n13:  Republica de korea ."
                                            + "\n14:  Bosnia y Herzegovina ."
                                            + "\n15:  Croacia."
                                            + "\n16:  Inglaterra."
                                            + "\n17:  francia."
                                            + "\n18:  Grecia ."
                                            + "\n19:  Italia."
                                            + "\n20:  Portugal."
                                            + "\n21:  Rusia."
                                            + "\n22:  Holanda."
                                            + "\n23:  España."
                                            + "\n24:  Suiza."
                                            + "\n25:  Honduras."
                                            + "\n26:  Mexico."
                                            + "\n27:  Brazil."
                                            + "\n28:  Chile."
                                            + "\n29:  Colombia."
                                            + "\n30:  Ecuador."
                                            + "\n31:  Uruguay."
                                            + "\n32:  Nigeria."
                                            + "\n0:   Regresar.");
                                    opcion = Integer.parseInt(teclado.nextLine());

                                    switch (opcion) {
                                        case 1:
                                            nombre = "Alemania";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 2:
                                            nombre = "Costa Rica";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 3:
                                            nombre = "Argentina";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 4:
                                            nombre = "USA";
                                            equipo.ImpEQUIPOS_X(nombre);
                                        case 5:
                                            nombre = "Belgica";
                                            equipo.ImpEQUIPOS_X(nombre);
                                        case 6:
                                            nombre = "Argelia";
                                            equipo.ImpEQUIPOS_X(nombre);

                                        case 7:
                                            nombre = "Camerun";
                                            equipo.ImpEQUIPOS_X(nombre);
                                        case 8:
                                            nombre = "Costa de Marfil";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 9:
                                            nombre = "Ghana";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 10:
                                            nombre = "Australia";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 11:
                                            nombre = "Iran";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 12:
                                            nombre = "Japon";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 13:
                                            nombre = "Republica de Korea";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 14:
                                            nombre = "Bosnia y Herzegovina";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 15:
                                            nombre = "Croacia";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 16:
                                            nombre = "Inglaterra";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 17:
                                            nombre = "Francia";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 18:
                                            nombre = "Grecia";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 19:
                                            nombre = "Italia";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 20:
                                            nombre = "Portugal";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 21:
                                            nombre = "Rusia";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 22:
                                            nombre = "Holanda";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 23:
                                            nombre = "España";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 24:
                                            nombre = "Suiza";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 25:
                                            nombre = "Honduras";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 26:
                                            nombre = "Mexico";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 27:
                                            nombre = "Brazil";
                                            equipo.ImpEQUIPOS_X(nombre);

                                            break;
                                        case 28:
                                            nombre = "Chile";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 29:
                                            nombre = "Colombia";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 30:
                                            nombre = "Ecuador";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 31:
                                            nombre = "Uruguay";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                        case 32:
                                            nombre = "Nigeria";
                                            equipo.ImpEQUIPOS_X(nombre);
                                            break;
                                    }
                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);
                                } while (c == 'S' || c == 's');
                                break;
                            case 3:
                                System.out.println("Grupos con toda la información respectiva");
                                do {

                                    System.out.println(" SUBMENU DE GRUPOS"
                                            + "\n1:   GRUPO A."
                                            + "\n2:   GRUPO B."
                                            + "\n3:   GRUPO C."
                                            + "\n4:   GRUPO D."
                                            + "\n5:   GRUPO E."
                                            + "\n6:   GRUPO F."
                                            + "\n7:   GRUPO G."
                                            + "\n8:   GRUPO H.");

                                    opcion = Integer.parseInt(teclado.nextLine());

                                    switch (opcion) {
                                        case 1:
                                            nombre = "A";
                                            grupo.ImpGrupo_X(nombre);
                                            break;
                                        case 2:
                                            nombre = "B";
                                            grupo.ImpGrupo_X(nombre);
                                            break;
                                        case 3:
                                            nombre = "C";
                                            grupo.ImpGrupo_X(nombre);
                                            break;
                                        case 4:
                                            nombre = "D";
                                            grupo.ImpGrupo_X(nombre);
                                            break;
                                        case 5:
                                            nombre = "E";
                                            grupo.ImpGrupo_X(nombre);
                                            break;
                                        case 6:
                                            nombre = "F";
                                            grupo.ImpGrupo_X(nombre);
                                            break;
                                        case 7:
                                            nombre = "G";
                                            grupo.ImpGrupo_X(nombre);
                                            break;
                                        case 8:
                                            nombre = "H";
                                            grupo.ImpGrupo_X(nombre);
                                            break;


                                    }
                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);
                                } while (c == 'S' || c == 's');
                                break;
                            case 4:
                                System.out.println("Mostrar los goleadores ordenados por goleo.(El nombre del jugador, el nombre del equipo y la cantidad de goles anotados).");
                                equipo.MejoresG();
                                System.out.println("El Maximo Goleador es:  "+equipo.getGoleador1());
                                System.out.println("El Segundo Goleador es:  " + equipo.getGoleador2());
                                System.out.println("El Tercer Goleador es:  " + equipo.getGoleador3());
                                System.out.println("El Cuarto Goleador es:  "+ equipo.getGoleador4());
                                System.out.println("El Quinto Goleador es:  "+ equipo.getGoleador5());

                                break;
                            case 5:
                                System.out.println("Mostrar la tabla de posiciones por grupo.(Letra de grupo, nombre del equipo, PJ, PG, PE, PP, GA, GE, GDif y puntos).");
                                do {

                                    System.out.println(" SUBMENU DE GRUPOS"
                                            + "\n1:   GRUPO A."
                                            + "\n2:   GRUPO B."
                                            + "\n3:   GRUPO C."
                                            + "\n4:   GRUPO D."
                                            + "\n5:   GRUPO E."
                                            + "\n6:   GRUPO F."
                                            + "\n7:   GRUPO G."
                                            + "\n8:   GRUPO H.");

                                    opcion = Integer.parseInt(teclado.nextLine());

                                    switch (opcion) {
                                        case 1:
                                            nombre = "A";
                                            grupo.TablaGrupo(nombre);
                                            break;
                                        case 2:
                                            nombre = "B";
                                            grupo.TablaGrupo(nombre);
                                            break;
                                        case 3:
                                            nombre = "C";
                                            grupo.TablaGrupo(nombre);
                                            break;
                                        case 4:
                                            nombre = "D";
                                            grupo.TablaGrupo(nombre);
                                            break;
                                        case 5:
                                            nombre = "E";
                                            grupo.TablaGrupo(nombre);
                                            break;
                                        case 6:
                                            nombre = "F";
                                            grupo.TablaGrupo(nombre);
                                            break;
                                        case 7:
                                            nombre = "G";
                                            grupo.TablaGrupo(nombre);
                                            break;
                                        case 8:
                                            nombre = "H";
                                            grupo.TablaGrupo(nombre);
                                            break;


                                    }
                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);
                                } while (c == 'S' || c == 's');


                                break;
                            case 6:
                                System.out.println("Mostrar los datos climáticos por estadio, indicar fecha y hora.");


                                do {
                                    System.out.println("Escoja cual Estadio:"
                                            + "\n" + "SubMenu de Estadios"
                                            + "\n1." + "Estadio Mineirao"
                                            + "\n2." + "Estadio Arenada Baixada"
                                            + "\n3." + "Estadio Das Dunas"
                                            + "\n4." + "Estadio Maracaña"
                                            + "\n5." + "Estadio Nacional Brasilia"
                                            + "\n6." + "Estadio Castelao"
                                            + "\n7." + "Estadio Beira-Rio"
                                            + "\n8." + "Estadio Fontea Arena Nova"
                                            + "\n9." + "Estadio Arena Pantanal"
                                            + "\n10." + "Estadio Arena Amazonia"
                                            + "\n11." + "Estadio Arena Pernambuco"
                                            + "\n12." + "Estadio Arena de São Paulo");
                                    opcion = Integer.parseInt(teclado.nextLine());
                                    switch (opcion) {
                                        case 1:
                                            ListaCalendario EstadioMineirãoC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");
                                            EstadioMineirãoC.InsertarClima("Colombia VS Grecia PARCIALMENTE NUBOSO, 24°C Temperatura, 11m/s Viento, 51% Humedad", "14 jun. 2014 - 13:00 Hora Local");
                                            EstadioMineirãoC.ImprimirClima();
                                            System.out.println("");


                                            EstadioMineirãoC.InsertarClima("Belgica VS Algeria PARCIALMENTE NUBOSO, 29°C Temperatura, 5m/s Viento, 37% Humedad", " 17 jun. 2014 - 13:00 Hora Local");
                                            EstadioMineirãoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMineirãoC.InsertarClima("Argentina VS Iran PARCIALMENTE NUBOSO, 23°C Temperatura, 8m/s Viento, 51% Humedad", " 21 jun. 2014 - 13:00 Hora Local");
                                            EstadioMineirãoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMineirãoC.InsertarClima("Costa Rica VS Inglaterra SOLEADO, 24°C Temperatura, 3m/s Viento, 44% Humedad", "24 jun. 2014 - 13:00 Hora Local");
                                            EstadioMineirãoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMineirãoC.InsertarClima("Brasil VS Chile PARCIALMENTE NUBOSO, 26°C Temperatura, 6m/s Viento, 45% Humedad", "24 jun. 2014 - 13:00 Hora Local");
                                            EstadioMineirãoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMineirãoC.InsertarClima("Brasil VS Alemania NUBOSO, 22°C Temperatura, 7m/s Viento, 51% Humedad", "28 jun. 2014 - 13:00 Hora Local");
                                            EstadioMineirãoC.ImprimirClima();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            ListaCalendario EstadioArenadaBaixadaC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioArenadaBaixadaC.InsertarClima("Irán VS Nigeria SOLEADO, 21°C Temperatura, 8m/s Viento, 68% Humedad", " 16 jun. 2014 - 16:00 Hora Local");
                                            EstadioArenadaBaixadaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenadaBaixadaC.InsertarClima("Honduras VS Ecuador  NUBOSO, 13°C Temperatura, 3m/s Viento, 77% Humedad", " 20 jun. 2014 - 19:00 Hora Local");
                                            EstadioArenadaBaixadaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenadaBaixadaC.InsertarClima("Australia VS España SOLEADO, 18°C Temperatura, 8m/s Viento, 73% Humedad", " 23 jun. 2014 - 13:00 Hora Local");
                                            EstadioArenadaBaixadaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenadaBaixadaC.InsertarClima("Argelia VS Rusia SOLEADO, 23°C Temperatura, 6m/s Viento, 57% Humedad", " 26 jun. 2014 - 17:00 Hora Local");
                                            EstadioArenadaBaixadaC.ImprimirClima();
                                            System.out.println("");

                                            break;
                                        case 3:
                                            ListaCalendario EstadioDasDunasC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioDasDunasC.InsertarClima("Mexico VS Camerún LLUVIOSO, 27°C Temperatura, 22m/s Viento, 65% Humedad", " 13 jun. 2014 - 13:00 Hora Local");
                                            EstadioDasDunasC.ImprimirClima();
                                            System.out.println("");

                                            EstadioDasDunasC.InsertarClima("Ghana VS USA NOCHE PARCIALMENTE NUBOSA, 28°C Temperatura, 6m/s Viento, 67% Humedad", " 16 jun. 2014 - 19:00 Hora Local");
                                            EstadioDasDunasC.ImprimirClima();
                                            System.out.println("");

                                            EstadioDasDunasC.InsertarClima("Japón VS Grecia NOCHE PARCIALMENTE NUBOSO, 29°C Temperatura, 5m/s Viento, 65% Humedad", " 19 jun. 2014 - 19:00 Hora Local");
                                            EstadioDasDunasC.ImprimirClima();
                                            System.out.println("");

                                            EstadioDasDunasC.InsertarClima("Italia VS Uruguay PARCIALMENTE NUBOSO, 33°C Temperatura, 14m/s Viento, 45% Humedad", " 24 jun. 2014 - 13:00 Hora Local");
                                            EstadioDasDunasC.ImprimirClima();
                                            System.out.println("");

                                            break;
                                        case 4:
                                            ListaCalendario EstadioMaracañaC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioMaracañaC.InsertarClima("Argentina VS Boznia Y Herzegovina NOCHE CON CIELO DESPEJADO, 25°C Temperatura, 10m/s Viento, 69% Humedad", "15 jun. 2014 - 19:00 Hora Local");
                                            EstadioMaracañaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMaracañaC.InsertarClima("España VS Chile  NUBOSO, 26°C Temperatura, 14m/s Viento, 74% Humedad", " 18 jun. 2014 - 16:00 Hora Local");
                                            EstadioMaracañaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMaracañaC.InsertarClima("Bélgica VS Rusia PARCIALMENTE NUBOSO, 24°C Temperatura, 8m/s Viento, 73% Humedad", " 22 jun. 2014 - 13:00 Hora Local");
                                            EstadioMaracañaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMaracañaC.InsertarClima("Ecuador VS Francia SOLEADO, 28°C Temperatura, 15m/s Viento, 48% Humedad", " 25 jun. 2014 - 17:00 Hora Local");
                                            EstadioMaracañaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMaracañaC.InsertarClima("Colombia VS Uruguay SOLEADO, 26°C Temperatura, 15m/s Viento, 74% Humedad", " 28 jun. 2014 - 17:00 Hora Local");
                                            EstadioMaracañaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMaracañaC.InsertarClima("Francia VS Alemania SOLEADO, 26°C Temperatura, 8m/s Viento, 88% Humedad", " 04 jul. 2014 - 13:00 Hora Local");
                                            EstadioMaracañaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioMaracañaC.InsertarClima("Alemania VS Argentina PARCIALMENTE NUBOSO, 23°C Temperatura,11m/s Viento, 65% Humedad", " 13 jul. 2014 - 16:00 Hora Local");
                                            EstadioMaracañaC.ImprimirClima();
                                            System.out.println("");

                                            break;
                                        case 5:
                                            ListaCalendario EstadioNacionalBrasiliaC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioNacionalBrasiliaC.InsertarClima("Suiza VS Ecuador PARCIALMENTE NUBOSO, 24°C Temperatura, 21m/s Viento, 61% Humedad", " 15 jun. 2014 - 13:00 Hora Local");
                                            EstadioNacionalBrasiliaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioNacionalBrasiliaC.InsertarClima("Colombia VS Costa de Marfil PARCIALMENTE NUBOSO, 26°C Temperatura, 23m/s Viento, 48% Humedad", "19 jun. 2014 - 13:00 Hora Local");
                                            EstadioNacionalBrasiliaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioNacionalBrasiliaC.InsertarClima("Camerún VS Brazil PARCIALMENTE NUBOSO, 24°C Temperatura, 26m/s Viento, 57% Humedad", "23 jun. 2014 - 17:00 Hora Loca");
                                            EstadioNacionalBrasiliaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioNacionalBrasiliaC.InsertarClima("Portugal VS Ghana SOLEADO, 26°C Temperatura, 21m/s Viento, 50% Humedad", " 26 jun. 2014 - 13:00 Hora Local");
                                            EstadioNacionalBrasiliaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioNacionalBrasiliaC.InsertarClima("Francia VS Nigeria SOLEADO, 27°C Temperatura,11m/s Viento, 33% Humedad", " 30 jun. 2014 - 13:00 Hora Local");
                                            EstadioNacionalBrasiliaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioNacionalBrasiliaC.InsertarClima("Argentina  VS Belgica SOLEADO, 26°C Temperatura, 21m/s Viento, 34% Humedad", "05 jul. 2014 - 13:00 Hora Local");
                                            EstadioNacionalBrasiliaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioNacionalBrasiliaC.InsertarClima("Brasil VS Holanda PARCIALMENTE NUBOSO, 26°C Temperatura, 19m/s Viento, 50% Humedad", " 12 jul. 2014 - 17:00 Hora Local");
                                            EstadioNacionalBrasiliaC.ImprimirClima();
                                            System.out.println("");
                                            break;
                                        case 6:
                                            ListaCalendario EstadioCastelaoC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioCastelaoC.InsertarClima(" Uruaguay VS Costa Rica PARCIALMENTE NUBOSO, 30°C Temperatura, 19m/s Viento, 58% Humedad", " 14 jun. 2014 - 16:00 Hora Local");
                                            EstadioCastelaoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioCastelaoC.InsertarClima(" Brazil VS Mexico NUBOSO, 28°C Temperatura, 27m/s Viento, 66% Humedad", " 17 jun. 2014 - 16:00 Hora Local");
                                            EstadioCastelaoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioCastelaoC.InsertarClima(" Alemania VS Ghana PARCIALMENTE NUBOSO, 29°C Temperatura, 19m/s Viento, 61% Humedad", " 21 jun. 2014 - 16:00 Hora Local");
                                            EstadioCastelaoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioCastelaoC.InsertarClima(" Grecia VS Costa De Marfil SOLEADO, 29°C Temperatura, 27m/s Viento, 58% Humedad", " 24 jun. 2014 - 17:00 Hora Local");
                                            EstadioCastelaoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioCastelaoC.InsertarClima("Holanda VS Mexico PARCIALMENTE NUBOSO, 32°C Temperatura, 21m/s Viento, 68% Humedad", " 29 jun. 2014 - 13:00 Hora Local");
                                            EstadioCastelaoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioCastelaoC.InsertarClima(" Brazil VS Colombia PARCIALMENTE NUBOSO, 29°C Temperatura, 21m/s Viento, 51% Humedad", " 04 jul. 2014 - 17:00 Hora Local");
                                            EstadioCastelaoC.ImprimirClima();
                                            System.out.println("");
                                            break;

                                        case 7:
                                            ListaCalendario EstadioBeiraRioC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioBeiraRioC.InsertarClima("Francia VS Honduras NUBOSO, 18°C Temperatura, 19m/s Viento, 78% Humedad", " 15 jun. 2014 - 16:00 Hora Local");
                                            EstadioBeiraRioC.ImprimirClima();
                                            System.out.println("");

                                            EstadioBeiraRioC.InsertarClima("Australia VS Holanda PARCIALMENTE NUBOSO, 14°C Temperatura, 15m/s Viento, 65% Humedad", " 18 jun. 2014 - 13:00 Hora Local");
                                            EstadioBeiraRioC.ImprimirClima();
                                            System.out.println("");

                                            EstadioBeiraRioC.InsertarClima("Republica de Korea VS Argelia SOLEADO, 21°C Temperatura, 5m/s Viento, 57% Humedad", " 22 jun. 2014 - 16:00 Hora Local");
                                            EstadioBeiraRioC.ImprimirClima();
                                            System.out.println("");

                                            EstadioBeiraRioC.InsertarClima("Nigeria VS Argentina NUBOSO, 20°C Temperatura, 6m/s Viento, 87% Humedad", "25 jun. 2014 - 13:00 Hora Local");
                                            EstadioBeiraRioC.ImprimirClima();
                                            System.out.println("");

                                            EstadioBeiraRioC.InsertarClima("Alemania VS Argelia  NUBOSO, 14°C Temperatura, 21m/s Viento, 93% Humedad", " 30 jun. 2014 - 17:00 Hora Local");
                                            EstadioBeiraRioC.ImprimirClima();
                                            System.out.println("");

                                            break;
                                        case 8:
                                            ListaCalendario EstadioFonteaArenaNovaC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioFonteaArenaNovaC.InsertarClima("España VS Holanda NOCHE PARCIALMENTE NUBOSO, 27°C Temperatura, 12m/s Viento, 87% Humedad", " 13 jun. 2014 - 16:00 Hora Local");
                                            EstadioFonteaArenaNovaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioFonteaArenaNovaC.InsertarClima("Alemania VS Portugal PARCIALMENTE NUBOSO, 26°C Temperatura, 13m/s Viento, 79% Humedad", " 16 jun. 2014 - 13:00 Hora Local");
                                            EstadioFonteaArenaNovaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioFonteaArenaNovaC.InsertarClima("Suiza VS Francia PARCIALMENTE NUBOSO, 26°C Temperatura, 12m/s Viento, 69% Humedad", " 20 jun. 2014 - 16:00 Hora Local");
                                            EstadioFonteaArenaNovaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioFonteaArenaNovaC.InsertarClima("Boznia Y Herzegovina VS Irán NUBOSO, 25°C Temperatura, 10m/s Viento, 76% Humedad", "25 jun. 2014 - 13:00 Hora Local");
                                            EstadioFonteaArenaNovaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioFonteaArenaNovaC.InsertarClima("Belgica VS USA PARCIALMENTE NUBOSO, 26°C Temperatura, 10m/s Viento, 86% Humedad", " 01 jul. 2014 - 17:00 Hora Local");
                                            EstadioFonteaArenaNovaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioFonteaArenaNovaC.InsertarClima("Holanda VS Costa Rica PARCIALMENTE NUBOSO, 26°C Temperatura, 11m/s Viento, 81% Humedad", " 05 jul. 2014 - 17:00 Hora Local");
                                            EstadioFonteaArenaNovaC.ImprimirClima();
                                            System.out.println("");
                                            break;
                                        case 9:
                                            ListaCalendario EstadioArenaPantanalC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioArenaPantanalC.InsertarClima("Chile VS Australia NOCHE CON CIELO DESPEJADO, 29°C Temperatura, 14m/s Viento, 55% Humedad", " 13 jun. 2014 - 18:00 Hora Local");
                                            EstadioArenaPantanalC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaPantanalC.InsertarClima("Rusia VS Republica de Korea NOCHE CON CIELO DESPEJADO, 26°C Temperatura, 20m/s Viento, 70% Humedad", " 17 jun. 2014 - 18:00 Hora Local");
                                            EstadioArenaPantanalC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaPantanalC.InsertarClima("Nigeria VS Boznia Y Herzegovina NOCHE CON CIELO DESPEJADO, 29°C Temperatura, 7m/s Viento, 55% Humedad", " 21 jun. 2014 - 18:00 Hora Local");
                                            EstadioArenaPantanalC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaPantanalC.InsertarClima(" Japón VS Colombia SOLEADO , 31°C Temperatura, 10m/s Viento, 30% Humedad", " 24 jun. 2014 - 16:00 Hora Local");
                                            EstadioArenaPantanalC.ImprimirClima();
                                            System.out.println("");


                                            break;
                                        case 10:
                                            ListaCalendario EstadioArenaAmazoniaC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioArenaAmazoniaC.InsertarClima("Inglaterra VS Italia --, --°C Temperatura, --m/s Viento, --% Humedad", "14 jun. 2014 - 18:00 Hora Local");
                                            EstadioArenaAmazoniaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaAmazoniaC.InsertarClima("Camerún VS Croacia LLUVIA, 27°C Temperatura, 6m/s Viento, 86% Humedad", " 18 jun. 2014 - 18:00 Hora Local");
                                            EstadioArenaAmazoniaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaAmazoniaC.InsertarClima("USA VS Portugal NOCHE CON CIELO DESPEJADO, 30°C Temperatura, 8m/s Viento, 66% Humedad", " 22 jun. 2014 - 18:00 Hora Local");
                                            EstadioArenaAmazoniaC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaAmazoniaC.InsertarClima("Honduras VS Suiza NUBOSO, 26°C Temperatura, 8m/s Viento, 88% Humedad", " 25 jun. 2014 - 16:00 Hora Local");
                                            EstadioArenaAmazoniaC.ImprimirClima();
                                            System.out.println("");


                                            break;

                                        case 11:
                                            ListaCalendario EstadioArenaPernambucoC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioArenaPernambucoC.InsertarClima("Costa de Marfil VS Japón LLUVIA, 26°C Temperatura, 10m/s Viento, 77% Humedad", " 14 jun. 2014 - 22:00 Hora Local");
                                            EstadioArenaPernambucoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaPernambucoC.InsertarClima("Italia VS Costa Rica PARCIALMENTE NUBOSO, 29°C Temperatura, 15m/s Viento, 70% Humedad", "20 jun. 2014 - 13:00 Hora Local");
                                            EstadioArenaPernambucoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaPernambucoC.InsertarClima("Croacia VS Mexico NUBOSO, 26°C Temperatura, 16m/s Viento, 82% Humedad", " 23 jun. 2014 - 17:00 Hora Local");
                                            EstadioArenaPernambucoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaPernambucoC.InsertarClima("USA VS Alemania LLUVIA, 27°C Temperatura, 12m/s Viento, 79% Humedad", " 26 jun. 2014 - 13:00 Hora Locall");
                                            EstadioArenaPernambucoC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenaPernambucoC.InsertarClima("Costa Rica VS Grecia PARCIALMENTE NUBOSO, 28°C Temperatura, 14m/s Viento, 73% Humedad", " 29 jun. 2014 - 17:00 Hora Local");
                                            EstadioArenaPernambucoC.ImprimirClima();
                                            System.out.println("");
                                            break;

                                        case 12:
                                            ListaCalendario EstadioArenadeSãoPauloC = new ListaCalendario();
                                            System.out.println("Calendario de los Estadios con su informacion de climas respectiva.");

                                            EstadioArenadeSãoPauloC.InsertarClima("Brazil VS Croacia SOLEADO, 24°C Temperatura, 8m/s Viento, 63% Humedad", " 12 jun. 2014 - 17:00 Hora Local");
                                            EstadioArenadeSãoPauloC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenadeSãoPauloC.InsertarClima("Uruguay VS Inglaterra NUBOSO, 12°C Temperatura, 18m/s Viento, 77% Humedad", " 19 jun. 2014 - 16:00 Hora Loca");
                                            EstadioArenadeSãoPauloC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenadeSãoPauloC.InsertarClima("Holanda VS Chile PARCIALMENTE NUBOSO, 20°C Temperatura, 6m/s Viento, 53% Humedad", " 23 jun. 2014 - 13:00 Hora Local");
                                            EstadioArenadeSãoPauloC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenadeSãoPauloC.InsertarClima("Republica de Korea VS Bélgica SOLEADO, 24°C Temperatura, 12m/s Viento, 46% Humedad", " 26 jun. 2014 - 17:00 Hora Local");
                                            EstadioArenadeSãoPauloC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenadeSãoPauloC.InsertarClima("Argentina VS Suiza SOLEADO, 23°C Temperatura, 11m/s Viento, 30% Humedad", " 01 jul. 2014 - 13:00 Hora Local");
                                            EstadioArenadeSãoPauloC.ImprimirClima();
                                            System.out.println("");

                                            EstadioArenadeSãoPauloC.InsertarClima("Holanda VS Argentina NUBOSO, 15°C Temperatura, 10m/s Viento, 79% Humedad", " 09 jul. 2014 - 17:00 Hora Local");
                                            EstadioArenadeSãoPauloC.ImprimirClima();
                                            System.out.println("");
                                            break;
                                    }



                                    System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);
                                } while (c == 'S' || c == 's');

                                break;
                        }

                        System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                    } while (c == 'S' || c == 's');
                    break;
                case 4:

                    do {

                        System.out.println(" SUBMENU DE FECHAS"
                                + "\n PRIMERA VUELTA"
                                + "\n1:   fecha 1."
                                + "\n2:   fecha 2."
                                + "\n3:   fecha 3."
                                + "\n4:   fecha 4."
                                + "\n5:   fecha 5."
                                + "\n6:   fecha 6."
                                + "\n7:   fecha 7."
                                + "\n8:   fecha 8."
                                + "\n9:   fecha 9."
                                + "\n10:  fecha 10."
                                + "\n11:  fecha 11."
                                + "\n12:  fecha 12."
                                + "\n13:  fecha 13."
                                + "\n14:  fecha 14."
                                + "\n15:  fecha 15."
                                + "\n OCTAVOS"
                                + "\n16:  fecha 16."
                                + "\n17:  fecha 17."
                                + "\n18:  fecha 18."
                                + "\n19:  fecha 19."
                                + "\n CUARTOS DE FINAL"
                                + "\n20:  fecha 20."
                                + "\n21:  fecha 21."
                                + "\n SEMIFINALES "
                                + "\n22:  fecha 22."
                                + "\n23:  fecha 23."
                                + "\n DISPUTA POR TERCER LUGAR Y FINAL"
                                + "\n24: fecha 24"
                                + "\n25:  fecha 25.");

                        opcion = Integer.parseInt(teclado.nextLine());

                        switch (opcion) {
                            case 1:

                                primerPartido.Imprimir();
                                break;
                            case 2:

                                segundoPartido.Imprimir();
                                break;
                            case 3:

                                tercPartido.Imprimir();
                                break;
                            case 4:
                                ;
                                cuarPartido.Imprimir();
                                break;
                            case 5:

                                ciPartido.Imprimir();
                                break;
                            case 6:

                                sixPartido.Imprimir();
                                break;
                            case 7:

                                sevPartido.Imprimir();
                                break;
                            case 8:

                                octPartido.Imprimir();
                                break;
                            case 9:

                                ninPartido.Imprimir();
                                break;
                            case 10:

                                tenPartido.Imprimir();
                                break;
                            case 11:

                                oncPartido.Imprimir();
                                break;
                            case 12:

                                docPartido.Imprimir();
                                break;
                            case 13:
                                trecPartido.Imprimir();
                                break;
                            case 14:

                                catPartido.Imprimir();
                                break;
                            case 15:

                                quiPartido.Imprimir();
                                break;
                            case 16:

                                diePartido.Imprimir();
                                break;
                            case 17:


                                diesPartido.Imprimir();
                                break;
                            case 18:

                                dieocPartido.Imprimir();
                                break;
                            case 19:

                                dienuPartido.Imprimir();
                                break;
                            case 20:

                                vePartido.Imprimir();
                                break;
                            case 21:

                                veunoPartido.Imprimir();
                                break;
                            case 22:

                                vedosPartido.Imprimir();
                                break;
                            case 23:

                                vetresPartido.Imprimir();
                                break;
                            case 24:

                                vecuaPartido.Imprimir();
                                break;
                            case 25:

                                vecinqPartido.Imprimir();
                                System.out.println("Alemania Ganador");
                                break;

                        }
                        System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                    } while (c == 'S' || c == 's');
                    break;

            }
            System.out.println("Desea continuar con otra operacion de la Lista  S/N :  ");
            c = teclado.nextLine().charAt(0);
        } while (c == 'S' || c == 's');
    }
}
