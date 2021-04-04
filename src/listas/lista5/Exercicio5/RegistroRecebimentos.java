package listas.lista5.Exercicio5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
class RegistroRecebimentos {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        ArrayList<Recebivel> registros=new ArrayList<>();
        boolean t;
        int n, quantidade, horas;
        double soma;
        soma=0;
        String servico;
        t=true;

        while (t){
            System.out.println("Digite 1 para comprar um produto.");
            System.out.println("Digite 2 para contratar um serviço.");
            System.out.println("Digite 3 para ver o seu subtotal");
            System.out.println("Digite 4 para fechar a compra.");
            System.out.println(" ");
            n=teclado.nextInt();

                if (n==1){
                    int p;
                    System.out.println("Digite 1 para comprar um computador");
                    System.out.println("Digite 2 para comprar um mouse.");
                    System.out.println("Digite 3 para comprar um teclado.");
                    System.out.println("Digite 4 para comprar um notebook.");
                    System.out.println("Digite 5 para comprar peças.");
                    p=teclado.nextInt();
                    System.out.println("Quantos produtos é de seu desejo comprar?");
                    quantidade=teclado.nextInt();

                    if (p==1){                        
                        ItemVenda item1=new ItemVenda("computador", quantidade, 2000);
                        registros.add(item1);
                    }
                    if (p==2){
                        ItemVenda item2=new ItemVenda("mouse", quantidade, 45.50);
                        registros.add(item2);
                    }
                    if (p==3){
                        ItemVenda item3=new ItemVenda("teclado", quantidade, 51.99);
                        registros.add(item3);
                    }
                    if (p==4){ 
                        ItemVenda item4=new ItemVenda("notebook", quantidade, 4000.32);
                        registros.add(item4);
                    }
                    if (p==5){
                        ItemVenda item5=new ItemVenda("peças", quantidade, 30.95);
                        registros.add(item5);
                    }
                    System.out.println(" ");
                }
                if (n==2){
                    System.out.println("Qual é o serviço desejado ?");
                    servico=teclado.next();
                    Random gerador = new Random();
                    horas=gerador.nextInt((6));
                    Servico servico2= new Servico (servico,horas);
                    registros.add(servico2);
                    System.out.println(" ");
                }

                if (n==3){
                    soma=0;
                    for (Recebivel percorre : registros){
                        soma=percorre.totalizarReceita()+soma;
                        percorre.printar();
        
                    }
                    System.out.println("Soma Total = " +soma +".");
                    System.out.println(" ");

                }
                if (n==4){
                    soma=0;
                    for (Recebivel percorre : registros){
                        soma=percorre.totalizarReceita()+soma;
                    }
                    System.out.println("Soma Total = " +soma +".");
                    System.out.println("Seu pedido foi finalizado com sucesso.");
                    System.out.println(" ");

                    t=false;
                }

            }
        

       
        
        
        }
}
