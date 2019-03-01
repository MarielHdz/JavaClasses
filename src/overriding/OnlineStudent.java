package overriding;

public class OnlineStudent extends Student{

	private int webinarId;
	
	public OnlineStudent(String name, int studentId, int webinarId) {
		super(name, studentId);
		this.webinarId = webinarId;
	}
	
	public void attendClass() {
		System.out.println("attending class online using webinar");
	}
}
