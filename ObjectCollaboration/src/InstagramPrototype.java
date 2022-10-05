import org.w3c.dom.ls.LSOutput;

public class InstagramPrototype {
    Profile profile;
    Address address;

    public static void main(String[] args) {
        InstagramPrototype user1 = new InstagramPrototype();
        user1.profile = new Profile();
        user1.address = new Address();

        user1.profile.Name = "Yogesh";
        user1.profile.DateOfBirth = "15 March 2004";
        user1.profile.Username = "yog.k";
        user1.profile.Password = "1122334455";

        user1.address.city = "Gurugram";
        user1.address.country = "India";
        user1.address.state = "Haryana";

        InstagramPrototype user2 = new InstagramPrototype();
        user2.profile = new Profile();
        user2.address = new Address();

        user2.profile.Name = "Rohit";
        user2.profile.DateOfBirth = "28 Feburary 2004";
        user2.profile.Username = "rohit.S";
        user2.profile.Password = "rohit12345";

        user2.address.city = "Una";
        user2.address.country = "India";
        user2.address.state = "Himachal Pradesh";


        user1.profile.profileprint();
        user1.address.addressprint();
        System.out.println("----------------");
        user2.profile.profileprint();
        user2.address.addressprint();
    }
}

