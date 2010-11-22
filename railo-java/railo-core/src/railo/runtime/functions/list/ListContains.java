/**
 * Implements the Cold Fusion Function listcontains
 */
package railo.runtime.functions.list;

import railo.print;
import railo.runtime.PageContext;
import railo.runtime.ext.function.Function;
import railo.runtime.type.List;

public final class ListContains implements Function {

	private static final long serialVersionUID = -7580788340022587225L;

	public static double call(PageContext pc , String list, String value) {
		return List.listContainsIgnoreEmpty(list,value,",")+1;
	}
	public static double call(PageContext pc , String list, String value, String delimter) {
		return List.listContainsIgnoreEmpty(list,value,delimter)+1;
	}
	public static double call(PageContext pc , String list, String value, String delimter, boolean includeEmptyFields) {
		if(includeEmptyFields)return List.listContains(list,value,delimter)+1;
		return List.listContainsIgnoreEmpty(list,value,delimter)+1;
	}
}