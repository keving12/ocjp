import java.io.*;
public class BufferedFileIO {

    public static void main(String[] args) {
        BufferedFileIO bfio = new BufferedFileIO();
        try {
            bfio.bufferedFileReadWrite();    
        }
        catch(IOException e) {
            System.out.println("Error reading from or writing to file: "+e);
        }
    }
    
    public void bufferedFileReadWrite() throws IOException {
        try(BufferedInputStream bufInStream 
            = new BufferedInputStream(new FileInputStream(new File("/home/ubuntu/workspace/buffered-in.txt")));
            BufferedOutputStream bufOutStream 
            = new BufferedOutputStream(new FileOutputStream(new File("/home/ubuntu/workspace/buffered-out.txt")));) {
            
            int bytes = 0;
            while((bytes = bufInStream.read()) != -1) {
                bufOutStream.write(bytes);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}