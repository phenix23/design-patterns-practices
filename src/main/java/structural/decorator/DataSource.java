package structural.decorator;

/**
 *  The component interface defines operations that can be altered by decorators.
 */
public interface DataSource {

    String read();
    void write(String data);
}
