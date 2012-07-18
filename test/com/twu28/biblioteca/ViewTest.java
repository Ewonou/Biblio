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

     Assert.assertEquals(sut.systemData.toString(), "magic");
 }
}