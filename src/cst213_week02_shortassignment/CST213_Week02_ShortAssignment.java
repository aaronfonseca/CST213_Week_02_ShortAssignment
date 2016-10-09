/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst213_week02_shortassignment;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author aaron.fonseca
 */
public class CST213_Week02_ShortAssignment extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);
        
        hbox.getChildren().add(new Label("Video Resolution: 720/1080"));
        TextField resolution = new TextField();
        resolution.setPrefWidth(60);
        hbox.getChildren().add(resolution);
        
        hbox.getChildren().add(new Label("Video Length in seconds:"));
        TextField length = new TextField();
        length.setPrefWidth(60);
        hbox.getChildren().add(length);
        
        Button videoSize_btn = new Button();
        videoSize_btn.setText("Get Video Size");
        hbox.getChildren().add(videoSize_btn);
        
        Label diskSize = new Label("");
        hbox.getChildren().add(diskSize);
      
        VBox root = new VBox();
        root.getChildren().add(hbox);
        Scene scene = new Scene(root, 800, 250);
        
        videoSize_btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                 Integer value1 = Integer.valueOf(resolution.getText());
                 Integer value2  = Integer.valueOf(length.getText());
                 videoCalc sizeVideo = new videoCalc(value1, value2);
                 diskSize.setText(sizeVideo.getFile_size());
                 primaryStage.setScene(scene);
                 primaryStage.show();
            }
        });
        
        primaryStage.setTitle("Aaron Fonseca Week 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
