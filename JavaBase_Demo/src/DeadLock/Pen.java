package DeadLock;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Pen {

	private String name = "我是pen!";
	private String owner;        	         //	对象的占有者
	@Getter
	private Boolean isPrivated = false;       //判断对象是否被占有
}
