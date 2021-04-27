package listas.lista7.Exercicio1;

public class primo extends Thread {
    private static int numerosPrimos;
    private int fim;
    private int inicio;
    private int divisores;
    private int thread;

    primo(int fim,int inicio,int thread){
        this.fim=fim;
        this.inicio=inicio;
        numerosPrimos=0;
        this.thread =thread;
    }
    @Override
    public void run (){
        for (int a=this.inicio; a<=fim; a++){
            this.divisores=0;
            for (int b=1; b<=fim; b++){
                if (a%b==0){
                    this.divisores += 1;

                }
            }
            if (this.divisores==2){
                System.out.println("O número " +a +" é primo.");
                numerosPrimos += 1;
            }
            this.divisores=0;
        }

        System.out.println("Nesse intervalo " +numerosPrimos +" são primos. ");
    }

}
