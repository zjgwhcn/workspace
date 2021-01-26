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
 * �ɻ���Ϸ��������
 * @author zjgwhcn
 *
 */

public class MyGameFrame extends JFrame{
	
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane=new Plane(planeImg,250,250);
	Plane plane2=new Plane(planeImg,350,250);
	Plane plane3=new Plane(planeImg,450,250);
	
	@Override
	public void paint(Graphics g){//�Զ�������,g�൱��һֻ��
		g.drawImage(bg,0,0,null);
		plane.drawSelf(g);//���ɻ�
		plane2.drawSelf(g);//���ɻ�
		plane3.drawSelf(g);//���ɻ�
	}
	
	//�������Ƿ������ػ�����!
	class PaintThread extends Thread{
		public void run(){
			while(true){
				System.out.println("�����ػ�һ��!");
				repaint();  //�ػ�
				try {
					Thread.sleep(40);   //1s=1000ms
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * ��ʼ������
	 * 
	 */
	public void launchFrame(){
		this.setTitle("��ѧ��ѧϰzjgwhcn");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(30,30);
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
			System.exit(0);	
			}
		});
		new PaintThread().start();//�����ػ����ڵ��߳�
	}
	
	public static void main (String[]args){
		
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
	}
}

