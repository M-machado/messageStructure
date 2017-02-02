package Message.Header;

import java.io.Serializable;

/**
 * Dev: mmachado on 15/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public class SimpleHeader<T> extends AbstractHeader<T> implements Serializable {

    private T source;

    private T destination;

    public SimpleHeader(T source, T destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public T getDestination() {
        return destination;
    }

    @Override
    public T getSource() {
        return source;
    }

    @Override
    public void setSource(T source) { this.source = source; }

    @Override
    public void setDestination(T destination) { this.destination = destination; }

    @Override
    public String toString() {
        return "AbstractHeader Information\n"
                + "Source: " + this.source.toString() + "\n"
                + "Destination: " + this.destination.toString();
    }
}
