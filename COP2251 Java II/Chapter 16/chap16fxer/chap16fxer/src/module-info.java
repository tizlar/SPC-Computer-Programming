module chap16fxer {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
