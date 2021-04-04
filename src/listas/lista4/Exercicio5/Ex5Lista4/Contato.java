package Ex5Lista4;
class Contato {
    private String nome;
    private int Tipo;
    private String endereco;


    Contato (int Tipo, String nome, String endereco){
        this.Tipo=Tipo;
        this.nome=nome;
        this.endereco=endereco;

    }

    public int getTipo() {
        return Tipo;
    }


    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }
    void printaC (){
        
    }
    void procuraC (String busca){

    }

    void printaContato(){
        System.out.println(this.nome);
        if (this.Tipo==1){
            System.out.println("Pessoa física");
        }
        if (this.Tipo==2){
            System.out.println("Pessoa jurídica");
        }
    }
    
    
}
