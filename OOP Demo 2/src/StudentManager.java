
public class StudentManager extends UserManager{
	
	public void joinCourse(User user) {
		System.out.println("Kursa Kat�l�nd� "+user.getName());
	}
	
	
	public void leftCourse (User user) {
		System.out.println("Kurstan ��k�ld� "+user.getName());
	}
}
