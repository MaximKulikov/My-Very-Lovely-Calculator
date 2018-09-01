package ru.maximkulikov.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import ru.maximkulikov.calculator.ui.Kalkulachka;

/**
 * Lovely-Calculator
 *
 * @autor Maxim Kulikov
 * @since 01.09.2018
 */
@Slf4j
public class Calculator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Kalkulachka.class.getResource("Kalkulachka.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Kalkulachka");
        stage.getIcons().add(new Image("ru/maximkulikov/calculator/img/logo.png"));
        stage.show();
    }
}
