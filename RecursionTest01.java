public class RecursionTest01
{
	public static void main(String[] args)
	{
		
		System.out.println("欢迎使用累加系统！");
		System.out.println("提示一：只能输入整数！");
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入从哪个数开始：");
		int begain = s.nextInt();
		System.out.print("请输入从哪个数结束：");
		int over = s.nextInt();
		//判断是否需要互换较大的数和较小的数
		if (begain > over)
		{
			int change = begain;
			begain = over;
			over = change;
		}
		System.out.println("最终累加的结果是：" + Re01.sum(begain,over));

	}
}