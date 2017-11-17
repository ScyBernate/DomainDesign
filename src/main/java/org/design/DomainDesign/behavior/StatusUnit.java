package org.design.DomainDesign.behavior;

/**
 * 
  * @ClassName: StatusUnit
  * @Description: 状态模式： 状态不同导致对象有不同的行为
  * @author scy
  * @date 2017年11月16日 下午5:19:59
  *
 */
public class StatusUnit {
	
	public interface Status{
		
		public void handle();
	}
	
	public class MorningStatus implements Status{

		@Override
		public void handle() {
			System.out.println("早上的状态");
		}
		
	}
	
	public class AfterNoonStatus implements Status{

		public void handle() {
			System.out.println("下午的状态");
		}
	}
	
	public class People{
		
		public void work(int time){
			if(time>0&&time<=12){
				MorningStatus ms = new MorningStatus();
				ms.handle();
			}else{
				AfterNoonStatus as = new AfterNoonStatus();
				as.handle();
			}
		}
		
	}
	
	public static void main(String[] args) {
		StatusUnit su = new StatusUnit();
		People p = su.new People();
		p.work(11);
	}

}
