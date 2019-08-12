package dao;

import org.junit.jupiter.api.Test;

import entity.Lot;
import entity.LotStatusEnum;

import org.junit.Assert;
import org.junit.BeforeClass;

import java.util.HashMap;
import java.util.Map;

public class DynamicQueryBuilderTest {

    private static final String EXPECTED_QUERY = "SELECT * FROM lot WHERE auction_type = ? AND status = ?";
    private static final Map<String, String> parameters = new HashMap<>();

    @BeforeClass
    public static void setParameters() {
        parameters.put(Lot.STATUS, LotStatusEnum.CONFIRMED.getValue());
    }

    @Test
    public void shouldBuildQueryByParameters() {
        String actualQuery = DynamicQueryBuilder.build(parameters);
        Assert.assertEquals(EXPECTED_QUERY, actualQuery);
    }
}