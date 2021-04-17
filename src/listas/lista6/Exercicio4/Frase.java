package listas.lista6.Exercicio4;

import java.util.*;

public class Frase {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        ArrayList<String>palavras=new ArrayList<>();
        Map<String,Integer> mapPalavras=new HashMap<String, Integer>();
        String[] frase;
        int cont;

        System.out.println("Digite uma frase:");
        frase=teclado.nextLine().split(" ");

        for (int a=0; a< frase.length; a++){
            frase[a]=frase[a].toLowerCase();
            palavras.add(frase[a]);
        }

        for (String percorre : palavras){
            if (mapPalavras.get(percorre)==null){
                cont=0;
            }
            else {
                cont= mapPalavras.get(percorre);
            }
            mapPalavras.put(percorre,cont+1);
        }
        for (Map.Entry<String,Integer> palavra : mapPalavras.entrySet()){
            System.out.println("Palavra = " + palavra.getKey());
            System.out.println("Frequência = " + palavra.getValue());
            System.out.println();
        }

    }
}

