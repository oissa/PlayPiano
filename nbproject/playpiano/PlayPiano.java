/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playpiano;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pascale
 */
public class PlayPiano extends Application {    
    
    private static PlayPiano appInstance;
    private Stage mainWindow;
    
    public static PlayPiano getAppInstance(){
        return appInstance;
    }
    
    @Override
    public void start(Stage stage) throws Exception{
        this.appInstance = this;
        this.mainWindow = stage;
        showTwoOctavesView();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void showTwoOctavesView() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("TwoOctaves.fxml"));
        
        Scene scene = new Scene(root);
        
        this.mainWindow.setScene(scene);
        this.mainWindow.show();
    }
    
    public void showOneOctaveView() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OneOctave.fxml"));
        
        Scene scene = new Scene(root);
        
        this.mainWindow.setScene(scene);
        this.mainWindow.show();
    }
    
    public void showThreeOctavesView() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ThreeOctaves.fxml"));
        
        Scene scene = new Scene(root);
        
        this.mainWindow.setScene(scene);
        this.mainWindow.show();
    }
    
}
