/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kg.apc.jmeter.dotchart;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jmeter.visualizers.Sample;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apc
 */
public class DotChartVisualizerTest
{

    public DotChartVisualizerTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        File propsFile = null;
        try
        {
            propsFile = File.createTempFile("jmeter-plugins", "testProps");
        }
        catch (IOException ex)
        {
            Logger.getLogger(DotChartVisualizerTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        JMeterUtils.loadJMeterProperties(propsFile.getAbsolutePath());
        JMeterUtils.setLocale(new Locale("ignoreResources"));
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getImage method, of class DotChartVisualizer.
     */
    @Test
    public void testGetImage()
    {
        System.out.println("getImage");

        DotChartVisualizer instance = new DotChartVisualizer();
        assertNotNull(instance);
        Image result = instance.getImage();
        assertNull(result);
    }

    /**
     * Test of updateGui method, of class DotChartVisualizer.
     */
    @Test
    public void testUpdateGui_0args()
    {
        System.out.println("updateGui");
        DotChartVisualizer instance = new DotChartVisualizer();
        instance.updateGui();
    }

    /**
     * Test of updateGui method, of class DotChartVisualizer.
     */
    @Test
    public void testUpdateGui_Sample()
    {
        System.out.println("updateGui");
        Sample s = new Sample();
        DotChartVisualizer instance = new DotChartVisualizer();
        instance.add(new SampleResult());
        instance.updateGui(s);
    }

    /**
     * Test of add method, of class DotChartVisualizer.
     */
    @Test
    public void testAdd()
    {
        System.out.println("add");
        SampleResult res = new SampleResult();
        DotChartVisualizer instance = new DotChartVisualizer();
        instance.add(res);
    }

    /**
     * Test of getStaticLabel method, of class DotChartVisualizer.
     */
    @Test
    public void testGetStaticLabel()
    {
        System.out.println("getStaticLabel");
        DotChartVisualizer instance = new DotChartVisualizer();
        String result = instance.getStaticLabel();
        assertTrue(result.length() > 0);
    }

    /**
     * Test of getLabelResource method, of class DotChartVisualizer.
     */
    @Test
    public void testGetLabelResource()
    {        
        System.out.println("getLabelResource");
        DotChartVisualizer instance = new DotChartVisualizer();
        String result = instance.getLabelResource();
        assertTrue(result.length() > 0);
    }

    /**
     * Test of clearData method, of class DotChartVisualizer.
     */
    @Test
    public void testClearData()
    {
        System.out.println("clearData");
        DotChartVisualizer instance = new DotChartVisualizer();
        SampleResult res=new SampleResult();
        instance.add(res);
        instance.clearData();
    }

    /**
     * Test of toString method, of class DotChartVisualizer.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        DotChartVisualizer instance = new DotChartVisualizer();
        String result = instance.toString();
        assertTrue(result.length() > 0);
    }

    /**
     * Test of getPrintableComponent method, of class DotChartVisualizer.
     */
    @Test
    public void testGetPrintableComponent()
    {
        System.out.println("getPrintableComponent");
        DotChartVisualizer instance = new DotChartVisualizer();
        JComponent result = instance.getPrintableComponent();
        assertNotNull(result);
    }
}