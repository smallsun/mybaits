<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >

<mapper namespace="${packageName}.dao.${table.dataObjectName}">
	<!--
		描述：
		责任人：
	-->
	<resultMap id="BaseResultMap" type="${table.dataObjectName}DO">
		<#list table.allColumnList as clu>
			<result column="${clu.columnName}" property="${clu.humpColumnName}" jdbcType="${clu.columnJdbcTypeName}" />
		</#list>
	</resultMap>
	
	<select id="select${table.dataObjectName}ByID" parameterType="${table.dataObjectName}DO" resultMap="BaseResultMap">
		select 
			<#list table.allColumnList as clu>
			 ${clu.columnName}<#if clu_index+1 &lt; table.allColumnList?size>,</#if>
			</#list>
		from ${table.tableName}
		where id = ${sharp}{id}
		limit 0,1
	</select>
	
	<!--
		描述：
		责任人：
	-->
	<select id="select${table.dataObjectName}ForPageList" parameterType="${table.dataObjectName}DO" resultMap="BaseResultMap">
		select 
			<#list table.allColumnList as clu>
			 ${clu.columnName}<#if clu_index+1 &lt; table.allColumnList?size>,</#if>
			</#list>
		from ${table.tableName}
		<where>
			<#list table.allColumnList as clu>
				<if test="${clu.humpColumnName} != null and ${clu.humpColumnName} != ''" >
					and ${clu.columnName} = ${sharp}{${clu.humpColumnName}}
				</if>
			</#list>
		</where>
		limit ${sharp}{startRow},${sharp}{perPageSize}
	</select>
	
	<!--
		描述：
		责任人：
	-->
	<select id="count${table.dataObjectName}ForPageList" parameterType="${table.dataObjectName}DO" resultMap="BaseResultMap">
		select count(1)
		from ${table.tableName}
		<where>
			<#list table.allColumnList as clu>
				<if test="${clu.humpColumnName} != null and ${clu.humpColumnName} != ''" >
					and ${clu.humpColumnName} = ${sharp}{${clu.humpColumnName}}
				</if>
			</#list>
		</where>
	</select>
	
	<!--
		描述：
		责任人：
	-->
	<select id="select${table.dataObjectName}ForList" parameterType="${table.dataObjectName}DO" resultMap="BaseResultMap">
		select 
			<#list table.allColumnList as clu>
			 ${clu.columnName}<#if clu_index+1 &lt; table.allColumnList?size>,</#if>
			</#list>
		from ${table.tableName}
		<where>
			<#list table.allColumnList as clu>
				<if test="${clu.humpColumnName} != null and ${clu.humpColumnName} != ''" >
					and ${clu.columnName} = ${sharp}{${clu.humpColumnName}}
				</if>
			</#list>
		</where>
	</select>
	
	<!--
		描述：
		责任人：
	-->
	<update id="delete${table.dataObjectName}" parameterType="${table.dataObjectName}DO">
		delete from ${table.tableName}
		where id = ${sharp}{id}
	</update>
	
	<!--
		描述：
		责任人：
	-->
	<update id="update${table.dataObjectName}" parameterType="${table.dataObjectName}DO">
		update ${table.tableName}
		<set>
			<#list table.allColumnList as clu>
			<if test="${clu.humpColumnName} != null and ${clu.humpColumnName} != ''" >
				${clu.columnName} = ${sharp}{${clu.humpColumnName}},
			</if>
			</#list>
		</set>
		where id = ${sharp}{id}
	</update>
	
	<!--
		描述：
		责任人：
	-->
	<insert id="insert${table.dataObjectName}" parameterType="${table.dataObjectName}DO">
		insert into ${table.tableName} (
		<#list table.allColumnList as clu> ${clu.columnName}<#if clu_index+1 &lt; table.allColumnList?size>,</#if> </#list>)
		values
		(<#list table.allColumnList as clu> ${sharp}{${clu.humpColumnName}}<#if clu_index+1 &lt; table.allColumnList?size>,</#if> </#list>)
		
		<selectKey  order="AFTER" keyProperty="id" resultType="Integer">
			select last_insert_id() 
		</selectKey> 
	</insert>
</mapper>