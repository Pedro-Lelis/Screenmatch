package br.com.pedrolelis.screenmatch.principal;

import br.com.pedrolelis.screenmatch.modelos.Filme;
import br.com.pedrolelis.screenmatch.modelos.Serie;
import br.com.pedrolelis.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var filmeDoPedro = new Filme("Dogville", 2003);
        filmeDoPedro.avalia(10);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPedro);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Pedro");
        buscaPorArtista.add("Fulano");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação por sort: " + buscaPorArtista);

        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);

    }
}
