package io.hohichh.marketplace.app.integration;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

import java.time.LocalDate;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class ApplicationTests extends AbstractApplicationTest {
	@Test
	public void helloIntegrationTest(){
		assertTrue(true);
	}
}