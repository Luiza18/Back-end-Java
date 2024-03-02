package br.unitau.inf.cursos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.unitau.inf.cursos.entity.ClienteEntity;
import br.unitau.inf.cursos.repository.ClienteRepository;
import br.unitau.inf.cursos.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void deleteCliente(Long id_cliente) {
        clienteRepository.deleteById(id_cliente);
    }

    @Override
    public List<ClienteEntity> findAllCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<ClienteEntity> findById(Long id_cliente) {
        return clienteRepository.findById(id_cliente);
    }

    @Override
    public ClienteEntity saveCliente(ClienteEntity clienteEntity) {
        return clienteRepository.save(clienteEntity);
    }

    @Override
    public ClienteEntity updateCliente(ClienteEntity clienteEntity) {
        return clienteRepository.save(clienteEntity);
    }

    @Override
    public List<Object[]> countLocacoesForClientes() {
        return clienteRepository.countLocacoesForClientes();
    }
}