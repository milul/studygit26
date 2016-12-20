package com.yc.fav.mapper;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.yc.fav.entity.Favorite;

public interface FavoriteMapper {
	@Transactional
	int insertFav(Favorite fav);

	List<Favorite> selectFavbyTName(Favorite fav);

}
