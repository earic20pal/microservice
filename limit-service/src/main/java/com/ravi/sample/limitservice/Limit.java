package com.ravi.sample.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


public class Limit {

	public int maximum;
	public int minimum;

	public Limit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Limit(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
