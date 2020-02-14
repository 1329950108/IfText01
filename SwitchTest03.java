public class SwitchTest03
{
	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner (System.in);
		System.out.println("欢迎进入学分系统！");
		System.out.print("请输入学生分数:");
		int grade = s.nextInt();
		int tenth = grade / 10;
		String str = "您最终的成绩为：";
		String score = "无效成绩！";
		//判断成绩
		switch(tenth){
			case 0 : case 1 :case 2 :case 3 :case 4 :case 5 :
				score = "不合格";
			break;
			case 6 :
				score = "及格";
				break;
            case 7 :
				score = "良好";
				break;
			case 8 :
				score = "优秀";
				break;
			case 9 :case 10 :
				score = "真棒";
				break;
		}
		System.out.println(str + score);
	}
}