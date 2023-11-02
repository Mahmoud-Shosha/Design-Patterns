package builder1;

import java.time.LocalDate;

// The Abstract builder
public interface UserDtoBuilder {

	// Methods to build parts of the object one at a time
	UserDtoBuilder withFirstName(String firstName);

	UserDtoBuilder withLastName(String lastName);

	UserDtoBuilder withBirthDay(LocalDate birthDay);

	UserDtoBuilder withAddress(Address address);

	// Method to assemble final product
	UserDTO build();

	// Optional: Method to fetch already built object
	UserDTO getUserDTO();

}
