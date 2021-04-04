package Ex4Lista4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        float lado;
        Scanner teclado =new Scanner (System.in);
        System.out.println ("Digite 1 para criar um quadrado." );
        System.out.println ("Digite 2 para criar um retângulo." );
        System.out.println ("Digite 3 para criar um triângulo." );
        System.out.println ("Digite 4 para criar um círculo." );
        n=teclado.nextInt();

        if (n==1){
            System.out.println ("Digite o lado:" );
            lado=teclado.nextFloat();
            Quadrado quadrado =new Quadrado(lado,lado);
            System.out.println ("A área é " +quadrado.getArea() +".");
        }
        if (n==2){
            System.out.println ("Digite a base e a altura:" );
            Retangulo retangulo =new Retangulo (teclado.nextFloat(), teclado.nextFloat());
            System.out.println ("A área é " +retangulo.getArea() +".");
        }
        if (n==3){
            System.out.println ("Digite a base e a altura:" );
            Triangulo triangulo =new Triangulo (teclado.nextFloat(), teclado.nextFloat());
            System.out.println ("A área é " +triangulo.getArea() +".");
        }
        if (n==4){
            System.out.println ("Digite o raio:" );
            Circulo circulo =new Circulo(teclado.nextFloat());
            System.out.println ("A área é aproximadamente " +circulo.getArea() +".");
        }

}
    
}
