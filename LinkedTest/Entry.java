
//����EntryBOʵ���࣬������˽������data��next���Ͷ�Ӧ��set,get������
//(@override)Entry(new data,new next),Entry(new data,new next),Entry(new data,new next);
public class Entry implements EntryBO
{
	private Object data;
	private Entry next;
	public void setData(Object data){
		this.data= data;
	}
	public Object getData(){
		return data;
	}
	public void setNext(Entry next){
		this.next= next;
	}
	public Entry getNext(){
		return next;
	}
	public Entry(){
	}
	public Entry(Object data){
		this.data= data;
	}
	public Entry(Object data,Entry next){
		this.data= data;
		this.next= next;
	}
}