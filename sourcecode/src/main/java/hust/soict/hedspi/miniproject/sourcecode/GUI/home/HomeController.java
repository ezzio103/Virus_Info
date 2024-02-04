package hust.soict.hedspi.miniproject.sourcecode.GUI.home;

import hust.soict.hedspi.miniproject.sourcecode.GUI.virus_list.VirusListController;
import hust.soict.hedspi.miniproject.sourcecode.Main;
import hust.soict.hedspi.miniproject.sourcecode.entity.LipidVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.NonLipidVirus;
import hust.soict.hedspi.miniproject.sourcecode.entity.Virus;
import hust.soict.hedspi.miniproject.sourcecode.service.VirusDataService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    public void chooseLipidVirus(ActionEvent actionEvent) throws IOException {
        List<Virus> lipitViruses = VirusDataService.getInstance().getVirusList()
                .stream()
                .filter(virus -> virus instanceof LipidVirus)
                .toList();

        FXMLLoader fxmlLoader = loadVirusListFXMLFile();
        Parent root = fxmlLoader.load();

        VirusListController virusListController = fxmlLoader.getController();
        virusListController.displayVirusList(lipitViruses);

        Scene scene = new Scene(root, 800, 600);
        Stage stage= (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle(Main.APP_TITLE + " | Lipit virus");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void chooseNonLipidVirus(ActionEvent actionEvent) throws IOException {
        List<Virus> lipitViruses = VirusDataService.getInstance().getVirusList()
                .stream()
                .filter(virus -> virus instanceof NonLipidVirus)
                .toList();

        FXMLLoader fxmlLoader = loadVirusListFXMLFile();
        Parent root = fxmlLoader.load();

        VirusListController virusListController = fxmlLoader.getController();
        virusListController.displayVirusList(lipitViruses);
        Scene scene = new Scene(root, 800, 600);
        Stage stage= (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle(Main.APP_TITLE + " | Non Lipit virus");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void exitApplication(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Xác nhận thoát");
        alert.setHeaderText("Bạn có chắc chắn muốn thoát khỏi ứng dụng?");
        alert.getButtonTypes().forEach(buttonType -> {
            if (buttonType.getButtonData() == ButtonType.OK.getButtonData()){
                ((ButtonBase) alert.getDialogPane().lookupButton(buttonType)).setText("Thoát");
            } else if (buttonType.getButtonData() == ButtonType.CANCEL.getButtonData()) {
                ((ButtonBase) alert.getDialogPane().lookupButton(buttonType)).setText("Hủy");
            }
        });
        alert.showAndWait()
                .filter(res -> res == ButtonType.OK)
                .ifPresent(res -> System.exit(0));
    }

    @FXML
    public void showBasicUsage(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hướng dẫn sử dụng ");
        alert.setContentText("Chọn loại virus -> chọn Virus cụ thể-> chọn 2 chức năng để hiện cấu trúc và cách virus lây nhiễm");


        // Xóa tất cả các nút khác ngoại trừ nút OK
        alert.getButtonTypes().clear();
        alert.getButtonTypes().add(ButtonType.OK);

        alert.showAndWait()
                .ifPresent(res -> {
                    if (res == ButtonType.OK) {
                        // Đóng cửa sổ thông báo khi nút OK được nhấn
                        alert.close();
                    }
                });
    }

    @FXML
    public void showIntendedUse(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mục đích dự án");
        alert.setContentText("Tìm hiểu về Virus");
        // Xóa tất cả các nút khác ngoại trừ nút OK
        alert.getButtonTypes().clear();
        alert.getButtonTypes().add(ButtonType.OK);

        alert.showAndWait()
                .ifPresent(res -> {
                    if (res == ButtonType.OK) {
                        // Đóng cửa sổ thông báo khi nút OK được nhấn
                        alert.close();
                    }
                });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("home controller init...");
    }

    private FXMLLoader loadVirusListFXMLFile (){
        return new FXMLLoader(VirusListController.class.getResource("main.fxml"));
    }
}
