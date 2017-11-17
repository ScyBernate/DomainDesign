package org.design.DomainDesign.behavior;

/**
 * 
  * @ClassName: CommandUnit
  * @Description: 命令模式：将命令封装起来
  *    			    对于大多数请求-响应模式的功能，比较适合使用命令模式，正如命令模式定义说的那样，
  *    			    命令模式对实现记录日志、撤销操作等功能比较方便。但是每一个命令就要新建一个类文件
  * @author scy
  * @date 2017年11月16日 下午3:01:22
  *
 */
public class CommandUnit {
	
	public interface Command{
		public void text();
		
		public void cancel();
	}
	
	public class RepairCommand implements Command{

		public void text() {
			System.out.println("命令---修理高压锅");
		}

		public void cancel() {
			System.out.println("修理高压锅命令撤销");
		}
		
	}
	
	public class ShoppingCommand implements Command{
		public void text() {
			System.out.println("命令---购物");
		}
		public void cancel() {
			System.out.println("购物命令撤销");
		}
	}
	
	public class Person{
		public void giveCommand(Command cd){
			System.out.println("领导下发命令了：");
			cd.text();
		}
		public void cancel(Command cd){
			System.out.println("取消命令");
		}
	}
	
	public static void main(String[] args) {
		CommandUnit cu = new CommandUnit();
		Person p = cu.new Person();
		Command cc = cu.new ShoppingCommand();
		p.giveCommand(cu.new ShoppingCommand());
		p.cancel(cc);
	}

}
