package com.desksoft.oceanus.user.core.dao.userTemplate;

import com.desksoft.common.base.AbstractDAO;
import com.desksoft.oceanus.template.dataobject.UserTemplateDO;

/**
 * @author �Զ����
 * @version 
 * @description 
 * @copyright ���ݵϿ���� ��������Ȩ��
 */
public class UserTemplateDAOImpl extends AbstractDAO implements UserTemplateDAO {
	
	@Override
	public UserTemplateDO selectUserTemplate(UserTemplateDO query) {
		return (UserTemplateDO) this.queryForObject("selectUserTemplate", query);
	}
	
}
