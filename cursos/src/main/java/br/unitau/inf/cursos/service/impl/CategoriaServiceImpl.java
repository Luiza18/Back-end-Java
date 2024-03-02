package br.unitau.inf.cursos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.unitau.inf.cursos.entity.CategoriaEntity;
import br.unitau.inf.cursos.repository.CategoriaRepository;
import br.unitau.inf.cursos.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public void deleteCategoria(Long id_categoria) {
        categoriaRepository.deleteById(id_categoria);
    }

    @Override
    public List<CategoriaEntity> findAllCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id_categoria) {
        return categoriaRepository.findById(id_categoria);
    }

    @Override
    public CategoriaEntity saveCategoria(CategoriaEntity categoriaEntity) {
        return categoriaRepository.save(categoriaEntity);
    }

    @Override
    public CategoriaEntity updateCategoria(CategoriaEntity categoriaEntity) {
        return categoriaRepository.save(categoriaEntity);
    }

    @Override
    public List<Object[]> countFilmesInEachCategoria() {
        return categoriaRepository.countFilmesInEachCategoria();
    }

}
