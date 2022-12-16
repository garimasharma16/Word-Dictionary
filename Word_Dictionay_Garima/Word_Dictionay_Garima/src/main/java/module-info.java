module garima.word_dictionay_garima {
    requires javafx.controls;
    requires javafx.fxml;


    opens garima.word_dictionay_garima to javafx.fxml;
    exports garima.word_dictionay_garima;
}