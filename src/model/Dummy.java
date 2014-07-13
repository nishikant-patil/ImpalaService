package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dummy {
	int i=22;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
