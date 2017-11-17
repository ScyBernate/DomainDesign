package org.design.DomainDesign.structure;

/**
 * 
  * @ClassName: AdapterUnit
  * @Description: 适配器模式：在不修改之前类的基础上，添加新的功能
  * @author scy
  * @date 2017年11月16日 上午11:37:44
  *
 */
public class AdapterUnit {
	
	public class UserOperation{
		
		public void register(){
			System.out.println("注册");
		}
		
		
		public void login(){
			System.out.println("登录");
		}
		
	}
	
	public class People extends Send{
		UserOperation uo;
		
		People(UserOperation uo){
			this.uo = uo;
		}
		
		public void doAct(){
			uo.register();
			sendEmail();
			uo.login();
		}
	}
	
	//发送邮件
	public class Send{
		void sendEmail(){
			System.out.println("发送邮件");
		}
	}
	
	public static void main(String[] args) {
		AdapterUnit au = new AdapterUnit();
		People pp = au.new People(au.new UserOperation());
		pp.doAct();  //注册 登录
		//现在想在注册和登录中间添加一个发邮箱的操作，我不想修改UserOperation这个类，增加发送邮件类
	}

}
