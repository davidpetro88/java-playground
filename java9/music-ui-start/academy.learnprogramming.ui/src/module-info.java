module academy.learnprogramming.ui {
    requires javafx.fxml;
    requires javafx.controls;
    requires academy.learnprogramming.db;

    exports academy.learnprogramming.ui to javafx.graphics, javafx.fxml;
    opens academy.learnprogramming.ui to javafx.fxml;
}