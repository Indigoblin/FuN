package View;

import Controller.ControllerSubscribe;
import Model.Utilisateur;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewSubscribe{
    private ViewHandler vhSubs;
    private Button connectBtn, validBtn;
    private VBox root, containLabelLeft, containLabelRight, containFieldLeft, containFieldRight;
    private HBox containLeft, containRight, containAll;
    protected TextField nameInp, prenoInp, adressInp, codePoInp, townInp, mailInp;
    private PasswordField mdpInp;
    private Label titleSubscrib, subTitle, mdpTxt, nameTxt, prenoTxt, adressTxt, codePoTxt, townTxt, mailTxt;
    private Utilisateur userInfo;

    ViewSubscribe(ViewHandler vhSubs, VBox root){
        this.vhSubs = vhSubs;
        this.root = root;

        // initialisation des labels
        titleSubscrib = new Label("FuN - Inscription");
        titleSubscrib.setFont(new Font("Arial",30));
        subTitle = new Label("Babies don't start strapped with a knife");
        subTitle.setFont(new Font("Arial", 20));
        subTitle.setMinHeight(100);
        subTitle.setMinWidth(100);
        mdpTxt = new Label("Mot de Passe");
        nameTxt = new Label("Nom");
        prenoTxt = new Label("Prenom");
        adressTxt = new Label("Adresse");
        codePoTxt = new Label("Code Postal");
        townTxt = new Label("Ville");
        mailTxt = new Label("Email");

        // initialisation des boutons
        connectBtn = new Button("Connexion");
        validBtn = new Button("Valider");

        // initialisation des champs de texte
        mdpInp = new PasswordField();
        mdpInp.setPromptText("Votre mot de passe");
        mdpInp.setPrefWidth(250);
        mdpInp.setMaxWidth(250);
        nameInp = new TextField("");
        nameInp.setPrefWidth(250);
        nameInp.setMaxWidth(250);
        prenoInp = new TextField("");
        prenoInp.setPrefWidth(250);
        prenoInp.setMaxWidth(250);
        adressInp = new TextField("");
        adressInp.setPrefWidth(250);
        adressInp.setMaxWidth(250);
        codePoInp = new TextField("");
        codePoInp.setPrefWidth(250);
        codePoInp.setMaxWidth(250);
        townInp = new TextField("");
        townInp.setPrefWidth(250);
        townInp.setMaxWidth(250);
        mailInp = new TextField("");
        mailInp.setPrefWidth(250);
        mailInp.setMaxWidth(250);

        // initialisation des boites
        containLabelLeft = new VBox(nameTxt,prenoTxt,mailTxt,mdpTxt);
        containLabelLeft.setAlignment(Pos.CENTER_LEFT);
        containLabelLeft.setPadding(new Insets(15, 20, 15, 20));
        containLabelLeft.setSpacing(28);
        containLabelRight = new VBox(adressTxt,townTxt,codePoTxt);
        containLabelRight.setAlignment(Pos.CENTER_LEFT);
        containLabelRight.setPadding(new Insets(15, 20, 15, 20));
        containLabelRight.setSpacing(28);

        containFieldLeft = new VBox(nameInp,prenoInp,mailInp,mdpInp);
        containFieldLeft.setAlignment(Pos.CENTER_RIGHT);
        containFieldLeft.setPadding(new Insets(15, 20, 15, 20));
        containFieldLeft.setSpacing(20);
        containFieldRight = new VBox(adressInp,townInp,codePoInp);
        containFieldRight.setAlignment(Pos.CENTER_RIGHT);
        containFieldRight.setPadding(new Insets(15, 20, 15, 20));
        containFieldRight.setSpacing(20);

        // boite conteneur gauche label/champ
        containLeft = new HBox(containLabelLeft,containFieldLeft);
        containLeft.setAlignment(Pos.CENTER_LEFT);

        // boite conteneur droite label/champ
        containRight = new HBox(containLabelRight,containFieldRight);
        containRight.setAlignment(Pos.CENTER_RIGHT);

        // boite conteneur du formulaire
        containAll = new HBox(containLeft,containRight);
        containAll.setAlignment(Pos.CENTER);

        initView();

        userInfo = new Utilisateur(nameInp,prenoInp,adressInp,codePoInp,townInp,mailInp,mdpInp);
        System.out.println(userInfo);
    }

    void initView(){
        root.getChildren().clear();
        root.getChildren().add(titleSubscrib);
        root.getChildren().add(subTitle);
        root.getChildren().add(connectBtn);
        root.getChildren().add(containAll);
        root.getChildren().add(validBtn);
    }

    // Getters et Setters
    public void setEventsSubs(ControllerSubscribe mc) {
        connectBtn.setOnMouseClicked(mc);
        validBtn.setOnMouseClicked(mc);
    }

    public Button getConnectBtn() {
        return connectBtn;
    }

    public Button getValidBtn(){
        return validBtn;
    }

    public void setUserInfo(Utilisateur userInfo) {
        this.userInfo = userInfo;
    }
}
