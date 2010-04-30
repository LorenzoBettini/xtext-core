/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.parsetree.reconstr.impl;

import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenMerger;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;

/**
 * TODO Moritz: convince me not to delete this
 * 
 * @author Moritz Eysholdt - Initial contribution and API
 */
@Deprecated
//merging of hidden tokens is now done by the org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor
public class AbstractHiddenTokenMerger implements IHiddenTokenMerger {

	public ITokenStream createHiddenTokenMerger(ITokenStream out, CompositeNode rootNode) {
		return null;
	}

}