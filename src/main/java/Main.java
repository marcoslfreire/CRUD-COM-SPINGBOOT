
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import controller.EstoqueController;
import dao.EstoqueDAO;
import model.Estoque;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        // Defina a porta em que o servidor irá rodar
        int port = 8081;

        // Inicialize o HttpServer
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        // Defina o contexto do servidor (raiz)
        server.createContext("/", (HttpHandler) new EstoqueController());

        // Inicie o servidor
        server.start();

        System.out.println("Servidor rodando na porta " + port);


    }


}


