package statisticker;

import java.util.*;

public class Statistics 
{
    public static class Stats
    {
        Float min, max, avg ;
        public Stats( float min, float max, float avg )
        {
            this.min = min ;
            this.max = max ;
            this.avg = avg ;
        }
    }
    
    public static Stats getStatistics(List<Float> numbers) 
    {
        if( !numbers.isEmpty() ){   // checking for empty list
    		float avg=0;
        	float min=Collections.min(numbers);
        	float max=Collections.max(numbers);
		
            Float sum = 0f;     // initializing sum to 0
        	for (Float n : numbers)     // looping through all numbers
            {
                sum += n;     // adding each number to sum, at every loop 
            }
            
        	avg = sum / (numbers.size());
        	Stats s = new Stats(min, max, avg);
        	return s;
    	}
        return (new Stats(Float.NaN,Float.NaN,Float.NaN));
        
        
    }
}
