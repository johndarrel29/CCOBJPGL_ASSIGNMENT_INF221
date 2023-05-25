package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Jasmine jasmeng = new Jasmine();
    Emlan emlan = new Emlan();
    Thea thea = new Thea();
    Jiu jiu = new Jiu();
    Celine celine = new Celine();

    public void initialize() {

        jasmeng.setName("Jasmine");
        emlan.setName("Emlan");
        thea.setName("Thea");
        jiu.setName("Jiu");
        celine.setName("Celine");

        jasmeng.setAge(112);
        emlan.setAge(45);
        thea.setAge(67);
        jiu.setAge(10);
        celine.setAge(97);

        jasmeng.setHobbies("Natutulog nang nakatayo, kumain ng bubog, mag-alaga ng giraffe");
        emlan.setHobbies("Magroblox ng tatlumpung oras sa isang araw, magdonate sa pls donate, mag genshin impact nang nakapikit");
        thea.setHobbies("Magtetris habang nagbabantay ng tindahan, maging suki sa sariling tindahan, tulungan ang tindahan na maubos ang tinda(kainin)");
        jiu.setHobbies("Magdrawing habang kumakain, hanapin kung sino ang kumain ng fudgee bar niya");
        celine.setHobbies("Maging tahimik lang sa umpisa, magdesign ng sketch haha");
    
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("My name is " + jasmeng.getName() + " and my age is " + jasmeng.getAge() + ", My hobbies are "+ jasmeng.getHobbies());
        }

        if (sourceButton == btn2) {
            alert.setContentText("My name is " + emlan.getName() + " and my age is " + emlan.getAge() + ", My hobbies are "+ emlan.getHobbies());
        }

        if (sourceButton == btn3) {
            alert.setContentText("My name is " + thea.getName() + " and my age is " + thea.getAge() + ", My hobbies are "+ thea.getHobbies());
        }

        if (sourceButton == btn4) {
            alert.setContentText("My name is " + jiu.getName() + " and my age is " + jiu.getAge() + ", My hobbies are "+ jiu.getHobbies());
        }

        if (sourceButton == btn5) {
            alert.setContentText("My name is " + celine.getName() + " and my age is " + celine.getAge() + ", My hobbies are "+ celine.getHobbies());
        }

        alert.showAndWait();
        
    }
}