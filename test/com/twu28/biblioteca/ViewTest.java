package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class ViewTest{

String name = "magic";
View sut = new View(name);

 @Test
public void DoesItDisplayOutput()
 {
     sut.display();
     StringBuffer expectedOutput = new StringBuffer();
     StringBuffer result = new StringBuffer();
     expectedOutput.append(name);
     result.append(sut.object);
     Assert.assertEquals(result, expectedOutput);
 }
}