package eu.sergiobelli.jworkcons.be.orm;

import java.util.Collection;

/**
 * 
 * @author sbelli
 */
public class Assert {

	/**
	 * Private constructor.
	 * This class MUST be accessed in static way. 
	 */
	private Assert() {
		super();
		//Only static access
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNull(final Object obj) {
		return obj == null;
	}

	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNotNull(final Object obj) {
		return !isNull(obj);
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(final String str) {
		return isNull(str) ? true : str.length() == 0;
	}

	/**
	 * 
	 * @param coll
	 * @return
	 */
	public static boolean isEmpty(final Collection coll) {
		return isNull(coll) ? true : coll.size() == 0;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(final String str) {
		return !isEmpty(str);
	}

	/**
	 * 
	 * @param coll
	 * @return
	 */
	public static boolean isNotEmpty(final Collection coll) {
		return !isEmpty(coll);
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(final String str) {
		boolean isNumeric = false;
		try {
			Long.valueOf(str);
			isNumeric = true;
		} catch (Exception ex) {
			isNumeric = false;
		}
		return isNumeric;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotNumeric(final String str) {
		return !isNumeric(str);
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isDouble(final String str) {
		boolean isDouble = false;
		try {
			Double.valueOf(str);
			isDouble = true;
		} catch (Exception ex) {
			isDouble = false;
		}
		return isDouble;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotDouble(final String str) {
		return !isDouble(str);
	}

	public static boolean equals(Object arg0, Object arg1) {
		if (isNull(arg0)) {
			return false;
		} else {
			return arg0.equals(arg1);
		}
	}
	public static boolean notEquals(Object arg0, Object arg1) {
		return !equals(arg0, arg1);
	}
	
	public static boolean equalsIgnoreCase(String arg0, String arg1) {
		if (isNull(arg0)) {
			return false;
		} else {
			return arg0.equalsIgnoreCase(arg1);
		}
	}
}
