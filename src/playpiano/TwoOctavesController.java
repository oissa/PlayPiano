/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpiano;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.media.AudioClip;

/**
 *
 * @author pascale
 */
public class TwoOctavesController implements Initializable {
    
    @FXML
    private Button mC;
    private Menu file;
    private MenuItem close;
    
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
    public void playhC(){
        AudioClip hC = new AudioClip(getClass().getResource("hC.wav").toString());
        hC.play();
    }
    
    @FXML
    public void playhCsharp(){
        AudioClip hCsharp = new AudioClip(getClass().getResource("hC#.wav").toString());
        hCsharp.play();
    }
    
    @FXML
    public void playhD(){
        AudioClip hD = new AudioClip(getClass().getResource("hD.wav").toString());
        hD.play();
    }
    
    @FXML
    public void playhDsharp(){
        AudioClip hDsharp = new AudioClip(getClass().getResource("hD#.wav").toString());
        hDsharp.play();
    }
    
    @FXML
    public void playhE(){
        AudioClip hE = new AudioClip(getClass().getResource("hE.wav").toString());
        hE.play();
    }
    
    @FXML
    public void playhF(){
        AudioClip hF = new AudioClip(getClass().getResource("hF.wav").toString());
        hF.play();
    }
    
    @FXML
    public void playhFsharp(){
        AudioClip hFsharp = new AudioClip(getClass().getResource("hF#.wav").toString());
        hFsharp.play();
    }
    
    @FXML
    public void playhG(){
        AudioClip hG = new AudioClip(getClass().getResource("hG.wav").toString());
        hG.play();
    }
    
    @FXML
    public void playhGsharp(){
        AudioClip hGsharp = new AudioClip(getClass().getResource("hG#.wav").toString());
        hGsharp.play();
    }
    
    @FXML
    public void playhA(){
        AudioClip hA = new AudioClip(getClass().getResource("hA.wav").toString());
        hA.play();
    }
    
    @FXML
    public void playhAsharp(){
        AudioClip hAsharp = new AudioClip(getClass().getResource("hA#.wav").toString());
        hAsharp.play();
    }
    
    @FXML
    public void playhB(){
        AudioClip hB = new AudioClip(getClass().getResource("hB.wav").toString());
        hB.play();
    }
}