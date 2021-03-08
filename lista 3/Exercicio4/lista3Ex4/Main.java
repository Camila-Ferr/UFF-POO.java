package lista3Ex4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Data[] lista = new Data[100];
        int indice,inteiro1,inteiro2,inteiro3, dia, ano, diasCorridos, diasDoAno,m;
        String mes;
        indice=0;
        Scanner teclado =new Scanner (System.in);
            
        for (int a=0; a<2; a++){
            System.out.println("Para adicionar uma data do tipo -DD/MM/AAAA-:");
            System.out.println("Digite o dia");
            inteiro1=teclado.nextInt();
            System.out.println("Digite o mês");
            inteiro2=teclado.nextInt();
            System.out.println("Digite o ano");
            inteiro3=teclado.nextInt();
            Data data= new Data(inteiro1,inteiro2,inteiro3);
            lista[indice]=data;
            indice=indice+1;
            System.out.println(" ");
        }
        for (int a=0; a<2; a++){
            System.out.println("Para adicionar uma data do tipo -Mês Dia, Ano-");
            System.out.println("Digite o dia");
            inteiro1=teclado.nextInt();
            System.out.println("Digite o mês");
            mes=teclado.next();
            System.out.println("Digite o ano");
            inteiro3=teclado.nextInt();
            Data data=new Data (inteiro1, mes, inteiro3);
            lista[indice]=data;
            indice=indice+1;
            System.out.println(" ");
        }
        for (int a=0; a<2; a++){
            System.out.println("Para adicionar uma data do tipo -DDD AAAA-");
            System.out.println("Digite os dias corridos do ano"); 
            inteiro1=teclado.nextInt();
            System.out.println("Digite quantos dias tem o ano");
            inteiro3=teclado.nextInt();
            Data data=new Data (inteiro1, inteiro3);
            lista[indice]=data;
            indice=indice+1;
            System.out.println(" ");
        }

        for (int a=0; a<indice; a++){
            mes=lista[a].getMes();
            m=lista[a].getM();
            if (mes != null){
                dia=lista[a].getDia();
                ano=lista[a].getAno();
                System.out.println (mes +" " +dia +"," +ano);
            }
            else if (m>0){
                dia=lista[a].getDia();
                ano=lista[a].getAno();
                System.out.println (dia +"/" +m +"/" +ano);
            }
            else{
                diasCorridos=lista[a].getDiasCorridos();
                diasDoAno=lista[a].getDiasDoAno();
                System.out.println (diasCorridos +" " +diasDoAno);
            }
        }
    }
}
