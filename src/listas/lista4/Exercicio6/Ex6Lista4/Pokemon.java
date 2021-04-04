package listas.lista4.Exercicio6.Ex6Lista4;
public class Pokemon {
    private String nome;
    private float HP;
    private int nivel;
    Ataque[] ataques= new Ataque[100];
    Defesa[] defesas=new Defesa[100];
    private float XP;

    

    Pokemon (String nome, float HP, int nivel){
        this.HP=HP;
        this.nivel=nivel;
        this.nome=nome;
    }

    Pokemon (float HP){
        this.HP=HP;
    }
    public float getHP() {
        return HP;
    }
    public int getNivel() {
        return nivel;
    }
    public float getXP() {
        return XP;
    }
    public String getNome() {
        return nome;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setHP(float hP) {
        HP = hP;
    }
    

    void evoluir(int nivel){
        //Essa função estará vazia, entretanto, as funções do elétrico, fogo, planta, e água definiram quais são os ataques e defesas que cada pokemon ganha no nível.
    }

    void mostraEvolucao(){
        System.out.println(getNome());
        System.out.println("Nível do Pokemon: " +getNivel());
        System.out.println("Vida: " +getHP());
        System.out.println(" ");
        System.out.println("Ataques: ");
        for (Ataque percorre: ataques){
            if (percorre==null){
                break;
            }
                percorre.mostrarAtaque();
                System.out.println(" ");
        }
        System.out.println("Defesas: ");
        for (Defesa percorre: defesas){
            if (percorre==null){
                break;
            }
                percorre.mostrarDefesa();
                System.out.println(" ");
        }
        

        }
    }
