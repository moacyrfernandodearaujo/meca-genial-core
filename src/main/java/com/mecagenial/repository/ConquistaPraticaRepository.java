package com.mecagenial.repository;

import com.mecagenial.model.ConquistaPratica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConquistaPraticaRepository extends JpaRepository<ConquistaPratica, Long> {
}
