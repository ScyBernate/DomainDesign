package org.design.DomainDesign.create;

/**
 * 
  * @ClassName: FactoryUnit
  * @Description: 工厂模式：针对的是一个实体，如果想使用多个的话，请看抽象工厂模式
  * @author scy
  * @date 2017年11月16日 上午10:39:57
  *
 */

public class FactoryUnit {
	
	//商品
	public class Good {
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Good(String name) {
			super();
			this.name = name;
		}

		public void show() {
			System.out.println("我是" + name);
		}
	}
	
	public class AFactory{
		public Good bulid(){
			return new Good("A商品");
		}
	}
	
	public class BFactory{
		public Good bulid(){
			return new Good("B商品");
		}
	}
	
	public static void main(String[] args) {
		FactoryUnit fu = new FactoryUnit();
		fu.new BFactory().bulid().show();
		fu.new AFactory().bulid().show();
	}

}
