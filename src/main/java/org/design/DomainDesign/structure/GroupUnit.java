package org.design.DomainDesign.structure;

import java.util.HashSet;
import java.util.Set;


/**
 * 
  * @ClassName: GroupUnit
  * @Description: 组合模式：使得用户对单个对象和组合对象的使用具有一致性。使得客户能够像处理简单元素一样来处理复杂元素
  * @author scy
  * @date 2017年11月16日 下午1:35:48
  *
 */
public class GroupUnit {
	
	public class City{
		
		private Set<City> city;
		
		String cityName;

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public City(String cityName) {
			super();
			this.cityName = cityName;
		}

		public Set<City> getCity() {
			return city;
		}

		public void setCity(Set<City> city) {
			this.city = city;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			city.forEach( i ->sb.append(" "+ i.getCityName()));
			return "City [city=" + sb.toString() + ", cityName=" + cityName + "]";
		}
	}
	
	public static void main(String[] args) {
		GroupUnit gu = new GroupUnit();
		City city1 = gu.new City("北京");
		City city2 = gu.new City("上海");
		City city3 = gu.new City("南京");
		City city4 = gu.new City("天津");
		City total = gu.new City("中国");
		Set<City> citys = new HashSet<City>(){
			private static final long serialVersionUID = 1L;
			{
				add(city1);
				add(city2);
				add(city3);
				add(city4);
			}
		};
		total.setCity(citys);
		System.out.println(total.toString());
	}

}
