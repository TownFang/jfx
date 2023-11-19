module top.zipblog.javafx.zipjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.zipblog.javafx.zipjavafx to javafx.fxml;
    exports top.zipblog.javafx.zipjavafx;
}