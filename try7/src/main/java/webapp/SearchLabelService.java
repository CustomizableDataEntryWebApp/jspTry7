package webapp;

import java.util.ArrayList;
import java.util.List;

public class SearchLabelService {
	
	private static List<SearchLabel> labels = new ArrayList<>();
	
	static {
		labels.add(new SearchLabel(1L, "label1", "fNaame"));
		labels.add(new SearchLabel(2L, "label2", "lNaame"));
		labels.add(new SearchLabel(3L, "label3", "age"));
		
	}
	

	public List<SearchLabel> retrieveLabels() {
		return labels;
	}
}
