public class ForTest01
{
	public static void main(String[] args){
		
		System.out.println("欢迎使用九九乘法表！");
		//第一个数i循环
		for(int i=1; i<10; i++){
			//第二个数j循环
			for( int j=1; j<=i; j++){
				//过渡变量k
				int k = i*j;
				System.out.println(i + "X" + j + "=" + k);
			}
		}

	}
}