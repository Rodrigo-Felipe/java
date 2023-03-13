module aplication.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens aplication.javafx to javafx.fxml;
    exports aplication.javafx;
}
