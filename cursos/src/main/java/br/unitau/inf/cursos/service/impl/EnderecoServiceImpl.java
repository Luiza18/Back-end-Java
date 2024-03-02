package br.unitau.inf.cursos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.unitau.inf.cursos.entity.EnderecoEntity;
import br.unitau.inf.cursos.repository.EnderecoRepository;
import br.unitau.inf.cursos.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public void deleteEndereco(Long id_endereco) {
        enderecoRepository.deleteById(id_endereco);
    }

    @Override
    public List<EnderecoEntity> findAllEndereco() {
        return enderecoRepository.findAll();
    }

    @Override
    public Optional<EnderecoEntity> findById(Long id_endereco) {
        return enderecoRepository.findById(id_endereco);
    }

    @Override
    public EnderecoEntity saveEndereco(EnderecoEntity enderecoEntity) {
        return enderecoRepository.save(enderecoEntity);
    }

    @Override
    public EnderecoEntity updateEndereco(EnderecoEntity enderecoEntity) {
        return enderecoRepository.save(enderecoEntity);
    }

    @Override
    public List<Object[]> countClientesInEachEndereco() {
        return enderecoRepository.countClientesInEachEndereco();
    }
}