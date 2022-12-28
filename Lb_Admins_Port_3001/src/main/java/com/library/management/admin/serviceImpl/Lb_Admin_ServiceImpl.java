package com.library.management.admin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.management.admin.model.Lb_Admin_adminsModel;
import com.library.management.admin.model.MemberModel;
import com.library.management.admin.response.Lb_Admin_Response;
import com.library.management.admin.response.Lb_Member_Response;
import com.library.management.admin.respos.Lb_Admin_adminsRepos;
import com.library.management.admin.respos.Lb_MemberRepos;
import com.library.management.admin.service.Lb_Admin_Sevice;

@Service
@Transactional
public class Lb_Admin_ServiceImpl implements Lb_Admin_Sevice {

	@Autowired
	private Lb_Admin_adminsRepos adminRepo;
	@Autowired
	private Lb_MemberRepos memberRepo;
	@Override
	public Lb_Admin_Response GetAdminList() {
		// TODO Auto-generated method stub
		Lb_Admin_Response response = new Lb_Admin_Response();
		List<Lb_Admin_adminsModel> list = adminRepo.findAll();

		response.setAdmins(list);
		return response;
	}

	@Override
	public Lb_Admin_adminsModel getByID(String id) {
		// TODO Auto-generated method stub
		return adminRepo.findById(Integer.valueOf(id)).get();
	}

	@Override
	public Lb_Member_Response GetAll() {
		Lb_Member_Response response = new Lb_Member_Response();
		List<MemberModel> data = memberRepo.findAll();
		response.setMembers(data);
		return response;
	}

	@Override
	public Boolean AddMember(MemberModel bmodel) {
		Boolean response = false;
		try {
			memberRepo.save(bmodel);
			response = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}

	@Override
	public Boolean DeleteById(String id) {
		Boolean response = false;
		try {
			MemberModel BModel = memberRepo.findById(Integer.valueOf(id)).get();
			if (BModel != null) {
				memberRepo.deleteById(Integer.valueOf(id));
				response = true;
			}
		} catch (Exception e) {
			System.out.println("No Data Found On this Id ");
		}
		return response;
	}

	@Override
	public Boolean UpdateMember(String id, MemberModel bmodel) {
		Boolean response = false;
		try {
			MemberModel BModel = memberRepo.findById(Integer.valueOf(id)).get();
			if (BModel != null) {
				memberRepo.save(bmodel);
				response = true;
			}
		} catch (Exception e) {
			System.out.println("Invalid Id");
		}
		return response;
	}

	@Override
	public MemberModel GetMemberByID(String id) {
		// TODO Auto-generated method stub
		return memberRepo.findById(Integer.valueOf(id)).get();
	}

	@Override
	public Lb_Member_Response GetBYStatus(String ustatus) {
		Lb_Member_Response response = new Lb_Member_Response();
		List<MemberModel> list = memberRepo.findByUstatus(Integer.valueOf(ustatus));

		response.setMembers(list);
		return response;
	}

	@Override
	public Lb_Member_Response GetBYRecStatus(String Urecstatus) {
		Lb_Member_Response response = new Lb_Member_Response();
		List<MemberModel> list = memberRepo.findByUrecstatus(Integer.valueOf(Urecstatus));

		response.setMembers(list);
		return response;
	}

}
