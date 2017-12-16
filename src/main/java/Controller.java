import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ScrollPane championPane;

    @FXML
    private SplitPane selectionPane;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private VBox optionsPane;

    public void initialize(URL location, ResourceBundle resources) {
        
    }
}