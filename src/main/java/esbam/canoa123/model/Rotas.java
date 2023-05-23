/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.model;

/**
 *
 * @author ACER
 */
public class Rotas {
    private int id;
    private float valor;
    private Cidades origem;
    private Cidades destino;
    private Categorias categoria;

    public Rotas(int id, float valor, Cidades origem, Cidades destino, Categorias categoria) {
        this.id = id;
        this.valor = valor;
        this.origem = origem;
        this.destino = destino;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public float getValor() {
        return valor;
    }

    public Cidades getOrigem() {
        return origem;
    }

    public Cidades getDestino() {
        return destino;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setOrigem(Cidades origem) {
        this.origem = origem;
    }

    public void setDestino(Cidades destino) {
        this.destino = destino;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}
