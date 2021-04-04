package listas.lista4.Exercicio6.Ex6Lista4;
public class Ataque {

    private float dano;
    private String efeito;
    private int nivel;
    private String StatsDeAtaque;

    Ataque (float dano, String efeito, int nivel, int nivel_de_dificuldade){
        this.dano=dano;
        this.efeito=efeito;
        this.nivel=nivel;
        if (nivel_de_dificuldade==1){
            StatsDeAtaque="Atk";
        }
        if (nivel_de_dificuldade==2){
            StatsDeAtaque="SpAtk";
        }
    }
    public float getDano() {
        return dano;
    }
    public String getEfeito() {
        return efeito;
    }
    public int getNivel() {
        return nivel;
    }
    public String getStatsDeAtaque() {
        return StatsDeAtaque;
    }

    public void atacar (){

    }

    public void mostrarAtaque(){
        System.out.println(this.efeito);
        System.out.println("Nível do ataque : " +nivel);
        System.out.println("Dano : " +dano);
        System.out.println(StatsDeAtaque);

    }
}
