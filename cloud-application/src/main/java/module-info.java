module com.geek.gloud1.cloudapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.geek.gloud1.cloudapplication to javafx.fxml;
    exports com.geek.gloud1.cloudapplication;
}