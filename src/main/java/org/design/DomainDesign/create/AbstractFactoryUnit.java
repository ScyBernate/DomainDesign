package org.design.DomainDesign.create;

/**
 * 
  * @ClassName: AbstractFactoryUnit
  * @Description: 抽象工厂模式，创建对象转交工厂来做
  * @author scy
  * @date 2017年11月16日 上午10:29:40
  *
 */
public class AbstractFactoryUnit {

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

	public interface Factory {
		public Good build();
	}

	public class AFactory implements Factory {

		public Good build() {
			return new Good("A商品");
		}

	}

	public class BFactory implements Factory {

		public Good build() {
			return new Good("B商品");
		}

	}

	public Good getGood(String type) {
		switch (type) {
		case "A":
			return new AFactory().build();
		case "B":
			return new BFactory().build();
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		AbstractFactoryUnit au = new AbstractFactoryUnit();
		//au.getGood("A").show();
		au.getGood("B").show();
	}

}
