package FogLayer.Message.Payload;

import java.io.Serializable;

/**
 * Dev: mmachado on 13/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public class Payload<P> extends AbstractPayload<P> implements Serializable {

    private P payload;

    public Payload(P payload) {
        this.payload = payload;
    }

    public P getContent() {
        return payload;
    }

    public void setContent(P payload) {
        this.payload = payload;
    }

    public String toString() {
        return "Payload Information\n"
                + this.payload.toString();
    }
}
