package com.classes.repository;

import com.classes.tabelas.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Produtos, Long> {
}
