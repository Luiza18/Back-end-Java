package br.unitau.inf.cursos.service;

import java.util.List;
import java.util.Optional;

import br.unitau.inf.cursos.entity.EnderecoEntity;

public interface EnderecoService {

    List<EnderecoEntity> findAllEndereco();

    Optional<EnderecoEntity> findById(Long id_endereco);

    EnderecoEntity saveEndereco(EnderecoEntity enderecoEntity);

    EnderecoEntity updateEndereco(EnderecoEntity enderecoEntity);

    void deleteEndereco(Long id_endereco);

    List<Object[]> countClientesInEachEndereco();
}
