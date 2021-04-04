package listas.lista4.Exercicio6.Ex6Lista4;
public class Defesa {

    private String efeito;
    private int nivel;
    String StatsDeDefesa;

    Defesa (String efeito, int nivel, int nivel_de_dificuldade){

        this.efeito=efeito;
        this.nivel=nivel;
        
        if (nivel_de_dificuldade==1){
            StatsDeDefesa="Def";
        }
        if (nivel_de_dificuldade==2){
            StatsDeDefesa="SpDef";
        }
    }

    public String getEfeito() {
        return efeito;
    }
    public int getNivel() {
        return nivel;
    }
    public String getStatsDeDefesa() {
        return StatsDeDefesa;
    }

    public void defender (){

    }

    public void mostrarDefesa(){
            System.out.println(this.efeito);
            System.out.println("Nível da defesa : " +nivel);
            System.out.println(StatsDeDefesa);
    
        }
}
