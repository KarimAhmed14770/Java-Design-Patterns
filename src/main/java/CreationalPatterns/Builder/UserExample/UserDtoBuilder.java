package CreationalPatterns.Builder.UserExample;

import java.time.LocalDate;

/*the builder interface*/
public interface UserDtoBuilder {
    UserDtoBuilder withFirstName(String firstName);
    UserDtoBuilder withLastName(String lastName);
    UserDtoBuilder withBirthDate(LocalDate birthDate);
    UserDtoBuilder withAddress(Address address);

    UserDto build(); //method used to assemble the object
    UserDto getUserDto();//optional method to retrieve an object already built

}
