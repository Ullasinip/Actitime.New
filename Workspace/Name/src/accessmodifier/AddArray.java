package accessmodifier;
public class AddArray
{
	

public void addArrayEle(int data) 
{ 

    // check no of element is equql to size of array 
    if (count == size) { 
        growSize(); // make array size double 
    } // insert element at end of array 
    array[count] = data; 
    count++; 
} 

// function makes size double of array 
public void growSize() 
{ 

    int temp[] = null; 
    if (count == size) { 

        // temp is a double size array of array 
        // and store array elements 
        temp = new int[size * 2]; 
        { 
            for (int i = 0; i < size; i++) { 
                // copy all array value into temp 
                temp[i] = array[i]; 
            } 
        } 
    } 

    // double size array temp initialize 
    // into variable array again 
    array = temp; 
     
    // and make size is double also of array 
    size = size * 2; 
} 

// function shrink size of array 
// which block unnecessary remove them 
public void shrinkSize() 
{ 
    int temp[] = null; 
    if (count > 0) { 

        // temp is a count size array 
        // and store array elements 
        temp = new int[count]; 
        for (int i = 0; i < count; i++) { 

            // copy all array value into temp 
            temp[i] = array[i]; 
        } 

        size = count; 

        // count size array temp initialize  
        // into variable array again 
        array = temp; 
    } 
} 
}
