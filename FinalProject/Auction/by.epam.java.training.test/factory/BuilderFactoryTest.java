package factory;

import org.junit.jupiter.api.Test;

import service.builder.Builder;
import service.builder.LotBuilder;
import service.builder.UserBuilder;
import service.factory.BuilderFactory;

import static org.junit.Assert.assertEquals;

public class BuilderFactoryTest {
    private static final String USER = "user";
    private static final String LOT = "lot";

    @Test
    public void shouldCreateAndReturnUserBuilder() {
        Builder builder = BuilderFactory.create(USER);

        Class<? extends Builder> builderClass = builder.getClass();
        assertEquals(UserBuilder.class, builderClass);
    }

    @Test
    public void shouldCreateAndReturnLotBuilder() {
        Builder builder = BuilderFactory.create(LOT);

        Class<? extends Builder> builderClass = builder.getClass();
        assertEquals(LotBuilder.class, builderClass);
    }
}