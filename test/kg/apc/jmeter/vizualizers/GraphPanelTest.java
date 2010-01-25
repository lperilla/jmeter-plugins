package kg.apc.jmeter.vizualizers;

import java.awt.Image;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GraphPanelTest
{
   private GraphPanel instance;

   public GraphPanelTest()
   {
   }

   @BeforeClass
   public static void setUpClass()
        throws Exception
   {
   }

   @AfterClass
   public static void tearDownClass()
        throws Exception
   {
   }

   @Before
   public void setUp()
   {
      instance = new GraphPanel(null);
   }

   @After
   public void tearDown()
   {
   }

   /**
    * Test of updateGui method, of class GraphPanel.
    */
   @Test
   public void testUpdateGui()
   {
      System.out.println("updateGui");
      instance.updateGui();
   }

   /**
    * Test of getGraphImage method, of class GraphPanel.
    */
   @Test
   public void testGetGraphImage()
   {
      System.out.println("getGraphImage");
      Image expResult = null;
      Image result = instance.getGraphImage();
      assertEquals(expResult, result);
   }

   /**
    * Test of getGraphObject method, of class GraphPanel.
    */
   @Test
   public void testGetGraphObject()
   {
      System.out.println("getGraphObject");
      GraphPanelChart result = instance.getGraphObject();
      assertEquals(GraphPanelChart.class.getName(), result.getClass().getName());
   }
}