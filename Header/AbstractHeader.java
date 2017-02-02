package Message.Header;

import java.io.Serializable;

/**
 * Dev: mmachado on 14/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public abstract class AbstractHeader<T> implements Serializable {

    public abstract T getDestination();

    public abstract T getSource();

    public abstract void setSource(T source);

    public abstract void setDestination(T destination);

    public abstract T toString();
}
