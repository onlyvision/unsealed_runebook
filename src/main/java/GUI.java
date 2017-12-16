import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class GUI extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("Unsealed Runebook");
        stage.getIcons().add(new Image(GUI.class.getResourceAsStream("icon.png")));
        stage.setScene(scene);
        stage.show();
    }
}
