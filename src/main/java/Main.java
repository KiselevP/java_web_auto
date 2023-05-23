public class Main {
    public static void main(String[] args) throws InterruptedException {
        Authorization.authorization();
        LogOut.logOut();
        Search.searchOnSite();
        Surfing.siteSurfing();
    }
}
