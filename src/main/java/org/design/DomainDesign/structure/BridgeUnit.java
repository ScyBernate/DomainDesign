package org.design.DomainDesign.structure;

/**
 * 
  * @ClassName: BridgeUnit
  * @Description: 桥接模式：两种抽象的变化，比如电视机和遥控器，电视机有多样，遥控器也有多样
  * @author scy
  * @date 2017年11月16日 下午1:28:59
  *
 */
public class BridgeUnit {
	
	public interface ITV{
		public void trunOn();
		public void trunOff();
		public void switchChannel(int channel);
	}
	
	public class SonyTV implements ITV{
		public void trunOn() {
			System.out.println("turn on Sony TV");
		}
		public void trunOff() {
			System.out.println("turn off Sony TV");
		}
		public void switchChannel(int channel) {
			System.out.println("Sony switch the channel "+channel);
		}
		
	}
	
	public class HaierTV implements ITV{
		public void trunOn() {
			System.out.println("turn on Haier TV");
		}
		public void trunOff() {
			System.out.println("turn off Haier TV");
		}
		public void switchChannel(int channel) {
			System.out.println("Haier switch the channel "+channel);
		}
	}
	
	public abstract class RemoteController{
		private ITV tv;
		RemoteController(ITV tv){
			this.tv = tv;
		}
		
		void switchChannel(int channel) {
			tv.switchChannel(channel);
		}
	}
	
	public class HaierController extends RemoteController{

		HaierController(ITV tv) {
			super(tv);
		}
		
		public void switchChannelBoard(int channel){
			System.out.println("Haier----");
			switchChannel(channel);
		}
		
	}
	
	public class SonyController extends RemoteController{

		SonyController(ITV tv) {
			super(tv);
		}
		
		public void switchChannelBoard(int channel){
			System.out.println("Sony----");
			switchChannel(channel);
		}
		
	}
	
	public static void main(String[] args) {
		BridgeUnit bu = new BridgeUnit();
		ITV tv = bu.new SonyTV();
		SonyController rc = bu.new SonyController(tv);
		rc.switchChannelBoard(12);
	}

}
