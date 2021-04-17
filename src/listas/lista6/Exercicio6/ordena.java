package listas.lista6.Exercicio6;

import java.util.Comparator;
public class ordena {

    public Comparator<Musica> alfa = new Comparator <Musica>() {
        @Override
        public int compare(Musica m1, Musica m2) {
            return m1.getNome().compareTo(m2.getNome());
        }
    };
    public Comparator<Musica> artista = new Comparator <Musica>() {
        @Override
        public int compare(Musica m1, Musica m2) {
            return m1.getArtista().compareTo(m2.getArtista());
        }
    };
}


