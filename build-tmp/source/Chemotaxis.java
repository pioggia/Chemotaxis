import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

int siz=0;
int o=255;
Square [] cubes;
 public void setup()   
 {     
 	size(500, 500);
 	background(0);
 	cubes=new Square[700];
 	for(int a=0; a<cubes.length; a++)
 	{
 		cubes[a]=new Square();
 	}
 }   
 public void draw()   
 {    
 	
 	background(0);
 	for (int a=0; a<cubes.length; a++)
 	{
 		cubes[a].move();
 		cubes[a].show();
 	}
 }  
 class Square  
 {     
 	int x, y, length, width;
 	int colore;
 	Square()
 	{
 		x=(int)(Math.random()*500);
 		y=(int)(Math.random()*500);
 		length=(int)(Math.random()*2)+3;
 		width=(int)(Math.random()*2)+3;
 		colorMode(HSB);
 		colore=color((int)(Math.random()*30)+90, (int)(Math.random()*40)+170, (int)(Math.random()*20)+250);
 	}   
 	public void move()
 	{
 		if(mousePressed==true)
 		{
 			frameRate(50);
 			if(mouseX<x)
 			{
 				x=x+(int)(Math.random()*4)-2;
 			}
 			if(mouseX>x)
 			{
 				x=x+(int)(Math.random()*4)-1;
 			}
 			if(mouseY<y)
 			{
 				y=y+(int)(Math.random()*4)-2;
 			}
 			if(mouseY>y)
 			{
 				y=y+(int)(Math.random()*4)-1;
 			}
 			if(mouseX==x)
 			{
 				x=x+(int)(Math.random()*3)-1;
 			}
 			if(mouseY==y)
 			{
 				y=y+(int)(Math.random()*3)-1;
 			}
 		}
 		else 
 		{
 			frameRate(30);
 			x=x+(int)(Math.random()*3)-1;
 			y=y+(int)(Math.random()*3)-1;
 		}
 	}
 	public void show()
 	{
 		noFill();
 		strokeWeight(0.5f);
 		colorMode(RGB);
 		stroke(colore);
 		rect(x, y, length, width);
 	}
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
