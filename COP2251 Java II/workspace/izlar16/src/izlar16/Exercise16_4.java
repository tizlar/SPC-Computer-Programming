//SPC ID# 00002491103
//Tristan Izlar

package izlar16;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Exercise16_4 extends Application {
	
	private TextField tfMiles = new TextField();
	private TextField tfKilo = new TextField();
	private GridPane grid = new GridPane();
	private final double CONVERT = 1.609;
	double m, k;
	
	@Override
	public void start(Stage primaryStage) {
		
		grid.add(new Label("Miles: "), 0, 0);
		grid.add(new Label("Kilometers: "), 0, 1);
		grid.add(tfMiles, 1, 0);
		grid.add(tfKilo, 1, 1);
		
	
		// creating scene and placing it in stage
		Scene scene = new Scene(grid);
		primaryStage.setTitle("Exercise16_04");
		primaryStage.setScene(scene);
		
		// event handlers to handle conversions
		scene.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER && tfMiles.isFocused()) {
				m = Double.parseDouble(tfMiles.getText());
				k = m * CONVERT;
				tfKilo.setText(String.format("%.5f", k));
			}
			else if (e.getCode() == KeyCode.ENTER && tfKilo.isFocused()) {
				k = Double.parseDouble(tfKilo.getText());
				m = k / CONVERT;
				tfMiles.setText(String.format("%.5f", m));
			}
		});
		
		// displaying the stage
		primaryStage.show();
		}
			
		// main
		public static void main(String[] args) {
			 launch(args);
		}
	}
