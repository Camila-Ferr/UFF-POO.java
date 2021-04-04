package listas.lista3.Exercicio3.Exercício4.Ex3Ex4Lista3;
public class Porta {
  private String cor;
  private float largura;
  private float altura;
  private boolean status;
  
  Porta (boolean status ){
    this.status=status;

  }

  public boolean getStatus() {
    return this.status;
  }

  void setStatus (){
    this.status=!status;
  }
}
