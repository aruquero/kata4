
package Control;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistrogramBuilder;
import View.Mailreader;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList= Mailreader.read(fileName);
        Histogram histogram = MailHistrogramBuilder.build(mailList);
        HistogramDisplay histogramD = new HistogramDisplay(histogram);
        histogramD.execute();
    }
    
}
