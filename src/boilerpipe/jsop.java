package boilerpipe;
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;  

public class jsop 
{
     public static void main(String[] args) {
         try {
             String str1="google.com";
             Document doc = Jsoup.connect("localhost:2020/MappingManager/MappingManager.ads?action=mappingManager").get();  
             Elements links = doc.select("a[href]");           
             for (Element link : links) {  
              
                if((link.text().length()>15 || link.text().length()==0 || link.text()=="" ) )
                {
                System.out.println("link : " + link.attr("href"));  
                System.out.println("text : " + link.text());                 
                }            
                
            }  
        
             
         } catch (Exception e) {
             e.printStackTrace();
         }
         
    }
            
    
}

class image2
{

 public static void main( String[] args ) throws IOException{  
            Document doc = Jsoup.connect("http://movies.ndtv.com/bollywood/aamir-khan-follows-dilip-sahab-says-saira-banu-1254568?pfrom=home-movies").get();  
            Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");  
            for (Element image : images) {  
                System.out.println("src : " + image.attr("src"));  
                System.out.println("height : " + image.attr("height"));  
                System.out.println("width : " + image.attr("width"));  
                System.out.println("alt : " + image.attr("alt"));  
            }  
       
}  
}