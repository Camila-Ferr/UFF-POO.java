package listas.lista4.Exercicio9.Lista4Ex9;
public abstract class FiguraGeometrica <FG>{
    float area;
    float perimetro;

    public float getArea(){
        return area;
    }

    public float getPerimetro(){
        return perimetro;
    }
    
    void calcularArea(FG... medida){
        
    }
    void calcularPerimetro(FG... medida){

    }
}
