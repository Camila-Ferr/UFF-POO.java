package listas.lista7.Exercicio2;

import java.util.Random;

public class MThread extends Thread {

    private int funcao;
    private Counter count;

    MThread( Counter count ,int funcao){
        this.funcao=funcao;
        this.count=count;

    }

    @Override
    public void run(){
        Random gerador = new Random();
        int dormir;
        for (int a=0; a<20; a++){
            if (this.funcao==1){
                try {
                    count.increment();
                    dormir = gerador.nextInt((500));
                    Thread.sleep(dormir);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            else if (this.funcao==2){
                try {
                    count.decrement();
                    dormir=gerador.nextInt(500);
                    Thread.sleep(dormir);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
