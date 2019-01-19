/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Vera
 */
public class Book {
    
    public Book(String title, String autor, int ISBN){
    
     this.title=title;
     this.autor=autor;
     this.ISBN=ISBN;
     
    }
    
    public String getDatos(){
        return "The Title is: " + title + "the autor is: " + autor + "and the ISBN is: " + ISBN;
    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.ISBN;
        return hash;
    }

    /* public boolean equals(Object obj){
    if(obj instanceof Book){
    Book another=(Book)obj;
    if(this.ISBN==other.ISBN){
    return true;
    }else{
    return false;
    }
    }else {
    return false;
    }
    }*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.ISBN != other.ISBN) {
            return false;
        }
        return true;
    }

    
    private String title;
    private String autor;
    private int ISBN;
}
