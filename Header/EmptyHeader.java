package FogLayer.Message.Header;

import java.io.Serializable;

/**
 * Dev: mmachado on 22/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public class EmptyHeader extends AbstractHeader implements Serializable{

    @Override
    public String getDestination() {
        return "";
    }

    @Override
    public String getSource() {
        return "";
    }

    @Override
    public void setSource(String source) {

    }

    @Override
    public void setDestination(String destination) {

    }

    @Override
    public String toString() {
        return "";
    }
}
