
/*
	copy demo;

*/
import java.util.Scanner;
import java.io.File;

public class Client
{

	//������
	public static void main(String[] args){

		Scanner reader= new Scanner(System.in);		
		Copy copy= new Copy();
		System.out.println("��ӭʹ�ø���ģ��ϵͳ��");
		String begin= copyBegin(reader);
		String end= copyEnd(reader);
		copy.copy(begin,end);

	}

	//���뿪ʼ�ļ�
	private static String copyBegin(Scanner reader){
		
		System.out.print("��������Ҫ���Ƶ��ļ�λ�ã���/�ָ�����");
		String begin= reader.next();
		File file= new File(begin);
		if(!file.exists()){
			System.out.println("��Ч���ļ�·����");
			System.exit(0);
		}
		return begin;
	}	

	//�������λ��
	private static String copyEnd(Scanner reader){

		System.out.print("��������Ҫ���Ƶ���λ�ã���/�ָ�����");
		String end= reader.next();
		return end;
	}

}