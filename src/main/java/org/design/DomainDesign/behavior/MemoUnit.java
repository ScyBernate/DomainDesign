package org.design.DomainDesign.behavior;

import java.util.Date;

/**
 * 
  * @ClassName: MemoUnit
  * @Description: 备忘录模式：将当前对象的状态复制作为备份，以防万一
  * @author scy
  * @date 2017年11月16日 下午3:55:46
  *
 */
public class MemoUnit {
	//项目发布部署过程
	public class ReleseVersion{
		private Date date;    //发布时间
		
		private String code;  //当前版本的代码
		
		private ReleseVersion old;  //上一版本（备份）

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public ReleseVersion getOld() {
			return old;
		}

		public void setOld(ReleseVersion old) {
			this.old = old;
		}
		
	}
	
	public static void main(String[] args) {
		MemoUnit mu = new MemoUnit();
		ReleseVersion rv = mu.new ReleseVersion();
		rv.setOld(rv);//发布之前将当前的备份
		rv.setCode("new code");
		rv.setDate(new Date());
	}

}
