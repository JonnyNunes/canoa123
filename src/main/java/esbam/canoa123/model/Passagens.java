/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esbam.canoa123.model;

/**
 *
 * @author ACER
 */
public class Passagens {
    
    private int id;
    private Passageiros id_passageiro;
    private Rotas id_rota;

    public Passagens(int id, Passageiros id_passageiro, Rotas id_rota) {
        this.id = id;
        this.id_passageiro = id_passageiro;
        this.id_rota = id_rota;
    }

    public int getId() {
        return id;
    }

    public Passageiros getId_passageiro() {
        return id_passageiro;
    }

    public Rotas getId_rota() {
        return id_rota;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_passageiro(Passageiros id_passageiro) {
        this.id_passageiro = id_passageiro;
    }

    public void setId_rota(Rotas id_rota) {
        this.id_rota = id_rota;
    }
}
