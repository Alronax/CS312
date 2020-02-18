public class Livre extends Document{
  private String auteur;
  private int pages;

  public Livre(String title, int num, String aut, int pag){
    super(title, num);
    auteur = aut;
    pages = pag;
  }

  public String getAuteur(){
    return auteur;
  }

  public int getPages(){
    return pages;
  }

  public String toString(){
    return " auteur : " + auteur + ", nombre de pages : " + pages;
  }
}
