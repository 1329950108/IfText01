public class RecursionTest01
{
	public static void main(String[] args)
	{
		
		System.out.println("��ӭʹ���ۼ�ϵͳ��");
		System.out.println("��ʾһ��ֻ������������");
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������ĸ�����ʼ��");
		int begain = s.nextInt();
		System.out.print("��������ĸ���������");
		int over = s.nextInt();
		System.out.println("�����ۼӵĽ���ǣ�" + Re01.sum(begain,over));

	}
}