import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import java.applet.*;
import sun.audio.*;
import java.io.*;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.net.*;
import javax.sound.sampled.*;
import javax.sound.midi.*;

public class Characters {

    private int xpos;
    private int ypos;
    private int width;
    private int height;
    private int speed;
    private String direction;
    private Image i;



    public Characters(int x, int y, int w, int h, Image image) {
    xpos=x;
    ypos=y;
    width=w;
    height=h;
    i=image;
    direction="";
    }

    public int getx(){
    return xpos;
    }

    public void setx(int x1){
    xpos=x1;
    }

    public int gety(){
    return ypos;
    }

    public void sety(int y1){
    ypos=y1;
    }

    public int getwidth(){
    return width;
    }

    public void setwidth(int w1){
    width=w1;
    }

    public int getheight(){
    return height;
    }

    public void setheight(int h1){
    height=h1;
    }

    public Image getimage(){
    return i;
    }

    public void setimage(String im){
    i=new ImageIcon(im).getImage();
    }

    public int getspeed(){
    return speed;
    }

    public void setspeed(int s1){
    speed=s1;
    }

    public String getdirection(){
    return direction;
    }

    public void setdirection(String d1){
    direction=d1;
    }
}