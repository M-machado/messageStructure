package FogLayer.Message.Payload;


import java.io.Serializable;

/**
 * Dev: mmachado on 22/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public abstract class AbstractPayload<P> implements Serializable{

    public abstract P getContent();
    public abstract void setContent(P payload);
    public abstract String toString();

}
