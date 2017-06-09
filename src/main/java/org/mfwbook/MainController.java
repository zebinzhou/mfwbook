package org.mfwbook;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	@Autowired
	private PersonRepository personRepository;
	
//	@RequestMapping("/save")
//	public Person save(String name, String address, Integer age) {
//	    Person p = personRepository.save(new Person(null, name, age, address));
//	    return p;
//	}
//	
//	@RequestMapping("/q1")
//	public List<Person> q1(String address) {
//	    List<Person> people = personRepository.findByAddress(address);
//	    return people;
//	}
//	
	@RequestMapping("/q2")
	public @ResponseBody Person q2(String name, String address) {
	//public @ResponseBody Person q2() {
//	    String name="王云飞";
//	    String address="合肥";
	    Person p = personRepository.findByNameAndAddress(name, address);
	    return p;
	}
	
	
//	
//	@RequestMapping("/q3")
//	public Person q3(String name, String address) {
//	    Person p = personRepository.withNameAndAddressQuery(name, address);
//	    return p;
//	}
//	
//	@RequestMapping("/q4")
//	public Person q4(String name, String address) {
//	    Person p = personRepository.withNameAndAddressNamedQuery(name, address);
//	    return p;
//	}
//	
//	@RequestMapping("/sort")
//	public List<Person> sort() {
//	    List<Person> people = personRepository.findAll(new Sort(Direction.ASC, "age"));
//	    return people;
//	}
//	
//	@RequestMapping("/page")
//	public Page<Person> page() {
//	    Page<Person> pagePeople = personRepository.findAll(new PageRequest(1, 2));
//	    return pagePeople;
//	}

	 @RequestMapping("/")
	    public String person(Model model) {
//	        Person p = q3();
//	        List<User> list = new ArrayList<>();
//	        list.add(user);
//	        model.addAllAttributes(list);
//	        Person p = new Person();
//	        model.addAttribute(p);
	        return "person";
	    }
}
