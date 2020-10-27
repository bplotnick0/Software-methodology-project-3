import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.control.Alert.AlertType;

public class Controller {

    @FXML
    private TextField fname, lname, balance;

    @FXML
    private DatePicker d = new DatePicker();

    @FXML

    void add (ActionEvent event){
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Test");
        alert.setContentText(d.getValue());
    }

}