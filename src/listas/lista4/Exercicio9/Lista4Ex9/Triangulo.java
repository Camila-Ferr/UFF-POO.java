package Lista4Ex9;
public class Triangulo extends FiguraGeometrica<Float> {

    @Override
    public void calcularArea(Float... medida){
        this.area=(medida[0]*medida[1])/2;
    }
    
    @Override
    public void calcularPerimetro (Float... lado){
        this.perimetro=lado[0]+lado[1]+lado[2];

    }
}
