/**
 * File generated from the model::org::obeonetwork::pim::uml2::gen::java::tests::interfaces::methods::parameters::CardinalityParameterMethodInterface uml Interface
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 3 avril 2013 15:59:18 CEST
 */
package org.obeonetwork.pim.uml2.gen.java.tests.interfaces.methods.parameters;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CardinalityParameterMethodInterface.
 */
public interface CardinalityParameterMethodInterface {
	// Start of user code (user defined attributes)

	// End of user code

	/**
	 * Description of the method cardinalityParameterMethod.
	 * @param orderedUniqueParameter 
	 * @param notOrderedUniqueParameter 
	 * @param notOrderedNotUniqueParameter 
	 * @param orderedNotUniqueParameter 
	 * @return 
	 */
	public Date cardinalityParameterMethod(
			LinkedHashSet<Boolean> orderedUniqueParameter,
			HashSet<Integer> notOrderedUniqueParameter,
			ArrayList<String> notOrderedNotUniqueParameter,
			ArrayList<Date> orderedNotUniqueParameter);

	// Start of user code (user defined methods)

	// End of user code

}
