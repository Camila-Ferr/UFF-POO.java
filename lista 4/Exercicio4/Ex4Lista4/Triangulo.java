package Ex4Lista4;

public class Triangulo extends FormasGeometricas{
    
    
    Triangulo (float base, float altura){
        super(base,altura);
    }

    @Override
    void calculaArea() {
        setArea((getBase()*getAltura())/2);
    }
    
    
}
