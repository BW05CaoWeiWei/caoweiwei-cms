package com.caoweiwei.service;

import java.util.List;

import com.caoweiwei.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
