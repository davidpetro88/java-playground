package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
    @FXML
    private Button clickMeButton;
    @FXML
    private Button clickMeButtonFirst;

    public void initialize() {
        clickMeButtonFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("You clicked me! First");
            }
        });

        clickMeButton.setOnAction(event -> System.out.println("You clicked me! Second"));
    }
}
