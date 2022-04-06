package lights;

import java.util.List;
import java.util.Collections;
/**
 * Represents a sequence of lights that periodically changes
 * appearence.
 */

public interface HolidayLights {

	//public List<Light> next();
	
	public  <C> C next();  
	public int getLength();
}