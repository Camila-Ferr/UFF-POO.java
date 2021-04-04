package listas.lista4.Exercicio5.Ex5Lista4;

class Fisica extends Contato {
    private String CPF;
    private String Aniversario;

    Fisica(String nome, String CPF, String endereco, String Aniversario) {
        super(1, nome,endereco);
        this.CPF=CPF;
        this.Aniversario=Aniversario;
    }
    @Override
    void printaC(){
        super.printaContato();
        System.out.println(this.CPF);
        System.out.println("Aniversário = " +this.Aniversario);
        System.out.println("Endereço =" +this.getEndereco());
    }
    @Override
    void procuraC (String busca){
        if (this.CPF.equals(busca)){
            printaC();
        }
    }


    

    

}
