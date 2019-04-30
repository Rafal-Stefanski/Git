package pl.sda.zadania_javafx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class JavaFX {
    public void start(Stage primaryStage) {
        Label label = new Label("Hello World from JavaFX!");

        Button button = new Button("Click me!");
//        button.setOnAction();

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll();

        primaryStage.setTitle("Hello World - JavaFX");
        primaryStage.setScene(new Scene( box,300, 200));
        primaryStage.show();
    }

}
