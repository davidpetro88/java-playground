module academy.learnprogramming.jokeapp.ui {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
    requires academy.learnprogramming.jokeserver;

    uses academy.learnprogramming.jokeserver.JokeServer;
    opens academy.learnprogramming.jokeapp.ui to javafx.fxml, javafx.graphics;
}