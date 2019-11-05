package View;

import Controller.ControllerConnect;
import Controller.ControllerSubscribe;
import Model.ModelConnect;
import Model.ModelProfile;
import Model.ModelSubscribe;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private VBox root;
    private Scene scene;
    private ViewSubscribe vS;
    private ViewConnect vC;
    private ViewProfile vP;
    private ModelSubscribe modelSubscribe;
    private ControllerSubscribe controllerSubscribe;
    private ControllerConnect controllerConnect;
    private ModelConnect modelConnect;
    private ModelProfile modelProfile;


    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;

        root = new VBox();
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        scene = new Scene(root,1200,750, Color.ALICEBLUE);
        modelConnect = new ModelConnect();
        modelSubscribe = new ModelSubscribe();
        modelProfile = new ModelProfile();

        vS = new ViewSubscribe(this,root);
        vC = new ViewConnect(this,root);
        vP = new ViewProfile(this,root);
        controllerSubscribe = new ControllerSubscribe(this,modelSubscribe);
        controllerConnect = new ControllerConnect(this,modelConnect);


        primaryStage.setTitle("FuN - Where all the fun really start");
        primaryStage.setScene(scene);
        primaryStage.show();
        setViewSubscribe();
    }

    // Getters et Setters
    public void setEventHandlerSubs(ControllerSubscribe cm) {
        vS.setEventsSubs(cm);
    }

    public void setEventHandlerConn(ControllerConnect cc){
        vC.setEventsConn(cc);
    }

    public ViewSubscribe getvS(){
        return vS;
    }

    public void setViewSubscribe(){
        vS.initView();
    }

    public ViewConnect getvC(){
        return vC;
    }

    public void setViewConnect(){
        vC.initView();
    }

    public ViewProfile getvP(){
        return vP;
    }

    public void setViewProfile(){
        vP.initView();
    }
}
