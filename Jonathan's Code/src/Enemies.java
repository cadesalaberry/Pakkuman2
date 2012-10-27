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


public class Enemies extends Characters {

    private String mode;

    public Enemies(int x2,int y2,int w2, int h2, Image i2) {
    super(x2,y2,w2,h2,i2);
    }

    public String getmode(){
    return mode;
    }

    public void setmode(String md){
    mode=md;
    }

    public void move(String direction,int speed){

    if(direction=="up"){
    setspeed(speed);
    sety(gety()-speed);
    }

    else if(direction=="down"){
    setspeed(speed);
    sety(gety()+speed);
    }

    else if(direction=="left"){
    setspeed(speed);
    setx(getx()-speed);
    }

    else if(direction=="right"){
    setspeed(speed);
    setx(getx()+speed);
    }

    else if(direction=="none"){
    setspeed(0);
    }

    else{
    }
}
}