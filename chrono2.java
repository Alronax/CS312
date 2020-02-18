public class chrono2 {
  private int nbSeconds;

  public chrono2(){
    nbSeconds = 0;
  }

  public int getHeures(){
    return nbSeconds / 3600;
  }

  public int getMinutes(){
    return nbSeconds / 60 % 60;
  }

  public int getSeconds(){
    return nbSeconds % 60;
  }

  public void setHeures(int h){
      nbSeconds += h * 3600;
  }

  public void setMinutes(int min){
      nbSeconds += min * 60;
  }

  public void setSeconds(int sec){
      nbSeconds += sec;
  }

  public void rebours(int s) {
    nbSeconds -= s;
  }
}
