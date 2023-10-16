package com.cursoSpring.lojaDeLivros.dominio;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private Long id;
    private String nome;
    private String descricao;

    private List<Livro> livros = new ArrayList<>();
}
