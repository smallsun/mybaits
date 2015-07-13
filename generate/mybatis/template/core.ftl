<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:tx="http://www.springframework.org/schema/tx" xmlns:aop="http://www.springframework.org/schema/aop"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
				http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-2.5.xsd
				http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-2.5.xsd
				http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-2.5.xsd"
	default-autowire="byName">

	<#list tablelist as clu>
	<!-- 配置信息业务 -->
	<bean id="${clu.tableConfiguration.tableName}Service" parent="transactionProxy">
		<property name="target">
			<bean class="${packageName}.core.service.${clu.tableConfiguration.tableName}.${clu.tableConfiguration.domainObjectName}ServiceImpl" />
		</property>
	</bean>
	</#list>
	
	
</beans>