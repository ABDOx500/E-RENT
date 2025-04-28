module ma.ac.esi.erent {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ma.ac.esi.erent to javafx.fxml;
    exports ma.ac.esi.erent;
}