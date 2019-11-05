package Controller;

import Model.ModelSubscribe;
import Model.Utilisateur;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerSubscribe implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelSubscribe modelSubscribe;
    private Utilisateur userModel;

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
            // pouvoir entrer les données récupéré sur ViewSubscribe et les injecter dans l'objet infoUser pour ensuite les récupérer
            launcher.setViewProfile();
        }
    }
}