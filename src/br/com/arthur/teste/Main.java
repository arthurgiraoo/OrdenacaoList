package br.com.arthur.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};
        System.out.println("--- Ordem de Inserção---");

        System.out.println(meusGatos);

        System.out.println("--- Ordem de Aleatoria---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--- Ordem de Natural(nome)---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--- Ordem de Idade---");
        Collections.sort(meusGatos,new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos.toString());

        System.out.println("--- Ordem de Cor---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos.toString());

        System.out.println("---Ordenar por cor/nome/idade---");
        Collections.sort(meusGatos,new ComparatorNomeCorIdade());
        System.out.println(meusGatos.toString());


    }
}