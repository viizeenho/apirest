package com.projeto.ada.apirest.repository;

import com.projeto.ada.apirest.model.Detran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetranRepository extends JpaRepository<Detran, Long> {
}
