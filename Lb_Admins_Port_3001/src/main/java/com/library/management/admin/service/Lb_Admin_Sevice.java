package com.library.management.admin.service;

import com.library.management.admin.model.Lb_Admin_adminsModel;
import com.library.management.admin.model.MemberModel;
import com.library.management.admin.response.Lb_Admin_Response;
import com.library.management.admin.response.Lb_Member_Response;

public interface Lb_Admin_Sevice {

	Lb_Admin_Response GetAdminList();

	Lb_Admin_adminsModel getByID(String id);

	Lb_Member_Response GetAll();

	Boolean AddMember(MemberModel bmodel);

	Boolean DeleteById(String id);

	Boolean UpdateMember(String id, MemberModel bmodel);

	MemberModel GetMemberByID(String id);

	Lb_Member_Response GetBYStatus(String ustatus);

	Lb_Member_Response GetBYRecStatus(String urecstatus);

}
