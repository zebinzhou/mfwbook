package org.mfwbook.n;

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
public class NMainController {
	@Autowired
	private NPersonRepository nPersonRepository;
	
//	@RequestMapping("/save")
//	public NPerson save(String name, String address, Integer age) {
//	    NPerson p = nPersonRepository.save(new NPerson(null, name, age, address));
//	    return p;
//	}
//	
//	@RequestMapping("/q1")
//	public List<NPerson> q1(String address) {
//	    List<NPerson> people = nPersonRepository.findByAddress(address);
//	    return people;
//	}
//	
	@RequestMapping("/nq2")
	public @ResponseBody NPerson q2(String name, String address) {
	//public @ResponseBody NPerson q2() {
//	    String name="王云飞";
//	    String address="合肥";
	    NPerson p = nPersonRepository.findByNameAndAddress(name, address);
	    return p;
	}
	
	@RequestMapping("/ns")
	public @ResponseBody List<NBook> searchBook(String className) {
        return NSearchFactory.create(className).search();
	}
//	
//	@RequestMapping("/q3")
//	public NPerson q3(String name, String address) {
//	    NPerson p = nPersonRepository.withNameAndAddressQuery(name, address);
//	    return p;
//	}
//	
//	@RequestMapping("/q4")
//	public NPerson q4(String name, String address) {
//	    NPerson p = nPersonRepository.withNameAndAddressNamedQuery(name, address);
//	    return p;
//	}
//	
//	@RequestMapping("/sort")
//	public List<NPerson> sort() {
//	    List<NPerson> people = nPersonRepository.findAll(new Sort(Direction.ASC, "age"));
//	    return people;
//	}
//	
//	@RequestMapping("/page")
//	public Page<NPerson> page() {
//	    Page<NPerson> pagePeople = nPersonRepository.findAll(new PageRequest(1, 2));
//	    return pagePeople;
//	}

	 @RequestMapping("/nperson")
	    public String person(Model model) {
//	        NPerson p = q3();
//	        List<NUser> list = new ArrayList<>();
//	        list.add(user);
//	        model.addAllAttributes(list);
//	        NPerson p = new NPerson();
//	        model.addAttribute(p);
	        return "nperson";
	    }
}
