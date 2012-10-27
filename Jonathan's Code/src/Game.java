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


public class Game extends JFrame implements KeyListener {

    public static void main(String[]args){
    Game g=new Game(1,50,"easy");
    g.setFocusable(true);
    g.setSize(640, 480);
    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    g.setVisible(true);
    g.setTitle("Pakkuman2");
    g.getContentPane().setBackground(Color.BLACK);
    g.go();

}

    private int i,j;
    private int level;
    private int count=0;
    private Timer timer;
    private int update;
    private String difficulty;
    private String directory="./assets/";
    private String collisiondirection="";
    private BufferedImage bf;
    private Pacman p;
    private Enemies e1;
    private Nonconsummable[] mazetile=new Nonconsummable[72];


    public Game(int l,int u,String d){
    mazetile[0]=new Nonconsummable(8,30,30,30,null);
    mazetile[1]=new Nonconsummable(8,60,30,30,null);
    mazetile[2]=new Nonconsummable(8,90,30,30,null);
    mazetile[3]=new Nonconsummable(8,120,30,30,null);
    mazetile[4]=new Nonconsummable(8,150,30,30,null);
    mazetile[5]=new Nonconsummable(8,180,30,30,null);
    mazetile[6]=new Nonconsummable(8,300,30,30,null);
    mazetile[7]=new Nonconsummable(8,330,30,30,null);
    mazetile[8]=new Nonconsummable(8,360,30,30,null);
    mazetile[9]=new Nonconsummable(8,390,30,30,null);
    mazetile[10]=new Nonconsummable(8,420,30,30,null);
    mazetile[11]=new Nonconsummable(8,450,30,30,null);
    mazetile[12]=new Nonconsummable(8,480,30,30,null);
    mazetile[13]=new Nonconsummable(8,510,30,30,null);
    mazetile[14]=new Nonconsummable(8,540,30,30,null);
    mazetile[15]=new Nonconsummable(38,30,30,30,null);
    mazetile[16]=new Nonconsummable(68,30,30,30,null);
    mazetile[17]=new Nonconsummable(98,30,30,30,null);
    mazetile[18]=new Nonconsummable(128,30,30,30,null);
    mazetile[19]=new Nonconsummable(158,30,30,30,null);
    mazetile[20]=new Nonconsummable(188,30,30,30,null);
    mazetile[21]=new Nonconsummable(218,30,30,30,null);
    mazetile[22]=new Nonconsummable(248,30,30,30,null);
    mazetile[23]=new Nonconsummable(388,30,30,30,null);
    mazetile[24]=new Nonconsummable(418,30,30,30,null);
    mazetile[25]=new Nonconsummable(448,30,30,30,null);
    mazetile[26]=new Nonconsummable(478,30,30,30,null);
    mazetile[27]=new Nonconsummable(508,30,30,30,null);
    mazetile[28]=new Nonconsummable(538,30,30,30,null);
    mazetile[29]=new Nonconsummable(568,30,30,30,null);
    mazetile[30]=new Nonconsummable(598,30,30,30,null);
    mazetile[31]=new Nonconsummable(598,30,30,30,null);
    mazetile[32]=new Nonconsummable(598,30,30,30,null);
    mazetile[33]=new Nonconsummable(598,60,30,30,null);
    mazetile[34]=new Nonconsummable(598,90,30,30,null);
    mazetile[35]=new Nonconsummable(598,120,30,30,null);
    mazetile[36]=new Nonconsummable(598,150,30,30,null);
    mazetile[37]=new Nonconsummable(598,180,30,30,null);
    mazetile[38]=new Nonconsummable(598,300,30,30,null);
    mazetile[39]=new Nonconsummable(598,330,30,30,null);
    mazetile[40]=new Nonconsummable(598,360,30,30,null);
    mazetile[41]=new Nonconsummable(598,390,30,30,null);
    mazetile[42]=new Nonconsummable(598,420,30,30,null);
    mazetile[43]=new Nonconsummable(598,450,30,30,null);
    mazetile[44]=new Nonconsummable(598,480,30,30,null);
    mazetile[45]=new Nonconsummable(598,510,30,30,null);
    mazetile[46]=new Nonconsummable(598,540,30,30,null);
    mazetile[47]=new Nonconsummable(8,450,30,30,null);
    mazetile[48]=new Nonconsummable(38,450,30,30,null);
    mazetile[49]=new Nonconsummable(68,450,30,30,null);
    mazetile[50]=new Nonconsummable(98,450,30,30,null);
    mazetile[51]=new Nonconsummable(128,450,30,30,null);
    mazetile[52]=new Nonconsummable(158,450,30,30,null);
    mazetile[53]=new Nonconsummable(188,450,30,30,null);
    mazetile[54]=new Nonconsummable(218,450,30,30,null);
    mazetile[55]=new Nonconsummable(248,450,30,30,null);
    mazetile[56]=new Nonconsummable(388,450,30,30,null);
    mazetile[57]=new Nonconsummable(418,450,30,30,null);
    mazetile[58]=new Nonconsummable(448,450,30,30,null);
    mazetile[59]=new Nonconsummable(478,450,30,30,null);
    mazetile[60]=new Nonconsummable(508,450,30,30,null);
    mazetile[61]=new Nonconsummable(538,450,30,30,null);
    mazetile[62]=new Nonconsummable(568,450,30,30,null);
    mazetile[63]=new Nonconsummable(278,210,30,30,null);
    mazetile[64]=new Nonconsummable(308,240,30,30,null);
    mazetile[65]=new Nonconsummable(338,270,30,30,null);
    mazetile[66]=new Nonconsummable(278,240,30,30,null);
    mazetile[67]=new Nonconsummable(278,270,30,30,null);
    mazetile[68]=new Nonconsummable(308,210,30,30,null);
    mazetile[69]=new Nonconsummable(308,270,30,30,null);
    mazetile[70]=new Nonconsummable(338,210,30,30,null);
    mazetile[71]=new Nonconsummable(338,240,30,30,null);

    p=new Pacman(60,100,30,30,null);
    e1=new Enemies(300,200,30,30,null);
    timer=new Timer();
    level=l;
    update=u;
    difficulty=d;
    addKeyListener(this);
    p.setdirection("none");
    p.setspeed(3);
    e1.setspeed(2);
    }

