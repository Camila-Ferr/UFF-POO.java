package listas.lista6.Exercicio6;


import java.util.*;

public class Karaoke extends ordena {
    ArrayList<Musica>musicas=new ArrayList<>();
    ArrayDeque<Musica> musicasPedidas=new ArrayDeque<>();


    Karaoke(){
        Musica musica1=new Musica("Anita","Show das Poderosas",1);
        musicas.add(musica1);
        Musica musica2= new Musica ("Pedro Salomão","Cafuné",2);
        musicas.add(musica2);
        Musica musica3=new Musica ("Ed Sheeran","Photograph",3);
        musicas.add(musica3);
        Musica musica4=new Musica("Legião","Será",4);
        musicas.add(musica4);
        Musica musica5= new Musica("Clarice Falcão","Capitão Gancho",5);
        musicas.add(musica5);
        Musica musica6= new Musica ("Lulu Santos","Tempos modernos",6);
        musicas.add(musica6);
        Musica musica7=new Musica ("Imagine Dragons","Believer",7);
        musicas.add(musica7);
        Musica musica8=new Musica ("Projota","Mulher",8);
        musicas.add(musica8);
        Musica musica9=new Musica ("Thiaguinho","Ousadia e Alegria",9);
        musicas.add(musica9);
        Musica musica10=new Musica ("Luisa Sonza","Braba",10);
        musicas.add(musica10);
        Musica musica11=new Musica ("The Chainsmokers","Closer",11);
        musicas.add(musica11);
        Musica musica12=new Musica ("Justin Timberlake","Take back the night",12);
        musicas.add(musica12);
        Musica musica13=new Musica ("Bruno Mars","24k Magic",13);
        musicas.add(musica13);
        Musica musica14=new Musica ("Gaab","Tem café",14);
        musicas.add(musica14);
        Musica musica15=new Musica ("Ariana Grande","Thank you, next",15);
        musicas.add(musica15);
        Musica musica16=new Musica ("BackStreet Boys","I want it that way",16);
        musicas.add(musica16);
        Musica musica17=new Musica ("Jorge Vercilo","Talismã sem par",17);
        musicas.add(musica17);
        Musica musica18=new Musica ("Charlie Brown Jr","Ela vai voltar",18);
        musicas.add(musica18);
        Musica musica19=new Musica ("Pixote","Nem de graça",19);
        musicas.add(musica19);
        Musica musica20=new Musica ("Teatro Mágico","Ana e o mar",20);
        musicas.add(musica20);
        Musica musica21=new Musica ("Maroon Five","Sugar",21);
        musicas.add(musica21);
        Musica musica22=new Musica ("Capital Inicial","Mulher de fases",22);
        musicas.add(musica22);
        Musica musica23=new Musica ("Nando Reis","Relicário",23);
        musicas.add(musica23);
        Musica musica24=new Musica ("Ana e Vitoria","Dengo",24);
        musicas.add(musica24);
        Musica musica25=new Musica ("Cinco a seco","Pra você dar o nome",25);
        musicas.add(musica25);
        Musica musica26=new Musica("Melim", "Gelo", 26);
        musicas.add(musica26);
        Musica musica27= new Musica("Rael","Envolvidão",27);
        musicas.add(musica27);
        Musica musica28=new Musica("Atitude 67","8 segundos",28);
        musicas.add(musica28);

    }
    public void addFila(int n){
        for (Musica percorre: musicas){
            if (percorre.getNumero()==n){
                musicasPedidas.add(percorre);
                break;
            }
        }
    }

    public void tocandoAgora() {
        try {
            System.out.println("Tocando agora: " + musicasPedidas.getFirst().getNome());
            System.out.println("Cantor: " + musicasPedidas.getFirst().getArtista());
            System.out.println();
            musicasPedidas.removeFirst();
        }
        catch (Exception e){
            System.out.println("Não existem músicas na fila.");
            System.out.println();

        }
    }
    void getCatalogo(){
        for (Musica percorre: musicas){
            System.out.println(percorre.getNome() +" , " +percorre.getArtista());
            System.out.println("Número correspondente: "+percorre.getNumero());
            System.out.println("");
        }
    }

    void alfabetica(){
        Collections.sort(musicas, alfa);
        getCatalogo();
    }

    void porArtista(){
        Collections.sort(musicas,artista);
        getCatalogo();
    }
}
