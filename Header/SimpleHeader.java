package Message.Header;

import java.io.Serializable;

/**
 * Dev: mmachado on 15/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public class SimpleHeader extends AbstractHeader implements Serializable {

    private String source;

    private String destination;

    public SimpleHeader(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public String getSource() {
        return source;
    }

    @Override
    public void setSource(String source) { this.source = source; }

    @Override
    public void setDestination(String destination) { this.destination = destination; }

    @Override
    public String toString() {
        return "AbstractHeader Information\n"
                + "Source: " + this.source + "\n"
                + "Destination: " + this.destination;
    }
}
