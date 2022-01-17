package com.chitta;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@PostMapping("/information")
	public Person savePerson(@RequestBody Person person) {
		
		return  PersonService.savePerson(person);
	}
	
	/*
	 * @GetMapping("/{id}") public Person getPersonInfo(@PathVariable int id) {
	 * return PersonService.getPerson(id); }
	 */

}
