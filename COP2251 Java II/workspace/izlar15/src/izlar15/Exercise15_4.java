//SPC ID# 00002491103
//Tristan Izlar

package izlar15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Exercise15_4 extends Application {
	
	private GridPane inputPane = new GridPane();
	private GridPane buttonPane = new GridPane();
	private BorderPane mainPane = new BorderPane();
	private TextField tfNum1 = new TextField();
	private TextField tfNum2 = new TextField();
	private TextField tfNum3 = new TextField();
	private Button btAdd = new Button("Add");
	private Button btSub = new Button("Subtract");
	private Button btMult = new Button("Multiple");
	private Button btDiv = new Button("Divide");
	
	@Override
	public void start(Stage primaryStage) {
		
		// grid pane set up for text fields and labels
		inputPane.setPadding(new Insets(20));
		inputPane.setHgap(10);
		inputPane.setVgap(10);
		inputPane.add(new Label("Number 1:"), 0, 0);
		inputPane.add(tfNum1, 1, 0);
		inputPane.add(new Label("Number 2:"), 3, 0);
		inputPane.add(tfNum2, 4, 0);
		inputPane.add(new Label("Results:"), 5, 0);
		inputPane.add(tfNum3, 6, 0);
		tfNum3.setEditable(false);
		
		
		// grid pane set up for buttons used
		buttonPane.setPadding(new Insets(20));
		buttonPane.setHgap(10);
		buttonPane.setVgap(10);
		buttonPane.add(btAdd, 0, 0);
		buttonPane.add(btSub, 1, 0);
		buttonPane.add(btMult, 2, 0);
		buttonPane.add(btDiv, 3, 0);
		buttonPane.setAlignment(Pos.CENTER);
		
		// adding other panes to main pane for viewing everything
		mainPane.setTop(inputPane);
		mainPane.setBottom(buttonPane);
		
		// event handlers
		btAdd.setOnAction(e -> {
			blankFill();
			add();
		});
		btSub.setOnAction(e -> {
			blankFill();
			sub();
		});
		btMult.setOnAction(e -> {
			blankFill();
			mult();
		});
		btDiv.setOnAction(e -> {
			blankFill();
			div();
		});
		
		// creating scene and placing it in stage
		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("Exercise15_04");
		primaryStage.setScene(scene);
		
		// displaying the stage
		primaryStage.show();

	}

	// function to add
	private void add() {
		double x = Double.parseDouble(tfNum1.getText());
		double y = Double.parseDouble(tfNum2.getText());
		double z = x + y;
		tfNum3.setText(String.format("%.3f", z));
	}
	// function to subtract
	private void sub() {
		double x = Double.parseDouble(tfNum1.getText());
		double y = Double.parseDouble(tfNum2.getText());
		double z = x - y;
		tfNum3.setText(String.format("%.3f", z));
	}
	// function to multiple
	private void mult() {
		double x = Double.parseDouble(tfNum1.getText());
		double y = Double.parseDouble(tfNum2.getText());
		double z = x * y;
		tfNum3.setText(String.format("%.3f", z));
	}
	// function to divide
	private void div() {
		double x = Double.parseDouble(tfNum1.getText());
		double y = Double.parseDouble(tfNum2.getText());
		double z = x / y;
		tfNum3.setText(String.format("%.3f", z));
	}
	// function to handle when fields are left blank
	private void blankFill() {
		if (tfNum1.getText() == "") {
			tfNum1.setText("0");
		}
		if (tfNum2.getText() == "") {
			tfNum2.setText("0");
		}
	}
	
	// main
	public static void main(String[] args) {
		 launch(args);
	}
}
