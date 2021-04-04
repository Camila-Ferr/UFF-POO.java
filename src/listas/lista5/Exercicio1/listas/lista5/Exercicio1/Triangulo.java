package listas.lista5.Exercicio1;
public class Triangulo extends FormaGeometrica{
    
    @Override
    public void calcularArea(Float... medida){
        this.area=(medida[0]*medida[1])/2;
    }
    
    @Override
    public void calcularPerimetro (Float... lado){
        this.perimetro=lado[0]+lado[1]+lado[2];

    }
        
        
    }
