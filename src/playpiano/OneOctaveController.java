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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.AudioClip;

/**
 * FXML Controller class
 *
 * @author pascale
 */
public class OneOctaveController implements Initializable {

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
    public void playmC(){
        AudioClip mC = new AudioClip(getClass().getResource("mC.wav").toString());
        mC.play();
    }
    
    @FXML
    public void playmCsharp(){
        AudioClip mCsharp = new AudioClip(getClass().getResource("mC#.wav").toString());
        mCsharp.play();
    }
    
    @FXML
    public void playmD(){
        AudioClip mD = new AudioClip(getClass().getResource("mD.wav").toString());
        mD.play();
    }
    
    @FXML
    public void playmDsharp(){
        AudioClip mDsharp = new AudioClip(getClass().getResource("mD#.wav").toString());
        mDsharp.play();
    }
    
    @FXML
    public void playmE(){
        AudioClip mE = new AudioClip(getClass().getResource("mE.wav").toString());
        mE.play();
    }
    
    @FXML
    public void playmF(){
        AudioClip mF = new AudioClip(getClass().getResource("mF.wav").toString());
        mF.play();
    }
    
    @FXML
    public void playmFSharp(){
        AudioClip mFSharp = new AudioClip(getClass().getResource("mFSharp.wav").toString());
        mFSharp.play();
    }
    
    @FXML
    public void playmG(){
        AudioClip mG = new AudioClip(getClass().getResource("mG.wav").toString());
        mG.play();
    }
    
    @FXML
    public void playmGSharp(){
        AudioClip mGSharp = new AudioClip(getClass().getResource("mGSharp.wav").toString());
        mGSharp.play();
    }
    
    @FXML
    public void playmA(){
        AudioClip mA = new AudioClip(getClass().getResource("mA.wav").toString());
        mA.play();
    }
    
    @FXML
    public void playmAsharp(){
        AudioClip mAsharp = new AudioClip(getClass().getResource("mASharp.wav").toString());
        mAsharp.play();
    }
    
    @FXML
    public void playmB(){
        AudioClip mB = new AudioClip(getClass().getResource("mB.wav").toString());
        mB.play();
    }
    
    @FXML
    public void handleBackToTwoOctaves(){
        try {
            PlayPiano.getAppInstance().showTwoOctavesView();
        } catch (IOException ex) {
            Logger.getLogger(OneOctaveController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void handleBackToThreeOctaves(){
        try {
            PlayPiano.getAppInstance().showThreeOctavesView();
        } catch (IOException ex) {
            Logger.getLogger(OneOctaveController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
