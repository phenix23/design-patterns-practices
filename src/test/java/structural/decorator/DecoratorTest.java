package structural.decorator;

import org.testng.annotations.Test;

public class DecoratorTest {

    @Test
    void testDecorator(){
        // Order wrapper stack : DataSource > Compression > Encryption
        // It’s hard to implement a decorator in such a way that its behavior
        // doesn’t depend on the order in the decorators stack.

        FileDataSource source = new FileDataSource("src/main/resources/source-file.txt");

        source.write("data to write !! ");

        new CompressionDecorator(source).write("compressor write");

        new EncryptionDecorator(source).write("encryption write");
    }

}
