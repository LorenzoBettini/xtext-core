/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.generator.trace;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.LanguageInfo;
import org.eclipse.xtext.util.ITextRegion;

/**
 * Describes the location in a given file or storage. 
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 * @since 2.3
 */
public interface ILocationInResource {
	
	/**
	 * @return the language that this resource belongs to.
	 */
	LanguageInfo getLanguage();
	
	/**
	 * @return the EMF resource URI for this location.
	 */
	URI getResourceURI();
	
	/**
	 * @return the more specific {@link org.eclipse.emf.ecore.EObject object} {@link URI}
	 * for this location. May be <code>null</code> if the resource itself is empty.
	 */
	URI getEObjectURI();
	
	/**
	 * @return the storage handle for this location. Never <code>null</code>.
	 */
	IStorage getStorage();
	
	/**
	 * @return the project for this location. Never <code>null</code>.
	 */
	IProject getProject();
	
	/**
	 * @return the range in the resource. May be <code>null</code>.
	 */
	ITextRegion getRange();
}