// SPC ID# 00002491103
// Tristan Izlar

package izlar14;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Exercise14_1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		//creating grid pane object
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10));
		pane.setHgap(5);
		pane.setVgap(5);
		
		// creating image objects
		Image germanyFlg = new Image("flag1.gif");
		Image chinaFlg = new Image("flag2.gif");
		Image franceFlg = new Image("fr.gif");
		Image usFlg = new Image("flag6.gif");
		
		
		// imageView nodes to hold image objects (bound imageView width/height properties to support pane resizing)
		ImageView imageView1 = new ImageView(germanyFlg);
		imageView1.fitWidthProperty().bind(pane.widthProperty().divide(2));
	    imageView1.fitHeightProperty().bind(pane.heightProperty().divide(2));
	    
	    ImageView imageView2 = new ImageView(chinaFlg);
	    imageView2.fitWidthProperty().bind(pane.widthProperty().divide(2));
	    imageView2.fitHeightProperty().bind(pane.heightProperty().divide(2));
	    
	    ImageView imageView3 = new ImageView(franceFlg);
	    imageView3.fitWidthProperty().bind(pane.widthProperty().divide(2));
	    imageView3.fitHeightProperty().bind(pane.heightProperty().divide(2));
	    
	    ImageView imageView4 = new ImageView(usFlg);
	    imageView4.fitWidthProperty().bind(pane.widthProperty().divide(2));
	    imageView4.fitHeightProperty().bind(pane.heightProperty().divide(2));
	    
	    // adding imageView nodes to pane
		pane.add(imageView1, 0, 0);
		pane.add(imageView2, 1, 0);
		pane.add(imageView3, 0, 1);
		pane.add(imageView4, 1, 1);
		
		// creating scene and placing it in stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_01");
		primaryStage.setScene(scene);
		
		// displaying the stage
		primaryStage.show();
	}

	
	public static void main(String[] args) {
		 launch(args);
	}
	
}