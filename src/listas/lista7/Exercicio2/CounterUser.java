package listas.lista7.Exercicio2;

public class CounterUser {
    public static void main(String[] args) {

        Counter counter=new Counter();
        MThread t1 = new MThread(counter,1);
        MThread t2 = new MThread(counter,2);
        t1.start();
        t2.start();
    }
}
