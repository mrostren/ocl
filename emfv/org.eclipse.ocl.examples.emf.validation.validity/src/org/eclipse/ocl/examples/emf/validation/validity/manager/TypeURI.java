/**
 * <copyright>
 *
 * Copyright (c) 2014 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 * </copyright>
 */
package org.eclipse.ocl.examples.emf.validation.validity.manager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;

/**
 * A TypeURI provides the unique identity of a Type which is a unique concept for type checking
 * but which may have multiple representations in the LH/RH panes of the Validity View.
 * <p>
 * The TypeURI is computed from the namespace URI.
 */
public final class TypeURI
{
	protected final @NonNull URI uri;
	
	public TypeURI(@NonNull URI uri) {
		this.uri = uri;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TypeURI)) {
			return false;
		}
		return uri.equals(((TypeURI)obj).uri);
	}

	@Override
	public int hashCode() {
		return uri.hashCode();
	}

	public String toString() {
		return uri.toString();
	}
}