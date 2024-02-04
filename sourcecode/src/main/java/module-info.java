module hust.soict.hedspi.miniproject.sourcecode {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens hust.soict.hedspi.miniproject.sourcecode to javafx.fxml;
    opens hust.soict.hedspi.miniproject.sourcecode.GUI.home to javafx.fxml;
    opens hust.soict.hedspi.miniproject.sourcecode.GUI.virus_list to javafx.fxml;
    opens hust.soict.hedspi.miniproject.sourcecode.GUI.virus_details to javafx.fxml;

    exports hust.soict.hedspi.miniproject.sourcecode;
}