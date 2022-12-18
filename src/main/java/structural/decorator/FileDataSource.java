package structural.decorator;


import java.io.*;
import java.nio.file.*;

/**
 * Concrete components provide default implementations for the
 * operations. There might be several variations of these
 * classes in a program.
 */

public class FileDataSource implements DataSource{

    private File file;

    public FileDataSource(String path) {
        file = new File(path);
    }


    @Override
    public String read() {
        String result = null;
        try {
             result = Files.readString(file.toPath());
        } catch (IOException e) {
            throw new IllegalStateException("Error reading file");
        }
        return result;
    }

    @Override
    public void write(String data) {
        try {
            Files.writeString(file.toPath(),data, StandardOpenOption.WRITE ,StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Error writing file");
        }
    }
}
