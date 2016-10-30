package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kelvin Wong
 */
public class Mirror {
    /*
    
     0 --> \
     1 --> /
    
     */

    boolean leftUp = false;
    boolean rightUp = false;
    int type;
    int xPos;
    int yPos;

    public Mirror(String start, int xPos, int yPos) {
        setType(start);

    }

    public void setType(String type) {
        if (type == "LU") {
            leftUp = true;
            rightUp = false;
        } else if (type == "RU") {
            leftUp = false;
            rightUp = true;
        } else {
            System.out.println("Error: can't set Mirror arrangement");
            leftUp = true;
            rightUp = false;
        }
    }

    public void setPos(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String getType() {
        String answer = " ";
        if (leftUp && !rightUp) {
            answer = "LU";
        } else if (rightUp && !leftUp) {
            answer = "RU";
        } else {
            System.out.println("Error: cant return");
        }
        return answer;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }
}
