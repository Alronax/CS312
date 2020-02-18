public class Revue extends Document{
  private int mois;
  private int annee;

  public Revue(String title, int num, int month, int year){
    super(title, num);
    mois = month;
    annee = year;
  }

  public int getAnnee(){
    return annee;
  }

  public int getMois(){
    return mois;
  }

  public String toString(){
    return " mois : " + mois + ", année : " + annee;
  }
}
