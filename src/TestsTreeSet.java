
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Vera
 */
public class TestsTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* TreeSet<String> sortPeoples=new TreeSet<String>();
        
        sortPeoples.add("Sandra");
        sortPeoples.add("Amanda");
        sortPeoples.add("Diana");
        sortPeoples.add("Raquel");
        
        for (String s : sortPeoples) {
            
            System.out.println(s);
            
        }*/
       Article first=new Article(1, "Desk");
       Article second=new Article(2, "Chair");
       Article third=new Article(3, "Computer");
       
       TreeSet<Article> sortArticles=new TreeSet<Article>();
       
       sortArticles.add(third);
       sortArticles.add(first);
       sortArticles.add(second);
       
        for (Article art : sortArticles) {
            System.out.println(art.getDescription());
        }
    }

}

class Article implements Comparable<Article>{

    public Article(int num, String descr){
    
        article_num=num;
        description=descr;
    }
    
    @Override
    public int compareTo(Article o) {
      return article_num - o.article_num;
    }
    
    public String getDescription(){
    
        return description;
    }
    
    private int article_num;
    private String description;
    
    

}
