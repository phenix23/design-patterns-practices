package structural.decorator;

/**
 * Concrete decorators must call methods on the wrapped object,
 * but may add something of their own to the result. Decorators
 * can execute the added behavior either before or after the
 * call to a wrapped object.
 */

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public String read() {
        return super.read();
    }

    @Override
    public void write(String data) {
        String sb =  data + " It's my work to encrypt data " ;
        super.write(sb);
    }
}
