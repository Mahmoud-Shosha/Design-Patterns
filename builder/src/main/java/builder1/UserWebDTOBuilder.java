package builder1;

import java.time.LocalDate;
import java.time.Period;

// The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDtoBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO userWebDTO;

	@Override
	public UserDtoBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@Override
	public UserDtoBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public UserDtoBuilder withBirthDay(LocalDate birthDay) {
		Period ageInYears = Period.between(birthDay, LocalDate.now());
		this.age = String.valueOf(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDtoBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + "-" + address.getCity();
		return this;
	}

	@Override
	public UserDTO build() {
		this.userWebDTO = new UserWebDTO(this.firstName + " " + this.lastName, this.address, this.age);
		return this.userWebDTO;
	}

	@Override
	public UserDTO getUserDTO() {
		return this.userWebDTO;
	}

}
