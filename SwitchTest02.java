/*public class SwitchTest02
{
	public static void main(String[] args){
			
		System.out.println("��ӭʹ�ñ���������");
		java.util.Scanner s = new java.util.Scanner(System.in);
		//��������
		System.out.print("�����룺");
		int num = s.nextInt();
		//�������
		String str = "���յĵ����ǣ�";
		System.out.println(str + num);
	}
}
*/
public class SwitchTest02
{
	public static void main(String[] args){
		
		System.out.println("��ӭʹ�ñ���������");
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ʾһ������һ-->�س�-->�����-->�س�-->���ֶ�");
		System.out.println("��ʾ������ϵͳ��֧���������ļӼ��˳���");
		//��������
		System.out.print("�밴Ҫ���������֣�");
		int num01 = s.nextInt();
		String op = s.next();
		int num02 = s.nextInt();
		//ȷ�����������Ϸ�
		//if((op != "+")&&(op != "-")&&(op != "*")&&(op != "/")){
		//	System.out.println("�Բ������������������Ϸ���");
		//}else{
			//Switch�ж����ս��
			switch(op){
				
				case "+" :
					System.out.println(num01 + num02);
					break;
				case "-" :
					System.out.println(num01 - num02);
					break;
				case "*" :
					System.out.println(num01 * num02);
					break;
				case "/" :
					System.out.println(num01 / num02);
					break;
				default :
					System.out.println("����δ֪����");
			}
		//}
	}
}