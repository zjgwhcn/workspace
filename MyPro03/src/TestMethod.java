/*
 * ���Է����Ļ���ʹ��
 * @author  zjgwhcn
 */
public class TestMethod {
	public static void main (String[]args){
		//ͨ�����������ͨ����
		TestMethod tm = new TestMethod();
		tm.printSxt();
		tm.printSxt();
		int c=tm.add(30,40,50) +1000 ;
		System.out.println(c);
	}
	
	
	void printSxt(){
		System.out.println("������ѧ��");
		System.out.println("������ѧ��");
		System.out.println("������ѧ��");
	}
	int add(int a,double b,int c){
		int sum = (int) (a+b+c);
		System.out.println(sum);
		return sum; //return��������:1,��������������.2,����ֵ.
	}
}
