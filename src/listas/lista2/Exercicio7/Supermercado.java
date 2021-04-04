package listas.lista2.Exercicio7;
class Supermercado {
    Item[] lista= new Item[100];
    int indice=0;

    void produtos(){
        Item primeiro=new Item();
        primeiro.nome="Arroz";
        primeiro.preco=5.5;
        primeiro.quantidade=5;
        adicionar(primeiro);

        Item segundo=new Item();
        segundo.nome="Feijao";
        segundo.preco=4.5;
        segundo.quantidade=10;
        adicionar(segundo);

        Item terceiro=new Item();
        terceiro.nome="Macarrao";
        terceiro.preco=6.5;
        terceiro.quantidade=9;
        adicionar(terceiro);

        Item quarto=new Item();
        quarto.nome="LasanhaSabor";
        quarto.preco=7;
        quarto.quantidade=15;
        adicionar(quarto);

        Item quinto=new Item();
        quinto.nome="Maionese";
        quinto.preco=3.0;
        quinto.quantidade=2;
        adicionar(quinto);

        Item sexto=new Item();
        sexto.nome="Farinha";
        sexto.preco=4.5;
        sexto.quantidade=5;
        adicionar(sexto);

        Item setimo=new Item();
        setimo.nome="BarraDeCereal";
        setimo.preco=2.2;
        setimo.quantidade=10;
        adicionar(setimo);

        Item oito=new Item();
        oito.nome="Tomate";
        oito.preco=4.5;
        oito.quantidade=15;
        adicionar(oito);

        Item nove=new Item();
        nove.nome="Alface";
        nove.preco=4.5;
        nove.quantidade=9;
        adicionar(nove);

        Item dez=new Item();
        dez.nome="Cafe";
        dez.preco=5.5;
        dez.quantidade=20;
        adicionar(dez);

        Item onze=new Item();
        onze.nome="BoloDeChocolate";
        onze.preco=25.0;
        onze.quantidade=9;
        adicionar(onze);
    }
    
    void adicionar(Item item){
        lista[indice]=item;
        indice=indice+1;
    }

    void mostrarEstoque(){
        System.out.println("Essas são as super ofertas de hoje!");
        System.out.println(" ");
        for (int a=0; a<indice; a++){
            if (lista[a].quantidade>0){
                System.out.println("Produto " +(a+1) +" : " +lista[a].nome);
                System.out.println("Preço: " +lista[a].preco);
                System.out.println("Quantidade disponível: " +lista[a].quantidade);
                System.out.println("");
            }
        }

    }
    void retirar (int n, int p){
        lista[n].quantidade=lista[n].quantidade-p;
    }
}
