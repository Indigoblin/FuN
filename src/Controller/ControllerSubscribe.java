package Controller;

import Model.ModelSubscribe;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerSubscribe implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelSubscribe modelSubscribe;

    public ControllerSubscribe(ViewHandler viewHandler, ModelSubscribe modelSubscribe){
        this.modelSubscribe = modelSubscribe;
        this.launcher = viewHandler;
        this.launcher.setEventHandlerSubs(this);
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getvS().getConnectBtn())){
            launcher.setViewConnect();
        }else if(event.getSource().equals(launcher.getvS().getValidBtn())){
            launcher.setViewConnect();
        }
    }
}