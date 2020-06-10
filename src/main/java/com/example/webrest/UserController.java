package com.example.webrest;

import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.ToDoAlerte;
import com.example.domain.User;
import com.example.repository.toDoListRepository;
import com.example.repository.userRepository;
import com.example.services.imp.ToDoAlerteService;
import com.example.services.imp.UserService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService service ;
	@Autowired
	private userRepository userRepo ;
	@Autowired
	private ToDoAlerteService todoService ;


	@PostMapping("/user")
    @CrossOrigin(allowedHeaders = "*")
	public User ajouterUser(@RequestBody User user)
	{
		return service.save(user);
	}
	
	@GetMapping("/user")
	public List<User> findAll(){

		return service.findAll();	
	}
	
	@GetMapping("/login/{username}/{password}")
    @CrossOrigin(allowedHeaders = "*")
	public User login (@PathVariable String username,@PathVariable String password)
	{
	return userRepo.findByUsernameAndPassword(username, password)	;
	}
	
	
	

	@GetMapping("/todoList")
    @CrossOrigin(allowedHeaders = "*")
	public List<ToDoAlerte> findAlltodo(){

		return todoService.findAll();	
	}

	
	   @PutMapping("/todolist/{id}")
	    @CrossOrigin(allowedHeaders = "*")
	    public void updateDatabaseModel(@RequestBody ToDoAlerte databaseModel,@PathVariable int id) throws URISyntaxException, Exception {
	       
		   todoService.update(id, databaseModel);
		   System.out.println("yyyyy"+databaseModel);
	    }
	
	

		@GetMapping("/tolist/{id}")
	    @CrossOrigin(allowedHeaders = "*")
		public List<ToDoAlerte> fi(@PathVariable String id ){

			return todoService.alllist(id);	
		}
	
	
		 @PutMapping("/todo/{id}")
		    @CrossOrigin(allowedHeaders = "*")
		    public void updateData(@RequestBody ToDoAlerte databaseModel,@PathVariable int id) throws URISyntaxException, Exception {
		       
			   todoService.upda(id, databaseModel);
			   System.out.println("yyyyy"+databaseModel);
		    }
		
	
		 
		 

			@GetMapping("/chercher/{id}")
		    @CrossOrigin(allowedHeaders = "*")
			public List<ToDoAlerte> chercher(@PathVariable String id){

				return todoService.chercher(id);	
			}

		 
			@GetMapping("/somme/{id}")
		    @CrossOrigin(allowedHeaders = "*")
			public int somme(@PathVariable String id){

				return todoService.somme(id);	
			}
			
			
			
			@GetMapping("/trouver/{id}")
		    @CrossOrigin(allowedHeaders = "*")
			public List<ToDoAlerte> trouver(@PathVariable String id){

				return todoService.trouver(id);	
			}
			
			
		
			@GetMapping("/search/{test}/{date1}/{date2}")
		    @CrossOrigin(allowedHeaders = "*")
			public List<ToDoAlerte> search(@PathVariable String test,@PathVariable Date date1,@PathVariable Date date2){

				return todoService.search(test, date1, date2);	
			}
			
			
			

			@DeleteMapping("/delete/{id}")
		    @CrossOrigin(allowedHeaders = "*")
			public void delete (@PathVariable int id){

			 todoService.delete(id);	
			}
			
				
			
			
			
}




