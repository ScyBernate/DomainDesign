package org.design.DomainDesign.behavior;

/**
 * 
  * @ClassName: DutyLinkUnit
  * @Description: 职责链模式：当某一操作在链上传递时，谁都不知道是否能处理这个操作，直至该操作被处理
  * @author scy
  * @date 2017年11月16日 下午2:47:13
  *
 */
public class DutyLinkUnit {
	
	public class Person{
		private String name;
		
		private Person next;
		
		public Person(){
			
		}
		
		public Person(String name){
			this.name = name;
		}
		
		public Person(String name, Person next){
			this.name = name;
			this.next = next;
		}
		
		public void operate(String name){
			if(name.equals(this.name)){
				System.out.println(name+"批准！");
			}else{
				if(next!=null){
					next.operate(name);  //传递到下一个
				}else{
					System.out.println("最后一个节点，同意");
				}
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Person getNext() {
			return next;
		}

		public void setNext(Person next) {
			this.next = next;
		}
		
	}
	
	public static void main(String[] args) {
		DutyLinkUnit dlu = new DutyLinkUnit();
		Person p1 = dlu.new Person("李白");
		Person p2 = dlu.new Person("杜甫");
		Person p3 = dlu.new Person("王安石");
		Person p4 = dlu.new Person("孟浩然");
		p1.setNext(p2);
		p2.setNext(p3);
		p3.setNext(p4);
		p1.operate("张三");
	}

}
