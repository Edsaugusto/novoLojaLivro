package com.cursoSpring.lojaDeLivros.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.lojaDeLivros.dominio.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
