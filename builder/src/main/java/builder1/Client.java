package builder1;

import java.time.LocalDate;

// The client class that also works as a director
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDtoBuilder builder = new UserWebDTOBuilder();
		UserDTO userDTO = getUsrDto(builder, user);
		System.out.println(userDTO);
	}

	// The director logic
	public static UserDTO getUsrDto(UserDtoBuilder builder, User user) {
		// This is called method chaining
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthDay(user.getBirthDay()).withAddress(user.getAddress()).build();
	}

	// Returns a sample user
	public static User createUser() {
		User user = new User();
		user.setBirthDay(LocalDate.of(1997, 1, 15));
		user.setFirstName("Mahmoud");
		user.setLastName("Shousha");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("El-Shoush");
		address.setCity("Baltim");
		address.setState("KFS");
		address.setZipcode("1234");
		user.setAddress(address);
		return user;
	}

}
