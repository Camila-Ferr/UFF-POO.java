package listas.lista6.Exercicio5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Conversoes {
    public static void main(String[] args){
        int n=1;
        Scanner teclado=new Scanner(System.in);
        List<String>linicial=new ArrayList<>();
        Set<String>lista2;
        Queue<String>lista3;
        Deque<String>lista4;
        Set<String>lista5;
        
        while (n!=0){
            System.out.print("Escreva uma palavra : ");
            linicial.add(teclado.next());
            System.out.println("Para escrever a próxima, digite 1.");
            System.out.println("Para finalizar o processo, digite 0.");;
            n=teclado.nextInt();
            System.out.println();
        }

        System.out.println("Lista inicial: ");
        System.out.println(linicial.toString());
        System.out.println("");
        
        lista2=new HashSet<>(linicial);
        System.out.println("Lista convertida para HashSet: ");
        System.out.println(lista2.toString());
        System.out.println("");

        lista3 = new PriorityQueue<>(lista2);
        System.out.println("Lista convertida para PriorityQueue: ");
        System.out.println(lista3.toString());
        System.out.println("");

        lista4=new ArrayDeque<>(lista3);
        System.out.println("Lista convertida para ArrayDeque: ");
        System.out.println(lista4.toString());
        System.out.println("");
        
        lista5=new TreeSet<>(lista4);
        System.out.println("Lista convertida para TreeSet: ");
        System.out.println(lista5.toString());
        System.out.println("");



    }
    //O ArrayList vai printar todas as palavras.
    //O HashSet irá printar todas as palavras sem repetições.
    //O Priority Queue definirá suas prioridades calculando o valor de cada String quando não é passado um parametro de prioridade.
    // O TreeSet ordena os elementos independente da ordem passada. A ordenação é feita de acordo com a 'ordem alfabetica.'
    

}
