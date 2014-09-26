int siz=0;
int o=255;
Square [] cubes;
 void setup()   
 {     
 	size(500, 500);
 	background(0);
 	cubes=new Square[700];
 	for(int a=0; a<cubes.length; a++)
 	{
 		cubes[a]=new Square();
 	}
 }   
 void draw()   
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
 	color colore;
 	Square()
 	{
 		x=(int)(Math.random()*500);
 		y=(int)(Math.random()*500);
 		length=(int)(Math.random()*2)+3;
 		width=(int)(Math.random()*2)+3;
 		colorMode(HSB);
 		colore=color((int)(Math.random()*30)+90, (int)(Math.random()*40)+170, (int)(Math.random()*20)+250);
 	}   
 	void move()
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
 	void show()
 	{
 		noFill();
 		strokeWeight(0.5);
 		colorMode(RGB);
 		stroke(colore);
 		rect(x, y, length, width);
 	}
 }    