package fmtTag;

import java.util.ListResourceBundle;  

public class Simple extends ListResourceBundle {  
    
	public Object[][] getContents() {  
        return contents;  
    }  
	
    static final Object[][] contents = { { "colour.Violet", "Violet11" },  
            { "colour.Indigo", "Indigo11" }, { "colour.Blue", "Blue11" }, };  
}  
