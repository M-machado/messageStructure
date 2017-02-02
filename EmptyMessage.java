package FogLayer.Message;

import FogLayer.Message.Header.AbstractHeader;
import FogLayer.Message.Header.EmptyHeader;
import FogLayer.Message.Payload.AbstractPayload;
import FogLayer.Message.Payload.EmptyPayload;

import java.io.Serializable;

/**
 * Dev: mmachado on 21/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public class EmptyMessage implements MessageInterface, Serializable {

    @Override
    public AbstractHeader getHeader() {
        return new EmptyHeader();
    }

    @Override
    public AbstractPayload getPayload() {
        return new EmptyPayload();
    }
}
