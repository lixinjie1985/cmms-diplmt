package com.cmos.ha.cmms.diplmt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cmos.ha.cmms.diplmt.config.RootConfig;

/**
 * @author lixinjie
 * @since 2017-12-17
 */
public class DiplmtApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext rootAppContext = new AnnotationConfigApplicationContext(RootConfig.class);
		try {
			synchronized (DiplmtApplication.class) {
				DiplmtApplication.class.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rootAppContext.close();
	}

}
