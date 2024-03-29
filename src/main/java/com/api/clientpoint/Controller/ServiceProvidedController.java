package com.api.clientpoint.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.clientpoint.Model.ServiceProvided;
import com.api.clientpoint.Service.ServiceProvidedService;

@RestController
@RequestMapping("/api/servicesProvided")
public class ServiceProvidedController {

	@Autowired
	ServiceProvidedService serviceProvidedService;

	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public List<ServiceProvided> findAllServicesProvided() {
		return serviceProvidedService.findAll();
	}

	@GetMapping("{id}")
	public ServiceProvided findByIdServiceProvided(@PathVariable Integer id) {
		return serviceProvidedService.findById(id);
	}

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public ServiceProvided createServiceProvided(@Valid @RequestBody ServiceProvided serviceProvided) {
		return serviceProvidedService.createServiceProvided(serviceProvided);
	}

	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public ServiceProvided updateServiceProvided(@Valid @PathVariable Integer id,
			@RequestBody ServiceProvided serviceProvided) {
		return serviceProvidedService.updateServiceProvided(id, serviceProvided);
	}

	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteserviceProvided(ServiceProvided serviceProvided) {
		serviceProvidedService.deleteServiceProvided(serviceProvided);
	}
}
