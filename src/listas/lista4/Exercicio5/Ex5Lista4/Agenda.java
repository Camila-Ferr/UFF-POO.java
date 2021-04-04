package listas.lista4.Exercicio5.Ex5Lista4;

import java.util.Scanner;

class Agenda {
    public static void main(String[] args) {
        boolean n;
        int p;
        
        Scanner teclado =new Scanner (System.in);
        n=true;
        Contato[] lista= new Contato[100];
        int tamanho=0;
        String busca;
        
        while (n){
            System.out.println("Digite 1 para adicionar um contato Físico.");
            System.out.println("Digite 2 para adicionar um contato Jurídico.");
            System.out.println("Digite 3 para ver sua agenda.");
            System.out.println("Digite 4 para buscar um contato.");
            System.out.println();
            p=teclado.nextInt();
            if (p==1){
                System.out.println("Digite o nome, o CPF, o endereço e o aniversário.");
                Fisica primeiro= new Fisica (teclado.next(),teclado.next(),teclado.next(),teclado.next());
                lista[tamanho]=primeiro;
                tamanho=tamanho+1;
                
            }
            else if (p==2){
                System.out.println("Digite a razão social, o CNPJ, o endereço e o faturamento da empresa.");
                Juridica segundo= new Juridica (teclado.next(),teclado.next(),teclado.next(),teclado.nextDouble());
                lista[tamanho]=segundo;
                tamanho=tamanho+1;

            }
            else if (p==3){
                for (Contato percorre: lista){
                    if (percorre==null){
                        break;
                    }
                        percorre.printaC();
                        System.out.println();
                }
            }
            else if (p==4){
                System.out.println("Digite o número do CPF/CNPJ:");
                busca=teclado.next();
                for (Contato percorre: lista){
                    if (percorre==null){
                        break;
                    }
                    percorre.procuraC (busca);
                    System.out.println();
                }
            }
            else{
                break;
            }

        }

    }
}

