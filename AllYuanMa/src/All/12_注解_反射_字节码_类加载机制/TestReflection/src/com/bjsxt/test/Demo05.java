package com.bjsxt.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.bjsxt.test.annotation.SxtField;
import com.bjsxt.test.annotation.SxtTable;

/**
 * ͨ�������ȡע����Ϣ
 * @author ��ѧ�ø��
 *
 */
public class Demo05 {
	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("com.bjsxt.test.annotation.SxtStudent");
			
			//������������Чע��
			Annotation[] annotations=clazz.getAnnotations();
			for (Annotation a : annotations) {
				System.out.println(a);
			}
			//������ָ����ע��
			SxtTable st = (SxtTable) clazz.getAnnotation(SxtTable.class);
			System.out.println(st.value());
			
			//���������Ե�ע��
			Field f = clazz.getDeclaredField("studentName");
			SxtField sxtField = f.getAnnotation(SxtField.class);
			System.out.println(sxtField.columnName()+"--"+sxtField.type()+"--"+sxtField.length());
			
			//���ݻ�õı������ֶε���Ϣ��ƴ��DDL��䣬Ȼ��ʹ��JDBCִ�����SQL�������ݿ���������صı�
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
