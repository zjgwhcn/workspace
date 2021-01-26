import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{

	
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	
	double x=130;  //С��ĺ�����
	double y=130;  //С����������

	double degree=3.14/3;    //���ȡ��˴����ǣ�60�ȡ�
	
	//�����ڵķ���
	public void paint(Graphics g){
		System.out.println("���ڱ���һ��");
		g.drawImage(desk,30,30,null);
		g.drawImage(ball, (int)x,(int) y, null);
		
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);

		//�������»ص�
		if (y>310||y<62){  //310�Ǵ��ڲ�߽�;62�Ǵ����ϲ�߽�:
			degree = -degree;
		}
		
		//�������һص�
		if (x<50||x>620){
		degree=3.14-degree;	
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
		BallGame game = new BallGame();
		game.launchFrame();
		
	}
}
