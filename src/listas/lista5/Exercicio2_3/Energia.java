package listas.lista5.Exercicio2_3;
import java.util.ArrayList;
import java.util.Scanner;

class Energia {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        ArrayList<CarbonFootprint> carbonFootprints=new ArrayList<>();
        int recebe;
        boolean r;
        double soma;
        soma=0.0;

        for (int a=0; a<2; a++){

                System.out.println("O carro " +(a+1) +" tem ar condicionado? Digite 1 para sim e 2 para não");
                recebe=teclado.nextInt();
                if (recebe==1){
                    r=true;
                }
                else {
                    r=false;
                }
                System.out.println("A seguir digite sobre o carro " +(a+1) +" :");
                System.out.println("A kilometragem por mês do carro");
                System.out.println("A potência do motor do carro");
                System.out.println("O tipo de combustível utilizado.");
                Carro carro=new Carro(r, teclado.nextFloat(),teclado.nextFloat(),teclado.next());
                carbonFootprints.add(carro);
                System.out.println(" ");
            }
        
        for (int a=0; a<2; a++){
                System.out.println("A seguir digite:");
                System.out.println("Quantas pessoas a bicicleta " +(a+1) +" carrega?");
                System.out.println("Qual é, aproximadamente, a kilometragem percorrida por mês?");
                Bicicleta bicicleta=new Bicicleta(teclado.nextInt(), teclado.nextFloat());
                carbonFootprints.add(bicicleta);
                System.out.println(" ");

            }

            for (int a=0; a<2; a++){
                System.out.println("A construção " +(a+1) +" utiliza energia renovável? Digite 1 para sim e 2 para não");
                recebe=teclado.nextInt();
                if (recebe==1){
                        r=true;
                    }
                    else {
                        r=false;
                    }
                System.out.println("Qual é o consumo de energia em Kw/h utilizado mensalmente?");
                Construcao construção=new Construcao(r, teclado.nextFloat());
                carbonFootprints.add(construção);
                System.out.println(" ");
            }
            
            for (int a=0; a<2; a++){
                System.out.println("Digite 1 se a escola utiliza energia renovável e 2 para não.");
                recebe=teclado.nextInt();
                if (recebe==1){
                        r=true;
                    }
                    else {
                        r=false;
                    }
                System.out.println("A seguir digite:");
                System.out.println("Qual é o nome da escola " +(a+1) +".");
                System.out.println("Quantas salas a escola possui?");
                System.out.println("Quantas funcionários a escola emprega?");
                System.out.println("Qual é o consumo de energia mensal da escola?");
                Escola escola=new Escola(teclado.next(), teclado.nextInt(), teclado.nextInt(), teclado.nextDouble(),r);
                carbonFootprints.add(escola);
                System.out.println(" ");

            }
            for (int a=0; a<2; a++){
                System.out.println("Digite 1 se a casa utiliza energia renovável e 2 para não.");
                recebe=teclado.nextInt();
                if (recebe==1){
                        r=true;
                    }
                    else {
                        r=false;
                    }

                System.out.println("A seguir digite:");
                System.out.println("Quantos moradores vivem na casa " +(a+1) +".");
                System.out.println("Qual o endereço da casa " +(a+1) +".");
                System.out.println("Qual é o consumo de energia mensal da casa?");                
                Casa casa=new Casa(teclado.nextInt(), teclado.next(), teclado.nextDouble(), r);
                carbonFootprints.add(casa);
                System.out.println(" ");
                }
            
            for (CarbonFootprint percorre : carbonFootprints ){
                soma=percorre.getCarbonoFootprint()+soma;
                if (percorre instanceof Bicicleta){
                    System.out.println("A bicicleta carrega " +((Bicicleta)percorre).getPessoas() +" pessoas e rodou " +((Bicicleta)percorre).getKmPecorridosMensais() +" esse mês.");
                }
                if (percorre instanceof Carro){
                    System.out.println("O carro tem motor " +((Carro)percorre).getMotorDoCarro() +" e rodou " +((Carro)percorre).getKmRodadosMensal() +"km esse mês.");
                    
                }
                if (percorre instanceof Construcao){
                    System.out.println("A construção gasta " +((Construcao)percorre).getEnergiaMensal() +" de energia mensal. " );
                    
                }
                if (percorre instanceof Edificio){
                    ((Edificio)percorre).printa();
                }
                System.out.println("Pegadas de carbono mensal = " +percorre.getCarbonoFootprint() +" kg.");
                System.out.println("");

            }
            System.out.println ("A soma das pegadas de carbono é " +soma +".");
            System.out.println(" ");
            soma=0;
        }
    }