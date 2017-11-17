package org.design.DomainDesign.behavior;


/**
 * 
  * @ClassName: StrategyUnit
  * @Description: 策略模式：相同的功能，但是可能有不一样的表现形式
  * @author scy
  * @date 2017年11月16日 下午4:41:54
  *
 */
public class StrategyUnit {
	
	public interface Language{
		public void hello();
	}
	
	public class English implements Language{

		public void hello() {
			System.out.println("hello");
		}
		
	}
	
	public class Chinese implements Language{

		public void hello() {
			System.out.println("你好");
		}
		
	}

}
