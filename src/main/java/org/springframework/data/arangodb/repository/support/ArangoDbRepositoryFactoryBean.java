package org.springframework.data.arangodb.repository.support;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.data.repository.core.support.TransactionalRepositoryFactoryBeanSupport;

public class ArangoDbRepositoryFactoryBean<T extends Repository<S, Long>, S>
		extends TransactionalRepositoryFactoryBeanSupport<T, S, Long> {

	@Override
	protected RepositoryFactorySupport doCreateRepositoryFactory() {
		return new ArangoDbRepositoryFactory();
	}

}
