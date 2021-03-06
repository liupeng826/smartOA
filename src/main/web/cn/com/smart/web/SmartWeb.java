package cn.com.smart.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.com.smart.Smart;
import cn.com.smart.web.cache.InitMemoryCacheFacotry;

/**
 * WEB接口实现类
 * @author lmq
 * @create 2015年6月24日
 * @version 1.0
 * @since
 *
 */
public class SmartWeb extends Smart implements ISmartWeb {

	private static final Logger log = LoggerFactory.getLogger(SmartWeb.class);

	@Override
	public void initSystem() {
		log.info("初始化内存缓存数据");
		//初始化内存缓存
		InitMemoryCacheFacotry.getInstance();
	}



}
