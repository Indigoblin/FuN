package Controller;

import Model.ModelConnect;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerConnect implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelConnect modelConnect;

    public ControllerConnect(ViewHandler viewHandler, ModelConnect modelConnect){
        this.modelConnect = modelConnect;
        this.launcher = viewHandler;
        this.launcher.setEventHandlerConn(this);
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getvC().getSeConnectBtn())){
            launcher.setViewProfile();
        }
    }
}
