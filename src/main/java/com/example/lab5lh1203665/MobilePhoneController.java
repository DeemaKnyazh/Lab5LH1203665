package com.example.lab5lh1203665;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MobilePhoneController implements Initializable {

    @FXML
    private Label model;

    @FXML
    private ImageView phone;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        phoneImage();

    }

    private void phoneImage(){
        MobilePhone mobilePhone = new MobilePhone("Samsung");
        phone.setImage(mobilePhone.getImage());
        model.setText(mobilePhone.model);
    }
}
