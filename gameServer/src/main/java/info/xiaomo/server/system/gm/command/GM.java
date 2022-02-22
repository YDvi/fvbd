package info.xiaomo.server.system.gm.command;

import info.xiaomo.server.server.Session;
import info.xiaomo.server.system.gm.GMCommand;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/13 15:44
 * desc  : gm命令接口
 * Copyright(©) 2017 by xiaomo.
 */
public interface GM {

    String executeGM(Session session, String [] gmStr);

}
