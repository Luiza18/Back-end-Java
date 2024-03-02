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

import br.unitau.inf.cursos.entity.EnderecoEntity;
import br.unitau.inf.cursos.service.EnderecoService;

@RestController
@RequestMapping("/locadora/endereco")
public class EnderecoController {

    private EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping
    public List<EnderecoEntity> findAllEndereco() {
        return enderecoService.findAllEndereco();
    }

    @GetMapping("/{id_endereco}")
    public Optional<EnderecoEntity> findEnderecoById(@PathVariable("id_endereco") Long id_endereco) {
        return enderecoService.findById(id_endereco);
    }

    @PostMapping
    public EnderecoEntity saveEndereco(@RequestBody EnderecoEntity enderecoEntity) {
        return enderecoService.saveEndereco(enderecoEntity);
    }

    @PutMapping
    public EnderecoEntity updateEndereco(@RequestBody EnderecoEntity enderecoEntity) {
        return enderecoService.updateEndereco(enderecoEntity);
    }

    @DeleteMapping("/{id_endereco}")
    public void deleteEndereco(@PathVariable("id_endereco") Long id_endereco) {
        enderecoService.deleteEndereco(id_endereco);
    }

    @GetMapping("/count-clientes/endereco")
    public List<Object[]> countClientesInEachEndereco() {
        return enderecoService.countClientesInEachEndereco();
    }
}
