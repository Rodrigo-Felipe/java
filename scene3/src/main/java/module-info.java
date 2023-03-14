module aplication.scene3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.desktop;

    opens aplication.scene3 to javafx.fxml;
    exports aplication.scene3;
}
