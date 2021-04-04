package listas.lista5.Exercicio1;

public class Retangulo extends FormaGeometrica {
    
    @Override
    void calcularArea(Float... lado){
        this.area=(lado[0]* lado[1]);
    }

    @Override
    void calcularPerimetro(Float... lado){
        this.perimetro=(lado[0]*2 + lado[1]*2);
    }
}
