package com.cursoSpring.lojaDeLivros.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoSpring.lojaDeLivros.Repositories.CategoriaRepository;
import com.cursoSpring.lojaDeLivros.Repositories.LivroRepository;
import com.cursoSpring.lojaDeLivros.dominio.Categoria;
import com.cursoSpring.lojaDeLivros.dominio.Livro;

@Service
public class DBServices {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBancoDeDados() {
        Categoria cat1 = new Categoria(null, "categoria1", "livro TI");
        Categoria cat2 = new Categoria(null, "categoria2", "biologia");

        Livro livro1 = new Livro(null, "titulo1", "autor1", "lorem ipsum", cat1);
        Livro livro2 = new Livro(null, "titulo2", "autor3", "lorem ipsum", cat2);
        Livro livro3 = new Livro(null, "titulo3", "autor3", "lorem ipsum", cat1);
        cat1.getLivros().addAll(Arrays.asList(livro1));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3));
    }
}
