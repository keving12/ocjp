import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class CopyFiles {
    
    public static void main(String[] args) {
        fileCopy();
        fileCopyReplaceExisting();
        //fileCopyFromInputStream();
        fileCopyToOutputStream();
        moveFileWithRename();
        moveFileWithReplace();
    }
    
    public static void fileCopy() {
        try {
            Path source = Paths.get("8_2_1/8_2_1_1/test.txt");
            Path target = Paths.get("./test.txt");
            Files.copy(source, target);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void fileCopyReplaceExisting() {
        try {
            Path source = Paths.get("./test.txt");
            Path target = Paths.get("8_2_1/8_2_1_1/test.txt");
            // Using the replace existing copy option prevent the runtime complaining about the file already existing
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void fileCopyFromInputStream() {
        try (InputStream in = System.in) {
            Path target = Paths.get("textFromInputStream.txt");
            Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void fileCopyToOutputStream() {
        try (OutputStream out = System.out){
            Path source = Paths.get("textFromInputStream.txt");
            Files.copy(source, out);
        }
        catch(IOException e) {
            
        }
    }
    
    public static void moveFileWithRename() {
        try {
            Path source = Paths.get("test.txt");
            Files.move(source, Paths.get("copy-test.txt"));
        }
        catch(IOException e) {
            
        }
    }
    
    public static void moveFileWithReplace() {
        try {
            Path source = Paths.get("test.txt");
            Path target = Paths.get("/home/ubuntu/workspace");
            // Resolved will join source filename with target path to return absolute path to new file
            Files.move(source, target.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        }
        catch(IOException e) {
            
        }
    }
}