package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Example7 extends Application {
	// declaring attributes here makes them accessible
	private GridPane grid;
	private Button hand;
	
	double angle = 0.0;		
	Rotate rotate = new Rotate();

	@Override
	public void start(Stage primaryStage) {
		// now we create the GridPane object
		grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(5);
		grid.setVgap(5);


		hand = new Button("New Hand");
		hand.getTransforms().add(rotate);
		// make an instance of our event handler class
		HandHandler deal = new HandHandler();
		// register the handler with the hand button
		hand.setOnAction(deal);
		
		// add button to the first cell in the grid
		grid.add(hand, 0, 0);
		for (int i = 1; i <= 5; i++) {
			Integer rnd = (int) (Math.random() * 52) + 1;
			String s = rnd.toString();
			ImageView crd = new ImageView("image/card/" + s + ".png");
			grid.add(crd, i, 0);
		}

		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setTitle("Poker Hands"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	// this is an event handler class 
	class HandHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			for (int i = 1; i <= 5; i++) {
				Integer rnd = (int) (Math.random() * 52) + 1;
				String s = rnd.toString();
				ImageView crd = new ImageView("image/card/" + s + ".png");
				grid.add(crd, i, 0);			
			}
			angle += 90;
			rotate.setAngle(angle);
			rotate.setPivotX(hand.getWidth() / 2);
			rotate.setPivotY(hand.getHeight() / 2);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
