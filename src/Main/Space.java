package Main;


import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kelvin Wong
 */
public class Space {

    final int empty = 0;
    final int tank = 1;
    final int mirror = 2;
    int type;
    public Space(int start) {
        type = start;

    }

    public void setSpace(int a) {
        type = a;
    }

    public int getSpace() {
        return type;
    }

}
