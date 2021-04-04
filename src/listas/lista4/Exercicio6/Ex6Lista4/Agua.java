package listas.lista4.Exercicio6.Ex6Lista4;
public class Agua extends Pokemon{
    Agua (String nome){
        super(nome, 120,1);
        Ataque Ainicial=new Ataque(20, "Agua furiosa",1,1);
        this.ataques[0]=Ainicial;
        Defesa Dinicial=new Defesa("Parede de água",1,1);
        this.defesas[0]=Dinicial;
    }

    @Override
    void evoluir(int nivel){
        setNivel(nivel);
        setHP(nivel*120);
        Ataque Nivel2=new Ataque (30, "Fúria das Águas",2,1);
        Defesa Nivel3=new Defesa("Redemoinho Defensivo",3,1);
        Ataque Nivel4=new Ataque(60, "Ondas Explosivas",4,1);
        Defesa Nivel4Es=new Defesa("Ondas trovejantes",4,2);

        if (nivel==2){
            this.ataques[1]=Nivel2;
        }
        if (nivel==3){
            this.defesas[1]=Nivel3;
        }
        if (nivel==4){
            this.ataques[2]=Nivel4;
            this.defesas[2]=Nivel4Es;

        }
    }
}
