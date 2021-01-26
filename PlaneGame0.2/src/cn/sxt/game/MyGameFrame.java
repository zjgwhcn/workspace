package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;





/**
 * 飞机游戏的主窗口
 * @author zjgwhcn
 *
 */



public class MyGameFrame extends JFrame{
	
	Image ball = GameUtil.getImage("images/ball.png");
	
	@Override
	public void paint(Graphics g){
		super.paint(g);  //自动被调用,g相当于一只笔
		Color c = g.getColor();
		Font f = g.getFont();
		
		g.setColor(Color.BLUE);
		
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100,100, 300, 300);
		g.drawOval(100,100,300,300);
		g.fillRect(100, 100, 40, 40);
		g.setFont(new Font("宋休",Font.BOLD,50));
		g.setColor(Color.RED);
		g.drawString("我zjgwhcn", 200, 200);
		g.drawImage(ball,250,250,null);
		
		g.setColor(c);
		g.setFont(f);
		
	}
	
	/**
	 * 初始化窗口
	 * 
	 */
	public void launchFrame(){
		this.setTitle("尚学堂学习zjgwhcn");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(30,30);
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
			System.exit(0);	
			}
		});
	}
	
	public static void main (String[]args){
		
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
	}




	
}

