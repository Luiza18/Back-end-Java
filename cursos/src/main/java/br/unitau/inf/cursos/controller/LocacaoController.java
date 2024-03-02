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

import br.unitau.inf.cursos.entity.LocacaoEntity;
import br.unitau.inf.cursos.service.LocacaoService;

@RestController
@RequestMapping("/locadora/locacao")
public class LocacaoController {

    private LocacaoService locacaoService;

    public LocacaoController(LocacaoService locacaoService) {
        this.locacaoService = locacaoService;
    }

    @GetMapping
    public List<LocacaoEntity> findAllLocacao() {
        return locacaoService.findAllLocacao();
    }

    @GetMapping("/{id_locacao}")
    public Optional<LocacaoEntity> findLocacaoById(@PathVariable("id_locacao") Long id_locacao) {
        return locacaoService.findById(id_locacao);
    }

    @PostMapping
    public LocacaoEntity saveLocacao(@RequestBody LocacaoEntity locacaoEntity) {
        return locacaoService.saveLocacao(locacaoEntity);
    }

    @PutMapping
    public LocacaoEntity updateLocacao(@RequestBody LocacaoEntity locacaoEntity) {
        return locacaoService.updateLocacao(locacaoEntity);
    }

    @DeleteMapping("/{id_locacao}")
    public void deleteLocacao(@PathVariable("id_locacao") Long id_locacao) {
        locacaoService.deleteLocacao(id_locacao);
    }

    @GetMapping("/count")
    public Long countLocacoes() {
        List<LocacaoEntity> locacoes = locacaoService.findAllLocacao();
        return (long) locacoes.size();
    }
}
