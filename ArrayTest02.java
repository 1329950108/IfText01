import java.util.*;
public class ArrayTest02
{
	public static void main(String[] args){
	
		System.out.println("��ӭʹ���ַ������鿽��ϵͳ��");
		System.out.println("��ʾһ�����ֻ������ʮ���ַ�����");
		System.out.println("��ʾ������ֹ����������over���س���");
		System.out.println("�������һ�����飺");
		Scanner reader = new Scanner(System.in);
		String[] array01 = new String[10];
		String[] array02 = new String[10];
		//����array01��������
		for(int i=0;i < array01.length;i++){
			String count = reader.next();
			if("over".equals(count)){
				break;
			}
			array01[i] = count;
		}
		System.out.println("�������ļ���Ҫ��������λ�ã����������ּ��ɣ�");
		int index01 = reader.nextInt() - 1;
		System.out.println("��������Ҫ�������ĳ��ȣ�");
		int length = reader.nextInt();
		//�ж������Ƿ�Ϸ�
		if((index01 + length > array01.length)){
			System.out.println("����Ҫ���������ݳ������ޣ�");
		}else{
			System.out.println("������ڶ������ݣ�");
			//����array02����������
			for(int i=0;i < array02.length;i++){
				String count = reader.next();
				if("over".equals(count)){
					break;
				}
				array02[i] = count;
			}		
			System.out.println("�������ļ���Ҫ�������λ�ã�");
			int index02 = reader.nextInt() - 1;
			//�ж������Ƿ�Ϸ�
			if((index02 + length > array02.length)){
				System.out.println("����Ҫ���������ݳ������ޣ�");
			}else{
				//�����������ֵ�����
				for(int i = index02;i<index02 + length;i++){
					array02[i] =array01[index01];
					index01++;
				}
				System.out.println(Arrays.toString(array02));
			}
		}
		


	}
}