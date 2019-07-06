package com.example.demo.plan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlanController {
	@Autowired
	PlanRepository planRepository;
	
	@GetMapping("/plan")
	public String plan() {
		return "plan/plan";
	}
	
	@GetMapping("/writeplan")
	public String writePlan(Model model) {
		List<Plan> list = planRepository.findAll();
		for (Plan plan : list) {
			System.out.println(plan);
		}
		model.addAttribute("list", list);
		return "plan/writePlan";
	}
	
	@PostMapping("/writeplan")
	public String writePlanPost(Plan plan) {
//		System.out.println(plan);
		plan.setIsCompleted(false);
		planRepository.save(plan);
		return "redirect:/writeplan";
	}
	
	@GetMapping("/updateCompleted")
	public String updateCompleted(@RequestParam Plan[] check) throws Exception {
		System.out.println("=============================================");
		for (Plan plan : check) {
			System.out.println(plan.toString());
		}
		System.out.println("=============================================");
		/*
		 * String[] arr = request.getParameterValues("check"); for (int i = 0; i <
		 * arr.length; i++) { Integer n = Integer.parseInt(arr[i]); Plan temp2 =
		 * planRepository.getOne(n); temp2.setIsCompleted(true);
		 * planRepository.save(temp2); }
		 */
//		System.out.println(Arrays.toString(arr));
		return "redirect:/writeplan";
	}
}
