package com.test.MavenActitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.MavenActitime.BaseTests;
import com.pom.MavenActitime.ActiTimepom;

public class TestActitime extends BaseTests{
	
	@Test
	public void actiTimeTest() throws IOException{
		
		ActiTimepom actiTimepom=new ActiTimepom(driver);
		actiTimepom.loginMethod();
	}

}
