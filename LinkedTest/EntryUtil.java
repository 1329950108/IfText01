
//�����࣬ʵ��EntryBiz�ӿڣ�֧����ӣ�ɾ��������Ԫ�صĹ���
public class EntryUtil implements EntryBiz
{
	public EntryUtil(EntryBO entry,int interativeCount){
		this.entry= entry;
		this.interativeCount= interativeCount;
	}
	public EntryUtil(EntryBO entry){
		this(entry,1);
	}
	private EntryBO entry;
	static int interativeCount;
	
	//���������е�Ԫ��
	public void find(int findedPlace){
		/*
			�������������ڵ�����
			��Ҫ���ĸ�λ�õ����ݣ��͵�������
			������������Ҫ�Ĵ������ʱ���˳�����
		*/
		if(interativeCount == findedPlace){
			System.out.println("��Ҫ�ҵ������ǣ�" + entry.getData());
			//һ��Ҫ�����������㣬����EntryUtilʵ�����Ժ��޷��ظ�ʹ�ã�
			interativeCount= 1;
		}else{
			interativeCount++;
			EntryUtil next= new EntryUtil(entry.getNext(),interativeCount);
			next.find(findedPlace);
		}
	}

	//���Ԫ�ص�������
	public void add(int addedPlace,String addedData){
		/*
		��Ȼ�ǵݹ飬����Ҫ�ڵ����λ�����Ԫ�أ����ڵ��ĸ�Entry��ͣ�٣�
		�����ĸ���Entry.next����ĵ�ַע�������ɵ�Entry.next�У�
		�����ĸ���Entry.next��ַ�޸�Ϊ��Entry�ĵ�ַ��
		����������
		*/
		if(interativeCount == addedPlace-1){
			Entry addedEntry= new Entry(addedData,entry.getNext());
			entry.setNext(addedEntry);
			interativeCount= 1;
		}else{
			interativeCount++;
			EntryUtil next= new EntryUtil(entry.getNext(),interativeCount);
			next.add(addedPlace,addedData);
		}
	}

	//��������ɾ��Ԫ��
	public void del(int deledPlace){
		/*
		��Ȼ�ǵݹ飬����Ҫ�ڵ����λ��ɾ��Ԫ�أ����ڵ��ĸ�Entry��ͣ�٣�
		�����ĸ���Entry.next��ַ�޸�Ϊ������Ԫ�صĵ�ַ��
		����������
		*/
		if(interativeCount == deledPlace-1){
			entry.setNext(entry.getNext().getNext());
			interativeCount= 1;
		}else{
			interativeCount++;
			EntryUtil next= new EntryUtil(entry.getNext(),interativeCount);
			next.del(deledPlace);
		}	
	}

}