package dao;
import model.Estoque;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstoqueDAO{

    // Método para adicionar um produto ao estoque
    public void adicionarProduto(Estoque produto) {
        try (Connection connection = util.ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO estoque (nome, codigo, preco, quantidade_em_estoque) VALUES (?, ?, ?, ?)"
             )) {
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setInt(2, produto.getCodigo());
            preparedStatement.setDouble(3, produto.getPreco());
            preparedStatement.setInt(4, produto.getQuantidadeEmEstoque());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para atualizar um produto no estoque
    public void atualizarProduto(Estoque produto) {
        try (Connection connection = util.ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE estoque SET nome = ?, codigo = ?, preco = ?, quantidade_em_estoque = ? WHERE id = ?"
             )) {
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setInt(2, produto.getCodigo());
            preparedStatement.setDouble(3, produto.getPreco());
            preparedStatement.setInt(4, produto.getQuantidadeEmEstoque());
            preparedStatement.setInt(5, produto.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para remover um produto do estoque
    public void removerProduto(int id) {
        try (Connection connection = util.ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM estoque WHERE id = ?"
             )) {
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para listar todos os produtos no estoque
    public List<Estoque> listarProdutos() {
        List<Estoque> estoque = new ArrayList<>();
        try (Connection connection = util.ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT id, nome, codigo, preco, quantidade_em_estoque FROM estoque"
             )) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                int codigo = resultSet.getInt("codigo");
                double preco = resultSet.getDouble("preco");
                int quantidadeEmEstoque = resultSet.getInt("quantidade_em_estoque");

                Estoque produto = new Estoque(id, nome, codigo, preco, quantidadeEmEstoque);
                estoque.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estoque;
    }

    // Método para obter um produto pelo seu ID
    public Estoque obterProdutoPorId(int id) {
        Estoque produto = null;
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT nome, codigo, preco, quantidade_em_estoque FROM estoque WHERE id = ?"
             )) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String nome = resultSet.getString("nome");
                int codigo = resultSet.getInt("codigo");
                double preco = resultSet.getDouble("preco");
                int quantidadeEmEstoque;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }
}






