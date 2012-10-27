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


public class Nonconsummable extends Characters {

    private long scorevalue;
    private String mode="mazetile";

    public Nonconsummable(int x4, int y4, int w4, int h4, Image i4) {
    super(x4,y4,w4,h4,i4);
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