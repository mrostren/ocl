/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * This code is auto-generated
 * from: /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateOCLstdlib
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateOCLstdlib.mtl
 * invoked by: org.eclipse.ocl.examples.build.utilities.OCLstdlibCodeGenerator
 * from: org.eclipse.ocl.examples.build.GenerateOCLstdlibModel.mwe2
 *
 * Do not edit it.
 *
 * $Id$
 */
package	org.eclipse.ocl.examples.pivot.model;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.ocl.examples.pivot.*;
import org.eclipse.ocl.examples.pivot.Class;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;

/**
 * This is the http://www.eclipse.org/ocl/3.2.0/OCL.oclstdlib Standard Library
 * auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib.
 * It facilitates efficient library loading without the overheads of model reading.
 * <p>
 * This Standard Library may be registered as the definition of a Standard Library for
 * the OCL evaluation framework by invoking {@link #install}.
 * <p>
 * The Standard Library is normally activated when the TypeManager attempts
 * to locate a library type when its default Standard Library URI is the same
 * as this Standard Library.
 */
@SuppressWarnings("nls")
public class OCLstdlib extends XMLResourceImpl
{
	/**
	 *	The static package-of-types pivot model of the Standard Library.
	 */
	public static final OCLstdlib INSTANCE = new OCLstdlib();
	
	/**
	 *	The static library loader instance
	 */
	public static final Loader LOADER = new Loader();
	
	/**
	 *	The URI of this Standard Library.
	 */
	public static final String STDLIB_URI = "http://www.eclipse.org/ocl/3.2.0/OCL.oclstdlib";

	/**
	 * Install this library in the {@link StandardLibraryContribution#REGISTRY}.
	 * This method may be invoked by standalone applications to replicate
	 * the registration that should appear as a standard_library plugin
	 * extension when running within Eclipse. 
	 */
	public static void install() {
		StandardLibraryContribution.REGISTRY.put(STDLIB_URI, LOADER);
	}
	
	/**
	 * The Loader shares the Standard Library instance whenever this default library
	 * is loaded from the registry of Standard Libraries populated by the standard_library 
	 * extension point.
	 */
	public static class Loader implements StandardLibraryContribution
	{
		public StandardLibraryContribution getContribution() {
			return this;
		}
		
		public Resource getResource() {
			return INSTANCE;
		}
	}
	
	private OCLstdlib() {
		super(URI.createURI(STDLIB_URI));
		getContents().add(create());
	}

