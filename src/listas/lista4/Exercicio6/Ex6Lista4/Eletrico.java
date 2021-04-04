package listas.lista4.Exercicio6.Ex6Lista4;
public class Eletrico extends Pokemon{
    Eletrico (String nome){
        super(nome, 130,1);
        Ataque Ainicial=new Ataque(40, "Choque elétrico",1,1);
        this.ataques[0]=Ainicial;
        Defesa Dinicial=new Defesa("Corrente protetora",1,1);
        this.defesas[0]=Dinicial;
    }

    @Override
    void evoluir(int nivel){
        setNivel(nivel);
        setHP(nivel*130);
        Defesa Nivel2=new Defesa("Campo Minado",2,1);
        Ataque Nivel3=new Ataque(55,"Raio trovejante",3,1);
        Defesa Nivel4=new Defesa("Campo elétrico",4,1);
        Ataque Nivel4Es=new Ataque(100, "Choque do trovão",4,2);

        if (nivel==2){
            this.defesas[1]=Nivel2;
        }
        if (nivel==3){
            this.ataques[1]=Nivel3;
        }
        if (nivel==4){
            this.defesas[2]=Nivel4;
            this.ataques[2]=Nivel4Es;

        }
    }
}
