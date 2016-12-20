package com.yc.fav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yc.fav.entity.Tag;
import com.yc.fav.mapper.TagMapper;
import com.yc.fav.service.TagService;
/*都是用来指定bean
@Component  普通bean
@Repository 数据访问层bean
@Controller 控制分发层bean
@Service	业务处理层bean
*/
@Service("tagService") //业务处理
public class TagServiceImpl implements TagService{
	@Autowired
	private TagMapper tagMapper;
	@Override
	public List<Tag> findAllTags() {
		return tagMapper.selectAllTags();
	}

}
