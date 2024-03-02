package br.unitau.inf.cursos.service;

import java.util.List;
import java.util.Optional;

import br.unitau.inf.cursos.entity.CategoriaEntity;

public interface CategoriaService {

    List<CategoriaEntity> findAllCategoria();

    Optional<CategoriaEntity> findById(Long id_categoria);

    CategoriaEntity saveCategoria(CategoriaEntity categoriaEntity);

    CategoriaEntity updateCategoria(CategoriaEntity categoriaEntity);

    void deleteCategoria(Long id_categoria);

    List<Object[]> countFilmesInEachCategoria();

}
