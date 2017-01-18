package org.openforis.users.manager;

import org.openforis.users.dao.GroupDao;
import org.openforis.users.model.Group;

/**
 * 
 * @author S. Ricci
 *
 */
public class GroupManager extends AbstractManager<Group, GroupDao> {

	public GroupManager(GroupDao dao) {
		super(dao);
	}

}