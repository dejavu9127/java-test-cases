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
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    Greetings person1=new Greetings();
    
    
    @Test
    public void personSayHello() {
        assertThat(person1.sayHello(),containsString("Bye"));
    }
    
    @Test
    public void checkBye(){
        assertThat(person1.sayBye(),containsString("Bye"));
    }
    
}
