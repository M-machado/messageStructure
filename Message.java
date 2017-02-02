package FogLayer.Message;

import FogLayer.Message.Header.AbstractHeader;
import FogLayer.Message.Header.SimpleHeader;
import FogLayer.Message.Payload.AbstractPayload;
import FogLayer.Message.Payload.EmptyPayload;


import java.io.Serializable;

/**
 * Dev: mmachado on 13/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public class Message implements Serializable, MessageInterface {

    AbstractHeader abstractHeader;

    AbstractPayload payload;

    public Message(AbstractHeader abstractHeader, AbstractPayload payload) {
        this.abstractHeader = abstractHeader;
        this.payload = payload;
    }

    public void setHeader(AbstractHeader abstractHeader) {
        this.abstractHeader = abstractHeader;
    }

    public void setPayload(AbstractPayload payload) {
        this.payload = payload;
    }

    public AbstractHeader getHeader() {
        return abstractHeader;
    }

    @Override
    public AbstractPayload getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "Message: \n"
                + this.abstractHeader.toString()
                + this.payload.toString();
    }
}
