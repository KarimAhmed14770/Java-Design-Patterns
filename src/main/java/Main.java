import CreationalPatterns.Builder.UserExample.*;
import CreationalPatterns.Factory.SimpleFactory.Example.BlogPost;
import CreationalPatterns.Factory.SimpleFactory.Example.NewsPost;
import CreationalPatterns.Factory.SimpleFactory.Example.Post;
import CreationalPatterns.Factory.SimpleFactory.Example.PostFactory;

import java.time.LocalDate;

public class Main {//in the main class i write test for each design pattern
    public static void main(String[] args){
        /*Builder design pattern test*/
        User user=createUser();
        UserDtoBuilder builder=new UserWebDtoBuilder();
        UserDto dto=directorBuild(builder,user);
        System.out.println(dto);

        /*Simple factory test*/
        Post post= PostFactory.createPost("blog");
        System.out.println(post instanceof BlogPost);


    }

    /* Builder design pattern: our object is to build a UserDto from a user entity */
    private static User createUser(){
        //this method simulates getting a user entity from persistence layer
        User user=new User();
        user.setFirstName("Karim");
        user.setLastName("Ahmed");
        user.setBirthDate(LocalDate.of(1987,4,21));
        Address address=new Address();
        address.setHouseNumber("90");
        address.setCity("Cairo");
        address.setStreet("abd elhameed badawy");
        address.setState("");
        address.setZipCode("11843");
        user.setAddress(address);
        return user;
    }

    private static UserDto directorBuild(UserDtoBuilder builder,User user){
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthDate(user.getBirthDate())
                .withAddress(user.getAddress())
                .build();
    }


}
