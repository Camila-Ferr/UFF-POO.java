import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n;
    n=100;
    Casa novaCasa=new Casa();
    Scanner teclado =new Scanner (System.in);

    System.out.println("Digite a cor da casa:");
    novaCasa.cor=teclado.next();
        
    for (int a=0; a<=2; a++){
      Porta porta= new Porta ();
      recebePorta(porta,a);
      novaCasa.adicionar(porta);
    }
    while (n!=0){
      System.out.println("Digite o número da porta para abri-lá ou fecha-lá"); 
      System.out.println("Digite 4 para ver como estão suas portas");
      System.out.println("Digite 0 para fechar o programa.");
      System.out.println("");
      n=teclado.nextInt();

      if ((n==1)||(n==2)||(n==3)){
        novaCasa.mudarStatus(n);
      }

      else if (n==4){
        novaCasa.quantasPortasEstaoAbertas();
      }     
    }
    novaCasa.quantasPortasEstaoAbertas();
  }

  static void recebePorta (Porta porta, int a){
    Scanner teclado =new Scanner (System.in);
    int p;
    System.out.println("Digite 1 se a porta " +(a+1) +" está aberta e 2 se a porta está fechada");
    p=teclado.nextInt();
  
    if (p==1){
      porta.status=true;
    }
    else if (p==2){
      porta.status=false;
    }
    else {
      System.out.println("Erro");
    }
  }
}