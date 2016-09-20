package org.springframework.data.arangodb.repository.config;

import org.springframework.data.arangodb.repository.support.ArangoDbRepositoryFactoryBean;
import org.springframework.data.repository.config.RepositoryConfigurationExtensionSupport;

public class ArangoDbRepositoryConfigurationExtension extends RepositoryConfigurationExtensionSupport {

	@Override
	public String getRepositoryFactoryClassName() {
		return ArangoDbRepositoryFactoryBean.class.getName();
	}

	@Override
	protected String getModulePrefix() {
		return "arangodb";
	}

}
