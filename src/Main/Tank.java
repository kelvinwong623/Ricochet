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
public class Tank {

    boolean aimLeft, aimRight, aimUp, aimDown;
    int playerNum;
    int xPos;
    int yPos;

    public Tank(int player, String AimDirect, int x, int y) {
        playerNum = player;
        setAimDirect(AimDirect);
        xPos = x;
        yPos = y;

    }

    public String getAimDirect() {
        String theAim = " ";
        if (aimLeft) {
            theAim = "AL";
        } else if (aimRight) {
            theAim = "AR";
        } else if (aimDown) {
            theAim = "AD";
        } else if (aimUp) {
            theAim = "AU";
        } else {
            System.out.println("Error, Aim Position not found/recorded");
            theAim = "error";
        }
        return theAim;
    }

    public void setAimDirect(String a) {
        if (a.equals("AU")) {
            aimLeft = false;
            aimRight = false;
            aimUp = true;
            aimDown = false;
        } else if (a.equals("AR")) {
            aimLeft = false;
            aimRight = true;
            aimUp = false;
            aimDown = false;
        } else if (a.equals("AD")) {
            aimLeft = false;
            aimRight = false;
            aimUp = false;
            aimDown = true;
        } else if (a.equals("AL")) {
            aimLeft = true;
            aimRight = false;
            aimUp = false;
            aimDown = false;
        } else {
            System.out.println("Error: could not record aim pos.!");
            aimLeft = false;
            aimRight = false;
            aimUp = true;
            aimDown = false;
        }
    }
}
