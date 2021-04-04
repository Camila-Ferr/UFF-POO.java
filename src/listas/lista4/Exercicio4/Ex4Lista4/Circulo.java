package listas.lista4.Exercicio4.Ex4Lista4;

public class Circulo extends FormasGeometricas {
    
    Circulo (float raio){
        super(raio);
    }

    @Override
    void calculaArea() {
        setArea(3*(getRaio()*getRaio()));
    }
    
    
}
