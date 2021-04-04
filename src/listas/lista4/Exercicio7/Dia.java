import java.util.Scanner;
public class Dia {
    
        private diaDaSemana Status;
        Dia(diaDaSemana status){
            Status=status;
        }
        
        boolean ehDiaUtil (){
            if ((this.getStatus()==diaDaSemana.DOMINGO)){
                return false;
            }
            else if (this.getStatus()==diaDaSemana.SABADO){
                return false;
            }
            return true;
        }
    
        private diaDaSemana getStatus() {
            return Status;
        }

    public static void main(String[] args){
        int n;
        n=0;
        boolean recebe;
        Scanner teclado =new Scanner (System.in);
        System.out.println("Escolha seu dia da semana:");
        System.out.println("1- Domingo");
        System.out.println("2- Segunda");
        System.out.println("3- Terça");
        System.out.println("4- Quarta");
        System.out.println("5- Quinta");
        System.out.println("6- Sexta");
        System.out.println("7- Sábado");
        n=teclado.nextInt();
        recebe=false;
        Dia status=null;

        if (n==1){
            status=new Dia (diaDaSemana.DOMINGO);
        }
        else if (n==2){
            status=new Dia(diaDaSemana.SEGUNDA);
        }
        else if (n==3){
            status=new Dia(diaDaSemana.TERCA);
        }
        else if (n==4){
            status=new Dia(diaDaSemana.QUARTA);
        }
        else if (n==5){
            status=new Dia(diaDaSemana.QUINTA);
        }
        else if (n==6){
            status=new Dia(diaDaSemana.SEXTA);
        }
        else if (n==7){
            status=new Dia(diaDaSemana.SABADO);
        }

        recebe=status.ehDiaUtil();

        if (recebe){
            System.out.println("É dia útil.");
            
        }
        else{
            System.out.println("Aproveite o final de semana!");

        }
    }
}
enum diaDaSemana{                             
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;
}
