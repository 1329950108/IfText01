/*public class SwitchTest02
{
	public static void main(String[] args){
			
		System.out.println("欢迎使用本计算器！");
		java.util.Scanner s = new java.util.Scanner(System.in);
		//输入数字
		System.out.print("请输入：");
		int num = s.nextInt();
		//输出数字
		String str = "最终的得数是：";
		System.out.println(str + num);
	}
}
*/
public class SwitchTest02
{
	public static void main(String[] args){
		
		System.out.println("欢迎使用本计算器！");
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("提示一：数字一-->回车-->运算符-->回车-->数字二");
		System.out.println("提示二：本系统仅支持两个数的加减乘除！");
		//输入数字
		System.out.print("请按要求输入数字：");
		int num01 = s.nextInt();
		String op = s.next();
		int num02 = s.nextInt();
		//确认运算符输入合法
		//if((op != "+")&&(op != "-")&&(op != "*")&&(op != "/")){
		//	System.out.println("对不起，您输入的运算符不合法！");
		//}else{
			//Switch判断最终结果
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
					System.out.println("出现未知错误！");
			}
		//}
	}
}