package br.unitau.inf.cursos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unitau.inf.cursos.entity.CategoriaEntity;
import br.unitau.inf.cursos.service.CategoriaService;

@RestController
@RequestMapping("/locadora/categoria")
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<CategoriaEntity> findAllCategoria() {
        return categoriaService.findAllCategoria();
    }

    @GetMapping("/{id_categoria}")
    public Optional<CategoriaEntity> findCategoriaById(@PathVariable("id_categoria") Long id_categoria) {
        return categoriaService.findById(id_categoria);
    }

    @PostMapping
    public CategoriaEntity saveCategoria(@RequestBody CategoriaEntity categoriaEntity) {
        return categoriaService.saveCategoria(categoriaEntity);
    }

    @PutMapping
    public CategoriaEntity updateCategoria(@RequestBody CategoriaEntity categoriaEntity) {
        return categoriaService.updateCategoria(categoriaEntity);
    }

    @DeleteMapping("/{id_categoria}")
    public void deleteCategoria(@PathVariable("id_categoria") Long id_categoria) {
        categoriaService.deleteCategoria(id_categoria);
    }

    @GetMapping("/count-filmes/categorias")
    public List<Object[]> countFilmesInEachCategoria() {
        return categoriaService.countFilmesInEachCategoria();
    }

}
