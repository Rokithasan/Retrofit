module rokit.com.retrofitconnection {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires com.google.gson;

    opens rokit.com.retrofitconnection to javafx.fxml;
    exports rokit.com.retrofitconnection;
}
