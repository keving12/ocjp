import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.io.File;

public class CreatePaths {

    public static void main(String[] args) {
        create();
    
    }
    
    public static void create() {
        Path path = Paths.get("path", "to", "file");
        System.out.println(path);
        
        path = Paths.get("path/to/another/file");
        System.out.println(path);
        
        File file = new File("Here/is/a/file");
        System.out.println(file.toPath());
        
        FileSystem fileSystem = FileSystems.getDefault();
        path = fileSystem.getPath("path", "using", "filesystem");
        System.out.println(path);
        
        // empty path means it refers to the current directory
        path = Paths.get("");
        System.out.println(path.toAbsolutePath());
    }
}