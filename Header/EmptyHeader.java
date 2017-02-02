package Message.Header;

import java.io.Serializable;

/**
 * Dev: mmachado on 22/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public class EmptyHeader<T> extends AbstractHeader<T> implements Serializable{

    @Override
    public T getDestination() {
        return null;
    }

    @Override
    public T getSource() {
        return null;
    }

    @Override
    public void setSource(T source) {

    }

    @Override
    public void setDestination(T destination) {

    }

    @Override
    public String toString() {
        return "";
    }
}
