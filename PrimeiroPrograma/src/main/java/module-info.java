module aplication.primeiroprograma {
    requires javafx.controls;
    requires javafx.fxml;

    opens aplication.primeiroprograma to javafx.fxml;
    exports aplication.primeiroprograma;
}
