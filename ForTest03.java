public class ForTest03
{
	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用素数表！");
		System.out.print("请输入需要的范围（1-10000）：");
		int range = s.nextInt();
		//判断变量关于分段
		//判断是否合法
		if((range < 1)||(range > 10000)){
			System.out.println("对不起，您输入的范围不合法！");
		//若范围为1
		}else if(range == 1){
			System.out.println("1");
		}else{
			int judgeEnter = 0;
			//遍历1-range
			for(int i=1;i<=range;i++){
				//判断变量关于素数
				int judgePrimeNum = 0;
				//遍历除1和本身之外的数
				for(int j=2;j<i;j++){
					//余数变量
					int remainder = i%j;
					//判断能否整除
					if(remainder == 0){
						judgePrimeNum += 1;
					}
				}
				//判断是否是素数
				if(judgePrimeNum == 0){
					//System.out.print(i + " ");
					System.out.print(i);
					int scale =10;
					//遍历所有位数，scale取值
					for(int z=10;z<range;z*=10){
						scale *= 10;
					}
					//遍历所有位数，方便输出空格数
					for(int k=scale;k>1;k/=10){
						int remainderForSpace = i/k;
						//判断是否需要空格
						if(remainderForSpace == 0 ){
							System.out.print(" ");
							
						}
					}
					judgeEnter += 1;
					//判断是否需要回车
					if((judgeEnter% 8) == 0){
						System.out.println();
					}
				}
			}
		}
	}
}