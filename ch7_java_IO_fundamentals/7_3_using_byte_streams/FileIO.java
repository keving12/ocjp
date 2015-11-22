import java.io.*;
public class FileIO {

    public static void main(String[] args) {
        FileIO fio = new FileIO();
        try {
            fio.readAndWriteFile();    
            fio.readAndWriteFileBuffer();
        }
        catch(IOException e) {
            System.out.println("Error reading from or writing to file: "+e);
        }
        
    }
    
    public void readAndWriteFile() throws IOException {
        
        try (InputStream inStream = new FileInputStream(new File("/home/ubuntu/workspace/file-io-test-in.txt"));
             OutputStream outStream = new FileOutputStream(new File("/home/ubuntu/workspace/file-io-test-out.txt"));){
            
            int bytes = 0;
            while((bytes = inStream.read()) != -1) {
                outStream.write(bytes);    
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not find either the input or output file: "+e);
        }
        
        
    }
    
    public void readAndWriteFileBuffer() throws IOException {
        
        try (InputStream inStream = new FileInputStream(new File("/home/ubuntu/workspace/file-io-test-in.txt")); 
             OutputStream outStream = new FileOutputStream(new File("/home/ubuntu/workspace/file-io-test-buffered-out.txt"))) {
            
            int bytes = 0;
            byte[] bytesRead = new byte[1024];
            
            while((bytes = inStream.read(bytesRead)) != -1) {
                outStream.write(bytesRead, 0, bytes);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not find either the input or output file: "+e);
        }
    }
}