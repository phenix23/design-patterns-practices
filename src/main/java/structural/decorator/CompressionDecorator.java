package structural.decorator;

public class CompressionDecorator  extends DataSourceDecorator{

    public CompressionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public String read() {
        return super.read();
    }

    @Override
    public void write(String data) {
        String sb =  data + " It's my work to compress data " ;
        super.write(sb);
    }
}
