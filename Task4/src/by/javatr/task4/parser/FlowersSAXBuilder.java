package by.javatr.task4.parser;

import java.io.IOException;
import java.util.Set;

import by.javatr.task4.entity.Flower;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class FlowersSAXBuilder extends AbstractFlowersBuilder {
    private FlowerHandler fh;
    private XMLReader reader;
    private static final Logger log= LogManager.getLogger(FlowersSAXBuilder.class);
    public FlowersSAXBuilder() {
        fh = new FlowerHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(fh);
        } catch (SAXException e) {
            log.error("ошибка SAX парсера: " + e);
        }
    }

    public FlowersSAXBuilder(Set<Flower> flowers) {
        super(flowers);
    }

    public Set<Flower> getFlowers() {
        return flowers;
    }

    @Override
    public void buildSetFlowers(String fileName) {
        try {
            reader.parse(fileName);
        } catch (SAXException e) {
            log.error("ошибка SAX парсера: " + e);
        } catch (IOException e) {
            log.error("ошибка I/О потока: " + e);
        }
        flowers = fh.getFlowers();
    }
}