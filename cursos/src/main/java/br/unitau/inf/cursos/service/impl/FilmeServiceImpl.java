package br.unitau.inf.cursos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.unitau.inf.cursos.entity.FilmeEntity;
import br.unitau.inf.cursos.repository.FilmeRepository;
import br.unitau.inf.cursos.service.FilmeService;

@Service
public class FilmeServiceImpl implements FilmeService {

    private final FilmeRepository filmeRepository;

    public FilmeServiceImpl(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    @Override
    public void deleteFilme(Long id_filme) {
        filmeRepository.deleteById(id_filme);
    }

    @Override
    public List<FilmeEntity> findAllFilme() {
        return filmeRepository.findAll();
    }

    @Override
    public Optional<FilmeEntity> findById(Long id_filme) {
        return filmeRepository.findById(id_filme);
    }

    @Override
    public FilmeEntity saveFilme(FilmeEntity filmeEntity) {
        return filmeRepository.save(filmeEntity);
    }

    @Override
    public FilmeEntity updateFilme(FilmeEntity filmeEntity) {
        return filmeRepository.save(filmeEntity);
    }
}
