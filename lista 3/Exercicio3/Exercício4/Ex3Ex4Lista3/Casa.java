package Ex3Ex4Lista3;

public class Casa {
  private String cor;
  private Porta[] lista= new Porta[3];
  int indice=0;
  
  public String getCorCasa() {
    return this.cor;
  }

  public String getCor() {
    return this.cor;
  }
  
  Casa (String cor){
    this.cor=cor;
  }


  void adicionar (Porta porta){
    lista[indice]=porta;
    indice=indice+1;
  }
  
  void mudarStatus (int n){
    lista[n-1].setStatus();
  }
    
  void quantasPortasEstaoAbertas () {
    int aberta=0;
    for (int a=0; a<=2; a++){
      if (estaAberta(a)){;
        aberta=aberta+1;
      }
    }
    System.out.println(" ");
    System.out.println("Portas abertas: " +aberta);
  }
  
  boolean estaAberta(int a) {
       
    if (lista[a].getStatus()){
      System.out.println("A porta " +(a+1) +" está aberta.");
      return true;
    }
    System.out.println("A porta " +(a+1) +" está fechada.");
    return false;
  }
  }