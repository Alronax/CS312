public class Document{
  private String titre;
  private int numero;

  public Document(String title, int num){
    titre = title;
    numero = num;
  }

  public String getTitre(){
    return titre;
  }

  public int getNumero(){
    return numero;
  }

  public String toString(){
    return "titre : " + titre + ", numero : " + numero;
  }
}
