public class Studente
{
  private String nome;
  private String cognome;
  private double media;
  private int matricola;

  public Studente(String nome)
  {
    this.nome = nome;
  }
  public Studente(String nome, String cognome)
  {
    this.nome = nome;
    this.cognome = cognome;
  }
  public String getNome()
  {
    return nome;
  }
  public void setNome(String nome)
  {
    this.nome = nome;
  }
  public String getCognome()
  {
    return cognome;
  }
  public void setCognome(String cognome)
  {
    this.cognome = cognome;
  }
}

public class Main
{
  public int Main(int argc, char *argv[])
  {
    Studente std1 = new Studente("Enrico");
    Studente std2 = new Studente("Enrico", "Prearo")
  }
}
