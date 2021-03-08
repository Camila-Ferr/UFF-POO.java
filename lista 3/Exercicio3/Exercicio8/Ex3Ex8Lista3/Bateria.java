package Ex3Ex8Lista3;
public class Bateria {  
    private int carga;
    private int limite;
    private String[] usado=new String[100];
    private int tamanho=0;

    Bateria (){
        this.carga=100;
        this.limite=100;
    }
    
    public int getCarga() {
        return this.carga;
    }
    public String getUsado(int a) {
        return this.usado[a];
    }
    public int getTamanho() {
        return this.tamanho;
    }

    void setCarga (int carga){
        this.carga=this.carga-carga;
    }

    void setUsado (String usado) {
        this.usado[tamanho]=usado;
        this.tamanho=this.tamanho+1;
    }
}

