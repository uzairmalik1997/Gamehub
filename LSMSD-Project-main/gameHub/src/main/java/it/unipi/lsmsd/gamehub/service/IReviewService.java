package it.unipi.lsmsd.gamehub.service;

import it.unipi.lsmsd.gamehub.DTO.*;
import it.unipi.lsmsd.gamehub.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface IReviewService {
    public List<Review> retrieveReviewByTitle(ReviewDTO reviewDTO);

    //public List<ReviewDTOAggregation> retrieveAggregateReviewsByTitleAndSortByLike();
    public List<ReviewDTOAggregation> retrieveAggregateFirstAndLastUserLike();
    public List<ReviewDTOAggregation2> findAggregation3();

    public List<Review> retrieveByTitleOrderByLikeCountDesc(ReviewDTO reviewDTO,int limit);

    public Review createReview(ReviewDTO review);
    public ResponseEntity<String> deleteReview(String id);






}
