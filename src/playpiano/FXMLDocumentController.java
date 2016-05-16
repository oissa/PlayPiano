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
public class FXMLDocumentController implements Initializable {
    
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
    public void playhC(){
        AudioClip hC = new AudioClip(getClass().getResource("hC.wav").toString());
        hC.play();
    }
    
}
