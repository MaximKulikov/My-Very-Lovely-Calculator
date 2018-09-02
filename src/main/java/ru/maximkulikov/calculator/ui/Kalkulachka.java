package ru.maximkulikov.calculator.ui;

import static es.uvigo.ei.sing.javafx.webview.Java2JavascriptUtils.connectBackendObject;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import ru.maximkulikov.calculator.Calculator;
import ru.maximkulikov.calculator.KalkulachkaService;

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
        connectBackendObject(webView.getEngine(), "kalkulachkaService", new KalkulachkaService());
        webEngine.load(Calculator.class.getResource(INDEX_HTML).toExternalForm());
    }
}
