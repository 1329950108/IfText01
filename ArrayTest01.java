import java.util.*;
public class ArrayTest01
{
	public static void main(String[] args){
		
		System.out.println("��ӭ����ջ�ṹģ������");
		System.out.println("�������ޣ��������10���ַ�����");
		System.out.println("��������Ҫ���ַ�����");
		Scanner reader = new Scanner(System.in);
		String[] array = new String[10];
		//�������array����
		for(int i=9;i>-1;i--){
			array[i] = reader.next();
		}
		System.out.println("���յ�����Ϊ��" + Arrays.toString(array));

	}
}