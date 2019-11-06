/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import Model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Marcos
 */
public class HistogramDisplay extends ApplicationFrame {
    private final Histogram<String> histogram;

    public HistogramDisplay(Histogram<String> histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
          JFreeChart chart1 = ChartFactory.createBarChart("Histograma FreeChart", "Dominios email", "Nº de emails",dataSet , PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
          return chart1;
    }
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        //dataSet.addValue(300,"","ulpgc.es");
        //dataSet.addValue(100,"","gmail.es");
        //dataSet.addValue(500,"","chano.ulpgc");
        for(String key : this.histogram.KeySet()){
            dataSet.addValue(this.histogram.get(key),"",key);
        }
        return dataSet;
    }
    
}
