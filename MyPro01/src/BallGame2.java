import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{

	
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	
	double x=130;  //С��ĺ�����
	double y=130;  //С����������
	boolean right=true;
	
	//�����ڵķ���
	public void paint(Graphics g){
		System.out.println("���ڱ���һ��");
		g.drawImage(desk,30,30,null);
		g.drawImage(ball, (int)x,(int) y, null);
		
		if(right){
		x=x+10;
		}else{
		x=x-10;
		}
		
		if(x>605){
			right=false;
		}
		
		if(x<65){
			right=true;
		}
	}
	
	//���ڼ���
	void launchFrame(){
		
		setSize(700,400);
		setLocation(50,50);
		setVisible(true);
		
	//�ػ�����  25ci/1s
	while(true){
		repaint();
		try{
			Thread.sleep(40); //40ms , 1s=1000ms,1s  hua 20ci;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	}
	
	
	//main�����ǳ���ִ�е����
		public static void main(String[] args){
		System.out.println("My name zjgwhcn");
		BallGame2 game = new BallGame2();
		game.launchFrame();
		
	}
}
