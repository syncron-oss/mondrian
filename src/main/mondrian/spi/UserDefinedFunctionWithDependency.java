/*
// This software is subject to the terms of the Eclipse Public License v1.0
// Agreement, available at the following URL:
// http://www.eclipse.org/legal/epl-v10.html.
// You must accept the terms of that agreement to use this software.
//
// Copyright (C) 2005-2005 Julian Hyde
// Copyright (C) 2005-2009 Pentaho
// All Rights Reserved.
*/

package mondrian.spi;

import mondrian.olap.Hierarchy;

/**
 * {@link mondrian.calc.Calc#dependsOn}
 */
public interface UserDefinedFunctionWithDependency extends UserDefinedFunction {

	boolean dependsOn(Hierarchy hierarchy, ArgumentWithDependency[] arguments);

	interface ArgumentWithDependency extends Argument {

		boolean dependsOn(Hierarchy hierarchy);

		boolean scalarDependsOn(Hierarchy hierarchy);

		boolean listDependsOn(Hierarchy hierarchy);

		boolean iterableDependsOn(Hierarchy hierarchy);
	}
}