    public void drawing(Graphics g){

    super.paint(g);

    p.setimage(directory + "pacman.png");
    e1.setimage(directory+ "ghost-orange-right.png");
    g.drawImage(p.getimage(),p.getx(),p.gety(),p.getwidth(),p.getheight(),this);
    g.drawImage(e1.getimage(),e1.getx(),e1.gety(),e1.getwidth(),e1.getheight(),this);
    g.setColor(Color.BLUE);
    g.drawString(p.getdirection(),70,70);
    g.drawString(collisiondirection,90,90);
    map(g);
    }

    public void paint(Graphics g){
    bf=new BufferedImage(this.getWidth(),this.getHeight(), BufferedImage.TYPE_INT_RGB);
    try{
    drawing(bf.getGraphics());
    g.drawImage(bf,0,0,null);
    }catch(Exception ex){
    }
    }

    public void update(Graphics g){
    paint(g);
    }

    public void keyPressed(KeyEvent gg) {

    if (gg.getKeyCode() == KeyEvent.VK_RIGHT){
    p.setx(p.getx()+p.getspeed());
    p.setdirection("right");
    }

    else if (gg.getKeyCode() == KeyEvent.VK_LEFT){
    p.setx(p.getx()-p.getspeed());
    p.setdirection("left");
    }

    else if (gg.getKeyCode() == KeyEvent.VK_UP ){
    p.sety(p.gety()-p.getspeed());
    p.setdirection("up");
    }

    else if (gg.getKeyCode() == KeyEvent.VK_DOWN ){
    p.sety(p.gety()+p.getspeed());
    p.setdirection("down");
    }

    repaint();

    }

    public void keyReleased(KeyEvent gg){
    repaint();
    }

    public void keyTyped(KeyEvent gg){
    repaint();
    }

    public void map(Graphics g){
    for(i=0;i<mazetile.length;i++){
    mazetile[i].setimage(directory+ "wall.png");
    g.drawImage(mazetile[i].getimage(),mazetile[i].getx(),mazetile[i].gety(),mazetile[i].getwidth(),mazetile[i].getheight(),this);
    }
    }

    public void detectcollision(Nonconsummable[] m,Pacman p){
    for(i=0;i<m.length;i++){
    if(p.getx()+p.getwidth()>m[i].getx()&&p.getx()<m[i].getx()+m[i].getwidth()&&p.gety()+p.getheight()>m[i].gety()&&p.gety()<m[i].gety()+m[i].getheight()){
    if(p.getdirection().equals("left")){
    p.setx(m[i].getx()+m[i].getwidth());
    p.sety(m[i].gety());
    System.out.println("entered condition 1");
    break;
    }
    else if(p.getdirection().equals("right")){
    p.setx(m[i].getx()-p.getwidth());
    p.sety(m[i].gety());
    System.out.println("entered condition 2");
    break;
    }
    else if(p.getdirection().equals("up")){
    p.setx(m[i].getx());
    p.sety(m[i].gety()+m[i].getheight());
    System.out.println("entered condition 3");
    break;
    }
    else if(p.getdirection().equals("down")){
    p.setx(m[i].getx());
    p.sety(m[i].gety()-p.getheight());
    System.out.println("entered condition 4");
    break;
    }
  }
}
}


    public void go(){

    TimerTask timertask=new TimerTask(){

    public void run(){

    e1.move(p.getdirection(),p.getspeed());
    detectcollision(mazetile,p);


    repaint();

    }

};
    timer.schedule(timertask,0,update);
    }

}