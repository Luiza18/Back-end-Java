package br.unitau.inf.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.unitau.inf.cursos.entity.EnderecoEntity;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
    @Query("SELECT e.id_endereco, e.logradouro, e.bairro, e.cidade, e.estado, e.cep, COUNT(c) FROM EnderecoEntity e LEFT JOIN e.clientes c GROUP BY e.id_endereco")
    List<Object[]> countClientesInEachEndereco();
}
