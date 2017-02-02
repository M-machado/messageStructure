package Message.Payload;


import java.io.Serializable;

/**
 * Dev: mmachado on 22/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public class EmptyPayload<P> extends AbstractPayload<P> implements Serializable{

    @Override
    public P getContent() {
        return null;
    } //no other way around

    @Override
    public void setContent(P payload) {
        //void Implementation
    }

    @Override
    public String toString() {
        return "";
    }
}
