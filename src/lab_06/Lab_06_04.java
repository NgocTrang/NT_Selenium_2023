package lab_06;

public class Lab_06_04 {
    public static void main(String[] args) {
        String url = "https://facebook.net";
        checkSSL(url);
        checkDomainName(url);
        checkExtensionName(url);
    }
    public static void checkSSL(String url) {
        if (url.contains("https")) {
            System.out.println("SSL enabled");
        } else {
            System.out.println("SSL unabled");
        }
    }
    public static void checkDomainName(String url) {
        String[] urlSplit = url.split("://");
        String domain = urlSplit[1].trim();
        System.out.println("The domain name is: " + domain);
    }
    public static void checkExtensionName(String url) {
        boolean isDotCom = false;
        if (url.contains(".com")) {
            isDotCom = true;
        }
        if (isDotCom == true) {
            System.out.println("The extension name is .com");
        } else {
            System.out.println("The extension name is .net");
        }
    }
}
