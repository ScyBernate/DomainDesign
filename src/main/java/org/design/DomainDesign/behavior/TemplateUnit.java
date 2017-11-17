
package org.design.DomainDesign.behavior;

/**
 * 
  * @ClassName: TemplateUnit
  * @Description: 模板模式： 当一个功能对于多个模块是通（共）用的时候
  * @author scy
  * @date 2017年11月16日 下午4:44:22
  *
 */
public class TemplateUnit {
	
	public class Common{
		
		public void test(){
			System.out.println("共有方法");
		}
		
	}
	
	public class SubCommon extends Common{
		
	
	}
	
	public static void main(String[] args) {
		TemplateUnit tu = new TemplateUnit();
		SubCommon sc = tu.new SubCommon();
		sc.test();
	}

}
