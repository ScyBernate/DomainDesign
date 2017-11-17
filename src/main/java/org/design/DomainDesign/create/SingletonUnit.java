package org.design.DomainDesign.create;

/**
 * 
  * @ClassName: SingletonUnit
  * @Description: 单例模式
  * @author scy
  * @date 2017年11月16日 上午11:00:59
  *
 */
public class SingletonUnit {
	
	//懒汉式单例
	public static class LazyUser{
		
		private static volatile LazyUser user;
		
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		private LazyUser(){}
		
		static LazyUser getUser(){
			if(user==null){
				synchronized (user) {
					if(user==null){
						return new LazyUser();
					}
				}
			}
			return user;
		}
		
	}
	
	//饿汉式单例
	public static class EagerUser{
		
		private static EagerUser user = new EagerUser();
		
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		private EagerUser(){}
		
		static EagerUser getUser(){
			return user;
		}
	}
	

}
