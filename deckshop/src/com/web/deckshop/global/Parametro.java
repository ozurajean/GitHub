package com.web.deckshop.global;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Parametro {
	public static final String FILE_SEPARATOR = "/";//File.separator;
	public static final String MASCOTAS_PATH = FILE_SEPARATOR+"resources"+FILE_SEPARATOR+"images"+FILE_SEPARATOR+"mascotas"+FILE_SEPARATOR;
	public static final String BLANK_IMAGE_PATH = FILE_SEPARATOR+"resources"+FILE_SEPARATOR+"images"+FILE_SEPARATOR+"miscellaneous"+FILE_SEPARATOR+"blank.jpg";
	public static final String IMAGE_FILE_NAME_PATERN = "##-###-###.jpg";
	public static final long DAY_IN_MILLISECONDS = (24*60*60*1000);
}
