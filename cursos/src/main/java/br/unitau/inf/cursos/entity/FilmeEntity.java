package br.unitau.inf.cursos.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "filme")
public class FilmeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_filme")
    private Long id_filme;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "diretor")
    private String diretor;

    @Column(name = "data_lancamento")
    private Date data_lancamento;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_locacao")
    private LocacaoEntity locacao;

    @ManyToMany(mappedBy = "filmes")
    private List<CategoriaEntity> categorias;

    // Construtores
    public FilmeEntity() {
    }

    public FilmeEntity(String titulo, String diretor, Date data_lancamento) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.data_lancamento = data_lancamento;
    }

    // Métodos de Acesso
    public Long getId_filme() {
        return id_filme;
    }

    public void setId_filme(Long id_filme) {
        this.id_filme = id_filme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public LocacaoEntity getLocacao() {
        return locacao;
    }

    public void setLocacao(LocacaoEntity locacao) {
        this.locacao = locacao;
    }

    public List<CategoriaEntity> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<CategoriaEntity> categorias) {
        this.categorias = categorias;
    }
}