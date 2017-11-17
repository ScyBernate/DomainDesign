package org.design.DomainDesign.create;

/**
 * 
  * @ClassName: PrototypeUnit
  * @Description: 原型模式，java中的克隆，以某个对象为模板进行复制
  * @author scy
  * @date 2017年11月16日 上午11:07:16
  *
 */
public class PrototypeUnit {
	
	public class Car implements Cloneable{
		
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public Car clone() throws CloneNotSupportedException{
			return (Car)super.clone();
		}
		
	}
	
	public static void main(String[] args) {
		PrototypeUnit pu = new PrototypeUnit();
		Car car = pu.new Car();
		car.setName("保时捷");
		System.out.println(car.getName());
		Car car2 = null;
		try {
			car2 = car.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("克隆车的名字叫:"+car2.getName());
	}

}
