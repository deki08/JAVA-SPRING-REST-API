package com.library.management.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.admin.model.Lb_Admin_adminsModel;
import com.library.management.admin.model.MemberModel;
import com.library.management.admin.response.Lb_Admin_Response;
import com.library.management.admin.response.Lb_Member_Response;
import com.library.management.admin.service.Lb_Admin_Sevice;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class Lb_Admin_Controller {

	@Autowired
	private Lb_Admin_Sevice lbadminservice;

//	Lb_Member_Response

	@GetMapping("/test")
	public String test() {
		return "welcome";
	}

	@GetMapping("/admins")
	public ResponseEntity<Lb_Admin_Response> getAdmin() {
		Lb_Admin_Response response = new Lb_Admin_Response();
		response = lbadminservice.GetAdminList();

		return new ResponseEntity<Lb_Admin_Response>(response, HttpStatus.OK);
	}

	@GetMapping("/admins/{id}")
	public ResponseEntity<Lb_Admin_adminsModel> getById(@PathVariable("id") String id) {
		Lb_Admin_adminsModel response = new Lb_Admin_adminsModel();
		response = lbadminservice.getByID(id);
		return new ResponseEntity<Lb_Admin_adminsModel>(response, HttpStatus.OK);
	}

	@GetMapping("/members")
	public ResponseEntity<Lb_Member_Response> Test3() {
		Lb_Member_Response response = new Lb_Member_Response();
		response = lbadminservice.GetAll();
		return new ResponseEntity<Lb_Member_Response>(response, HttpStatus.OK);
	}

	

	@PostMapping("/members")
	public ResponseEntity AddMember(@RequestBody MemberModel Bmodel) {
		Boolean response = lbadminservice.AddMember(Bmodel);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failed", HttpStatus.OK);
		}
	}

	@DeleteMapping("/members/{id}")
	public ResponseEntity DeleteBook(@PathVariable(name = "id") String id) {
		Boolean response = lbadminservice.DeleteById(id);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failed", HttpStatus.OK);
		}
	}

	@PutMapping("/members/{id}")
	public ResponseEntity updateMember(@PathVariable(name = "id") String id, @RequestBody MemberModel Bmodel) {
		Boolean response = lbadminservice.UpdateMember(id, Bmodel);
		if (response) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failed", HttpStatus.OK);
		}
	}
	@GetMapping("/members/{id}")
	public ResponseEntity<MemberModel> GetMemberByID(@PathVariable("id") String id) {
		MemberModel response = new MemberModel();
		response = lbadminservice.GetMemberByID(id);
		return new ResponseEntity<MemberModel>(response, HttpStatus.OK);
	}
	@GetMapping("/members#")
	public ResponseEntity<Lb_Member_Response> GETuserByStatus(@RequestParam("ustatus") String ustatus) {
		Lb_Member_Response response = new Lb_Member_Response();
		response = lbadminservice.GetBYStatus(ustatus);
		return new ResponseEntity<Lb_Member_Response>(response, HttpStatus.OK);
	}
	@GetMapping("/members@")
	public ResponseEntity<Lb_Member_Response> GETuserByRecStatus(@RequestParam("urecstatus") String urecstatus) {
		Lb_Member_Response response = new Lb_Member_Response();
		response = lbadminservice.GetBYRecStatus(urecstatus);
		return new ResponseEntity<Lb_Member_Response>(response, HttpStatus.OK);
	}
	

}
