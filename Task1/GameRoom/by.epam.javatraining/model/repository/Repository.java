package model.repository;

import java.util.List;

import exception.DaoException;
import model.entity.Toy;

public interface Repository<T> {
	
	void add(T obj) throws DaoException;

	void remove(T obj) throws DaoException;

	void addAll(List<Toy> toys);
	
	List<T> getAll();
}
