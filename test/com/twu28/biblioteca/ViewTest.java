package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class ViewTest{


 @Test
public void DoesItDisplayOutput()
 {
     String name = "magic";

     View sut = new View(name);

     sut.display();

     StringBuffer result = new StringBuffer();
     result.append(sut.systemData);

     StringBuffer expectedOutput = new StringBuffer();
     expectedOutput.append("magic");

     Assert.assertEquals(result, expectedOutput);
 }
}