
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class RandomTest01
{
	
	public static void main(String[] args){
		
		//Ŀ�꣺���ɲ��ظ��������
		System.out.println("��ӭʹ�����ɲ�ͬ���������");
		System.out.print("����������������ɷ�Χ��");
		Scanner reader = new Scanner(System.in);
		int range = reader.nextInt();
		System.out.print("��������Ҫ�������������");
		int num = reader.nextInt();
		//����random����
		int[] randomArray = random(range,num);
		System.out.println("���յ������Ϊ��" + Arrays.toString(randomArray));
	}

	public static int[] random(int range,int num){
		//��������ָ�������������������ѭ��
		int[] randomArray = new int[num];
		int count = 0;
		Random ran = new Random();
		while(count != num){
		//��ǣ��ж��Ƿ��ظ�
		boolean isNonRep = true;
			//�����ɵ�������洢��randomArray[]�У�Ϊ�˷���Ƚ���������Ƿ��ظ���
			randomArray[count] = ran.nextInt(range+1);
			//countΪ0ʱ������ѭ����Ĭ�ϲ��ظ�
			if(count != 0){
				//���������ɵĲ��ظ������飬�ֱ�Ա������������
				for(int i=0;i<count;i++){
					//�Ƚ�������������Ƿ��֮ǰ���ظ�
					if(randomArray[i] == randomArray[count])
						isNonRep = false;			
				}				
			}
			else{
				count++;
				//�����ظ�count++
				isNonRep = false;
			}
				
			//Ϊ���ظ���������洢��������
			if(isNonRep){
				count++;
			}

		}
		return randomArray;
	}

}
