public class ForTest03
{
	public static void main(String[] args){
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ��������");
		System.out.print("��������Ҫ�ķ�Χ��1-10000����");
		int range = s.nextInt();
		//�жϱ������ڷֶ�
		//�ж��Ƿ�Ϸ�
		if((range < 1)||(range > 10000)){
			System.out.println("�Բ���������ķ�Χ���Ϸ���");
		//����ΧΪ1
		}else if(range == 1){
			System.out.println("1");
		}else{
			int judgeEnter = 0;
			//����1-range
			for(int i=1;i<=range;i++){
				//�жϱ�����������
				int judgePrimeNum = 0;
				//������1�ͱ���֮�����
				for(int j=2;j<i;j++){
					//��������
					int remainder = i%j;
					//�ж��ܷ�����
					if(remainder == 0){
						judgePrimeNum += 1;
					}
				}
				//�ж��Ƿ�������
				if(judgePrimeNum == 0){
					//System.out.print(i + " ");
					System.out.print(i);
					int scale =10;
					//��������λ����scaleȡֵ
					for(int z=10;z<range;z*=10){
						scale *= 10;
					}
					//��������λ������������ո���
					for(int k=scale;k>1;k/=10){
						int remainderForSpace = i/k;
						//�ж��Ƿ���Ҫ�ո�
						if(remainderForSpace == 0 ){
							System.out.print(" ");
							
						}
					}
					judgeEnter += 1;
					//�ж��Ƿ���Ҫ�س�
					if((judgeEnter% 8) == 0){
						System.out.println();
					}
				}
			}
		}
	}
}