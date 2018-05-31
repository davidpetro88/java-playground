module academy.learnprogramming.jokeapp.ui {

    requires academy.learnprogramming.jokeserver;


    requires javafx.controls;
    requires javafx.fxml;

    uses academy.learnprogramming.jokeserver.JokeServer;

    opens academy.learnprogramming.jokeapp.ui
            to javafx.graphics, javafx.fxml;

}
