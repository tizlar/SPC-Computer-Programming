// SPC ID# 00002491103
// Tristan Izlar

package izlar14;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Exercise14_16 extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		// creating new pane to work in
		Pane pane = new Pane();
		
		// creating lines (shape nodes) and binding x/y coordinates to pane width/height
		Line line1 = new Line();
		line1.startXProperty().bind(pane.widthProperty().multiply(.3333));
		line1.endXProperty().bind(pane.widthProperty().multiply(.3333));
		line1.startYProperty().bind(pane.heightProperty());
		line1.setStroke(Color.RED);
		
		Line line2 = new Line();
		line2.startXProperty().bind(pane.widthProperty().multiply(.6666));
		line2.endXProperty().bind(pane.widthProperty().multiply(.6666));
		line2.startYProperty().bind(pane.heightProperty());
		line2.setStroke(Color.RED);
		
		Line line3 = new Line();
		line3.startYProperty().bind(pane.heightProperty().multiply(.3333));
		line3.endYProperty().bind(pane.heightProperty().multiply(.3333));
		line3.startXProperty().bind(pane.widthProperty());
		line3.setStroke(Color.BLUE);
		
		Line line4 = new Line();
		line4.startYProperty().bind(pane.heightProperty().multiply(.6666));
		line4.endYProperty().bind(pane.heightProperty().multiply(.6666));
		line4.startXProperty().bind(pane.widthProperty());
		line4.setStroke(Color.BLUE);
		
		// adding shape nodes to pane
		pane.getChildren().addAll(line1, line2, line3, line4);
		
		// creating scene and placing it in stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise14_16");
		primaryStage.setScene(scene);
				
		// displaying the stage
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);

	}

}
