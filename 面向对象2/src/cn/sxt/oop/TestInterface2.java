package cn.sxt.oop;

public class TestInterface2 {

}

interface A {
    void testa();
}

interface B {
    void testb();
}

/**�ӿڿ��Զ�̳У��ӿ�C�̳нӿ�A��B*/
interface C extends A, B {
    void testc();
}
class Mysubclass  implements C {

	@Override
	public void testa() {
		
	}

	@Override
	public void testb() {
		
	}

	@Override
	public void testc() {
		
	}
}