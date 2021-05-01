
public class Main {

	public static void main(String[] args) {
		
		Student user1 = new Student();
		user1.setId(2004);
		user1.setName("Bilgehan");
		user1.setSurname("Yaradanakul");
		user1.setStudentNumber(3630);
		
		Instructor user2 = new Instructor();
		user2.setId(1993);
		user2.setName("Engin");
		user2.setSurname("Demiroğ");
		user2.setInstructorNumber(4638);
		
		UserManager userManager = new UserManager();
		userManager.login(user2);
		userManager.logout(user2);
		System.out.println("--------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(user1);
		studentManager.joinCourse(user1);
		System.out.println("------------------------------");
	
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse();
		instructorManager.deleteCourse();
		System.out.println("---------------------------------");
		
		

	}

}
