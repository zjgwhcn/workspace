package cn.sxt.test;

/**
 * ����StringBuilder��StringBuffer�ɱ��ַ����еĳ��÷���.
 * @author Administrator
 *
 */
public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder   sb =  new StringBuilder();
		
		for(int i=0;i<26;i++){
			char temp = (char)('a'+i);
			sb.append(temp);
		}
		
		System.out.println(sb);
		sb.reverse();		//����
		System.out.println(sb);
		sb.setCharAt(3, '��');
		System.out.println(sb);
		sb.insert(0, '��').insert(6, '��').insert(10, '��');  		//��ʽ���á����ľ��ǣ��÷���������return this�����Լ������ˡ�
		System.out.println(sb);
		
		sb.delete(20, 23);
		System.out.println(sb);
		
		
	}
}
