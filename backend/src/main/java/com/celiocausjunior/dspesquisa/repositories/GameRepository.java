package com.celiocausjunior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celiocausjunior.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
