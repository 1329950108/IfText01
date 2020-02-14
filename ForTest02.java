public class ForTest02
{
	public static void main(String[] args){
		
		System.out.println("欢迎使用素数表！");
		//遍历1-100；
		for(int i=1;i<=100;i++){
			//遍历i中所有可能约数
			int judge = 0;
			for(int j=1;j<i-1;j++){
				int k = i%(j+1);
				if(k==0){
					judge += 1;
				}
			}
			//判断是否有除一以外的约数
			if(judge == 0){
				System.out.println(i);
			}

		}



	}
}