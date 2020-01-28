/*
 * This program was developed by Brandan Owens for North Seattle College. 
 * Copyright Brandan Owens 2020
 * 
 */
package ad325.brandanowenstha1;

/**
 * A storage approach for Book objects
 * @author b.Owens
 */
public class PileOfBooks implements PileInterface {
    //Attributes
    private final int DEFAULT_CAPACITY = 4;
    private final int MAX_CAPACITY = 10000;
    private Book[] pile;
    private Book[] tempPile;
    private Book tempBook;
    private boolean integrityOK;
    public int capacity = 0;
    public int entries = 0;
    
    //Constructors
    
    /**
     * Constructs a Pile object with a single Book object and specified capacity
     * @param title title of the Book object
     * @param cap   desired capacity of pile
     */
    public PileOfBooks(String title, int cap){
        if (cap <= MAX_CAPACITY){
            capacity = cap;
            pile = new Book[capacity];
            pile[0] = new Book(title);
            entries++;
            integrityOK = true;
        }
        else {
            throw new IllegalStateException("Above Max Capacity");
        }
    }
    
    /**
     * Constructs a Pile object with a single Book object and default capacity
     * @param title title of Book object
     */
    public PileOfBooks(){
        pile = new Book[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        integrityOK = true;
    }
    
    /**
     * Constructs a Pile object with a single Book object and default capacity
     * @param title title of Book object
     */
    public PileOfBooks(String title){
        pile = new Book[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        pile[0] = new Book(title);
        entries++;
        integrityOK = true;
    }
    
    //Public Methods
    @Override
    public boolean add(String n){
        boolean success;
        checkIntegrity();
        tempBook = new Book(n);
        if (isFull()){
            incCap();
            pile[entries] = tempBook;
            entries++;
            success = true;
            
        }
        else {
            pile[entries] = tempBook;
            entries++;
            success = true;
        }
        return success;
    }
    
    @Override
    public Book remove(){
        int c = 0;
        tempPile = new Book[entries - 1];
        tempBook = pile[entries];
        entries--;
        for (Book i : pile){
            if (i != tempBook){
                tempPile[c] = i;
            }
        }
        return tempBook;
    }
    
    @Override
    public Book topBook(){
        return pile[entries];
    }
    
    @Override
    public boolean isEmpty(){
        return entries == 0;
        
    }
    
    @Override
    public void clear(){
        pile = new Book[DEFAULT_CAPACITY];
        entries = 0;
    }
        
    /**
     * Returns Pile object in String format
     * @return results
     */
    @Override
    public String toString(){
        String result = "";
        for (Book p : pile){
            System.out.println(p.title);
            result += " " + p.title;
        }
        return result;
    }
    
    /**
     * Returns Book object's title
     */
    public String getTitle(int idx){
        return pile[idx].getTitle();
    }
    
    //Private Methods
   
    /**
     * Determines if the array is at capacity
     * @return true if there is room false if there is not
     */
    private boolean isFull(){
        return entries >= pile.length;
    }
    
    /**
     * Increases the size of the Pile
     */
    private void incCap(){
        int i = 0;
        capacity += 4;
        tempPile = new Book[capacity];
        for(Book b : pile){
            tempPile[i] = b;
        }
        pile = tempPile;
    }
    
    /**
     * Throws an exception if the object is not initialized
     * @throws SecurityException
     */
    private void checkIntegrity(){
        if(!integrityOK){
            throw new SecurityException("Pile is corrupt."); 
        }
    }
}
