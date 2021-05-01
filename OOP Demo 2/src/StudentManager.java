
public class StudentManager extends UserManager{
	
	public void joinCourse(User user) {
		System.out.println("Kursa Katılındı "+user.getName());
	}
	
	
	public void leftCourse (User user) {
		System.out.println("Kurstan Çıkıldı "+user.getName());
	}
}
