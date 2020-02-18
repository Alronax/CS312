public class Fraction{
  private int denominateur;
  private int numerateur;

  public int getDenominateur(){
    return denominateur;
  }

  public int getNumerateur(){
    return numerateur;
  }

  public void setDenominateur(int den){
    denominateur = den;
  }

  public void setNumerateur(int num){
    numerateur = num;
  }

  public void add(int nb){
    numerateur += nb*denominateur;
  }

  public void sub(int nb){
    numerateur -= nb*denominateur;
  }

  public void mult(int nb){
    numerateur *= nb;
  }

  private int pgcd(int x, int y) {
      int r = 0;
      while(y != 0) {
          r = x % y;
          x = y;
          y = r;
      }
      return x;
  }

  public void reduire(){
    int pgcd = pgcd(numerateur,denominateur);
    numerateur /= pgcd;
    denominateur /= pgcd;
  }

  private int ppcm(int x, int y) {
      int p = x * y;
      while(x != y) {
          if(x < y)
              y -= x;
          else
              x -= y;
      }
      return p / x;
  }

  public void addFraction(Fraction frac){
    int ppcm = ppcm(frac.getDenominateur(),denominateur);
    numerateur = numerateur * (denominateur/ppcm) + frac.getNumerateur() * (frac.getDenominateur()/ppcm);
    denominateur = ppcm;
  }

  public void multFraction(Fraction frac){
    numerateur *= frac.getNumerateur();
    denominateur *= frac.getDenominateur();
  }

  public Fraction(int den, int num) {
    denominateur = den;
    numerateur = num;
  }
}
