package test.mypac;

public class FriendDto {
	private int num;
	private String name;
	private String phone;
	private String gender;
	
	//디폴트 생성자
	public FriendDto() {}

	public FriendDto(int num, String name, String phone, String gender) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
