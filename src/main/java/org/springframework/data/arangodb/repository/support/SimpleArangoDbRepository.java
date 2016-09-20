package org.springframework.data.arangodb.repository.support;

import java.io.Serializable;

import org.springframework.data.arangodb.repository.ArangoDbRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleArangoDbRepository<T, S extends Serializable> implements ArangoDbRepository<T, S> {

	public SimpleArangoDbRepository() {
	}
	
	@Override
	public Iterable<T> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(S arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends T> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(S arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<T> findAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findOne(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends T> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends T> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
