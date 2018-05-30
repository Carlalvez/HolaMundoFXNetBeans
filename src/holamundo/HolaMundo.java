/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Litos
 */
public class HolaMundo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Creamos un nuevo Botón
        Button boton = new Button ("Primera App"); //Con esto creamos un nuevo boton y le ponemos nombre del mismo
        
        //Creamos una escena
        Scene scene = new Scene(boton, 680,400); //llamamos al paquete Scene introducido arriba anteriormente, para poder introducir el mismo, debemos darle valor al boton en mpx
        
        //Seteamos nuestra escena al Stage.
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi Primer Programa FX");  //aqui introducimos el título que será mostrado arriba en la ventana.
        primaryStage.show(); //permite mostrar todo lo arriba mencionado.
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
