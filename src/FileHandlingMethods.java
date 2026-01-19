import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandlingMethods {

    public static void main(String[] args) {
        readFileExample();
        writeFileExample();
    }

    private static void readFileExample() {
        System.out.println("Reading from a file...");
        Path filePath = Path.of("read.txt");
        try {
            String content = Files.readString(filePath);
            System.out.println("File content: " + content);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static void writeFileExample() {
        System.out.println("Writing to a file...");
        Path filePath = Path.of("write.txt");
        String content = "Hello, this is a test write operation!";
        try {
            Files.writeString(filePath, content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
