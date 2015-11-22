import java.io.*;
public class DataOutputIO {

    public static void main(String[] args) {
        DataOutputIO outputIO = new DataOutputIO();
        try {
            outputIO.readWriteDataOutput();
        }
        catch(IOException e) {
            System.out.println("Error reading from or writing to file");
        }
        
    }
    
    public void readWriteDataOutput() throws IOException {
        try(DataOutputStream dos = new DataOutputStream(
            FileOutputStream fos = new FileOutputStream(new File("data-output.txt")));
            DataInputStream dis = new DataInputStream(
            FileInputStream fis = new FileInputStream(new File("data-input.txt")));) {
            
            dos.writeChars("ABC");
            dos.writeInt(12);
            dos.writeDouble(1.2);
            dos.writeBoolean(true);
            dos.writeUTF("Hi I am a data output stream");
            
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not find file");
        }
        
        
    }
}