	/**
	 *	Create and return a package-of-packages-of-types pivot model of the OCL standard library.
	 *  This static definition auto-generated from /org.eclipse.ocl.examples.library/model/OCL-2.4.oclstdlib
	 *  is used as the default when no overriding copy is registered. 
	 */
	public static Library create()
	{
		Library symbol_0 = PivotFactory.eINSTANCE.createLibrary(); // $ocl
		Precedence symbol_1 = PivotFactory.eINSTANCE.createPrecedence(); // NAVIGATION
		Precedence symbol_2 = PivotFactory.eINSTANCE.createPrecedence(); // UNARY
		Precedence symbol_3 = PivotFactory.eINSTANCE.createPrecedence(); // MULTIPLICATIVE
		Precedence symbol_4 = PivotFactory.eINSTANCE.createPrecedence(); // ADDITIVE
		Precedence symbol_5 = PivotFactory.eINSTANCE.createPrecedence(); // RELATIONAL
		Precedence symbol_6 = PivotFactory.eINSTANCE.createPrecedence(); // EQUALITY
		Precedence symbol_7 = PivotFactory.eINSTANCE.createPrecedence(); // AND
		Precedence symbol_8 = PivotFactory.eINSTANCE.createPrecedence(); // OR
		Precedence symbol_9 = PivotFactory.eINSTANCE.createPrecedence(); // XOR
		Precedence symbol_10 = PivotFactory.eINSTANCE.createPrecedence(); // IMPLIES
		BagType symbol_11 = PivotFactory.eINSTANCE.createBagType(); // $ocl!Bag{T}
		TemplateSignature symbol_12 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Bag{T}!
		TypeTemplateParameter symbol_13 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_14 = PivotFactory.eINSTANCE.createClass(); // $ocl!Bag{T}?T
		
		TemplateSignature symbol_15 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Bag{T}!flatten{T2}()!
		TypeTemplateParameter symbol_16 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_17 = PivotFactory.eINSTANCE.createClass(); // $ocl!Bag{T}!flatten{T2}()?T2
		
		
		ClassifierType symbol_18 = PivotFactory.eINSTANCE.createClassifierType(); // $ocl!Classifier{T}
		TemplateSignature symbol_19 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Classifier{T}!
		TypeTemplateParameter symbol_20 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_21 = PivotFactory.eINSTANCE.createClass(); // $ocl!Classifier{T}?T
		
		TemplateSignature symbol_22 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Classifier{T}!oclContainer{U}()!
		TypeTemplateParameter symbol_23 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_24 = PivotFactory.eINSTANCE.createClass(); // $ocl!Classifier{T}!oclContainer{U}()?U
		
		TemplateSignature symbol_25 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Classifier{T}!oclContents{U}()!
		TypeTemplateParameter symbol_26 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_27 = PivotFactory.eINSTANCE.createClass(); // $ocl!Classifier{T}!oclContents{U}()?U
		
		
		CollectionType symbol_28 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection{T}
		TemplateSignature symbol_29 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Collection{T}!
		TypeTemplateParameter symbol_30 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_31 = PivotFactory.eINSTANCE.createClass(); // $ocl!Collection{T}?T
		
		TemplateSignature symbol_32 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Collection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_33 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_34 = PivotFactory.eINSTANCE.createClass(); // $ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_35 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_36 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_37 = PivotFactory.eINSTANCE.createClass(); // $ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_38 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])!
		TypeTemplateParameter symbol_39 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_40 = PivotFactory.eINSTANCE.createClass(); // $ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])?T2
		
		TemplateSignature symbol_41 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Collection{T}!flatten{T2}()!
		TypeTemplateParameter symbol_42 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_43 = PivotFactory.eINSTANCE.createClass(); // $ocl!Collection{T}!flatten{T2}()?T2
		
		TemplateSignature symbol_44 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])!
		TypeTemplateParameter symbol_45 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_46 = PivotFactory.eINSTANCE.createClass(); // $ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])?T2
		
		TemplateSignature symbol_47 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Collection{T}!iterate{Tacc}(T;Tacc)!
		TypeTemplateParameter symbol_48 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_49 = PivotFactory.eINSTANCE.createClass(); // $ocl!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
		
		TemplateSignature symbol_50 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Collection{T}!product{T2}($ocl!Collection[T2])!
		TypeTemplateParameter symbol_51 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_52 = PivotFactory.eINSTANCE.createClass(); // $ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2
		
		
		Class symbol_53 = PivotFactory.eINSTANCE.createClass(); // $ocl!Enumeration
		
		CollectionType symbol_54 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection{T}
		TemplateSignature symbol_55 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!NonOrderedCollection{T}!
		TypeTemplateParameter symbol_56 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_57 = PivotFactory.eINSTANCE.createClass(); // $ocl!NonOrderedCollection{T}?T
		
		TemplateSignature symbol_58 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_59 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_60 = PivotFactory.eINSTANCE.createClass(); // $ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_61 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_62 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_63 = PivotFactory.eINSTANCE.createClass(); // $ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		
		CollectionType symbol_64 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection{T}
		TemplateSignature symbol_65 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!NonUniqueCollection{T}!
		TypeTemplateParameter symbol_66 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_67 = PivotFactory.eINSTANCE.createClass(); // $ocl!NonUniqueCollection{T}?T
		
		
		AnyType symbol_68 = PivotFactory.eINSTANCE.createAnyType(); // $ocl!OclAny
		TemplateSignature symbol_69 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])!
		TypeTemplateParameter symbol_70 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_71 = PivotFactory.eINSTANCE.createClass(); // $ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])?TT
		
		TemplateSignature symbol_72 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])!
		TypeTemplateParameter symbol_73 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_74 = PivotFactory.eINSTANCE.createClass(); // $ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])?T
		
		TemplateSignature symbol_75 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])!
		TypeTemplateParameter symbol_76 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_77 = PivotFactory.eINSTANCE.createClass(); // $ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])?T
		
		
		InvalidType symbol_78 = PivotFactory.eINSTANCE.createInvalidType(); // $ocl!OclInvalid
		Property symbol_79 = PivotFactory.eINSTANCE.createProperty(); // ocl::OclInvalid::oclBadProperty $ocl!OclInvalid!oclBadProperty
		
		Class symbol_80 = PivotFactory.eINSTANCE.createClass(); // $ocl!OclMessage
		
		SelfType symbol_81 = PivotFactory.eINSTANCE.createSelfType(); // $ocl!OclSelf
		
		Class symbol_82 = PivotFactory.eINSTANCE.createClass(); // $ocl!OclState
		
		Class symbol_83 = PivotFactory.eINSTANCE.createClass(); // $ocl!OclTuple
		
		VoidType symbol_84 = PivotFactory.eINSTANCE.createVoidType(); // $ocl!OclVoid
		
		CollectionType symbol_85 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection{T}
		TemplateSignature symbol_86 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!OrderedCollection{T}!
		TypeTemplateParameter symbol_87 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_88 = PivotFactory.eINSTANCE.createClass(); // $ocl!OrderedCollection{T}?T
		
		TemplateSignature symbol_89 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_90 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_91 = PivotFactory.eINSTANCE.createClass(); // $ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		TemplateSignature symbol_92 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!
		TypeTemplateParameter symbol_93 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_94 = PivotFactory.eINSTANCE.createClass(); // $ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		
		OrderedSetType symbol_95 = PivotFactory.eINSTANCE.createOrderedSetType(); // $ocl!OrderedSet{T}
		TemplateSignature symbol_96 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!OrderedSet{T}!
		TypeTemplateParameter symbol_97 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_98 = PivotFactory.eINSTANCE.createClass(); // $ocl!OrderedSet{T}?T
		
		TemplateSignature symbol_99 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!OrderedSet{T}!flatten{T2}()!
		TypeTemplateParameter symbol_100 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_101 = PivotFactory.eINSTANCE.createClass(); // $ocl!OrderedSet{T}!flatten{T2}()?T2
		
		
		SequenceType symbol_102 = PivotFactory.eINSTANCE.createSequenceType(); // $ocl!Sequence{T}
		TemplateSignature symbol_103 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Sequence{T}!
		TypeTemplateParameter symbol_104 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_105 = PivotFactory.eINSTANCE.createClass(); // $ocl!Sequence{T}?T
		
		TemplateSignature symbol_106 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Sequence{T}!flatten{T2}()!
		TypeTemplateParameter symbol_107 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_108 = PivotFactory.eINSTANCE.createClass(); // $ocl!Sequence{T}!flatten{T2}()?T2
		
		
		SetType symbol_109 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set{T}
		TemplateSignature symbol_110 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Set{T}!
		TypeTemplateParameter symbol_111 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_112 = PivotFactory.eINSTANCE.createClass(); // $ocl!Set{T}?T
		
		TemplateSignature symbol_113 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!Set{T}!flatten{T2}()!
		TypeTemplateParameter symbol_114 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_115 = PivotFactory.eINSTANCE.createClass(); // $ocl!Set{T}!flatten{T2}()?T2
		
		
		TupleType symbol_116 = PivotFactory.eINSTANCE.createTupleType(); // $ocl!Tuple
		
		CollectionType symbol_117 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection{T}
		TemplateSignature symbol_118 = PivotFactory.eINSTANCE.createTemplateSignature(); // $ocl!UniqueCollection{T}!
		TypeTemplateParameter symbol_119 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_120 = PivotFactory.eINSTANCE.createClass(); // $ocl!UniqueCollection{T}?T
		
		
		PrimitiveType symbol_121 = PivotFactory.eINSTANCE.createPrimitiveType(); // Boolean
		
		PrimitiveType symbol_122 = PivotFactory.eINSTANCE.createPrimitiveType(); // Integer
		
		PrimitiveType symbol_123 = PivotFactory.eINSTANCE.createPrimitiveType(); // Real
		TemplateSignature symbol_124 = PivotFactory.eINSTANCE.createTemplateSignature(); // Real!oclAsType{TT}($ocl!Classifier[TT])!
		TypeTemplateParameter symbol_125 = PivotFactory.eINSTANCE.createTypeTemplateParameter();
		Class symbol_126 = PivotFactory.eINSTANCE.createClass(); // Real!oclAsType{TT}($ocl!Classifier[TT])?TT
		
		
		PrimitiveType symbol_127 = PivotFactory.eINSTANCE.createPrimitiveType(); // String
		
		PrimitiveType symbol_128 = PivotFactory.eINSTANCE.createPrimitiveType(); // UnlimitedNatural
		
		Package symbol_129 = PivotFactory.eINSTANCE.createPackage(); // $$
		Class symbol_130 = PivotFactory.eINSTANCE.createClass(); // $$!$$
		
		BagType symbol_131 = PivotFactory.eINSTANCE.createBagType(); // $ocl!Bag[$ocl!Bag{T}!flatten{T2}()?T2]
		
		BagType symbol_132 = PivotFactory.eINSTANCE.createBagType(); // $ocl!Bag[$ocl!Bag{T}?T]
		
		BagType symbol_133 = PivotFactory.eINSTANCE.createBagType(); // $ocl!Bag[$ocl!Collection{T}?T]
		
		BagType symbol_134 = PivotFactory.eINSTANCE.createBagType(); // $ocl!Bag[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		BagType symbol_135 = PivotFactory.eINSTANCE.createBagType(); // $ocl!Bag[$ocl!NonOrderedCollection{T}?T]
		
		ClassifierType symbol_136 = PivotFactory.eINSTANCE.createClassifierType(); // $ocl!Classifier[$ocl!Classifier{T}!oclContainer{U}()?U]
		
		ClassifierType symbol_137 = PivotFactory.eINSTANCE.createClassifierType(); // $ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]
		
		ClassifierType symbol_138 = PivotFactory.eINSTANCE.createClassifierType(); // $ocl!Classifier[$ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])?TT]
		
		ClassifierType symbol_139 = PivotFactory.eINSTANCE.createClassifierType(); // $ocl!Classifier[$ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])?T]
		
		ClassifierType symbol_140 = PivotFactory.eINSTANCE.createClassifierType(); // $ocl!Classifier[$ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])?T]
		
		ClassifierType symbol_141 = PivotFactory.eINSTANCE.createClassifierType(); // $ocl!Classifier[$ocl!OclSelf]
		
		ClassifierType symbol_142 = PivotFactory.eINSTANCE.createClassifierType(); // $ocl!Classifier[Real!oclAsType{TT}($ocl!Classifier[TT])?TT]
		
		CollectionType symbol_143 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_144 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Bag{T}?T]
		
		CollectionType symbol_145 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		
		CollectionType symbol_146 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_147 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])?T2]
		
		CollectionType symbol_148 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Collection{T}!flatten{T2}()?T2]
		
		CollectionType symbol_149 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])?T2]
		
		CollectionType symbol_150 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2]
		
		CollectionType symbol_151 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Collection{T}?T]
		
		CollectionType symbol_152 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_153 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!NonOrderedCollection{T}?T]
		
		CollectionType symbol_154 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!NonUniqueCollection{T}?T]
		
		CollectionType symbol_155 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!OclAny]
		
		CollectionType symbol_156 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!OclSelf]
		
		CollectionType symbol_157 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_158 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!OrderedCollection{T}?T]
		
		CollectionType symbol_159 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_160 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!OrderedSet{T}?T]
		
		CollectionType symbol_161 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_162 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Sequence{T}?T]
		
		CollectionType symbol_163 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_164 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!Set{T}?T]
		
		CollectionType symbol_165 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[$ocl!UniqueCollection{T}?T]
		
		CollectionType symbol_166 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[String]
		
		CollectionType symbol_167 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!Collection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		
		CollectionType symbol_168 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_169 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!Bag{T}?T]
		
		CollectionType symbol_170 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		
		CollectionType symbol_171 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!Collection{T}?T]
		
		CollectionType symbol_172 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_173 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!OclAny]
		
		CollectionType symbol_174 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!OclSelf]
		
		CollectionType symbol_175 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!OrderedSet{T}?T]
		
		CollectionType symbol_176 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_177 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[$ocl!Set{T}?T]
		
		CollectionType symbol_178 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonOrderedCollection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		
		CollectionType symbol_179 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!Bag{T}!flatten{T2}()?T2]
		
		CollectionType symbol_180 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!Bag{T}?T]
		
		CollectionType symbol_181 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!Collection{T}?T]
		
		CollectionType symbol_182 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_183 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!NonOrderedCollection{T}?T]
		
		CollectionType symbol_184 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_185 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!OrderedCollection{T}?T]
		
		CollectionType symbol_186 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_187 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[$ocl!Sequence{T}?T]
		
		CollectionType symbol_188 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!NonUniqueCollection[String]
		
		CollectionType symbol_189 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!Collection{T}?T]
		
		CollectionType symbol_190 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!NonUniqueCollection{T}?T]
		
		CollectionType symbol_191 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		CollectionType symbol_192 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!OrderedCollection{T}?T]
		
		CollectionType symbol_193 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_194 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!OrderedSet{T}?T]
		
		CollectionType symbol_195 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!Sequence{T}!flatten{T2}()?T2]
		
		CollectionType symbol_196 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!Sequence{T}?T]
		
		CollectionType symbol_197 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[$ocl!UniqueCollection{T}?T]
		
		CollectionType symbol_198 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!OrderedCollection[String]
		
		OrderedSetType symbol_199 = PivotFactory.eINSTANCE.createOrderedSetType(); // $ocl!OrderedSet[$ocl!Collection{T}?T]
		
		OrderedSetType symbol_200 = PivotFactory.eINSTANCE.createOrderedSetType(); // $ocl!OrderedSet[$ocl!OrderedCollection{T}?T]
		
		OrderedSetType symbol_201 = PivotFactory.eINSTANCE.createOrderedSetType(); // $ocl!OrderedSet[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		
		OrderedSetType symbol_202 = PivotFactory.eINSTANCE.createOrderedSetType(); // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
		
		OrderedSetType symbol_203 = PivotFactory.eINSTANCE.createOrderedSetType(); // $ocl!OrderedSet[$ocl!UniqueCollection{T}?T]
		
		SequenceType symbol_204 = PivotFactory.eINSTANCE.createSequenceType(); // $ocl!Sequence[$ocl!Collection{T}?T]
		
		SequenceType symbol_205 = PivotFactory.eINSTANCE.createSequenceType(); // $ocl!Sequence[$ocl!NonUniqueCollection{T}?T]
		
		SequenceType symbol_206 = PivotFactory.eINSTANCE.createSequenceType(); // $ocl!Sequence[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		
		SequenceType symbol_207 = PivotFactory.eINSTANCE.createSequenceType(); // $ocl!Sequence[$ocl!OrderedCollection{T}?T]
		
		SequenceType symbol_208 = PivotFactory.eINSTANCE.createSequenceType(); // $ocl!Sequence[$ocl!Sequence{T}!flatten{T2}()?T2]
		
		SequenceType symbol_209 = PivotFactory.eINSTANCE.createSequenceType(); // $ocl!Sequence[$ocl!Sequence{T}?T]
		
		SequenceType symbol_210 = PivotFactory.eINSTANCE.createSequenceType(); // $ocl!Sequence[String]
		
		SetType symbol_211 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		
		SetType symbol_212 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[$ocl!Collection{T}?T]
		
		SetType symbol_213 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[$ocl!NonOrderedCollection{T}?T]
		
		SetType symbol_214 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[$ocl!OclAny]
		
		SetType symbol_215 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[$ocl!OclSelf]
		
		SetType symbol_216 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[$ocl!OrderedSet{T}?T]
		
		SetType symbol_217 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[$ocl!Set{T}!flatten{T2}()?T2]
		
		SetType symbol_218 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[$ocl!Set{T}?T]
		
		SetType symbol_219 = PivotFactory.eINSTANCE.createSetType(); // $ocl!Set[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		
		CollectionType symbol_220 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		
		CollectionType symbol_221 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!Collection{T}?T]
		
		CollectionType symbol_222 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!NonOrderedCollection{T}?T]
		
		CollectionType symbol_223 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!OclAny]
		
		CollectionType symbol_224 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!OclSelf]
		
		CollectionType symbol_225 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!OrderedCollection{T}?T]
		
		CollectionType symbol_226 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		
		CollectionType symbol_227 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!OrderedSet{T}?T]
		
		CollectionType symbol_228 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!Set{T}!flatten{T2}()?T2]
		
		CollectionType symbol_229 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[$ocl!Set{T}?T]
		
		CollectionType symbol_230 = PivotFactory.eINSTANCE.createCollectionType(); // $ocl!UniqueCollection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		
		LambdaType symbol_231 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!Bag{T}?T()Boolean
		
		LambdaType symbol_232 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!Collection{T}?T()$ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_233 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!Collection{T}?T()$ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_234 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!Collection{T}?T()$ocl!OclAny
		
		LambdaType symbol_235 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!Collection{T}?T()Boolean
		
		LambdaType symbol_236 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_237 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_238 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!Set[T]
		
		LambdaType symbol_239 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!NonUniqueCollection{T}?T()$ocl!OclAny
		
		LambdaType symbol_240 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_241 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		
		LambdaType symbol_242 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedSet[T]
		
		LambdaType symbol_243 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!OrderedSet{T}?T()Boolean
		
		LambdaType symbol_244 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!Sequence{T}?T()Boolean
		
		LambdaType symbol_245 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!Set{T}?T()Boolean
		
		LambdaType symbol_246 = PivotFactory.eINSTANCE.createLambdaType(); // Lambda~$ocl!UniqueCollection{T}?T()$ocl!OclAny
		
		TupleType symbol_247 = PivotFactory.eINSTANCE.createTupleType(); // Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}
		Property symbol_248 = PivotFactory.eINSTANCE.createProperty(); // ocl::$$::Tuple::first Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}!first
		Property symbol_249 = PivotFactory.eINSTANCE.createProperty(); // ocl::$$::Tuple::second Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}!second
		
		

		symbol_0.setName("ocl");
		symbol_0.setMoniker("$ocl");
		symbol_0.setNsPrefix("ocl");
		symbol_0.setNsURI("http://www.eclipse.org/ocl/3.2.0/OCL.oclstdlib");
		symbol_1.setName("NAVIGATION");
		symbol_1.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_1);
		symbol_2.setName("UNARY");
		symbol_2.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_2);
		symbol_3.setName("MULTIPLICATIVE");
		symbol_3.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_3);
		symbol_4.setName("ADDITIVE");
		symbol_4.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_4);
		symbol_5.setName("RELATIONAL");
		symbol_5.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_5);
		symbol_6.setName("EQUALITY");
		symbol_6.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_6);
		symbol_7.setName("AND");
		symbol_7.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_7);
		symbol_8.setName("OR");
		symbol_8.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_8);
		symbol_9.setName("XOR");
		symbol_9.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_9);
		symbol_10.setName("IMPLIES");
		symbol_10.setAssociativity(AssociativityKind.LEFT);
		symbol_0.getOwnedPrecedences().add(symbol_10);
		//
		// ocl::Bag $ocl!Bag{T}
		//
		symbol_11.setName("Bag");
		//symbol_11.setMoniker("$ocl!Bag{T}");
		symbol_11.setElementType(symbol_14);
		symbol_14.setName("T");
		symbol_13.setOwnedParameteredElement(symbol_14);
		symbol_12.getOwnedParameters().add(symbol_13);
		
		symbol_11.setOwnedTemplateSignature(symbol_12);
		symbol_11.getSuperClasses().add(symbol_169); // $ocl!NonOrderedCollection[$ocl!Bag{T}?T]
		symbol_11.getSuperClasses().add(symbol_180); // $ocl!NonUniqueCollection[$ocl!Bag{T}?T]
		{	// ocl::Bag::<>() $ocl!Bag{T}!<>($ocl!OclSelf)
			Operation symbol_250 = PivotFactory.eINSTANCE.createOperation();
			symbol_250.setName("<>");
			//symbol_250.setMoniker("$ocl!Bag{T}!<>($ocl!OclSelf)");
			symbol_250.setType(symbol_121);  // Boolean
			
			Parameter symbol_251 = PivotFactory.eINSTANCE.createParameter();
			symbol_251.setName("object2");
			//symbol_251.setMoniker("$ocl!Bag{T}!<>($ocl!OclSelf)!object2");
			symbol_251.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_250.getOwnedParameters().add(symbol_251);
			symbol_250.setPrecedence(symbol_6);
			symbol_250.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_250.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_250);
		}
		{	// ocl::Bag::=() $ocl!Bag{T}!=($ocl!OclSelf)
			Operation symbol_252 = PivotFactory.eINSTANCE.createOperation();
			symbol_252.setName("=");
			//symbol_252.setMoniker("$ocl!Bag{T}!=($ocl!OclSelf)");
			symbol_252.setType(symbol_121);  // Boolean
			
			Parameter symbol_253 = PivotFactory.eINSTANCE.createParameter();
			symbol_253.setName("object2");
			//symbol_253.setMoniker("$ocl!Bag{T}!=($ocl!OclSelf)!object2");
			symbol_253.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_252.getOwnedParameters().add(symbol_253);
			symbol_252.setPrecedence(symbol_6);
			symbol_252.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_252.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_252);
		}
		{	// ocl::Bag::excluding() $ocl!Bag{T}!excluding($ocl!OclAny)
			Operation symbol_254 = PivotFactory.eINSTANCE.createOperation();
			symbol_254.setName("excluding");
			//symbol_254.setMoniker("$ocl!Bag{T}!excluding($ocl!OclAny)");
			symbol_254.setType(symbol_132);  // $ocl!Bag[$ocl!Bag{T}?T]
			
			Parameter symbol_255 = PivotFactory.eINSTANCE.createParameter();
			symbol_255.setName("object");
			//symbol_255.setMoniker("$ocl!Bag{T}!excluding($ocl!OclAny)!object");
			symbol_255.setType(symbol_68);  // $ocl!OclAny
			
			symbol_254.getOwnedParameters().add(symbol_255);
			symbol_254.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_254.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_254);
		}
		{	// ocl::Bag::flatten() $ocl!Bag{T}!flatten{T2}()
			Operation symbol_256 = PivotFactory.eINSTANCE.createOperation();
			symbol_17.setName("T2");
			symbol_16.setOwnedParameteredElement(symbol_17);
			symbol_15.getOwnedParameters().add(symbol_16);
			
			symbol_256.setOwnedTemplateSignature(symbol_15);
			symbol_256.setName("flatten");
			//symbol_256.setMoniker("$ocl!Bag{T}!flatten{T2}()");
			symbol_256.setType(symbol_131);  // $ocl!Bag[$ocl!Bag{T}!flatten{T2}()?T2]
			
			symbol_256.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_256.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_256);
		}
		{	// ocl::Bag::including() $ocl!Bag{T}!including(T)
			Operation symbol_257 = PivotFactory.eINSTANCE.createOperation();
			symbol_257.setName("including");
			//symbol_257.setMoniker("$ocl!Bag{T}!including(T)");
			symbol_257.setType(symbol_132);  // $ocl!Bag[$ocl!Bag{T}?T]
			
			Parameter symbol_258 = PivotFactory.eINSTANCE.createParameter();
			symbol_258.setName("object");
			//symbol_258.setMoniker("$ocl!Bag{T}!including(T)!object");
			symbol_258.setType(symbol_14);  // $ocl!Bag{T}?T
			
			symbol_257.getOwnedParameters().add(symbol_258);
			symbol_257.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_257.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_257);
		}
		{	// ocl::Bag::reject() $ocl!Bag{T}!reject(T|Lambda~T()Boolean)
			Iteration symbol_259 = PivotFactory.eINSTANCE.createIteration();
			symbol_259.setName("reject");
			//symbol_259.setMoniker("$ocl!Bag{T}!reject(T|Lambda~T()Boolean)");
			symbol_259.setType(symbol_132);  // $ocl!Bag[$ocl!Bag{T}?T]
			
			Parameter symbol_260 = PivotFactory.eINSTANCE.createParameter();
			symbol_260.setName("i");
			symbol_260.setType(symbol_14);  // $ocl!Bag{T}?T
			symbol_259.getOwnedIterators().add(symbol_260);
			Parameter symbol_261 = PivotFactory.eINSTANCE.createParameter();
			symbol_261.setName("body");
			//symbol_261.setMoniker("$ocl!Bag{T}!reject(T|Lambda~T()Boolean)!body");
			symbol_261.setType(symbol_231);  // Lambda~$ocl!Bag{T}?T()Boolean
			
			symbol_259.getOwnedParameters().add(symbol_261);
			symbol_259.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_259.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_259);
		}
		{	// ocl::Bag::select() $ocl!Bag{T}!select(T|Lambda~T()Boolean)
			Iteration symbol_262 = PivotFactory.eINSTANCE.createIteration();
			symbol_262.setName("select");
			//symbol_262.setMoniker("$ocl!Bag{T}!select(T|Lambda~T()Boolean)");
			symbol_262.setType(symbol_132);  // $ocl!Bag[$ocl!Bag{T}?T]
			
			Parameter symbol_263 = PivotFactory.eINSTANCE.createParameter();
			symbol_263.setName("i");
			symbol_263.setType(symbol_14);  // $ocl!Bag{T}?T
			symbol_262.getOwnedIterators().add(symbol_263);
			Parameter symbol_264 = PivotFactory.eINSTANCE.createParameter();
			symbol_264.setName("body");
			//symbol_264.setMoniker("$ocl!Bag{T}!select(T|Lambda~T()Boolean)!body");
			symbol_264.setType(symbol_231);  // Lambda~$ocl!Bag{T}?T()Boolean
			
			symbol_262.getOwnedParameters().add(symbol_264);
			symbol_262.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_262.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_11.getOwnedOperations().add(symbol_262);
		}
		symbol_0.getOwnedTypes().add(symbol_11);
		//
		// ocl::Classifier $ocl!Classifier{T}
		//
		symbol_18.setName("Classifier");
		//symbol_18.setMoniker("$ocl!Classifier{T}");
		symbol_18.setInstanceType(symbol_21);
		symbol_21.setName("T");
		symbol_20.setOwnedParameteredElement(symbol_21);
		symbol_19.getOwnedParameters().add(symbol_20);
		
		symbol_18.setOwnedTemplateSignature(symbol_19);
		symbol_18.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::Classifier::allInstances() $ocl!Classifier{T}!allInstances()
			Operation symbol_265 = PivotFactory.eINSTANCE.createOperation();
			symbol_265.setName("allInstances");
			//symbol_265.setMoniker("$ocl!Classifier{T}!allInstances()");
			symbol_265.setType(symbol_215);  // $ocl!Set[$ocl!OclSelf]
			
			symbol_265.setIsStatic(true);
			symbol_265.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation");
			symbol_265.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
			symbol_18.getOwnedOperations().add(symbol_265);
		}
		{	// ocl::Classifier::oclContainer() $ocl!Classifier{T}!oclContainer{U}()
			Operation symbol_266 = PivotFactory.eINSTANCE.createOperation();
			symbol_24.setName("U");
			symbol_23.setOwnedParameteredElement(symbol_24);
			symbol_22.getOwnedParameters().add(symbol_23);
			
			symbol_266.setOwnedTemplateSignature(symbol_22);
			symbol_266.setName("oclContainer");
			//symbol_266.setMoniker("$ocl!Classifier{T}!oclContainer{U}()");
			symbol_266.setType(symbol_136);  // $ocl!Classifier[$ocl!Classifier{T}!oclContainer{U}()?U]
			
			symbol_266.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation");
			symbol_266.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
			symbol_18.getOwnedOperations().add(symbol_266);
		}
		{	// ocl::Classifier::oclContents() $ocl!Classifier{T}!oclContents{U}()
			Operation symbol_267 = PivotFactory.eINSTANCE.createOperation();
			symbol_27.setName("U");
			symbol_26.setOwnedParameteredElement(symbol_27);
			symbol_25.getOwnedParameters().add(symbol_26);
			
			symbol_267.setOwnedTemplateSignature(symbol_25);
			symbol_267.setName("oclContents");
			//symbol_267.setMoniker("$ocl!Classifier{T}!oclContents{U}()");
			symbol_267.setType(symbol_211);  // $ocl!Set[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
			
			symbol_267.setImplementationClass("org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation");
			symbol_267.setImplementation(org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
			symbol_18.getOwnedOperations().add(symbol_267);
		}
		symbol_0.getOwnedTypes().add(symbol_18);
		//
		// ocl::Collection $ocl!Collection{T}
		//
		symbol_28.setName("Collection");
		//symbol_28.setMoniker("$ocl!Collection{T}");
		symbol_28.setElementType(symbol_31);
		symbol_31.setName("T");
		symbol_30.setOwnedParameteredElement(symbol_31);
		symbol_29.getOwnedParameters().add(symbol_30);
		
		symbol_28.setOwnedTemplateSignature(symbol_29);
		symbol_28.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::Collection::<>() $ocl!Collection{T}!<>($ocl!OclSelf)
			Operation symbol_268 = PivotFactory.eINSTANCE.createOperation();
			symbol_268.setName("<>");
			//symbol_268.setMoniker("$ocl!Collection{T}!<>($ocl!OclSelf)");
			symbol_268.setType(symbol_121);  // Boolean
			
			Parameter symbol_269 = PivotFactory.eINSTANCE.createParameter();
			symbol_269.setName("object2");
			//symbol_269.setMoniker("$ocl!Collection{T}!<>($ocl!OclSelf)!object2");
			symbol_269.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_268.getOwnedParameters().add(symbol_269);
			symbol_268.setPrecedence(symbol_6);
			symbol_268.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_268.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_268);
		}
		{	// ocl::Collection::=() $ocl!Collection{T}!=($ocl!OclSelf)
			Operation symbol_270 = PivotFactory.eINSTANCE.createOperation();
			symbol_270.setName("=");
			//symbol_270.setMoniker("$ocl!Collection{T}!=($ocl!OclSelf)");
			symbol_270.setType(symbol_121);  // Boolean
			
			Parameter symbol_271 = PivotFactory.eINSTANCE.createParameter();
			symbol_271.setName("object2");
			//symbol_271.setMoniker("$ocl!Collection{T}!=($ocl!OclSelf)!object2");
			symbol_271.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_270.getOwnedParameters().add(symbol_271);
			symbol_270.setPrecedence(symbol_6);
			symbol_270.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_270.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_270);
		}
		{	// ocl::Collection::any() $ocl!Collection{T}!any(T|Lambda~T()Boolean)
			Iteration symbol_272 = PivotFactory.eINSTANCE.createIteration();
			symbol_272.setName("any");
			//symbol_272.setMoniker("$ocl!Collection{T}!any(T|Lambda~T()Boolean)");
			symbol_272.setType(symbol_31);  // $ocl!Collection{T}?T
			
			Parameter symbol_273 = PivotFactory.eINSTANCE.createParameter();
			symbol_273.setName("i");
			symbol_273.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_272.getOwnedIterators().add(symbol_273);
			Parameter symbol_274 = PivotFactory.eINSTANCE.createParameter();
			symbol_274.setName("body");
			//symbol_274.setMoniker("$ocl!Collection{T}!any(T|Lambda~T()Boolean)!body");
			symbol_274.setType(symbol_235);  // Lambda~$ocl!Collection{T}?T()Boolean
			
			symbol_272.getOwnedParameters().add(symbol_274);
			symbol_272.setImplementationClass("org.eclipse.ocl.examples.library.iterator.AnyIteration");
			symbol_272.setImplementation(org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_272);
		}
		{	// ocl::Collection::asBag() $ocl!Collection{T}!asBag()
			Operation symbol_275 = PivotFactory.eINSTANCE.createOperation();
			symbol_275.setName("asBag");
			//symbol_275.setMoniker("$ocl!Collection{T}!asBag()");
			symbol_275.setType(symbol_133);  // $ocl!Bag[$ocl!Collection{T}?T]
			
			symbol_275.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation");
			symbol_275.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_275);
		}
		{	// ocl::Collection::asOrderedSet() $ocl!Collection{T}!asOrderedSet()
			Operation symbol_276 = PivotFactory.eINSTANCE.createOperation();
			symbol_276.setName("asOrderedSet");
			//symbol_276.setMoniker("$ocl!Collection{T}!asOrderedSet()");
			symbol_276.setType(symbol_199);  // $ocl!OrderedSet[$ocl!Collection{T}?T]
			
			symbol_276.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation");
			symbol_276.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_276);
		}
		{	// ocl::Collection::asSequence() $ocl!Collection{T}!asSequence()
			Operation symbol_277 = PivotFactory.eINSTANCE.createOperation();
			symbol_277.setName("asSequence");
			//symbol_277.setMoniker("$ocl!Collection{T}!asSequence()");
			symbol_277.setType(symbol_204);  // $ocl!Sequence[$ocl!Collection{T}?T]
			
			symbol_277.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation");
			symbol_277.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_277);
		}
		{	// ocl::Collection::asSet() $ocl!Collection{T}!asSet()
			Operation symbol_278 = PivotFactory.eINSTANCE.createOperation();
			symbol_278.setName("asSet");
			//symbol_278.setMoniker("$ocl!Collection{T}!asSet()");
			symbol_278.setType(symbol_212);  // $ocl!Set[$ocl!Collection{T}?T]
			
			symbol_278.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation");
			symbol_278.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_278);
		}
		{	// ocl::Collection::collect() $ocl!Collection{T}!collect{V}(T|Lambda~T()V)
			Iteration symbol_279 = PivotFactory.eINSTANCE.createIteration();
			symbol_34.setName("V");
			symbol_33.setOwnedParameteredElement(symbol_34);
			symbol_32.getOwnedParameters().add(symbol_33);
			
			symbol_279.setOwnedTemplateSignature(symbol_32);
			symbol_279.setName("collect");
			//symbol_279.setMoniker("$ocl!Collection{T}!collect{V}(T|Lambda~T()V)");
			symbol_279.setType(symbol_146);  // $ocl!Collection[$ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_280 = PivotFactory.eINSTANCE.createParameter();
			symbol_280.setName("i");
			symbol_280.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_279.getOwnedIterators().add(symbol_280);
			Parameter symbol_281 = PivotFactory.eINSTANCE.createParameter();
			symbol_281.setName("body");
			//symbol_281.setMoniker("$ocl!Collection{T}!collect{V}(T|Lambda~T()V)!body");
			symbol_281.setType(symbol_233);  // Lambda~$ocl!Collection{T}?T()$ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_279.getOwnedParameters().add(symbol_281);
			symbol_279.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_279.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_279);
		}
		{	// ocl::Collection::collectNested() $ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)
			Iteration symbol_282 = PivotFactory.eINSTANCE.createIteration();
			symbol_37.setName("V");
			symbol_36.setOwnedParameteredElement(symbol_37);
			symbol_35.getOwnedParameters().add(symbol_36);
			
			symbol_282.setOwnedTemplateSignature(symbol_35);
			symbol_282.setName("collectNested");
			//symbol_282.setMoniker("$ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)");
			symbol_282.setType(symbol_151);  // $ocl!Collection[$ocl!Collection{T}?T]
			
			Parameter symbol_283 = PivotFactory.eINSTANCE.createParameter();
			symbol_283.setName("i");
			symbol_283.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_282.getOwnedIterators().add(symbol_283);
			Parameter symbol_284 = PivotFactory.eINSTANCE.createParameter();
			symbol_284.setName("body");
			//symbol_284.setMoniker("$ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)!body");
			symbol_284.setType(symbol_232);  // Lambda~$ocl!Collection{T}?T()$ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_282.getOwnedParameters().add(symbol_284);
			symbol_282.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_282.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_282);
		}
		{	// ocl::Collection::count() $ocl!Collection{T}!count($ocl!OclAny)
			Operation symbol_285 = PivotFactory.eINSTANCE.createOperation();
			symbol_285.setName("count");
			//symbol_285.setMoniker("$ocl!Collection{T}!count($ocl!OclAny)");
			symbol_285.setType(symbol_122);  // Integer
			
			Parameter symbol_286 = PivotFactory.eINSTANCE.createParameter();
			symbol_286.setName("object");
			//symbol_286.setMoniker("$ocl!Collection{T}!count($ocl!OclAny)!object");
			symbol_286.setType(symbol_68);  // $ocl!OclAny
			
			symbol_285.getOwnedParameters().add(symbol_286);
			symbol_285.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionCountOperation");
			symbol_285.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_285);
		}
		{	// ocl::Collection::excludes() $ocl!Collection{T}!excludes($ocl!OclAny)
			Operation symbol_287 = PivotFactory.eINSTANCE.createOperation();
			symbol_287.setName("excludes");
			//symbol_287.setMoniker("$ocl!Collection{T}!excludes($ocl!OclAny)");
			symbol_287.setType(symbol_121);  // Boolean
			
			Parameter symbol_288 = PivotFactory.eINSTANCE.createParameter();
			symbol_288.setName("object");
			//symbol_288.setMoniker("$ocl!Collection{T}!excludes($ocl!OclAny)!object");
			symbol_288.setType(symbol_68);  // $ocl!OclAny
			
			symbol_287.getOwnedParameters().add(symbol_288);
			symbol_287.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation");
			symbol_287.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_287);
		}
		{	// ocl::Collection::excludesAll() $ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])
			Operation symbol_289 = PivotFactory.eINSTANCE.createOperation();
			symbol_40.setName("T2");
			symbol_39.setOwnedParameteredElement(symbol_40);
			symbol_38.getOwnedParameters().add(symbol_39);
			
			symbol_289.setOwnedTemplateSignature(symbol_38);
			symbol_289.setName("excludesAll");
			//symbol_289.setMoniker("$ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])");
			symbol_289.setType(symbol_121);  // Boolean
			
			Parameter symbol_290 = PivotFactory.eINSTANCE.createParameter();
			symbol_290.setName("c2");
			//symbol_290.setMoniker("$ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])!c2");
			symbol_290.setType(symbol_147);  // $ocl!Collection[$ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])?T2]
			
			symbol_289.getOwnedParameters().add(symbol_290);
			symbol_289.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation");
			symbol_289.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_289);
		}
		{	// ocl::Collection::excluding() $ocl!Collection{T}!excluding($ocl!OclAny)
			Operation symbol_291 = PivotFactory.eINSTANCE.createOperation();
			symbol_291.setName("excluding");
			//symbol_291.setMoniker("$ocl!Collection{T}!excluding($ocl!OclAny)");
			symbol_291.setType(symbol_151);  // $ocl!Collection[$ocl!Collection{T}?T]
			
			Parameter symbol_292 = PivotFactory.eINSTANCE.createParameter();
			symbol_292.setName("object");
			//symbol_292.setMoniker("$ocl!Collection{T}!excluding($ocl!OclAny)!object");
			symbol_292.setType(symbol_68);  // $ocl!OclAny
			
			symbol_291.getOwnedParameters().add(symbol_292);
			symbol_291.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_291.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_291);
		}
		{	// ocl::Collection::exists() $ocl!Collection{T}!exists(T|Lambda~T()Boolean)
			Iteration symbol_293 = PivotFactory.eINSTANCE.createIteration();
			symbol_293.setName("exists");
			//symbol_293.setMoniker("$ocl!Collection{T}!exists(T|Lambda~T()Boolean)");
			symbol_293.setType(symbol_121);  // Boolean
			
			Parameter symbol_294 = PivotFactory.eINSTANCE.createParameter();
			symbol_294.setName("i");
			symbol_294.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_293.getOwnedIterators().add(symbol_294);
			Parameter symbol_295 = PivotFactory.eINSTANCE.createParameter();
			symbol_295.setName("body");
			//symbol_295.setMoniker("$ocl!Collection{T}!exists(T|Lambda~T()Boolean)!body");
			symbol_295.setType(symbol_235);  // Lambda~$ocl!Collection{T}?T()Boolean
			
			symbol_293.getOwnedParameters().add(symbol_295);
			symbol_293.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_293.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_293);
		}
		{	// ocl::Collection::exists() $ocl!Collection{T}!exists(T,T|Lambda~T()Boolean)
			Iteration symbol_296 = PivotFactory.eINSTANCE.createIteration();
			symbol_296.setName("exists");
			//symbol_296.setMoniker("$ocl!Collection{T}!exists(T,T|Lambda~T()Boolean)");
			symbol_296.setType(symbol_121);  // Boolean
			
			Parameter symbol_297 = PivotFactory.eINSTANCE.createParameter();
			symbol_297.setName("j");
			symbol_297.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_296.getOwnedIterators().add(symbol_297);
			Parameter symbol_298 = PivotFactory.eINSTANCE.createParameter();
			symbol_298.setName("i");
			symbol_298.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_296.getOwnedIterators().add(symbol_298);
			Parameter symbol_299 = PivotFactory.eINSTANCE.createParameter();
			symbol_299.setName("body");
			//symbol_299.setMoniker("$ocl!Collection{T}!exists(T,T|Lambda~T()Boolean)!body");
			symbol_299.setType(symbol_235);  // Lambda~$ocl!Collection{T}?T()Boolean
			
			symbol_296.getOwnedParameters().add(symbol_299);
			symbol_296.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ExistsIteration");
			symbol_296.setImplementation(org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_296);
		}
		{	// ocl::Collection::flatten() $ocl!Collection{T}!flatten{T2}()
			Operation symbol_300 = PivotFactory.eINSTANCE.createOperation();
			symbol_43.setName("T2");
			symbol_42.setOwnedParameteredElement(symbol_43);
			symbol_41.getOwnedParameters().add(symbol_42);
			
			symbol_300.setOwnedTemplateSignature(symbol_41);
			symbol_300.setName("flatten");
			//symbol_300.setMoniker("$ocl!Collection{T}!flatten{T2}()");
			symbol_300.setType(symbol_148);  // $ocl!Collection[$ocl!Collection{T}!flatten{T2}()?T2]
			
			symbol_300.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_300.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_300);
		}
		{	// ocl::Collection::forAll() $ocl!Collection{T}!forAll(T|Lambda~T()Boolean)
			Iteration symbol_301 = PivotFactory.eINSTANCE.createIteration();
			symbol_301.setName("forAll");
			//symbol_301.setMoniker("$ocl!Collection{T}!forAll(T|Lambda~T()Boolean)");
			symbol_301.setType(symbol_121);  // Boolean
			
			Parameter symbol_302 = PivotFactory.eINSTANCE.createParameter();
			symbol_302.setName("i");
			symbol_302.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_301.getOwnedIterators().add(symbol_302);
			Parameter symbol_303 = PivotFactory.eINSTANCE.createParameter();
			symbol_303.setName("body");
			//symbol_303.setMoniker("$ocl!Collection{T}!forAll(T|Lambda~T()Boolean)!body");
			symbol_303.setType(symbol_235);  // Lambda~$ocl!Collection{T}?T()Boolean
			
			symbol_301.getOwnedParameters().add(symbol_303);
			symbol_301.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_301.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_301);
		}
		{	// ocl::Collection::forAll() $ocl!Collection{T}!forAll(T,T|Lambda~T()Boolean)
			Iteration symbol_304 = PivotFactory.eINSTANCE.createIteration();
			symbol_304.setName("forAll");
			//symbol_304.setMoniker("$ocl!Collection{T}!forAll(T,T|Lambda~T()Boolean)");
			symbol_304.setType(symbol_121);  // Boolean
			
			Parameter symbol_305 = PivotFactory.eINSTANCE.createParameter();
			symbol_305.setName("i");
			symbol_305.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_304.getOwnedIterators().add(symbol_305);
			Parameter symbol_306 = PivotFactory.eINSTANCE.createParameter();
			symbol_306.setName("j");
			symbol_306.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_304.getOwnedIterators().add(symbol_306);
			Parameter symbol_307 = PivotFactory.eINSTANCE.createParameter();
			symbol_307.setName("body");
			//symbol_307.setMoniker("$ocl!Collection{T}!forAll(T,T|Lambda~T()Boolean)!body");
			symbol_307.setType(symbol_235);  // Lambda~$ocl!Collection{T}?T()Boolean
			
			symbol_304.getOwnedParameters().add(symbol_307);
			symbol_304.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ForAllIteration");
			symbol_304.setImplementation(org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_304);
		}
		{	// ocl::Collection::includes() $ocl!Collection{T}!includes($ocl!OclAny)
			Operation symbol_308 = PivotFactory.eINSTANCE.createOperation();
			symbol_308.setName("includes");
			//symbol_308.setMoniker("$ocl!Collection{T}!includes($ocl!OclAny)");
			symbol_308.setType(symbol_121);  // Boolean
			
			Parameter symbol_309 = PivotFactory.eINSTANCE.createParameter();
			symbol_309.setName("object");
			//symbol_309.setMoniker("$ocl!Collection{T}!includes($ocl!OclAny)!object");
			symbol_309.setType(symbol_68);  // $ocl!OclAny
			
			symbol_308.getOwnedParameters().add(symbol_309);
			symbol_308.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation");
			symbol_308.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_308);
		}
		{	// ocl::Collection::includesAll() $ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])
			Operation symbol_310 = PivotFactory.eINSTANCE.createOperation();
			symbol_46.setName("T2");
			symbol_45.setOwnedParameteredElement(symbol_46);
			symbol_44.getOwnedParameters().add(symbol_45);
			
			symbol_310.setOwnedTemplateSignature(symbol_44);
			symbol_310.setName("includesAll");
			//symbol_310.setMoniker("$ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])");
			symbol_310.setType(symbol_121);  // Boolean
			
			Parameter symbol_311 = PivotFactory.eINSTANCE.createParameter();
			symbol_311.setName("c2");
			//symbol_311.setMoniker("$ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])!c2");
			symbol_311.setType(symbol_149);  // $ocl!Collection[$ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])?T2]
			
			symbol_310.getOwnedParameters().add(symbol_311);
			symbol_310.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation");
			symbol_310.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_310);
		}
		{	// ocl::Collection::including() $ocl!Collection{T}!including(T)
			Operation symbol_312 = PivotFactory.eINSTANCE.createOperation();
			symbol_312.setName("including");
			//symbol_312.setMoniker("$ocl!Collection{T}!including(T)");
			symbol_312.setType(symbol_151);  // $ocl!Collection[$ocl!Collection{T}?T]
			
			Parameter symbol_313 = PivotFactory.eINSTANCE.createParameter();
			symbol_313.setName("object");
			//symbol_313.setMoniker("$ocl!Collection{T}!including(T)!object");
			symbol_313.setType(symbol_31);  // $ocl!Collection{T}?T
			
			symbol_312.getOwnedParameters().add(symbol_313);
			symbol_312.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_312.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_312);
		}
		{	// ocl::Collection::isEmpty() $ocl!Collection{T}!isEmpty()
			Operation symbol_314 = PivotFactory.eINSTANCE.createOperation();
			symbol_314.setName("isEmpty");
			//symbol_314.setMoniker("$ocl!Collection{T}!isEmpty()");
			symbol_314.setType(symbol_121);  // Boolean
			
			symbol_314.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation");
			symbol_314.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_314);
		}
		{	// ocl::Collection::isUnique() $ocl!Collection{T}!isUnique(T|Lambda~T()$ocl!OclAny)
			Iteration symbol_315 = PivotFactory.eINSTANCE.createIteration();
			symbol_315.setName("isUnique");
			//symbol_315.setMoniker("$ocl!Collection{T}!isUnique(T|Lambda~T()$ocl!OclAny)");
			symbol_315.setType(symbol_121);  // Boolean
			
			Parameter symbol_316 = PivotFactory.eINSTANCE.createParameter();
			symbol_316.setName("i");
			symbol_316.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_315.getOwnedIterators().add(symbol_316);
			Parameter symbol_317 = PivotFactory.eINSTANCE.createParameter();
			symbol_317.setName("body");
			//symbol_317.setMoniker("$ocl!Collection{T}!isUnique(T|Lambda~T()$ocl!OclAny)!body");
			symbol_317.setType(symbol_234);  // Lambda~$ocl!Collection{T}?T()$ocl!OclAny
			
			symbol_315.getOwnedParameters().add(symbol_317);
			symbol_315.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IsUniqueIteration");
			symbol_315.setImplementation(org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_315);
		}
		{	// ocl::Collection::iterate() $ocl!Collection{T}!iterate{Tacc}(T;Tacc)
			Iteration symbol_318 = PivotFactory.eINSTANCE.createIteration();
			symbol_49.setName("Tacc");
			symbol_48.setOwnedParameteredElement(symbol_49);
			symbol_47.getOwnedParameters().add(symbol_48);
			
			symbol_318.setOwnedTemplateSignature(symbol_47);
			symbol_318.setName("iterate");
			//symbol_318.setMoniker("$ocl!Collection{T}!iterate{Tacc}(T;Tacc)");
			symbol_318.setType(symbol_49);  // $ocl!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
			
			Parameter symbol_319 = PivotFactory.eINSTANCE.createParameter();
			symbol_319.setName("i");
			symbol_319.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_318.getOwnedIterators().add(symbol_319);
			Parameter symbol_320 = PivotFactory.eINSTANCE.createParameter();
			symbol_320.setName("acc");
			symbol_320.setType(symbol_49);  // $ocl!Collection{T}!iterate{Tacc}(T;Tacc)?Tacc
			symbol_318.getOwnedAccumulators().add(symbol_320);
			symbol_318.setImplementationClass("org.eclipse.ocl.examples.library.iterator.IterateIteration");
			symbol_318.setImplementation(org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_318);
		}
		{	// ocl::Collection::max() $ocl!Collection{T}!max()
			Operation symbol_321 = PivotFactory.eINSTANCE.createOperation();
			symbol_321.setName("max");
			//symbol_321.setMoniker("$ocl!Collection{T}!max()");
			symbol_321.setType(symbol_31);  // $ocl!Collection{T}?T
			
			symbol_321.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMaxOperation");
			symbol_321.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_321);
		}
		{	// ocl::Collection::min() $ocl!Collection{T}!min()
			Operation symbol_322 = PivotFactory.eINSTANCE.createOperation();
			symbol_322.setName("min");
			//symbol_322.setMoniker("$ocl!Collection{T}!min()");
			symbol_322.setType(symbol_31);  // $ocl!Collection{T}?T
			
			symbol_322.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionMinOperation");
			symbol_322.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_322);
		}
		{	// ocl::Collection::notEmpty() $ocl!Collection{T}!notEmpty()
			Operation symbol_323 = PivotFactory.eINSTANCE.createOperation();
			symbol_323.setName("notEmpty");
			//symbol_323.setMoniker("$ocl!Collection{T}!notEmpty()");
			symbol_323.setType(symbol_121);  // Boolean
			
			symbol_323.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation");
			symbol_323.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_323);
		}
		{	// ocl::Collection::one() $ocl!Collection{T}!one(T|Lambda~T()Boolean)
			Iteration symbol_324 = PivotFactory.eINSTANCE.createIteration();
			symbol_324.setName("one");
			//symbol_324.setMoniker("$ocl!Collection{T}!one(T|Lambda~T()Boolean)");
			symbol_324.setType(symbol_121);  // Boolean
			
			Parameter symbol_325 = PivotFactory.eINSTANCE.createParameter();
			symbol_325.setName("i");
			symbol_325.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_324.getOwnedIterators().add(symbol_325);
			Parameter symbol_326 = PivotFactory.eINSTANCE.createParameter();
			symbol_326.setName("body");
			//symbol_326.setMoniker("$ocl!Collection{T}!one(T|Lambda~T()Boolean)!body");
			symbol_326.setType(symbol_235);  // Lambda~$ocl!Collection{T}?T()Boolean
			
			symbol_324.getOwnedParameters().add(symbol_326);
			symbol_324.setImplementationClass("org.eclipse.ocl.examples.library.iterator.OneIteration");
			symbol_324.setImplementation(org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_324);
		}
		{	// ocl::Collection::product() $ocl!Collection{T}!product{T2}($ocl!Collection[T2])
			Operation symbol_327 = PivotFactory.eINSTANCE.createOperation();
			symbol_52.setName("T2");
			symbol_51.setOwnedParameteredElement(symbol_52);
			symbol_50.getOwnedParameters().add(symbol_51);
			
			symbol_327.setOwnedTemplateSignature(symbol_50);
			symbol_327.setName("product");
			//symbol_327.setMoniker("$ocl!Collection{T}!product{T2}($ocl!Collection[T2])");
			symbol_327.setType(symbol_219);  // $ocl!Set[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
			
			Parameter symbol_328 = PivotFactory.eINSTANCE.createParameter();
			symbol_328.setName("c2");
			//symbol_328.setMoniker("$ocl!Collection{T}!product{T2}($ocl!Collection[T2])!c2");
			symbol_328.setType(symbol_150);  // $ocl!Collection[$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2]
			
			symbol_327.getOwnedParameters().add(symbol_328);
			symbol_327.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionProductOperation");
			symbol_327.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_327);
		}
		{	// ocl::Collection::reject() $ocl!Collection{T}!reject(T|Lambda~T()Boolean)
			Iteration symbol_329 = PivotFactory.eINSTANCE.createIteration();
			symbol_329.setName("reject");
			//symbol_329.setMoniker("$ocl!Collection{T}!reject(T|Lambda~T()Boolean)");
			symbol_329.setType(symbol_151);  // $ocl!Collection[$ocl!Collection{T}?T]
			
			Parameter symbol_330 = PivotFactory.eINSTANCE.createParameter();
			symbol_330.setName("i");
			symbol_330.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_329.getOwnedIterators().add(symbol_330);
			Parameter symbol_331 = PivotFactory.eINSTANCE.createParameter();
			symbol_331.setName("body");
			//symbol_331.setMoniker("$ocl!Collection{T}!reject(T|Lambda~T()Boolean)!body");
			symbol_331.setType(symbol_235);  // Lambda~$ocl!Collection{T}?T()Boolean
			
			symbol_329.getOwnedParameters().add(symbol_331);
			symbol_329.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_329.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_329);
		}
		{	// ocl::Collection::select() $ocl!Collection{T}!select(T|Lambda~T()Boolean)
			Iteration symbol_332 = PivotFactory.eINSTANCE.createIteration();
			symbol_332.setName("select");
			//symbol_332.setMoniker("$ocl!Collection{T}!select(T|Lambda~T()Boolean)");
			symbol_332.setType(symbol_151);  // $ocl!Collection[$ocl!Collection{T}?T]
			
			Parameter symbol_333 = PivotFactory.eINSTANCE.createParameter();
			symbol_333.setName("i");
			symbol_333.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_332.getOwnedIterators().add(symbol_333);
			Parameter symbol_334 = PivotFactory.eINSTANCE.createParameter();
			symbol_334.setName("body");
			//symbol_334.setMoniker("$ocl!Collection{T}!select(T|Lambda~T()Boolean)!body");
			symbol_334.setType(symbol_235);  // Lambda~$ocl!Collection{T}?T()Boolean
			
			symbol_332.getOwnedParameters().add(symbol_334);
			symbol_332.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_332.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_332);
		}
		{	// ocl::Collection::size() $ocl!Collection{T}!size()
			Operation symbol_335 = PivotFactory.eINSTANCE.createOperation();
			symbol_335.setName("size");
			//symbol_335.setMoniker("$ocl!Collection{T}!size()");
			symbol_335.setType(symbol_122);  // Integer
			
			symbol_335.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSizeOperation");
			symbol_335.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_335);
		}
		{	// ocl::Collection::sortedBy() $ocl!Collection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)
			Iteration symbol_336 = PivotFactory.eINSTANCE.createIteration();
			symbol_336.setName("sortedBy");
			//symbol_336.setMoniker("$ocl!Collection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)");
			symbol_336.setType(symbol_189);  // $ocl!OrderedCollection[$ocl!Collection{T}?T]
			
			Parameter symbol_337 = PivotFactory.eINSTANCE.createParameter();
			symbol_337.setName("i");
			symbol_337.setType(symbol_31);  // $ocl!Collection{T}?T
			symbol_336.getOwnedIterators().add(symbol_337);
			Parameter symbol_338 = PivotFactory.eINSTANCE.createParameter();
			symbol_338.setName("body");
			//symbol_338.setMoniker("$ocl!Collection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)!body");
			symbol_338.setType(symbol_234);  // Lambda~$ocl!Collection{T}?T()$ocl!OclAny
			
			symbol_336.getOwnedParameters().add(symbol_338);
			symbol_336.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_336.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_336);
		}
		{	// ocl::Collection::sum() $ocl!Collection{T}!sum()
			Operation symbol_339 = PivotFactory.eINSTANCE.createOperation();
			symbol_339.setName("sum");
			//symbol_339.setMoniker("$ocl!Collection{T}!sum()");
			symbol_339.setType(symbol_31);  // $ocl!Collection{T}?T
			
			symbol_339.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionSumOperation");
			symbol_339.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
			symbol_28.getOwnedOperations().add(symbol_339);
		}
		symbol_0.getOwnedTypes().add(symbol_28);
		//
		// ocl::Enumeration $ocl!Enumeration
		//
		symbol_53.setName("Enumeration");
		//symbol_53.setMoniker("$ocl!Enumeration");
		symbol_53.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::Enumeration::allInstances() $ocl!Enumeration!allInstances()
			Operation symbol_340 = PivotFactory.eINSTANCE.createOperation();
			symbol_340.setName("allInstances");
			//symbol_340.setMoniker("$ocl!Enumeration!allInstances()");
			symbol_340.setType(symbol_215);  // $ocl!Set[$ocl!OclSelf]
			
			symbol_340.setIsStatic(true);
			symbol_340.setImplementationClass("org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation");
			symbol_340.setImplementation(org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
			symbol_53.getOwnedOperations().add(symbol_340);
		}
		symbol_0.getOwnedTypes().add(symbol_53);
		//
		// ocl::NonOrderedCollection $ocl!NonOrderedCollection{T}
		//
		symbol_54.setName("NonOrderedCollection");
		//symbol_54.setMoniker("$ocl!NonOrderedCollection{T}");
		symbol_54.setElementType(symbol_57);
		symbol_57.setName("T");
		symbol_56.setOwnedParameteredElement(symbol_57);
		symbol_55.getOwnedParameters().add(symbol_56);
		
		symbol_54.setOwnedTemplateSignature(symbol_55);
		symbol_54.getSuperClasses().add(symbol_153); // $ocl!Collection[$ocl!NonOrderedCollection{T}?T]
		{	// ocl::NonOrderedCollection::closure() $ocl!NonOrderedCollection{T}!closure(T|Lambda~T()$ocl!Set[T])
			Iteration symbol_341 = PivotFactory.eINSTANCE.createIteration();
			symbol_341.setName("closure");
			//symbol_341.setMoniker("$ocl!NonOrderedCollection{T}!closure(T|Lambda~T()$ocl!Set[T])");
			symbol_341.setType(symbol_213);  // $ocl!Set[$ocl!NonOrderedCollection{T}?T]
			
			Parameter symbol_342 = PivotFactory.eINSTANCE.createParameter();
			symbol_342.setName("i");
			symbol_342.setType(symbol_57);  // $ocl!NonOrderedCollection{T}?T
			symbol_341.getOwnedIterators().add(symbol_342);
			Parameter symbol_343 = PivotFactory.eINSTANCE.createParameter();
			symbol_343.setName("body");
			//symbol_343.setMoniker("$ocl!NonOrderedCollection{T}!closure(T|Lambda~T()$ocl!Set[T])!body");
			symbol_343.setType(symbol_238);  // Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!Set[T]
			
			symbol_341.getOwnedParameters().add(symbol_343);
			symbol_341.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_341.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_341);
		}
		{	// ocl::NonOrderedCollection::collect() $ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)
			Iteration symbol_344 = PivotFactory.eINSTANCE.createIteration();
			symbol_60.setName("V");
			symbol_59.setOwnedParameteredElement(symbol_60);
			symbol_58.getOwnedParameters().add(symbol_59);
			
			symbol_344.setOwnedTemplateSignature(symbol_58);
			symbol_344.setName("collect");
			//symbol_344.setMoniker("$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)");
			symbol_344.setType(symbol_134);  // $ocl!Bag[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_345 = PivotFactory.eINSTANCE.createParameter();
			symbol_345.setName("i");
			symbol_345.setType(symbol_57);  // $ocl!NonOrderedCollection{T}?T
			symbol_344.getOwnedIterators().add(symbol_345);
			Parameter symbol_346 = PivotFactory.eINSTANCE.createParameter();
			symbol_346.setName("body");
			//symbol_346.setMoniker("$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)!body");
			symbol_346.setType(symbol_237);  // Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_344.getOwnedParameters().add(symbol_346);
			symbol_344.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_344.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_344);
		}
		{	// ocl::NonOrderedCollection::collectNested() $ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)
			Iteration symbol_347 = PivotFactory.eINSTANCE.createIteration();
			symbol_63.setName("V");
			symbol_62.setOwnedParameteredElement(symbol_63);
			symbol_61.getOwnedParameters().add(symbol_62);
			
			symbol_347.setOwnedTemplateSignature(symbol_61);
			symbol_347.setName("collectNested");
			//symbol_347.setMoniker("$ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)");
			symbol_347.setType(symbol_135);  // $ocl!Bag[$ocl!NonOrderedCollection{T}?T]
			
			Parameter symbol_348 = PivotFactory.eINSTANCE.createParameter();
			symbol_348.setName("i");
			symbol_348.setType(symbol_57);  // $ocl!NonOrderedCollection{T}?T
			symbol_347.getOwnedIterators().add(symbol_348);
			Parameter symbol_349 = PivotFactory.eINSTANCE.createParameter();
			symbol_349.setName("body");
			//symbol_349.setMoniker("$ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!body");
			symbol_349.setType(symbol_236);  // Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_347.getOwnedParameters().add(symbol_349);
			symbol_347.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_347.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_347);
		}
		{	// ocl::NonOrderedCollection::intersection() $ocl!NonOrderedCollection{T}!intersection($ocl!Bag[T])
			Operation symbol_350 = PivotFactory.eINSTANCE.createOperation();
			symbol_350.setName("intersection");
			//symbol_350.setMoniker("$ocl!NonOrderedCollection{T}!intersection($ocl!Bag[T])");
			symbol_350.setType(symbol_135);  // $ocl!Bag[$ocl!NonOrderedCollection{T}?T]
			
			Parameter symbol_351 = PivotFactory.eINSTANCE.createParameter();
			symbol_351.setName("bag");
			//symbol_351.setMoniker("$ocl!NonOrderedCollection{T}!intersection($ocl!Bag[T])!bag");
			symbol_351.setType(symbol_135);  // $ocl!Bag[$ocl!NonOrderedCollection{T}?T]
			
			symbol_350.getOwnedParameters().add(symbol_351);
			symbol_350.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_350.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_350);
		}
		{	// ocl::NonOrderedCollection::intersection() $ocl!NonOrderedCollection{T}!intersection($ocl!Set[T])
			Operation symbol_352 = PivotFactory.eINSTANCE.createOperation();
			symbol_352.setName("intersection");
			//symbol_352.setMoniker("$ocl!NonOrderedCollection{T}!intersection($ocl!Set[T])");
			symbol_352.setType(symbol_213);  // $ocl!Set[$ocl!NonOrderedCollection{T}?T]
			
			Parameter symbol_353 = PivotFactory.eINSTANCE.createParameter();
			symbol_353.setName("s");
			//symbol_353.setMoniker("$ocl!NonOrderedCollection{T}!intersection($ocl!Set[T])!s");
			symbol_353.setType(symbol_213);  // $ocl!Set[$ocl!NonOrderedCollection{T}?T]
			
			symbol_352.getOwnedParameters().add(symbol_353);
			symbol_352.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_352.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_352);
		}
		{	// ocl::NonOrderedCollection::union() $ocl!NonOrderedCollection{T}!union($ocl!Bag[T])
			Operation symbol_354 = PivotFactory.eINSTANCE.createOperation();
			symbol_354.setName("union");
			//symbol_354.setMoniker("$ocl!NonOrderedCollection{T}!union($ocl!Bag[T])");
			symbol_354.setType(symbol_135);  // $ocl!Bag[$ocl!NonOrderedCollection{T}?T]
			
			Parameter symbol_355 = PivotFactory.eINSTANCE.createParameter();
			symbol_355.setName("bag");
			//symbol_355.setMoniker("$ocl!NonOrderedCollection{T}!union($ocl!Bag[T])!bag");
			symbol_355.setType(symbol_135);  // $ocl!Bag[$ocl!NonOrderedCollection{T}?T]
			
			symbol_354.getOwnedParameters().add(symbol_355);
			symbol_354.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_354.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_354);
		}
		{	// ocl::NonOrderedCollection::union() $ocl!NonOrderedCollection{T}!union($ocl!Set[T])
			Operation symbol_356 = PivotFactory.eINSTANCE.createOperation();
			symbol_356.setName("union");
			//symbol_356.setMoniker("$ocl!NonOrderedCollection{T}!union($ocl!Set[T])");
			symbol_356.setType(symbol_213);  // $ocl!Set[$ocl!NonOrderedCollection{T}?T]
			
			Parameter symbol_357 = PivotFactory.eINSTANCE.createParameter();
			symbol_357.setName("s");
			//symbol_357.setMoniker("$ocl!NonOrderedCollection{T}!union($ocl!Set[T])!s");
			symbol_357.setType(symbol_213);  // $ocl!Set[$ocl!NonOrderedCollection{T}?T]
			
			symbol_356.getOwnedParameters().add(symbol_357);
			symbol_356.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_356.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_54.getOwnedOperations().add(symbol_356);
		}
		symbol_0.getOwnedTypes().add(symbol_54);
		//
		// ocl::NonUniqueCollection $ocl!NonUniqueCollection{T}
		//
		symbol_64.setName("NonUniqueCollection");
		//symbol_64.setMoniker("$ocl!NonUniqueCollection{T}");
		symbol_64.setElementType(symbol_67);
		symbol_67.setName("T");
		symbol_66.setOwnedParameteredElement(symbol_67);
		symbol_65.getOwnedParameters().add(symbol_66);
		
		symbol_64.setOwnedTemplateSignature(symbol_65);
		symbol_64.getSuperClasses().add(symbol_154); // $ocl!Collection[$ocl!NonUniqueCollection{T}?T]
		{	// ocl::NonUniqueCollection::sortedBy() $ocl!NonUniqueCollection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)
			Iteration symbol_358 = PivotFactory.eINSTANCE.createIteration();
			symbol_358.setName("sortedBy");
			//symbol_358.setMoniker("$ocl!NonUniqueCollection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)");
			symbol_358.setType(symbol_205);  // $ocl!Sequence[$ocl!NonUniqueCollection{T}?T]
			
			Parameter symbol_359 = PivotFactory.eINSTANCE.createParameter();
			symbol_359.setName("i");
			symbol_359.setType(symbol_67);  // $ocl!NonUniqueCollection{T}?T
			symbol_358.getOwnedIterators().add(symbol_359);
			Parameter symbol_360 = PivotFactory.eINSTANCE.createParameter();
			symbol_360.setName("body");
			//symbol_360.setMoniker("$ocl!NonUniqueCollection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)!body");
			symbol_360.setType(symbol_239);  // Lambda~$ocl!NonUniqueCollection{T}?T()$ocl!OclAny
			
			symbol_358.getOwnedParameters().add(symbol_360);
			symbol_358.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_358.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_64.getOwnedOperations().add(symbol_358);
		}
		symbol_0.getOwnedTypes().add(symbol_64);
		//
		// ocl::OclAny $ocl!OclAny
		//
		symbol_68.setName("OclAny");
		//symbol_68.setMoniker("$ocl!OclAny");
		{	// ocl::OclAny::<>() $ocl!OclAny!<>($ocl!OclSelf)
			Operation symbol_361 = PivotFactory.eINSTANCE.createOperation();
			symbol_361.setName("<>");
			//symbol_361.setMoniker("$ocl!OclAny!<>($ocl!OclSelf)");
			symbol_361.setType(symbol_121);  // Boolean
			
			Parameter symbol_362 = PivotFactory.eINSTANCE.createParameter();
			symbol_362.setName("object2");
			//symbol_362.setMoniker("$ocl!OclAny!<>($ocl!OclSelf)!object2");
			symbol_362.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_361.getOwnedParameters().add(symbol_362);
			symbol_361.setPrecedence(symbol_6);
			symbol_361.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_361.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_361);
		}
		{	// ocl::OclAny::=() $ocl!OclAny!=($ocl!OclSelf)
			Operation symbol_363 = PivotFactory.eINSTANCE.createOperation();
			symbol_363.setName("=");
			//symbol_363.setMoniker("$ocl!OclAny!=($ocl!OclSelf)");
			symbol_363.setType(symbol_121);  // Boolean
			
			Parameter symbol_364 = PivotFactory.eINSTANCE.createParameter();
			symbol_364.setName("object2");
			//symbol_364.setMoniker("$ocl!OclAny!=($ocl!OclSelf)!object2");
			symbol_364.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_363.getOwnedParameters().add(symbol_364);
			symbol_363.setPrecedence(symbol_6);
			symbol_363.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_363.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_363);
		}
		{	// ocl::OclAny::oclAsSet() $ocl!OclAny!oclAsSet()
			Operation symbol_365 = PivotFactory.eINSTANCE.createOperation();
			symbol_365.setName("oclAsSet");
			//symbol_365.setMoniker("$ocl!OclAny!oclAsSet()");
			symbol_365.setType(symbol_215);  // $ocl!Set[$ocl!OclSelf]
			
			symbol_365.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation");
			symbol_365.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_365);
		}
		{	// ocl::OclAny::oclAsType() $ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])
			Operation symbol_366 = PivotFactory.eINSTANCE.createOperation();
			symbol_71.setName("TT");
			symbol_70.setOwnedParameteredElement(symbol_71);
			symbol_69.getOwnedParameters().add(symbol_70);
			
			symbol_366.setOwnedTemplateSignature(symbol_69);
			symbol_366.setName("oclAsType");
			//symbol_366.setMoniker("$ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])");
			symbol_366.setType(symbol_71);  // $ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])?TT
			
			Parameter symbol_367 = PivotFactory.eINSTANCE.createParameter();
			symbol_367.setName("type");
			//symbol_367.setMoniker("$ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])!type");
			symbol_367.setType(symbol_138);  // $ocl!Classifier[$ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])?TT]
			
			symbol_366.getOwnedParameters().add(symbol_367);
			symbol_366.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation");
			symbol_366.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_366);
		}
		{	// ocl::OclAny::oclIsInState() $ocl!OclAny!oclIsInState($ocl!OclState)
			Operation symbol_368 = PivotFactory.eINSTANCE.createOperation();
			symbol_368.setName("oclIsInState");
			//symbol_368.setMoniker("$ocl!OclAny!oclIsInState($ocl!OclState)");
			symbol_368.setType(symbol_121);  // Boolean
			
			Parameter symbol_369 = PivotFactory.eINSTANCE.createParameter();
			symbol_369.setName("statespec");
			//symbol_369.setMoniker("$ocl!OclAny!oclIsInState($ocl!OclState)!statespec");
			symbol_369.setType(symbol_82);  // $ocl!OclState
			
			symbol_368.getOwnedParameters().add(symbol_369);
			symbol_368.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation");
			symbol_368.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_368);
		}
		{	// ocl::OclAny::oclIsInvalid() $ocl!OclAny!oclIsInvalid()
			Operation symbol_370 = PivotFactory.eINSTANCE.createOperation();
			symbol_370.setName("oclIsInvalid");
			//symbol_370.setMoniker("$ocl!OclAny!oclIsInvalid()");
			symbol_370.setType(symbol_121);  // Boolean
			
			symbol_370.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation");
			symbol_370.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_370);
		}
		{	// ocl::OclAny::oclIsKindOf() $ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])
			Operation symbol_371 = PivotFactory.eINSTANCE.createOperation();
			symbol_74.setName("T");
			symbol_73.setOwnedParameteredElement(symbol_74);
			symbol_72.getOwnedParameters().add(symbol_73);
			
			symbol_371.setOwnedTemplateSignature(symbol_72);
			symbol_371.setName("oclIsKindOf");
			//symbol_371.setMoniker("$ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])");
			symbol_371.setType(symbol_121);  // Boolean
			
			Parameter symbol_372 = PivotFactory.eINSTANCE.createParameter();
			symbol_372.setName("type");
			//symbol_372.setMoniker("$ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])!type");
			symbol_372.setType(symbol_139);  // $ocl!Classifier[$ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])?T]
			
			symbol_371.getOwnedParameters().add(symbol_372);
			symbol_371.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation");
			symbol_371.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_371);
		}
		{	// ocl::OclAny::oclIsNew() $ocl!OclAny!oclIsNew()
			Operation symbol_373 = PivotFactory.eINSTANCE.createOperation();
			symbol_373.setName("oclIsNew");
			//symbol_373.setMoniker("$ocl!OclAny!oclIsNew()");
			symbol_373.setType(symbol_121);  // Boolean
			
			symbol_373.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_373.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_373);
		}
		{	// ocl::OclAny::oclIsTypeOf() $ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])
			Operation symbol_374 = PivotFactory.eINSTANCE.createOperation();
			symbol_77.setName("T");
			symbol_76.setOwnedParameteredElement(symbol_77);
			symbol_75.getOwnedParameters().add(symbol_76);
			
			symbol_374.setOwnedTemplateSignature(symbol_75);
			symbol_374.setName("oclIsTypeOf");
			//symbol_374.setMoniker("$ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])");
			symbol_374.setType(symbol_121);  // Boolean
			
			Parameter symbol_375 = PivotFactory.eINSTANCE.createParameter();
			symbol_375.setName("type");
			//symbol_375.setMoniker("$ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])!type");
			symbol_375.setType(symbol_140);  // $ocl!Classifier[$ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])?T]
			
			symbol_374.getOwnedParameters().add(symbol_375);
			symbol_374.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation");
			symbol_374.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_374);
		}
		{	// ocl::OclAny::oclIsUndefined() $ocl!OclAny!oclIsUndefined()
			Operation symbol_376 = PivotFactory.eINSTANCE.createOperation();
			symbol_376.setName("oclIsUndefined");
			//symbol_376.setMoniker("$ocl!OclAny!oclIsUndefined()");
			symbol_376.setType(symbol_121);  // Boolean
			
			symbol_376.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation");
			symbol_376.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_376);
		}
		{	// ocl::OclAny::oclType() $ocl!OclAny!oclType()
			Operation symbol_377 = PivotFactory.eINSTANCE.createOperation();
			symbol_377.setName("oclType");
			//symbol_377.setMoniker("$ocl!OclAny!oclType()");
			symbol_377.setType(symbol_141);  // $ocl!Classifier[$ocl!OclSelf]
			
			symbol_377.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation");
			symbol_377.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
			symbol_68.getOwnedOperations().add(symbol_377);
		}
		symbol_0.getOwnedTypes().add(symbol_68);
		//
		// ocl::OclInvalid $ocl!OclInvalid
		//
		symbol_78.setName("OclInvalid");
		//symbol_78.setMoniker("$ocl!OclInvalid");
		symbol_78.getSuperClasses().add(symbol_84); // $ocl!OclVoid
		{ // ocl::OclInvalid::oclBadProperty $ocl!OclInvalid!oclBadProperty
			symbol_79.setName("oclBadProperty");
			symbol_79.setType(symbol_78);  // $ocl!OclInvalid
			
			symbol_79.setIsResolveProxies(true);
			symbol_78.getOwnedAttributes().add(symbol_79);
		}
		{	// ocl::OclInvalid::<>() $ocl!OclInvalid!<>($ocl!OclSelf)
			Operation symbol_378 = PivotFactory.eINSTANCE.createOperation();
			symbol_378.setName("<>");
			//symbol_378.setMoniker("$ocl!OclInvalid!<>($ocl!OclSelf)");
			symbol_378.setType(symbol_121);  // Boolean
			
			Parameter symbol_379 = PivotFactory.eINSTANCE.createParameter();
			symbol_379.setName("object2");
			//symbol_379.setMoniker("$ocl!OclInvalid!<>($ocl!OclSelf)!object2");
			symbol_379.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_378.getOwnedParameters().add(symbol_379);
			symbol_378.setPrecedence(symbol_6);
			symbol_378.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_378.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_378);
		}
		{	// ocl::OclInvalid::=() $ocl!OclInvalid!=($ocl!OclSelf)
			Operation symbol_380 = PivotFactory.eINSTANCE.createOperation();
			symbol_380.setName("=");
			//symbol_380.setMoniker("$ocl!OclInvalid!=($ocl!OclSelf)");
			symbol_380.setType(symbol_121);  // Boolean
			
			Parameter symbol_381 = PivotFactory.eINSTANCE.createParameter();
			symbol_381.setName("object2");
			//symbol_381.setMoniker("$ocl!OclInvalid!=($ocl!OclSelf)!object2");
			symbol_381.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_380.getOwnedParameters().add(symbol_381);
			symbol_380.setPrecedence(symbol_6);
			symbol_380.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_380.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_380);
		}
		{	// ocl::OclInvalid::allInstances() $ocl!OclInvalid!allInstances()
			Operation symbol_382 = PivotFactory.eINSTANCE.createOperation();
			symbol_382.setName("allInstances");
			//symbol_382.setMoniker("$ocl!OclInvalid!allInstances()");
			symbol_382.setType(symbol_215);  // $ocl!Set[$ocl!OclSelf]
			
			symbol_382.setIsStatic(true);
			symbol_382.setImplementationClass("org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation");
			symbol_382.setImplementation(org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_382);
		}
		{	// ocl::OclInvalid::oclBadOperation() $ocl!OclInvalid!oclBadOperation()
			Operation symbol_383 = PivotFactory.eINSTANCE.createOperation();
			symbol_383.setName("oclBadOperation");
			//symbol_383.setMoniker("$ocl!OclInvalid!oclBadOperation()");
			symbol_383.setType(symbol_78);  // $ocl!OclInvalid
			
			symbol_78.getOwnedOperations().add(symbol_383);
		}
		{	// ocl::OclInvalid::toString() $ocl!OclInvalid!toString()
			Operation symbol_384 = PivotFactory.eINSTANCE.createOperation();
			symbol_384.setName("toString");
			//symbol_384.setMoniker("$ocl!OclInvalid!toString()");
			symbol_384.setType(symbol_127);  // String
			
			symbol_384.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_384.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_78.getOwnedOperations().add(symbol_384);
		}
		symbol_0.getOwnedTypes().add(symbol_78);
		//
		// ocl::OclMessage $ocl!OclMessage
		//
		symbol_80.setName("OclMessage");
		//symbol_80.setMoniker("$ocl!OclMessage");
		symbol_80.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::OclMessage::hasReturned() $ocl!OclMessage!hasReturned()
			Operation symbol_385 = PivotFactory.eINSTANCE.createOperation();
			symbol_385.setName("hasReturned");
			//symbol_385.setMoniker("$ocl!OclMessage!hasReturned()");
			symbol_385.setType(symbol_121);  // Boolean
			
			symbol_385.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_385.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_80.getOwnedOperations().add(symbol_385);
		}
		{	// ocl::OclMessage::isOperationCall() $ocl!OclMessage!isOperationCall()
			Operation symbol_386 = PivotFactory.eINSTANCE.createOperation();
			symbol_386.setName("isOperationCall");
			//symbol_386.setMoniker("$ocl!OclMessage!isOperationCall()");
			symbol_386.setType(symbol_121);  // Boolean
			
			symbol_386.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_386.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_80.getOwnedOperations().add(symbol_386);
		}
		{	// ocl::OclMessage::isSignalSent() $ocl!OclMessage!isSignalSent()
			Operation symbol_387 = PivotFactory.eINSTANCE.createOperation();
			symbol_387.setName("isSignalSent");
			//symbol_387.setMoniker("$ocl!OclMessage!isSignalSent()");
			symbol_387.setType(symbol_121);  // Boolean
			
			symbol_387.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_387.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_80.getOwnedOperations().add(symbol_387);
		}
		{	// ocl::OclMessage::result() $ocl!OclMessage!result()
			Operation symbol_388 = PivotFactory.eINSTANCE.createOperation();
			symbol_388.setName("result");
			//symbol_388.setMoniker("$ocl!OclMessage!result()");
			symbol_388.setType(symbol_68);  // $ocl!OclAny
			
			symbol_388.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation");
			symbol_388.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
			symbol_80.getOwnedOperations().add(symbol_388);
		}
		symbol_0.getOwnedTypes().add(symbol_80);
		//
		// ocl::OclSelf $ocl!OclSelf
		//
		symbol_81.setName("OclSelf");
		//symbol_81.setMoniker("$ocl!OclSelf");
		symbol_81.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_0.getOwnedTypes().add(symbol_81);
		//
		// ocl::OclState $ocl!OclState
		//
		symbol_82.setName("OclState");
		//symbol_82.setMoniker("$ocl!OclState");
		symbol_82.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_0.getOwnedTypes().add(symbol_82);
		//
		// ocl::OclTuple $ocl!OclTuple
		//
		symbol_83.setName("OclTuple");
		//symbol_83.setMoniker("$ocl!OclTuple");
		symbol_83.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::OclTuple::<>() $ocl!OclTuple!<>($ocl!OclSelf)
			Operation symbol_389 = PivotFactory.eINSTANCE.createOperation();
			symbol_389.setName("<>");
			//symbol_389.setMoniker("$ocl!OclTuple!<>($ocl!OclSelf)");
			symbol_389.setType(symbol_121);  // Boolean
			
			Parameter symbol_390 = PivotFactory.eINSTANCE.createParameter();
			symbol_390.setName("object2");
			//symbol_390.setMoniker("$ocl!OclTuple!<>($ocl!OclSelf)!object2");
			symbol_390.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_389.getOwnedParameters().add(symbol_390);
			symbol_389.setPrecedence(symbol_6);
			symbol_389.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_389.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_83.getOwnedOperations().add(symbol_389);
		}
		{	// ocl::OclTuple::=() $ocl!OclTuple!=($ocl!OclSelf)
			Operation symbol_391 = PivotFactory.eINSTANCE.createOperation();
			symbol_391.setName("=");
			//symbol_391.setMoniker("$ocl!OclTuple!=($ocl!OclSelf)");
			symbol_391.setType(symbol_121);  // Boolean
			
			Parameter symbol_392 = PivotFactory.eINSTANCE.createParameter();
			symbol_392.setName("object2");
			//symbol_392.setMoniker("$ocl!OclTuple!=($ocl!OclSelf)!object2");
			symbol_392.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_391.getOwnedParameters().add(symbol_392);
			symbol_391.setPrecedence(symbol_6);
			symbol_391.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_391.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_83.getOwnedOperations().add(symbol_391);
		}
		symbol_0.getOwnedTypes().add(symbol_83);
		//
		// ocl::OclVoid $ocl!OclVoid
		//
		symbol_84.setName("OclVoid");
		//symbol_84.setMoniker("$ocl!OclVoid");
		symbol_84.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::OclVoid::<>() $ocl!OclVoid!<>($ocl!OclSelf)
			Operation symbol_393 = PivotFactory.eINSTANCE.createOperation();
			symbol_393.setName("<>");
			//symbol_393.setMoniker("$ocl!OclVoid!<>($ocl!OclSelf)");
			symbol_393.setType(symbol_121);  // Boolean
			
			Parameter symbol_394 = PivotFactory.eINSTANCE.createParameter();
			symbol_394.setName("object2");
			//symbol_394.setMoniker("$ocl!OclVoid!<>($ocl!OclSelf)!object2");
			symbol_394.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_393.getOwnedParameters().add(symbol_394);
			symbol_393.setPrecedence(symbol_6);
			symbol_393.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_393.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_84.getOwnedOperations().add(symbol_393);
		}
		{	// ocl::OclVoid::=() $ocl!OclVoid!=($ocl!OclSelf)
			Operation symbol_395 = PivotFactory.eINSTANCE.createOperation();
			symbol_395.setName("=");
			//symbol_395.setMoniker("$ocl!OclVoid!=($ocl!OclSelf)");
			symbol_395.setType(symbol_121);  // Boolean
			
			Parameter symbol_396 = PivotFactory.eINSTANCE.createParameter();
			symbol_396.setName("object2");
			//symbol_396.setMoniker("$ocl!OclVoid!=($ocl!OclSelf)!object2");
			symbol_396.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_395.getOwnedParameters().add(symbol_396);
			symbol_395.setPrecedence(symbol_6);
			symbol_395.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_395.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_84.getOwnedOperations().add(symbol_395);
		}
		{	// ocl::OclVoid::allInstances() $ocl!OclVoid!allInstances()
			Operation symbol_397 = PivotFactory.eINSTANCE.createOperation();
			symbol_397.setName("allInstances");
			//symbol_397.setMoniker("$ocl!OclVoid!allInstances()");
			symbol_397.setType(symbol_215);  // $ocl!Set[$ocl!OclSelf]
			
			symbol_397.setIsStatic(true);
			symbol_397.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation");
			symbol_397.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
			symbol_84.getOwnedOperations().add(symbol_397);
		}
		{	// ocl::OclVoid::and() $ocl!OclVoid!and(Boolean)
			Operation symbol_398 = PivotFactory.eINSTANCE.createOperation();
			symbol_398.setName("and");
			//symbol_398.setMoniker("$ocl!OclVoid!and(Boolean)");
			symbol_398.setType(symbol_121);  // Boolean
			
			Parameter symbol_399 = PivotFactory.eINSTANCE.createParameter();
			symbol_399.setName("b");
			//symbol_399.setMoniker("$ocl!OclVoid!and(Boolean)!b");
			symbol_399.setType(symbol_121);  // Boolean
			
			symbol_398.getOwnedParameters().add(symbol_399);
			symbol_398.setPrecedence(symbol_7);
			symbol_398.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation");
			symbol_398.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
			symbol_84.getOwnedOperations().add(symbol_398);
		}
		{	// ocl::OclVoid::implies() $ocl!OclVoid!implies(Boolean)
			Operation symbol_400 = PivotFactory.eINSTANCE.createOperation();
			symbol_400.setName("implies");
			//symbol_400.setMoniker("$ocl!OclVoid!implies(Boolean)");
			symbol_400.setType(symbol_121);  // Boolean
			
			Parameter symbol_401 = PivotFactory.eINSTANCE.createParameter();
			symbol_401.setName("b");
			//symbol_401.setMoniker("$ocl!OclVoid!implies(Boolean)!b");
			symbol_401.setType(symbol_121);  // Boolean
			
			symbol_400.getOwnedParameters().add(symbol_401);
			symbol_400.setPrecedence(symbol_10);
			symbol_400.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation");
			symbol_400.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
			symbol_84.getOwnedOperations().add(symbol_400);
		}
		{	// ocl::OclVoid::or() $ocl!OclVoid!or(Boolean)
			Operation symbol_402 = PivotFactory.eINSTANCE.createOperation();
			symbol_402.setName("or");
			//symbol_402.setMoniker("$ocl!OclVoid!or(Boolean)");
			symbol_402.setType(symbol_121);  // Boolean
			
			Parameter symbol_403 = PivotFactory.eINSTANCE.createParameter();
			symbol_403.setName("b");
			//symbol_403.setMoniker("$ocl!OclVoid!or(Boolean)!b");
			symbol_403.setType(symbol_121);  // Boolean
			
			symbol_402.getOwnedParameters().add(symbol_403);
			symbol_402.setPrecedence(symbol_8);
			symbol_402.setImplementationClass("org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation");
			symbol_402.setImplementation(org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
			symbol_84.getOwnedOperations().add(symbol_402);
		}
		{	// ocl::OclVoid::toString() $ocl!OclVoid!toString()
			Operation symbol_404 = PivotFactory.eINSTANCE.createOperation();
			symbol_404.setName("toString");
			//symbol_404.setMoniker("$ocl!OclVoid!toString()");
			symbol_404.setType(symbol_127);  // String
			
			symbol_404.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_404.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_84.getOwnedOperations().add(symbol_404);
		}
		symbol_0.getOwnedTypes().add(symbol_84);
		//
		// ocl::OrderedCollection $ocl!OrderedCollection{T}
		//
		symbol_85.setName("OrderedCollection");
		//symbol_85.setMoniker("$ocl!OrderedCollection{T}");
		symbol_85.setElementType(symbol_88);
		symbol_88.setName("T");
		symbol_87.setOwnedParameteredElement(symbol_88);
		symbol_86.getOwnedParameters().add(symbol_87);
		
		symbol_85.setOwnedTemplateSignature(symbol_86);
		symbol_85.getSuperClasses().add(symbol_158); // $ocl!Collection[$ocl!OrderedCollection{T}?T]
		{	// ocl::OrderedCollection::at() $ocl!OrderedCollection{T}!at(Integer)
			Operation symbol_405 = PivotFactory.eINSTANCE.createOperation();
			symbol_405.setName("at");
			//symbol_405.setMoniker("$ocl!OrderedCollection{T}!at(Integer)");
			symbol_405.setType(symbol_88);  // $ocl!OrderedCollection{T}?T
			
			Parameter symbol_406 = PivotFactory.eINSTANCE.createParameter();
			symbol_406.setName("index");
			//symbol_406.setMoniker("$ocl!OrderedCollection{T}!at(Integer)!index");
			symbol_406.setType(symbol_122);  // Integer
			
			symbol_405.getOwnedParameters().add(symbol_406);
			symbol_405.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation");
			symbol_405.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_405);
		}
		{	// ocl::OrderedCollection::closure() $ocl!OrderedCollection{T}!closure(T|Lambda~T()$ocl!OrderedSet[T])
			Iteration symbol_407 = PivotFactory.eINSTANCE.createIteration();
			symbol_407.setName("closure");
			//symbol_407.setMoniker("$ocl!OrderedCollection{T}!closure(T|Lambda~T()$ocl!OrderedSet[T])");
			symbol_407.setType(symbol_200);  // $ocl!OrderedSet[$ocl!OrderedCollection{T}?T]
			
			Parameter symbol_408 = PivotFactory.eINSTANCE.createParameter();
			symbol_408.setName("i");
			symbol_408.setType(symbol_88);  // $ocl!OrderedCollection{T}?T
			symbol_407.getOwnedIterators().add(symbol_408);
			Parameter symbol_409 = PivotFactory.eINSTANCE.createParameter();
			symbol_409.setName("body");
			//symbol_409.setMoniker("$ocl!OrderedCollection{T}!closure(T|Lambda~T()$ocl!OrderedSet[T])!body");
			symbol_409.setType(symbol_242);  // Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedSet[T]
			
			symbol_407.getOwnedParameters().add(symbol_409);
			symbol_407.setImplementationClass("org.eclipse.ocl.examples.library.iterator.ClosureIteration");
			symbol_407.setImplementation(org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_407);
		}
		{	// ocl::OrderedCollection::collect() $ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)
			Iteration symbol_410 = PivotFactory.eINSTANCE.createIteration();
			symbol_91.setName("V");
			symbol_90.setOwnedParameteredElement(symbol_91);
			symbol_89.getOwnedParameters().add(symbol_90);
			
			symbol_410.setOwnedTemplateSignature(symbol_89);
			symbol_410.setName("collect");
			//symbol_410.setMoniker("$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)");
			symbol_410.setType(symbol_206);  // $ocl!Sequence[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
			
			Parameter symbol_411 = PivotFactory.eINSTANCE.createParameter();
			symbol_411.setName("i");
			symbol_411.setType(symbol_88);  // $ocl!OrderedCollection{T}?T
			symbol_410.getOwnedIterators().add(symbol_411);
			Parameter symbol_412 = PivotFactory.eINSTANCE.createParameter();
			symbol_412.setName("body");
			//symbol_412.setMoniker("$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)!body");
			symbol_412.setType(symbol_241);  // Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
			
			symbol_410.getOwnedParameters().add(symbol_412);
			symbol_410.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectIteration");
			symbol_410.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_410);
		}
		{	// ocl::OrderedCollection::collectNested() $ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)
			Iteration symbol_413 = PivotFactory.eINSTANCE.createIteration();
			symbol_94.setName("V");
			symbol_93.setOwnedParameteredElement(symbol_94);
			symbol_92.getOwnedParameters().add(symbol_93);
			
			symbol_413.setOwnedTemplateSignature(symbol_92);
			symbol_413.setName("collectNested");
			//symbol_413.setMoniker("$ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)");
			symbol_413.setType(symbol_207);  // $ocl!Sequence[$ocl!OrderedCollection{T}?T]
			
			Parameter symbol_414 = PivotFactory.eINSTANCE.createParameter();
			symbol_414.setName("i");
			symbol_414.setType(symbol_88);  // $ocl!OrderedCollection{T}?T
			symbol_413.getOwnedIterators().add(symbol_414);
			Parameter symbol_415 = PivotFactory.eINSTANCE.createParameter();
			symbol_415.setName("body");
			//symbol_415.setMoniker("$ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)!body");
			symbol_415.setType(symbol_240);  // Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
			
			symbol_413.getOwnedParameters().add(symbol_415);
			symbol_413.setImplementationClass("org.eclipse.ocl.examples.library.iterator.CollectNestedIteration");
			symbol_413.setImplementation(org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_413);
		}
		{	// ocl::OrderedCollection::first() $ocl!OrderedCollection{T}!first()
			Operation symbol_416 = PivotFactory.eINSTANCE.createOperation();
			symbol_416.setName("first");
			//symbol_416.setMoniker("$ocl!OrderedCollection{T}!first()");
			symbol_416.setType(symbol_88);  // $ocl!OrderedCollection{T}?T
			
			symbol_416.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation");
			symbol_416.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_416);
		}
		{	// ocl::OrderedCollection::indexOf() $ocl!OrderedCollection{T}!indexOf($ocl!OclAny)
			Operation symbol_417 = PivotFactory.eINSTANCE.createOperation();
			symbol_417.setName("indexOf");
			//symbol_417.setMoniker("$ocl!OrderedCollection{T}!indexOf($ocl!OclAny)");
			symbol_417.setType(symbol_122);  // Integer
			
			Parameter symbol_418 = PivotFactory.eINSTANCE.createParameter();
			symbol_418.setName("obj");
			//symbol_418.setMoniker("$ocl!OrderedCollection{T}!indexOf($ocl!OclAny)!obj");
			symbol_418.setType(symbol_68);  // $ocl!OclAny
			
			symbol_417.getOwnedParameters().add(symbol_418);
			symbol_417.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation");
			symbol_417.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_417);
		}
		{	// ocl::OrderedCollection::last() $ocl!OrderedCollection{T}!last()
			Operation symbol_419 = PivotFactory.eINSTANCE.createOperation();
			symbol_419.setName("last");
			//symbol_419.setMoniker("$ocl!OrderedCollection{T}!last()");
			symbol_419.setType(symbol_88);  // $ocl!OrderedCollection{T}?T
			
			symbol_419.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation");
			symbol_419.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_419);
		}
		{	// ocl::OrderedCollection::reverse() $ocl!OrderedCollection{T}!reverse()
			Operation symbol_420 = PivotFactory.eINSTANCE.createOperation();
			symbol_420.setName("reverse");
			//symbol_420.setMoniker("$ocl!OrderedCollection{T}!reverse()");
			symbol_420.setType(symbol_192);  // $ocl!OrderedCollection[$ocl!OrderedCollection{T}?T]
			
			symbol_420.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_420.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_85.getOwnedOperations().add(symbol_420);
		}
		symbol_0.getOwnedTypes().add(symbol_85);
		//
		// ocl::OrderedSet $ocl!OrderedSet{T}
		//
		symbol_95.setName("OrderedSet");
		//symbol_95.setMoniker("$ocl!OrderedSet{T}");
		symbol_95.setElementType(symbol_98);
		symbol_98.setName("T");
		symbol_97.setOwnedParameteredElement(symbol_98);
		symbol_96.getOwnedParameters().add(symbol_97);
		
		symbol_95.setOwnedTemplateSignature(symbol_96);
		symbol_95.getSuperClasses().add(symbol_194); // $ocl!OrderedCollection[$ocl!OrderedSet{T}?T]
		symbol_95.getSuperClasses().add(symbol_227); // $ocl!UniqueCollection[$ocl!OrderedSet{T}?T]
		{	// ocl::OrderedSet::-() $ocl!OrderedSet{T}!-($ocl!Set[$ocl!OclAny])
			Operation symbol_421 = PivotFactory.eINSTANCE.createOperation();
			symbol_421.setName("-");
			//symbol_421.setMoniker("$ocl!OrderedSet{T}!-($ocl!Set[$ocl!OclAny])");
			symbol_421.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_422 = PivotFactory.eINSTANCE.createParameter();
			symbol_422.setName("s");
			//symbol_422.setMoniker("$ocl!OrderedSet{T}!-($ocl!Set[$ocl!OclAny])!s");
			symbol_422.setType(symbol_214);  // $ocl!Set[$ocl!OclAny]
			
			symbol_421.getOwnedParameters().add(symbol_422);
			symbol_421.setPrecedence(symbol_4);
			symbol_421.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_421.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_421);
		}
		{	// ocl::OrderedSet::<>() $ocl!OrderedSet{T}!<>($ocl!OclSelf)
			Operation symbol_423 = PivotFactory.eINSTANCE.createOperation();
			symbol_423.setName("<>");
			//symbol_423.setMoniker("$ocl!OrderedSet{T}!<>($ocl!OclSelf)");
			symbol_423.setType(symbol_121);  // Boolean
			
			Parameter symbol_424 = PivotFactory.eINSTANCE.createParameter();
			symbol_424.setName("object2");
			//symbol_424.setMoniker("$ocl!OrderedSet{T}!<>($ocl!OclSelf)!object2");
			symbol_424.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_423.getOwnedParameters().add(symbol_424);
			symbol_423.setPrecedence(symbol_6);
			symbol_423.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_423.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_423);
		}
		{	// ocl::OrderedSet::=() $ocl!OrderedSet{T}!=($ocl!OclSelf)
			Operation symbol_425 = PivotFactory.eINSTANCE.createOperation();
			symbol_425.setName("=");
			//symbol_425.setMoniker("$ocl!OrderedSet{T}!=($ocl!OclSelf)");
			symbol_425.setType(symbol_121);  // Boolean
			
			Parameter symbol_426 = PivotFactory.eINSTANCE.createParameter();
			symbol_426.setName("object2");
			//symbol_426.setMoniker("$ocl!OrderedSet{T}!=($ocl!OclSelf)!object2");
			symbol_426.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_425.getOwnedParameters().add(symbol_426);
			symbol_425.setPrecedence(symbol_6);
			symbol_425.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_425.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_425);
		}
		{	// ocl::OrderedSet::append() $ocl!OrderedSet{T}!append(T)
			Operation symbol_427 = PivotFactory.eINSTANCE.createOperation();
			symbol_427.setName("append");
			//symbol_427.setMoniker("$ocl!OrderedSet{T}!append(T)");
			symbol_427.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_428 = PivotFactory.eINSTANCE.createParameter();
			symbol_428.setName("object");
			//symbol_428.setMoniker("$ocl!OrderedSet{T}!append(T)!object");
			symbol_428.setType(symbol_98);  // $ocl!OrderedSet{T}?T
			
			symbol_427.getOwnedParameters().add(symbol_428);
			symbol_427.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_427.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_427);
		}
		{	// ocl::OrderedSet::excluding() $ocl!OrderedSet{T}!excluding($ocl!OclAny)
			Operation symbol_429 = PivotFactory.eINSTANCE.createOperation();
			symbol_429.setName("excluding");
			//symbol_429.setMoniker("$ocl!OrderedSet{T}!excluding($ocl!OclAny)");
			symbol_429.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_430 = PivotFactory.eINSTANCE.createParameter();
			symbol_430.setName("object");
			//symbol_430.setMoniker("$ocl!OrderedSet{T}!excluding($ocl!OclAny)!object");
			symbol_430.setType(symbol_68);  // $ocl!OclAny
			
			symbol_429.getOwnedParameters().add(symbol_430);
			symbol_429.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_429.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_429);
		}
		{	// ocl::OrderedSet::flatten() $ocl!OrderedSet{T}!flatten{T2}()
			Operation symbol_431 = PivotFactory.eINSTANCE.createOperation();
			symbol_101.setName("T2");
			symbol_100.setOwnedParameteredElement(symbol_101);
			symbol_99.getOwnedParameters().add(symbol_100);
			
			symbol_431.setOwnedTemplateSignature(symbol_99);
			symbol_431.setName("flatten");
			//symbol_431.setMoniker("$ocl!OrderedSet{T}!flatten{T2}()");
			symbol_431.setType(symbol_201);  // $ocl!OrderedSet[$ocl!OrderedSet{T}!flatten{T2}()?T2]
			
			symbol_431.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_431.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_431);
		}
		{	// ocl::OrderedSet::including() $ocl!OrderedSet{T}!including(T)
			Operation symbol_432 = PivotFactory.eINSTANCE.createOperation();
			symbol_432.setName("including");
			//symbol_432.setMoniker("$ocl!OrderedSet{T}!including(T)");
			symbol_432.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_433 = PivotFactory.eINSTANCE.createParameter();
			symbol_433.setName("object");
			//symbol_433.setMoniker("$ocl!OrderedSet{T}!including(T)!object");
			symbol_433.setType(symbol_98);  // $ocl!OrderedSet{T}?T
			
			symbol_432.getOwnedParameters().add(symbol_433);
			symbol_432.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_432.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_432);
		}
		{	// ocl::OrderedSet::insertAt() $ocl!OrderedSet{T}!insertAt(Integer,T)
			Operation symbol_434 = PivotFactory.eINSTANCE.createOperation();
			symbol_434.setName("insertAt");
			//symbol_434.setMoniker("$ocl!OrderedSet{T}!insertAt(Integer,T)");
			symbol_434.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_435 = PivotFactory.eINSTANCE.createParameter();
			symbol_435.setName("index");
			//symbol_435.setMoniker("$ocl!OrderedSet{T}!insertAt(Integer,T)!index");
			symbol_435.setType(symbol_122);  // Integer
			
			symbol_434.getOwnedParameters().add(symbol_435);
			Parameter symbol_436 = PivotFactory.eINSTANCE.createParameter();
			symbol_436.setName("object");
			//symbol_436.setMoniker("$ocl!OrderedSet{T}!insertAt(Integer,T)!object");
			symbol_436.setType(symbol_98);  // $ocl!OrderedSet{T}?T
			
			symbol_434.getOwnedParameters().add(symbol_436);
			symbol_434.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_434.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_434);
		}
		{	// ocl::OrderedSet::intersection() $ocl!OrderedSet{T}!intersection($ocl!Set[T])
			Operation symbol_437 = PivotFactory.eINSTANCE.createOperation();
			symbol_437.setName("intersection");
			//symbol_437.setMoniker("$ocl!OrderedSet{T}!intersection($ocl!Set[T])");
			symbol_437.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_438 = PivotFactory.eINSTANCE.createParameter();
			symbol_438.setName("o");
			//symbol_438.setMoniker("$ocl!OrderedSet{T}!intersection($ocl!Set[T])!o");
			symbol_438.setType(symbol_216);  // $ocl!Set[$ocl!OrderedSet{T}?T]
			
			symbol_437.getOwnedParameters().add(symbol_438);
			symbol_437.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_437.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_437);
		}
		{	// ocl::OrderedSet::prepend() $ocl!OrderedSet{T}!prepend(T)
			Operation symbol_439 = PivotFactory.eINSTANCE.createOperation();
			symbol_439.setName("prepend");
			//symbol_439.setMoniker("$ocl!OrderedSet{T}!prepend(T)");
			symbol_439.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_440 = PivotFactory.eINSTANCE.createParameter();
			symbol_440.setName("object");
			//symbol_440.setMoniker("$ocl!OrderedSet{T}!prepend(T)!object");
			symbol_440.setType(symbol_98);  // $ocl!OrderedSet{T}?T
			
			symbol_439.getOwnedParameters().add(symbol_440);
			symbol_439.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_439.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_439);
		}
		{	// ocl::OrderedSet::reject() $ocl!OrderedSet{T}!reject(T|Lambda~T()Boolean)
			Iteration symbol_441 = PivotFactory.eINSTANCE.createIteration();
			symbol_441.setName("reject");
			//symbol_441.setMoniker("$ocl!OrderedSet{T}!reject(T|Lambda~T()Boolean)");
			symbol_441.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_442 = PivotFactory.eINSTANCE.createParameter();
			symbol_442.setName("i");
			symbol_442.setType(symbol_98);  // $ocl!OrderedSet{T}?T
			symbol_441.getOwnedIterators().add(symbol_442);
			Parameter symbol_443 = PivotFactory.eINSTANCE.createParameter();
			symbol_443.setName("body");
			//symbol_443.setMoniker("$ocl!OrderedSet{T}!reject(T|Lambda~T()Boolean)!body");
			symbol_443.setType(symbol_243);  // Lambda~$ocl!OrderedSet{T}?T()Boolean
			
			symbol_441.getOwnedParameters().add(symbol_443);
			symbol_441.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_441.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_441);
		}
		{	// ocl::OrderedSet::reverse() $ocl!OrderedSet{T}!reverse()
			Operation symbol_444 = PivotFactory.eINSTANCE.createOperation();
			symbol_444.setName("reverse");
			//symbol_444.setMoniker("$ocl!OrderedSet{T}!reverse()");
			symbol_444.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			symbol_444.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_444.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_444);
		}
		{	// ocl::OrderedSet::select() $ocl!OrderedSet{T}!select(T|Lambda~T()Boolean)
			Iteration symbol_445 = PivotFactory.eINSTANCE.createIteration();
			symbol_445.setName("select");
			//symbol_445.setMoniker("$ocl!OrderedSet{T}!select(T|Lambda~T()Boolean)");
			symbol_445.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_446 = PivotFactory.eINSTANCE.createParameter();
			symbol_446.setName("i");
			symbol_446.setType(symbol_98);  // $ocl!OrderedSet{T}?T
			symbol_445.getOwnedIterators().add(symbol_446);
			Parameter symbol_447 = PivotFactory.eINSTANCE.createParameter();
			symbol_447.setName("body");
			//symbol_447.setMoniker("$ocl!OrderedSet{T}!select(T|Lambda~T()Boolean)!body");
			symbol_447.setType(symbol_243);  // Lambda~$ocl!OrderedSet{T}?T()Boolean
			
			symbol_445.getOwnedParameters().add(symbol_447);
			symbol_445.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_445.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_445);
		}
		{	// ocl::OrderedSet::subOrderedSet() $ocl!OrderedSet{T}!subOrderedSet(Integer,Integer)
			Operation symbol_448 = PivotFactory.eINSTANCE.createOperation();
			symbol_448.setName("subOrderedSet");
			//symbol_448.setMoniker("$ocl!OrderedSet{T}!subOrderedSet(Integer,Integer)");
			symbol_448.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_449 = PivotFactory.eINSTANCE.createParameter();
			symbol_449.setName("lower");
			//symbol_449.setMoniker("$ocl!OrderedSet{T}!subOrderedSet(Integer,Integer)!lower");
			symbol_449.setType(symbol_122);  // Integer
			
			symbol_448.getOwnedParameters().add(symbol_449);
			Parameter symbol_450 = PivotFactory.eINSTANCE.createParameter();
			symbol_450.setName("upper");
			//symbol_450.setMoniker("$ocl!OrderedSet{T}!subOrderedSet(Integer,Integer)!upper");
			symbol_450.setType(symbol_122);  // Integer
			
			symbol_448.getOwnedParameters().add(symbol_450);
			symbol_448.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation");
			symbol_448.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_448);
		}
		{	// ocl::OrderedSet::symmetricDifference() $ocl!OrderedSet{T}!symmetricDifference($ocl!Set[$ocl!OclAny])
			Operation symbol_451 = PivotFactory.eINSTANCE.createOperation();
			symbol_451.setName("symmetricDifference");
			//symbol_451.setMoniker("$ocl!OrderedSet{T}!symmetricDifference($ocl!Set[$ocl!OclAny])");
			symbol_451.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_452 = PivotFactory.eINSTANCE.createParameter();
			symbol_452.setName("s");
			//symbol_452.setMoniker("$ocl!OrderedSet{T}!symmetricDifference($ocl!Set[$ocl!OclAny])!s");
			symbol_452.setType(symbol_214);  // $ocl!Set[$ocl!OclAny]
			
			symbol_451.getOwnedParameters().add(symbol_452);
			symbol_451.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_451.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_451);
		}
		{	// ocl::OrderedSet::union() $ocl!OrderedSet{T}!union($ocl!OrderedSet[T])
			Operation symbol_453 = PivotFactory.eINSTANCE.createOperation();
			symbol_453.setName("union");
			//symbol_453.setMoniker("$ocl!OrderedSet{T}!union($ocl!OrderedSet[T])");
			symbol_453.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_454 = PivotFactory.eINSTANCE.createParameter();
			symbol_454.setName("o");
			//symbol_454.setMoniker("$ocl!OrderedSet{T}!union($ocl!OrderedSet[T])!o");
			symbol_454.setType(symbol_202);  // $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
			
			symbol_453.getOwnedParameters().add(symbol_454);
			symbol_453.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_453.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_453);
		}
		{	// ocl::OrderedSet::union() $ocl!OrderedSet{T}!union($ocl!Set[T])
			Operation symbol_455 = PivotFactory.eINSTANCE.createOperation();
			symbol_455.setName("union");
			//symbol_455.setMoniker("$ocl!OrderedSet{T}!union($ocl!Set[T])");
			symbol_455.setType(symbol_216);  // $ocl!Set[$ocl!OrderedSet{T}?T]
			
			Parameter symbol_456 = PivotFactory.eINSTANCE.createParameter();
			symbol_456.setName("s");
			//symbol_456.setMoniker("$ocl!OrderedSet{T}!union($ocl!Set[T])!s");
			symbol_456.setType(symbol_216);  // $ocl!Set[$ocl!OrderedSet{T}?T]
			
			symbol_455.getOwnedParameters().add(symbol_456);
			symbol_455.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_455.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_95.getOwnedOperations().add(symbol_455);
		}
		symbol_0.getOwnedTypes().add(symbol_95);
		//
		// ocl::Sequence $ocl!Sequence{T}
		//
		symbol_102.setName("Sequence");
		//symbol_102.setMoniker("$ocl!Sequence{T}");
		symbol_102.setElementType(symbol_105);
		symbol_105.setName("T");
		symbol_104.setOwnedParameteredElement(symbol_105);
		symbol_103.getOwnedParameters().add(symbol_104);
		
		symbol_102.setOwnedTemplateSignature(symbol_103);
		symbol_102.getSuperClasses().add(symbol_187); // $ocl!NonUniqueCollection[$ocl!Sequence{T}?T]
		symbol_102.getSuperClasses().add(symbol_196); // $ocl!OrderedCollection[$ocl!Sequence{T}?T]
		{	// ocl::Sequence::<>() $ocl!Sequence{T}!<>($ocl!OclSelf)
			Operation symbol_457 = PivotFactory.eINSTANCE.createOperation();
			symbol_457.setName("<>");
			//symbol_457.setMoniker("$ocl!Sequence{T}!<>($ocl!OclSelf)");
			symbol_457.setType(symbol_121);  // Boolean
			
			Parameter symbol_458 = PivotFactory.eINSTANCE.createParameter();
			symbol_458.setName("object2");
			//symbol_458.setMoniker("$ocl!Sequence{T}!<>($ocl!OclSelf)!object2");
			symbol_458.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_457.getOwnedParameters().add(symbol_458);
			symbol_457.setPrecedence(symbol_6);
			symbol_457.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_457.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_457);
		}
		{	// ocl::Sequence::=() $ocl!Sequence{T}!=($ocl!OclSelf)
			Operation symbol_459 = PivotFactory.eINSTANCE.createOperation();
			symbol_459.setName("=");
			//symbol_459.setMoniker("$ocl!Sequence{T}!=($ocl!OclSelf)");
			symbol_459.setType(symbol_121);  // Boolean
			
			Parameter symbol_460 = PivotFactory.eINSTANCE.createParameter();
			symbol_460.setName("object2");
			//symbol_460.setMoniker("$ocl!Sequence{T}!=($ocl!OclSelf)!object2");
			symbol_460.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_459.getOwnedParameters().add(symbol_460);
			symbol_459.setPrecedence(symbol_6);
			symbol_459.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_459.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_459);
		}
		{	// ocl::Sequence::append() $ocl!Sequence{T}!append(T)
			Operation symbol_461 = PivotFactory.eINSTANCE.createOperation();
			symbol_461.setName("append");
			//symbol_461.setMoniker("$ocl!Sequence{T}!append(T)");
			symbol_461.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_462 = PivotFactory.eINSTANCE.createParameter();
			symbol_462.setName("object");
			//symbol_462.setMoniker("$ocl!Sequence{T}!append(T)!object");
			symbol_462.setType(symbol_105);  // $ocl!Sequence{T}?T
			
			symbol_461.getOwnedParameters().add(symbol_462);
			symbol_461.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation");
			symbol_461.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_461);
		}
		{	// ocl::Sequence::excluding() $ocl!Sequence{T}!excluding($ocl!OclAny)
			Operation symbol_463 = PivotFactory.eINSTANCE.createOperation();
			symbol_463.setName("excluding");
			//symbol_463.setMoniker("$ocl!Sequence{T}!excluding($ocl!OclAny)");
			symbol_463.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_464 = PivotFactory.eINSTANCE.createParameter();
			symbol_464.setName("object");
			//symbol_464.setMoniker("$ocl!Sequence{T}!excluding($ocl!OclAny)!object");
			symbol_464.setType(symbol_68);  // $ocl!OclAny
			
			symbol_463.getOwnedParameters().add(symbol_464);
			symbol_463.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_463.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_463);
		}
		{	// ocl::Sequence::flatten() $ocl!Sequence{T}!flatten{T2}()
			Operation symbol_465 = PivotFactory.eINSTANCE.createOperation();
			symbol_108.setName("T2");
			symbol_107.setOwnedParameteredElement(symbol_108);
			symbol_106.getOwnedParameters().add(symbol_107);
			
			symbol_465.setOwnedTemplateSignature(symbol_106);
			symbol_465.setName("flatten");
			//symbol_465.setMoniker("$ocl!Sequence{T}!flatten{T2}()");
			symbol_465.setType(symbol_208);  // $ocl!Sequence[$ocl!Sequence{T}!flatten{T2}()?T2]
			
			symbol_465.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_465.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_465);
		}
		{	// ocl::Sequence::including() $ocl!Sequence{T}!including(T)
			Operation symbol_466 = PivotFactory.eINSTANCE.createOperation();
			symbol_466.setName("including");
			//symbol_466.setMoniker("$ocl!Sequence{T}!including(T)");
			symbol_466.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_467 = PivotFactory.eINSTANCE.createParameter();
			symbol_467.setName("object");
			//symbol_467.setMoniker("$ocl!Sequence{T}!including(T)!object");
			symbol_467.setType(symbol_105);  // $ocl!Sequence{T}?T
			
			symbol_466.getOwnedParameters().add(symbol_467);
			symbol_466.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_466.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_466);
		}
		{	// ocl::Sequence::insertAt() $ocl!Sequence{T}!insertAt(Integer,T)
			Operation symbol_468 = PivotFactory.eINSTANCE.createOperation();
			symbol_468.setName("insertAt");
			//symbol_468.setMoniker("$ocl!Sequence{T}!insertAt(Integer,T)");
			symbol_468.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_469 = PivotFactory.eINSTANCE.createParameter();
			symbol_469.setName("index");
			//symbol_469.setMoniker("$ocl!Sequence{T}!insertAt(Integer,T)!index");
			symbol_469.setType(symbol_122);  // Integer
			
			symbol_468.getOwnedParameters().add(symbol_469);
			Parameter symbol_470 = PivotFactory.eINSTANCE.createParameter();
			symbol_470.setName("object");
			//symbol_470.setMoniker("$ocl!Sequence{T}!insertAt(Integer,T)!object");
			symbol_470.setType(symbol_105);  // $ocl!Sequence{T}?T
			
			symbol_468.getOwnedParameters().add(symbol_470);
			symbol_468.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation");
			symbol_468.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_468);
		}
		{	// ocl::Sequence::prepend() $ocl!Sequence{T}!prepend(T)
			Operation symbol_471 = PivotFactory.eINSTANCE.createOperation();
			symbol_471.setName("prepend");
			//symbol_471.setMoniker("$ocl!Sequence{T}!prepend(T)");
			symbol_471.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_472 = PivotFactory.eINSTANCE.createParameter();
			symbol_472.setName("object");
			//symbol_472.setMoniker("$ocl!Sequence{T}!prepend(T)!object");
			symbol_472.setType(symbol_105);  // $ocl!Sequence{T}?T
			
			symbol_471.getOwnedParameters().add(symbol_472);
			symbol_471.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation");
			symbol_471.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_471);
		}
		{	// ocl::Sequence::reject() $ocl!Sequence{T}!reject(T|Lambda~T()Boolean)
			Iteration symbol_473 = PivotFactory.eINSTANCE.createIteration();
			symbol_473.setName("reject");
			//symbol_473.setMoniker("$ocl!Sequence{T}!reject(T|Lambda~T()Boolean)");
			symbol_473.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_474 = PivotFactory.eINSTANCE.createParameter();
			symbol_474.setName("i");
			symbol_474.setType(symbol_105);  // $ocl!Sequence{T}?T
			symbol_473.getOwnedIterators().add(symbol_474);
			Parameter symbol_475 = PivotFactory.eINSTANCE.createParameter();
			symbol_475.setName("body");
			//symbol_475.setMoniker("$ocl!Sequence{T}!reject(T|Lambda~T()Boolean)!body");
			symbol_475.setType(symbol_244);  // Lambda~$ocl!Sequence{T}?T()Boolean
			
			symbol_473.getOwnedParameters().add(symbol_475);
			symbol_473.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_473.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_473);
		}
		{	// ocl::Sequence::reverse() $ocl!Sequence{T}!reverse()
			Operation symbol_476 = PivotFactory.eINSTANCE.createOperation();
			symbol_476.setName("reverse");
			//symbol_476.setMoniker("$ocl!Sequence{T}!reverse()");
			symbol_476.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			symbol_476.setImplementationClass("org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation");
			symbol_476.setImplementation(org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_476);
		}
		{	// ocl::Sequence::select() $ocl!Sequence{T}!select(T|Lambda~T()Boolean)
			Iteration symbol_477 = PivotFactory.eINSTANCE.createIteration();
			symbol_477.setName("select");
			//symbol_477.setMoniker("$ocl!Sequence{T}!select(T|Lambda~T()Boolean)");
			symbol_477.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_478 = PivotFactory.eINSTANCE.createParameter();
			symbol_478.setName("i");
			symbol_478.setType(symbol_105);  // $ocl!Sequence{T}?T
			symbol_477.getOwnedIterators().add(symbol_478);
			Parameter symbol_479 = PivotFactory.eINSTANCE.createParameter();
			symbol_479.setName("body");
			//symbol_479.setMoniker("$ocl!Sequence{T}!select(T|Lambda~T()Boolean)!body");
			symbol_479.setType(symbol_244);  // Lambda~$ocl!Sequence{T}?T()Boolean
			
			symbol_477.getOwnedParameters().add(symbol_479);
			symbol_477.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_477.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_477);
		}
		{	// ocl::Sequence::subSequence() $ocl!Sequence{T}!subSequence(Integer,Integer)
			Operation symbol_480 = PivotFactory.eINSTANCE.createOperation();
			symbol_480.setName("subSequence");
			//symbol_480.setMoniker("$ocl!Sequence{T}!subSequence(Integer,Integer)");
			symbol_480.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_481 = PivotFactory.eINSTANCE.createParameter();
			symbol_481.setName("lower");
			//symbol_481.setMoniker("$ocl!Sequence{T}!subSequence(Integer,Integer)!lower");
			symbol_481.setType(symbol_122);  // Integer
			
			symbol_480.getOwnedParameters().add(symbol_481);
			Parameter symbol_482 = PivotFactory.eINSTANCE.createParameter();
			symbol_482.setName("upper");
			//symbol_482.setMoniker("$ocl!Sequence{T}!subSequence(Integer,Integer)!upper");
			symbol_482.setType(symbol_122);  // Integer
			
			symbol_480.getOwnedParameters().add(symbol_482);
			symbol_480.setImplementationClass("org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation");
			symbol_480.setImplementation(org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_480);
		}
		{	// ocl::Sequence::union() $ocl!Sequence{T}!union($ocl!Sequence[T])
			Operation symbol_483 = PivotFactory.eINSTANCE.createOperation();
			symbol_483.setName("union");
			//symbol_483.setMoniker("$ocl!Sequence{T}!union($ocl!Sequence[T])");
			symbol_483.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			Parameter symbol_484 = PivotFactory.eINSTANCE.createParameter();
			symbol_484.setName("s");
			//symbol_484.setMoniker("$ocl!Sequence{T}!union($ocl!Sequence[T])!s");
			symbol_484.setType(symbol_209);  // $ocl!Sequence[$ocl!Sequence{T}?T]
			
			symbol_483.getOwnedParameters().add(symbol_484);
			symbol_483.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionUnionOperation");
			symbol_483.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
			symbol_102.getOwnedOperations().add(symbol_483);
		}
		symbol_0.getOwnedTypes().add(symbol_102);
		//
		// ocl::Set $ocl!Set{T}
		//
		symbol_109.setName("Set");
		//symbol_109.setMoniker("$ocl!Set{T}");
		symbol_109.setElementType(symbol_112);
		symbol_112.setName("T");
		symbol_111.setOwnedParameteredElement(symbol_112);
		symbol_110.getOwnedParameters().add(symbol_111);
		
		symbol_109.setOwnedTemplateSignature(symbol_110);
		symbol_109.getSuperClasses().add(symbol_229); // $ocl!UniqueCollection[$ocl!Set{T}?T]
		symbol_109.getSuperClasses().add(symbol_177); // $ocl!NonOrderedCollection[$ocl!Set{T}?T]
		{	// ocl::Set::-() $ocl!Set{T}!-($ocl!Set[$ocl!OclAny])
			Operation symbol_485 = PivotFactory.eINSTANCE.createOperation();
			symbol_485.setName("-");
			//symbol_485.setMoniker("$ocl!Set{T}!-($ocl!Set[$ocl!OclAny])");
			symbol_485.setType(symbol_218);  // $ocl!Set[$ocl!Set{T}?T]
			
			Parameter symbol_486 = PivotFactory.eINSTANCE.createParameter();
			symbol_486.setName("s");
			//symbol_486.setMoniker("$ocl!Set{T}!-($ocl!Set[$ocl!OclAny])!s");
			symbol_486.setType(symbol_214);  // $ocl!Set[$ocl!OclAny]
			
			symbol_485.getOwnedParameters().add(symbol_486);
			symbol_485.setPrecedence(symbol_4);
			symbol_485.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetMinusOperation");
			symbol_485.setImplementation(org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_485);
		}
		{	// ocl::Set::<>() $ocl!Set{T}!<>($ocl!OclSelf)
			Operation symbol_487 = PivotFactory.eINSTANCE.createOperation();
			symbol_487.setName("<>");
			//symbol_487.setMoniker("$ocl!Set{T}!<>($ocl!OclSelf)");
			symbol_487.setType(symbol_121);  // Boolean
			
			Parameter symbol_488 = PivotFactory.eINSTANCE.createParameter();
			symbol_488.setName("object2");
			//symbol_488.setMoniker("$ocl!Set{T}!<>($ocl!OclSelf)!object2");
			symbol_488.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_487.getOwnedParameters().add(symbol_488);
			symbol_487.setPrecedence(symbol_6);
			symbol_487.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_487.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_487);
		}
		{	// ocl::Set::=() $ocl!Set{T}!=($ocl!OclSelf)
			Operation symbol_489 = PivotFactory.eINSTANCE.createOperation();
			symbol_489.setName("=");
			//symbol_489.setMoniker("$ocl!Set{T}!=($ocl!OclSelf)");
			symbol_489.setType(symbol_121);  // Boolean
			
			Parameter symbol_490 = PivotFactory.eINSTANCE.createParameter();
			symbol_490.setName("object2");
			//symbol_490.setMoniker("$ocl!Set{T}!=($ocl!OclSelf)!object2");
			symbol_490.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_489.getOwnedParameters().add(symbol_490);
			symbol_489.setPrecedence(symbol_6);
			symbol_489.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_489.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_489);
		}
		{	// ocl::Set::excluding() $ocl!Set{T}!excluding($ocl!OclAny)
			Operation symbol_491 = PivotFactory.eINSTANCE.createOperation();
			symbol_491.setName("excluding");
			//symbol_491.setMoniker("$ocl!Set{T}!excluding($ocl!OclAny)");
			symbol_491.setType(symbol_218);  // $ocl!Set[$ocl!Set{T}?T]
			
			Parameter symbol_492 = PivotFactory.eINSTANCE.createParameter();
			symbol_492.setName("object");
			//symbol_492.setMoniker("$ocl!Set{T}!excluding($ocl!OclAny)!object");
			symbol_492.setType(symbol_68);  // $ocl!OclAny
			
			symbol_491.getOwnedParameters().add(symbol_492);
			symbol_491.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation");
			symbol_491.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_491);
		}
		{	// ocl::Set::flatten() $ocl!Set{T}!flatten{T2}()
			Operation symbol_493 = PivotFactory.eINSTANCE.createOperation();
			symbol_115.setName("T2");
			symbol_114.setOwnedParameteredElement(symbol_115);
			symbol_113.getOwnedParameters().add(symbol_114);
			
			symbol_493.setOwnedTemplateSignature(symbol_113);
			symbol_493.setName("flatten");
			//symbol_493.setMoniker("$ocl!Set{T}!flatten{T2}()");
			symbol_493.setType(symbol_217);  // $ocl!Set[$ocl!Set{T}!flatten{T2}()?T2]
			
			symbol_493.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation");
			symbol_493.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_493);
		}
		{	// ocl::Set::including() $ocl!Set{T}!including(T)
			Operation symbol_494 = PivotFactory.eINSTANCE.createOperation();
			symbol_494.setName("including");
			//symbol_494.setMoniker("$ocl!Set{T}!including(T)");
			symbol_494.setType(symbol_218);  // $ocl!Set[$ocl!Set{T}?T]
			
			Parameter symbol_495 = PivotFactory.eINSTANCE.createParameter();
			symbol_495.setName("object");
			//symbol_495.setMoniker("$ocl!Set{T}!including(T)!object");
			symbol_495.setType(symbol_112);  // $ocl!Set{T}?T
			
			symbol_494.getOwnedParameters().add(symbol_495);
			symbol_494.setImplementationClass("org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation");
			symbol_494.setImplementation(org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_494);
		}
		{	// ocl::Set::intersection() $ocl!Set{T}!intersection($ocl!Set[T])
			Operation symbol_496 = PivotFactory.eINSTANCE.createOperation();
			symbol_496.setName("intersection");
			//symbol_496.setMoniker("$ocl!Set{T}!intersection($ocl!Set[T])");
			symbol_496.setType(symbol_218);  // $ocl!Set[$ocl!Set{T}?T]
			
			Parameter symbol_497 = PivotFactory.eINSTANCE.createParameter();
			symbol_497.setName("s");
			//symbol_497.setMoniker("$ocl!Set{T}!intersection($ocl!Set[T])!s");
			symbol_497.setType(symbol_218);  // $ocl!Set[$ocl!Set{T}?T]
			
			symbol_496.getOwnedParameters().add(symbol_497);
			symbol_496.setImplementationClass("org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation");
			symbol_496.setImplementation(org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_496);
		}
		{	// ocl::Set::reject() $ocl!Set{T}!reject(T|Lambda~T()Boolean)
			Iteration symbol_498 = PivotFactory.eINSTANCE.createIteration();
			symbol_498.setName("reject");
			//symbol_498.setMoniker("$ocl!Set{T}!reject(T|Lambda~T()Boolean)");
			symbol_498.setType(symbol_218);  // $ocl!Set[$ocl!Set{T}?T]
			
			Parameter symbol_499 = PivotFactory.eINSTANCE.createParameter();
			symbol_499.setName("i");
			symbol_499.setType(symbol_112);  // $ocl!Set{T}?T
			symbol_498.getOwnedIterators().add(symbol_499);
			Parameter symbol_500 = PivotFactory.eINSTANCE.createParameter();
			symbol_500.setName("body");
			//symbol_500.setMoniker("$ocl!Set{T}!reject(T|Lambda~T()Boolean)!body");
			symbol_500.setType(symbol_245);  // Lambda~$ocl!Set{T}?T()Boolean
			
			symbol_498.getOwnedParameters().add(symbol_500);
			symbol_498.setImplementationClass("org.eclipse.ocl.examples.library.iterator.RejectIteration");
			symbol_498.setImplementation(org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_498);
		}
		{	// ocl::Set::select() $ocl!Set{T}!select(T|Lambda~T()Boolean)
			Iteration symbol_501 = PivotFactory.eINSTANCE.createIteration();
			symbol_501.setName("select");
			//symbol_501.setMoniker("$ocl!Set{T}!select(T|Lambda~T()Boolean)");
			symbol_501.setType(symbol_218);  // $ocl!Set[$ocl!Set{T}?T]
			
			Parameter symbol_502 = PivotFactory.eINSTANCE.createParameter();
			symbol_502.setName("i");
			symbol_502.setType(symbol_112);  // $ocl!Set{T}?T
			symbol_501.getOwnedIterators().add(symbol_502);
			Parameter symbol_503 = PivotFactory.eINSTANCE.createParameter();
			symbol_503.setName("body");
			//symbol_503.setMoniker("$ocl!Set{T}!select(T|Lambda~T()Boolean)!body");
			symbol_503.setType(symbol_245);  // Lambda~$ocl!Set{T}?T()Boolean
			
			symbol_501.getOwnedParameters().add(symbol_503);
			symbol_501.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SelectIteration");
			symbol_501.setImplementation(org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_501);
		}
		{	// ocl::Set::symmetricDifference() $ocl!Set{T}!symmetricDifference($ocl!Set[$ocl!OclAny])
			Operation symbol_504 = PivotFactory.eINSTANCE.createOperation();
			symbol_504.setName("symmetricDifference");
			//symbol_504.setMoniker("$ocl!Set{T}!symmetricDifference($ocl!Set[$ocl!OclAny])");
			symbol_504.setType(symbol_218);  // $ocl!Set[$ocl!Set{T}?T]
			
			Parameter symbol_505 = PivotFactory.eINSTANCE.createParameter();
			symbol_505.setName("s");
			//symbol_505.setMoniker("$ocl!Set{T}!symmetricDifference($ocl!Set[$ocl!OclAny])!s");
			symbol_505.setType(symbol_214);  // $ocl!Set[$ocl!OclAny]
			
			symbol_504.getOwnedParameters().add(symbol_505);
			symbol_504.setImplementationClass("org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation");
			symbol_504.setImplementation(org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
			symbol_109.getOwnedOperations().add(symbol_504);
		}
		symbol_0.getOwnedTypes().add(symbol_109);
		//
		// ocl::Tuple $ocl!Tuple
		//
		symbol_116.setName("Tuple");
		//symbol_116.setMoniker("$ocl!Tuple");
		symbol_116.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_0.getOwnedTypes().add(symbol_116);
		//
		// ocl::UniqueCollection $ocl!UniqueCollection{T}
		//
		symbol_117.setName("UniqueCollection");
		//symbol_117.setMoniker("$ocl!UniqueCollection{T}");
		symbol_117.setElementType(symbol_120);
		symbol_120.setName("T");
		symbol_119.setOwnedParameteredElement(symbol_120);
		symbol_118.getOwnedParameters().add(symbol_119);
		
		symbol_117.setOwnedTemplateSignature(symbol_118);
		symbol_117.getSuperClasses().add(symbol_165); // $ocl!Collection[$ocl!UniqueCollection{T}?T]
		{	// ocl::UniqueCollection::sortedBy() $ocl!UniqueCollection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)
			Iteration symbol_506 = PivotFactory.eINSTANCE.createIteration();
			symbol_506.setName("sortedBy");
			//symbol_506.setMoniker("$ocl!UniqueCollection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)");
			symbol_506.setType(symbol_203);  // $ocl!OrderedSet[$ocl!UniqueCollection{T}?T]
			
			Parameter symbol_507 = PivotFactory.eINSTANCE.createParameter();
			symbol_507.setName("i");
			symbol_507.setType(symbol_120);  // $ocl!UniqueCollection{T}?T
			symbol_506.getOwnedIterators().add(symbol_507);
			Parameter symbol_508 = PivotFactory.eINSTANCE.createParameter();
			symbol_508.setName("body");
			//symbol_508.setMoniker("$ocl!UniqueCollection{T}!sortedBy(T|Lambda~T()$ocl!OclAny)!body");
			symbol_508.setType(symbol_246);  // Lambda~$ocl!UniqueCollection{T}?T()$ocl!OclAny
			
			symbol_506.getOwnedParameters().add(symbol_508);
			symbol_506.setImplementationClass("org.eclipse.ocl.examples.library.iterator.SortedByIteration");
			symbol_506.setImplementation(org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
			symbol_117.getOwnedOperations().add(symbol_506);
		}
		symbol_0.getOwnedTypes().add(symbol_117);
		//
		// ocl::Boolean Boolean
		//
		symbol_121.setName("Boolean");
		//symbol_121.setMoniker("Boolean");
		symbol_121.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::Boolean::<>() Boolean!<>($ocl!OclSelf)
			Operation symbol_509 = PivotFactory.eINSTANCE.createOperation();
			symbol_509.setName("<>");
			//symbol_509.setMoniker("Boolean!<>($ocl!OclSelf)");
			symbol_509.setType(symbol_121);  // Boolean
			
			Parameter symbol_510 = PivotFactory.eINSTANCE.createParameter();
			symbol_510.setName("object2");
			//symbol_510.setMoniker("Boolean!<>($ocl!OclSelf)!object2");
			symbol_510.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_509.getOwnedParameters().add(symbol_510);
			symbol_509.setPrecedence(symbol_6);
			symbol_509.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_509.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_509);
		}
		{	// ocl::Boolean::=() Boolean!=($ocl!OclSelf)
			Operation symbol_511 = PivotFactory.eINSTANCE.createOperation();
			symbol_511.setName("=");
			//symbol_511.setMoniker("Boolean!=($ocl!OclSelf)");
			symbol_511.setType(symbol_121);  // Boolean
			
			Parameter symbol_512 = PivotFactory.eINSTANCE.createParameter();
			symbol_512.setName("object2");
			//symbol_512.setMoniker("Boolean!=($ocl!OclSelf)!object2");
			symbol_512.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_511.getOwnedParameters().add(symbol_512);
			symbol_511.setPrecedence(symbol_6);
			symbol_511.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_511.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_511);
		}
		{	// ocl::Boolean::allInstances() Boolean!allInstances()
			Operation symbol_513 = PivotFactory.eINSTANCE.createOperation();
			symbol_513.setName("allInstances");
			//symbol_513.setMoniker("Boolean!allInstances()");
			symbol_513.setType(symbol_215);  // $ocl!Set[$ocl!OclSelf]
			
			symbol_513.setIsStatic(true);
			symbol_513.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation");
			symbol_513.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_513);
		}
		{	// ocl::Boolean::and() Boolean!and(Boolean)
			Operation symbol_514 = PivotFactory.eINSTANCE.createOperation();
			symbol_514.setName("and");
			//symbol_514.setMoniker("Boolean!and(Boolean)");
			symbol_514.setType(symbol_121);  // Boolean
			
			Parameter symbol_515 = PivotFactory.eINSTANCE.createParameter();
			symbol_515.setName("b");
			//symbol_515.setMoniker("Boolean!and(Boolean)!b");
			symbol_515.setType(symbol_121);  // Boolean
			
			symbol_514.getOwnedParameters().add(symbol_515);
			symbol_514.setPrecedence(symbol_7);
			symbol_514.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanAndOperation");
			symbol_514.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_514);
		}
		{	// ocl::Boolean::implies() Boolean!implies(Boolean)
			Operation symbol_516 = PivotFactory.eINSTANCE.createOperation();
			symbol_516.setName("implies");
			//symbol_516.setMoniker("Boolean!implies(Boolean)");
			symbol_516.setType(symbol_121);  // Boolean
			
			Parameter symbol_517 = PivotFactory.eINSTANCE.createParameter();
			symbol_517.setName("b");
			//symbol_517.setMoniker("Boolean!implies(Boolean)!b");
			symbol_517.setType(symbol_121);  // Boolean
			
			symbol_516.getOwnedParameters().add(symbol_517);
			symbol_516.setPrecedence(symbol_10);
			symbol_516.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation");
			symbol_516.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_516);
		}
		{	// ocl::Boolean::not() Boolean!not()
			Operation symbol_518 = PivotFactory.eINSTANCE.createOperation();
			symbol_518.setName("not");
			//symbol_518.setMoniker("Boolean!not()");
			symbol_518.setType(symbol_121);  // Boolean
			
			symbol_518.setPrecedence(symbol_2);
			symbol_518.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanNotOperation");
			symbol_518.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_518);
		}
		{	// ocl::Boolean::or() Boolean!or(Boolean)
			Operation symbol_519 = PivotFactory.eINSTANCE.createOperation();
			symbol_519.setName("or");
			//symbol_519.setMoniker("Boolean!or(Boolean)");
			symbol_519.setType(symbol_121);  // Boolean
			
			Parameter symbol_520 = PivotFactory.eINSTANCE.createParameter();
			symbol_520.setName("b");
			//symbol_520.setMoniker("Boolean!or(Boolean)!b");
			symbol_520.setType(symbol_121);  // Boolean
			
			symbol_519.getOwnedParameters().add(symbol_520);
			symbol_519.setPrecedence(symbol_8);
			symbol_519.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanOrOperation");
			symbol_519.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_519);
		}
		{	// ocl::Boolean::toString() Boolean!toString()
			Operation symbol_521 = PivotFactory.eINSTANCE.createOperation();
			symbol_521.setName("toString");
			//symbol_521.setMoniker("Boolean!toString()");
			symbol_521.setType(symbol_127);  // String
			
			symbol_521.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_521.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_521);
		}
		{	// ocl::Boolean::xor() Boolean!xor(Boolean)
			Operation symbol_522 = PivotFactory.eINSTANCE.createOperation();
			symbol_522.setName("xor");
			//symbol_522.setMoniker("Boolean!xor(Boolean)");
			symbol_522.setType(symbol_121);  // Boolean
			
			Parameter symbol_523 = PivotFactory.eINSTANCE.createParameter();
			symbol_523.setName("b");
			//symbol_523.setMoniker("Boolean!xor(Boolean)!b");
			symbol_523.setType(symbol_121);  // Boolean
			
			symbol_522.getOwnedParameters().add(symbol_523);
			symbol_522.setPrecedence(symbol_9);
			symbol_522.setImplementationClass("org.eclipse.ocl.examples.library.logical.BooleanXorOperation");
			symbol_522.setImplementation(org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
			symbol_121.getOwnedOperations().add(symbol_522);
		}
		symbol_0.getOwnedTypes().add(symbol_121);
		//
		// ocl::Integer Integer
		//
		symbol_122.setName("Integer");
		//symbol_122.setMoniker("Integer");
		symbol_122.getSuperClasses().add(symbol_123); // Real
		{	// ocl::Integer::*() Integer!*($ocl!OclSelf)
			Operation symbol_524 = PivotFactory.eINSTANCE.createOperation();
			symbol_524.setName("*");
			//symbol_524.setMoniker("Integer!*($ocl!OclSelf)");
			symbol_524.setType(symbol_122);  // Integer
			
			Parameter symbol_525 = PivotFactory.eINSTANCE.createParameter();
			symbol_525.setName("i");
			//symbol_525.setMoniker("Integer!*($ocl!OclSelf)!i");
			symbol_525.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_524.getOwnedParameters().add(symbol_525);
			symbol_524.setPrecedence(symbol_3);
			symbol_524.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_524.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_524);
		}
		{	// ocl::Integer::+() Integer!+($ocl!OclSelf)
			Operation symbol_526 = PivotFactory.eINSTANCE.createOperation();
			symbol_526.setName("+");
			//symbol_526.setMoniker("Integer!+($ocl!OclSelf)");
			symbol_526.setType(symbol_122);  // Integer
			
			Parameter symbol_527 = PivotFactory.eINSTANCE.createParameter();
			symbol_527.setName("i");
			//symbol_527.setMoniker("Integer!+($ocl!OclSelf)!i");
			symbol_527.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_526.getOwnedParameters().add(symbol_527);
			symbol_526.setPrecedence(symbol_4);
			symbol_526.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerPlusOperation");
			symbol_526.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_526);
		}
		{	// ocl::Integer::-() Integer!-()
			Operation symbol_528 = PivotFactory.eINSTANCE.createOperation();
			symbol_528.setName("-");
			//symbol_528.setMoniker("Integer!-()");
			symbol_528.setType(symbol_122);  // Integer
			
			symbol_528.setPrecedence(symbol_2);
			symbol_528.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_528.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_528);
		}
		{	// ocl::Integer::-() Integer!-($ocl!OclSelf)
			Operation symbol_529 = PivotFactory.eINSTANCE.createOperation();
			symbol_529.setName("-");
			//symbol_529.setMoniker("Integer!-($ocl!OclSelf)");
			symbol_529.setType(symbol_122);  // Integer
			
			Parameter symbol_530 = PivotFactory.eINSTANCE.createParameter();
			symbol_530.setName("i");
			//symbol_530.setMoniker("Integer!-($ocl!OclSelf)!i");
			symbol_530.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_529.getOwnedParameters().add(symbol_530);
			symbol_529.setPrecedence(symbol_4);
			symbol_529.setImplementationClass("org.eclipse.ocl.examples.library.integer.IntegerMinusOperation");
			symbol_529.setImplementation(org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_529);
		}
		{	// ocl::Integer::/() Integer!/($ocl!OclSelf)
			Operation symbol_531 = PivotFactory.eINSTANCE.createOperation();
			symbol_531.setName("/");
			//symbol_531.setMoniker("Integer!/($ocl!OclSelf)");
			symbol_531.setType(symbol_123);  // Real
			
			Parameter symbol_532 = PivotFactory.eINSTANCE.createParameter();
			symbol_532.setName("i");
			//symbol_532.setMoniker("Integer!/($ocl!OclSelf)!i");
			symbol_532.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_531.getOwnedParameters().add(symbol_532);
			symbol_531.setPrecedence(symbol_3);
			symbol_531.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_531.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_531);
		}
		{	// ocl::Integer::abs() Integer!abs()
			Operation symbol_533 = PivotFactory.eINSTANCE.createOperation();
			symbol_533.setName("abs");
			//symbol_533.setMoniker("Integer!abs()");
			symbol_533.setType(symbol_122);  // Integer
			
			symbol_533.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_533.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_533);
		}
		{	// ocl::Integer::div() Integer!div(Integer)
			Operation symbol_534 = PivotFactory.eINSTANCE.createOperation();
			symbol_534.setName("div");
			//symbol_534.setMoniker("Integer!div(Integer)");
			symbol_534.setType(symbol_122);  // Integer
			
			Parameter symbol_535 = PivotFactory.eINSTANCE.createParameter();
			symbol_535.setName("i");
			//symbol_535.setMoniker("Integer!div(Integer)!i");
			symbol_535.setType(symbol_122);  // Integer
			
			symbol_534.getOwnedParameters().add(symbol_535);
			symbol_534.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivOperation");
			symbol_534.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_534);
		}
		{	// ocl::Integer::max() Integer!max($ocl!OclSelf)
			Operation symbol_536 = PivotFactory.eINSTANCE.createOperation();
			symbol_536.setName("max");
			//symbol_536.setMoniker("Integer!max($ocl!OclSelf)");
			symbol_536.setType(symbol_122);  // Integer
			
			Parameter symbol_537 = PivotFactory.eINSTANCE.createParameter();
			symbol_537.setName("i");
			//symbol_537.setMoniker("Integer!max($ocl!OclSelf)!i");
			symbol_537.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_536.getOwnedParameters().add(symbol_537);
			symbol_536.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_536.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_536);
		}
		{	// ocl::Integer::min() Integer!min($ocl!OclSelf)
			Operation symbol_538 = PivotFactory.eINSTANCE.createOperation();
			symbol_538.setName("min");
			//symbol_538.setMoniker("Integer!min($ocl!OclSelf)");
			symbol_538.setType(symbol_122);  // Integer
			
			Parameter symbol_539 = PivotFactory.eINSTANCE.createParameter();
			symbol_539.setName("i");
			//symbol_539.setMoniker("Integer!min($ocl!OclSelf)!i");
			symbol_539.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_538.getOwnedParameters().add(symbol_539);
			symbol_538.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_538.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_538);
		}
		{	// ocl::Integer::mod() Integer!mod(Integer)
			Operation symbol_540 = PivotFactory.eINSTANCE.createOperation();
			symbol_540.setName("mod");
			//symbol_540.setMoniker("Integer!mod(Integer)");
			symbol_540.setType(symbol_122);  // Integer
			
			Parameter symbol_541 = PivotFactory.eINSTANCE.createParameter();
			symbol_541.setName("i");
			//symbol_541.setMoniker("Integer!mod(Integer)!i");
			symbol_541.setType(symbol_122);  // Integer
			
			symbol_540.getOwnedParameters().add(symbol_541);
			symbol_540.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericModOperation");
			symbol_540.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_540);
		}
		{	// ocl::Integer::toString() Integer!toString()
			Operation symbol_542 = PivotFactory.eINSTANCE.createOperation();
			symbol_542.setName("toString");
			//symbol_542.setMoniker("Integer!toString()");
			symbol_542.setType(symbol_127);  // String
			
			symbol_542.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_542.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_122.getOwnedOperations().add(symbol_542);
		}
		symbol_0.getOwnedTypes().add(symbol_122);
		//
		// ocl::Real Real
		//
		symbol_123.setName("Real");
		//symbol_123.setMoniker("Real");
		symbol_123.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::Real::*() Real!*($ocl!OclSelf)
			Operation symbol_543 = PivotFactory.eINSTANCE.createOperation();
			symbol_543.setName("*");
			//symbol_543.setMoniker("Real!*($ocl!OclSelf)");
			symbol_543.setType(symbol_123);  // Real
			
			Parameter symbol_544 = PivotFactory.eINSTANCE.createParameter();
			symbol_544.setName("r");
			//symbol_544.setMoniker("Real!*($ocl!OclSelf)!r");
			symbol_544.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_543.getOwnedParameters().add(symbol_544);
			symbol_543.setPrecedence(symbol_3);
			symbol_543.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericTimesOperation");
			symbol_543.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_543);
		}
		{	// ocl::Real::+() Real!+($ocl!OclSelf)
			Operation symbol_545 = PivotFactory.eINSTANCE.createOperation();
			symbol_545.setName("+");
			//symbol_545.setMoniker("Real!+($ocl!OclSelf)");
			symbol_545.setType(symbol_123);  // Real
			
			Parameter symbol_546 = PivotFactory.eINSTANCE.createParameter();
			symbol_546.setName("r");
			//symbol_546.setMoniker("Real!+($ocl!OclSelf)!r");
			symbol_546.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_545.getOwnedParameters().add(symbol_546);
			symbol_545.setPrecedence(symbol_4);
			symbol_545.setImplementationClass("org.eclipse.ocl.examples.library.real.RealPlusOperation");
			symbol_545.setImplementation(org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_545);
		}
		{	// ocl::Real::-() Real!-($ocl!OclSelf)
			Operation symbol_547 = PivotFactory.eINSTANCE.createOperation();
			symbol_547.setName("-");
			//symbol_547.setMoniker("Real!-($ocl!OclSelf)");
			symbol_547.setType(symbol_123);  // Real
			
			Parameter symbol_548 = PivotFactory.eINSTANCE.createParameter();
			symbol_548.setName("r");
			//symbol_548.setMoniker("Real!-($ocl!OclSelf)!r");
			symbol_548.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_547.getOwnedParameters().add(symbol_548);
			symbol_547.setPrecedence(symbol_4);
			symbol_547.setImplementationClass("org.eclipse.ocl.examples.library.real.RealMinusOperation");
			symbol_547.setImplementation(org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_547);
		}
		{	// ocl::Real::-() Real!-()
			Operation symbol_549 = PivotFactory.eINSTANCE.createOperation();
			symbol_549.setName("-");
			//symbol_549.setMoniker("Real!-()");
			symbol_549.setType(symbol_123);  // Real
			
			symbol_549.setPrecedence(symbol_2);
			symbol_549.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericNegateOperation");
			symbol_549.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_549);
		}
		{	// ocl::Real::/() Real!/($ocl!OclSelf)
			Operation symbol_550 = PivotFactory.eINSTANCE.createOperation();
			symbol_550.setName("/");
			//symbol_550.setMoniker("Real!/($ocl!OclSelf)");
			symbol_550.setType(symbol_123);  // Real
			
			Parameter symbol_551 = PivotFactory.eINSTANCE.createParameter();
			symbol_551.setName("r");
			//symbol_551.setMoniker("Real!/($ocl!OclSelf)!r");
			symbol_551.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_550.getOwnedParameters().add(symbol_551);
			symbol_550.setPrecedence(symbol_3);
			symbol_550.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericDivideOperation");
			symbol_550.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_550);
		}
		{	// ocl::Real::<() Real!<($ocl!OclSelf)
			Operation symbol_552 = PivotFactory.eINSTANCE.createOperation();
			symbol_552.setName("<");
			//symbol_552.setMoniker("Real!<($ocl!OclSelf)");
			symbol_552.setType(symbol_121);  // Boolean
			
			Parameter symbol_553 = PivotFactory.eINSTANCE.createParameter();
			symbol_553.setName("r");
			//symbol_553.setMoniker("Real!<($ocl!OclSelf)!r");
			symbol_553.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_552.getOwnedParameters().add(symbol_553);
			symbol_552.setPrecedence(symbol_5);
			symbol_552.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation");
			symbol_552.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_552);
		}
		{	// ocl::Real::<=() Real!<=($ocl!OclSelf)
			Operation symbol_554 = PivotFactory.eINSTANCE.createOperation();
			symbol_554.setName("<=");
			//symbol_554.setMoniker("Real!<=($ocl!OclSelf)");
			symbol_554.setType(symbol_121);  // Boolean
			
			Parameter symbol_555 = PivotFactory.eINSTANCE.createParameter();
			symbol_555.setName("r");
			//symbol_555.setMoniker("Real!<=($ocl!OclSelf)!r");
			symbol_555.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_554.getOwnedParameters().add(symbol_555);
			symbol_554.setPrecedence(symbol_5);
			symbol_554.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation");
			symbol_554.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_554);
		}
		{	// ocl::Real::<>() Real!<>($ocl!OclSelf)
			Operation symbol_556 = PivotFactory.eINSTANCE.createOperation();
			symbol_556.setName("<>");
			//symbol_556.setMoniker("Real!<>($ocl!OclSelf)");
			symbol_556.setType(symbol_121);  // Boolean
			
			Parameter symbol_557 = PivotFactory.eINSTANCE.createParameter();
			symbol_557.setName("object2");
			//symbol_557.setMoniker("Real!<>($ocl!OclSelf)!object2");
			symbol_557.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_556.getOwnedParameters().add(symbol_557);
			symbol_556.setPrecedence(symbol_6);
			symbol_556.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_556.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_556);
		}
		{	// ocl::Real::=() Real!=($ocl!OclSelf)
			Operation symbol_558 = PivotFactory.eINSTANCE.createOperation();
			symbol_558.setName("=");
			//symbol_558.setMoniker("Real!=($ocl!OclSelf)");
			symbol_558.setType(symbol_121);  // Boolean
			
			Parameter symbol_559 = PivotFactory.eINSTANCE.createParameter();
			symbol_559.setName("object2");
			//symbol_559.setMoniker("Real!=($ocl!OclSelf)!object2");
			symbol_559.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_558.getOwnedParameters().add(symbol_559);
			symbol_558.setPrecedence(symbol_6);
			symbol_558.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_558.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_558);
		}
		{	// ocl::Real::>() Real!>($ocl!OclSelf)
			Operation symbol_560 = PivotFactory.eINSTANCE.createOperation();
			symbol_560.setName(">");
			//symbol_560.setMoniker("Real!>($ocl!OclSelf)");
			symbol_560.setType(symbol_121);  // Boolean
			
			Parameter symbol_561 = PivotFactory.eINSTANCE.createParameter();
			symbol_561.setName("r");
			//symbol_561.setMoniker("Real!>($ocl!OclSelf)!r");
			symbol_561.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_560.getOwnedParameters().add(symbol_561);
			symbol_560.setPrecedence(symbol_5);
			symbol_560.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation");
			symbol_560.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_560);
		}
		{	// ocl::Real::>=() Real!>=($ocl!OclSelf)
			Operation symbol_562 = PivotFactory.eINSTANCE.createOperation();
			symbol_562.setName(">=");
			//symbol_562.setMoniker("Real!>=($ocl!OclSelf)");
			symbol_562.setType(symbol_121);  // Boolean
			
			Parameter symbol_563 = PivotFactory.eINSTANCE.createParameter();
			symbol_563.setName("r");
			//symbol_563.setMoniker("Real!>=($ocl!OclSelf)!r");
			symbol_563.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_562.getOwnedParameters().add(symbol_563);
			symbol_562.setPrecedence(symbol_5);
			symbol_562.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation");
			symbol_562.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_562);
		}
		{	// ocl::Real::abs() Real!abs()
			Operation symbol_564 = PivotFactory.eINSTANCE.createOperation();
			symbol_564.setName("abs");
			//symbol_564.setMoniker("Real!abs()");
			symbol_564.setType(symbol_123);  // Real
			
			symbol_564.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericAbsOperation");
			symbol_564.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_564);
		}
		{	// ocl::Real::floor() Real!floor()
			Operation symbol_565 = PivotFactory.eINSTANCE.createOperation();
			symbol_565.setName("floor");
			//symbol_565.setMoniker("Real!floor()");
			symbol_565.setType(symbol_122);  // Integer
			
			symbol_565.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericFloorOperation");
			symbol_565.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_565);
		}
		{	// ocl::Real::max() Real!max($ocl!OclSelf)
			Operation symbol_566 = PivotFactory.eINSTANCE.createOperation();
			symbol_566.setName("max");
			//symbol_566.setMoniker("Real!max($ocl!OclSelf)");
			symbol_566.setType(symbol_123);  // Real
			
			Parameter symbol_567 = PivotFactory.eINSTANCE.createParameter();
			symbol_567.setName("r");
			//symbol_567.setMoniker("Real!max($ocl!OclSelf)!r");
			symbol_567.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_566.getOwnedParameters().add(symbol_567);
			symbol_566.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMaxOperation");
			symbol_566.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_566);
		}
		{	// ocl::Real::min() Real!min($ocl!OclSelf)
			Operation symbol_568 = PivotFactory.eINSTANCE.createOperation();
			symbol_568.setName("min");
			//symbol_568.setMoniker("Real!min($ocl!OclSelf)");
			symbol_568.setType(symbol_123);  // Real
			
			Parameter symbol_569 = PivotFactory.eINSTANCE.createParameter();
			symbol_569.setName("r");
			//symbol_569.setMoniker("Real!min($ocl!OclSelf)!r");
			symbol_569.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_568.getOwnedParameters().add(symbol_569);
			symbol_568.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericMinOperation");
			symbol_568.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_568);
		}
		{	// ocl::Real::oclAsType() Real!oclAsType{TT}($ocl!Classifier[TT])
			Operation symbol_570 = PivotFactory.eINSTANCE.createOperation();
			symbol_126.setName("TT");
			symbol_125.setOwnedParameteredElement(symbol_126);
			symbol_124.getOwnedParameters().add(symbol_125);
			
			symbol_570.setOwnedTemplateSignature(symbol_124);
			symbol_570.setName("oclAsType");
			//symbol_570.setMoniker("Real!oclAsType{TT}($ocl!Classifier[TT])");
			symbol_570.setType(symbol_126);  // Real!oclAsType{TT}($ocl!Classifier[TT])?TT
			
			Parameter symbol_571 = PivotFactory.eINSTANCE.createParameter();
			symbol_571.setName("type");
			//symbol_571.setMoniker("Real!oclAsType{TT}($ocl!Classifier[TT])!type");
			symbol_571.setType(symbol_142);  // $ocl!Classifier[Real!oclAsType{TT}($ocl!Classifier[TT])?TT]
			
			symbol_570.getOwnedParameters().add(symbol_571);
			symbol_570.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericOclAsTypeOperation");
			symbol_570.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericOclAsTypeOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_570);
		}
		{	// ocl::Real::round() Real!round()
			Operation symbol_572 = PivotFactory.eINSTANCE.createOperation();
			symbol_572.setName("round");
			//symbol_572.setMoniker("Real!round()");
			symbol_572.setType(symbol_122);  // Integer
			
			symbol_572.setImplementationClass("org.eclipse.ocl.examples.library.numeric.NumericRoundOperation");
			symbol_572.setImplementation(org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_572);
		}
		{	// ocl::Real::toString() Real!toString()
			Operation symbol_573 = PivotFactory.eINSTANCE.createOperation();
			symbol_573.setName("toString");
			//symbol_573.setMoniker("Real!toString()");
			symbol_573.setType(symbol_127);  // String
			
			symbol_573.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_573.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_123.getOwnedOperations().add(symbol_573);
		}
		symbol_0.getOwnedTypes().add(symbol_123);
		//
		// ocl::String String
		//
		symbol_127.setName("String");
		//symbol_127.setMoniker("String");
		symbol_127.getSuperClasses().add(symbol_68); // $ocl!OclAny
		{	// ocl::String::+() String!+(String)
			Operation symbol_574 = PivotFactory.eINSTANCE.createOperation();
			symbol_574.setName("+");
			//symbol_574.setMoniker("String!+(String)");
			symbol_574.setType(symbol_127);  // String
			
			Parameter symbol_575 = PivotFactory.eINSTANCE.createParameter();
			symbol_575.setName("s");
			//symbol_575.setMoniker("String!+(String)!s");
			symbol_575.setType(symbol_127);  // String
			
			symbol_574.getOwnedParameters().add(symbol_575);
			symbol_574.setPrecedence(symbol_4);
			symbol_574.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_574.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_574);
		}
		{	// ocl::String::<() String!<($ocl!OclSelf)
			Operation symbol_576 = PivotFactory.eINSTANCE.createOperation();
			symbol_576.setName("<");
			//symbol_576.setMoniker("String!<($ocl!OclSelf)");
			symbol_576.setType(symbol_121);  // Boolean
			
			Parameter symbol_577 = PivotFactory.eINSTANCE.createParameter();
			symbol_577.setName("s");
			//symbol_577.setMoniker("String!<($ocl!OclSelf)!s");
			symbol_577.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_576.getOwnedParameters().add(symbol_577);
			symbol_576.setPrecedence(symbol_5);
			symbol_576.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanOperation");
			symbol_576.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_576);
		}
		{	// ocl::String::<=() String!<=($ocl!OclSelf)
			Operation symbol_578 = PivotFactory.eINSTANCE.createOperation();
			symbol_578.setName("<=");
			//symbol_578.setMoniker("String!<=($ocl!OclSelf)");
			symbol_578.setType(symbol_121);  // Boolean
			
			Parameter symbol_579 = PivotFactory.eINSTANCE.createParameter();
			symbol_579.setName("s");
			//symbol_579.setMoniker("String!<=($ocl!OclSelf)!s");
			symbol_579.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_578.getOwnedParameters().add(symbol_579);
			symbol_578.setPrecedence(symbol_5);
			symbol_578.setImplementationClass("org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation");
			symbol_578.setImplementation(org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_578);
		}
		{	// ocl::String::<>() String!<>($ocl!OclSelf)
			Operation symbol_580 = PivotFactory.eINSTANCE.createOperation();
			symbol_580.setName("<>");
			//symbol_580.setMoniker("String!<>($ocl!OclSelf)");
			symbol_580.setType(symbol_121);  // Boolean
			
			Parameter symbol_581 = PivotFactory.eINSTANCE.createParameter();
			symbol_581.setName("object2");
			//symbol_581.setMoniker("String!<>($ocl!OclSelf)!object2");
			symbol_581.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_580.getOwnedParameters().add(symbol_581);
			symbol_580.setPrecedence(symbol_6);
			symbol_580.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation");
			symbol_580.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_580);
		}
		{	// ocl::String::=() String!=($ocl!OclSelf)
			Operation symbol_582 = PivotFactory.eINSTANCE.createOperation();
			symbol_582.setName("=");
			//symbol_582.setMoniker("String!=($ocl!OclSelf)");
			symbol_582.setType(symbol_121);  // Boolean
			
			Parameter symbol_583 = PivotFactory.eINSTANCE.createParameter();
			symbol_583.setName("object2");
			//symbol_583.setMoniker("String!=($ocl!OclSelf)!object2");
			symbol_583.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_582.getOwnedParameters().add(symbol_583);
			symbol_582.setPrecedence(symbol_6);
			symbol_582.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation");
			symbol_582.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_582);
		}
		{	// ocl::String::>() String!>($ocl!OclSelf)
			Operation symbol_584 = PivotFactory.eINSTANCE.createOperation();
			symbol_584.setName(">");
			//symbol_584.setMoniker("String!>($ocl!OclSelf)");
			symbol_584.setType(symbol_121);  // Boolean
			
			Parameter symbol_585 = PivotFactory.eINSTANCE.createParameter();
			symbol_585.setName("s");
			//symbol_585.setMoniker("String!>($ocl!OclSelf)!s");
			symbol_585.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_584.getOwnedParameters().add(symbol_585);
			symbol_584.setPrecedence(symbol_5);
			symbol_584.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanOperation");
			symbol_584.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_584);
		}
		{	// ocl::String::>=() String!>=($ocl!OclSelf)
			Operation symbol_586 = PivotFactory.eINSTANCE.createOperation();
			symbol_586.setName(">=");
			//symbol_586.setMoniker("String!>=($ocl!OclSelf)");
			symbol_586.setType(symbol_121);  // Boolean
			
			Parameter symbol_587 = PivotFactory.eINSTANCE.createParameter();
			symbol_587.setName("s");
			//symbol_587.setMoniker("String!>=($ocl!OclSelf)!s");
			symbol_587.setType(symbol_81);  // $ocl!OclSelf
			
			symbol_586.getOwnedParameters().add(symbol_587);
			symbol_586.setPrecedence(symbol_5);
			symbol_586.setImplementationClass("org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation");
			symbol_586.setImplementation(org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_586);
		}
		{	// ocl::String::at() String!at(Integer)
			Operation symbol_588 = PivotFactory.eINSTANCE.createOperation();
			symbol_588.setName("at");
			//symbol_588.setMoniker("String!at(Integer)");
			symbol_588.setType(symbol_127);  // String
			
			Parameter symbol_589 = PivotFactory.eINSTANCE.createParameter();
			symbol_589.setName("i");
			//symbol_589.setMoniker("String!at(Integer)!i");
			symbol_589.setType(symbol_122);  // Integer
			
			symbol_588.getOwnedParameters().add(symbol_589);
			symbol_588.setImplementationClass("org.eclipse.ocl.examples.library.string.StringAtOperation");
			symbol_588.setImplementation(org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_588);
		}
		{	// ocl::String::characters() String!characters()
			Operation symbol_590 = PivotFactory.eINSTANCE.createOperation();
			symbol_590.setName("characters");
			//symbol_590.setMoniker("String!characters()");
			symbol_590.setType(symbol_210);  // $ocl!Sequence[String]
			
			symbol_590.setImplementationClass("org.eclipse.ocl.examples.library.string.StringCharactersOperation");
			symbol_590.setImplementation(org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_590);
		}
		{	// ocl::String::concat() String!concat(String)
			Operation symbol_591 = PivotFactory.eINSTANCE.createOperation();
			symbol_591.setName("concat");
			//symbol_591.setMoniker("String!concat(String)");
			symbol_591.setType(symbol_127);  // String
			
			Parameter symbol_592 = PivotFactory.eINSTANCE.createParameter();
			symbol_592.setName("s");
			//symbol_592.setMoniker("String!concat(String)!s");
			symbol_592.setType(symbol_127);  // String
			
			symbol_591.getOwnedParameters().add(symbol_592);
			symbol_591.setImplementationClass("org.eclipse.ocl.examples.library.string.StringConcatOperation");
			symbol_591.setImplementation(org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_591);
		}
		{	// ocl::String::equalsIgnoreCase() String!equalsIgnoreCase(String)
			Operation symbol_593 = PivotFactory.eINSTANCE.createOperation();
			symbol_593.setName("equalsIgnoreCase");
			//symbol_593.setMoniker("String!equalsIgnoreCase(String)");
			symbol_593.setType(symbol_121);  // Boolean
			
			Parameter symbol_594 = PivotFactory.eINSTANCE.createParameter();
			symbol_594.setName("s");
			//symbol_594.setMoniker("String!equalsIgnoreCase(String)!s");
			symbol_594.setType(symbol_127);  // String
			
			symbol_593.getOwnedParameters().add(symbol_594);
			symbol_593.setImplementationClass("org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation");
			symbol_593.setImplementation(org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_593);
		}
		{	// ocl::String::indexOf() String!indexOf(String)
			Operation symbol_595 = PivotFactory.eINSTANCE.createOperation();
			symbol_595.setName("indexOf");
			//symbol_595.setMoniker("String!indexOf(String)");
			symbol_595.setType(symbol_122);  // Integer
			
			Parameter symbol_596 = PivotFactory.eINSTANCE.createParameter();
			symbol_596.setName("s");
			//symbol_596.setMoniker("String!indexOf(String)!s");
			symbol_596.setType(symbol_127);  // String
			
			symbol_595.getOwnedParameters().add(symbol_596);
			symbol_595.setImplementationClass("org.eclipse.ocl.examples.library.string.StringIndexOfOperation");
			symbol_595.setImplementation(org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_595);
		}
		{	// ocl::String::size() String!size()
			Operation symbol_597 = PivotFactory.eINSTANCE.createOperation();
			symbol_597.setName("size");
			//symbol_597.setMoniker("String!size()");
			symbol_597.setType(symbol_122);  // Integer
			
			symbol_597.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSizeOperation");
			symbol_597.setImplementation(org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_597);
		}
		{	// ocl::String::substring() String!substring(Integer,Integer)
			Operation symbol_598 = PivotFactory.eINSTANCE.createOperation();
			symbol_598.setName("substring");
			//symbol_598.setMoniker("String!substring(Integer,Integer)");
			symbol_598.setType(symbol_127);  // String
			
			Parameter symbol_599 = PivotFactory.eINSTANCE.createParameter();
			symbol_599.setName("lower");
			//symbol_599.setMoniker("String!substring(Integer,Integer)!lower");
			symbol_599.setType(symbol_122);  // Integer
			
			symbol_598.getOwnedParameters().add(symbol_599);
			Parameter symbol_600 = PivotFactory.eINSTANCE.createParameter();
			symbol_600.setName("upper");
			//symbol_600.setMoniker("String!substring(Integer,Integer)!upper");
			symbol_600.setType(symbol_122);  // Integer
			
			symbol_598.getOwnedParameters().add(symbol_600);
			symbol_598.setImplementationClass("org.eclipse.ocl.examples.library.string.StringSubstringOperation");
			symbol_598.setImplementation(org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_598);
		}
		{	// ocl::String::toBoolean() String!toBoolean()
			Operation symbol_601 = PivotFactory.eINSTANCE.createOperation();
			symbol_601.setName("toBoolean");
			//symbol_601.setMoniker("String!toBoolean()");
			symbol_601.setType(symbol_121);  // Boolean
			
			symbol_601.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToBooleanOperation");
			symbol_601.setImplementation(org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_601);
		}
		{	// ocl::String::toInteger() String!toInteger()
			Operation symbol_602 = PivotFactory.eINSTANCE.createOperation();
			symbol_602.setName("toInteger");
			//symbol_602.setMoniker("String!toInteger()");
			symbol_602.setType(symbol_122);  // Integer
			
			symbol_602.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToIntegerOperation");
			symbol_602.setImplementation(org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_602);
		}
		{	// ocl::String::toLower() String!toLower()
			Operation symbol_603 = PivotFactory.eINSTANCE.createOperation();
			symbol_603.setName("toLower");
			//symbol_603.setMoniker("String!toLower()");
			symbol_603.setType(symbol_127);  // String
			
			symbol_603.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_603.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_603);
		}
		{	// ocl::String::toLowerCase() String!toLowerCase()
			Operation symbol_604 = PivotFactory.eINSTANCE.createOperation();
			symbol_604.setName("toLowerCase");
			//symbol_604.setMoniker("String!toLowerCase()");
			symbol_604.setType(symbol_127);  // String
			
			symbol_604.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation");
			symbol_604.setImplementation(org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_604);
		}
		{	// ocl::String::toReal() String!toReal()
			Operation symbol_605 = PivotFactory.eINSTANCE.createOperation();
			symbol_605.setName("toReal");
			//symbol_605.setMoniker("String!toReal()");
			symbol_605.setType(symbol_123);  // Real
			
			symbol_605.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToRealOperation");
			symbol_605.setImplementation(org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_605);
		}
		{	// ocl::String::toString() String!toString()
			Operation symbol_606 = PivotFactory.eINSTANCE.createOperation();
			symbol_606.setName("toString");
			//symbol_606.setMoniker("String!toString()");
			symbol_606.setType(symbol_127);  // String
			
			symbol_606.setImplementationClass("org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation");
			symbol_606.setImplementation(org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_606);
		}
		{	// ocl::String::toUpper() String!toUpper()
			Operation symbol_607 = PivotFactory.eINSTANCE.createOperation();
			symbol_607.setName("toUpper");
			//symbol_607.setMoniker("String!toUpper()");
			symbol_607.setType(symbol_127);  // String
			
			symbol_607.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_607.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_607);
		}
		{	// ocl::String::toUpperCase() String!toUpperCase()
			Operation symbol_608 = PivotFactory.eINSTANCE.createOperation();
			symbol_608.setName("toUpperCase");
			//symbol_608.setMoniker("String!toUpperCase()");
			symbol_608.setType(symbol_127);  // String
			
			symbol_608.setImplementationClass("org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation");
			symbol_608.setImplementation(org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
			symbol_127.getOwnedOperations().add(symbol_608);
		}
		symbol_0.getOwnedTypes().add(symbol_127);
		//
		// ocl::UnlimitedNatural UnlimitedNatural
		//
		symbol_128.setName("UnlimitedNatural");
		//symbol_128.setMoniker("UnlimitedNatural");
		symbol_128.getSuperClasses().add(symbol_122); // Integer
		symbol_0.getOwnedTypes().add(symbol_128);
		//
		// ocl::$$
		//
		symbol_129.setName("$$");
		symbol_129.setMoniker("$$");
		//
		// ocl::$$::$$ $$!$$
		//
		symbol_130.setName("$$");
		//symbol_130.setMoniker("$$!$$");
		symbol_129.getOwnedTypes().add(symbol_130);
		//
		// ocl::$$::Bag $ocl!Bag[$ocl!Bag{T}!flatten{T2}()?T2]
		//
		symbol_131.setName("Bag");
		//symbol_131.setMoniker("$ocl!Bag[$ocl!Bag{T}!flatten{T2}()?T2]");
		symbol_131.setElementType(symbol_17);
		symbol_131.setUnspecializedElement(symbol_11);
		{
			TemplateBinding symbol_609 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_609.setSignature(symbol_12);
			{
				TemplateParameterSubstitution symbol_610 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_610.setFormal(symbol_13);	
				symbol_610.setActual(symbol_17);	
				symbol_609.getParameterSubstitutions().add(symbol_610);
			}
			symbol_131.getTemplateBindings().add(symbol_609);
		}
		symbol_131.getSuperClasses().add(symbol_168); // $ocl!NonOrderedCollection[$ocl!Bag{T}!flatten{T2}()?T2]
		symbol_131.getSuperClasses().add(symbol_179); // $ocl!NonUniqueCollection[$ocl!Bag{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_131);
		//
		// ocl::$$::Bag $ocl!Bag[$ocl!Bag{T}?T]
		//
		symbol_132.setName("Bag");
		//symbol_132.setMoniker("$ocl!Bag[$ocl!Bag{T}?T]");
		symbol_132.setElementType(symbol_14);
		symbol_132.setUnspecializedElement(symbol_11);
		{
			TemplateBinding symbol_611 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_611.setSignature(symbol_12);
			{
				TemplateParameterSubstitution symbol_612 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_612.setFormal(symbol_13);	
				symbol_612.setActual(symbol_14);	
				symbol_611.getParameterSubstitutions().add(symbol_612);
			}
			symbol_132.getTemplateBindings().add(symbol_611);
		}
		symbol_132.getSuperClasses().add(symbol_169); // $ocl!NonOrderedCollection[$ocl!Bag{T}?T]
		symbol_132.getSuperClasses().add(symbol_180); // $ocl!NonUniqueCollection[$ocl!Bag{T}?T]
		symbol_129.getOwnedTypes().add(symbol_132);
		//
		// ocl::$$::Bag $ocl!Bag[$ocl!Collection{T}?T]
		//
		symbol_133.setName("Bag");
		//symbol_133.setMoniker("$ocl!Bag[$ocl!Collection{T}?T]");
		symbol_133.setElementType(symbol_31);
		symbol_133.setUnspecializedElement(symbol_11);
		{
			TemplateBinding symbol_613 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_613.setSignature(symbol_12);
			{
				TemplateParameterSubstitution symbol_614 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_614.setFormal(symbol_13);	
				symbol_614.setActual(symbol_31);	
				symbol_613.getParameterSubstitutions().add(symbol_614);
			}
			symbol_133.getTemplateBindings().add(symbol_613);
		}
		symbol_133.getSuperClasses().add(symbol_171); // $ocl!NonOrderedCollection[$ocl!Collection{T}?T]
		symbol_133.getSuperClasses().add(symbol_181); // $ocl!NonUniqueCollection[$ocl!Collection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_133);
		//
		// ocl::$$::Bag $ocl!Bag[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_134.setName("Bag");
		//symbol_134.setMoniker("$ocl!Bag[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_134.setElementType(symbol_60);
		symbol_134.setUnspecializedElement(symbol_11);
		{
			TemplateBinding symbol_615 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_615.setSignature(symbol_12);
			{
				TemplateParameterSubstitution symbol_616 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_616.setFormal(symbol_13);	
				symbol_616.setActual(symbol_60);	
				symbol_615.getParameterSubstitutions().add(symbol_616);
			}
			symbol_134.getTemplateBindings().add(symbol_615);
		}
		symbol_134.getSuperClasses().add(symbol_172); // $ocl!NonOrderedCollection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_134.getSuperClasses().add(symbol_182); // $ocl!NonUniqueCollection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_129.getOwnedTypes().add(symbol_134);
		//
		// ocl::$$::Bag $ocl!Bag[$ocl!NonOrderedCollection{T}?T]
		//
		symbol_135.setName("Bag");
		//symbol_135.setMoniker("$ocl!Bag[$ocl!NonOrderedCollection{T}?T]");
		symbol_135.setElementType(symbol_57);
		symbol_135.setUnspecializedElement(symbol_11);
		{
			TemplateBinding symbol_617 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_617.setSignature(symbol_12);
			{
				TemplateParameterSubstitution symbol_618 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_618.setFormal(symbol_13);	
				symbol_618.setActual(symbol_57);	
				symbol_617.getParameterSubstitutions().add(symbol_618);
			}
			symbol_135.getTemplateBindings().add(symbol_617);
		}
		symbol_135.getSuperClasses().add(symbol_183); // $ocl!NonUniqueCollection[$ocl!NonOrderedCollection{T}?T]
		symbol_135.getSuperClasses().add(symbol_54); // $ocl!NonOrderedCollection{T}
		symbol_129.getOwnedTypes().add(symbol_135);
		//
		// ocl::$$::Classifier $ocl!Classifier[$ocl!Classifier{T}!oclContainer{U}()?U]
		//
		symbol_136.setName("Classifier");
		//symbol_136.setMoniker("$ocl!Classifier[$ocl!Classifier{T}!oclContainer{U}()?U]");
		symbol_136.setInstanceType(symbol_24);
		symbol_136.setUnspecializedElement(symbol_18);
		{
			TemplateBinding symbol_619 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_619.setSignature(symbol_19);
			{
				TemplateParameterSubstitution symbol_620 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_620.setFormal(symbol_20);	
				symbol_620.setActual(symbol_24);	
				symbol_619.getParameterSubstitutions().add(symbol_620);
			}
			symbol_136.getTemplateBindings().add(symbol_619);
		}
		symbol_136.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_136);
		//
		// ocl::$$::Classifier $ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]
		//
		symbol_137.setName("Classifier");
		//symbol_137.setMoniker("$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]");
		symbol_137.setInstanceType(symbol_27);
		symbol_137.setUnspecializedElement(symbol_18);
		{
			TemplateBinding symbol_621 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_621.setSignature(symbol_19);
			{
				TemplateParameterSubstitution symbol_622 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_622.setFormal(symbol_20);	
				symbol_622.setActual(symbol_27);	
				symbol_621.getParameterSubstitutions().add(symbol_622);
			}
			symbol_137.getTemplateBindings().add(symbol_621);
		}
		symbol_137.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_137);
		//
		// ocl::$$::Classifier $ocl!Classifier[$ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])?TT]
		//
		symbol_138.setName("Classifier");
		//symbol_138.setMoniker("$ocl!Classifier[$ocl!OclAny!oclAsType{TT}($ocl!Classifier[TT])?TT]");
		symbol_138.setInstanceType(symbol_71);
		symbol_138.setUnspecializedElement(symbol_18);
		{
			TemplateBinding symbol_623 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_623.setSignature(symbol_19);
			{
				TemplateParameterSubstitution symbol_624 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_624.setFormal(symbol_20);	
				symbol_624.setActual(symbol_71);	
				symbol_623.getParameterSubstitutions().add(symbol_624);
			}
			symbol_138.getTemplateBindings().add(symbol_623);
		}
		symbol_138.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_138);
		//
		// ocl::$$::Classifier $ocl!Classifier[$ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])?T]
		//
		symbol_139.setName("Classifier");
		//symbol_139.setMoniker("$ocl!Classifier[$ocl!OclAny!oclIsKindOf{T}($ocl!Classifier[T])?T]");
		symbol_139.setInstanceType(symbol_74);
		symbol_139.setUnspecializedElement(symbol_18);
		{
			TemplateBinding symbol_625 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_625.setSignature(symbol_19);
			{
				TemplateParameterSubstitution symbol_626 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_626.setFormal(symbol_20);	
				symbol_626.setActual(symbol_74);	
				symbol_625.getParameterSubstitutions().add(symbol_626);
			}
			symbol_139.getTemplateBindings().add(symbol_625);
		}
		symbol_139.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_139);
		//
		// ocl::$$::Classifier $ocl!Classifier[$ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])?T]
		//
		symbol_140.setName("Classifier");
		//symbol_140.setMoniker("$ocl!Classifier[$ocl!OclAny!oclIsTypeOf{T}($ocl!Classifier[T])?T]");
		symbol_140.setInstanceType(symbol_77);
		symbol_140.setUnspecializedElement(symbol_18);
		{
			TemplateBinding symbol_627 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_627.setSignature(symbol_19);
			{
				TemplateParameterSubstitution symbol_628 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_628.setFormal(symbol_20);	
				symbol_628.setActual(symbol_77);	
				symbol_627.getParameterSubstitutions().add(symbol_628);
			}
			symbol_140.getTemplateBindings().add(symbol_627);
		}
		symbol_140.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_140);
		//
		// ocl::$$::Classifier $ocl!Classifier[$ocl!OclSelf]
		//
		symbol_141.setName("Classifier");
		//symbol_141.setMoniker("$ocl!Classifier[$ocl!OclSelf]");
		symbol_141.setInstanceType(symbol_81);
		symbol_141.setUnspecializedElement(symbol_18);
		{
			TemplateBinding symbol_629 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_629.setSignature(symbol_19);
			{
				TemplateParameterSubstitution symbol_630 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_630.setFormal(symbol_20);	
				symbol_630.setActual(symbol_81);	
				symbol_629.getParameterSubstitutions().add(symbol_630);
			}
			symbol_141.getTemplateBindings().add(symbol_629);
		}
		symbol_141.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_141);
		//
		// ocl::$$::Classifier $ocl!Classifier[Real!oclAsType{TT}($ocl!Classifier[TT])?TT]
		//
		symbol_142.setName("Classifier");
		//symbol_142.setMoniker("$ocl!Classifier[Real!oclAsType{TT}($ocl!Classifier[TT])?TT]");
		symbol_142.setInstanceType(symbol_126);
		symbol_142.setUnspecializedElement(symbol_18);
		{
			TemplateBinding symbol_631 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_631.setSignature(symbol_19);
			{
				TemplateParameterSubstitution symbol_632 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_632.setFormal(symbol_20);	
				symbol_632.setActual(symbol_126);	
				symbol_631.getParameterSubstitutions().add(symbol_632);
			}
			symbol_142.getTemplateBindings().add(symbol_631);
		}
		symbol_142.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_142);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Bag{T}!flatten{T2}()?T2]
		//
		symbol_143.setName("Collection");
		//symbol_143.setMoniker("$ocl!Collection[$ocl!Bag{T}!flatten{T2}()?T2]");
		symbol_143.setElementType(symbol_17);
		symbol_143.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_633 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_633.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_634 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_634.setFormal(symbol_30);	
				symbol_634.setActual(symbol_17);	
				symbol_633.getParameterSubstitutions().add(symbol_634);
			}
			symbol_143.getTemplateBindings().add(symbol_633);
		}
		symbol_143.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_143);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Bag{T}?T]
		//
		symbol_144.setName("Collection");
		//symbol_144.setMoniker("$ocl!Collection[$ocl!Bag{T}?T]");
		symbol_144.setElementType(symbol_14);
		symbol_144.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_635 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_635.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_636 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_636.setFormal(symbol_30);	
				symbol_636.setActual(symbol_14);	
				symbol_635.getParameterSubstitutions().add(symbol_636);
			}
			symbol_144.getTemplateBindings().add(symbol_635);
		}
		symbol_144.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_144);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		//
		symbol_145.setName("Collection");
		//symbol_145.setMoniker("$ocl!Collection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]");
		symbol_145.setElementType(symbol_137);
		symbol_145.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_637 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_637.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_638 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_638.setFormal(symbol_30);	
				symbol_638.setActual(symbol_137);	
				symbol_637.getParameterSubstitutions().add(symbol_638);
			}
			symbol_145.getTemplateBindings().add(symbol_637);
		}
		symbol_145.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_145);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_146.setName("Collection");
		//symbol_146.setMoniker("$ocl!Collection[$ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_146.setElementType(symbol_34);
		symbol_146.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_639 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_639.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_640 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_640.setFormal(symbol_30);	
				symbol_640.setActual(symbol_34);	
				symbol_639.getParameterSubstitutions().add(symbol_640);
			}
			symbol_146.getTemplateBindings().add(symbol_639);
		}
		symbol_146.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_146);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])?T2]
		//
		symbol_147.setName("Collection");
		//symbol_147.setMoniker("$ocl!Collection[$ocl!Collection{T}!excludesAll{T2}($ocl!Collection[T2])?T2]");
		symbol_147.setElementType(symbol_40);
		symbol_147.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_641 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_641.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_642 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_642.setFormal(symbol_30);	
				symbol_642.setActual(symbol_40);	
				symbol_641.getParameterSubstitutions().add(symbol_642);
			}
			symbol_147.getTemplateBindings().add(symbol_641);
		}
		symbol_147.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_147);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Collection{T}!flatten{T2}()?T2]
		//
		symbol_148.setName("Collection");
		//symbol_148.setMoniker("$ocl!Collection[$ocl!Collection{T}!flatten{T2}()?T2]");
		symbol_148.setElementType(symbol_43);
		symbol_148.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_643 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_643.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_644 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_644.setFormal(symbol_30);	
				symbol_644.setActual(symbol_43);	
				symbol_643.getParameterSubstitutions().add(symbol_644);
			}
			symbol_148.getTemplateBindings().add(symbol_643);
		}
		symbol_148.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_148);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])?T2]
		//
		symbol_149.setName("Collection");
		//symbol_149.setMoniker("$ocl!Collection[$ocl!Collection{T}!includesAll{T2}($ocl!Collection[T2])?T2]");
		symbol_149.setElementType(symbol_46);
		symbol_149.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_645 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_645.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_646 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_646.setFormal(symbol_30);	
				symbol_646.setActual(symbol_46);	
				symbol_645.getParameterSubstitutions().add(symbol_646);
			}
			symbol_149.getTemplateBindings().add(symbol_645);
		}
		symbol_149.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_149);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2]
		//
		symbol_150.setName("Collection");
		//symbol_150.setMoniker("$ocl!Collection[$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2]");
		symbol_150.setElementType(symbol_52);
		symbol_150.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_647 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_647.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_648 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_648.setFormal(symbol_30);	
				symbol_648.setActual(symbol_52);	
				symbol_647.getParameterSubstitutions().add(symbol_648);
			}
			symbol_150.getTemplateBindings().add(symbol_647);
		}
		symbol_150.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_150);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Collection{T}?T]
		//
		symbol_151.setName("Collection");
		//symbol_151.setMoniker("$ocl!Collection[$ocl!Collection{T}?T]");
		symbol_151.setElementType(symbol_31);
		symbol_151.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_649 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_649.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_650 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_650.setFormal(symbol_30);	
				symbol_650.setActual(symbol_31);	
				symbol_649.getParameterSubstitutions().add(symbol_650);
			}
			symbol_151.getTemplateBindings().add(symbol_649);
		}
		symbol_151.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_151);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_152.setName("Collection");
		//symbol_152.setMoniker("$ocl!Collection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_152.setElementType(symbol_60);
		symbol_152.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_651 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_651.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_652 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_652.setFormal(symbol_30);	
				symbol_652.setActual(symbol_60);	
				symbol_651.getParameterSubstitutions().add(symbol_652);
			}
			symbol_152.getTemplateBindings().add(symbol_651);
		}
		symbol_152.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_152);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!NonOrderedCollection{T}?T]
		//
		symbol_153.setName("Collection");
		//symbol_153.setMoniker("$ocl!Collection[$ocl!NonOrderedCollection{T}?T]");
		symbol_153.setElementType(symbol_57);
		symbol_153.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_653 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_653.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_654 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_654.setFormal(symbol_30);	
				symbol_654.setActual(symbol_57);	
				symbol_653.getParameterSubstitutions().add(symbol_654);
			}
			symbol_153.getTemplateBindings().add(symbol_653);
		}
		symbol_153.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_153);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!NonUniqueCollection{T}?T]
		//
		symbol_154.setName("Collection");
		//symbol_154.setMoniker("$ocl!Collection[$ocl!NonUniqueCollection{T}?T]");
		symbol_154.setElementType(symbol_67);
		symbol_154.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_655 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_655.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_656 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_656.setFormal(symbol_30);	
				symbol_656.setActual(symbol_67);	
				symbol_655.getParameterSubstitutions().add(symbol_656);
			}
			symbol_154.getTemplateBindings().add(symbol_655);
		}
		symbol_154.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_154);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!OclAny]
		//
		symbol_155.setName("Collection");
		//symbol_155.setMoniker("$ocl!Collection[$ocl!OclAny]");
		symbol_155.setElementType(symbol_68);
		symbol_155.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_657 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_657.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_658 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_658.setFormal(symbol_30);	
				symbol_658.setActual(symbol_68);	
				symbol_657.getParameterSubstitutions().add(symbol_658);
			}
			symbol_155.getTemplateBindings().add(symbol_657);
		}
		symbol_155.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_155);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!OclSelf]
		//
		symbol_156.setName("Collection");
		//symbol_156.setMoniker("$ocl!Collection[$ocl!OclSelf]");
		symbol_156.setElementType(symbol_81);
		symbol_156.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_659 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_659.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_660 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_660.setFormal(symbol_30);	
				symbol_660.setActual(symbol_81);	
				symbol_659.getParameterSubstitutions().add(symbol_660);
			}
			symbol_156.getTemplateBindings().add(symbol_659);
		}
		symbol_156.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_156);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_157.setName("Collection");
		//symbol_157.setMoniker("$ocl!Collection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_157.setElementType(symbol_91);
		symbol_157.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_661 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_661.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_662 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_662.setFormal(symbol_30);	
				symbol_662.setActual(symbol_91);	
				symbol_661.getParameterSubstitutions().add(symbol_662);
			}
			symbol_157.getTemplateBindings().add(symbol_661);
		}
		symbol_157.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_157);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!OrderedCollection{T}?T]
		//
		symbol_158.setName("Collection");
		//symbol_158.setMoniker("$ocl!Collection[$ocl!OrderedCollection{T}?T]");
		symbol_158.setElementType(symbol_88);
		symbol_158.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_663 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_663.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_664 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_664.setFormal(symbol_30);	
				symbol_664.setActual(symbol_88);	
				symbol_663.getParameterSubstitutions().add(symbol_664);
			}
			symbol_158.getTemplateBindings().add(symbol_663);
		}
		symbol_158.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_158);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_159.setName("Collection");
		//symbol_159.setMoniker("$ocl!Collection[$ocl!OrderedSet{T}!flatten{T2}()?T2]");
		symbol_159.setElementType(symbol_101);
		symbol_159.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_665 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_665.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_666 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_666.setFormal(symbol_30);	
				symbol_666.setActual(symbol_101);	
				symbol_665.getParameterSubstitutions().add(symbol_666);
			}
			symbol_159.getTemplateBindings().add(symbol_665);
		}
		symbol_159.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_159);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!OrderedSet{T}?T]
		//
		symbol_160.setName("Collection");
		//symbol_160.setMoniker("$ocl!Collection[$ocl!OrderedSet{T}?T]");
		symbol_160.setElementType(symbol_98);
		symbol_160.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_667 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_667.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_668 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_668.setFormal(symbol_30);	
				symbol_668.setActual(symbol_98);	
				symbol_667.getParameterSubstitutions().add(symbol_668);
			}
			symbol_160.getTemplateBindings().add(symbol_667);
		}
		symbol_160.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_160);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_161.setName("Collection");
		//symbol_161.setMoniker("$ocl!Collection[$ocl!Sequence{T}!flatten{T2}()?T2]");
		symbol_161.setElementType(symbol_108);
		symbol_161.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_669 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_669.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_670 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_670.setFormal(symbol_30);	
				symbol_670.setActual(symbol_108);	
				symbol_669.getParameterSubstitutions().add(symbol_670);
			}
			symbol_161.getTemplateBindings().add(symbol_669);
		}
		symbol_161.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_161);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Sequence{T}?T]
		//
		symbol_162.setName("Collection");
		//symbol_162.setMoniker("$ocl!Collection[$ocl!Sequence{T}?T]");
		symbol_162.setElementType(symbol_105);
		symbol_162.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_671 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_671.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_672 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_672.setFormal(symbol_30);	
				symbol_672.setActual(symbol_105);	
				symbol_671.getParameterSubstitutions().add(symbol_672);
			}
			symbol_162.getTemplateBindings().add(symbol_671);
		}
		symbol_162.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_162);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Set{T}!flatten{T2}()?T2]
		//
		symbol_163.setName("Collection");
		//symbol_163.setMoniker("$ocl!Collection[$ocl!Set{T}!flatten{T2}()?T2]");
		symbol_163.setElementType(symbol_115);
		symbol_163.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_673 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_673.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_674 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_674.setFormal(symbol_30);	
				symbol_674.setActual(symbol_115);	
				symbol_673.getParameterSubstitutions().add(symbol_674);
			}
			symbol_163.getTemplateBindings().add(symbol_673);
		}
		symbol_163.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_163);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!Set{T}?T]
		//
		symbol_164.setName("Collection");
		//symbol_164.setMoniker("$ocl!Collection[$ocl!Set{T}?T]");
		symbol_164.setElementType(symbol_112);
		symbol_164.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_675 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_675.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_676 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_676.setFormal(symbol_30);	
				symbol_676.setActual(symbol_112);	
				symbol_675.getParameterSubstitutions().add(symbol_676);
			}
			symbol_164.getTemplateBindings().add(symbol_675);
		}
		symbol_164.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_164);
		//
		// ocl::$$::Collection $ocl!Collection[$ocl!UniqueCollection{T}?T]
		//
		symbol_165.setName("Collection");
		//symbol_165.setMoniker("$ocl!Collection[$ocl!UniqueCollection{T}?T]");
		symbol_165.setElementType(symbol_120);
		symbol_165.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_677 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_677.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_678 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_678.setFormal(symbol_30);	
				symbol_678.setActual(symbol_120);	
				symbol_677.getParameterSubstitutions().add(symbol_678);
			}
			symbol_165.getTemplateBindings().add(symbol_677);
		}
		symbol_165.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_165);
		//
		// ocl::$$::Collection $ocl!Collection[String]
		//
		symbol_166.setName("Collection");
		//symbol_166.setMoniker("$ocl!Collection[String]");
		symbol_166.setElementType(symbol_127);
		symbol_166.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_679 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_679.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_680 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_680.setFormal(symbol_30);	
				symbol_680.setActual(symbol_127);	
				symbol_679.getParameterSubstitutions().add(symbol_680);
			}
			symbol_166.getTemplateBindings().add(symbol_679);
		}
		symbol_166.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_166);
		//
		// ocl::$$::Collection $ocl!Collection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		//
		symbol_167.setName("Collection");
		//symbol_167.setMoniker("$ocl!Collection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]");
		symbol_167.setElementType(symbol_247);
		symbol_167.setUnspecializedElement(symbol_28);
		{
			TemplateBinding symbol_681 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_681.setSignature(symbol_29);
			{
				TemplateParameterSubstitution symbol_682 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_682.setFormal(symbol_30);	
				symbol_682.setActual(symbol_247);	
				symbol_681.getParameterSubstitutions().add(symbol_682);
			}
			symbol_167.getTemplateBindings().add(symbol_681);
		}
		symbol_167.getSuperClasses().add(symbol_68); // $ocl!OclAny
		symbol_129.getOwnedTypes().add(symbol_167);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!Bag{T}!flatten{T2}()?T2]
		//
		symbol_168.setName("NonOrderedCollection");
		//symbol_168.setMoniker("$ocl!NonOrderedCollection[$ocl!Bag{T}!flatten{T2}()?T2]");
		symbol_168.setElementType(symbol_17);
		symbol_168.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_683 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_683.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_684 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_684.setFormal(symbol_56);	
				symbol_684.setActual(symbol_17);	
				symbol_683.getParameterSubstitutions().add(symbol_684);
			}
			symbol_168.getTemplateBindings().add(symbol_683);
		}
		symbol_168.getSuperClasses().add(symbol_143); // $ocl!Collection[$ocl!Bag{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_168);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!Bag{T}?T]
		//
		symbol_169.setName("NonOrderedCollection");
		//symbol_169.setMoniker("$ocl!NonOrderedCollection[$ocl!Bag{T}?T]");
		symbol_169.setElementType(symbol_14);
		symbol_169.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_685 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_685.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_686 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_686.setFormal(symbol_56);	
				symbol_686.setActual(symbol_14);	
				symbol_685.getParameterSubstitutions().add(symbol_686);
			}
			symbol_169.getTemplateBindings().add(symbol_685);
		}
		symbol_169.getSuperClasses().add(symbol_144); // $ocl!Collection[$ocl!Bag{T}?T]
		symbol_129.getOwnedTypes().add(symbol_169);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		//
		symbol_170.setName("NonOrderedCollection");
		//symbol_170.setMoniker("$ocl!NonOrderedCollection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]");
		symbol_170.setElementType(symbol_137);
		symbol_170.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_687 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_687.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_688 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_688.setFormal(symbol_56);	
				symbol_688.setActual(symbol_137);	
				symbol_687.getParameterSubstitutions().add(symbol_688);
			}
			symbol_170.getTemplateBindings().add(symbol_687);
		}
		symbol_170.getSuperClasses().add(symbol_145); // $ocl!Collection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		symbol_129.getOwnedTypes().add(symbol_170);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!Collection{T}?T]
		//
		symbol_171.setName("NonOrderedCollection");
		//symbol_171.setMoniker("$ocl!NonOrderedCollection[$ocl!Collection{T}?T]");
		symbol_171.setElementType(symbol_31);
		symbol_171.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_689 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_689.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_690 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_690.setFormal(symbol_56);	
				symbol_690.setActual(symbol_31);	
				symbol_689.getParameterSubstitutions().add(symbol_690);
			}
			symbol_171.getTemplateBindings().add(symbol_689);
		}
		symbol_171.getSuperClasses().add(symbol_28); // $ocl!Collection{T}
		symbol_129.getOwnedTypes().add(symbol_171);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_172.setName("NonOrderedCollection");
		//symbol_172.setMoniker("$ocl!NonOrderedCollection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_172.setElementType(symbol_60);
		symbol_172.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_691 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_691.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_692 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_692.setFormal(symbol_56);	
				symbol_692.setActual(symbol_60);	
				symbol_691.getParameterSubstitutions().add(symbol_692);
			}
			symbol_172.getTemplateBindings().add(symbol_691);
		}
		symbol_172.getSuperClasses().add(symbol_152); // $ocl!Collection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_129.getOwnedTypes().add(symbol_172);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!OclAny]
		//
		symbol_173.setName("NonOrderedCollection");
		//symbol_173.setMoniker("$ocl!NonOrderedCollection[$ocl!OclAny]");
		symbol_173.setElementType(symbol_68);
		symbol_173.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_693 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_693.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_694 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_694.setFormal(symbol_56);	
				symbol_694.setActual(symbol_68);	
				symbol_693.getParameterSubstitutions().add(symbol_694);
			}
			symbol_173.getTemplateBindings().add(symbol_693);
		}
		symbol_173.getSuperClasses().add(symbol_155); // $ocl!Collection[$ocl!OclAny]
		symbol_129.getOwnedTypes().add(symbol_173);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!OclSelf]
		//
		symbol_174.setName("NonOrderedCollection");
		//symbol_174.setMoniker("$ocl!NonOrderedCollection[$ocl!OclSelf]");
		symbol_174.setElementType(symbol_81);
		symbol_174.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_695 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_695.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_696 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_696.setFormal(symbol_56);	
				symbol_696.setActual(symbol_81);	
				symbol_695.getParameterSubstitutions().add(symbol_696);
			}
			symbol_174.getTemplateBindings().add(symbol_695);
		}
		symbol_174.getSuperClasses().add(symbol_156); // $ocl!Collection[$ocl!OclSelf]
		symbol_129.getOwnedTypes().add(symbol_174);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!OrderedSet{T}?T]
		//
		symbol_175.setName("NonOrderedCollection");
		//symbol_175.setMoniker("$ocl!NonOrderedCollection[$ocl!OrderedSet{T}?T]");
		symbol_175.setElementType(symbol_98);
		symbol_175.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_697 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_697.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_698 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_698.setFormal(symbol_56);	
				symbol_698.setActual(symbol_98);	
				symbol_697.getParameterSubstitutions().add(symbol_698);
			}
			symbol_175.getTemplateBindings().add(symbol_697);
		}
		symbol_175.getSuperClasses().add(symbol_160); // $ocl!Collection[$ocl!OrderedSet{T}?T]
		symbol_129.getOwnedTypes().add(symbol_175);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!Set{T}!flatten{T2}()?T2]
		//
		symbol_176.setName("NonOrderedCollection");
		//symbol_176.setMoniker("$ocl!NonOrderedCollection[$ocl!Set{T}!flatten{T2}()?T2]");
		symbol_176.setElementType(symbol_115);
		symbol_176.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_699 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_699.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_700 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_700.setFormal(symbol_56);	
				symbol_700.setActual(symbol_115);	
				symbol_699.getParameterSubstitutions().add(symbol_700);
			}
			symbol_176.getTemplateBindings().add(symbol_699);
		}
		symbol_176.getSuperClasses().add(symbol_163); // $ocl!Collection[$ocl!Set{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_176);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[$ocl!Set{T}?T]
		//
		symbol_177.setName("NonOrderedCollection");
		//symbol_177.setMoniker("$ocl!NonOrderedCollection[$ocl!Set{T}?T]");
		symbol_177.setElementType(symbol_112);
		symbol_177.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_701 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_701.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_702 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_702.setFormal(symbol_56);	
				symbol_702.setActual(symbol_112);	
				symbol_701.getParameterSubstitutions().add(symbol_702);
			}
			symbol_177.getTemplateBindings().add(symbol_701);
		}
		symbol_177.getSuperClasses().add(symbol_164); // $ocl!Collection[$ocl!Set{T}?T]
		symbol_129.getOwnedTypes().add(symbol_177);
		//
		// ocl::$$::NonOrderedCollection $ocl!NonOrderedCollection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		//
		symbol_178.setName("NonOrderedCollection");
		//symbol_178.setMoniker("$ocl!NonOrderedCollection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]");
		symbol_178.setElementType(symbol_247);
		symbol_178.setUnspecializedElement(symbol_54);
		{
			TemplateBinding symbol_703 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_703.setSignature(symbol_55);
			{
				TemplateParameterSubstitution symbol_704 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_704.setFormal(symbol_56);	
				symbol_704.setActual(symbol_247);	
				symbol_703.getParameterSubstitutions().add(symbol_704);
			}
			symbol_178.getTemplateBindings().add(symbol_703);
		}
		symbol_178.getSuperClasses().add(symbol_167); // $ocl!Collection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		symbol_129.getOwnedTypes().add(symbol_178);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!Bag{T}!flatten{T2}()?T2]
		//
		symbol_179.setName("NonUniqueCollection");
		//symbol_179.setMoniker("$ocl!NonUniqueCollection[$ocl!Bag{T}!flatten{T2}()?T2]");
		symbol_179.setElementType(symbol_17);
		symbol_179.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_705 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_705.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_706 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_706.setFormal(symbol_66);	
				symbol_706.setActual(symbol_17);	
				symbol_705.getParameterSubstitutions().add(symbol_706);
			}
			symbol_179.getTemplateBindings().add(symbol_705);
		}
		symbol_179.getSuperClasses().add(symbol_143); // $ocl!Collection[$ocl!Bag{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_179);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!Bag{T}?T]
		//
		symbol_180.setName("NonUniqueCollection");
		//symbol_180.setMoniker("$ocl!NonUniqueCollection[$ocl!Bag{T}?T]");
		symbol_180.setElementType(symbol_14);
		symbol_180.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_707 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_707.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_708 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_708.setFormal(symbol_66);	
				symbol_708.setActual(symbol_14);	
				symbol_707.getParameterSubstitutions().add(symbol_708);
			}
			symbol_180.getTemplateBindings().add(symbol_707);
		}
		symbol_180.getSuperClasses().add(symbol_144); // $ocl!Collection[$ocl!Bag{T}?T]
		symbol_129.getOwnedTypes().add(symbol_180);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!Collection{T}?T]
		//
		symbol_181.setName("NonUniqueCollection");
		//symbol_181.setMoniker("$ocl!NonUniqueCollection[$ocl!Collection{T}?T]");
		symbol_181.setElementType(symbol_31);
		symbol_181.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_709 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_709.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_710 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_710.setFormal(symbol_66);	
				symbol_710.setActual(symbol_31);	
				symbol_709.getParameterSubstitutions().add(symbol_710);
			}
			symbol_181.getTemplateBindings().add(symbol_709);
		}
		symbol_181.getSuperClasses().add(symbol_28); // $ocl!Collection{T}
		symbol_129.getOwnedTypes().add(symbol_181);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_182.setName("NonUniqueCollection");
		//symbol_182.setMoniker("$ocl!NonUniqueCollection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_182.setElementType(symbol_60);
		symbol_182.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_711 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_711.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_712 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_712.setFormal(symbol_66);	
				symbol_712.setActual(symbol_60);	
				symbol_711.getParameterSubstitutions().add(symbol_712);
			}
			symbol_182.getTemplateBindings().add(symbol_711);
		}
		symbol_182.getSuperClasses().add(symbol_152); // $ocl!Collection[$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_129.getOwnedTypes().add(symbol_182);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!NonOrderedCollection{T}?T]
		//
		symbol_183.setName("NonUniqueCollection");
		//symbol_183.setMoniker("$ocl!NonUniqueCollection[$ocl!NonOrderedCollection{T}?T]");
		symbol_183.setElementType(symbol_57);
		symbol_183.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_713 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_713.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_714 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_714.setFormal(symbol_66);	
				symbol_714.setActual(symbol_57);	
				symbol_713.getParameterSubstitutions().add(symbol_714);
			}
			symbol_183.getTemplateBindings().add(symbol_713);
		}
		symbol_183.getSuperClasses().add(symbol_153); // $ocl!Collection[$ocl!NonOrderedCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_183);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_184.setName("NonUniqueCollection");
		//symbol_184.setMoniker("$ocl!NonUniqueCollection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_184.setElementType(symbol_91);
		symbol_184.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_715 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_715.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_716 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_716.setFormal(symbol_66);	
				symbol_716.setActual(symbol_91);	
				symbol_715.getParameterSubstitutions().add(symbol_716);
			}
			symbol_184.getTemplateBindings().add(symbol_715);
		}
		symbol_184.getSuperClasses().add(symbol_157); // $ocl!Collection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_129.getOwnedTypes().add(symbol_184);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!OrderedCollection{T}?T]
		//
		symbol_185.setName("NonUniqueCollection");
		//symbol_185.setMoniker("$ocl!NonUniqueCollection[$ocl!OrderedCollection{T}?T]");
		symbol_185.setElementType(symbol_88);
		symbol_185.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_717 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_717.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_718 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_718.setFormal(symbol_66);	
				symbol_718.setActual(symbol_88);	
				symbol_717.getParameterSubstitutions().add(symbol_718);
			}
			symbol_185.getTemplateBindings().add(symbol_717);
		}
		symbol_185.getSuperClasses().add(symbol_158); // $ocl!Collection[$ocl!OrderedCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_185);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_186.setName("NonUniqueCollection");
		//symbol_186.setMoniker("$ocl!NonUniqueCollection[$ocl!Sequence{T}!flatten{T2}()?T2]");
		symbol_186.setElementType(symbol_108);
		symbol_186.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_719 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_719.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_720 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_720.setFormal(symbol_66);	
				symbol_720.setActual(symbol_108);	
				symbol_719.getParameterSubstitutions().add(symbol_720);
			}
			symbol_186.getTemplateBindings().add(symbol_719);
		}
		symbol_186.getSuperClasses().add(symbol_161); // $ocl!Collection[$ocl!Sequence{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_186);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[$ocl!Sequence{T}?T]
		//
		symbol_187.setName("NonUniqueCollection");
		//symbol_187.setMoniker("$ocl!NonUniqueCollection[$ocl!Sequence{T}?T]");
		symbol_187.setElementType(symbol_105);
		symbol_187.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_721 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_721.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_722 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_722.setFormal(symbol_66);	
				symbol_722.setActual(symbol_105);	
				symbol_721.getParameterSubstitutions().add(symbol_722);
			}
			symbol_187.getTemplateBindings().add(symbol_721);
		}
		symbol_187.getSuperClasses().add(symbol_162); // $ocl!Collection[$ocl!Sequence{T}?T]
		symbol_129.getOwnedTypes().add(symbol_187);
		//
		// ocl::$$::NonUniqueCollection $ocl!NonUniqueCollection[String]
		//
		symbol_188.setName("NonUniqueCollection");
		//symbol_188.setMoniker("$ocl!NonUniqueCollection[String]");
		symbol_188.setElementType(symbol_127);
		symbol_188.setUnspecializedElement(symbol_64);
		{
			TemplateBinding symbol_723 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_723.setSignature(symbol_65);
			{
				TemplateParameterSubstitution symbol_724 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_724.setFormal(symbol_66);	
				symbol_724.setActual(symbol_127);	
				symbol_723.getParameterSubstitutions().add(symbol_724);
			}
			symbol_188.getTemplateBindings().add(symbol_723);
		}
		symbol_188.getSuperClasses().add(symbol_166); // $ocl!Collection[String]
		symbol_129.getOwnedTypes().add(symbol_188);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!Collection{T}?T]
		//
		symbol_189.setName("OrderedCollection");
		//symbol_189.setMoniker("$ocl!OrderedCollection[$ocl!Collection{T}?T]");
		symbol_189.setElementType(symbol_31);
		symbol_189.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_725 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_725.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_726 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_726.setFormal(symbol_87);	
				symbol_726.setActual(symbol_31);	
				symbol_725.getParameterSubstitutions().add(symbol_726);
			}
			symbol_189.getTemplateBindings().add(symbol_725);
		}
		symbol_189.getSuperClasses().add(symbol_28); // $ocl!Collection{T}
		symbol_129.getOwnedTypes().add(symbol_189);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!NonUniqueCollection{T}?T]
		//
		symbol_190.setName("OrderedCollection");
		//symbol_190.setMoniker("$ocl!OrderedCollection[$ocl!NonUniqueCollection{T}?T]");
		symbol_190.setElementType(symbol_67);
		symbol_190.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_727 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_727.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_728 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_728.setFormal(symbol_87);	
				symbol_728.setActual(symbol_67);	
				symbol_727.getParameterSubstitutions().add(symbol_728);
			}
			symbol_190.getTemplateBindings().add(symbol_727);
		}
		symbol_190.getSuperClasses().add(symbol_154); // $ocl!Collection[$ocl!NonUniqueCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_190);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_191.setName("OrderedCollection");
		//symbol_191.setMoniker("$ocl!OrderedCollection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_191.setElementType(symbol_91);
		symbol_191.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_729 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_729.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_730 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_730.setFormal(symbol_87);	
				symbol_730.setActual(symbol_91);	
				symbol_729.getParameterSubstitutions().add(symbol_730);
			}
			symbol_191.getTemplateBindings().add(symbol_729);
		}
		symbol_191.getSuperClasses().add(symbol_157); // $ocl!Collection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_129.getOwnedTypes().add(symbol_191);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!OrderedCollection{T}?T]
		//
		symbol_192.setName("OrderedCollection");
		//symbol_192.setMoniker("$ocl!OrderedCollection[$ocl!OrderedCollection{T}?T]");
		symbol_192.setElementType(symbol_88);
		symbol_192.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_731 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_731.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_732 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_732.setFormal(symbol_87);	
				symbol_732.setActual(symbol_88);	
				symbol_731.getParameterSubstitutions().add(symbol_732);
			}
			symbol_192.getTemplateBindings().add(symbol_731);
		}
		symbol_192.getSuperClasses().add(symbol_158); // $ocl!Collection[$ocl!OrderedCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_192);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_193.setName("OrderedCollection");
		//symbol_193.setMoniker("$ocl!OrderedCollection[$ocl!OrderedSet{T}!flatten{T2}()?T2]");
		symbol_193.setElementType(symbol_101);
		symbol_193.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_733 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_733.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_734 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_734.setFormal(symbol_87);	
				symbol_734.setActual(symbol_101);	
				symbol_733.getParameterSubstitutions().add(symbol_734);
			}
			symbol_193.getTemplateBindings().add(symbol_733);
		}
		symbol_193.getSuperClasses().add(symbol_159); // $ocl!Collection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_193);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!OrderedSet{T}?T]
		//
		symbol_194.setName("OrderedCollection");
		//symbol_194.setMoniker("$ocl!OrderedCollection[$ocl!OrderedSet{T}?T]");
		symbol_194.setElementType(symbol_98);
		symbol_194.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_735 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_735.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_736 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_736.setFormal(symbol_87);	
				symbol_736.setActual(symbol_98);	
				symbol_735.getParameterSubstitutions().add(symbol_736);
			}
			symbol_194.getTemplateBindings().add(symbol_735);
		}
		symbol_194.getSuperClasses().add(symbol_160); // $ocl!Collection[$ocl!OrderedSet{T}?T]
		symbol_129.getOwnedTypes().add(symbol_194);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_195.setName("OrderedCollection");
		//symbol_195.setMoniker("$ocl!OrderedCollection[$ocl!Sequence{T}!flatten{T2}()?T2]");
		symbol_195.setElementType(symbol_108);
		symbol_195.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_737 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_737.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_738 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_738.setFormal(symbol_87);	
				symbol_738.setActual(symbol_108);	
				symbol_737.getParameterSubstitutions().add(symbol_738);
			}
			symbol_195.getTemplateBindings().add(symbol_737);
		}
		symbol_195.getSuperClasses().add(symbol_161); // $ocl!Collection[$ocl!Sequence{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_195);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!Sequence{T}?T]
		//
		symbol_196.setName("OrderedCollection");
		//symbol_196.setMoniker("$ocl!OrderedCollection[$ocl!Sequence{T}?T]");
		symbol_196.setElementType(symbol_105);
		symbol_196.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_739 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_739.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_740 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_740.setFormal(symbol_87);	
				symbol_740.setActual(symbol_105);	
				symbol_739.getParameterSubstitutions().add(symbol_740);
			}
			symbol_196.getTemplateBindings().add(symbol_739);
		}
		symbol_196.getSuperClasses().add(symbol_162); // $ocl!Collection[$ocl!Sequence{T}?T]
		symbol_129.getOwnedTypes().add(symbol_196);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[$ocl!UniqueCollection{T}?T]
		//
		symbol_197.setName("OrderedCollection");
		//symbol_197.setMoniker("$ocl!OrderedCollection[$ocl!UniqueCollection{T}?T]");
		symbol_197.setElementType(symbol_120);
		symbol_197.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_741 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_741.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_742 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_742.setFormal(symbol_87);	
				symbol_742.setActual(symbol_120);	
				symbol_741.getParameterSubstitutions().add(symbol_742);
			}
			symbol_197.getTemplateBindings().add(symbol_741);
		}
		symbol_197.getSuperClasses().add(symbol_165); // $ocl!Collection[$ocl!UniqueCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_197);
		//
		// ocl::$$::OrderedCollection $ocl!OrderedCollection[String]
		//
		symbol_198.setName("OrderedCollection");
		//symbol_198.setMoniker("$ocl!OrderedCollection[String]");
		symbol_198.setElementType(symbol_127);
		symbol_198.setUnspecializedElement(symbol_85);
		{
			TemplateBinding symbol_743 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_743.setSignature(symbol_86);
			{
				TemplateParameterSubstitution symbol_744 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_744.setFormal(symbol_87);	
				symbol_744.setActual(symbol_127);	
				symbol_743.getParameterSubstitutions().add(symbol_744);
			}
			symbol_198.getTemplateBindings().add(symbol_743);
		}
		symbol_198.getSuperClasses().add(symbol_166); // $ocl!Collection[String]
		symbol_129.getOwnedTypes().add(symbol_198);
		//
		// ocl::$$::OrderedSet $ocl!OrderedSet[$ocl!Collection{T}?T]
		//
		symbol_199.setName("OrderedSet");
		//symbol_199.setMoniker("$ocl!OrderedSet[$ocl!Collection{T}?T]");
		symbol_199.setElementType(symbol_31);
		symbol_199.setUnspecializedElement(symbol_95);
		{
			TemplateBinding symbol_745 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_745.setSignature(symbol_96);
			{
				TemplateParameterSubstitution symbol_746 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_746.setFormal(symbol_97);	
				symbol_746.setActual(symbol_31);	
				symbol_745.getParameterSubstitutions().add(symbol_746);
			}
			symbol_199.getTemplateBindings().add(symbol_745);
		}
		symbol_199.getSuperClasses().add(symbol_189); // $ocl!OrderedCollection[$ocl!Collection{T}?T]
		symbol_199.getSuperClasses().add(symbol_221); // $ocl!UniqueCollection[$ocl!Collection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_199);
		//
		// ocl::$$::OrderedSet $ocl!OrderedSet[$ocl!OrderedCollection{T}?T]
		//
		symbol_200.setName("OrderedSet");
		//symbol_200.setMoniker("$ocl!OrderedSet[$ocl!OrderedCollection{T}?T]");
		symbol_200.setElementType(symbol_88);
		symbol_200.setUnspecializedElement(symbol_95);
		{
			TemplateBinding symbol_747 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_747.setSignature(symbol_96);
			{
				TemplateParameterSubstitution symbol_748 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_748.setFormal(symbol_97);	
				symbol_748.setActual(symbol_88);	
				symbol_747.getParameterSubstitutions().add(symbol_748);
			}
			symbol_200.getTemplateBindings().add(symbol_747);
		}
		symbol_200.getSuperClasses().add(symbol_85); // $ocl!OrderedCollection{T}
		symbol_200.getSuperClasses().add(symbol_225); // $ocl!UniqueCollection[$ocl!OrderedCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_200);
		//
		// ocl::$$::OrderedSet $ocl!OrderedSet[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_201.setName("OrderedSet");
		//symbol_201.setMoniker("$ocl!OrderedSet[$ocl!OrderedSet{T}!flatten{T2}()?T2]");
		symbol_201.setElementType(symbol_101);
		symbol_201.setUnspecializedElement(symbol_95);
		{
			TemplateBinding symbol_749 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_749.setSignature(symbol_96);
			{
				TemplateParameterSubstitution symbol_750 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_750.setFormal(symbol_97);	
				symbol_750.setActual(symbol_101);	
				symbol_749.getParameterSubstitutions().add(symbol_750);
			}
			symbol_201.getTemplateBindings().add(symbol_749);
		}
		symbol_201.getSuperClasses().add(symbol_193); // $ocl!OrderedCollection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		symbol_201.getSuperClasses().add(symbol_226); // $ocl!UniqueCollection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_201);
		//
		// ocl::$$::OrderedSet $ocl!OrderedSet[$ocl!OrderedSet{T}?T]
		//
		symbol_202.setName("OrderedSet");
		//symbol_202.setMoniker("$ocl!OrderedSet[$ocl!OrderedSet{T}?T]");
		symbol_202.setElementType(symbol_98);
		symbol_202.setUnspecializedElement(symbol_95);
		{
			TemplateBinding symbol_751 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_751.setSignature(symbol_96);
			{
				TemplateParameterSubstitution symbol_752 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_752.setFormal(symbol_97);	
				symbol_752.setActual(symbol_98);	
				symbol_751.getParameterSubstitutions().add(symbol_752);
			}
			symbol_202.getTemplateBindings().add(symbol_751);
		}
		symbol_202.getSuperClasses().add(symbol_194); // $ocl!OrderedCollection[$ocl!OrderedSet{T}?T]
		symbol_202.getSuperClasses().add(symbol_227); // $ocl!UniqueCollection[$ocl!OrderedSet{T}?T]
		symbol_129.getOwnedTypes().add(symbol_202);
		//
		// ocl::$$::OrderedSet $ocl!OrderedSet[$ocl!UniqueCollection{T}?T]
		//
		symbol_203.setName("OrderedSet");
		//symbol_203.setMoniker("$ocl!OrderedSet[$ocl!UniqueCollection{T}?T]");
		symbol_203.setElementType(symbol_120);
		symbol_203.setUnspecializedElement(symbol_95);
		{
			TemplateBinding symbol_753 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_753.setSignature(symbol_96);
			{
				TemplateParameterSubstitution symbol_754 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_754.setFormal(symbol_97);	
				symbol_754.setActual(symbol_120);	
				symbol_753.getParameterSubstitutions().add(symbol_754);
			}
			symbol_203.getTemplateBindings().add(symbol_753);
		}
		symbol_203.getSuperClasses().add(symbol_117); // $ocl!UniqueCollection{T}
		symbol_203.getSuperClasses().add(symbol_197); // $ocl!OrderedCollection[$ocl!UniqueCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_203);
		//
		// ocl::$$::Sequence $ocl!Sequence[$ocl!Collection{T}?T]
		//
		symbol_204.setName("Sequence");
		//symbol_204.setMoniker("$ocl!Sequence[$ocl!Collection{T}?T]");
		symbol_204.setElementType(symbol_31);
		symbol_204.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_755 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_755.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_756 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_756.setFormal(symbol_104);	
				symbol_756.setActual(symbol_31);	
				symbol_755.getParameterSubstitutions().add(symbol_756);
			}
			symbol_204.getTemplateBindings().add(symbol_755);
		}
		symbol_204.getSuperClasses().add(symbol_189); // $ocl!OrderedCollection[$ocl!Collection{T}?T]
		symbol_204.getSuperClasses().add(symbol_181); // $ocl!NonUniqueCollection[$ocl!Collection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_204);
		//
		// ocl::$$::Sequence $ocl!Sequence[$ocl!NonUniqueCollection{T}?T]
		//
		symbol_205.setName("Sequence");
		//symbol_205.setMoniker("$ocl!Sequence[$ocl!NonUniqueCollection{T}?T]");
		symbol_205.setElementType(symbol_67);
		symbol_205.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_757 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_757.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_758 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_758.setFormal(symbol_104);	
				symbol_758.setActual(symbol_67);	
				symbol_757.getParameterSubstitutions().add(symbol_758);
			}
			symbol_205.getTemplateBindings().add(symbol_757);
		}
		symbol_205.getSuperClasses().add(symbol_190); // $ocl!OrderedCollection[$ocl!NonUniqueCollection{T}?T]
		symbol_205.getSuperClasses().add(symbol_64); // $ocl!NonUniqueCollection{T}
		symbol_129.getOwnedTypes().add(symbol_205);
		//
		// ocl::$$::Sequence $ocl!Sequence[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		//
		symbol_206.setName("Sequence");
		//symbol_206.setMoniker("$ocl!Sequence[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]");
		symbol_206.setElementType(symbol_91);
		symbol_206.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_759 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_759.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_760 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_760.setFormal(symbol_104);	
				symbol_760.setActual(symbol_91);	
				symbol_759.getParameterSubstitutions().add(symbol_760);
			}
			symbol_206.getTemplateBindings().add(symbol_759);
		}
		symbol_206.getSuperClasses().add(symbol_191); // $ocl!OrderedCollection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_206.getSuperClasses().add(symbol_184); // $ocl!NonUniqueCollection[$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V]
		symbol_129.getOwnedTypes().add(symbol_206);
		//
		// ocl::$$::Sequence $ocl!Sequence[$ocl!OrderedCollection{T}?T]
		//
		symbol_207.setName("Sequence");
		//symbol_207.setMoniker("$ocl!Sequence[$ocl!OrderedCollection{T}?T]");
		symbol_207.setElementType(symbol_88);
		symbol_207.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_761 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_761.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_762 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_762.setFormal(symbol_104);	
				symbol_762.setActual(symbol_88);	
				symbol_761.getParameterSubstitutions().add(symbol_762);
			}
			symbol_207.getTemplateBindings().add(symbol_761);
		}
		symbol_207.getSuperClasses().add(symbol_185); // $ocl!NonUniqueCollection[$ocl!OrderedCollection{T}?T]
		symbol_207.getSuperClasses().add(symbol_85); // $ocl!OrderedCollection{T}
		symbol_129.getOwnedTypes().add(symbol_207);
		//
		// ocl::$$::Sequence $ocl!Sequence[$ocl!Sequence{T}!flatten{T2}()?T2]
		//
		symbol_208.setName("Sequence");
		//symbol_208.setMoniker("$ocl!Sequence[$ocl!Sequence{T}!flatten{T2}()?T2]");
		symbol_208.setElementType(symbol_108);
		symbol_208.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_763 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_763.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_764 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_764.setFormal(symbol_104);	
				symbol_764.setActual(symbol_108);	
				symbol_763.getParameterSubstitutions().add(symbol_764);
			}
			symbol_208.getTemplateBindings().add(symbol_763);
		}
		symbol_208.getSuperClasses().add(symbol_186); // $ocl!NonUniqueCollection[$ocl!Sequence{T}!flatten{T2}()?T2]
		symbol_208.getSuperClasses().add(symbol_195); // $ocl!OrderedCollection[$ocl!Sequence{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_208);
		//
		// ocl::$$::Sequence $ocl!Sequence[$ocl!Sequence{T}?T]
		//
		symbol_209.setName("Sequence");
		//symbol_209.setMoniker("$ocl!Sequence[$ocl!Sequence{T}?T]");
		symbol_209.setElementType(symbol_105);
		symbol_209.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_765 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_765.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_766 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_766.setFormal(symbol_104);	
				symbol_766.setActual(symbol_105);	
				symbol_765.getParameterSubstitutions().add(symbol_766);
			}
			symbol_209.getTemplateBindings().add(symbol_765);
		}
		symbol_209.getSuperClasses().add(symbol_187); // $ocl!NonUniqueCollection[$ocl!Sequence{T}?T]
		symbol_209.getSuperClasses().add(symbol_196); // $ocl!OrderedCollection[$ocl!Sequence{T}?T]
		symbol_129.getOwnedTypes().add(symbol_209);
		//
		// ocl::$$::Sequence $ocl!Sequence[String]
		//
		symbol_210.setName("Sequence");
		//symbol_210.setMoniker("$ocl!Sequence[String]");
		symbol_210.setElementType(symbol_127);
		symbol_210.setUnspecializedElement(symbol_102);
		{
			TemplateBinding symbol_767 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_767.setSignature(symbol_103);
			{
				TemplateParameterSubstitution symbol_768 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_768.setFormal(symbol_104);	
				symbol_768.setActual(symbol_127);	
				symbol_767.getParameterSubstitutions().add(symbol_768);
			}
			symbol_210.getTemplateBindings().add(symbol_767);
		}
		symbol_210.getSuperClasses().add(symbol_198); // $ocl!OrderedCollection[String]
		symbol_210.getSuperClasses().add(symbol_188); // $ocl!NonUniqueCollection[String]
		symbol_129.getOwnedTypes().add(symbol_210);
		//
		// ocl::$$::Set $ocl!Set[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		//
		symbol_211.setName("Set");
		//symbol_211.setMoniker("$ocl!Set[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]");
		symbol_211.setElementType(symbol_137);
		symbol_211.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_769 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_769.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_770 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_770.setFormal(symbol_111);	
				symbol_770.setActual(symbol_137);	
				symbol_769.getParameterSubstitutions().add(symbol_770);
			}
			symbol_211.getTemplateBindings().add(symbol_769);
		}
		symbol_211.getSuperClasses().add(symbol_220); // $ocl!UniqueCollection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		symbol_211.getSuperClasses().add(symbol_170); // $ocl!NonOrderedCollection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		symbol_129.getOwnedTypes().add(symbol_211);
		//
		// ocl::$$::Set $ocl!Set[$ocl!Collection{T}?T]
		//
		symbol_212.setName("Set");
		//symbol_212.setMoniker("$ocl!Set[$ocl!Collection{T}?T]");
		symbol_212.setElementType(symbol_31);
		symbol_212.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_771 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_771.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_772 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_772.setFormal(symbol_111);	
				symbol_772.setActual(symbol_31);	
				symbol_771.getParameterSubstitutions().add(symbol_772);
			}
			symbol_212.getTemplateBindings().add(symbol_771);
		}
		symbol_212.getSuperClasses().add(symbol_171); // $ocl!NonOrderedCollection[$ocl!Collection{T}?T]
		symbol_212.getSuperClasses().add(symbol_221); // $ocl!UniqueCollection[$ocl!Collection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_212);
		//
		// ocl::$$::Set $ocl!Set[$ocl!NonOrderedCollection{T}?T]
		//
		symbol_213.setName("Set");
		//symbol_213.setMoniker("$ocl!Set[$ocl!NonOrderedCollection{T}?T]");
		symbol_213.setElementType(symbol_57);
		symbol_213.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_773 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_773.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_774 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_774.setFormal(symbol_111);	
				symbol_774.setActual(symbol_57);	
				symbol_773.getParameterSubstitutions().add(symbol_774);
			}
			symbol_213.getTemplateBindings().add(symbol_773);
		}
		symbol_213.getSuperClasses().add(symbol_222); // $ocl!UniqueCollection[$ocl!NonOrderedCollection{T}?T]
		symbol_213.getSuperClasses().add(symbol_54); // $ocl!NonOrderedCollection{T}
		symbol_129.getOwnedTypes().add(symbol_213);
		//
		// ocl::$$::Set $ocl!Set[$ocl!OclAny]
		//
		symbol_214.setName("Set");
		//symbol_214.setMoniker("$ocl!Set[$ocl!OclAny]");
		symbol_214.setElementType(symbol_68);
		symbol_214.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_775 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_775.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_776 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_776.setFormal(symbol_111);	
				symbol_776.setActual(symbol_68);	
				symbol_775.getParameterSubstitutions().add(symbol_776);
			}
			symbol_214.getTemplateBindings().add(symbol_775);
		}
		symbol_214.getSuperClasses().add(symbol_173); // $ocl!NonOrderedCollection[$ocl!OclAny]
		symbol_214.getSuperClasses().add(symbol_223); // $ocl!UniqueCollection[$ocl!OclAny]
		symbol_129.getOwnedTypes().add(symbol_214);
		//
		// ocl::$$::Set $ocl!Set[$ocl!OclSelf]
		//
		symbol_215.setName("Set");
		//symbol_215.setMoniker("$ocl!Set[$ocl!OclSelf]");
		symbol_215.setElementType(symbol_81);
		symbol_215.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_777 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_777.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_778 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_778.setFormal(symbol_111);	
				symbol_778.setActual(symbol_81);	
				symbol_777.getParameterSubstitutions().add(symbol_778);
			}
			symbol_215.getTemplateBindings().add(symbol_777);
		}
		symbol_215.getSuperClasses().add(symbol_174); // $ocl!NonOrderedCollection[$ocl!OclSelf]
		symbol_215.getSuperClasses().add(symbol_224); // $ocl!UniqueCollection[$ocl!OclSelf]
		symbol_129.getOwnedTypes().add(symbol_215);
		//
		// ocl::$$::Set $ocl!Set[$ocl!OrderedSet{T}?T]
		//
		symbol_216.setName("Set");
		//symbol_216.setMoniker("$ocl!Set[$ocl!OrderedSet{T}?T]");
		symbol_216.setElementType(symbol_98);
		symbol_216.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_779 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_779.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_780 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_780.setFormal(symbol_111);	
				symbol_780.setActual(symbol_98);	
				symbol_779.getParameterSubstitutions().add(symbol_780);
			}
			symbol_216.getTemplateBindings().add(symbol_779);
		}
		symbol_216.getSuperClasses().add(symbol_175); // $ocl!NonOrderedCollection[$ocl!OrderedSet{T}?T]
		symbol_216.getSuperClasses().add(symbol_227); // $ocl!UniqueCollection[$ocl!OrderedSet{T}?T]
		symbol_129.getOwnedTypes().add(symbol_216);
		//
		// ocl::$$::Set $ocl!Set[$ocl!Set{T}!flatten{T2}()?T2]
		//
		symbol_217.setName("Set");
		//symbol_217.setMoniker("$ocl!Set[$ocl!Set{T}!flatten{T2}()?T2]");
		symbol_217.setElementType(symbol_115);
		symbol_217.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_781 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_781.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_782 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_782.setFormal(symbol_111);	
				symbol_782.setActual(symbol_115);	
				symbol_781.getParameterSubstitutions().add(symbol_782);
			}
			symbol_217.getTemplateBindings().add(symbol_781);
		}
		symbol_217.getSuperClasses().add(symbol_176); // $ocl!NonOrderedCollection[$ocl!Set{T}!flatten{T2}()?T2]
		symbol_217.getSuperClasses().add(symbol_228); // $ocl!UniqueCollection[$ocl!Set{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_217);
		//
		// ocl::$$::Set $ocl!Set[$ocl!Set{T}?T]
		//
		symbol_218.setName("Set");
		//symbol_218.setMoniker("$ocl!Set[$ocl!Set{T}?T]");
		symbol_218.setElementType(symbol_112);
		symbol_218.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_783 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_783.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_784 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_784.setFormal(symbol_111);	
				symbol_784.setActual(symbol_112);	
				symbol_783.getParameterSubstitutions().add(symbol_784);
			}
			symbol_218.getTemplateBindings().add(symbol_783);
		}
		symbol_218.getSuperClasses().add(symbol_229); // $ocl!UniqueCollection[$ocl!Set{T}?T]
		symbol_218.getSuperClasses().add(symbol_177); // $ocl!NonOrderedCollection[$ocl!Set{T}?T]
		symbol_129.getOwnedTypes().add(symbol_218);
		//
		// ocl::$$::Set $ocl!Set[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		//
		symbol_219.setName("Set");
		//symbol_219.setMoniker("$ocl!Set[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]");
		symbol_219.setElementType(symbol_247);
		symbol_219.setUnspecializedElement(symbol_109);
		{
			TemplateBinding symbol_785 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_785.setSignature(symbol_110);
			{
				TemplateParameterSubstitution symbol_786 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_786.setFormal(symbol_111);	
				symbol_786.setActual(symbol_247);	
				symbol_785.getParameterSubstitutions().add(symbol_786);
			}
			symbol_219.getTemplateBindings().add(symbol_785);
		}
		symbol_219.getSuperClasses().add(symbol_178); // $ocl!NonOrderedCollection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		symbol_219.getSuperClasses().add(symbol_230); // $ocl!UniqueCollection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		symbol_129.getOwnedTypes().add(symbol_219);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		//
		symbol_220.setName("UniqueCollection");
		//symbol_220.setMoniker("$ocl!UniqueCollection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]");
		symbol_220.setElementType(symbol_137);
		symbol_220.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_787 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_787.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_788 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_788.setFormal(symbol_119);	
				symbol_788.setActual(symbol_137);	
				symbol_787.getParameterSubstitutions().add(symbol_788);
			}
			symbol_220.getTemplateBindings().add(symbol_787);
		}
		symbol_220.getSuperClasses().add(symbol_145); // $ocl!Collection[$ocl!Classifier[$ocl!Classifier{T}!oclContents{U}()?U]]
		symbol_129.getOwnedTypes().add(symbol_220);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!Collection{T}?T]
		//
		symbol_221.setName("UniqueCollection");
		//symbol_221.setMoniker("$ocl!UniqueCollection[$ocl!Collection{T}?T]");
		symbol_221.setElementType(symbol_31);
		symbol_221.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_789 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_789.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_790 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_790.setFormal(symbol_119);	
				symbol_790.setActual(symbol_31);	
				symbol_789.getParameterSubstitutions().add(symbol_790);
			}
			symbol_221.getTemplateBindings().add(symbol_789);
		}
		symbol_221.getSuperClasses().add(symbol_28); // $ocl!Collection{T}
		symbol_129.getOwnedTypes().add(symbol_221);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!NonOrderedCollection{T}?T]
		//
		symbol_222.setName("UniqueCollection");
		//symbol_222.setMoniker("$ocl!UniqueCollection[$ocl!NonOrderedCollection{T}?T]");
		symbol_222.setElementType(symbol_57);
		symbol_222.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_791 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_791.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_792 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_792.setFormal(symbol_119);	
				symbol_792.setActual(symbol_57);	
				symbol_791.getParameterSubstitutions().add(symbol_792);
			}
			symbol_222.getTemplateBindings().add(symbol_791);
		}
		symbol_222.getSuperClasses().add(symbol_153); // $ocl!Collection[$ocl!NonOrderedCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_222);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!OclAny]
		//
		symbol_223.setName("UniqueCollection");
		//symbol_223.setMoniker("$ocl!UniqueCollection[$ocl!OclAny]");
		symbol_223.setElementType(symbol_68);
		symbol_223.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_793 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_793.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_794 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_794.setFormal(symbol_119);	
				symbol_794.setActual(symbol_68);	
				symbol_793.getParameterSubstitutions().add(symbol_794);
			}
			symbol_223.getTemplateBindings().add(symbol_793);
		}
		symbol_223.getSuperClasses().add(symbol_155); // $ocl!Collection[$ocl!OclAny]
		symbol_129.getOwnedTypes().add(symbol_223);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!OclSelf]
		//
		symbol_224.setName("UniqueCollection");
		//symbol_224.setMoniker("$ocl!UniqueCollection[$ocl!OclSelf]");
		symbol_224.setElementType(symbol_81);
		symbol_224.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_795 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_795.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_796 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_796.setFormal(symbol_119);	
				symbol_796.setActual(symbol_81);	
				symbol_795.getParameterSubstitutions().add(symbol_796);
			}
			symbol_224.getTemplateBindings().add(symbol_795);
		}
		symbol_224.getSuperClasses().add(symbol_156); // $ocl!Collection[$ocl!OclSelf]
		symbol_129.getOwnedTypes().add(symbol_224);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!OrderedCollection{T}?T]
		//
		symbol_225.setName("UniqueCollection");
		//symbol_225.setMoniker("$ocl!UniqueCollection[$ocl!OrderedCollection{T}?T]");
		symbol_225.setElementType(symbol_88);
		symbol_225.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_797 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_797.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_798 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_798.setFormal(symbol_119);	
				symbol_798.setActual(symbol_88);	
				symbol_797.getParameterSubstitutions().add(symbol_798);
			}
			symbol_225.getTemplateBindings().add(symbol_797);
		}
		symbol_225.getSuperClasses().add(symbol_158); // $ocl!Collection[$ocl!OrderedCollection{T}?T]
		symbol_129.getOwnedTypes().add(symbol_225);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		//
		symbol_226.setName("UniqueCollection");
		//symbol_226.setMoniker("$ocl!UniqueCollection[$ocl!OrderedSet{T}!flatten{T2}()?T2]");
		symbol_226.setElementType(symbol_101);
		symbol_226.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_799 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_799.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_800 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_800.setFormal(symbol_119);	
				symbol_800.setActual(symbol_101);	
				symbol_799.getParameterSubstitutions().add(symbol_800);
			}
			symbol_226.getTemplateBindings().add(symbol_799);
		}
		symbol_226.getSuperClasses().add(symbol_159); // $ocl!Collection[$ocl!OrderedSet{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_226);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!OrderedSet{T}?T]
		//
		symbol_227.setName("UniqueCollection");
		//symbol_227.setMoniker("$ocl!UniqueCollection[$ocl!OrderedSet{T}?T]");
		symbol_227.setElementType(symbol_98);
		symbol_227.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_801 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_801.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_802 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_802.setFormal(symbol_119);	
				symbol_802.setActual(symbol_98);	
				symbol_801.getParameterSubstitutions().add(symbol_802);
			}
			symbol_227.getTemplateBindings().add(symbol_801);
		}
		symbol_227.getSuperClasses().add(symbol_160); // $ocl!Collection[$ocl!OrderedSet{T}?T]
		symbol_129.getOwnedTypes().add(symbol_227);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!Set{T}!flatten{T2}()?T2]
		//
		symbol_228.setName("UniqueCollection");
		//symbol_228.setMoniker("$ocl!UniqueCollection[$ocl!Set{T}!flatten{T2}()?T2]");
		symbol_228.setElementType(symbol_115);
		symbol_228.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_803 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_803.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_804 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_804.setFormal(symbol_119);	
				symbol_804.setActual(symbol_115);	
				symbol_803.getParameterSubstitutions().add(symbol_804);
			}
			symbol_228.getTemplateBindings().add(symbol_803);
		}
		symbol_228.getSuperClasses().add(symbol_163); // $ocl!Collection[$ocl!Set{T}!flatten{T2}()?T2]
		symbol_129.getOwnedTypes().add(symbol_228);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[$ocl!Set{T}?T]
		//
		symbol_229.setName("UniqueCollection");
		//symbol_229.setMoniker("$ocl!UniqueCollection[$ocl!Set{T}?T]");
		symbol_229.setElementType(symbol_112);
		symbol_229.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_805 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_805.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_806 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_806.setFormal(symbol_119);	
				symbol_806.setActual(symbol_112);	
				symbol_805.getParameterSubstitutions().add(symbol_806);
			}
			symbol_229.getTemplateBindings().add(symbol_805);
		}
		symbol_229.getSuperClasses().add(symbol_164); // $ocl!Collection[$ocl!Set{T}?T]
		symbol_129.getOwnedTypes().add(symbol_229);
		//
		// ocl::$$::UniqueCollection $ocl!UniqueCollection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		//
		symbol_230.setName("UniqueCollection");
		//symbol_230.setMoniker("$ocl!UniqueCollection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]");
		symbol_230.setElementType(symbol_247);
		symbol_230.setUnspecializedElement(symbol_117);
		{
			TemplateBinding symbol_807 = PivotFactory.eINSTANCE.createTemplateBinding();
			symbol_807.setSignature(symbol_118);
			{
				TemplateParameterSubstitution symbol_808 = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				symbol_808.setFormal(symbol_119);	
				symbol_808.setActual(symbol_247);	
				symbol_807.getParameterSubstitutions().add(symbol_808);
			}
			symbol_230.getTemplateBindings().add(symbol_807);
		}
		symbol_230.getSuperClasses().add(symbol_167); // $ocl!Collection[Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}]
		symbol_129.getOwnedTypes().add(symbol_230);
		//
		// ocl::$$::Lambda Lambda~$ocl!Bag{T}?T()Boolean
		//
		symbol_231.setName("Lambda");
		//symbol_231.setMoniker("Lambda~$ocl!Bag{T}?T()Boolean");
		symbol_231.setContextType(symbol_14);
		symbol_231.setResultType(symbol_121);
		symbol_129.getOwnedTypes().add(symbol_231);
		//
		// ocl::$$::Lambda Lambda~$ocl!Collection{T}?T()$ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_232.setName("Lambda");
		//symbol_232.setMoniker("Lambda~$ocl!Collection{T}?T()$ocl!Collection{T}!collectNested{V}(T|Lambda~T()V)?V");
		symbol_232.setContextType(symbol_31);
		symbol_232.setResultType(symbol_37);
		symbol_129.getOwnedTypes().add(symbol_232);
		//
		// ocl::$$::Lambda Lambda~$ocl!Collection{T}?T()$ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_233.setName("Lambda");
		//symbol_233.setMoniker("Lambda~$ocl!Collection{T}?T()$ocl!Collection{T}!collect{V}(T|Lambda~T()V)?V");
		symbol_233.setContextType(symbol_31);
		symbol_233.setResultType(symbol_34);
		symbol_129.getOwnedTypes().add(symbol_233);
		//
		// ocl::$$::Lambda Lambda~$ocl!Collection{T}?T()$ocl!OclAny
		//
		symbol_234.setName("Lambda");
		//symbol_234.setMoniker("Lambda~$ocl!Collection{T}?T()$ocl!OclAny");
		symbol_234.setContextType(symbol_31);
		symbol_234.setResultType(symbol_68);
		symbol_129.getOwnedTypes().add(symbol_234);
		//
		// ocl::$$::Lambda Lambda~$ocl!Collection{T}?T()Boolean
		//
		symbol_235.setName("Lambda");
		//symbol_235.setMoniker("Lambda~$ocl!Collection{T}?T()Boolean");
		symbol_235.setContextType(symbol_31);
		symbol_235.setResultType(symbol_121);
		symbol_129.getOwnedTypes().add(symbol_235);
		//
		// ocl::$$::Lambda Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_236.setName("Lambda");
		//symbol_236.setMoniker("Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!NonOrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V");
		symbol_236.setContextType(symbol_57);
		symbol_236.setResultType(symbol_63);
		symbol_129.getOwnedTypes().add(symbol_236);
		//
		// ocl::$$::Lambda Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_237.setName("Lambda");
		//symbol_237.setMoniker("Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!NonOrderedCollection{T}!collect{V}(T|Lambda~T()V)?V");
		symbol_237.setContextType(symbol_57);
		symbol_237.setResultType(symbol_60);
		symbol_129.getOwnedTypes().add(symbol_237);
		//
		// ocl::$$::Lambda Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!Set[T]
		//
		symbol_238.setName("Lambda");
		//symbol_238.setMoniker("Lambda~$ocl!NonOrderedCollection{T}?T()$ocl!Set[T]");
		symbol_238.setContextType(symbol_57);
		symbol_238.setResultType(symbol_213);
		symbol_129.getOwnedTypes().add(symbol_238);
		//
		// ocl::$$::Lambda Lambda~$ocl!NonUniqueCollection{T}?T()$ocl!OclAny
		//
		symbol_239.setName("Lambda");
		//symbol_239.setMoniker("Lambda~$ocl!NonUniqueCollection{T}?T()$ocl!OclAny");
		symbol_239.setContextType(symbol_67);
		symbol_239.setResultType(symbol_68);
		symbol_129.getOwnedTypes().add(symbol_239);
		//
		// ocl::$$::Lambda Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V
		//
		symbol_240.setName("Lambda");
		//symbol_240.setMoniker("Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedCollection{T}!collectNested{V}(T|Lambda~T()V)?V");
		symbol_240.setContextType(symbol_88);
		symbol_240.setResultType(symbol_94);
		symbol_129.getOwnedTypes().add(symbol_240);
		//
		// ocl::$$::Lambda Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V
		//
		symbol_241.setName("Lambda");
		//symbol_241.setMoniker("Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedCollection{T}!collect{V}(T|Lambda~T()V)?V");
		symbol_241.setContextType(symbol_88);
		symbol_241.setResultType(symbol_91);
		symbol_129.getOwnedTypes().add(symbol_241);
		//
		// ocl::$$::Lambda Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedSet[T]
		//
		symbol_242.setName("Lambda");
		//symbol_242.setMoniker("Lambda~$ocl!OrderedCollection{T}?T()$ocl!OrderedSet[T]");
		symbol_242.setContextType(symbol_88);
		symbol_242.setResultType(symbol_200);
		symbol_129.getOwnedTypes().add(symbol_242);
		//
		// ocl::$$::Lambda Lambda~$ocl!OrderedSet{T}?T()Boolean
		//
		symbol_243.setName("Lambda");
		//symbol_243.setMoniker("Lambda~$ocl!OrderedSet{T}?T()Boolean");
		symbol_243.setContextType(symbol_98);
		symbol_243.setResultType(symbol_121);
		symbol_129.getOwnedTypes().add(symbol_243);
		//
		// ocl::$$::Lambda Lambda~$ocl!Sequence{T}?T()Boolean
		//
		symbol_244.setName("Lambda");
		//symbol_244.setMoniker("Lambda~$ocl!Sequence{T}?T()Boolean");
		symbol_244.setContextType(symbol_105);
		symbol_244.setResultType(symbol_121);
		symbol_129.getOwnedTypes().add(symbol_244);
		//
		// ocl::$$::Lambda Lambda~$ocl!Set{T}?T()Boolean
		//
		symbol_245.setName("Lambda");
		//symbol_245.setMoniker("Lambda~$ocl!Set{T}?T()Boolean");
		symbol_245.setContextType(symbol_112);
		symbol_245.setResultType(symbol_121);
		symbol_129.getOwnedTypes().add(symbol_245);
		//
		// ocl::$$::Lambda Lambda~$ocl!UniqueCollection{T}?T()$ocl!OclAny
		//
		symbol_246.setName("Lambda");
		//symbol_246.setMoniker("Lambda~$ocl!UniqueCollection{T}?T()$ocl!OclAny");
		symbol_246.setContextType(symbol_120);
		symbol_246.setResultType(symbol_68);
		symbol_129.getOwnedTypes().add(symbol_246);
		//
		// ocl::$$::Tuple Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}
		//
		symbol_247.setName("Tuple");
		//symbol_247.setMoniker("Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}");
		symbol_247.getSuperClasses().add(symbol_116); // $ocl!Tuple
		{ // ocl::$$::Tuple::first Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}!first
			symbol_248.setName("first");
			symbol_248.setType(symbol_31);  // $ocl!Collection{T}?T
			
			symbol_248.setIsResolveProxies(true);
			symbol_247.getOwnedAttributes().add(symbol_248);
		}
		{ // ocl::$$::Tuple::second Tuple{first:$ocl!Collection{T}?T,second:$ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2}!second
			symbol_249.setName("second");
			symbol_249.setType(symbol_52);  // $ocl!Collection{T}!product{T2}($ocl!Collection[T2])?T2
			
			symbol_249.setIsResolveProxies(true);
			symbol_247.getOwnedAttributes().add(symbol_249);
		}
		symbol_129.getOwnedTypes().add(symbol_247);
		symbol_0.getNestedPackages().add(symbol_129);
		return symbol_0;
	}
}
