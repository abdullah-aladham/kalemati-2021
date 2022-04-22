package com.abdullah_aladham.Kalemati21.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.abdullah_aladham.Kalemati21.Model.Child;
import com.abdullah_aladham.Kalemati21.Model.Requests;
//import com.abdullah_aladham.Kalemati21.Repo.ChildRepo;
import com.abdullah_aladham.Kalemati21.Repo.RequestRepo;

@Service
public class RequestService {

	private final RequestRepo reqRepo;
@Autowired
	public RequestService(RequestRepo reqRepo) {
		this.reqRepo = reqRepo;
	}
public Requests addRequest(Requests req) {
	req.setRequestCode(UUID.randomUUID().toString());
	return reqRepo.save(req);
	}

public List<Requests> findallRequests(){
	return reqRepo.findAll();
}


	
}
