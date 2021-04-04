package listas.lista5.Exercicio1;
public abstract class FormaGeometrica {
    float area;
    float perimetro;

    public float getArea(Float... medida){
        calcularArea(medida);
        return area;
    }

    public float getPerimetro(Float...medida){
        calcularPerimetro(medida);
        return perimetro;
    }
    
    void calcularArea(Float... medida){
        
    }
    void calcularPerimetro(Float... medida){

    }
}