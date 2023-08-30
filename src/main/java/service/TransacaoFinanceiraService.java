package service;

import dao.TransacaoFinanceiraDAO;
import model.TransacaoFinanceira;

import java.util.List;

public class TransacaoFinanceiraService {
    private TransacaoFinanceiraDAO transacaoFinanceiraDAO;

    public TransacaoFinanceiraService() {
        this.transacaoFinanceiraDAO = new TransacaoFinanceiraDAO();
    }

    // Método para adicionar uma transação financeira
    public void adicionarTransacao(TransacaoFinanceira transacao) {
        // Validações e lógica de negócio necessárias antes de adicionar a transação
        // ...
        transacaoFinanceiraDAO.adicionarTransacao(transacao);
    }

    // Método para listar todas as transações financeiras
    public List<TransacaoFinanceira> listarTransacoes() {
        return transacaoFinanceiraDAO.listarTransacoes();
    }

    // Método para obter uma transação financeira pelo seu ID
    public TransacaoFinanceira obterTransacaoPorId(int id) {
        return transacaoFinanceiraDAO.obterTransacaoPorId(id);
    }
}

