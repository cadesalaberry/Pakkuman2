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


public class Consummable extends Characters {

    private long scorevalue;
    private String mode="consummable";


    public Consummable(int x3, int y3, int w3, int h3, Image i3) {
    super(x3,y3,w3,h3,i3);
    }

    public long getscorevalue(){
    return scorevalue;
    }

    public void setscorevalue(long sv){
    scorevalue=sv;
    }

    public String getmode(){
    return mode;
    }

    public void setmode(String m){
    mode=m;
    }

}