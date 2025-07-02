package de.codecentric.boot.admin.client.registration.metadata;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaVersionMetadataContributorTest {

	@Test
	public void should_return_java_details() {
		JavaVersionMetadataContributor contributor = new JavaVersionMetadataContributor();

		Map<String, String> metadata = contributor.getMetadata();

		assertThat(metadata).containsEntry("java.version", System.getProperty("java.version"))
			.containsEntry("java.vendor", System.getProperty("java.vendor"));
	}
}
