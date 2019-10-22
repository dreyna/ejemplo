package com.example.demo.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoriaDao;
import com.example.demo.entity.Categoria;
import com.example.demo.service.CategoriaService;
@Service
public class CategoriaServiceImp implements CategoriaService{
	@Autowired
	private CategoriaDao categoriaDao;
	@Override
	public Map<String,Object> lista() {
		// TODO Auto-generated method stub
		return categoriaDao.lista();
	}
	@Override
	public int create(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDao.create(categoria);
	}
	@Override
	public int edit(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDao.edit(categoria);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return categoriaDao.delete(id);
	}
	@Override
	public Map<String,Object> read(int id) {
		// TODO Auto-generated method stub
		return categoriaDao.read(id);
	}

}
