package listas.lista4.Exercício1.Ex1Lista4;
public class ConversaoDeUnidadesDeArea{

    public static double metroPe (Double valor){
        return (valor*(10.76));
    }
    
    public static double peCent (Double valor){
        return (valor*929);
    }

    public static double milhasAcre (Double valor){
        return (valor*640);
    }

    public static double acrePe (Double valor){
        return (valor*(43560));
    }
    public static double peAcre (Double valor){
        return (valor/(43560));
    }
}