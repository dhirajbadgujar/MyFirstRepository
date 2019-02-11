package POJO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Engine {
	@Value("uhreauhf")
	private String confg;
	@Value("Gello")
	private String modelNo;
	public String getConfg() {
		return confg;
	}
	
	public void setConfg(String confg) {
		this.confg = confg;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
}	
