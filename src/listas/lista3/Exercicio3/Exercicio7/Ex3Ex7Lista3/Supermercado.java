package Ex3Ex7Lista3;

class Supermercado {
    private Item[] lista= new Item[100];
    private int indice=0;

    Supermercado(){
        Item primeiro=new Item("Arroz",5.5,5);
        lista[indice]=primeiro;
        indice=indice+1;
        Item segundo=new Item("Feijao",4.5,10);
        lista[indice]=segundo;
        indice=indice+1;
        Item terceiro=new Item("Macarrao",6.5,9);
        lista[indice]=terceiro;
        indice=indice+1;
        Item quarto=new Item("LasanhaSabor",7,15);
        lista[indice]=quarto;
        indice=indice+1;
        Item quinto=new Item("Maionese",3.0,2);
        lista[indice]=quinto;
        indice=indice+1;
        Item sexto=new Item("Farinha",4.5,5);
        lista[indice]=sexto;
        indice=indice+1;
        Item setimo=new Item("BarraDeCereal",2.2,10);
        lista[indice]=setimo;
        indice=indice+1;
        Item oitavo=new Item("Tomate",4.5,15);
        lista[indice]=oitavo;
        indice=indice+1;
        Item nono=new Item("Alface",4.5,9);
        lista[indice]=nono;
        indice=indice+1;
        Item decimo=new Item("BoloDeChocolate",25.0,9);
        lista[indice]=decimo;
        indice=indice+1;
        Item dprim=new Item("Café",5.5,20);
        lista[indice]=dprim;
        indice=indice+1;
    
        }

        public String getN(int a) {
            return this.lista[a].getNome();
        }
        public double getP(int a) {
            return this.lista[a].getPreco();
        }



    

    void mostrarEstoque(){
        System.out.println("Essas são as super ofertas de hoje!");
        System.out.println(" ");
        for (int a=0; a<indice; a++){
            if (lista[a].getQuantidade()>0){
                System.out.println("Produto " +(a+1) +" : " +lista[a].getNome());
                System.out.println("Preço: " +lista[a].getPreco());
                System.out.println("Quantidade disponível: " +lista[a].getQuantidade());
                System.out.println("");
            }
        }

    }
    void retirar (int n, int p){
        lista[n].setQuantidade(lista[n].getQuantidade()-p);
    }
}
