package br.unitau.inf.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unitau.inf.cursos.entity.LocacaoEntity;

@Repository
public interface LocacaoRepository extends JpaRepository<LocacaoEntity, Long> {

}
