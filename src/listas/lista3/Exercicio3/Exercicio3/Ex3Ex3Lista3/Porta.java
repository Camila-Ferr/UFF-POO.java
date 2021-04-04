package listas.lista3.Exercicio3.Exercicio3.Ex3Ex3Lista3;
public class Porta {
    private String cor;
    private float largura;
    private float altura;
    private boolean status;

    
    Porta (String cor, float largura, float altura, boolean status ){
        this.cor=cor;
        this.largura=largura;
        this.altura=altura;
        this.status=status;

    }

    public String getCor() {
        return this.cor;
    }
    public float getLargura() {
        return this.largura;
    }
    public float getAltura() {
        return this.altura;
    }
    public boolean getStatus() {
        return this.status;
    }

    void setCor(String cor){
        this.cor=cor;
    }

    void setDimensoes (float altura, float largura){
        this.altura=altura;
        this.largura=largura;

    }

    void setStatus (){
        this.status=!status;
    }
}
