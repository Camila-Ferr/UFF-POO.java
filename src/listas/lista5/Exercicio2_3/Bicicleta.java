package listas.lista5.Exercicio2_3;
public class Bicicleta implements CarbonFootprint {
    private int pessoas;
    private float kmPecorridosMensais;
    private double carbonFootprint;

    Bicicleta(int pessoas, float kmPecorridosMensais){
        this.pessoas=pessoas;
        this.kmPecorridosMensais=kmPecorridosMensais;
        this.carbonFootprint=getCarbonoFootprint();
    }

    @Override
    public double getCarbonoFootprint (){
        carbonFootprint= 0.0;
        return carbonFootprint;
    }

    public int getPessoas() {
        return pessoas;
    }

    public float getKmPecorridosMensais() {
        return kmPecorridosMensais;
    }

    
}
