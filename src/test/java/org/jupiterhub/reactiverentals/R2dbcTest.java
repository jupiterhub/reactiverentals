package org.jupiterhub.reactiverentals;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.jupiterhub.reactiverentals.record.Person;
import org.springframework.data.r2dbc.core.DatabaseClient;
import reactor.test.StepVerifier;


public class R2dbcTest {

    private static final Log log = LogFactory.getLog(R2dbcTest.class);

    @Test
    void insertAndRetrieve() {
        ConnectionFactory connectionFactory = ConnectionFactories.get("r2dbc:h2:mem:///test?options=DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");

        DatabaseClient client = DatabaseClient.create(connectionFactory);

        client.execute("CREATE TABLE person" +
                "(id VARCHAR(255) PRIMARY KEY," +
                "name VARCHAR(255)," +
                "age INT)")
                .fetch()
                .rowsUpdated()
                .as(StepVerifier::create)
                .expectNextCount(1)
                .verifyComplete();

        client.insert()
                .into(Person.class)
                .using(new Person("joe", "Joe", 34))
                .then()
                .as(StepVerifier::create)
                .verifyComplete();

        client.select()
                .from(Person.class)
                .fetch()
                .first()
                .doOnNext(it -> log.info(it))
                .as(StepVerifier::create)
                .expectNextCount(1)
                .verifyComplete();
    }
}
