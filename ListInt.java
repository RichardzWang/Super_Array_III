public interface ListInt{

    void add (int item); //Adds an item to the end of an int array
    void add (int item, int index); //Adds an item to the specified index of an int array. Returns error if index is greater than length of int array.
    void remove (int index);//Removes an item at a given index of an int array.
    int size ();// Returns to the size of an array.
    int get(int index);//Returns the item at the specified index of the array.
    int set (int item, int index);//Changes the item at the specified index of an array to the specified item.

}
