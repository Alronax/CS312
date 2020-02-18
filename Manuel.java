public class Manuel extends Livre{
  private int niveau;

  public Manuel(String title, int num, String aut, int pag, int niv){
    super(String title, int num, String aut, int pag);
    niveau = niv;
  }

  public Int getNiveau(){
    return niveau;
  }

  public String toString(){
    return " Niveau scolaire : " + niveau;
  }
}
