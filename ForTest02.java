public class ForTest02
{
	public static void main(String[] args){
		
		System.out.println("��ӭʹ��������");
		//����1-100��
		for(int i=1;i<=100;i++){
			//����i�����п���Լ��
			int judge = 0;
			for(int j=1;j<i-1;j++){
				int k = i%(j+1);
				if(k==0){
					judge += 1;
				}
			}
			//�ж��Ƿ��г�һ�����Լ��
			if(judge == 0){
				System.out.println(i);
			}

		}



	}
}