package test;

public class Test {
	public static void main(String[] args) {
		testArrayCopy02();
	}
	
	public static  void  testArrayCopy01(){
		String[] s = {"����","��ѧ��","����","�Ѻ�","����"}; 
        String[] sBak = new String[6];
        System.arraycopy(s,0,sBak,0,s.length);
        
        
        for (int i = 0; i < sBak.length; i++) {
            System.out.print(sBak[i]+ "\t");
        }
	}
	
	//ɾ��ĳ��Ԫ�ر���Ҳ������Ŀ���
	public static  void  testArrayCopy02(String[] a, int index){
		String[] s = {"����","��ѧ��","����","�Ѻ�","����"}; 
		String[] sBak = new String[5];
		System.arraycopy(s,3,  s,2,s.length-3);
		s[s.length-1] = null;
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+ "\t");
		}
	}
	
	//�������ݣ���������10��
	public static String[] extendRange(String[] objs){
		int length  = objs.length;
		int newLength = objs.length+10;
		
		String[] newObjs = new String[newLength];
		
		System.arraycopy(objs, 0, newObjs, 0, objs.length);
		return newObjs;
	}
	
	//����ĳ��Ԫ��
	public static  void  testArrayCopy02(){
		String[] s = {"����","��ѧ��","����","�Ѻ�","����"}; 
		String[] sBak = extendRange(s);
		
		String  v = "Facebook";		//��Facebook���뵽����ǰ��
		
		//�ȿ���
		System.arraycopy(sBak,2, sBak,3,s.length-2);
		
		sBak[2] = v;		//�ٲ���
		
		s = sBak;
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+ "\t");
		}
	}
	
	
}
