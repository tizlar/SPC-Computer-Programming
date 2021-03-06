//SPC ID# 00002491103
//Tristan Izlar

package izlar15;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Exercise15_1 extends Application {
	
	
	private Button btRefresh = new Button("Refresh");
	private GridPane cardsPane = new GridPane();
	private GridPane buttonPane = new GridPane();
	private BorderPane mainPane = new BorderPane();
	
	@Override
	public void start(Stage primaryStage) {
		
		//setting up grid pane object for card images
		cardsPane.setPadding(new Insets(10));
		cardsPane.setHgap(5);
		cardsPane.setVgap(5);
		
		// default card values
		refresher();
		
		// setting up buttonPane object for button
		buttonPane.add(btRefresh, 0, 0);
		buttonPane.setAlignment(Pos.CENTER);
		
		// adding grid panes to border pane
		mainPane.setTop(cardsPane);
		mainPane.setBottom(buttonPane);
	
		// adding event handling for refresh button
		btRefresh.setOnAction(e -> refresher());
		
		// creating scene and placing it in stage
		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("Exercise15_01");
		primaryStage.setScene(scene);
		
		// displaying the stage
		primaryStage.show();
	}
	
	// function to refresh cardsPane
	private void refresher() {
		for (int i = 0; i < 4; i++) {
			Integer rnd = (int)(Math.random() * 52) + 1;
			String cardNum = rnd.toString();
			ImageView card = new ImageView(new Image(cardNum + ".png"));
			cardsPane.add(card, i, 0);
			}
	}
	
	// main
	public static void main(String[] args) {
		 launch(args);
	}
	
}
