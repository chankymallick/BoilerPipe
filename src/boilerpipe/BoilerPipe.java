
package boilerpipe;


import java.net.URL;
import java.util.Collections;
import java.util.List; 

import de.l3s.boilerpipe.BoilerpipeExtractor;
import de.l3s.boilerpipe.document.TextDocument;
import de.l3s.boilerpipe.extractors.ArticleExtractor;
import de.l3s.boilerpipe.extractors.CommonExtractors;
import de.l3s.boilerpipe.sax.BoilerpipeSAXInput;
import de.l3s.boilerpipe.sax.HTMLDocument;
import de.l3s.boilerpipe.sax.HTMLFetcher;

/**
 *
 * @author Mallick
 */
public class BoilerPipe {


    public static void main(String[] args) {
        

           new BoilerPipe().getdata();
        
        
       
    }
    
    public void  getdata()
    {
    
     try {
            synchronized(BoilerPipe.class){
         final HTMLDocument htmlDoc = HTMLFetcher.fetch(new URL("https://blog.openshift.com/learning-30-technologies-in-30-days-a-developer-challenge/"));
          final TextDocument doc = new BoilerpipeSAXInput(htmlDoc.toInputSource()).getTextDocument();
//            String title = doc.getTitle();
             String extrct = ArticleExtractor.INSTANCE.getText("http://www.abplive.in/india-news/odd-even-plan-pollution-has-given-the-aap-a-virtuous-cause-to-fight-for-259872").toString();
             System.out.println("------------------------------------ArticleExtractor-----------------------------------------");
            System.err.println(extrct);
            System.out.println("----------------------------------------------------------------------------------");
//            String content = ArticleExtractor.INSTANCE.getText(doc);
//            System.out.println("------------------------------------Title-----------------------------------------");
//            System.err.println(doc.getTitle());
//            System.out.println("----------------------------------------------------------------------------------");
//            System.out.println("------------------------------------Text-----------------------------------------");
//            System.err.println(doc.getText(true, true));
//            System.out.println("----------------------------------------------------------------------------------");
//            System.out.println("------------------------------------Content-----------------------------------------");
//            System.err.println(doc.getContent());
//            System.out.println("----------------------------------------------------------------------------------");
//            System.out.println("------------------------------------Blocks-----------------------------------------");
//            List blocks = doc.getTextBlocks(); 
//            System.out.println(blocks);
//            System.out.println("----------------------------------------------------------------------------------");
//            System.out.println("------------------------------------NEW Content-----------------------------------------");
//            System.err.println(content);
//            System.out.println("----------------------------------------------------------------------------------");
 //         final BoilerpipeExtractor extractor = CommonExtractors.KEEP_EVERYTHING_EXTRACTOR;}
           
           // final ImageExtractor ie = ImageExtractor.INSTANCE;
 
          //  List<Image> images = ie.process(new URL(url), extractor);
 
//            Collections.sort(images);
//            String image = null;
//            if (!images.isEmpty()) {
//                image = images.get(0).getSrc();
         }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
