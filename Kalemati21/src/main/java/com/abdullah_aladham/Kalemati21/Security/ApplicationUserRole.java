package com.abdullah_aladham.Kalemati21.Security;

import java.util.Set;

import com.google.common.collect.Sets;
import com.abdullah_aladham.Kalemati21.Security.ApplicationUserPermission.*;
public enum ApplicationUserRole {
	CUSTOMER(Sets.newHashSet()),
	ADMIN(Sets.newHashSet(ApplicationUserPermission.REMOVE_CUSTOMER,
			ApplicationUserPermission.SHOW_CUSTOMER,
			ApplicationUserPermission.ADD_CUSTOMER,
			ApplicationUserPermission.EDIT_CUSTOMER,
			ApplicationUserPermission.ADD_CHILD,
			ApplicationUserPermission.SHOW_CHILD,
			ApplicationUserPermission.DELETE_CHILD,
			ApplicationUserPermission.ADD_CARD,
			ApplicationUserPermission.SHOW_CARD,
			ApplicationUserPermission.EDIT_CARD,
			ApplicationUserPermission.DELETE_CARD));
	//CHILD();
	
private final Set<ApplicationUserPermission>permissions;

ApplicationUserRole(Set<ApplicationUserPermission>permissions){
	this.permissions=permissions;
}
public Set<ApplicationUserPermission> getPermissions(){
	return permissions;
}
}
