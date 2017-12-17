package com.cmos.ha.cmms.diplmt.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cmos.ha.cmms.dubbo.IDubboService;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
@Service
public class DubboServiceImpl implements IDubboService {

	@Override
	public String sayHello(String who) {
		return "hello " + who;
	}

}
