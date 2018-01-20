package fx1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fx1 extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        Button btn = new Button();
        btn.setText("Presiona aqui!");
        btn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("JAVA FX1");
                JOptionPane.showMessageDialog(null, "TEC MILENIO FERRERIA-ICA", "Cuadro de Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Programacion Web con JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
}