package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< Updated upstream
import com.example.demo.Employee;
=======
import com.example.dto.OrderResponse;
import com.example.model.Customer;
import com.example.model.Product;
>>>>>>> Stashed changes
import com.example.model.UserProfile;
import com.example.repository.CustomerRepository;
import com.example.service.UserProfileService;


@Controller
@Component
public class UserProfileController {


	
	@Autowired
	private UserProfileService userProfileService;
	@RequestMapping("/")    
	public List<UserProfile> getAllStudents()  
	{    
		System.out.println("From getAllUserProfile");
		return userProfileService.getAllUserProfile();    
	}       
	
	
<<<<<<< Updated upstream
	/*
	 * @RequestMapping(value="/add-userProfile", method=RequestMethod.POST) public
	 * ModelAndView addStudent(@RequestBody UserProfile userProfile) {
	 * //// @RequestBody UserProfile userProfile //
	 * System.out.println("addStudent1"); // ModelAndView mv = new ModelAndView();
	 * // System.out.println("addStudent2"); //mv.setViewName("login"); //
	 * System.out.println("addStudent3"); //
	 * userProfileService.addUserProfile(userProfile); //
	 * System.out.println("addStudent4"); // UserProfile userObj = new
	 * UserProfile(); // System.out.println("addStudent5"); //
	 * userObj.setEmail("aay@gmail.com"); // userObj.setId(2); //
	 * userObj.setName("pragya"); // userObj.setPassword("wbidb3idwi"); ////
	 * mv.addObject(""); // return mv;
	 * 
	 * 
	 * // @RequestBody UserProfile userProfile ModelAndView mv = new ModelAndView();
	 * 
	 * mv.setViewName("login"); userProfileService.addUserProfile(userProfile);
	 * mv.addObject("userProfileList",userProfileService.getAllUserProfile());
	 * System.out.println("this worled"); mv.addObject("name","aa");
	 * mv.addObject("password","sd"); mv.addObject("email"); return mv; }
	 */
	
	@RequestMapping(value = "/add-userProfile1", method = RequestMethod.POST)
	 public @ResponseBody List<UserProfile> loadCityByCountry(@RequestBody UserProfile userProfile) {
	  userProfileService.addUserProfile(userProfile);
	  List<UserProfile> users = userProfileService.getAllUserProfile();
	  
	  return users;
	 }
	
	@RequestMapping(value="users")
    @ResponseBody
    public void saveUserList(@RequestBody UserProfile[] UserProfileArray) {
		
	    for (UserProfile user: UserProfileArray) {
	    	System.out.println("List: user name  "+user.getName());
	        
	        
	    }   
    }
=======
	@RequestMapping(value="/add-userProfile", method=RequestMethod.POST)    
	public ModelAndView addStudent(@RequestBody UserProfile userProfile)  
	{   
//		@RequestBody UserProfile userProfile
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome_user");
		userProfileService.addUserProfile(userProfile);
		UserProfile userObj = new UserProfile();
		userObj.setEmail("aay@gmail.com");
		userObj.setId(2);
		userObj.setName("pragya");
		userObj.setPassword("wbidb3idwi");
		return mv;
	}
	@Autowired
	private CustomerRepository customerReposiroty;
	
	@RequestMapping(value = "/getJoin", method = RequestMethod.POST)
	public List<OrderResponse> getJoinQuery(){
		System.out.println("reached here");
		for(Customer x: customerReposiroty.findAll()) {
			System.out.println(x.getName() + " "+ x.getId()+"\n\n\n");
			for(Product y : x.getProducts()) {
				System.out.println(y.getProductName()+" "+ y.getQty());
			}
		}
		
		System.out.println("\n\n\n\n\n\n\n");
		for(Customer z: customerReposiroty.findByFirstName("Aayush")) {
			System.out.println("fivbrnwojcwdcno\n\n\n");
			System.out.println(z.getName());
		}
		return null;
	}
	
	@RequestMapping(value ="/multiJoin",method = RequestMethod.POST)
	void checkJoin() {
		for(Object o : customerReposiroty.findByJoin()) {
			System.out.println(o);
		}
	}
>>>>>>> Stashed changes
}


