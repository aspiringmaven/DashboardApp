package me.sumitkawatra.dashboard.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SpringBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SpringBeanPostProcessor > postProcessAfterInitialization ### "+beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SpringBeanPostProcessor > postProcessBeforeInitialization ### "+beanName);
		return bean;
	}

}
