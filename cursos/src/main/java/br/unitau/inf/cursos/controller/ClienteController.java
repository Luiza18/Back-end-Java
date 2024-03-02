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

import br.unitau.inf.cursos.entity.ClienteEntity;
import br.unitau.inf.cursos.service.ClienteService;

@RestController
@RequestMapping("/locadora/cliente")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<ClienteEntity> findAllCliente() {
        return clienteService.findAllCliente();
    }

    @GetMapping("/{id_cliente}")
    public Optional<ClienteEntity> findClienteById(@PathVariable("id_cliente") Long id_cliente) {
        return clienteService.findById(id_cliente);
    }

    @PostMapping
    public ClienteEntity saveCliente(@RequestBody ClienteEntity clienteEntity) {
        return clienteService.saveCliente(clienteEntity);
    }

    @PutMapping
    public ClienteEntity updateCliente(@RequestBody ClienteEntity clienteEntity) {
        return clienteService.updateCliente(clienteEntity);
    }

    @DeleteMapping("/{id_cliente}")
    public void deleteCliente(@PathVariable("id_cliente") Long id_cliente) {
        clienteService.deleteCliente(id_cliente);
    }

    @GetMapping("/count")
    public Long countClientes() {
        List<ClienteEntity> clientes = clienteService.findAllCliente();
        return (long) clientes.size();
    }

    @GetMapping("/count-locacoes/clientes")
    public List<Object[]> countLocacoesForClientes() {
        return clienteService.countLocacoesForClientes();
    }

}
