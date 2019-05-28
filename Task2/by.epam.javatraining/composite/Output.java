package composite;

import java.util.List;

public interface Output {

	void outComponent();

	void addElement(Output element);

	List<Output> getList();

}
