module ehu.eus.recetario {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ehu.eus.recetario to javafx.fxml;
    exports ehu.eus.recetario;
}