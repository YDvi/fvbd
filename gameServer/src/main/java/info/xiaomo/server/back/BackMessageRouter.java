package info.xiaomo.server.back;

import info.xiaomo.core.net.Message;
import info.xiaomo.core.net.NetworkConsumer;
import info.xiaomo.server.server.Session;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackMessageRouter implements NetworkConsumer {
	
	private static Logger LOGGER = LoggerFactory.getLogger(BackMessageRouter.class);

	@Override
	public void consume(Channel channel, Message msg) {
		Session session = new Session();
		session.setChannel(channel);
		msg.setParam(session);
		try {
			msg.doAction();
		} catch (Exception e) {
			LOGGER.error("back server 执行消息发生错误.", e);
		}
	}
	
	
}
