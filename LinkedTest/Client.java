
//���������
//code for test
/*
for(int i=0;i<range;i++){
	System.out.println(entry[i].getData());
	System.out.println(entry[i].getNext());
}
*/
import java.util.Scanner;
public class Client
{

	public static void main(String[] args){
		
		System.out.println("��ӭʹ������ģ��ϵͳ��");
		EntryBO entry = dataInput();
		if(entry == null){
			System.out.println("��û����������ϵͳ�Զ�������");
		}else{
			functionInput(entry);
		}
		quit();
		
	}	

	//����Entry������Ϊÿ������ֵ���洢��ֵ������Ϊ׼
	//������Ϊ��ʱ�����ؿգ�
	public static EntryBO dataInput(){
		System.out.println("��������Ҫ��������������(��over����)��");
		Scanner reader= new Scanner(System.in);
		String temp= "";
		EntryBO entry= null;
		EntryBO entryTemp= null;
		EntryBO next= null;
		//����ע���µ��ַ�������ֱ��over����
		while(true){
			temp= reader.next();
			//����over�����ѭ��
			if("over".equalsIgnoreCase(temp)){
				break;
			}
			//��һ������ʱ�����������Ϣע��entryTemp����������ĵ�ַ����entry
			//����������ʱ�����������Ϣע��next,��next��ַ�������ǰ��entryTemp.next������next�½���Entry����ĵ�ַ�滻entryTemp���������ĵ�ַ
			//���ղ��ϵ�Ƕ��next��entryTemp���ﵽnext������Զ����һ��next�ĵ�ַ
			//�����ж�entryTemp�Ƿ�Ϊ�գ���ΪentryTemp��������ڴ��ַ��ͣ��next���滻
			if(entry == null){
				entryTemp= new Entry(temp);
				entry= entryTemp;
			}else{
				next= new Entry(temp);
				entryTemp.setNext((Entry)next);
				entryTemp= next;
			}
		}
		//Test program
		//�������еĲ��Դ��붼Ҫ��������������ʱֻ������4��Ԫ��
		//�������ָ��������Ԫ����Ҫ��������д��
		//dataInput�½�4��д��ָ������
		//add��5��д��ָ������+1��del��3��д��ָ������-1��
		/*
		EntryBiz entryUtil= new EntryUtil(entry);
		for(int i=0;i<4;i++){
			
			entryUtil.find(i+1);	
		}
		*/
		return entry;
	}

	//Ϊ��ӣ�ɾ��������Ԫ���ṩ���
	//֧����ӣ�ɾ��Ԫ��ʱ��ȷ�Ϲ���
	public static void functionInput(EntryBO entry){
		System.out.println("��ѡ����Ҫ��������еĲ�����");
		System.out.println("����Ԫ����ѡ1��ɾ��Ԫ����ѡ2������Ԫ����ѡ3��");
		Scanner reader= new Scanner(System.in);
		EntryBiz function= new EntryUtil(entry);
		//1Ϊ���Ԫ�أ�2Ϊɾ��Ԫ�أ�3Ϊ����Ԫ��
		switch(reader.nextInt()){
			case 1:
				System.out.print("��������Ҫ���ӵ�Ԫ��Ӧ�ڵ�λ��(��1��ʼ)��");
				int addPlace= reader.nextInt();
				System.out.print("��������Ҫ���ӵ�Ԫ�أ�");
				String data= reader.next();
				System.out.print("�Ƿ�ȷ�����ӣ�(Y/N)");
				if("y".equalsIgnoreCase(reader.next())){
					function.add(addPlace,data);
					/*
					EntryBiz entryUtil= new EntryUtil(entry);
					for(int i=0;i<5;i++){
						
						entryUtil.find(i+1);	
					}
					*/
					System.out.println("��ӳɹ���");
				}else
					System.out.println("��ȡ����ӣ�");
				break;
			case 2:
				System.out.print("��������Ҫɾ����Ԫ�����ڵ�λ��(��1��ʼ)��");
				int delPlace= reader.nextInt();
				System.out.print("�Ƿ�ȷ��ɾ����(Y/N)");
				if("y".equalsIgnoreCase(reader.next())){
					function.del(delPlace);
					/*
					EntryBiz entryUtil= new EntryUtil(entry);
					for(int i=0;i<3;i++){
						
						entryUtil.find(i+1);	
					}
					*/
					System.out.println("ɾ���ɹ���");
				}else
					System.out.println("��ȡ��ɾ����");
				break;
			case 3:
				System.out.print("��������Ҫ���ҵ�Ԫ�����ڵ�λ��(��1��ʼ)��");	
				function.find(reader.nextInt());
				break;
			default :
				System.out.println("����������ֲ��Ϸ���");
		}
	}

	//�˳�����
	public static void quit(){
		System.out.println("���賢�����⹦�ܣ���������ϵͳ��");

	}
}