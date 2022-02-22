package info.xiaomo.server.back.msg;


import info.xiaomo.server.back.BackManager;
import info.xiaomo.server.server.AbstractMessage;
import io.netty.buffer.ByteBuf;

/**
 * 请求关服
 */
public class ReqCloseServerMessage extends AbstractMessage {

    @Override
    public void doAction() {
        BackManager.getInstance().closeServer(sequence, session);
    }

    public ReqCloseServerMessage() {
        this.queueId = 1;
    }

    @Override
    public int getId() {
        return 1001;
    }


    @Override
    public boolean read(ByteBuf buf) {

        return true;
    }

    @Override
    public boolean write(ByteBuf buf) {

        return true;
    }
}

