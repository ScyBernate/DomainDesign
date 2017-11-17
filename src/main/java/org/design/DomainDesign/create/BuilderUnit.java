package org.design.DomainDesign.create;

/**
 * 
  * @ClassName: BuilderUnit
  * @Description: 建造者模式：只关心结果，不关心产生结果的过程
  * @author scy
  * @date 2017年11月16日 上午10:52:54
  *
 */
public class BuilderUnit {

	public class Data{
		String head;
		String body;
		String end;
		public String getHead() {
			return head;
		}
		public void setHead(String head) {
			this.head = head;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public String getEnd() {
			return end;
		}
		public void setEnd(String end) {
			this.end = end;
		}
		public Data(String head, String body, String end) {
			super();
			this.head = head;
			this.body = body;
			this.end = end;
		}
		@Override
		public String toString() {
			return "Data [head=" + head + ", body=" + body + ", end=" + end + "]";
		}
		
	}
	
	public class DataBuilder{
		public String bulid(Data data){
			buildHead(data);
			buildBody(data);
			buildEnd(data);
			return data.toString();
		}
		
		public void buildHead(Data data){
			data.setBody("head:"+data.getHead());
		}
		
		public void buildBody(Data data){
			data.setBody("body:"+data.getBody());
		}
		
		public void buildEnd(Data data){
			data.setEnd("end:"+data.getEnd());
		}
	}
	
	public static void main(String[] args) {
		BuilderUnit bu = new BuilderUnit();
		Data data = bu.new Data("authriotion=none", "name=134&pass=1234", "!3>");
		DataBuilder db = bu.new DataBuilder();
		System.out.println(db.bulid(data));
	}
	
}
