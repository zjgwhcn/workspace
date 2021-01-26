package cn.sxt.game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
	
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane=new Plane(planeImg,250,250);
/*	Plane plane2=new Plane(planeImg,350,250);
	Plane plane3=new Plane(planeImg,450,250);
*/	
	@Override
	public void paint(Graphics g){//自动被调用,g相当于一只笔
		g.drawImage(bg,0,0,null);
		plane.drawSelf(g);//画飞机
/*		plane2.drawSelf(g);
*		plane3.drawSelf(g);
*/
	}
	
	//帮助我们反复的重画窗口!
	class PaintThread extends Thread{
		public void run(){
			while(true){
				System.out.println("窗口重画一次!");
				repaint();  //重画
				try {
					Thread.sleep(40);   //1s=1000ms
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//定义键盘监听的内部类
	class KeyMonitor extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}			
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
		new PaintThread().start();//启动重画窗口的线程
		addKeyListener(new KeyMonitor());//给窗口增加键盘的监听
	}
	
	public static void main (String[]args){
		
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
	}
}

