package Generics;

import java.util.Objects;

public class Marca {
    private Long codigo;

    private String nome;

    private String nomeMod;

    private Double preco;

    private Long quantidade;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMod() {
        return nomeMod;
    }

    public void setNomeMod(String nomeMod) {
        this.nomeMod = nomeMod;
    }

    public void addQuantidade() {
        this.quantidade++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marca marca = (Marca) o;
        return Objects.equals(codigo, marca.codigo) && Objects.equals(nome, marca.nome) && Objects.equals(nomeMod, marca.nomeMod) && Objects.equals(preco, marca.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, nomeMod, preco);
    }
}
