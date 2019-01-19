/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Vera
 */
import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame marco=new MarcoReboot();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class BallThread implements Runnable{

    public BallThread(Ball oneBall, Component oneComponent){
        ball=oneBall;
        component=oneComponent;
    }
    public void run(){
    
        //for (int i=1; i<=3000; i++){
			while(!Thread.interrupted())	{
				ball.move_ball(component.getBounds());
				
				component.paint(component.getGraphics());
                                
                            /*try {
                                Thread.sleep(4);
                            } catch (InterruptedException ex) {
                                //ex.printStackTrace();
                                System.out.println("Blocked Thread");
                                
                            }*/
                            
                            
			}
			
        
    }
    private Ball ball;
    private Component component;

}


//Movijng the ball-----------------------------------------------------------------------------------------

class Ball{
	
	
	
	public void move_ball(Rectangle2D limits){
		
		x+=dx;
		
		y+=dy;
		
		if(x<limits.getMinX()){
			
			x=limits.getMinX();
			
			dx=-dx;
		}
		
		if(x + TAMX>=limits.getMaxX()){
			
			x=limits.getMaxX() - TAMX;
			
			dx=-dx;
		}
		
		if(y<limits.getMinY()){
			
			y=limits.getMinY();
			
			dy=-dy;
		}
		
		if(y + TAMY>=limits.getMaxY()){
			
			y=limits.getMaxY()-TAMY;
			
			dy=-dy;
			
		}
		
	}
	
	
	
	public Ellipse2D getShape(){
		
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
		
	}	
	
	private static final int TAMX=15;
	
	private static final int TAMY=15;
	
	private double x=0;
	
	private double y=0;
	
	private double dx=1;
	
	private double dy=1;
	
	
}

// ----------------------------------------------------------------------


class SheetBall extends JPanel{
	
	
	
	public void add(Ball b){
		
		balls.add(b);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Ball b: balls){
			
			g2.fill(b.getShape());
		}
		
	}
	
	private ArrayList<Ball> balls=new ArrayList<Ball>();
}


//------------------------------------------------------------------------------

class MarcoReboot extends JFrame{
	
	public MarcoReboot(){
		
		setBounds(600,300,400,350);
		
		setTitle ("Reboots");
		
		sheet=new SheetBall();
		
		add(sheet, BorderLayout.CENTER);
		
		JPanel sheetButtons=new JPanel();
		
		putButton(sheetButtons, "Hint!", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				start_the_game();
			}
			
		});
		//new button of stop
                putButton(sheetButtons, "Stop", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				stop();
			}
			
		});
		
		putButton(sheetButtons, "Exit", new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
				System.exit(0);
				
			}
			
		});
		
		add(sheetButtons, BorderLayout.SOUTH);
	}
	
	
	//
	
	public void putButton(Container c, String title, ActionListener listener){
		
		JButton button=new JButton(title);
		
		c.add(button);
		
		button.addActionListener(listener);
		
	}
	
	
	
	public void start_the_game (){
		
					
			Ball ball=new Ball();
			
			sheet.add(ball);
			
			Runnable r=new BallThread(ball, sheet);
                        
                        //Thread t=new Thread(r);
                        t=new Thread(r);
                        
                        t.start();
		
	}
        
        public void stop(){
            //t.stop();
            t.interrupt();
        }
        
        Thread t;
	
	private SheetBall sheet;
	
	
}
