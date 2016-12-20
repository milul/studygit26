package com.yc.fav.service;

import java.util.List;

import com.yc.fav.entity.Favorite;

public interface FavoriteService {

	boolean addFav(Favorite fav);

	List<Favorite> listFavs(Favorite fav);

}
