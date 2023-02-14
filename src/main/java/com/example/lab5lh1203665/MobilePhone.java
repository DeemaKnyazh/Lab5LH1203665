package com.example.lab5lh1203665;

import javafx.scene.image.Image;

public class MobilePhone {

    public String model = "Samsung";

    public MobilePhone(String model) {
        setModel(model);
    }

    private void setModel(String model) {
        this.model = model;
    }

    /**
     * This method return an Image object to represent the card
     */

    public Image getImage(){
        String imageName = "images/" + model +".png";
        return new Image(MobilePhone.class.getResourceAsStream(imageName));
    }

}
