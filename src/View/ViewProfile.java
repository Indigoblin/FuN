package View;

import Model.Utilisateur;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;


public class ViewProfile {
    private ViewHandler vhProfile;
    private ViewSubscribe viewSubscribe;
    private VBox root;
    private HBox nameBox, adressBox;
    private Label nomPro, prenomPro, mailPro, adressPro, codePoPro, townPro, mdpPro;
    protected TextField nameInp, prenoInp, adressInp, codePoInp, townInp, mailInp;
    private PasswordField mdpInp;


    public ViewProfile(ViewHandler vhProfile, VBox root){
        this.vhProfile = vhProfile;
        this.root = root;



        // initialisation des labels

        nomPro = new Label("Nom");
        prenomPro = new Label("Prenom");
        mailPro = new Label("email@test.com");
        adressPro = new Label("42 rue du test");
        codePoPro = new Label("68100");
        townPro = new Label("Mulhouse");
        mdpPro = new Label("Test");

        // initialisation des boites
        nameBox = new HBox(prenomPro,nomPro);
        nameBox.setAlignment(Pos.CENTER);
        nameBox.setSpacing(10);
        adressBox = new HBox(codePoPro,townPro);
        adressBox.setAlignment(Pos.CENTER);
        adressBox.setSpacing(5);

        initView();
    }

    void initView(){
        root.getChildren().clear();
        root.getChildren().add(nameBox);
        root.getChildren().add(mailPro);
        root.getChildren().add(adressPro);
        root.getChildren().add(adressBox);
    }

}
