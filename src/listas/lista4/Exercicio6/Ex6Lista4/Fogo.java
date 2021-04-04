package listas.lista4.Exercicio6.Ex6Lista4;
public class Fogo extends Pokemon{
    Fogo (String nome){
        super(nome, 140,1);
        Ataque Ainicial=new Ataque(40, "Fireball",1,1);
        this.ataques[0]=Ainicial;
        Defesa Dinicial=new Defesa("Escudo de fogo",1,1);
        this.defesas[0]=Dinicial;
    }

    @Override
    void evoluir (int nivel){
        setNivel(nivel);
        setHP(nivel*140);
        Defesa Nivel2=new Defesa("Parede de fogo",2,1);
        Ataque Nivel3=new Ataque (60, "Sopro do dragão",3,1);
        Ataque Nivel4=new Ataque(80, "Fósforo acesso",4,1);
        Ataque Nivel4Es=new Ataque(120, "Fúria do Dragão",4,2);

        if (nivel==2){
            this.defesas[1]=Nivel2;
        }
        if (nivel==3){
            this.ataques[1]=Nivel3;
        }
        if (nivel==4){
            this.ataques[2]=Nivel4;
            this.ataques[3]=Nivel4Es;

        }
    }

    
}
