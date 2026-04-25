package CreationalPatterns.Builder.UserExample;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDtoBuilder implements UserDtoBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;


    @Override
    public UserDtoBuilder withFirstName(String firstName) {
        this.firstName=firstName;
        return  this;
    }

    @Override
    public UserDtoBuilder withLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    @Override
    public UserDtoBuilder withBirthDate(LocalDate birthDate) {
        Period ageInYears=Period.between(birthDate,LocalDate.now());
        this.age=Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDtoBuilder withAddress(Address address) {
        this.address= address.getHouseNumber()+" "+address.getStreet()+" "+address.getCity()
                +" "+address.getState()+" "+address.getZipCode();
        return this;
    }

    @Override
    public UserDto build() {
        return new UserWebDto(firstName+" "+lastName,address,age);
    }

    @Override
    public UserDto getUserDto() {
        return null;
    }
}
