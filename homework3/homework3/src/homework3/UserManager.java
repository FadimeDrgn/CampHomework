package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.userId + " id'li kullan�c� eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.userId + " id'li kullan�c�g�ncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.userId + " id'li kullan�c�silindi.");
	}
}
