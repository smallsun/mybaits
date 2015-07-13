package ${packageName}.dataobject;

import java.io.Serializable;

import com.paperclips.rest.common.base.AbstractDO;

/**
 * @author auto
 * @version 
 * @description 
 * @copyright  
 */
public class ${table.dataObjectName}DO  extends AbstractDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	<#list table.dataObjectColumnList as clu>
	private ${clu.columnDataType} ${clu.humpColumnName};
	</#list>

	<#list table.dataObjectColumnList as clu>

	public ${clu.columnDataType} get${clu.humpColumnCName}() {
		return ${clu.humpColumnName};
	}

	public void set${clu.humpColumnCName}(${clu.columnDataType} ${clu.humpColumnName}) {
		this.${clu.humpColumnName} = ${clu.humpColumnName};
	}
	</#list>
	

}
