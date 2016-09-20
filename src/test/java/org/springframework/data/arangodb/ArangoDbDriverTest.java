package org.springframework.data.arangodb;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.arangodb.ArangoConfigure;
import com.arangodb.ArangoDriver;
import com.arangodb.ArangoException;

@RunWith(MockitoJUnitRunner.class)
public class ArangoDbDriverTest {

	@Test
	public void connectToLocalhost() {
		// Initialize configure
		ArangoConfigure configure = new ArangoConfigure();
		configure.setUser("test");
		configure.setPassword("test");
		configure.init();

		// Create Driver (this instance is thread-safe)
		ArangoDriver arangoDriver = new ArangoDriver(configure);
		
		try {
			Assert.assertTrue(!arangoDriver.getDatabases().isError());
		} catch (ArangoException e) {
			Assert.fail("Not connect to the locahost database using test/test");
		}
	}

}
