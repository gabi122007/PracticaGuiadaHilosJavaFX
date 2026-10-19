module ni.edu.uam.practicaguiadahilosjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.practicaguiadahilosjavafx to javafx.fxml;
    exports ni.edu.uam.practicaguiadahilosjavafx;
}