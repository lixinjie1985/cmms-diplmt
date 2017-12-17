package com.cmos.ha.cmms.diplmt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cmos.ha.cmms.diplmt.config.dubbo.DubboConfig;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
@Import(DubboConfig.class)
@Configuration
public class RootConfig {

}
