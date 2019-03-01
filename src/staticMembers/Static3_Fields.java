package staticMembers;

public class Static3_Fields {

	static int count;
	static int countOfGetNameCall;
	private String name;
	private int age;
	
	public Static3_Fields(String name, int age) {
		this.name = name;
		this.age = age;
		count ++;
	}	
	
	public String getName() {
		countOfGetNameCall ++;
		return name;		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
