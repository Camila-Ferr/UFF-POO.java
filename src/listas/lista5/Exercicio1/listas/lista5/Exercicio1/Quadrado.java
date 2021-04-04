package listas.lista5.Exercicio1;
public class Quadrado extends Retangulo{
    
    @Override
    void calcularArea(Float... lado){
        super.calcularArea(lado[0],lado[0]);
    }
    
    @Override
    void calcularPerimetro(Float... lado){
        super.calcularPerimetro(lado[0],lado[0]);
    }
    
        
}
    
