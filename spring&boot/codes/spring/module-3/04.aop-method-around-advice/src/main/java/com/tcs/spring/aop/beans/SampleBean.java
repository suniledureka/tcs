package	com.tcs.spring.aop.beans;

import java.util.Random;

public class SampleBean {
	public void actualLogicMethod() {
		System.out.println("--- in this method we write the actual business logic ---");
	}
	
	public Boolean depositAmount(String acno, float amt) {
		System.out.println("--- core concern for depositing amount ---");
		return new Random().nextBoolean();
	}
}
