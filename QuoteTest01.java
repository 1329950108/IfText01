public class QuoteTest01
{
	public static void main(String[] args)
		{
			
			System.out.println("��ӭʹ��ѧ�����Բ�ѯϵͳ��");
			java.util.Scanner s = new java.util.Scanner (System.in);
			Student stu = new Student();
			System.out.print("������ѧ��ѧ�ţ�");
			stu.no = s.nextInt();
			System.out.print("������ѧ��������");
			stu.name = s.next();
			//�ж��Ƿ���Ҫ�������
			System.out.println("ѧ���Ƿ�ӵ�е��ԣ�");
			System.out.print("(�� -> 0; �� -> 1):");
			int judge = s.nextInt();
			if (judge == 1)
			{
				System.out.print("��������Ե�Ʒ�ƣ�");
				stu.computer.brand = s.next();
				System.out.print("��������Ե��ͺţ�");
				stu.computer.type = s.next();
				System.out.print("��������Ե���ɫ��");
				stu.computer.color = s.next();
			}
			//�ж��Ƿ�ӵ�е���
			if (judge == 0)
			{
				System.out.println(stu.name + "���޵��ԣ�");
			}else 
			{
				System.out.println(stu.name + "ӵ�еĵ���Ʒ��Ϊ��"+ stu.computer.brand);
				System.out.println(stu.name + "ӵ�еĵ����ͺ�Ϊ��"+ stu.computer.type);
				System.out.println(stu.name + "ӵ�еĵ�����ɫΪ��"+ stu.computer.color);
			}

		}
}