package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
//


        GridPane root2 = new GridPane();
        root2.setAlignment(Pos.CENTER);
        root2.setVgap(10);
        root2.setHgap(10);

        Label greeting = new Label("Welcome Javax");
        greeting.setTextFill(Color.GREEN);
        greeting.setFont(Font.font("Times new Roman", FontWeight.BOLD, 70));
        root2.getChildren().add(greeting);


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root2, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
