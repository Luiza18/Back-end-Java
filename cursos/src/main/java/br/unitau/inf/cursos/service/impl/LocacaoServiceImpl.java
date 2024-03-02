package br.unitau.inf.cursos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.unitau.inf.cursos.entity.LocacaoEntity;
import br.unitau.inf.cursos.repository.LocacaoRepository;
import br.unitau.inf.cursos.service.LocacaoService;

@Service
public class LocacaoServiceImpl implements LocacaoService {

    private final LocacaoRepository locacaoRepository;

    public LocacaoServiceImpl(LocacaoRepository locacaoRepository) {
        this.locacaoRepository = locacaoRepository;
    }

    @Override
    public void deleteLocacao(Long id_locacao) {
        locacaoRepository.deleteById(id_locacao);
    }

    @Override
    public List<LocacaoEntity> findAllLocacao() {
        return locacaoRepository.findAll();
    }

    @Override
    public Optional<LocacaoEntity> findById(Long id_locacao) {
        return locacaoRepository.findById(id_locacao);
    }

    @Override
    public LocacaoEntity saveLocacao(LocacaoEntity locacaoEntity) {
        return locacaoRepository.save(locacaoEntity);
    }

    @Override
    public LocacaoEntity updateLocacao(LocacaoEntity locacaoEntity) {
        return locacaoRepository.save(locacaoEntity);
    }
}
