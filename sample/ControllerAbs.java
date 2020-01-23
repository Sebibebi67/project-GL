package sample;

// import java.net.URL;
import java.util.Optional;
// import java.util.ResourceBundle;
// import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public abstract class ControllerAbs {

    @FXML
    void fromAnchorClose(AnchorPane anchor) {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Fermeture");
            alert.setContentText("Voulez-vous quitter l'application?\nToute modification non sauvegardé sera perdue");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK)
            {

                Stage  stage = (Stage) anchor.getScene().getWindow();
                stage.close();
            }
        }


    }



