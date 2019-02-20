package org.wecancodeit.Reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewsRepository {
	
	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewsRepository() {
		Review movie = new Review(1L, "Movie", "Movie Description", "movie.jpg");
		Review travel = new Review(2L, "Travel", "Travel Description", "travel.jpg");
		Review food = new Review(3L, "Food", "Food Description", "food.jpg");
		
		reviewList.put(movie.getId(), movie);
		reviewList.put(travel.getId(), travel);
		reviewList.put(food.getId(), food);
	}
	
	//testing constructor
	public ReviewsRepository(Review...reviews) {
		for(Review review: reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
