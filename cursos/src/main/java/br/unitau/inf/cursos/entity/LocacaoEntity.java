package br.unitau.inf.cursos.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "locacao")
public class LocacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao")
    private Long id_locacao;

    @Column(name = "preco")
    private float preco;

    @Column(name = "data_locacao")
    private Date data_locacao;

    @Column(name = "data_devolucao")
    private Date data_devolucao;

    @OneToOne(mappedBy = "locacao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private FilmeEntity filme;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;

    // Construtores
    public LocacaoEntity() {
    }

    public LocacaoEntity(Long id_locacao, float preco, Date data_locacao, Date data_devolucao, FilmeEntity filme) {
        this.id_locacao = id_locacao;
        this.preco = preco;
        this.data_locacao = data_locacao;
        this.data_devolucao = data_devolucao;
        this.filme = filme;
    }

    // Métodos de Acesso
    public Long getId_locacao() {
        return id_locacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(Date data_locacao) {
        this.data_locacao = data_locacao;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public FilmeEntity getFilme() {
        return filme;
    }

    public void setFilme(FilmeEntity filme) {
        this.filme = filme;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }
}
