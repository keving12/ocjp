import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.FileSystems;

public class QueryAndManipulatePaths {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("/Users/kg/folder1/subfolder1/file.txt");
        
        // This will print '/' on a unix filesystem and drive label on windows
        System.out.println(path.getRoot());
        System.out.println(path.getName(0));
        System.out.println(path.getName(1));
        // Simply prints the item after the last seperator
        System.out.println(path.getFileName());
        // Should print 5 as we have 4 folders and then a file
        System.out.println(path.getNameCount());
        // Should print '/Users/kg/folder1/subfolder1'
        System.out.println(path.getParent());
        // Should print 'Users/kg' - The root is not included
        System.out.println(path.subpath(0, 2));
        
        // relative path
        path = Paths.get("relative.txt");
        // Should print null as we don't know the root - this is a relative path
        System.out.println(path.getRoot());
        // This will thrown runtime exception IllegalArgumentException as we don't have a path at index 2
        //System.out.println(path.getName(2));
        
        pathComparison();
        pathConversion();
        pathResolve();
        pathRelativize();
    }
    
    public static void pathComparison() {
        Path first = Paths.get("c/path/to/file.txt");
        Path second = Paths.get("b/is/another/path/to/file.txt");
        
        if(first.compareTo(second) < 0) {
            System.out.println("First lexicographically less than second");
        }
        else if(first.compareTo(second) > 0) {
            System.out.println("First lexicographically more than second");
        }
        else {
            System.out.println("Lexicographically equal");
        }
        
        System.out.println(first.startsWith("c"));
        System.out.println(first.startsWith(Paths.get("c")));
        System.out.println(second.endsWith("file.txt"));
        System.out.println(first.endsWith(Paths.get("file.txt")));
        
        System.out.println(first.startsWith("c"));
        // Although this does match the last few characters of the path because it is not a string comparison but a 
        // comparison of Path objects this will return false
        System.out.println(first.endsWith("ile.txt"));
        // This should return true 
        System.out.println(first.endsWith("file.txt"));
    }
    
    public static void pathConversion() {
        Path file = Paths.get("file.txt");
        Path path = file.toAbsolutePath();
        System.out.println(path);
        
        // A path representing a file in the parent directory of the current directory
        file = Paths.get("../file.txt");
        path = file.toAbsolutePath();
        System.out.println(path);
        // Remove the redundant parts of the path
        System.out.println(path.normalize());
        
    }
    
    public static void pathResolve() {
        Path path = Paths.get("here/a/stub");
        System.out.println(path.resolve("with/file.txt"));
        // Because this is an absolute path it will be returned as it, no need for joining with path
        System.out.println(path.resolve("/this/is/absolute/path/to/file.txt"));
        
        path = Paths.get("/path/to/folder/file1.txt");
        Path siblingPath = path.resolveSibling("file2.txt");
        // Should be '/path/to/folder/file2.txt'
        System.out.println(siblingPath);
    }
    
    public static void pathRelativize() {
        Path first = Paths.get("directory");
        Path second = Paths.get("directory/subdirectory/file1.txt");
        // Will print ../../ as we have to go up two levels to get from file1.txt to directory
        System.out.println(second.relativize(first));
        // Will print subdirectory/file1.txt as this is how we get from directory to file1.txt
        System.out.println(first.relativize(second));
    }
    
    
}