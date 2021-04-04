package listas.lista4.Exercicio5.Ex5Lista4;

class Juridica extends Contato {

    private String CNPJ;
    private double Faturamento;

    Juridica(String razaoSocial, String CNPJ, String endereco, double Faturamento) {
        super(2, razaoSocial,endereco);
        this.CNPJ=CNPJ;
        this.Faturamento=Faturamento;
    }
    @Override
    void printaC(){
        super.printaContato();
        System.out.println(this.CNPJ);
        System.out.println("Faturamento Mensal =" +this.Faturamento);
        System.out.println("Endereço =" +this.getEndereco());
    }
    @Override
    void procuraC (String busca){
        if (this.CNPJ.equals(busca)){
            printaC();
        }
    }
}
