import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame{

	
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
	
	double x=130;  //小球的横坐标
	double y=130;  //小坏的纵坐标
	boolean right=true;
	
	//画窗口的方法
	public void paint(Graphics g){
		System.out.println("窗口被画一次");
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
	
	//窗口加载
	void launchFrame(){
		
		setSize(700,400);
		setLocation(50,50);
		setVisible(true);
		
	//重画窗口  25ci/1s
	while(true){
		repaint();
		try{
			Thread.sleep(40); //40ms , 1s=1000ms,1s  hua 20ci;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	}
	
	
	//main方法是程序执行的入口
		public static void main(String[] args){
		System.out.println("My name zjgwhcn");
		BallGame2 game = new BallGame2();
		game.launchFrame();
		
	}
}
