package ad325.brandanowenstha1;

/*
 * This program was developed by Brandan Owens for North Seattle College. Copyright Brandan Owens 2020
 * 
 */

/**
 * A Test Suite for Books, PileInterface, PileOfBooks, and BookShelf.
 * This is not an operational Class, only confirms functionality.
 * @author b.Owens
 */
public class TestSuite {
    public static PileOfBooks testPile;
    
    /**
     * Driving calls for TestSuite
     * @param args 
     */
    public static void main(String[] args) {
        //System.out.println("Begin TestSuite");
        //System.out.println("Book Test: " + bookTest());
        //System.out.println("Pile Test: " + pileTest());
        dengSampleRun();
    }
    /**
     * Tests Book Class
     * @return results
     */
    public static String bookTest(){
        String results;
        boolean passed;
        passed = testBookConstr();
        if (passed){results = "Book tests passed.";}
        else{results = "Book tests failed.";}
        return results;
    }
    
    /**
     * Tests Pile Class
     * @return results
     */
    public static String pileTest(){
        String results;
        boolean passed;
        passed  = testPileConstr();
        results = "Constructor: " + passed;
        passed  = testPileAdd();
        results  = "Add: " + passed;
        System.out.println(results);
        passed  = testPileRmandTopBook();
        results = "Remove: " + passed;
        passed = testPileEmpty();
        results = "isEmpty: " + passed;
        passed = testPileClear();
        results = "clear: " + passed;
        if (passed){
            results = "Pile tests passed.";
        }
        //else{results = "Pile tests failed.";}
        return results;
    }
    
    
    /**
     * Tests the Book object's constructor
     * @return True if pass
     */
    public static boolean testBookConstr(){
        Book testBook = new Book("TestBook");
        String ans = "TestBook";
        return ans.matches(testBook.title);
    }
    
    /**
     * Tests the Pile object's constructor
     * @return True if pass
     */
    public static boolean testPileConstr(){
        boolean passed = false;
        testPile = new PileOfBooks("TestBook");
        passed = testPile.entries == 1;
        return passed;
    }
    /**
     * Tests the Pile object's add method
     * @return True if pass
     */
    public static boolean testPileAdd(){
        return testPile.add("TestBook2");
    }
    
    /**
     * Tests the Pile object's remove method
     * @return True if pass
     */
    public static boolean testPileRmandTopBook(){
        Book tBook = testPile.topBook();
        Book rmBook = testPile.remove();
        boolean passed = (rmBook == tBook);
        return passed;
    }
    
    
    /**
     * Tests the Pile object's isEmpty method
     * @return True if pass
     */
    public static boolean testPileEmpty(){
        return testPile.isEmpty();
    }
    
    /**
     * Tests the Pile object's clear method
     * @return True if pass
     */
    public static boolean testPileClear(){
        boolean cleared = testPile.isEmpty();
        testPile.clear();
        cleared = testPile.isEmpty();
        return cleared;
        
    }
    
    /**
     * Sample Run
     * Professor Defined Sample Run
     */
    public static void dengSampleRun(){
        PileOfBooks myPile = new PileOfBooks();
        System.out.println("Pile is Empty: " + myPile.isEmpty());
        myPile.add("And Then There Were None");
        myPile.add("The Hobbit");
        myPile.add("The Lord of the Rings");
        myPile.add("The Da Vinci Code");
        myPile.add("The Catcher in the Rye");
        System.out.println("Pile is Empty: " + myPile.isEmpty());
        System.out.println("Top Book Title: ");
    }
    
    /**
     * Tests the Shelf objects Constructor
     * @return True if pass
     */
    public static boolean testShelfConstr(){
        return false;//STUB
    }
    
    /**
     * Tests the Shelf object's add method
     * @return True if pass
     */
    public static boolean testShelfAdd(){
        return false;//STUB
    }
    
    /**
     * Tests the Shelf object's remove method
     * @return True if pass
     */
    public static boolean testShelfRm(){
        return false;//STUB
    }
    
    /**
     * Tests the Shelf object's Search ISBN method
     * @return True if pass
     */
    public static boolean testShelfSrchISBN(){
        return false;//STUB
    }
    
    /**
     * Tests the Shelf object's Search String method
     * @return True if pass
     */
    public static boolean testShelfSrchString(){
        return false;//STUB
    }
    
    /**
     * Tests the Shelf object's Search PageCount method
     * @return True if pass
     */
    public static boolean testShelfSrchPageCount(){
        return false;//STUB
    }
    
    /**
     * Tests the Shelf object's isEmpty method
     * @return True if pass
     */
    public static boolean testShelfEmpty(){
        return false;//STUB
    }
    
    /**
     * Tests the Shelf object's clear method
     * @return True if pass
     */
    public static boolean testShelfClear(){
        return false;//STUB
    }
    
}
