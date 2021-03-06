/*******************************************************************************
 * Copyright (c) 2011, 2012, 2013, 2014 Red Hat, Inc.
 * All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.property.adapters;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.property.adapters.messages"; //$NON-NLS-1$
	public static String JbpmFormalExpressionPropertiesAdapter_Condition_Language;
	public static String JbpmFormalExpressionPropertiesAdapter_Rule;
	public static String JbpmFormalExpressionPropertiesAdapter_Script_Language;
	public static String JbpmGlobalTypePropertiesAdapter_Data_Type_Label;
	public static String JbpmGlobalTypePropertiesAdapter_Label;
	public static String JbpmGlobalTypePropertiesAdapter_Name;
	public static String JbpmFormalExpressionPropertiesAdapter_Actor;
	public static String JbpmFormalExpressionPropertiesAdapter_Expression;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
