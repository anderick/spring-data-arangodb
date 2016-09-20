package org.springframework.data.arangodb.repository.support;

import java.io.Serializable;

import org.springframework.data.repository.core.EntityInformation;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

public class ArangoDbRepositoryFactory extends RepositoryFactorySupport {

	@Override
	public <T, ID extends Serializable> EntityInformation<T, ID> getEntityInformation(Class<T> domainClass) {
		return new ArangoDbEntityInformation(domainClass);
	}

	@Override
	protected Object getTargetRepository(RepositoryInformation information) {
		return getTargetRepositoryViaReflection(information, information.getDomainType());
	}

	@Override
	protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
		return SimpleArangoDbRepository.class;
	}

}
