package listas.lista5.Exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        float lado,base,altura,raio;
        Scanner teclado =new Scanner (System.in);
        System.out.println ("Digite 1 para criar um quadrado." );
        System.out.println ("Digite 2 para criar um retângulo." );
        System.out.println ("Digite 3 para criar um triângulo." );
        System.out.println ("Digite 4 para criar um círculo." );
        n=teclado.nextInt();

        if (n==1){
            System.out.println ("Digite o lado:" );
            lado=teclado.nextFloat();
            Quadrado quadrado =new Quadrado();
            System.out.println ("A área é " +quadrado.getArea(lado) +".");
            System.out.println("O perímetro do quadrado é " +quadrado.getPerimetro(lado) +".");
        }
        if (n==2){
            System.out.println ("Digite a base e a altura:" );
            base=teclado.nextFloat();
            altura=teclado.nextFloat();
            Retangulo retangulo =new Retangulo ();
            System.out.println ("A área é " +retangulo.getArea(base,altura) +".");
            System.out.println("O perímetro do retângulo é " +retangulo.getPerimetro(base,altura) +".");
        }
        if (n==3){
            System.out.println ("Digite a base e a altura e um lado:" );
            base=teclado.nextFloat();
            altura=teclado.nextFloat();
            lado=teclado.nextFloat();
            Triangulo triangulo =new Triangulo ();
            System.out.println ("A área é " +triangulo.getArea(base,altura) +".");
            System.out.println("O perímetro do triângulo é " +triangulo.getPerimetro(base,altura,lado) +".");
        }
        if (n==4){
            System.out.println ("Digite o raio:" );
            raio=teclado.nextFloat();
            Circulo circulo =new Circulo();
            System.out.println ("A área é aproximadamente " +circulo.getArea(raio) +".");
            System.out.println("O perímetro do círculo é " +circulo.getPerimetro(raio) +".");
        }

}
    
}
