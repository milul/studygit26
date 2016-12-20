package com.yc.fav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.fav.entity.Favorite;
import com.yc.fav.entity.Tag;
import com.yc.fav.mapper.FavoriteMapper;
import com.yc.fav.mapper.TagMapper;
import com.yc.fav.service.FavoriteService;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService{

	@Autowired
	private FavoriteMapper favoriteMapper;
	@Autowired
	private TagMapper tagMapper;
	@Override
	@Transactional
	public boolean addFav(Favorite fav) {
		boolean result=true;
		result &= favoriteMapper.insertFav(fav)>0;
		if (fav.getFtags()!=null&&fav.getFtags().trim().intern()!="") {
			String[] tags = fav.getFtags().split(",");
			for (String tag : tags) {
				Tag t = new Tag();
				t.setTname(tag.trim());
				result &= tagMapper.insertTag(t) > 0;
			}
		}
		//模拟事务操作：1.根据result判断是否成功
		return result;
	}
	@Override
	public List<Favorite> listFavs(Favorite fav) {
		return favoriteMapper.selectFavbyTName(fav);
	}

}
