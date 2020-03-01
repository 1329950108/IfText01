
//工具类，实现EntryBiz接口，支持添加，删除，查找元素的功能
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
	
	//查找链表中的元素
	public void find(int findedPlace){
		/*
			迭代查找链表内的数据
			需要看哪个位置的数据，就迭代几次
			当迭代器和需要的次数相等时，退出迭代
		*/
		if(interativeCount == findedPlace){
			System.out.println("您要找的数据是：" + entry.getData());
			//一定要将计数器归零，否则EntryUtil实例化以后无法重复使用！
			interativeCount= 1;
		}else{
			interativeCount++;
			EntryUtil next= new EntryUtil(entry.getNext(),interativeCount);
			next.find(findedPlace);
		}
	}

	//添加元素到链表中
	public void add(int addedPlace,String addedData){
		/*
		仍然是递归，若需要在第五个位置添加元素，则在第四个Entry处停顿；
		将第四个的Entry.next保存的地址注入新生成的Entry.next中；
		将第四个的Entry.next地址修改为新Entry的地址；
		计数器归零
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

	//从链表中删除元素
	public void del(int deledPlace){
		/*
		仍然是递归，若需要在第五个位置删除元素，则在第四个Entry处停顿；
		将第四个的Entry.next地址修改为第六个元素的地址；
		计数器归零
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