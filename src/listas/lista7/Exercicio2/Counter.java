package listas.lista7.Exercicio2;

public class Counter {
    private int count;

    public Counter(){
        this.count=((int)(Math.random()*3));
    }

    synchronized void increment() {
        if (this.count==3) {
            try {
                while (this.count == 3) {
                    System.out.println("O valor é máximo, não é possível incrementar no momento.");
                    this.wait();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        else if (this.count< 3){
            this.notify();
            this.count += 1;
        }
        Mostrar();

    }
    synchronized void decrement(){
        if (this.count==0) {
            try {
                while (this.count == 0) {
                    System.out.println("O valor é mínimo, não é possível decrementar no momento.");
                    this.wait();
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else if(this.count>0){
            this.notify();
            this.count=0;
        }
        Mostrar();
    }
    void Mostrar(){
        System.out.println("Valor atual : "+this.count);
    }
}
