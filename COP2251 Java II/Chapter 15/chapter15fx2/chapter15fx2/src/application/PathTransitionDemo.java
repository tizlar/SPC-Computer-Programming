package application;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane 
    Pane pane = new Pane();
    
    // Create a rectangle
    Rectangle rectangle = new Rectangle (0, 0, 25, 50);
    rectangle.setFill(Color.ORANGE);
    
    // Create a circle
    Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
    rectangle1.setFill(Color.WHITE);
    rectangle1.setStroke(Color.BLACK);
    
    // Add circle and rectangle to the pane
    pane.getChildren().add(rectangle1);
    pane.getChildren().add(rectangle);
    
    // Create a path transition 
    PathTransition pt = new PathTransition();
    pt.setDuration(Duration.millis(500));
    pt.setPath(rectangle1);
    pt.setNode(rectangle);
    pt.setOrientation(
      PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
    pt.setCycleCount(Timeline.INDEFINITE);
    pt.setAutoReverse(false);
    pt.play(); // Start animation 
    
    rectangle1.setOnMousePressed(e -> pt.pause());
    rectangle1.setOnMouseReleased(e -> pt.play());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 400, 400);
    primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
