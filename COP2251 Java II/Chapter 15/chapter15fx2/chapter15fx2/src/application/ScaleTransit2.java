package application;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScaleTransit2 extends Application {
    @Override
    public void start(Stage stage) { 	
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 600, 600);
        stage.setScene(scene);

        ImageView card = new ImageView("image/card/1.png");
        pane.setCenter(card);
    
        ScaleTransition st = new ScaleTransition(Duration.millis(1500), card);
        st.setByX(1.5f);
        st.setByY(1.5f);
        st.setAutoReverse(true);
    
        st.play();
        stage.show(); 
    }
    public static void main(String[] args) {
        launch(args);
    }
}