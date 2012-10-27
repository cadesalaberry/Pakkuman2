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


public class Pacman extends Characters {

private long score;
private int lives;
private String mode;

public Pacman(int x1, int y1, int w1, int h1, Image i1){
super(x1,y1,w1,h1,i1);
}

public long getscore(){
return score;
}

public void setscore(long s){
score=s;
}

public int getlives(){
return lives;
}

public void setlives(int l){
lives=l;
}

public String getmode(){
return mode;
}

public void setmode(String m){
mode=m;
}

}







