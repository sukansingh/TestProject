package com.demo.main;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class TestNGRunner {

	public static void main(String[] args) {
		
		TestNG myTestNG = new TestNG();
		XmlSuite suit = new XmlSuite();
		
		//List<XmlSuite> suites = new ArrayList<XmlSuite>();
		//myTestNG.setXmlSuites(suites);
		
		List<String> suites = new ArrayList<String>();
		suites.add("testng.xml");
		myTestNG.setTestSuites(suites);
		myTestNG.run();

	}

}
