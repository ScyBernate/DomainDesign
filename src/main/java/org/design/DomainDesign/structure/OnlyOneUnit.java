package org.design.DomainDesign.structure;

/**
 * 
  * @ClassName: OnlyOneUnit
  * @Description: 享元模式：jvm中的String常量池就是具体的应用
  * 						jvm中每new一个String，就会将其放在常量池里，之后每创建一个都会在常量池里面找，如果有，直接将其
  * 						引用地址返回
  * @author scy
  * @date 2017年11月16日 下午2:21:29
  *
 */
public class OnlyOneUnit {
	
	public static void main(String[] args) {
		String a = "123";
		String b = "123";
		System.out.println(a==b); //比较地址
	}

}
