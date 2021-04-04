package listas.lista4.Exercicio9.Lista4Ex9;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Soma {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        List<FiguraGeometrica<Float>> areas= new ArrayList<>();
        int n;
        float medida1,medida2, medida3, medida4, soma;
        boolean t=true;
        soma=0;

        while (t != false){
            System.out.println("Digite 1 para adicionar um quadrado.");
            System.out.println("Digite 2 para adicionar um retângulo.");
            System.out.println("Digite 3 para adicionar um triângulo.");
            System.out.println("Digite 4 para adicionar um círculo.");
            System.out.println("Digite 5 para ver a soma das áreas.");
            System.out.println("Digite 6 para ver a soma dos perímetros.");
            System.out.println("Digite 7 para fechar o programa.");
            System.out.println(" ");
            n=teclado.nextInt();

            if (n==1){
                Quadrado quadrado=new Quadrado();
                System.out.println("Qual é o lado do quadrado?");
                medida1=teclado.nextFloat();
                quadrado.calcularArea(medida1);
                quadrado.calcularPerimetro(medida1);
                areas.add(quadrado);
                System.out.println(" ");
            }
            if (n==2){
                Retangulo retangulo=new Retangulo();
                System.out.println("Digite a base e a altura do retângulo:");
                medida1=teclado.nextFloat();
                medida2=teclado.nextFloat();
                retangulo.calcularArea(medida1,medida2);
                retangulo.calcularPerimetro(medida1,medida2);
                areas.add(retangulo);
                System.out.println(" ");
            }
            if (n==3){
                Triangulo triangulo=new Triangulo();
                System.out.println("Digite a base, a altura e os 2 lados do triângulo:");
                medida1=teclado.nextFloat();
                medida2=teclado.nextFloat();
                medida3=teclado.nextFloat();
                medida4=teclado.nextFloat();
                triangulo.calcularArea(medida1,medida2);
                triangulo.calcularPerimetro(medida1,medida3,medida4);
                areas.add(triangulo);
                System.out.println(" ");
            }
            if (n==4){
                Circulo circulo=new Circulo();
                System.out.println("Digite o raio :");
                medida1=teclado.nextFloat();
                circulo.calcularArea(medida1);
                circulo.calcularPerimetro(medida1);
                areas.add(circulo);
                System.out.println(" ");

            }

            if (n==5){
                for (FiguraGeometrica<Float> percorre : areas){
                    soma=soma+percorre.getArea();
                }
                System.out.println ("A soma das áreas é " +soma +".");
                System.out.println(" ");
                soma=0;
            }

            if (n==6){
                for (FiguraGeometrica<Float> percorre : areas){
                    soma=soma+percorre.getPerimetro();
                }
                System.out.println ("A soma dos perímetros é " +soma +".");
                System.out.println(" ");
                soma=0;
            }

            if (n==7){
                t=false;
            }

        }

    
}
}
