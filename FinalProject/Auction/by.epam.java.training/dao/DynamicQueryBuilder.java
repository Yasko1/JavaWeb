package dao;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import entity.Lot;

/**
 *  Designed to build query depends on searching parameters.
 */
public class DynamicQueryBuilder {

    private static final String ALL_LOTS_QUERY = "SELECT * FROM lot";
    private static final String WHERE = " WHERE ";
    private static final String AND = " AND ";

    private static final String STATUS_PARAMETER = "status = ?";
    private static final String DATE_OF_START_FROM_PARAMETER = "date_of_start < ?";
    private static final String DATE_OF_START_TO_PARAMETER = "date_of_start > ?";
    private static final String DATE_OF_END_TO_PARAMETER = "date_of_end > ?";
    private static final String DATE_OF_END_FROM_PARAMETER = "date_of_end < ?";

    private static final String DATE_OF_START_FROM = "date_of_start_from";
    private static final String DATE_OF_START_TO = "date_of_start_to";
    private static final String DATE_OF_END_FROM = "date_of_end_from";
    private static final String DATE_OF_END_TO = "date_of_end_to";

    /**
     * Designed to build query depends on searching parameters.
     *
     * @param parameters a {@link Map} object that maps keys(name of parameter) to values of parameters.
     * @return a {@link String} object that contains built query to database
     */
    public static String build(Map<String, String> parameters) {
    	
        if (parameters.size() == 0) {
            return ALL_LOTS_QUERY;
        }

        Set<String> keySet = parameters.keySet();
        Iterator<String> iterator = keySet.iterator();

        StringBuilder resultQuery = new StringBuilder(ALL_LOTS_QUERY + WHERE);
        int size = keySet.size();
        for (int i = 0; i < size; i++) {
            String key = iterator.next();

            if (i != 0) {
                resultQuery.append(AND);
            }

            String parameter = findWhereParameterByName(key);
            resultQuery.append(parameter);
        }

        return resultQuery.toString();
    }

    /**
     *  Designed to searching "where" parameter to query by parameters of object.
     *
     * @param name a {@link String} object that contains name of parameter
     * @return corresponding {@link String} object with the where parameter.
     */
    private static String findWhereParameterByName(String name) {

        String whereParameter;

        switch (name) {
            
            case Lot.STATUS:
                whereParameter = STATUS_PARAMETER;
                break;
            case DATE_OF_START_FROM:
                whereParameter = DATE_OF_START_FROM_PARAMETER;
                break;
            case DATE_OF_START_TO:
                whereParameter = DATE_OF_START_TO_PARAMETER;
                break;
            case DATE_OF_END_FROM:
                whereParameter = DATE_OF_END_FROM_PARAMETER;
                break;
            case DATE_OF_END_TO:
                whereParameter = DATE_OF_END_TO_PARAMETER;
                break;
            default:
                throw new IllegalArgumentException("Unknown name of parameter!"+" parametr = " + name);
        }

        return whereParameter;
    }
}