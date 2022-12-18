package structural.decorator;

/**
 * The base decorator class follows the same interface as the other components.
 * The primary purpose of this class is to define the wrapping interface for all concrete decorators.
 * The default implementation of the wrapping code might include a field for storing a wrapped component and the means to
 * initialize it.
 */

public class DataSourceDecorator implements DataSource{

    protected DataSource wrapper ;

    public DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    /**
     * The base decorator simply delegates all work to the wrapped component.
     * Extra behaviors can be added in concrete decorators.
     *
     */

    @Override
    public String read() {
       return this.wrapper.read();
    }

    /**
     * Concrete decorators may call the parent implementation of the operation instead of calling the wrapped object
     * directly. This approach simplifies extension of decorator classes.
     *
     * @param data
     */

    @Override
    public void write(String data) {
       this.wrapper.write(data);
    }
}
