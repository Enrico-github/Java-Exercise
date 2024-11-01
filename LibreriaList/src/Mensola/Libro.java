package Mensola;

public class Libro {
    public String Titolo;
    public String Autore;
    public int NumeroPagine;
    public GenereLibro Genere;
    @Override
    public String toString() {
        return "Titolo: " + Titolo + ", Autore: " + Autore + ", NumeroPagine: " + NumeroPagine;
    }
}
