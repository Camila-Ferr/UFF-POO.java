package listas.lista4.Exercício2;


import listas.lista4.Exercício1.Ex1Lista4.ConversaoDeUnidadesDeArea;

public class Main {
    public static void main(String[] args) {
    double areaM,areaPe,areaCent,areaAcre;
    areaM=8250;
    areaPe= ConversaoDeUnidadesDeArea.metroPe(areaM);
    areaCent=ConversaoDeUnidadesDeArea.peCent(areaPe);
    areaAcre=ConversaoDeUnidadesDeArea.peAcre(areaPe);

    System.out.println("O campo de futebol é "+String.format("%.2f", areaPe)+" pés quadrados.");
    System.out.println("O campo de futebol é "+String.format("%.2f", areaCent) +" centímetros quadrados.");
    System.out.println("O campo de futebol é "+String.format("%.2f", areaAcre) +" acres.");

    }   
}
