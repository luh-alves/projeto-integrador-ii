/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoIntegrador.model.entity;

/**
 *
 * @author Luciana Alves
 */
public class Customer {
    private String nome;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Customer{" + "nome=" + nome + '}';
    }
    
    
    
}
