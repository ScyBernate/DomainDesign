package org.design.DomainDesign.behavior;

import java.util.ArrayList;
import java.util.List;

/**
 * 
  * @ClassName: ObserverUnit
  * @Description: 观察者模式：  生产者、消费者，解耦
  * @author scy
  * @date 2017年11月16日 下午4:39:16
  *
 */
public class ObserverUnit {
	
	public class Provider{
		private int count = 0;

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
			Advicer ar = new Advicer();
			ar.notifyAllObservers(count);
		}
		
	}
	
	public static class Advicer{
		private static List<Observer> customers = new ArrayList<Observer>(){
			private static final long serialVersionUID = -8583703547514333172L;
			{
				add(new Observer());
				add(new Observer());
				add(new Observer());
				add(new Observer());
				add(new Observer());
			}
			
		};
		public void notifyAllObservers(int count){
			customers.forEach(observer -> observer.update(count));
		}
	}
	
	public static class Observer{
		
		private int count;
		
		public void  update(int count){
			this.count = count;
		}
		
		public int getCount(){
			return count;
		}
		
	}
	
	public static void main(String[] args) {
		ObserverUnit ou = new ObserverUnit();
		Provider pr = ou.new Provider();
		pr.setCount(100);
		Advicer.customers.forEach(obj -> System.out.println(obj.getCount()));
	}

}
