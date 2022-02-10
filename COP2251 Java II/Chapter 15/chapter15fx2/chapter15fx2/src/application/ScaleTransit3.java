package application;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScaleTransit3 extends Application {
    @Override
    public void start(Stage stage) { 	
        HBox pane = new HBox(120);
		pane.setPadding(new Insets(110));

		BorderPane pane2 = new BorderPane();
		pane2.setCenter(pane);
        Scene scene = new Scene(pane2, 1050, 300);
        stage.setScene(scene);

        ImageView card;
        ScaleTransition st;
        Integer[] hand = new Integer[5];
        for (int i = 0; i < 5; i++) {
        	hand[i] = (int)(Math.random() * 52) + 1;
        
        	card = new ImageView("image/card/" + hand[i].toString() + ".png");
	        pane.getChildren().add(card);
	    
	        st = new ScaleTransition(Duration.millis(1000), card);
	        st.setByX(1.5f);
	        st.setByY(1.5f);
	        st.setAutoReverse(true);
	
	        st.play();
	        stage.show();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}