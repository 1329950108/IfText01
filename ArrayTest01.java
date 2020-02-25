import java.util.*;
public class ArrayTest01
{
	public static void main(String[] args){
		
		System.out.println("欢迎体验栈结构模拟器！");
		System.out.println("技术有限，最多输入10个字符串！");
		System.out.println("请输入需要的字符串：");
		Scanner reader = new Scanner(System.in);
		String[] array = new String[10];
		//倒序遍历array数组
		for(int i=9;i>-1;i--){
			array[i] = reader.next();
		}
		System.out.println("最终的数组为：" + Arrays.toString(array));

	}
}