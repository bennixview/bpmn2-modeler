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
package org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.validation;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.validation.messages"; //$NON-NLS-1$
	public static String BusinessRuleTaskConstraint_No_Ruleflow_Group;
	public static String CallActivityConstraint_No_Called_Element;
	public static String CallActivityConstraint_No_Process;
	public static String ProcessConstraint_No_Package_Name;
	public static String ProcessConstraint_No_Process_Name;
	public static String ProcessVariableNameConstraint_Duplicate_ID;
	public static String UserTaskConstraint_Internal_Error;
	public static String UserTaskConstraint_No_Form;
	public static String UserTaskConstraint_No_Name;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
