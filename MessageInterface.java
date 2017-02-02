package Message;

import Message.Header.AbstractHeader;
import Message.Payload.AbstractPayload;

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
