/*
 * This program was developed by Brandan Owens for North Seattle College. Copyright Brandan Owens 2020
 * 
 */
package ad325.brandanowenstha1;

/**
 * A class for Book objects REPLACES generic T
 * Each book has a title, author, pageCount, and ISBN
 * @author b.Owens
 */
public class Book {
    //Attributes
    public String title, author;
    public int isbn;
    public int pageCount;
    //Methods
    /**
     * Book Object Constructor
     * @param ttl Title of Book
     */
    public Book(String ttl){
        title = ttl;
        author = "No author";
        pageCount = -99;
        isbn = -99;
    }
    
    /**
     * Book Object Constructor (int)
     * @param isbn ISBN of Book
     */
    public Book(int isbn){
        title = null;
        author = null;
        pageCount = -99;
        this.isbn = isbn;
    }
    
    /**
     * Returns the Title of the Book Object
     * @return title : String
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Returns the Author of the Book Object
     * @return author : String
     */
    public String getAuthor(){
        return author;
    }
    
    /**
     * Returns the Page Count of the Book Object
     * @return pageCount : int
     */
    public int getPageCount(){
        return  pageCount;
    }
    
    /**
     * Returns the ISBN of the Book Object
     * @return isbn : int
     */
    public int getISBN(){
        return isbn;
    }
    
    /**
     * Sets the Title of the Book object
     * @param ttl Title of the Book object
     */
    public void setTitle(String ttl){
        title = ttl;
    }
    
    /**
     * Sets the Author of the Book object
     * @param auth Author of the Book object 
     */
    public void setAuthor(String auth){
        author = auth;
    }
    
    /**
     * Sets the PageCount of the Book object
     * @param pgct PageCount of the Book object
     */
    public void setPageCount(int pgct){
        pageCount = pgct;
    }
    
    /**
     * Sets the ISBN of the Book object
     * @param isbn ISBN of the Book object
     */
    public void setISBN(int isbn){
        this.isbn = isbn;
    }
    
}
