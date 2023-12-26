package first;

public class Auth {
    public User login() {
        return new MyTwitterUser(new TwitterUser());
        // return new MyFacebookUser(new FacebookUser());
    }
}