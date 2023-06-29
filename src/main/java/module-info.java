module de.iav.eventhandler_keypress {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens de.iav.eventhandler_keypress to javafx.fxml;
    exports de.iav.eventhandler_keypress;
}