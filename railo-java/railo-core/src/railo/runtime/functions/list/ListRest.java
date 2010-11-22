/**
 * Implements the Cold Fusion Function listrest
 */
package railo.runtime.functions.list;

import railo.runtime.PageContext;
import railo.runtime.ext.function.Function;
import railo.runtime.type.List;

public final class ListRest implements Function {
	
	private static final long serialVersionUID = -6596215135126751629L;
	
	public static String call(PageContext pc , String list) {
		return List.rest(list, ",",true);
	}
	public static String call(PageContext pc , String list, String delimeter) {
		return List.rest(list, delimeter,true);
	}
	public static String call(PageContext pc , String list, String delimeter, boolean includeEmptyFields) {
		return List.rest(list, delimeter,!includeEmptyFields);
	}
}