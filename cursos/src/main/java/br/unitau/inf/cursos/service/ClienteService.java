package br.unitau.inf.cursos.service;

import java.util.List;
import java.util.Optional;

import br.unitau.inf.cursos.entity.ClienteEntity;

public interface ClienteService {

    List<ClienteEntity> findAllCliente();

    Optional<ClienteEntity> findById(Long id_cliente);

    ClienteEntity saveCliente(ClienteEntity clienteEntity);

    ClienteEntity updateCliente(ClienteEntity clienteEntity);

    void deleteCliente(Long id_cliente);

    List<Object[]> countLocacoesForClientes();
}