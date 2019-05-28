package model.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import composite.Output;

public class Text implements Output {

    private static final Logger log = LogManager.getLogger(Text.class);

    private final List<Output> paragraphList;

    public Text(List<Output> paragraphList) {
       this.paragraphList = paragraphList;
    }

    public Text(){
       paragraphList = new ArrayList<>();
    }

    @Override
    public void addElement(Output element) {
        paragraphList.add(element);
    }

    @Override
    public List<Output> getList() {
        return paragraphList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Output paragraph : paragraphList) {
            builder.append(paragraph.toString());
        }
        String s = new String(builder);
        return s;
    }

    @Override
    public void outComponent() {
        log.info(this.toString());
    }

}
