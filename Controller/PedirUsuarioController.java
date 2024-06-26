package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PedirUsuarioController {
    public void botaolivro(ActionEvent event) throws IOException {
        // Adicionando log para verificar se o método é chamado
        System.out.println("Botão pressionado, tentando carregar acervo_livros_usu.fxml");

        // Carrega o novo conteúdo que deve ser exibido
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("pedir_livros.fxml"));
        } catch (IOException e) {
            System.err.println("Erro ao carregar acervo_livros_usu.fxml: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Adicionando log para verificar se o menu_usuario.fxml está sendo carregado corretamente
        System.out.println("Tentando carregar menu_usuario.fxml");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_usuario.fxml"));
        Parent menuRoot;
        try {
            menuRoot = loader.load();
        } catch (IOException e) {
            System.err.println("Erro ao carregar menu_usuario.fxml: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Obtém o controlador associado ao menu
        MenuUsuarioController menuUsuarioController = loader.getController();
        if (menuUsuarioController == null) {
            System.err.println("Erro: controlador do menu_usuario.fxml é nulo.");
            return;
        }

        // Limpa e adiciona o novo conteúdo na área de conteúdo do controlador do menu
        System.out.println("Atualizando a área de conteúdo com o novo FXML.");
        menuUsuarioController.area_conteudo.getChildren().clear();
        menuUsuarioController.area_conteudo.getChildren().add(root);

        // Define a nova cena e exibe
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(menuRoot));
        stage.show();

        System.out.println("Tela carregada com sucesso.");
    }

    public void botaoFilme(ActionEvent event) throws IOException {
        // Adicionando log para verificar se o método é chamado
        System.out.println("Botão pressionado, tentando carregar acervo_filmes_usu.fxml");

        // Carrega o novo conteúdo que deve ser exibido
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("pedir_filmes.fxml"));
        } catch (IOException e) {
            System.err.println("Erro ao carregar acervo_livros_usu.fxml: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Adicionando log para verificar se o menu_usuario.fxml está sendo carregado corretamente
        System.out.println("Tentando carregar menu_usuario.fxml");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_usuario.fxml"));
        Parent menuRoot;
        try {
            menuRoot = loader.load();
        } catch (IOException e) {
            System.err.println("Erro ao carregar menu_usuario.fxml: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Obtém o controlador associado ao menu
        MenuUsuarioController menuUsuarioController = loader.getController();
        if (menuUsuarioController == null) {
            System.err.println("Erro: controlador do menu_usuario.fxml é nulo.");
            return;
        }

        // Limpa e adiciona o novo conteúdo na área de conteúdo do controlador do menu
        System.out.println("Atualizando a área de conteúdo com o novo FXML.");
        menuUsuarioController.area_conteudo.getChildren().clear();
        menuUsuarioController.area_conteudo.getChildren().add(root);

        // Define a nova cena e exibe
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(menuRoot));
        stage.show();

        System.out.println("Tela carregada com sucesso.");
    }

}
