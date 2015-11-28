import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.Path;
public class CreateFilesAndDirectories {

    public static void main(String[] args) {
        createNewFile();
        createFileAlreadyExists();
        createFileWithNoParent();
        checkFileExists();
    }
    
    public static void createNewFile () {
        try {
            Path path = Paths.get("8_2_1/8_2_1_1/test.txt");
            // This will create the directory by getting the parent structure of the file
            Files.createDirectories(path.getParent());
            // This will create the file using the full path above
            Files.createFile(path);
        }
        catch(IOException e) {
            
        }
    }
    
    public static void createFileAlreadyExists() {
        // Attempt to create a fie that already exists - we should get a FileAlreadyExistsException
        try {
            Path path = Paths.get("8_2_1/8_2_1_1/test.txt");
            Files.createFile(path);    
        }
        catch(IOException e) {
            System.out.println("Tried creating a file that already exists, exception: "+e.getClass());
        }
        
    }
    
    public static void createFileWithNoParent() {
        try {
            Path path = Paths.get("8_2_a/test2.txt");
            // Try to create a file whose parent directory does not exist
            Files.createFile(path);
        }
        catch(IOException e) {
            System.out.println("Directory or file does not exist, exception: "+e.getClass());
        }
        
    }
    
    public static void checkFileExists() {
        Path path = Paths.get("8_2_1");
        System.out.println("Exists: "+Files.exists(path));
        
        path = Paths.get("8_2_a");
        System.out.println("Exists: "+Files.notExists(path));
    }
}