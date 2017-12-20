package com.cmos.ha.cmms.diplmt.tempmsg.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.cmos.ha.cmms.common.tempmsg.SlideResult;
import com.cmos.ha.cmms.common.tempmsg.TempMsg;
import com.cmos.ha.cmms.common.tempmsg.dubbo.ITempMsgSlider;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
//这个Dubbo的Service注解并不会把该类注册为spring的bean
@Service
public class TempMsgSlider implements ITempMsgSlider {

	@Override
	public SlideResult slideTempMsg(TempMsg tempMsg) {
		return null;
	}

}
