/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoIntegrador.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetoIntegrador.model.database.Database;
import projetoIntegrador.model.entity.Produto;

public class ProdutoDAO {

    private static final String TABLE_NAME = "produto";
    //private Statement statement = Database.getInstance();

    public static void salvarProduto(Produto produto) {
//        String query = "INSERT INTO " + TABLE_NAME
//                + " (nome, quantidade, valor) VALUES ("
//                + "'" + produto.getNome() + "', "
//                + produto.getQuantidade() + ", "
//                + produto.getValor()
//                + ")";
//
//        System.out.println(query);
//        try {
//            statement.execute(query);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public static List<Produto> listAllProducts() {
        String query = "SELECT * FROM " + TABLE_NAME;
        List<Produto> products = new ArrayList<>();
        Statement instrucaoSQL = null;
        
//        try {
//            
//            instrucaoSQL = cobe
//            ResultSet rs = statement.executeQuery(query);
//
//            while (rs.next()) {
//                String nome = rs.getString("nome");
//                int quantidade = rs.getInt("quantidade");
//                double valor = rs.getDouble("valor");
//                int id = rs.getInt("id");
//
//                Produto product = new Produto();
//                product.setId(id);
//                product.setNome(nome);
//                product.setQuantidade(quantidade);
//                product.setValor(valor);
//
//                products.add(product);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return products;
    }
}