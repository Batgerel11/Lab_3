package lights;

import java.util.List;
import java.util.ArrayList;
public class RunningHolidayLights implements HolidayLights {
	
	
	//зарлав.
	public int urt;
	
	//create list
	public ArrayList<Light> list = new ArrayList<Light>();
	private int i = 0  ; 
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	//функцыг зассан.
	public RunningHolidayLights(int length) {
		// TODO
		urt = length;
		for (int i = 0; i < urt; i++) {
			Light light;
			list.add(light = new Light());
		}		 
		next();
		}
	
	public List<Light> next() {
		if (i == 0) {
			list.get(list.size() - 1).setOn(false);
			list.get(i).setOn(true);
			i++;
		} else {
			
			list.get(i - 1).setOn(false);
			list.get(i).setOn(true);
			i++;
		}
		//12 гэрэл
		i= (i==12)? 0: i;
		return list;
	}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		// TODO
		return list.size();
	}
						
}