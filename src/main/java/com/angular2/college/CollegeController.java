package com.angular2.college;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/college")
public class CollegeController {
  @Autowired
  private CollegeRepository repo;
  
  @RequestMapping(method = RequestMethod.GET)
  public List<College> findItems() {
    return repo.findAll();
  }
  
  @RequestMapping(value = "/{id}",method = RequestMethod.GET)
  public College findone(@PathVariable Integer id) {
    return  repo.findOne(id);
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public College addItem(@RequestBody College clg) {
	 clg.setId(null);
    return repo.saveAndFlush(clg);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public College updateemployee(@RequestBody College updatestudent, @PathVariable Integer id) {
   updatestudent.setId(id);
    return repo.saveAndFlush(updatestudent);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteItem(@PathVariable Integer id) {
    repo.delete(id);
  }
}