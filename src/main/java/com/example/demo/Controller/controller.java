package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.model;
import com.example.demo.Service.service;





@CrossOrigin
@RestController
public class controller {
	

		@Autowired
		service s;

		@GetMapping("/get")
		public List<model> showDetails() {
			return s.getDetails();

		}
//		@DeleteMapping("/delete/{phone_number}")
//		public long
//		deleteInfo(@PathVariable("phone_number")long phone_number) {
//			s.deleteDetails(phone_number);
//			return "Deleted details";
//		}
      
		@PostMapping("/post")
		public String addDetails(@RequestBody model m) {
			s.add(m);
			return "Added product ";
		}
       @PutMapping("/updateDetails")
       public model updateInfo(@RequestBody model gh) {
    	   return s.updateDetails(gh);
       }
       
		//sorting
		@GetMapping("/product/{field}")
		public List<model> getWithSort(@PathVariable String field) {
			return s.getSorted(field);
		}

		// pagination
		@GetMapping("/product/{offset}/{pageSize}")
		public List<model> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			return s.getWithPagination(offset, pageSize);
		}
}
