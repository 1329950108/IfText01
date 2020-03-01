
//变更Entry内数据时需要的所有set,get方法
public interface EntryBO
{
	void setData(Object data);
	Object getData();
	void setNext(Entry next);
	Entry getNext();
}