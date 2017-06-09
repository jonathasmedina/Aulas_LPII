/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10OverLoadOverride;

/**
 *
 * @author Jonathas
 */
public class Cliente extends Pessoa {

    int id;
    float desconto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDesconto() {
        return desconto;
    }

    @Override
    public void setDesconto(float desconto) {
        this.desconto = (float) (desconto * 0.25);
    }

}
