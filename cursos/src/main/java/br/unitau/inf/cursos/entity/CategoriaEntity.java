package br.unitau.inf.cursos.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id_categoria;

    @Column(name = "categoria")
    private String categoria;

    @ManyToMany
    @JoinTable(name = "categoria_filme", joinColumns = @JoinColumn(name = "categoria_id"), inverseJoinColumns = @JoinColumn(name = "filme_id"))
    private Set<FilmeEntity> filmes = new HashSet<>();

    // Construtores
    public CategoriaEntity() {
    }

    public CategoriaEntity(Long id_categoria, String categoria) {
        this.id_categoria = id_categoria;
        this.categoria = categoria;
    }

    // Métodos de Acesso
    public Long getId_categoria() {
        return id_categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Set<FilmeEntity> getFilmes() {
        return filmes;
    }

    public void setFilmes(Set<FilmeEntity> filmes) {
        this.filmes = filmes;
    }
}
