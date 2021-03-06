//SPC ID# 00002491103
//Tristan Izlar

package izlar16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Exercise16_2 extends Application {

	private BorderPane mainPane = new BorderPane();
	private StackPane shapePane = new StackPane();
	private RadioButton rbCircle = new RadioButton("Circle");
	private RadioButton rbRec = new RadioButton("Rectangle");
	private RadioButton rbEllipse = new RadioButton("Ellipse");
	private ToggleGroup group = new ToggleGroup();
	private CheckBox chkFill = new CheckBox("Fill");
	private HBox controls = new HBox(15);
	private Circle circle = new Circle();
	private Rectangle rectangle = new Rectangle();
	private Ellipse ellipse = new Ellipse();
	
	@Override
	public void start(Stage primaryStage) {
	
		//setting up shapes and binding to center
		circle.centerXProperty().bind(shapePane.widthProperty().divide(2));
		circle.centerYProperty().bind(shapePane.heightProperty().divide(2));
		circle.setRadius(100);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		rectangle.xProperty().bind(shapePane.widthProperty().divide(2));
		rectangle.yProperty().bind(shapePane.heightProperty().divide(2));
		rectangle.setWidth(200);
		rectangle.setHeight(75);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.WHITE);
		
		ellipse.centerXProperty().bind(shapePane.widthProperty().divide(2));
		ellipse.centerYProperty().bind(shapePane.heightProperty().divide(2));
		ellipse.setRadiusX(100);
		ellipse.setRadiusY(75);
		ellipse.setStroke(Color.BLACK);
		ellipse.setFill(Color.WHITE);
		
		
		// setting up radio button group
		rbCircle.setToggleGroup(group);
		rbRec.setToggleGroup(group);
		rbEllipse.setToggleGroup(group);
		
		// adding controls to main pane and adjusting view
		controls.getChildren().addAll(rbCircle, rbRec, rbEllipse, chkFill);
		controls.setAlignment(Pos.CENTER);
		
		// event handlers for radio buttons & toggle 
		rbCircle.setOnAction(e -> {
			shapePane.getChildren().add(circle);
			shapePane.getChildren().remove(rectangle);
			shapePane.getChildren().remove(ellipse);
			});
		rbRec.setOnAction(e ->  {
			shapePane.getChildren().add(rectangle);
			shapePane.getChildren().remove(circle);
			shapePane.getChildren().remove(ellipse);
			});
		rbEllipse.setOnAction(e ->  {
			shapePane.getChildren().add(ellipse);
			shapePane.getChildren().remove(rectangle);
			shapePane.getChildren().remove(circle);
			});
		
		chkFill.setOnAction (e -> {
		if (chkFill.isSelected()) {
			circle.setFill(Color.CRIMSON);
			rectangle.setFill(Color.CRIMSON);
			ellipse.setFill(Color.CRIMSON);
		}
		else {
			circle.setFill(Color.WHITE);
			rectangle.setFill(Color.WHITE);
			ellipse.setFill(Color.WHITE);
		}
		});
		
		// add HBox and shape pane to main viewable pane
		mainPane.setCenter(shapePane);
		mainPane.setBottom(controls);

		// creating scene and placing it in stage
		Scene scene = new Scene(mainPane, 400, 400);
		primaryStage.setTitle("Exercise16_02");
		primaryStage.setScene(scene);
		
		// displaying the stage
		primaryStage.show();
	}
	
	// main
	public static void main(String[] args) {
		 launch(args);
	}
}
