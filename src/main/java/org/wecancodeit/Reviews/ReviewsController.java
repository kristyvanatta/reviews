package org.wecancodeit.Reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ReviewsController {
	
	@Resource
	ReviewsRepository reviewsRepo;
	
	@RequestMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviews", reviewsRepo.findAll());
		return "reviews";
	}
	
	@RequestMapping("/review")
	public String findOneReview(@RequestParam(value="id") Long id, Model model) {
		model.addAttribute("reviews", reviewsRepo.findOne(id));
		return "review";
	}
	
	

	
}
