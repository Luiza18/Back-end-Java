package br.unitau.inf.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.unitau.inf.cursos.entity.LocacaoEntity;

@Service
public interface LocacaoService {

    List<LocacaoEntity> findAllLocacao();

    Optional<LocacaoEntity> findById(Long id_locacao);

    LocacaoEntity saveLocacao(LocacaoEntity locacaoEntity);

    LocacaoEntity updateLocacao(LocacaoEntity locacaoEntity);

    void deleteLocacao(Long id_locacao);
}
