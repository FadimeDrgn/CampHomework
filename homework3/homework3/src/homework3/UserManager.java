package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.userId + " id'li kullanýcý eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.userId + " id'li kullanýcýgüncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.userId + " id'li kullanýcýsilindi.");
	}
}
