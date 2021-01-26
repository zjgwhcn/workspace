package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ��������
 * @author ���
 *
 */
public class MyGameFrame  extends  JFrame {
	
	Image   ball  = GameUtil.getImage("images/ball.png");
	
	@Override
	public void paint(Graphics g) {		//�Զ������á�  g�൱��һֻ����
		Color   c = g.getColor();
		Font   f =  g.getFont();
		g.setColor(Color.BLUE); 
		
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100, 100, 40, 40);
		g.setColor(Color.red);
		g.setFont(new  Font("����",Font.BOLD,50));
		g.drawString("����˭��", 200, 200);
		
		g.drawImage(ball, 250, 250, null);
		
		g.setColor(c);
		g.setFont(f);
		
		
		
	}
	
	/**
	 * ��ʼ������
	 */
	public  void  launchFrame(){
		this.setTitle("��ѧ��ѧԱ_����Գ��Ʒ");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		MyGameFrame  f = new MyGameFrame();
		f.launchFrame();
	}
	
}
