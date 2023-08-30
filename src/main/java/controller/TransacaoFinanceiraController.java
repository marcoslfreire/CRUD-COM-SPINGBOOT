package controller;

import model.TransacaoFinanceira;
import service.TransacaoFinanceiraService;

import java.util.List;

public class TransacaoFinanceiraController {
    private TransacaoFinanceiraService transacaoFinanceiraService;

    public TransacaoFinanceiraController() {
        this.transacaoFinanceiraService = new TransacaoFinanceiraService();
    }

    // Método para adicionar uma transação financeira
    public void adicionarTransacao(TransacaoFinanceira transacao) {
        transacaoFinanceiraService.adicionarTransacao(transacao);
    }

    // Método para listar todas as transações financeiras
    public List<TransacaoFinanceira> listarTransacoes() {
        return transacaoFinanceiraService.listarTransacoes();
    }

    // Método para obter uma transação financeira pelo seu ID
    public TransacaoFinanceira obterTransacaoPorId(int id) {
        return transacaoFinanceiraService.obterTransacaoPorId(id);
    }
}
