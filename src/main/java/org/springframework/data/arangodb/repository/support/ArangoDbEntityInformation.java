package org.springframework.data.arangodb.repository.support;

import org.springframework.data.repository.core.support.AbstractEntityInformation;

public class ArangoDbEntityInformation<T> extends AbstractEntityInformation<T, Long> {

	public ArangoDbEntityInformation(Class<T> domainClass) {
		super(domainClass);
	}

	@Override
	public Long getId(Object entity) {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	@Override
	public Class<Long> getIdType() {
		return Long.class;
	}

}
