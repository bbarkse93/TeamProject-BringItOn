package com.example.teamprojectbringiton.review;

import com.example.teamprojectbringiton.review.reqDTO.SpaceReviewDto;
import com.example.teamprojectbringiton.space.dto.reqDTO.SpaceRatingReviewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Transactional
    public void reviewSave(SpaceReviewDto dto) {
        Review review = Review.builder()
                .rating(dto.getRating())
                .comment(dto.getComment())
                .spaceId(dto.getSpaceId())
                .userId(1)
                .build();
        System.out.println("insert해따요");
        reviewRepository.insert(review);

    }
}
