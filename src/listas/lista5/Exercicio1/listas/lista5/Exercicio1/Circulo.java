package listas.lista5.Exercicio1;

public class Circulo extends FormaGeometrica{
    

    @Override
    public void calcularArea(Float... raio){
        this.area=(raio[0]*raio[0])*3;
    }

    @Override
    public void calcularPerimetro (Float... raio){
        this.perimetro=2*3*raio[0];
    }
}
