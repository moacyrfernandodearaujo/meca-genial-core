package com.mecagenial.repository;

import com.mecagenial.model.RecursoIndustrial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursoIndustrialRepository extends JpaRepository<RecursoIndustrial, Long> {
}
