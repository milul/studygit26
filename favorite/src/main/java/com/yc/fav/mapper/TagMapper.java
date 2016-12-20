package com.yc.fav.mapper;

import java.util.List;

import com.yc.fav.entity.Tag;

public interface TagMapper {

	List<Tag> selectAllTags();

	int insertTag(Tag t);

}
