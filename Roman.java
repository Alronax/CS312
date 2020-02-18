public class Roman extends Livre{
  private int Goncourt;
  private int Medicis;
  private int Interallie;

  public Roman(String title, int num, String aut, int pag, int G, int M, int I){
    super(String title, int num, String aut, int pag);
    Goncourt = G;
    Medicis = M;
    Interallie = I;
  }

  public Int getGoncourt(){
    return Goncourt;
  }

  public Int getMedicis(){
    return Medicis;
  }

  public Int getInterallie(){
    return Interallie;
  }

  public String toString(){
    return " Goncourt : " + Goncourt + ", Medicis : " + Medicis + ", Interallie : " + Interallie;
  }
}
