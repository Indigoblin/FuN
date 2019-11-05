package View;

import Controller.ControllerConnect;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ViewConnect {
    private ViewHandler vhConnect;
    private VBox root, containLabel, containField;
    private HBox containAllCo;
    private Label mailTxt, mdpTxt;
    private TextField mailInpCo;
    private PasswordField mdpInpCo;
    private Button seConnectBtn;

    public ViewConnect(ViewHandler vhConnect, VBox root){
        this.vhConnect = vhConnect;
        this.root = root;

        // initialisation des labels
        mailTxt = new Label("Email");
        mdpTxt = new Label("Mot de passe");

        // initialisation des boutons
        seConnectBtn = new Button("Connexion");

        // initialisation des champs de texte
        mdpInpCo = new PasswordField();
        mdpInpCo.setPromptText("Votre mot de passe");
        mdpInpCo.setPrefWidth(250);
        mdpInpCo.setMaxWidth(250);
        mailInpCo = new TextField("");
        mailInpCo.setPrefWidth(250);
        mailInpCo.setMaxWidth(250);

        // initialisation boite label
        containLabel = new VBox(mailTxt,mdpTxt);
        containLabel.setAlignment(Pos.CENTER_LEFT);
        containLabel.setPadding(new Insets(15, 20, 15, 20));
        containLabel.setSpacing(28);

        // initialisation boite champ
        containField = new VBox(mailInpCo,mdpInpCo);
        containField.setAlignment(Pos.CENTER_RIGHT);
        containField.setPadding(new Insets(15, 20, 15, 20));
        containField.setSpacing(20);

        // initialisation boite formulaire
        containAllCo = new HBox(containLabel,containField);
        containAllCo.setAlignment(Pos.CENTER);

        initView();
    }

    void initView(){
        root.getChildren().clear();
        root.getChildren().add(containAllCo);
        root.getChildren().add(seConnectBtn);
    }

    public void setEventsConn(ControllerConnect cc){
        seConnectBtn.setOnMouseClicked(cc);
    }

    public Button getSeConnectBtn() {
        return seConnectBtn;
    }
}
