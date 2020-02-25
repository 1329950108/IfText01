import java.util.*;
public class ArrayTest02
{
	public static void main(String[] args){
	
		System.out.println("欢迎使用字符串数组拷贝系统！");
		System.out.println("提示一：最多只能输入十个字符串；");
		System.out.println("提示二：终止输入请输入over并回车；");
		System.out.println("请输入第一组数组：");
		Scanner reader = new Scanner(System.in);
		String[] array01 = new String[10];
		String[] array02 = new String[10];
		//遍历array01输入数据
		for(int i=0;i < array01.length;i++){
			String count = reader.next();
			if("over".equals(count)){
				break;
			}
			array01[i] = count;
		}
		System.out.println("请输入文件需要被拷贝的位置：（输入数字即可）");
		int index01 = reader.nextInt() - 1;
		System.out.println("请输入需要被拷贝的长度：");
		int length = reader.nextInt();
		//判断输入是否合法
		if((index01 + length > array01.length)){
			System.out.println("您需要拷贝的内容超出上限！");
		}else{
			System.out.println("请输入第二组数据：");
			//遍历array02，输入数据
			for(int i=0;i < array02.length;i++){
				String count = reader.next();
				if("over".equals(count)){
					break;
				}
				array02[i] = count;
			}		
			System.out.println("请输入文件需要被替代的位置：");
			int index02 = reader.nextInt() - 1;
			//判断输入是否合法
			if((index02 + length > array02.length)){
				System.out.println("您需要拷贝的内容超出上限！");
			}else{
				//遍历拷贝部分的数据
				for(int i = index02;i<index02 + length;i++){
					array02[i] =array01[index01];
					index01++;
				}
				System.out.println(Arrays.toString(array02));
			}
		}
		


	}
}