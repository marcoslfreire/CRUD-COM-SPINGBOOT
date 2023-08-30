package service;

import dao.EstoqueDAO;
import model.Estoque;

import java.sql.SQLException;
import java.util.List;

public class EstoqueService {
    private EstoqueDAO estoqueDAO;

    public EstoqueService() throws SQLException {
        this.estoqueDAO = new EstoqueDAO();
    }

    // Método para adicionar um produto ao estoque
    public void adicionarProduto(Estoque produto) {
        // Validações e lógica de negócio necessárias antes de adicionar o produto
        // ...
        estoqueDAO.adicionarProduto(produto);
    }

    // Método para atualizar um produto no estoque
    public void atualizarProduto(Estoque produto) {
        // Validações e lógica de negócio necessárias antes de atualizar o produto
        // ...
        estoqueDAO.atualizarProduto(produto);
    }

    // Método para remover um produto do estoque
    public void removerProduto(int id) {
        // Validações e lógica de negócio necessárias antes de remover o produto
        // ...
        estoqueDAO.removerProduto(id);
    }

    // Método para listar todos os produtos no estoque
    public List<Estoque> listarProdutos() {
        return estoqueDAO.listarProdutos();
    }

    // Método para obter um produto pelo seu ID
    public Estoque obterProdutoPorId(int id) {
        return estoqueDAO.obterProdutoPorId(id);
    }
}

