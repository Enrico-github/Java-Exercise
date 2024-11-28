public class Studente{
  private String nome,cognome;
  private int media,eta;
Public Studente(String nome, String cognome, int media, int eta) throws exception
{
  if(eta<14)
    {
    throw new exception("età non valida");   //l'eccezzione viene sollevata nel costruttore
    }
  this.nome = nome;
  this.cognome = cognome;
  this.media = media;
  this.eta = eta;
}
}
public class Main{
public static void main(String[] args)  //gestisco l'eccezione nel main
{
  try{
    Studente std = new Studente();
  }catch(Exception e)
  {
    System.out.println(e.getMessage());
  }
}
  }
