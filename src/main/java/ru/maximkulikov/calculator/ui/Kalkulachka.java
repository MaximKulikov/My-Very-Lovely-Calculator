package ru.maximkulikov.calculator.ui;

import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import ru.maximkulikov.calculator.Calculator;

/**
 * Lovely-Calculator
 *
 * @autor Maxim Kulikov
 * @since 01.09.2018
 */
public class Kalkulachka {

    private static final String INDEX_HTML = "web/index.html";

    @FXML
    private WebView webView;

    private WebEngine webEngine;

    @FXML
    private void initialize() throws Exception {
        //Not Yet realize
        webEngine = webView.getEngine();
        Path url = Paths.get(System.getProperty("user.dir"), "exterene/index.html");

        webEngine.load(Calculator.class.getResource(INDEX_HTML).toExternalForm());
    }
}
