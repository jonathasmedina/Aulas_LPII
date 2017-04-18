/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercíciosT1.ex3;

import java.util.ArrayList;

/**
 *
 * @author Jonathas
 */
public class Produto {
    private int idProduto;
    private String descricaoProduto;
    private int precoUnidade;
    private ArrayList<ProdutoPedido> produtoPedido; 
    

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(int precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public ArrayList<ProdutoPedido> getProdutoPedido() {
        return produtoPedido;
    }

    public void setProdutoPedido(ArrayList<ProdutoPedido> produtoPedido) {
        this.produtoPedido = produtoPedido;
    }

    
    
    
    
}
