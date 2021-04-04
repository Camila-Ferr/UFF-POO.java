package listas.lista4.Exercicio9.Lista4Ex9;


public class Quadrado extends Retangulo {
    
    @Override
    void calcularArea(Float... lado){
        super.calcularArea(lado[0],lado[0]);
    }

    @Override
    void calcularPerimetro(Float... lado){
        super.calcularPerimetro(lado[0],lado[0]);
    }

    
}
