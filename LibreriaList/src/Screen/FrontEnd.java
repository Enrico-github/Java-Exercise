package Screen;

import Mensola.GenereLibro;
import Mensola.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class FrontEnd {
    public static void Inserimento(ArrayList<Libro> mensola)
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
                case 1 -> {
                    libro.Genere = GenereLibro.Romanzo;check = false;}
                case 2 -> {
                    libro.Genere = GenereLibro.Thriller;check = false;}
                case 3 -> {
                    libro.Genere = GenereLibro.Fantascienza;check = false;}
                case 4 -> {
                    libro.Genere = GenereLibro.Horror;check = false;
                }
                case 5 -> {
                    libro.Genere = GenereLibro.Avventura;check = false;
                }
                default -> System.out.println("Genere non valido");
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
    public static void ScorriLibri(ArrayList<Libro> mensola, Scanner tastiera) {
        if (mensola.isEmpty()) {
            System.out.println("La mensola è vuota!");
            return;
        }

        System.out.println("Inserisci la posizione iniziale (da 1 a " + mensola.size() + "):");
        int posizione = Integer.parseInt(tastiera.nextLine()) - 1;

        if (posizione < 0 || posizione >= mensola.size()) {
            System.out.println("Posizione non valida.");
            return;
        }

        boolean continua = true;

        while (continua) {
            System.out.println("\nLibro corrente:");
            System.out.println(mensola.get(posizione).toString());

            System.out.println("\n1-Precedente");
            System.out.println("2-Successivo");
            System.out.println("3-Fine");

            int scelta = Integer.parseInt(tastiera.nextLine());

            switch (scelta) {
                case 1 -> {
                    if (posizione > 0) {
                        posizione--;
                    } else {
                        System.out.println("Sei già al primo libro.");
                    }
                }
                case 2 -> {
                    if (posizione < mensola.size() - 1) {
                        posizione++;
                    } else {
                        System.out.println("Sei già all'ultimo libro.");
                    }
                }
                case 3 -> {
                    continua = false;
                    System.out.println("Uscita dal menu di scorrimento.");
                }
                default -> System.out.println("Scelta non valida.");
            }
        }
    }
}
