package com.library.management.admin.response;

import java.util.List;

import com.library.management.admin.model.MemberModel;

public class Lb_Member_Response {
	
	private List<MemberModel> members;

	public List<MemberModel> getMembers() {
		return members;
	}

	public void setMembers(List<MemberModel> members) {
		this.members = members;
	}
	

}
