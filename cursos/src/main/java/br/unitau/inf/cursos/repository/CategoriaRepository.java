package br.unitau.inf.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.unitau.inf.cursos.entity.CategoriaEntity;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
    @Query("SELECT c.categoria, COUNT(f) FROM CategoriaEntity c JOIN c.filmes f GROUP BY c.categoria")
    List<Object[]> countFilmesInEachCategoria();

}