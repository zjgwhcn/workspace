package cn.sxt.oop;

/**
 * ���Խӿں�ʵ����
 * @author Administrator
 *
 */
public class TestInterface {
	public static void main(String[] args) {
		Volant  v = new Angel();
		v.fly();
		
		Honest  h = new GoodMan();
		h.helpOther();
		
	}
}

/**
 * ���нӿ�
 * @author Administrator
 *
 */
interface  Volant {
	int  FLY_HEIGHT = 1000;
	void fly();
}

//�����ӿ�
interface  Honest {
	void  helpOther();
}

class  Angel implements Volant,Honest { //ʵ�������ʵ�ֶ�����ӿڣ�

	@Override
	public void helpOther() {
		System.out.println("Angel.helpOther()");
	}

	@Override
	public void fly() {
		System.out.println("Angel.fly()");
	}	
	
}

class  GoodMan implements Honest {

	@Override
	public void helpOther() {
		System.out.println("GoodMan.helpOther()");
	}
}

class  Birdman implements Volant {

	@Override
	public void fly() {
		System.out.println("Birdman.fly()");
	}
	
}
