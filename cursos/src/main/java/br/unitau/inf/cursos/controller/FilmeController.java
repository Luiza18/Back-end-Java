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

import br.unitau.inf.cursos.entity.FilmeEntity;
import br.unitau.inf.cursos.service.FilmeService;

@RestController
@RequestMapping("/locadora/filme")
public class FilmeController {

    private FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @GetMapping
    public List<FilmeEntity> findAllFilme() {
        return filmeService.findAllFilme();
    }

    @GetMapping("/{id_filme}")
    public Optional<FilmeEntity> findFilmeById(@PathVariable("id_filme") Long id_filme) {
        return filmeService.findById(id_filme);
    }

    @PostMapping
    public FilmeEntity saveFilme(@RequestBody FilmeEntity filmeEntity) {
        return filmeService.saveFilme(filmeEntity);
    }

    @PutMapping
    public FilmeEntity updateFilme(@RequestBody FilmeEntity filmeEntity) {
        return filmeService.updateFilme(filmeEntity);
    }

    @DeleteMapping("/{id_filme}")
    public void deleteFilme(@PathVariable("id_filme") Long id_filme) {
        filmeService.deleteFilme(id_filme);
    }

    @GetMapping("/count")
    public Long countFilmes() {
        List<FilmeEntity> filmes = filmeService.findAllFilme();
        return (long) filmes.size();
    }
}