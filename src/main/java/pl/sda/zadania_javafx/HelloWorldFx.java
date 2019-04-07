package pl.sda.zadania_javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Changed label!");

        Button button = new Button("Button text changed - Click!");
        button.setOnAction(e -> System.out.println("Button was clicked!"));

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label, button);



        primaryStage.setTitle("Hello World - JavaFX");
        primaryStage.setScene(new Scene(box, 300, 200));
        primaryStage.show();

        TextField textField = new TextField("nowe pole tekstowe - wpisz coś!");

        Label label1=new Label("nowy label1");

        Button button1 = new Button("nowy przycisk");
                button1.setOnAction(event -> label1.setText(label1.getText()));


        box.getChildren().addAll(textField, label1, button1);


    }
}
