package com.caoweiwei.service;

import java.util.List;

import com.caoweiwei.entity.Article4Vote;
import com.caoweiwei.entity.VoteStatic;

/**
 * 
 * @author 曹伟伟
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}
