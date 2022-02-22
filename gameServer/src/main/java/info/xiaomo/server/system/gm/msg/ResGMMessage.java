package info.xiaomo.server.system.gm.msg;

import info.xiaomo.server.server.AbstractMessage;
import io.netty.buffer.ByteBuf;



/**
 * 返回gm
 */
public class ResGMMessage extends AbstractMessage {

	@Override
	public void doAction() {
		
	}
	
	public ResGMMessage() {
		this.queueId = 2;
	}
	
	@Override
	public int getId() {
		return 2002;
	}
	
	/**
	 * 执行结果
	 */
	private String content;


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

	@Override
	public boolean read(ByteBuf buf) {
		this.content = readString(buf);

		return true;
	}

	@Override
	public boolean write(ByteBuf buf) {
		this.writeString(buf, content);

		return true;
	}
}

