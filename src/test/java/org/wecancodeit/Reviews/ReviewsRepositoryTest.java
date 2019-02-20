package org.wecancodeit.Reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

public class ReviewsRepositoryTest {
	
	ReviewsRepository underTest;
	
	private long firstReviewId = 1L;
	private Review firstReview = new Review(firstReviewId,"review name", "review description","image");
	
	private long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "review name", "review description", "image");
	
	@Test
	public void shouldFindAReview() {
		underTest = new ReviewsRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}
	
	@Test
	public void shouldFindASecondReview() {
		underTest = new ReviewsRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewsRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}

}
