package quiz21;

public class Data {
//	private
	private String name;
	private String age;
	private String email;
	private String adress;

	Data() {

	}

	Data(String name, String age, String email, String adress) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
