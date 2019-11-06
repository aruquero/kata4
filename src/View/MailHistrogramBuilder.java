

package View;

import Model.Histogram;
import Model.Mail;
import java.util.List;

public class MailHistrogramBuilder {

    public static Histogram build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        
        for(Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }
    
}
