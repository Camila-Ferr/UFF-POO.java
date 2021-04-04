package listas.lista4.Exercicio9.Lista4Ex9;
public class Retangulo extends FiguraGeometrica <Float> {
    
    @Override
    void calcularArea(Float... lado){
        this.area=(lado[0]* lado[1]);
    }

    @Override
    void calcularPerimetro(Float... lado){
        this.perimetro=(lado[0]*2 + lado[1]*2);
    }
    
}
