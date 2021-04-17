package listas.lista6.Exercicio3;

public class Cliente {
    private String nome;
    private int idade;
    private long CPF;

    Cliente(String nome, String idade, String CPF) {
        try {
            this.nome = nome;
            this.idade = Integer.parseInt(idade);
            if (this.idade < 18) {
                throw new IllegalArgumentException("Não é possível criar uma conta com menos de 18 anos.");
            }
            if (this.idade>150){
                throw new IllegalArgumentException("Houve um erro na interpretação da sua idade.");
            }
            this.CPF = Long.parseLong(CPF);
        } catch (NumberFormatException e) {
            System.out.println("Houve um erro no seu cadastro, digite nesse formato:");
            System.out.println("Idade: 00");
            System.out.println("CPF: Somente números");
            System.out.println("");
        }

    }

    public int getIdade() {
        return idade;
    }

    public long getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    void setCPF (String CPF) throws DadoInvalidoException {
        try {
            this.CPF = Long.parseLong(CPF);
        }
        catch (NumberFormatException e){
            throw new DadoInvalidoException();
        }
    }
    void setNome(String nome){
        this.nome=nome;
    }
    void setIdade(String idade) throws DadoInvalidoException {
        try {
            final int temp = Integer.parseInt(idade);
            if (temp < 18) {
                throw new DadoInvalidoException("Não é possível criar uma conta com menos de 18 anos.");
            } else if (temp > 150) {
                throw new DadoInvalidoException("Acredito que você tenha digitado sua idade erroneamente.");
            }
            this.idade = temp;
        } catch (NumberFormatException e) {
            throw new DadoInvalidoException();
        }
    }


    int procuraC (long busca){
        if (this.CPF==busca){
            this.printaC();
            return 1;
        }
        return 0;
    }
    void printaC(){
        System.out.println("Nome=" +this.nome);
        System.out.println("Idade=" +this.idade);
        System.out.println("CPF=" +this.CPF);
        System.out.println("");

    }
}
