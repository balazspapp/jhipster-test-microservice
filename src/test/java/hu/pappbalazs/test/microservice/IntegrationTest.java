package hu.pappbalazs.test.microservice;

import hu.pappbalazs.test.microservice.JhipsterTestMicroserviceApp;
import hu.pappbalazs.test.microservice.config.AsyncSyncConfiguration;
import hu.pappbalazs.test.microservice.config.EmbeddedKafka;
import hu.pappbalazs.test.microservice.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterTestMicroserviceApp.class, AsyncSyncConfiguration.class })
@EmbeddedMongo
@EmbeddedKafka
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
