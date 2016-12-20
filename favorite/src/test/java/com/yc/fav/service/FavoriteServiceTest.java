package com.yc.fav.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.fav.entity.Favorite;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class FavoriteServiceTest {
	@Autowired
	private FavoriteService fs;
	@Test
	public void testListFavs() {
		Favorite fav=new Favorite();
		fav.setFtags("java");
		List<Favorite> favs=fs.listFavs(fav);
		System.out.println(favs);
		assertNotNull(favs);
	}

}
