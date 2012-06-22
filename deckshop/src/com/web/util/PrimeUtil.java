package com.web.util;

import java.io.ByteArrayInputStream;

import org.primefaces.model.DefaultStreamedContent;

public class PrimeUtil {
	
	public DefaultStreamedContent getByteDefaultStreamedContent(byte[] bytes ){
		return new DefaultStreamedContent(new ByteArrayInputStream(bytes));
	}
}
