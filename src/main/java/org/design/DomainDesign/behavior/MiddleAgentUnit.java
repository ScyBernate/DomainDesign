package org.design.DomainDesign.behavior;

/**
 * 
  * @ClassName: MiddleAgentUnit
  * @Description: 中介者模式：当2个对象之间关系交互非常紧密，所以用中介者来处理这段交互
  * 			  在租房这件事中，双方钱的交易必须保持一致（应该是银行保证，这里可以理解为中介为银行，例子不够恰当）
  * @author scy
  * @date 2017年11月16日 下午3:30:31
  *
 */
public class MiddleAgentUnit {
	
	//房东
	public class HouseOwner{
		
		//房东存款
		private int money;

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}
		
	}
	
	//租客
	public class HouseRenter{
		
		//租客存款
		private int money;

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}
	}
	
	//中介
	public class HouseAgent{
		
		public void trade(HouseOwner owner, HouseRenter renter){
			int money = 3000;
			owner.setMoney(money*4+money); //押一付三
			renter.setMoney(money-money*4);
			System.out.println("交易成功");
		}
		
	}
	
	public static void main(String[] args) {
		MiddleAgentUnit mau = new MiddleAgentUnit();
		HouseAgent agent = mau.new HouseAgent();
		HouseRenter renter = mau.new HouseRenter();
		renter.setMoney(8000);
		HouseOwner owner = mau.new HouseOwner();
		owner.setMoney(200000);
		agent.trade(owner, renter);
	}

}
