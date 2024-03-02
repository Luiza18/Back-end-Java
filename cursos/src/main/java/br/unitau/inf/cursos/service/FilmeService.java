package br.unitau.inf.cursos.service;

import java.util.List;
import java.util.Optional;

import br.unitau.inf.cursos.entity.FilmeEntity;

public interface FilmeService {

    List<FilmeEntity> findAllFilme();

    Optional<FilmeEntity> findById(Long id_filme);

    FilmeEntity saveFilme(FilmeEntity filmeEntity);

    FilmeEntity updateFilme(FilmeEntity filmeEntity);

    void deleteFilme(Long id_filme);
}
