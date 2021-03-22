package Ex6Lista4;
public class Pokebola {
    public static void main(String[] args) {
        Pokemon[] lista= new Pokemon[100];
        int tamanho=0;

        Eletrico Picachu =new Eletrico ("Picachu");
        Picachu.evoluir(2);
        lista[tamanho]=Picachu;
        tamanho=tamanho+1;
        

        Fogo Charmander= new Fogo("Charmander");
        Charmander.evoluir(2);
        Charmander.evoluir(3);
        Charmander.evoluir(4);
        lista[tamanho]=Charmander;
        tamanho=tamanho+1;
        


        Agua Squirtle= new Agua("Squirtle");
        Squirtle.evoluir(2);
        Squirtle.evoluir(3);
        lista[tamanho]=Squirtle;
        tamanho=tamanho+1;

        Planta Bubassauro= new Planta("Bubassauro");
        Bubassauro.evoluir(2);
        Bubassauro.evoluir(3);
        Bubassauro.evoluir(4);
        lista[tamanho]=Bubassauro;
        tamanho=tamanho+1;

         for (Pokemon percorre: lista){
            if (percorre==null){
                break;
            }
                percorre.mostraEvolucao();
        }
    
}
}
