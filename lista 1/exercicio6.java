public class exercicio6 {
    public static void main (String [] args){

        int primeiro,segundo,atual;
        primeiro=0;
        segundo=1;
        atual=segundo;
        System.out.println( "O Termo 1 é "+primeiro +"." );   
        System.out.println( "O Termo 2 é "+segundo +"." );
        
        for (int a=3; a<100; a++){
            atual=segundo+primeiro;
            primeiro=segundo; 
            segundo=atual;
            if (atual<=100){
                System.out.println( "O Termo " +a +" é "+atual +"."  );   
            }
            else{
                break;
            }
        }
    }
}
