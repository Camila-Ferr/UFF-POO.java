package Ex6Lista4;
public class Planta extends Pokemon {
    Planta (String nome){
        super(nome, 100,1);
        Ataque Ainicial=new Ataque(20, "Soltar raizes",1,1);
        this.ataques[0]=Ainicial;
        Defesa Dinicial=new Defesa("Plantas protetoras",1,1);
        this.defesas[0]=Dinicial;
    }
    

    @Override
    void evoluir (int nivel){
        setNivel(nivel);
        setHP(nivel*100);

        Defesa Nivel2=new Defesa("Enrolar nas raízes",2,1);
        Defesa Nivel3=new Defesa("Coroa de Plantas",3,1);
        Ataque Nivel4=new Ataque(60, "Plantas venenozas",4,1);
        Ataque Nivel4Es=new Ataque(100, "Salgueiro Lutador",4,2);

        if (nivel==2){
            this.defesas[1]=Nivel2;
        }
        if (nivel==3){
            this.defesas[2]=Nivel3;
        }
        if (nivel==4){
            this.ataques[1]=Nivel4;
            this.ataques[2]=Nivel4Es;

        }


    }

    
}
