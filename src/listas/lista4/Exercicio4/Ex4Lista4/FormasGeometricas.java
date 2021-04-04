package listas.lista4.Exercicio4.Ex4Lista4;
public class FormasGeometricas {
    private float base;
    private float altura;
    private float raio;
    private float area;
    
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public float getRaio(){
        return raio;
    }
    public float getArea(){
        return area;
    }
    void setArea(float area){
        this.area=area;
    }
    FormasGeometricas(float base,float altura){
        this.base=base;
        this.altura=altura;
        calculaArea();
    }
    FormasGeometricas(float raio){
        this.raio=raio;
        calculaArea();
    }
    void calculaArea (){
        this.area=base*altura;
    }    
}
