module rokit.com.retrofitconnection {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires java.sql;


    opens rokit.com.retrofitconnection to javafx.fxml;
    opens rokit.com.retrofitconnection.model;
    exports rokit.com.retrofitconnection;
}
