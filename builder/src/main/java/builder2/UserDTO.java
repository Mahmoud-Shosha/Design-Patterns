package builder2;

import java.time.LocalDate;
import java.time.Period;

import builder1.Address;

// A product in builder pattern
// It is immutable
public class UserDTO {

	private String name;
	private String address;
	private String age;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	// Get builder instance
	public static UserDTOBuilder getBuider() {
		return new UserDTOBuilder();
	}

	// This is a common way to implement a builder
	public static class UserDTOBuilder {

		private String firstName;
		private String lastName;
		private String age;
		private String address;
		private UserDTO userDTO;

		public UserDTOBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserDTOBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserDTOBuilder withBirthDay(LocalDate birthDay) {
			Period ageInYears = Period.between(birthDay, LocalDate.now());
			this.age = String.valueOf(ageInYears.getYears());
			return this;
		}

		public UserDTOBuilder withAddress(Address address) {
			this.address = address.getHouseNumber() + "-" + address.getCity();
			return this;
		}

		public UserDTO build() {
			this.userDTO = new UserDTO();
			this.userDTO.setName(this.firstName + " " + this.lastName);
			this.userDTO.setAddress(this.address);
			this.userDTO.setAge(this.age);
			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}

	}

}
