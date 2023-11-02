package builder2;

import java.time.LocalDate;

import builder1.Address;
import builder1.User;
import builder2.UserDTO.UserDTOBuilder;

// The client class that also works as a director
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = UserDTO.getBuider();
		UserDTO userDTO = getUsrDto(builder, user);
		System.out.println(userDTO);
	}

	// The director logic
	public static UserDTO getUsrDto(UserDTOBuilder builder, User user) {
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
