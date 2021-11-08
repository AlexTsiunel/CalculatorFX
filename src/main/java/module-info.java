module com.calculator.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculator.calculatorfx to javafx.fxml;
    exports com.calculator.calculatorfx;
}