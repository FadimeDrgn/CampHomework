package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.userId + " id'li kullanıcı eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.userId + " id'li kullanıcıgüncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.userId + " id'li kullanıcısilindi.");
	}
}
