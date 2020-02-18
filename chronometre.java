public class chronometre{
  private int heures;
  private int minutes;
  private int secondes;

  public chronometre(){
    heures = 0;
    minutes = 0;
    secondes = 0;
  }

  //signatures
  public int getHeures(){
    return heures;
  }

  public int getMinutes(){
    return minutes;
  }

  public int getSeconds(){
    return secondes;
  }

  public void setHeures(int h){
    heures = h;
  }

  public void setMinutes(int min){
    minutes = min;
  }

  public void setSeconds(int sec){
    secondes = sec;
  }

  public void rebours(int s){
    secondes -= s;
    if (secondes < 0){
      secondes = 60 - java.lang.Math.abs(secondes);
      minutes --;
    }
    if (minutes < 0){
      minutes = 60 - java.lang.Math.abs(minutes);
      heures --;
    }
  }
}
