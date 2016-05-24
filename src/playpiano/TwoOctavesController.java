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

/**
 *
 * @author pascale
 */
public class TwoOctavesController implements Initializable {

    @FXML
    private Button mC;
    private Menu file;
    private MenuItem close;
    Boolean piano = true; 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void close() {
        System.exit(0);
    }

    @FXML
    public void playmC() {
        if (piano = true) {
            AudioClip mC = new AudioClip(getClass().getResource("mC.wav").toString());
            mC.play();
        } else {
            AudioClip mC = new AudioClip(getClass().getResource("ViolinmC.wav").toString());
            mC.play();
        }
    }

    @FXML
    public void playmCsharp() {
        if (piano = true) {
            AudioClip mCsharp = new AudioClip(getClass().getResource("mC#.wav").toString());
            mCsharp.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmC#.wav").toString());
            mCsharp.play();
        }

    }

    @FXML
    public void playmD() {
        if (piano = true) {
            AudioClip mD = new AudioClip(getClass().getResource("mD.wav").toString());
            mD.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmD.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playmDsharp() {
        if (piano = true) {
            AudioClip mDsharp = new AudioClip(getClass().getResource("mD#.wav").toString());
            mDsharp.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmD#.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playmE() {
        if (piano = true) {
            AudioClip mE = new AudioClip(getClass().getResource("mE.wav").toString());
            mE.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmE.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playmF() {
        if (piano = true) {
            AudioClip mF = new AudioClip(getClass().getResource("mF.wav").toString());
            mF.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmF.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playmFSharp() {
        if (piano = true) {
            AudioClip mFSharp = new AudioClip(getClass().getResource("mFSharp.wav").toString());
            mFSharp.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmF#.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playmG() {
        if (piano = true) {
            AudioClip mG = new AudioClip(getClass().getResource("mG.wav").toString());
            mG.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmG.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playmGSharp() {
        AudioClip mGSharp = new AudioClip(getClass().getResource("mGSharp.wav").toString());
        mGSharp.play();
    }

    @FXML
    public void playmA() {
        if (piano = true) {
            AudioClip mA = new AudioClip(getClass().getResource("mA.wav").toString());
            mA.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmA.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playmAsharp() {
        if (piano = true) {
            AudioClip mAsharp = new AudioClip(getClass().getResource("mASharp.wav").toString());
            mAsharp.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmA#.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playmB() {
        if (piano = true) {
            AudioClip mB = new AudioClip(getClass().getResource("mB.wav").toString());
            mB.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinmB.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playhC() {
        AudioClip hC = new AudioClip(getClass().getResource("hC.wav").toString());
        hC.play();
    }

    @FXML
    public void playhCsharp() {
        AudioClip hCsharp = new AudioClip(getClass().getResource("hC#.wav").toString());
        hCsharp.play();
    }

    @FXML
    public void playhD() {
        AudioClip hD = new AudioClip(getClass().getResource("hD.wav").toString());
        hD.play();
    }

    @FXML
    public void playhDsharp() {
        AudioClip hDsharp = new AudioClip(getClass().getResource("hD#.wav").toString());
        hDsharp.play();
    }

    @FXML
    public void playhE() {
        AudioClip hE = new AudioClip(getClass().getResource("hE.wav").toString());
        hE.play();
    }

    @FXML
    public void playhF() {
        AudioClip hF = new AudioClip(getClass().getResource("hF.wav").toString());
        hF.play();
    }

    @FXML
    public void playhFsharp() {
        AudioClip hFsharp = new AudioClip(getClass().getResource("hF#.wav").toString());
        hFsharp.play();
    }

    @FXML
    public void playhG() {
        if (piano = true) {
            AudioClip hG = new AudioClip(getClass().getResource("hG.wav").toString());
            hG.play();
        } else {
            AudioClip mCsharp = new AudioClip(getClass().getResource("ViolinhG.wav").toString());
            mCsharp.play();
        }
    }

    @FXML
    public void playhGsharp() {
        AudioClip hGsharp = new AudioClip(getClass().getResource("hG#.wav").toString());
        hGsharp.play();
    }

    @FXML
    public void playhA() {
        AudioClip hA = new AudioClip(getClass().getResource("hA.wav").toString());
        hA.play();
    }

    @FXML
    public void playhAsharp() {
        AudioClip hAsharp = new AudioClip(getClass().getResource("hA#.wav").toString());
        hAsharp.play();
    }

    @FXML
    public void playhB() {
        AudioClip hB = new AudioClip(getClass().getResource("hB.wav").toString());
        hB.play();
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
