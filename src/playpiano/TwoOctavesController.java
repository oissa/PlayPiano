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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author pascale
 */
public class TwoOctavesController implements Initializable {
    public Boolean piano = true; 
    
    @FXML
    private Menu file;
    private MenuItem close;
    private String currentNote;
    
    

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
            AudioClip note = new AudioClip(getClass().getResource(currentNote + ".wav").toString());
            note.play();
        } else {
            AudioClip note = new AudioClip(getClass().getResource("v" + currentNote + ".wav").toString());
            note.play();
        }
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
    public void playmFSharp() {
        currentNote = "mF#";
    }

    @FXML
    public void playmG() {
        currentNote = "mG";
    }

    @FXML
    public void setmGSharp() {
        currentNote = "mG#";
    }

    @FXML
    public void playmA() {
        currentNote = "mA";
    }

    @FXML
    public void playmAsharp() {
        currentNote = "mA#";
    }

    @FXML
    public void playmB() {
        currentNote = "mB";
    }

    @FXML
    public void playhC() {
        currentNote = "hC";
    }

    @FXML
    public void playhCsharp() {
        currentNote = "hC#";
    }

    @FXML 
    public void playhD() {
        currentNote = "hD";
    }

    @FXML
    public void playhDsharp() {
        currentNote = "hD#";
    }

    @FXML
    public void playhE() {
        currentNote = "hE";
    }

    @FXML
    public void playhF() {
        currentNote = "hF";
    }

    @FXML
    public void playhFsharp() {
        currentNote = "hF#";
    }

    @FXML
    public void playhG() {
        currentNote = "hG";
    }

    @FXML
    public void playhGsharp() {
        currentNote = "hG#";
    }

    @FXML
    public void playhA() {
        currentNote = "hA";
    }

    @FXML
    public void playhAsharp() {
        currentNote = "hA#";
    }

    @FXML
    public void playhB() {
        currentNote = "hB";
    }
    
    @FXML
    public void handleBackToOneOctave(){
        try {
            PlayPiano.getAppInstance().showOneOctaveView();
        } catch (IOException ex) {
            Logger.getLogger(TwoOctavesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
