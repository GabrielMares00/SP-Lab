public class WindowsPhone implements OperatingSystem {
    @Override
    public void print(String message) {
        System.out.println("@WP: " + message + "Windows Phone");
    }
}
