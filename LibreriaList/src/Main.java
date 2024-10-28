import Mensola.Libro;
import Screen.FrontEnd;

import static Utility.Tools.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] opzioni = {"menu", "Inserimento", "Visualizzazione", "Elimina", "Esci"};   //opzioni del menù
        ArrayList<Libro> mensola = new ArrayList<Libro>();  //lista di libri
        String titolo;
        Scanner tastiera = new Scanner(System.in);
        Boolean exit = true;
        do{
            switch(Menu(opzioni,tastiera))
            {
                case 1 ->{System.out.println("Inserimento");FrontEnd.Inserimento(mensola);}
                case 2 ->{System.out.println("Visualizzazione");FrontEnd.Visualizzazione(mensola);}
                case 3 ->{System.out.println("Elimina");
                    System.out.println("inserisci il titolo del libro che vuoi eliminare");
                    titolo = tastiera.nextLine();
                    FrontEnd.Elimina(mensola,titolo);}
                case 4 ->{exit = false;}
                }

        }while(exit);
    }
}