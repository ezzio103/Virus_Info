package hust.soict.hedspi.miniproject.sourcecode.GUI.virus_list;

import hust.soict.hedspi.miniproject.sourcecode.GUI.home.HomeController;
import hust.soict.hedspi.miniproject.sourcecode.GUI.virus_details.VirusController;
import hust.soict.hedspi.miniproject.sourcecode.Main;
import hust.soict.hedspi.miniproject.sourcecode.entity.Virus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class VirusListController implements Initializable {

    @FXML
    public ListView<Button> buttonListView;
    private final List<Virus> virusList = new ArrayList<>();

    @FXML
    public void backToHomePage(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomeController.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage= (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle(Main.APP_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void chooseVirus(ActionEvent actionEvent) {
        System.out.println("choosing virus...");
        String buttonText = ((Button) actionEvent.getSource()).getText();

        Virus selectedVirus = virusList.stream()
                .filter(virus -> virus.getName().equals(buttonText))
                .findFirst()
                .orElse(null);

        System.out.println(selectedVirus);
        if(selectedVirus != null){
            openDetailVirusScreen(selectedVirus, actionEvent);
        } else {
            System.out.println("No virus was selected!");
        }
    }

    private void openDetailVirusScreen(Virus selectedVirus, ActionEvent actionEvent){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(VirusController.class.getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            // Get the controller associated with the loader
            VirusController virusController = fxmlLoader.getController();

            // Pass the selected virus to the DetailVirusController
            if (virusController == null){
                System.out.println("virus controller is null");
                return;
            }

            virusController.setSelectedVirus(selectedVirus);

            // Set up the new stage
            Scene scene = new Scene(root);
            Stage stage= (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(Main.APP_TITLE + " | " + selectedVirus.getName());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Virus List Controller is initialized.");
    }

    public void displayVirusList(List<Virus> viruses){
        this.virusList.addAll(viruses);
        buttonListView.getItems().clear();
        for(Virus virus : viruses){
            Button virusButton = new Button(virus.getName());
            virusButton.setPrefHeight(50);
            virusButton.setStyle("-fx-font-size: 20px; -fx-font-weight: 600");
            virusButton.setOnAction(this::chooseVirus);
            buttonListView.getItems().add(virusButton);
        }
    }
}
