package com.forRefugees.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forRefugees.model.Contratante;

@Repository
public interface ContratanteRepository extends JpaRepository<Contratante, Long> {

}
