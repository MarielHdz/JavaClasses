package staticMembers;

public class Static3_FieldsRunner {

	public static void main(String[] args) {
		
		Static3_Fields voter1 = new Static3_Fields("Paola", 31);
		Static3_Fields voter2 = new Static3_Fields("Luna", 21);
		System.out.println(Static3_Fields.count); //2
		
		Static3_Fields voter3 = new Static3_Fields("Paola", 31);
		System.out.println(Static3_Fields.count); //3

		voter1.getName();
		voter2.getName();
		voter3.getName();
		voter1.getName();

		System.out.println(Static3_Fields.countOfGetNameCall);//4

	}
}
