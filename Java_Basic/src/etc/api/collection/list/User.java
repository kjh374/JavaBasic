package etc.api.collection.list;

public class User {

	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "나는 " + name + ". 나이는 " + age + "세지!";
	}


	public String getName() {
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
