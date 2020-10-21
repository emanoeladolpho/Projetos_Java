package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class TabelaController implements Initializable {
    @FXML
    TableView<Produto> tabela = new TableView<>();
    @FXML
    TableColumn<Produto,Integer> quantidade;
    @FXML
    TableColumn<Produto,String> nome;
    @FXML
    TableColumn<Produto,Double> preco;
    @FXML
    TableColumn<Produto,String> codigo;
    @FXML
    Button botao;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        quantidade.setCellValueFactory(new PropertyValueFactory<>("Quantidade"));
        nome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        preco.setCellValueFactory(new PropertyValueFactory<>("Preco"));
        codigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
        tabela.setItems(observableList);
    }

    ObservableList<Produto> observableList = FXCollections.observableArrayList(
            new Produto(5,"Teste",20.34,"Teste"),
            new Produto(6,"Teste2",35.49,"Teste2"),
            new Produto(15,"Suco",1.15,"123456")
    );

    public void clicar(){
    }
}
