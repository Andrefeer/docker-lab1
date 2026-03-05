import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {

    public static String citire(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
    public static String farapct(String text) {
        return text.replaceAll("[^a-zA-Z0-9\s]", "");
    }
    public static String micute(String text) {
        return text.toLowerCase();
    }
    public static String minusspatii(String text) {
        return text.replace(" ", "").trim();
    }

    public static void main(String[] args) throws Exception {

        String text = citire("src\\intrare");
        text = farapct(text);
        text = micute(text);
        text = minusspatii(text);
        System.out.println("Rezultat final:");
        System.out.println(text);
}
}