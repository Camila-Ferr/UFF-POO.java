package listas.lista5.Exercicio6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Info {
    private int dia ;
    private double TempMin;
    private double TempMax;
    private int nivel;

    Info(int dia, double TempMin, double TempMax, int nivel){
        this.dia=dia;
        this.TempMax=TempMax;
        this.TempMin=TempMin;
        this.nivel=nivel;
    }
    void printaInfo(){
        System.out.println("Dia : "+this.dia);
        System.out.println("Temperatura máxima : "+this.TempMax);
        System.out.println("Temperature mínima : "+this.TempMin);
        System.out.println("Nível de pluviosidade : "+this.nivel);
        System.out.println("");
    }
    
    
}
