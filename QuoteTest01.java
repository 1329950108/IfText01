public class QuoteTest01
{
	public static void main(String[] args)
		{
			
			System.out.println("欢迎使用学生电脑查询系统！");
			java.util.Scanner s = new java.util.Scanner (System.in);
			Student stu = new Student();
			System.out.print("请输入学生学号：");
			stu.no = s.nextInt();
			System.out.print("请输入学生姓名：");
			stu.name = s.next();
			//判断是否需要输入电脑
			System.out.println("学生是否拥有电脑？");
			System.out.print("(否 -> 0; 是 -> 1):");
			int judge = s.nextInt();
			if (judge == 1)
			{
				System.out.print("请输入电脑的品牌：");
				stu.computer.brand = s.next();
				System.out.print("请输入电脑的型号：");
				stu.computer.type = s.next();
				System.out.print("请输入电脑的颜色：");
				stu.computer.color = s.next();
			}
			//判断是否拥有电脑
			if (judge == 0)
			{
				System.out.println(stu.name + "暂无电脑！");
			}else 
			{
				System.out.println(stu.name + "拥有的电脑品牌为："+ stu.computer.brand);
				System.out.println(stu.name + "拥有的电脑型号为："+ stu.computer.type);
				System.out.println(stu.name + "拥有的电脑颜色为："+ stu.computer.color);
			}

		}
}