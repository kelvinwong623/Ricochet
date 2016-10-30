package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Kelvin Wong
 */
public class MainClass extends Application {

    final int startXPos = 50;
    final int startYPos = 50;
    final int tileWidth = 200;
    final int tileHeight = 200;
    final int tankSide = 50;
    Rectangle rec1,rec2,rec3,rec4,rec5,rec6,rec7,rec8,rec9,rec10,rec11,rec12,rec13,rec14,rec15,rec16;

    public void start(Stage primaryStage) {
        int a = 0;
        Space[][] board = new Space[4][4];
        Rectangle[][] tilePile = new Rectangle[4][4];
        for (int y = 0; y <= 3; y++) {
            for (int x = 0; x <= 3; x++) {
                setToDefault4x4(board);
                tilePile[y][x] = new Rectangle();
                tilePile[y][x].setWidth(tileWidth);
                tilePile[y][x].setHeight(tileHeight);
                tilePile[y][x].setFill(Color.LIGHTGRAY);
                tilePile[y][x].setStroke(Color.GREEN);
                tilePile[y][x].setTranslateX(startXPos + (x * tileWidth));
                tilePile[y][x].setTranslateY(startYPos + (y * tileHeight));
                tilePile[y][x].setStrokeWidth(10);
                tilePile[y][x].setFocusTraversable(true);
                tilePile[y][x].setOnMouseEntered(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent event) {
                        tilePile[y][x].setFill(Color.AQUA);
                    }
                });
            }
        }
        Tank Play1 = new Tank(1, "AU", 3, 0);
        Tank Play2 = new Tank(2, "AD", 0, 3);
        Mirror Def1 = new Mirror("RU", 1, 1);
        Mirror Def2 = new Mirror("LU", 1, 2);
        Mirror Def3 = new Mirror("LU", 2, 1);
        Mirror Def4 = new Mirror("RU", 2, 2);

        Pane root = new Pane();
        for (int y = 0; y <= 3; y++) {
            for (int x = 0; x <= 3; x++) {
                root.getChildren().add(tilePile[y][x]);
            }
        }
        Scene scene = new Scene(root, 900, 900);
        primaryStage.setTitle("Ricochet");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void setToDefault4x4(Space[][] a) {
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                a[x][y] = new Space(0);
            }
        }
    }
    
    public void changeColor(int a, int b){
        if(a == 1){
            if(b == 1){
                rec1.setFill(Color.AZURE);
            } else if (b == 2){
                rec2.setFill(Color.AZURE);
            }else if (b == 3){
                rec3.setFill(Color.AZURE);
            }else if (b == 4){
                rec4.setFill(Color.AZURE);
            }else if (b == 5){
                rec5.setFill(Color.AZURE);
            }else if (b == 6){
                rec6.setFill(Color.AZURE);
            }else if (b == 7){
                rec7.setFill(Color.AZURE);
            }else if (b == 8){
                rec8.setFill(Color.AZURE);
            }else if (b == 9){
                rec9.setFill(Color.AZURE);
            }else if (b == 10){
                
            }else if (b == 11){
                
            }else if (b == 12){
                
            }else if (b == 13){
                
            }else if (b == 14){
                
            }else if (b == 15){
                
            }else if (b == 16){
                
            }
        } else if(a == 2){
            
        } else if(a == 3){
            
        }
    }
    

    /* public Rectangle createTile() {
        
     }
     */
}
