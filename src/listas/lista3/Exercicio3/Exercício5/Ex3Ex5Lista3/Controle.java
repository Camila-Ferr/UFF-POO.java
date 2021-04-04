package listas.lista3.Exercicio3.Exercício5.Ex3Ex5Lista3;

public class Controle {
    private Boolean estado;
    private Boolean silenciar;
    private int canal;
    private int volume;

    
    Controle (Boolean estado ){
        this.estado=estado;

    }

    Controle (Boolean estado, boolean silenciar, int canal, int volume){
        this.estado=estado;
        this.silenciar=silenciar;
        this.canal=canal;
        this.volume=volume;
    }
    
    public Boolean getEstado() {
        return this.estado;
    }
    public Boolean getSilenciar() {
        return this.silenciar;
    }
    public int getCanal() {
        return this.canal;
    }
    public int getVolume() {
        return this.volume;
    }

    void setEstado (){
        this.estado=!estado;
    }

    void setCanal (int canal){
        this.canal=canal;
    }

    void setVolume (int volume){
        this.volume=volume;
    }
    
    void setSilenciar (){
        this.silenciar=!silenciar;
    }
}
