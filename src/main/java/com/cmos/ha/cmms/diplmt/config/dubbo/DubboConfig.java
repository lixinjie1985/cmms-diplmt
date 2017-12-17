package com.cmos.ha.cmms.diplmt.config.dubbo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
@Configuration
@DubboComponentScan(basePackages = {"com.cmos.ha.cmms.diplmt.dubbo.impl"})
public class DubboConfig {

	@Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-test");
        return applicationConfig;
    }
	
	@Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1");
        registryConfig.setProtocol("zookeeper");
        registryConfig.setPort(2181);
        registryConfig.setClient("curator");
        return registryConfig;
    }
	
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(20880);
		return protocolConfig;
	}
}
