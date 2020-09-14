package com.celiocausjunior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celiocausjunior.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
