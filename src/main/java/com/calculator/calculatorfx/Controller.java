package com.calculator.calculatorfx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    private Model model = new Model();
    private Float data = 0.0f;
    private String operator;
    private Boolean start = true;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button mines;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button mult;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clean;

    @FXML
    private Button div;

    @FXML
    private TextField display;

    @FXML
    void processNum(ActionEvent event) {
        if (start) {
            String value = ((Button) event.getSource()).getText();
            display.setText(display.getText() + value);
        }

    }

    @FXML
    void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        switch (value) {
            case "CL":
                display.setText("");
                start = true;
                break;
            case "=": {
                float data2 = 0.0f;
                try {
                    data2 = Float.parseFloat(display.getText());
                }catch (Exception e){

                }
                if(operator != null) {
                    float result = model.operation(data, data2, operator);
                    display.setText(String.valueOf(result));
                    //data=result;
                    start = false;
                }
                break;
            }
            default: {
                operator = value;
                try {
                    data = Float.parseFloat(display.getText());
                }catch (Exception e){
                    data = 0.0f;
                }
                display.setText("");
                start = true;
                break;
            }
        }
    }


    @FXML
    void initialize() {

    }

}