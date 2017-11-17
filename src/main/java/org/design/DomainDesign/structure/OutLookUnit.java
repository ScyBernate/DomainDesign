package org.design.DomainDesign.structure;

/**
 * 
  * @ClassName: OutLookUnit
  * @Description: 外观模式（门面模式）：当调用多个系统的复杂方法封装起来，使其看起来简单，选择性暴露
  * @author scy
  * @date 2017年11月16日 下午1:51:37
  *
 */
public class OutLookUnit {
	
	//统一api调用中心
	public class InvokeCenter{
		public void invoke(){
			SystemA sa = new SystemA();
			SystemB sb = new SystemB();
			sa.a();
			sb.b();
		}
	}
	
	public class SystemA{
		public void a(){
			System.out.println("执行A系统的a方法!");
		}
	}
	
	public class SystemB{
		public void b(){
			System.out.println("执行B系统的b方法!");
		}
	}
	
	public static void main(String[] args) {
		OutLookUnit ou = new OutLookUnit();
		InvokeCenter ic = ou.new InvokeCenter();
		ic.invoke();
	}

}
