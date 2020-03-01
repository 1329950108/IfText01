
//链表测试类
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
		
		System.out.println("欢迎使用链表模拟系统！");
		EntryBO entry = dataInput();
		if(entry == null){
			System.out.println("您没有输入链表，系统自动结束！");
		}else{
			functionInput(entry);
		}
		quit();
		
	}	

	//创建Entry链表，并为每个对象赋值，存储的值以输入为准
	//当输入为空时，返回空；
	public static EntryBO dataInput(){
		System.out.println("请输入需要创建的链表数据(以over结束)：");
		Scanner reader= new Scanner(System.in);
		String temp= "";
		EntryBO entry= null;
		EntryBO entryTemp= null;
		EntryBO next= null;
		//不断注入新的字符串链表，直到over结束
		while(true){
			temp= reader.next();
			//输入over便结束循环
			if("over".equalsIgnoreCase(temp)){
				break;
			}
			//第一次输入时，将输入的信息注入entryTemp，并把最初的地址交给entry
			//往后再输入时，将输入的信息注入next,将next地址输入给当前的entryTemp.next，并用next新建的Entry对象的地址替换entryTemp里所保留的地址
			//最终不断的嵌套next和entryTemp，达到next里面永远有下一个next的地址
			//不能判断entryTemp是否为空，因为entryTemp所保存的内存地址不停被next的替换
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
		//以下所有的测试代码都要求我们输入链表时只能输入4个元素
		//若想测试指定数量的元素需要讲代码重写，
		//dataInput下将4重写成指定数量
		//add下5重写成指定数量+1，del下3重写成指定数量-1；
		/*
		EntryBiz entryUtil= new EntryUtil(entry);
		for(int i=0;i<4;i++){
			
			entryUtil.find(i+1);	
		}
		*/
		return entry;
	}

	//为添加，删除，查找元素提供入口
	//支持添加，删除元素时的确认功能
	public static void functionInput(EntryBO entry){
		System.out.println("请选择需要对链表进行的操作：");
		System.out.println("增加元素请选1，删减元素请选2，查找元素请选3；");
		Scanner reader= new Scanner(System.in);
		EntryBiz function= new EntryUtil(entry);
		//1为添加元素，2为删除元素，3为查找元素
		switch(reader.nextInt()){
			case 1:
				System.out.print("请输入需要增加的元素应在的位置(从1开始)：");
				int addPlace= reader.nextInt();
				System.out.print("请输入需要增加的元素：");
				String data= reader.next();
				System.out.print("是否确认增加？(Y/N)");
				if("y".equalsIgnoreCase(reader.next())){
					function.add(addPlace,data);
					/*
					EntryBiz entryUtil= new EntryUtil(entry);
					for(int i=0;i<5;i++){
						
						entryUtil.find(i+1);	
					}
					*/
					System.out.println("添加成功！");
				}else
					System.out.println("已取消添加！");
				break;
			case 2:
				System.out.print("请输入需要删除的元素所在的位置(从1开始)：");
				int delPlace= reader.nextInt();
				System.out.print("是否确认删除？(Y/N)");
				if("y".equalsIgnoreCase(reader.next())){
					function.del(delPlace);
					/*
					EntryBiz entryUtil= new EntryUtil(entry);
					for(int i=0;i<3;i++){
						
						entryUtil.find(i+1);	
					}
					*/
					System.out.println("删除成功！");
				}else
					System.out.println("已取消删除！");
				break;
			case 3:
				System.out.print("请输入需要查找的元素所在的位置(从1开始)：");	
				function.find(reader.nextInt());
				break;
			default :
				System.out.println("您输入的数字不合法！");
		}
	}

	//退出程序
	public static void quit(){
		System.out.println("如需尝试另外功能，请重启该系统！");

	}
}