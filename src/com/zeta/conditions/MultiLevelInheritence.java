package com.zeta.conditions;

import com.zeta.helper.help;

class animal{
	void eat(){
		help.getLog(MultiLevelInheritence.class).info("eating...");
	}
}
class dog extends animal{
	void bark(){
		help.getLog(MultiLevelInheritence.class).info("barking...");
	}
}
class babydog extends dog{
	void weep(){
		help.getLog(MultiLevelInheritence.class).info("weeping...");
	}
}
public class MultiLevelInheritence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babydog d = new babydog();
		d.weep();
		d.bark();
		d.eat();

	}

}
