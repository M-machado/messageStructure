package Message.Header;

import java.io.Serializable;

/**
 * Dev: mmachado on 14/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public abstract class AbstractHeader implements Serializable {

    public abstract String getDestination();

    public abstract String getSource();

    public abstract void setSource(String source);

    public abstract void setDestination(String destination);

    public abstract String toString();
}
