package com.minatogithuborganization.appenginecicdtest.deploy.controller;


import com.minatogithuborganization.appenginecicdtest.deploy.service.DeploymentService;
import com.minatogithuborganization.appenginecicdtest.base.deploy.controller.DeploymentBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping(path = "/rest/deploy/", produces = "application/json")
public class DeploymentController extends DeploymentBaseController<DeploymentService> {

	public DeploymentController(DeploymentService deploymentService) {
		super(deploymentService);
	}
	
}
