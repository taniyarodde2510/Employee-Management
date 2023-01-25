package com.taniya.EmployeeManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository erop;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	
	@RequestMapping("/login")
	public ModelAndView login(int empid, String empname)
	{
		ModelAndView mv= new ModelAndView();
		erop.findById(empid);
		if(empname.equals("admin"))
		{
			List<Employee> lst = erop.findAll();
			mv.addObject("lst",lst);
			mv.setViewName("Adminpage");
		}
		else
		{
			mv.setViewName("Customer");
		}
		
		
		
		
		return mv;
	}
	
		
	
	@RequestMapping("/add")
	public String add()
	{
		return "Add";
	}
	
	@RequestMapping("/added")
	public String added(Employee obj)
	{
		erop.save(obj);
		return "Added";
	}
	
	
	@RequestMapping("/delete")
	public String delete() 
	{
		return "Delete";
	}
	
	@RequestMapping("/dele")
	public ModelAndView deleteresult(int empid)
	{
		ModelAndView mv= new ModelAndView();
		erop.deleteById(empid);
		mv.setViewName("Deleted");
		
		return mv;
		
	}
	
	
	@RequestMapping("/update")
	public String update()
	{
		
		return "Update";
		
	}
	
	
	@RequestMapping("/updaterecord")
	public String update(Employee employee)
	{
		Optional<Employee> opt= erop.findById(employee.getEmpid());
		Employee obj = opt.get();
		obj.setEmpid(employee.getEmpid());
		obj.setEmpname(employee.getEmpname());
		obj.setMobile(employee.getMobile());
		obj.setEmail(employee.getEmail());
		obj.setEmpacc(employee.getEmpacc());
		obj.setBalance(employee.getBalance());
		erop.save(obj);
		
		return "Recordupdated";
		
	}
	
	

}
