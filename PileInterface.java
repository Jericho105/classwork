/*
 * This program was developed by Brandan Owens for North Seattle College. Copyright Brandan Owens 2020
 * 
 */
package ad325.brandanowenstha1;

/**
 * An interface to abstract the methods necessary to handle Book objects in a storage approach.
 * Each method must be implemented or overridden to be successful.
 * USED T NOW USES BOOK OBJECT
 * @author b.Owens
 */
public interface PileInterface {
    
    /**
     * Adds a Book object to the storage object
     * @param n Book object to be added
     * @return True if successful
     * add(Book n)
     * create new Book object with default constructor
     * if first book && !ArrayExists
     *      init dynamic array
     *      append book object to array
     * if !first book && arrayExists
     *      append book object to array
     */
    public boolean add(String n);
    
    /**
     * Removes and returns the first occurrence of a specified Book object from
     * the storage object
     * @param n Book object to be removed
     * @return removed Book object
     * remove(Book n)
     * if ArrayExists
     *      if storage >= 1 
     *          for elements in array
     *              if Book.title == SearchBook.title
     *                      tempBook = found book
     *                      remove found book
     *                      return tempBook
     * if !ArrayExists
     *      return Error //IndexOutOfBounds?
     */
    public Book remove();
    
    /**
     * Returns the top Book object from the storage object
     * @return most recently inserted Book object
     * topBook()
     * if !ArrayExists
     *      return Error //IndexOutOfBounds
     * if ArrayExists 
     *      return greatest index book object
     */
    public Book topBook();
    
    /**
     * Returns True if the storage object is confirmed empty
     * @return True if empty
     * isEmpty()
     * if !ArrayExists
     *      return Error //IndexOutOfBounds
     * if ArrayExists
     *      if index0 == null
     *          return True
     */
    public boolean isEmpty();
    
    /**
     * Clears the storage object of all Book objects
     * clear()
     * if !ArrayExists
     *      return Error
     * if ArrayExists
     *     if arrayHasContents return false
     *     else return true
     */
    public void clear();
    
}
