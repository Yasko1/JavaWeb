package service.factory;

import service.builder.*;

/**
 * Designed to build an object of type {@link Builder}.
 */
public class BuilderFactory {

    private static final String USER = "user";
    private static final String LOT = "lot";

    /**
     * Designed to build an object of type {@link Builder} depends on builder name.
     *
     * @param builderName a {@link String} object that contains builder name
     * @return an object of type {@link Builder}.
     */
    @SuppressWarnings("rawtypes")
	public static Builder create(String builderName) {

        switch (builderName) {
            case USER:
                return new UserBuilder();
            case LOT:
                return new LotBuilder();
            default:
                throw new IllegalArgumentException("Unknown Builder name!");
        }
    }

}
