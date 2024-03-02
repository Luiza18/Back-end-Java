package br.unitau.inf.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.unitau.inf.cursos.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    @Query("SELECT c.id_cliente, c.nome, COUNT(l) FROM ClienteEntity c LEFT JOIN c.locacoes l WHERE l IS NOT NULL GROUP BY c.id_cliente")
    List<Object[]> countLocacoesForClientes();

}