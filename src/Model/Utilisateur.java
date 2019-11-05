package Model;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Utilisateur {
    private TextField name, prenom, adresse, codePostal, town, mail;
    private PasswordField mdp;

    public Utilisateur(TextField nameInp, TextField prenoInp, TextField adressInp, TextField codePoInp, TextField townInp, TextField mailInp, PasswordField mdpInp){
        this.name = nameInp;
        this.prenom = prenoInp;
        this.adresse = adressInp;
        this.codePostal = codePoInp;
        this.town = townInp;
        this.mail = mailInp;
        this.mdp = mdpInp;
    }

    // Getters et Setters
    public TextField getName() {
        return name;
    }

    public void setName(TextField name) {
        this.name = name;
    }

    public TextField getPrenom() {
        return prenom;
    }

    public void setPrenom(TextField prenom) {
        this.prenom = prenom;
    }

    public TextField getAdresse() {
        return adresse;
    }

    public void setAdresse(TextField adresse) {
        this.adresse = adresse;
    }

    public TextField getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(TextField codePostal) {
        this.codePostal = codePostal;
    }

    public TextField getTown() {
        return town;
    }

    public void setTown(TextField town) {
        this.town = town;
    }

    public TextField getMail() {
        return mail;
    }

    public void setMail(TextField mail) {
        this.mail = mail;
    }

    public PasswordField getMdp() {
        return mdp;
    }

    public void setMdp(PasswordField mdp) {
        this.mdp = mdp;
    }

    public String toString(){
        return name +" "+  prenom +" "+  mail +" "+ town +" "+ codePostal +" "+  mdp;
    }
}
