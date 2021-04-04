package listas.lista5.Exercicio7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class funcionarios {
    public static void main (String[] args) throws IOException {
        Scanner teclado =new Scanner(System.in);
        boolean t=true;
        int n;

        while (t){
            System.out.println("Digite 1 para ver os funcionários.");
            System.out.println("Digite 2 para adicionar novos funcionários.");
            System.out.println("Digite 3 para finalizar o programa");
            System.out.println(" ");
            n=teclado.nextInt();

            if (n==1){
                try {
                    InputStream input = new FileInputStream("src/listas/lista5/Exercicio7/func.dat");
                    int a;
                    while ((a=input.read())!=-1) {
                        System.out.print((char) a);
                    }
                    input.close();
                    System.out.println();
                    }
                catch (Exception e){
                    System.out.println("Erro");
                }
            }
            if (n==2){
                try {
                    FileOutputStream out =new FileOutputStream("src/listas/lista5/Exercicio7/func.dat",true);
                    BufferedOutputStream w=new BufferedOutputStream(out);
                    Scanner input2=new Scanner(System.in);

                    System.out.println("A seguir, digite:");
                    System.out.println("O registro, o nome do funcionário, o departamento de trabalho e o departamento gerencia.");
                    w.write("\n".getBytes());
                    w.write((input2.nextLine().getBytes()));
                    w.flush();
                    w.close();
                }
                catch (Exception e){
                    System.out.println("Erro");
                }
            }

            if (n==3){
                t=false;
            }
        }
    }
}