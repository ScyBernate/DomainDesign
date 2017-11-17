package org.design.DomainDesign.structure;

/**
 * 
  * @ClassName: WrapperUnit
  * @Description: 装饰器模式：当一个功能不能够满足需求时，通过一个装饰器来增强功能，完成需要。
  * 			    如一下代码中的例子：一张纸能变成 纸船、纸花等等等..
  * @author scy
  * @date 2017年11月16日 下午2:16:36
  *
 */
public class WrapperUnit {

	public interface PaperThing {
		void show();
	}
	
	//这是PaperThing的 “真实面孔”
	public class Paper implements PaperThing{
		public void show() {
			System.out.println("我是一张纸");
		}
	}

	// 装饰器
	public class Wrapper implements PaperThing {

		private PaperThing pt;

		public Wrapper(PaperThing pt) {
			this.pt = pt;
		}

		public void show() {
			pt.show();
		}

	}

	public class PaperBoat extends Wrapper {

		public PaperBoat(PaperThing pt) {
			super(pt);
		}

		public void show() {
			System.err.println("方法覆盖");
			System.out.println("我是纸船");
		}

	}

	public class PaperFlower extends Wrapper {

		public PaperFlower(PaperThing pt) {
			super(pt);
		}

		public void show() {
			System.err.println("方法覆盖");
			System.out.println("我是纸花");
		}

	}
	
	public static void main(String[] args) {
		WrapperUnit wu = new WrapperUnit();
		PaperBoat pb = wu.new PaperBoat(wu.new Paper());
		pb.show();
		/*PaperFlower pf = wu.new PaperFlower(pb);
		pf.show();*/
	}

}
