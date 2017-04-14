package JavaBase_Enumeration;

import org.omg.CORBA.PUBLIC_MEMBER;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum EnumTest {

	MON("星期一",1),TUE("星期二",2),WED("星期三",3),THU("星期四",4),FRI("星期五",5),SAT("星期六",6),SUN("星期日",7);
	
	@Setter
	private String name;
	@Setter
	private int index;
	
	private EnumTest(String name,int index){
		this.name =name;
		this.index =index;
	}
}


