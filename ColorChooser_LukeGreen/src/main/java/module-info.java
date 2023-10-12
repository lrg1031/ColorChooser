module com.mycompany.colorchooser_lukegreen {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.colorchooser_lukegreen to javafx.fxml;
    exports com.mycompany.colorchooser_lukegreen;
}
