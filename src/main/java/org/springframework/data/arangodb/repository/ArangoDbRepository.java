package org.springframework.data.arangodb.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface ArangoDbRepository<T, S extends Serializable> 
		extends PagingAndSortingRepository<T, S> {

}
