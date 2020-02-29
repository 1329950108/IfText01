
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class RandomTest01
{
	
	public static void main(String[] args){
		
		//目标：生成不重复的随机数
		System.out.println("欢迎使用生成不同随机数程序！");
		System.out.print("请输入随机数的生成范围：");
		Scanner reader = new Scanner(System.in);
		int range = reader.nextInt();
		System.out.print("请输入需要的随机数数量：");
		int num = reader.nextInt();
		//调用random方法
		int[] randomArray = random(range,num);
		System.out.println("最终的随机数为：" + Arrays.toString(randomArray));
	}

	public static int[] random(int range,int num){
		//当生成了指定数量的随机数后跳出循环
		int[] randomArray = new int[num];
		int count = 0;
		Random ran = new Random();
		while(count != num){
		//标记，判断是否重复
		boolean isNonRep = true;
			//将生成的随机数存储在randomArray[]中，为了方便比较新随机数是否重复；
			randomArray[count] = ran.nextInt(range+1);
			//count为0时不进入循环，默认不重复
			if(count != 0){
				//遍历已生成的不重复的数组，分别对比新随机出的数
				for(int i=0;i<count;i++){
					//比较新随机出的数是否和之前的重复
					if(randomArray[i] == randomArray[count])
						isNonRep = false;			
				}				
			}
			else{
				count++;
				//避免重复count++
				isNonRep = false;
			}
				
			//为不重复的随机数存储到数组中
			if(isNonRep){
				count++;
			}

		}
		return randomArray;
	}

}
