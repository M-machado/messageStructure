package FogLayer.Message;

import FogLayer.Message.Header.AbstractHeader;
import FogLayer.Message.Payload.AbstractPayload;

/**
 * Dev: mmachado on 15/11/16.
 * Project Name: p2pPOC
 * IDE: IntelliJ IDEA
 */
public interface MessageInterface {

    AbstractHeader getHeader();

    AbstractPayload getPayload();

    String toString();

}
