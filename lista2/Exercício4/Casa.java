public class Casa {
  String cor;
  Porta[] lista= new Porta[3];
  int indice=0;
      
  void adicionar (Porta porta){
    lista[indice]=porta;
    indice=indice+1;
  }
  
  void mudarStatus (int n){
    lista[n-1].status=! lista[n-1].status;
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
    if (lista[a].status){
      System.out.println("A porta " +(a+1) +" está aberta.");
      return true;
    }
    System.out.println("A porta " +(a+1) +" está fechada.");
    return false;
  }
  }