package Screen;

import Mensola.GenereLibro;
import Mensola.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class FrontEnd {
    public static void Inserimento(ArrayList<Libro> mensola) throws Exception
    {
        boolean check = true;
        Scanner tastiera = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Inserisci il titolo del libro");
        libro.Titolo = tastiera.nextLine();
        System.out.println("Inserisci l'autore del libro");
        libro.Autore = tastiera.nextLine();
        System.out.println("Inserisci il numero di pagine del libro");
        libro.NumeroPagine = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci il genere del libro: [1] Romanzo - [2] Thriller - [3] Fantascienza - [4] Horror - [5] Avventura");
        do {
            switch (Integer.parseInt(tastiera.nextLine())) {
                case 1 -> {libro.Genere = GenereLibro.Romanzo;check = false;}

                case 2 -> {libro.Genere = GenereLibro.Thriller;check = false;}

                case 3 -> {libro.Genere = GenereLibro.Fantascienza;check = false;}

                case 4 -> {libro.Genere = GenereLibro.Horror;check = false;}

                case 5 -> {libro.Genere = GenereLibro.Avventura;check = false;}

                default -> {System.out.println("Genere non valido");}
            }
        }while(check);
        mensola.add(libro);
    }
    public static void Visualizzazione(ArrayList<Libro> mensola)
    {
        mensola.forEach(l -> System.out.println(l.toString()));
    }
    public static void Elimina(ArrayList<Libro> mensola, String titolo)
    {
        mensola.removeIf(l -> (l.Titolo.equals(titolo)));
    }
}
