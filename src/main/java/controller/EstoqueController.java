package controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import model.Estoque;
import service.EstoqueService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EstoqueController implements HttpHandler {
    private EstoqueService estoqueService;

    public EstoqueController() throws SQLException {
        this.estoqueService = new EstoqueService();
    }

    // Método para adicionar um produto ao estoque
    public void adicionarProduto(Estoque produto) {
        estoqueService.adicionarProduto(produto);
    }

    // Método para atualizar um produto no estoque
    public void atualizarProduto(Estoque produto) {
        estoqueService.atualizarProduto(produto);
    }

    // Método para remover um produto do estoque
    public void removerProduto(int id) {
        estoqueService.removerProduto(id);
    }

    // Método para listar todos os produtos no estoque
    public List<Estoque> listarProdutos() {
        return estoqueService.listarProdutos();
    }

    // Método para obter um produto pelo seu ID
    public Estoque obterProdutoPorId(int id) {
        return estoqueService.obterProdutoPorId(id);
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {

    }
}
