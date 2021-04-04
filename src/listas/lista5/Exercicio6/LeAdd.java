package listas.lista5.Exercicio6;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LeAdd {
    public static void main (String[] args) throws IOException {
        ArrayList<Info> infos = new ArrayList<>();
        InputStream input = new FileInputStream("src/listas/lista5/Exercicio6/arq.txt");
        Scanner teclado =new Scanner(System.in);
        boolean t = true;
        int n;
        while (t) {


            System.out.println("Digite 1 para ver as informações presentes no arquivo.");
            System.out.println("Digite 2 para adicionar novas informações.");
            System.out.println("Digite 3 para finalizar o programa");
            System.out.println(" ");
            n=teclado.nextInt();

            if (n==1){
                Scanner arq = new Scanner(input);
                while (arq.hasNextLine()) {
                    Info day = new Info(arq.nextInt(), arq.nextDouble(), arq.nextDouble(), arq.nextInt());
                    infos.add(day);
                }
                for (Info percorre : infos) {
                    percorre.printaInfo();

                }
            }
            if (n==2){
                Scanner in =new Scanner(System.in);
                System.out.println("A seguir, digite:");
                System.out.println("O dia, a temperatura máxima, a temperatura mínima, o nível de pluviosidade.");
                FileWriter escreve = new FileWriter("src/listas/lista5/Exercicio6/arq.txt",true);
                escreve.write("\n");
                escreve.write(in.nextLine());
                escreve.close();
                System.out.println(" ");
            }
            if (n==3){
                t=false;
            }

        }
    }
}

