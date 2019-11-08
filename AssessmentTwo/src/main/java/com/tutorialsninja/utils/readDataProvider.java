package com.tutorialsninja.utils;

import org.testng.annotations.DataProvider;

import com.tutorialsninja.config.Constants;

public class readDataProvider {
	@DataProvider
	public Object[][] url(){
		Object data[][]=ExcelReader.readExcel("validateurl", Constants.TESTDATA_PATH);
		return data;
	}
	
	@DataProvider
	public Object[][] addToCart(){
		Object data[][]=ExcelReader.readExcel("addtocart", Constants.TESTDATA_PATH);
		return data;
	}

}
