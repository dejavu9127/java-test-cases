/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycodes.samples.Greetings;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dejavu
 */
public class TestCase1 {
    
    public TestCase1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }
    
    @Before
    public void setUp() {
        
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        
        System.out.println("After");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    Greetings person1=new Greetings();
    
    
    @Test
    public void personSayHello() {
        assertThat(person1.sayHello(),containsString("Hello"));
    }
}
