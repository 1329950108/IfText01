public class SwitchTest03
{
	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner (System.in);
		System.out.println("��ӭ����ѧ��ϵͳ��");
		System.out.print("������ѧ������:");
		int grade = s.nextInt();
		int tenth = grade / 10;
		String str = "�����յĳɼ�Ϊ��";
		String score = "��Ч�ɼ���";
		//�жϳɼ�
		switch(tenth){
			case 0 : case 1 :case 2 :case 3 :case 4 :case 5 :
				score = "���ϸ�";
			break;
			case 6 :
				score = "����";
				break;
            case 7 :
				score = "����";
				break;
			case 8 :
				score = "����";
				break;
			case 9 :case 10 :
				score = "���";
				break;
		}
		System.out.println(str + score);
	}
}