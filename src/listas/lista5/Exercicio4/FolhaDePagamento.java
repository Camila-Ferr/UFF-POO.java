package listas.lista5.Exercicio4;
import java.util.ArrayList;
import java.util.Scanner;
public class FolhaDePagamento {

    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        ArrayList<Funcionario> funcionarios=new ArrayList<>();
        boolean t=true;
        int n, horas;
        double lucro;
        String nome;
        double soma=0;


        while (t != false){
            System.out.println("Digite 1 para adicionar um funcionário Assalariado.");
            System.out.println("Digite 2 para adicionar um funcionário que ganha por hora.");
            System.out.println("Digite 3 para adicionar um funcionário comissionado.");
            System.out.println("Digite 4 para adicionar um funcionário assalariado comissionado.");
            System.out.println ("Digite 5 para ver a folha de pagamento da empresa:");
            System.out.println("Digite 6 para fechar o programa.");
            System.out.println(" ");
            n=teclado.nextInt();

            if (n==1){
                System.out.println("Digite o nome do funcionário:");
                nome=teclado.next();
                System.out.println("Digite o lucro semanal :");
                lucro=teclado.nextDouble();
                System.out.println("Digite as horas trabalhadas :");
                horas=teclado.nextInt();
                Assalariado assalariado=new Assalariado(horas,lucro,nome);
                funcionarios.add(assalariado);
                System.out.println(" ");
            }
            if (n==2){
                System.out.println("Digite o nome do funcionário:");
                nome=teclado.next();
                System.out.println("Digite o lucro semanal :");
                lucro=teclado.nextDouble();
                System.out.println("Digite as horas trabalhadas :");
                horas=teclado.nextInt();
                PorHora porhora=new PorHora(horas,lucro,nome);
                funcionarios.add(porhora);
                System.out.println(" ");
            }
            if (n==3){
                System.out.println("Digite o nome do funcionário:");
                nome=teclado.next();
                System.out.println("Digite o lucro semanal :");
                lucro=teclado.nextDouble();
                System.out.println("Digite as horas trabalhadas :");
                horas=teclado.nextInt();
                Comissionado comissionado =new Comissionado(horas,lucro,nome);
                funcionarios.add(comissionado);
                System.out.println(" ");
            }
            if (n==4){
                System.out.println("Digite o nome do funcionário:");
                nome=teclado.next();
                System.out.println("Digite o lucro semanal :");
                lucro=teclado.nextDouble();
                System.out.println("Digite as horas trabalhadas :");
                horas=teclado.nextInt();
                AC ac=new AC(horas,lucro,nome);
                funcionarios.add(ac);
                System.out.println(" ");
            }
            if (n==5){
                for (Funcionario percorre : funcionarios ){
                    percorre.calculaSalario();
                    System.out.println ("O funcionário " +percorre.getNome() +" recebe " +percorre.getSalario());
                    soma=percorre.getSalario()+soma;
                    System.out.println(" ");
                }

                System.out.println ("A soma de todos os salários é " +soma +" .");
                System.out.println(" ");
                soma=0;
            }
            if (n==6){
                t=false;
            }


    
        }
    }
}
