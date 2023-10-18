package com.cursoSpring.lojaDeLivros.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.lojaDeLivros.dominio.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
