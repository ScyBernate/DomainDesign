package org.design.DomainDesign.structure;

/**
 * 
  * @ClassName: ProxyUnit
  * @Description: 代理模式：通过代理对象来访问实际对象
  * @author scy
  * @date 2017年11月16日 下午2:29:59
  *
 */
public class ProxyUnit {
	
	public class A{
		
		void show(){
			System.out.println("展示操作");
		}
	}
	
	public class Proxy4A{
		
		private A a = new A();
		
		public void show(){
			System.out.println("前置操作");
			a.show();
			System.out.println("后置操作");
		}
		
	}

	public static void main(String[] args) {
		ProxyUnit pu = new ProxyUnit();
		Proxy4A p4 = pu.new Proxy4A();
		p4.show();
	}
}
