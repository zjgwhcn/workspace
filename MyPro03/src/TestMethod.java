/*
 * 测试方法的基本使用
 * @author  zjgwhcn
 */
public class TestMethod {
	public static void main (String[]args){
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt();
		tm.printSxt();
		int c=tm.add(30,40,50) +1000 ;
		System.out.println(c);
	}
	
	
	void printSxt(){
		System.out.println("北京尚学堂");
		System.out.println("北京尚学堂");
		System.out.println("北京尚学堂");
	}
	int add(int a,double b,int c){
		int sum = (int) (a+b+c);
		System.out.println(sum);
		return sum; //return两个作用:1,结束方法的运行.2,返回值.
	}
}
