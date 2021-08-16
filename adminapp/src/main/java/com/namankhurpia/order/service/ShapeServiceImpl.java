package com.namankhurpia.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.order.DAO.ShapeDAO;
import com.namankhurpia.order.model.ListofShapes;


@Service
public class ShapeServiceImpl implements ShapeService {

	@Autowired
	private ShapeDAO shapeDao;
	
	@Transactional
	@Override
	public ListofShapes get(int phoneno) {
		return (ListofShapes) shapeDao.get(phoneno);
	}


	@Transactional
	@Override
	public List<ListofShapes> getAll() {
		return shapeDao.getAll();
	}

	@Transactional
	@Override
	public List<ListofShapes> save(List<ListofShapes> shapes) {
		for(int i=0;i<shapes.size();i++)
		{
			shapeDao.save(shapes);
		}
		return shapes;
	}

}
