package appDate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import appDate.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}
