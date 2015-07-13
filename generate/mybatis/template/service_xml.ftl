<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:tx="http://www.springframework.org/schema/tx" xmlns:aop="http://www.springframework.org/schema/aop"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
				http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-2.5.xsd
				http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-2.5.xsd
				http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-2.5.xsd"
	default-autowire="byName">


	<!--服务调用者定义 -->
	
	<#list tablelist as clu>
	<!-- 提示信息服务接口 -->
	<bean id="${clu.tableConfiguration.tableName}Service" factory-bean="remoteFactory" factory-method="getAccessor">
		<property name="serviceUrl" value="${address}/${clu.tableConfiguration.tableName}Service"></property>
		<property name="serviceInterface" value="${packageName}.service.${clu.tableConfiguration.tableName}.${clu.tableConfiguration.domainObjectName}Service"></property>
	</bean>
	
	</#list>
	
	
</beans>