/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpiano;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author pascale
 */
public class ThreeOctavesController implements Initializable {
    
    private Boolean piano = true; 
  
    @FXML
    private String currentNote;
    
    @FXML
    private Rectangle key;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void close() {
        System.exit(0);
    }
    
    @FXML
    public void switchToViolin(){
        piano = false;
    }
    
    @FXML
    public void switchToPiano(){
        piano = true;
    }
    
    @FXML
    public void play(){
        
        if (piano == true){
            FadeTransition ft = new FadeTransition(Duration.millis(380), key);
            ft.setFromValue(1.0);
            ft.setToValue(0.03);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);
            ft.play();
            AudioClip note = new AudioClip(getClass().getResource(currentNote + ".wav").toString());
            note.play();
        } else {
            try {
                FadeTransition ft = new FadeTransition(Duration.millis(380), key);
                ft.setFromValue(1.0);
                ft.setToValue(0.03);
                ft.setCycleCount(2);
                ft.setAutoReverse(true);
                ft.play();
                AudioClip note = new AudioClip(getClass().getResource("v" + currentNote + ".wav").toString());
                note.play();
            } catch (NullPointerException e) {
            }
        }
    }
    
    @FXML
    public void setlC(){
        currentNote = "lC";
    }
    
    @FXML
    public void setlCSharp(){
        currentNote = "lC#";
    }
    
    @FXML
    public void setlD(){
        currentNote = "lD";
    }
    
    @FXML
    public void setlDsharp() {
        currentNote = "lD#";
    }
    
    @FXML
    public void setlE() {
        currentNote = "lE";
    }

    @FXML
    public void setlF() {
        currentNote = "lF";
    }

    @FXML
    public void setlFSharp() {
        currentNote = "lF#";
    }

    @FXML
    public void setlG() {
        currentNote = "lG";
    }

    @FXML
    public void setlGSharp() {
        currentNote = "lG#";
    }

    @FXML
    public void setlA() {
        currentNote = "lA";
    }

    @FXML
    public void setlAsharp() {
        currentNote = "lA#";
    }

    @FXML
    public void setlB() {
        currentNote = "lB";
    }
    
    @FXML
    public void setmC(){
        currentNote = "mC";
    }
    
    @FXML
    public void setmCSharp(){
        currentNote = "mC#";
    }
    
    @FXML
    public void setmD(){
        currentNote = "mD";
    }
    
    @FXML
    public void setmDsharp() {
        currentNote = "mD#";
    }
    
    @FXML
    public void setmE() {
        currentNote = "mE";
    }

    @FXML
    public void setmF() {
        currentNote = "mF";
    }

    @FXML
    public void setmFSharp() {
        currentNote = "mF#";
    }

    @FXML
    public void setmG() {
        currentNote = "mG";
    }

    @FXML
    public void setmGSharp() {
        currentNote = "mG#";
    }

    @FXML
    public void setmA() {
        currentNote = "mA";
    }

    @FXML
    public void setmAsharp() {
        currentNote = "mA#";
    }

    @FXML
    public void setmB() {
        currentNote = "mB";
    }

    @FXML
    public void sethC() {
        currentNote = "hC";
    }

    @FXML
    public void sethCsharp() {
        currentNote = "hC#";
    }

    @FXML 
    public void sethD() {
        currentNote = "hD";
    }

    @FXML
    public void sethDsharp() {
        currentNote = "hD#";
    }

    @FXML
    public void sethE() {
        currentNote = "hE";
    }

    @FXML
    public void sethF() {
        currentNote = "hF";
    }

    @FXML
    public void sethFsharp() {
        currentNote = "hF#";
    }

    @FXML
    public void sethG() {
        currentNote = "hG";
    }

    @FXML
    public void sethGsharp() {
        currentNote = "hG#";
    }

    @FXML
    public void sethA() {
        currentNote = "hA";
    }

    @FXML
    public void sethAsharp() {
        currentNote = "hA#";
    }

    @FXML
    public void sethB() {
        currentNote = "hB";
    }
    
    @FXML
    public void handleBackToOneOctave(){
        try {
            PlayPiano.getAppInstance().showOneOctaveView();
        } catch (IOException ex) {
            Logger.getLogger(ThreeOctavesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void handleBackToTwoOctaves(){
        try {
            PlayPiano.getAppInstance().showTwoOctavesView();
        } catch (IOException ex) {
            Logger.getLogger(ThreeOctavesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
