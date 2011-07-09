/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * from: pivot
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateJavaTables
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateJavaTables.mtl
 *
 * Do not edit it.
 *
 * $Id$
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.ocl.examples.library.executor.ExecutorClass;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorPackage;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.examples.library.ecore.EcoreLibraryProperty;
import org.eclipse.ocl.examples.pivot.PivotPackage;

/**
 * PivotTables provides the dispatch tables for the pivot for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class PivotTables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final ExecutorPackage PACKAGE = new ExecutorPackage("pivot", null);

	/**
	 *	The class descriptors for each class.
	 */
	public static class Classes {
	    public static final ExecutorClass _Annotation = new ExecutorClass("Annotation", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _AnyType = new ExecutorClass("AnyType", PACKAGE, null, null); // Class
	    public static final ExecutorClass _AssociationClass = new ExecutorClass("AssociationClass", PACKAGE, null, null); // Class
	    public static final ExecutorClass _AssociationClassCallExp = new ExecutorClass("AssociationClassCallExp", PACKAGE, null, null); // NavigationCallExp
	    public static final ExecutorClass _AssociativityKind = new ExecutorClass("AssociativityKind", PACKAGE, null, null);
	    public static final ExecutorClass _Bag = new ExecutorClass("Bag", PACKAGE, null, null); // NonOrderedCollection,NonUniqueCollection
	    public static final ExecutorClass _BagType = new ExecutorClass("BagType", PACKAGE, null, null); // CollectionType
	    public static final ExecutorClass _Boolean = new ExecutorClass("Boolean", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _BooleanLiteralExp = new ExecutorClass("BooleanLiteralExp", PACKAGE, null, null); // PrimitiveLiteralExp
	    public static final ExecutorClass _CallExp = new ExecutorClass("CallExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _CallOperationAction = new ExecutorClass("CallOperationAction", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _Class = new ExecutorClass("Class", PACKAGE, null, null); // Namespace,Type
	    public static final ExecutorClass _Classifier = new ExecutorClass("Classifier", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _ClassifierType = new ExecutorClass("ClassifierType", PACKAGE, null, null); // DataType
	    public static final ExecutorClass _Collection = new ExecutorClass("Collection", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _CollectionItem = new ExecutorClass("CollectionItem", PACKAGE, null, null); // CollectionLiteralPart
	    public static final ExecutorClass _CollectionKind = new ExecutorClass("CollectionKind", PACKAGE, null, null);
	    public static final ExecutorClass _CollectionLiteralExp = new ExecutorClass("CollectionLiteralExp", PACKAGE, null, null); // LiteralExp
	    public static final ExecutorClass _CollectionLiteralPart = new ExecutorClass("CollectionLiteralPart", PACKAGE, null, null); // TypedElement
	    public static final ExecutorClass _CollectionRange = new ExecutorClass("CollectionRange", PACKAGE, null, null); // CollectionLiteralPart
	    public static final ExecutorClass _CollectionType = new ExecutorClass("CollectionType", PACKAGE, null, null); // DataType
	    public static final ExecutorClass _Comment = new ExecutorClass("Comment", PACKAGE, null, null); // Element
	    public static final ExecutorClass _Constraint = new ExecutorClass("Constraint", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _DataType = new ExecutorClass("DataType", PACKAGE, null, null); // Class
	    public static final ExecutorClass _Detail = new ExecutorClass("Detail", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _Element = new ExecutorClass("Element", PACKAGE, null, null); // Visitable
	    public static final ExecutorClass _EnumLiteralExp = new ExecutorClass("EnumLiteralExp", PACKAGE, null, null); // LiteralExp
	    public static final ExecutorClass _Enumeration = new ExecutorClass("Enumeration", PACKAGE, null, null); // DataType,OclAny
	    public static final ExecutorClass _EnumerationLiteral = new ExecutorClass("EnumerationLiteral", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _ExpressionInOcl = new ExecutorClass("ExpressionInOcl", PACKAGE, null, null); // OpaqueExpression
	    public static final ExecutorClass _Feature = new ExecutorClass("Feature", PACKAGE, null, null); // TypedMultiplicityElement
	    public static final ExecutorClass _FeatureCallExp = new ExecutorClass("FeatureCallExp", PACKAGE, null, null); // CallExp
	    public static final ExecutorClass _IfExp = new ExecutorClass("IfExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _Int = new ExecutorClass("Int", PACKAGE, null, null);
	    public static final ExecutorClass _Integer = new ExecutorClass("Integer", PACKAGE, null, null); // Real
	    public static final ExecutorClass _IntegerLiteralExp = new ExecutorClass("IntegerLiteralExp", PACKAGE, null, null); // NumericLiteralExp
	    public static final ExecutorClass _InvalidLiteralExp = new ExecutorClass("InvalidLiteralExp", PACKAGE, null, null); // PrimitiveLiteralExp
	    public static final ExecutorClass _InvalidType = new ExecutorClass("InvalidType", PACKAGE, null, null); // Class
	    public static final ExecutorClass _IterateExp = new ExecutorClass("IterateExp", PACKAGE, null, null); // LoopExp
	    public static final ExecutorClass _Iteration = new ExecutorClass("Iteration", PACKAGE, null, null); // Operation
	    public static final ExecutorClass _IteratorExp = new ExecutorClass("IteratorExp", PACKAGE, null, null); // LoopExp
	    public static final ExecutorClass _LambdaType = new ExecutorClass("LambdaType", PACKAGE, null, null); // DataType
	    public static final ExecutorClass _LetExp = new ExecutorClass("LetExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _Library = new ExecutorClass("Library", PACKAGE, null, null); // Package
	    public static final ExecutorClass _LibraryFeature = new ExecutorClass("LibraryFeature", PACKAGE, null, null);
	    public static final ExecutorClass _LiteralExp = new ExecutorClass("LiteralExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _LoopExp = new ExecutorClass("LoopExp", PACKAGE, null, null); // CallExp
	    public static final ExecutorClass _MessageExp = new ExecutorClass("MessageExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _MessageType = new ExecutorClass("MessageType", PACKAGE, null, null); // Type
	    public static final ExecutorClass _MonikeredElement = new ExecutorClass("MonikeredElement", PACKAGE, null, null); // Element
	    public static final ExecutorClass _MultiplicityElement = new ExecutorClass("MultiplicityElement", PACKAGE, null, null); // MonikeredElement
	    public static final ExecutorClass _Nameable = new ExecutorClass("Nameable", PACKAGE, null, null); // Classifier
	    public static final ExecutorClass _NamedElement = new ExecutorClass("NamedElement", PACKAGE, null, null); // MonikeredElement,Nameable
	    public static final ExecutorClass _Namespace = new ExecutorClass("Namespace", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _NavigationCallExp = new ExecutorClass("NavigationCallExp", PACKAGE, null, null); // FeatureCallExp
	    public static final ExecutorClass _NonOrderedCollection = new ExecutorClass("NonOrderedCollection", PACKAGE, null, null); // Collection
	    public static final ExecutorClass _NonUniqueCollection = new ExecutorClass("NonUniqueCollection", PACKAGE, null, null); // Collection
	    public static final ExecutorClass _NullLiteralExp = new ExecutorClass("NullLiteralExp", PACKAGE, null, null); // PrimitiveLiteralExp
	    public static final ExecutorClass _NumericLiteralExp = new ExecutorClass("NumericLiteralExp", PACKAGE, null, null); // PrimitiveLiteralExp
	    public static final ExecutorClass _Object = new ExecutorClass("Object", PACKAGE, null, null);
	    public static final ExecutorClass _OclAny = new ExecutorClass("OclAny", PACKAGE, null, null);
	    public static final ExecutorClass _OclExpression = new ExecutorClass("OclExpression", PACKAGE, null, null); // TypedElement
	    public static final ExecutorClass _OclInvalid = new ExecutorClass("OclInvalid", PACKAGE, null, null); // OclVoid
	    public static final ExecutorClass _OclMessage = new ExecutorClass("OclMessage", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OclSelf = new ExecutorClass("OclSelf", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OclState = new ExecutorClass("OclState", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OclTuple = new ExecutorClass("OclTuple", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OclVoid = new ExecutorClass("OclVoid", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OpaqueExpression = new ExecutorClass("OpaqueExpression", PACKAGE, null, null); // ValueSpecification
	    public static final ExecutorClass _Operation = new ExecutorClass("Operation", PACKAGE, null, null); // Feature,Namespace,ParameterableElement,TemplateableElement
	    public static final ExecutorClass _OperationCallExp = new ExecutorClass("OperationCallExp", PACKAGE, null, null); // FeatureCallExp
	    public static final ExecutorClass _OperationTemplateParameter = new ExecutorClass("OperationTemplateParameter", PACKAGE, null, null); // TemplateParameter
	    public static final ExecutorClass _OrderedCollection = new ExecutorClass("OrderedCollection", PACKAGE, null, null); // Collection
	    public static final ExecutorClass _OrderedSet = new ExecutorClass("OrderedSet", PACKAGE, null, null); // OrderedCollection,UniqueCollection
	    public static final ExecutorClass _OrderedSetType = new ExecutorClass("OrderedSetType", PACKAGE, null, null); // CollectionType
	    public static final ExecutorClass _Package = new ExecutorClass("Package", PACKAGE, null, null); // Namespace,TemplateableElement
	    public static final ExecutorClass _PackageableElement = new ExecutorClass("PackageableElement", PACKAGE, null, null); // ParameterableElement
	    public static final ExecutorClass _Parameter = new ExecutorClass("Parameter", PACKAGE, null, null); // TypedMultiplicityElement,VariableDeclaration
	    public static final ExecutorClass _ParameterableElement = new ExecutorClass("ParameterableElement", PACKAGE, null, null); // MonikeredElement
	    public static final ExecutorClass _Pivotable = new ExecutorClass("Pivotable", PACKAGE, null, null); // Classifier
	    public static final ExecutorClass _Precedence = new ExecutorClass("Precedence", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _PrimitiveLiteralExp = new ExecutorClass("PrimitiveLiteralExp", PACKAGE, null, null); // LiteralExp
	    public static final ExecutorClass _PrimitiveType = new ExecutorClass("PrimitiveType", PACKAGE, null, null); // DataType
	    public static final ExecutorClass _Property = new ExecutorClass("Property", PACKAGE, null, null); // Feature,ParameterableElement
	    public static final ExecutorClass _PropertyCallExp = new ExecutorClass("PropertyCallExp", PACKAGE, null, null); // NavigationCallExp
	    public static final ExecutorClass _Real = new ExecutorClass("Real", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _RealLiteralExp = new ExecutorClass("RealLiteralExp", PACKAGE, null, null); // NumericLiteralExp
	    public static final ExecutorClass _SelfType = new ExecutorClass("SelfType", PACKAGE, null, null); // Class
	    public static final ExecutorClass _SendSignalAction = new ExecutorClass("SendSignalAction", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _Sequence = new ExecutorClass("Sequence", PACKAGE, null, null); // NonUniqueCollection,OrderedCollection
	    public static final ExecutorClass _SequenceType = new ExecutorClass("SequenceType", PACKAGE, null, null); // CollectionType
	    public static final ExecutorClass _Set = new ExecutorClass("Set", PACKAGE, null, null); // NonOrderedCollection,UniqueCollection
	    public static final ExecutorClass _SetType = new ExecutorClass("SetType", PACKAGE, null, null); // CollectionType
	    public static final ExecutorClass _Signal = new ExecutorClass("Signal", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _State = new ExecutorClass("State", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _StateExp = new ExecutorClass("StateExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _String = new ExecutorClass("String", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _StringLiteralExp = new ExecutorClass("StringLiteralExp", PACKAGE, null, null); // PrimitiveLiteralExp
	    public static final ExecutorClass _TemplateBinding = new ExecutorClass("TemplateBinding", PACKAGE, null, null); // Element
	    public static final ExecutorClass _TemplateParameter = new ExecutorClass("TemplateParameter", PACKAGE, null, null); // Element
	    public static final ExecutorClass _TemplateParameterSubstitution = new ExecutorClass("TemplateParameterSubstitution", PACKAGE, null, null); // Element
	    public static final ExecutorClass _TemplateParameterType = new ExecutorClass("TemplateParameterType", PACKAGE, null, null); // Type
	    public static final ExecutorClass _TemplateSignature = new ExecutorClass("TemplateSignature", PACKAGE, null, null); // MonikeredElement
	    public static final ExecutorClass _TemplateableElement = new ExecutorClass("TemplateableElement", PACKAGE, null, null); // MonikeredElement
	    public static final ExecutorClass _Throwable = new ExecutorClass("Throwable", PACKAGE, null, null);
	    public static final ExecutorClass _Tuple = new ExecutorClass("Tuple", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _TupleLiteralExp = new ExecutorClass("TupleLiteralExp", PACKAGE, null, null); // LiteralExp
	    public static final ExecutorClass _TupleLiteralPart = new ExecutorClass("TupleLiteralPart", PACKAGE, null, null); // VariableDeclaration
	    public static final ExecutorClass _TupleType = new ExecutorClass("TupleType", PACKAGE, null, null); // DataType
	    public static final ExecutorClass _Type = new ExecutorClass("Type", PACKAGE, null, null); // NamedElement,ParameterableElement,TemplateableElement
	    public static final ExecutorClass _TypeExp = new ExecutorClass("TypeExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _TypeTemplateParameter = new ExecutorClass("TypeTemplateParameter", PACKAGE, null, null); // TemplateParameter
	    public static final ExecutorClass _TypedElement = new ExecutorClass("TypedElement", PACKAGE, null, null); // NamedElement
	    public static final ExecutorClass _TypedMultiplicityElement = new ExecutorClass("TypedMultiplicityElement", PACKAGE, null, null); // MultiplicityElement,TypedElement
	    public static final ExecutorClass _UniqueCollection = new ExecutorClass("UniqueCollection", PACKAGE, null, null); // Collection
	    public static final ExecutorClass _UnlimitedNatural = new ExecutorClass("UnlimitedNatural", PACKAGE, null, null); // Integer
	    public static final ExecutorClass _UnlimitedNaturalLiteralExp = new ExecutorClass("UnlimitedNaturalLiteralExp", PACKAGE, null, null); // NumericLiteralExp
	    public static final ExecutorClass _UnspecifiedType = new ExecutorClass("UnspecifiedType", PACKAGE, null, null); // Class
	    public static final ExecutorClass _UnspecifiedValueExp = new ExecutorClass("UnspecifiedValueExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _ValueSpecification = new ExecutorClass("ValueSpecification", PACKAGE, null, null); // ParameterableElement,TypedElement
	    public static final ExecutorClass _Variable = new ExecutorClass("Variable", PACKAGE, null, null); // VariableDeclaration
	    public static final ExecutorClass _VariableDeclaration = new ExecutorClass("VariableDeclaration", PACKAGE, null, null); // TypedElement
	    public static final ExecutorClass _VariableExp = new ExecutorClass("VariableExp", PACKAGE, null, null); // OclExpression
	    public static final ExecutorClass _Visitable = new ExecutorClass("Visitable", PACKAGE, null, null); // Classifier
	    public static final ExecutorClass _Visitor = new ExecutorClass("Visitor", PACKAGE, null, null); // Classifier
	    public static final ExecutorClass _VoidType = new ExecutorClass("VoidType", PACKAGE, null, null); // Class
	
		private static final ExecutorClass[] classes = {
		    _Bag,
		    _Classifier,
		    _Collection,
		    _NonOrderedCollection,
		    _NonUniqueCollection,
		    _OclAny,
		    _OclInvalid,
		    _OclMessage,
		    _OclSelf,
		    _OclState,
		    _OclTuple,
		    _OclVoid,
		    _OrderedCollection,
		    _OrderedSet,
		    _Sequence,
		    _Set,
		    _UniqueCollection,
		    _Annotation,
		    _AnyType,
		    _AssociationClass,
		    _AssociationClassCallExp,
		    _AssociativityKind,
		    _BagType,
		    _Boolean,
		    _BooleanLiteralExp,
		    _CallExp,
		    _CallOperationAction,
		    _Class,
		    _ClassifierType,
		    _CollectionItem,
		    _CollectionKind,
		    _CollectionLiteralExp,
		    _CollectionLiteralPart,
		    _CollectionRange,
		    _CollectionType,
		    _Comment,
		    _Constraint,
		    _DataType,
		    _Detail,
		    _Element,
		    _EnumLiteralExp,
		    _Enumeration,
		    _EnumerationLiteral,
		    _ExpressionInOcl,
		    _Feature,
		    _FeatureCallExp,
		    _IfExp,
		    _Int,
		    _Integer,
		    _IntegerLiteralExp,
		    _InvalidLiteralExp,
		    _InvalidType,
		    _IterateExp,
		    _Iteration,
		    _IteratorExp,
		    _LambdaType,
		    _LetExp,
		    _Library,
		    _LibraryFeature,
		    _LiteralExp,
		    _LoopExp,
		    _MessageExp,
		    _MessageType,
		    _MonikeredElement,
		    _MultiplicityElement,
		    _Nameable,
		    _NamedElement,
		    _Namespace,
		    _NavigationCallExp,
		    _NullLiteralExp,
		    _NumericLiteralExp,
		    _Object,
		    _OclExpression,
		    _OpaqueExpression,
		    _Operation,
		    _OperationCallExp,
		    _OperationTemplateParameter,
		    _OrderedSetType,
		    _Package,
		    _PackageableElement,
		    _Parameter,
		    _ParameterableElement,
		    _Pivotable,
		    _Precedence,
		    _PrimitiveLiteralExp,
		    _PrimitiveType,
		    _Property,
		    _PropertyCallExp,
		    _Real,
		    _RealLiteralExp,
		    _SelfType,
		    _SendSignalAction,
		    _SequenceType,
		    _SetType,
		    _Signal,
		    _State,
		    _StateExp,
		    _String,
		    _StringLiteralExp,
		    _TemplateBinding,
		    _TemplateParameter,
		    _TemplateParameterSubstitution,
		    _TemplateParameterType,
		    _TemplateSignature,
		    _TemplateableElement,
		    _Throwable,
		    _Tuple,
		    _TupleLiteralExp,
		    _TupleLiteralPart,
		    _TupleType,
		    _Type,
		    _TypeExp,
		    _TypeTemplateParameter,
		    _TypedElement,
		    _TypedMultiplicityElement,
		    _UnlimitedNatural,
		    _UnlimitedNaturalLiteralExp,
		    _UnspecifiedType,
		    _UnspecifiedValueExp,
		    _ValueSpecification,
		    _Variable,
		    _VariableDeclaration,
		    _VariableExp,
		    _Visitable,
		    _Visitor,
		    _VoidType
		};
	
		/*
		 *	Install the class descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(classes);
			ClassFragments.init();
			FragmentOperations.init();
			FragmentProperties.init();
		}
	}

	/**
	 *	The fragment descriptors for the local elements of each class and its superclasses.
	 */
	public static class Fragments {
		public static final ExecutorFragment _Annotation__Annotation = new ExecutorFragment(Classes._Annotation, PivotTables.Classes._Annotation, null, null);
		public static final ExecutorFragment _Annotation__Classifier = new ExecutorFragment(Classes._Annotation, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Annotation__Element = new ExecutorFragment(Classes._Annotation, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Annotation__MonikeredElement = new ExecutorFragment(Classes._Annotation, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Annotation__Nameable = new ExecutorFragment(Classes._Annotation, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Annotation__NamedElement = new ExecutorFragment(Classes._Annotation, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Annotation__OclAny = new ExecutorFragment(Classes._Annotation, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Annotation__Visitable = new ExecutorFragment(Classes._Annotation, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _AnyType__AnyType = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._AnyType, null, null);
		public static final ExecutorFragment _AnyType__Class = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _AnyType__Classifier = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _AnyType__Element = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _AnyType__MonikeredElement = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _AnyType__Nameable = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _AnyType__NamedElement = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _AnyType__Namespace = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _AnyType__OclAny = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _AnyType__ParameterableElement = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _AnyType__TemplateableElement = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _AnyType__Type = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _AnyType__Visitable = new ExecutorFragment(Classes._AnyType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _AssociationClass__AssociationClass = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._AssociationClass, null, null);
		public static final ExecutorFragment _AssociationClass__Class = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _AssociationClass__Classifier = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _AssociationClass__Element = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _AssociationClass__MonikeredElement = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _AssociationClass__Nameable = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _AssociationClass__NamedElement = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _AssociationClass__Namespace = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _AssociationClass__OclAny = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _AssociationClass__ParameterableElement = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _AssociationClass__TemplateableElement = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _AssociationClass__Type = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _AssociationClass__Visitable = new ExecutorFragment(Classes._AssociationClass, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _AssociationClassCallExp__AssociationClassCallExp = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._AssociationClassCallExp, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__CallExp = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__Classifier = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__Element = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__FeatureCallExp = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._FeatureCallExp, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__MonikeredElement = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__Nameable = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__NamedElement = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__NavigationCallExp = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._NavigationCallExp, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__OclAny = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__OclExpression = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__TypedElement = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _AssociationClassCallExp__Visitable = new ExecutorFragment(Classes._AssociationClassCallExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _AssociativityKind__AssociativityKind = new ExecutorFragment(Classes._AssociativityKind, PivotTables.Classes._AssociativityKind, null, null);
		
		public static final ExecutorFragment _Bag__Bag = new ExecutorFragment(Classes._Bag, PivotTables.Classes._Bag, null, null);
		public static final ExecutorFragment _Bag__Collection = new ExecutorFragment(Classes._Bag, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _Bag__NonOrderedCollection = new ExecutorFragment(Classes._Bag, PivotTables.Classes._NonOrderedCollection, null, null);
		public static final ExecutorFragment _Bag__NonUniqueCollection = new ExecutorFragment(Classes._Bag, PivotTables.Classes._NonUniqueCollection, null, null);
		public static final ExecutorFragment _Bag__OclAny = new ExecutorFragment(Classes._Bag, PivotTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _BagType__BagType = new ExecutorFragment(Classes._BagType, PivotTables.Classes._BagType, null, null);
		public static final ExecutorFragment _BagType__Class = new ExecutorFragment(Classes._BagType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _BagType__Classifier = new ExecutorFragment(Classes._BagType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _BagType__CollectionType = new ExecutorFragment(Classes._BagType, PivotTables.Classes._CollectionType, null, null);
		public static final ExecutorFragment _BagType__DataType = new ExecutorFragment(Classes._BagType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _BagType__Element = new ExecutorFragment(Classes._BagType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _BagType__MonikeredElement = new ExecutorFragment(Classes._BagType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _BagType__Nameable = new ExecutorFragment(Classes._BagType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _BagType__NamedElement = new ExecutorFragment(Classes._BagType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _BagType__Namespace = new ExecutorFragment(Classes._BagType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _BagType__OclAny = new ExecutorFragment(Classes._BagType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _BagType__ParameterableElement = new ExecutorFragment(Classes._BagType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _BagType__TemplateableElement = new ExecutorFragment(Classes._BagType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _BagType__Type = new ExecutorFragment(Classes._BagType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _BagType__Visitable = new ExecutorFragment(Classes._BagType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Boolean__Boolean = new ExecutorFragment(Classes._Boolean, PivotTables.Classes._Boolean, null, null);
		public static final ExecutorFragment _Boolean__OclAny = new ExecutorFragment(Classes._Boolean, PivotTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _BooleanLiteralExp__BooleanLiteralExp = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._BooleanLiteralExp, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__Classifier = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__Element = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__LiteralExp = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__MonikeredElement = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__Nameable = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__NamedElement = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__OclAny = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__OclExpression = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__TypedElement = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _BooleanLiteralExp__Visitable = new ExecutorFragment(Classes._BooleanLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _CallExp__CallExp = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _CallExp__Classifier = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _CallExp__Element = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _CallExp__MonikeredElement = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _CallExp__Nameable = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _CallExp__NamedElement = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _CallExp__OclAny = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _CallExp__OclExpression = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _CallExp__TypedElement = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _CallExp__Visitable = new ExecutorFragment(Classes._CallExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _CallOperationAction__CallOperationAction = new ExecutorFragment(Classes._CallOperationAction, PivotTables.Classes._CallOperationAction, null, null);
		public static final ExecutorFragment _CallOperationAction__Classifier = new ExecutorFragment(Classes._CallOperationAction, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _CallOperationAction__Element = new ExecutorFragment(Classes._CallOperationAction, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _CallOperationAction__MonikeredElement = new ExecutorFragment(Classes._CallOperationAction, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _CallOperationAction__Nameable = new ExecutorFragment(Classes._CallOperationAction, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _CallOperationAction__NamedElement = new ExecutorFragment(Classes._CallOperationAction, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _CallOperationAction__OclAny = new ExecutorFragment(Classes._CallOperationAction, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _CallOperationAction__Visitable = new ExecutorFragment(Classes._CallOperationAction, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Class__Class = new ExecutorFragment(Classes._Class, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _Class__Classifier = new ExecutorFragment(Classes._Class, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Class__Element = new ExecutorFragment(Classes._Class, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Class__MonikeredElement = new ExecutorFragment(Classes._Class, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Class__Nameable = new ExecutorFragment(Classes._Class, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Class__NamedElement = new ExecutorFragment(Classes._Class, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Class__Namespace = new ExecutorFragment(Classes._Class, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _Class__OclAny = new ExecutorFragment(Classes._Class, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Class__ParameterableElement = new ExecutorFragment(Classes._Class, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _Class__TemplateableElement = new ExecutorFragment(Classes._Class, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _Class__Type = new ExecutorFragment(Classes._Class, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _Class__Visitable = new ExecutorFragment(Classes._Class, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Classifier__Classifier = new ExecutorFragment(Classes._Classifier, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Classifier__OclAny = new ExecutorFragment(Classes._Classifier, PivotTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _ClassifierType__Class = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _ClassifierType__Classifier = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _ClassifierType__ClassifierType = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._ClassifierType, null, null);
		public static final ExecutorFragment _ClassifierType__DataType = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _ClassifierType__Element = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _ClassifierType__MonikeredElement = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _ClassifierType__Nameable = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _ClassifierType__NamedElement = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _ClassifierType__Namespace = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _ClassifierType__OclAny = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _ClassifierType__ParameterableElement = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _ClassifierType__TemplateableElement = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _ClassifierType__Type = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _ClassifierType__Visitable = new ExecutorFragment(Classes._ClassifierType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Collection__Collection = new ExecutorFragment(Classes._Collection, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _Collection__OclAny = new ExecutorFragment(Classes._Collection, PivotTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _CollectionItem__Classifier = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _CollectionItem__CollectionItem = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._CollectionItem, null, null);
		public static final ExecutorFragment _CollectionItem__CollectionLiteralPart = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._CollectionLiteralPart, null, null);
		public static final ExecutorFragment _CollectionItem__Element = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _CollectionItem__MonikeredElement = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _CollectionItem__Nameable = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _CollectionItem__NamedElement = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _CollectionItem__OclAny = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _CollectionItem__TypedElement = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _CollectionItem__Visitable = new ExecutorFragment(Classes._CollectionItem, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _CollectionKind__CollectionKind = new ExecutorFragment(Classes._CollectionKind, PivotTables.Classes._CollectionKind, null, null);
		
		public static final ExecutorFragment _CollectionLiteralExp__Classifier = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__CollectionLiteralExp = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._CollectionLiteralExp, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__Element = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__LiteralExp = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__MonikeredElement = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__Nameable = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__NamedElement = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__OclAny = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__OclExpression = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__TypedElement = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _CollectionLiteralExp__Visitable = new ExecutorFragment(Classes._CollectionLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _CollectionLiteralPart__Classifier = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _CollectionLiteralPart__CollectionLiteralPart = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._CollectionLiteralPart, null, null);
		public static final ExecutorFragment _CollectionLiteralPart__Element = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _CollectionLiteralPart__MonikeredElement = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _CollectionLiteralPart__Nameable = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _CollectionLiteralPart__NamedElement = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _CollectionLiteralPart__OclAny = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _CollectionLiteralPart__TypedElement = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _CollectionLiteralPart__Visitable = new ExecutorFragment(Classes._CollectionLiteralPart, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _CollectionRange__Classifier = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _CollectionRange__CollectionLiteralPart = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._CollectionLiteralPart, null, null);
		public static final ExecutorFragment _CollectionRange__CollectionRange = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._CollectionRange, null, null);
		public static final ExecutorFragment _CollectionRange__Element = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _CollectionRange__MonikeredElement = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _CollectionRange__Nameable = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _CollectionRange__NamedElement = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _CollectionRange__OclAny = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _CollectionRange__TypedElement = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _CollectionRange__Visitable = new ExecutorFragment(Classes._CollectionRange, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _CollectionType__Class = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _CollectionType__Classifier = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _CollectionType__CollectionType = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._CollectionType, null, null);
		public static final ExecutorFragment _CollectionType__DataType = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _CollectionType__Element = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _CollectionType__MonikeredElement = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _CollectionType__Nameable = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _CollectionType__NamedElement = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _CollectionType__Namespace = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _CollectionType__OclAny = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _CollectionType__ParameterableElement = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _CollectionType__TemplateableElement = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _CollectionType__Type = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _CollectionType__Visitable = new ExecutorFragment(Classes._CollectionType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Comment__Classifier = new ExecutorFragment(Classes._Comment, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Comment__Comment = new ExecutorFragment(Classes._Comment, PivotTables.Classes._Comment, null, null);
		public static final ExecutorFragment _Comment__Element = new ExecutorFragment(Classes._Comment, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Comment__OclAny = new ExecutorFragment(Classes._Comment, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Comment__Visitable = new ExecutorFragment(Classes._Comment, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Constraint__Classifier = new ExecutorFragment(Classes._Constraint, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Constraint__Constraint = new ExecutorFragment(Classes._Constraint, PivotTables.Classes._Constraint, null, null);
		public static final ExecutorFragment _Constraint__Element = new ExecutorFragment(Classes._Constraint, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Constraint__MonikeredElement = new ExecutorFragment(Classes._Constraint, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Constraint__Nameable = new ExecutorFragment(Classes._Constraint, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Constraint__NamedElement = new ExecutorFragment(Classes._Constraint, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Constraint__OclAny = new ExecutorFragment(Classes._Constraint, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Constraint__Visitable = new ExecutorFragment(Classes._Constraint, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _DataType__Class = new ExecutorFragment(Classes._DataType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _DataType__Classifier = new ExecutorFragment(Classes._DataType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Classes._DataType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _DataType__Element = new ExecutorFragment(Classes._DataType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _DataType__MonikeredElement = new ExecutorFragment(Classes._DataType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _DataType__Nameable = new ExecutorFragment(Classes._DataType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _DataType__NamedElement = new ExecutorFragment(Classes._DataType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _DataType__Namespace = new ExecutorFragment(Classes._DataType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Classes._DataType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _DataType__ParameterableElement = new ExecutorFragment(Classes._DataType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _DataType__TemplateableElement = new ExecutorFragment(Classes._DataType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _DataType__Type = new ExecutorFragment(Classes._DataType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _DataType__Visitable = new ExecutorFragment(Classes._DataType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Detail__Classifier = new ExecutorFragment(Classes._Detail, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Detail__Detail = new ExecutorFragment(Classes._Detail, PivotTables.Classes._Detail, null, null);
		public static final ExecutorFragment _Detail__Element = new ExecutorFragment(Classes._Detail, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Detail__MonikeredElement = new ExecutorFragment(Classes._Detail, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Detail__Nameable = new ExecutorFragment(Classes._Detail, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Detail__NamedElement = new ExecutorFragment(Classes._Detail, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Detail__OclAny = new ExecutorFragment(Classes._Detail, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Detail__Visitable = new ExecutorFragment(Classes._Detail, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Element__Classifier = new ExecutorFragment(Classes._Element, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Element__Element = new ExecutorFragment(Classes._Element, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Element__OclAny = new ExecutorFragment(Classes._Element, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Element__Visitable = new ExecutorFragment(Classes._Element, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _EnumLiteralExp__Classifier = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _EnumLiteralExp__Element = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _EnumLiteralExp__EnumLiteralExp = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._EnumLiteralExp, null, null);
		public static final ExecutorFragment _EnumLiteralExp__LiteralExp = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _EnumLiteralExp__MonikeredElement = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _EnumLiteralExp__Nameable = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _EnumLiteralExp__NamedElement = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _EnumLiteralExp__OclAny = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _EnumLiteralExp__OclExpression = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _EnumLiteralExp__TypedElement = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _EnumLiteralExp__Visitable = new ExecutorFragment(Classes._EnumLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Enumeration__Class = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _Enumeration__Classifier = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Enumeration__DataType = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _Enumeration__Element = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Enumeration__Enumeration = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._Enumeration, null, null);
		public static final ExecutorFragment _Enumeration__MonikeredElement = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Enumeration__Nameable = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Enumeration__NamedElement = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Enumeration__Namespace = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _Enumeration__OclAny = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Enumeration__ParameterableElement = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _Enumeration__TemplateableElement = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _Enumeration__Type = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _Enumeration__Visitable = new ExecutorFragment(Classes._Enumeration, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _EnumerationLiteral__Classifier = new ExecutorFragment(Classes._EnumerationLiteral, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _EnumerationLiteral__Element = new ExecutorFragment(Classes._EnumerationLiteral, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _EnumerationLiteral__EnumerationLiteral = new ExecutorFragment(Classes._EnumerationLiteral, PivotTables.Classes._EnumerationLiteral, null, null);
		public static final ExecutorFragment _EnumerationLiteral__MonikeredElement = new ExecutorFragment(Classes._EnumerationLiteral, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _EnumerationLiteral__Nameable = new ExecutorFragment(Classes._EnumerationLiteral, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _EnumerationLiteral__NamedElement = new ExecutorFragment(Classes._EnumerationLiteral, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _EnumerationLiteral__OclAny = new ExecutorFragment(Classes._EnumerationLiteral, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _EnumerationLiteral__Visitable = new ExecutorFragment(Classes._EnumerationLiteral, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _ExpressionInOcl__Classifier = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _ExpressionInOcl__Element = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _ExpressionInOcl__ExpressionInOcl = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._ExpressionInOcl, null, null);
		public static final ExecutorFragment _ExpressionInOcl__MonikeredElement = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _ExpressionInOcl__Nameable = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _ExpressionInOcl__NamedElement = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _ExpressionInOcl__OclAny = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _ExpressionInOcl__OpaqueExpression = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._OpaqueExpression, null, null);
		public static final ExecutorFragment _ExpressionInOcl__ParameterableElement = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _ExpressionInOcl__TypedElement = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _ExpressionInOcl__ValueSpecification = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._ValueSpecification, null, null);
		public static final ExecutorFragment _ExpressionInOcl__Visitable = new ExecutorFragment(Classes._ExpressionInOcl, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Feature__Classifier = new ExecutorFragment(Classes._Feature, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Feature__Element = new ExecutorFragment(Classes._Feature, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Feature__Feature = new ExecutorFragment(Classes._Feature, PivotTables.Classes._Feature, null, null);
		public static final ExecutorFragment _Feature__MonikeredElement = new ExecutorFragment(Classes._Feature, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Feature__MultiplicityElement = new ExecutorFragment(Classes._Feature, PivotTables.Classes._MultiplicityElement, null, null);
		public static final ExecutorFragment _Feature__Nameable = new ExecutorFragment(Classes._Feature, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Feature__NamedElement = new ExecutorFragment(Classes._Feature, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Feature__OclAny = new ExecutorFragment(Classes._Feature, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Feature__TypedElement = new ExecutorFragment(Classes._Feature, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _Feature__TypedMultiplicityElement = new ExecutorFragment(Classes._Feature, PivotTables.Classes._TypedMultiplicityElement, null, null);
		public static final ExecutorFragment _Feature__Visitable = new ExecutorFragment(Classes._Feature, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _FeatureCallExp__CallExp = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _FeatureCallExp__Classifier = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _FeatureCallExp__Element = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _FeatureCallExp__FeatureCallExp = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._FeatureCallExp, null, null);
		public static final ExecutorFragment _FeatureCallExp__MonikeredElement = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _FeatureCallExp__Nameable = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _FeatureCallExp__NamedElement = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _FeatureCallExp__OclAny = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _FeatureCallExp__OclExpression = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _FeatureCallExp__TypedElement = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _FeatureCallExp__Visitable = new ExecutorFragment(Classes._FeatureCallExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _IfExp__Classifier = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _IfExp__Element = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _IfExp__IfExp = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._IfExp, null, null);
		public static final ExecutorFragment _IfExp__MonikeredElement = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _IfExp__Nameable = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _IfExp__NamedElement = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _IfExp__OclAny = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _IfExp__OclExpression = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _IfExp__TypedElement = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _IfExp__Visitable = new ExecutorFragment(Classes._IfExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Int__Int = new ExecutorFragment(Classes._Int, PivotTables.Classes._Int, null, null);
		
		public static final ExecutorFragment _Integer__Integer = new ExecutorFragment(Classes._Integer, PivotTables.Classes._Integer, null, null);
		public static final ExecutorFragment _Integer__OclAny = new ExecutorFragment(Classes._Integer, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Integer__Real = new ExecutorFragment(Classes._Integer, PivotTables.Classes._Real, null, null);
		
		public static final ExecutorFragment _IntegerLiteralExp__Classifier = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__Element = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__IntegerLiteralExp = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._IntegerLiteralExp, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__LiteralExp = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__MonikeredElement = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__Nameable = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__NamedElement = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__NumericLiteralExp = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._NumericLiteralExp, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__OclAny = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__OclExpression = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__TypedElement = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _IntegerLiteralExp__Visitable = new ExecutorFragment(Classes._IntegerLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _InvalidLiteralExp__Classifier = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__Element = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__InvalidLiteralExp = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._InvalidLiteralExp, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__LiteralExp = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__MonikeredElement = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__Nameable = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__NamedElement = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__OclAny = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__OclExpression = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__TypedElement = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _InvalidLiteralExp__Visitable = new ExecutorFragment(Classes._InvalidLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _InvalidType__Class = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _InvalidType__Classifier = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _InvalidType__Element = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _InvalidType__InvalidType = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._InvalidType, null, null);
		public static final ExecutorFragment _InvalidType__MonikeredElement = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _InvalidType__Nameable = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _InvalidType__NamedElement = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _InvalidType__Namespace = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _InvalidType__OclAny = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _InvalidType__ParameterableElement = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _InvalidType__TemplateableElement = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _InvalidType__Type = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _InvalidType__Visitable = new ExecutorFragment(Classes._InvalidType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _IterateExp__CallExp = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _IterateExp__Classifier = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _IterateExp__Element = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _IterateExp__IterateExp = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._IterateExp, null, null);
		public static final ExecutorFragment _IterateExp__LoopExp = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._LoopExp, null, null);
		public static final ExecutorFragment _IterateExp__MonikeredElement = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _IterateExp__Nameable = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _IterateExp__NamedElement = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _IterateExp__OclAny = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _IterateExp__OclExpression = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _IterateExp__TypedElement = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _IterateExp__Visitable = new ExecutorFragment(Classes._IterateExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Iteration__Classifier = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Iteration__Element = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Iteration__Feature = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._Feature, null, null);
		public static final ExecutorFragment _Iteration__Iteration = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._Iteration, null, null);
		public static final ExecutorFragment _Iteration__MonikeredElement = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Iteration__MultiplicityElement = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._MultiplicityElement, null, null);
		public static final ExecutorFragment _Iteration__Nameable = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Iteration__NamedElement = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Iteration__Namespace = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _Iteration__OclAny = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Iteration__Operation = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._Operation, null, null);
		public static final ExecutorFragment _Iteration__ParameterableElement = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _Iteration__TemplateableElement = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _Iteration__TypedElement = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _Iteration__TypedMultiplicityElement = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._TypedMultiplicityElement, null, null);
		public static final ExecutorFragment _Iteration__Visitable = new ExecutorFragment(Classes._Iteration, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _IteratorExp__CallExp = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _IteratorExp__Classifier = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _IteratorExp__Element = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _IteratorExp__IteratorExp = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._IteratorExp, null, null);
		public static final ExecutorFragment _IteratorExp__LoopExp = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._LoopExp, null, null);
		public static final ExecutorFragment _IteratorExp__MonikeredElement = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _IteratorExp__Nameable = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _IteratorExp__NamedElement = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _IteratorExp__OclAny = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _IteratorExp__OclExpression = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _IteratorExp__TypedElement = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _IteratorExp__Visitable = new ExecutorFragment(Classes._IteratorExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _LambdaType__Class = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _LambdaType__Classifier = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _LambdaType__DataType = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _LambdaType__Element = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _LambdaType__LambdaType = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._LambdaType, null, null);
		public static final ExecutorFragment _LambdaType__MonikeredElement = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _LambdaType__Nameable = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _LambdaType__NamedElement = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _LambdaType__Namespace = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _LambdaType__OclAny = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _LambdaType__ParameterableElement = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _LambdaType__TemplateableElement = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _LambdaType__Type = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _LambdaType__Visitable = new ExecutorFragment(Classes._LambdaType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _LetExp__Classifier = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _LetExp__Element = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _LetExp__LetExp = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._LetExp, null, null);
		public static final ExecutorFragment _LetExp__MonikeredElement = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _LetExp__Nameable = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _LetExp__NamedElement = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _LetExp__OclAny = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _LetExp__OclExpression = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _LetExp__TypedElement = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _LetExp__Visitable = new ExecutorFragment(Classes._LetExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Library__Classifier = new ExecutorFragment(Classes._Library, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Library__Element = new ExecutorFragment(Classes._Library, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Library__Library = new ExecutorFragment(Classes._Library, PivotTables.Classes._Library, null, null);
		public static final ExecutorFragment _Library__MonikeredElement = new ExecutorFragment(Classes._Library, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Library__Nameable = new ExecutorFragment(Classes._Library, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Library__NamedElement = new ExecutorFragment(Classes._Library, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Library__Namespace = new ExecutorFragment(Classes._Library, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _Library__OclAny = new ExecutorFragment(Classes._Library, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Library__Package = new ExecutorFragment(Classes._Library, PivotTables.Classes._Package, null, null);
		public static final ExecutorFragment _Library__TemplateableElement = new ExecutorFragment(Classes._Library, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _Library__Visitable = new ExecutorFragment(Classes._Library, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _LibraryFeature__LibraryFeature = new ExecutorFragment(Classes._LibraryFeature, PivotTables.Classes._LibraryFeature, null, null);
		
		public static final ExecutorFragment _LiteralExp__Classifier = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _LiteralExp__Element = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _LiteralExp__LiteralExp = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _LiteralExp__MonikeredElement = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _LiteralExp__Nameable = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _LiteralExp__NamedElement = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _LiteralExp__OclAny = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _LiteralExp__OclExpression = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _LiteralExp__TypedElement = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _LiteralExp__Visitable = new ExecutorFragment(Classes._LiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _LoopExp__CallExp = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _LoopExp__Classifier = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _LoopExp__Element = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _LoopExp__LoopExp = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._LoopExp, null, null);
		public static final ExecutorFragment _LoopExp__MonikeredElement = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _LoopExp__Nameable = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _LoopExp__NamedElement = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _LoopExp__OclAny = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _LoopExp__OclExpression = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _LoopExp__TypedElement = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _LoopExp__Visitable = new ExecutorFragment(Classes._LoopExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _MessageExp__Classifier = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _MessageExp__Element = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _MessageExp__MessageExp = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._MessageExp, null, null);
		public static final ExecutorFragment _MessageExp__MonikeredElement = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _MessageExp__Nameable = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _MessageExp__NamedElement = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _MessageExp__OclAny = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _MessageExp__OclExpression = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _MessageExp__TypedElement = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _MessageExp__Visitable = new ExecutorFragment(Classes._MessageExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _MessageType__Classifier = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _MessageType__Element = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _MessageType__MessageType = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._MessageType, null, null);
		public static final ExecutorFragment _MessageType__MonikeredElement = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _MessageType__Nameable = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _MessageType__NamedElement = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _MessageType__OclAny = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _MessageType__ParameterableElement = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _MessageType__TemplateableElement = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _MessageType__Type = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _MessageType__Visitable = new ExecutorFragment(Classes._MessageType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _MonikeredElement__Classifier = new ExecutorFragment(Classes._MonikeredElement, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _MonikeredElement__Element = new ExecutorFragment(Classes._MonikeredElement, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _MonikeredElement__MonikeredElement = new ExecutorFragment(Classes._MonikeredElement, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _MonikeredElement__OclAny = new ExecutorFragment(Classes._MonikeredElement, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _MonikeredElement__Visitable = new ExecutorFragment(Classes._MonikeredElement, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _MultiplicityElement__Classifier = new ExecutorFragment(Classes._MultiplicityElement, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _MultiplicityElement__Element = new ExecutorFragment(Classes._MultiplicityElement, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _MultiplicityElement__MonikeredElement = new ExecutorFragment(Classes._MultiplicityElement, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _MultiplicityElement__MultiplicityElement = new ExecutorFragment(Classes._MultiplicityElement, PivotTables.Classes._MultiplicityElement, null, null);
		public static final ExecutorFragment _MultiplicityElement__OclAny = new ExecutorFragment(Classes._MultiplicityElement, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _MultiplicityElement__Visitable = new ExecutorFragment(Classes._MultiplicityElement, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Nameable__Classifier = new ExecutorFragment(Classes._Nameable, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Nameable__Nameable = new ExecutorFragment(Classes._Nameable, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Nameable__OclAny = new ExecutorFragment(Classes._Nameable, PivotTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _NamedElement__Classifier = new ExecutorFragment(Classes._NamedElement, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _NamedElement__Element = new ExecutorFragment(Classes._NamedElement, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _NamedElement__MonikeredElement = new ExecutorFragment(Classes._NamedElement, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _NamedElement__Nameable = new ExecutorFragment(Classes._NamedElement, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Classes._NamedElement, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Classes._NamedElement, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _NamedElement__Visitable = new ExecutorFragment(Classes._NamedElement, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Namespace__Classifier = new ExecutorFragment(Classes._Namespace, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Namespace__Element = new ExecutorFragment(Classes._Namespace, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Namespace__MonikeredElement = new ExecutorFragment(Classes._Namespace, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Namespace__Nameable = new ExecutorFragment(Classes._Namespace, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Namespace__NamedElement = new ExecutorFragment(Classes._Namespace, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Namespace__Namespace = new ExecutorFragment(Classes._Namespace, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _Namespace__OclAny = new ExecutorFragment(Classes._Namespace, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Namespace__Visitable = new ExecutorFragment(Classes._Namespace, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _NavigationCallExp__CallExp = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _NavigationCallExp__Classifier = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _NavigationCallExp__Element = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _NavigationCallExp__FeatureCallExp = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._FeatureCallExp, null, null);
		public static final ExecutorFragment _NavigationCallExp__MonikeredElement = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _NavigationCallExp__Nameable = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _NavigationCallExp__NamedElement = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _NavigationCallExp__NavigationCallExp = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._NavigationCallExp, null, null);
		public static final ExecutorFragment _NavigationCallExp__OclAny = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _NavigationCallExp__OclExpression = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _NavigationCallExp__TypedElement = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _NavigationCallExp__Visitable = new ExecutorFragment(Classes._NavigationCallExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _NonOrderedCollection__Collection = new ExecutorFragment(Classes._NonOrderedCollection, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _NonOrderedCollection__NonOrderedCollection = new ExecutorFragment(Classes._NonOrderedCollection, PivotTables.Classes._NonOrderedCollection, null, null);
		public static final ExecutorFragment _NonOrderedCollection__OclAny = new ExecutorFragment(Classes._NonOrderedCollection, PivotTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _NonUniqueCollection__Collection = new ExecutorFragment(Classes._NonUniqueCollection, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _NonUniqueCollection__NonUniqueCollection = new ExecutorFragment(Classes._NonUniqueCollection, PivotTables.Classes._NonUniqueCollection, null, null);
		public static final ExecutorFragment _NonUniqueCollection__OclAny = new ExecutorFragment(Classes._NonUniqueCollection, PivotTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _NullLiteralExp__Classifier = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _NullLiteralExp__Element = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _NullLiteralExp__LiteralExp = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _NullLiteralExp__MonikeredElement = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _NullLiteralExp__Nameable = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _NullLiteralExp__NamedElement = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _NullLiteralExp__NullLiteralExp = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._NullLiteralExp, null, null);
		public static final ExecutorFragment _NullLiteralExp__OclAny = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _NullLiteralExp__OclExpression = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _NullLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _NullLiteralExp__TypedElement = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _NullLiteralExp__Visitable = new ExecutorFragment(Classes._NullLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _NumericLiteralExp__Classifier = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _NumericLiteralExp__Element = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _NumericLiteralExp__LiteralExp = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _NumericLiteralExp__MonikeredElement = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _NumericLiteralExp__Nameable = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _NumericLiteralExp__NamedElement = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _NumericLiteralExp__NumericLiteralExp = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._NumericLiteralExp, null, null);
		public static final ExecutorFragment _NumericLiteralExp__OclAny = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _NumericLiteralExp__OclExpression = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _NumericLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _NumericLiteralExp__TypedElement = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _NumericLiteralExp__Visitable = new ExecutorFragment(Classes._NumericLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Object__Object = new ExecutorFragment(Classes._Object, PivotTables.Classes._Object, null, null);
		
		public static final ExecutorFragment _OclAny__OclAny = new ExecutorFragment(Classes._OclAny, PivotTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _OclExpression__Classifier = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _OclExpression__Element = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _OclExpression__MonikeredElement = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _OclExpression__Nameable = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _OclExpression__NamedElement = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _OclExpression__OclAny = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclExpression__OclExpression = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _OclExpression__TypedElement = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _OclExpression__Visitable = new ExecutorFragment(Classes._OclExpression, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _OclInvalid__OclAny = new ExecutorFragment(Classes._OclInvalid, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclInvalid__OclInvalid = new ExecutorFragment(Classes._OclInvalid, PivotTables.Classes._OclInvalid, null, null);
		public static final ExecutorFragment _OclInvalid__OclVoid = new ExecutorFragment(Classes._OclInvalid, PivotTables.Classes._OclVoid, null, null);
		
		public static final ExecutorFragment _OclMessage__OclAny = new ExecutorFragment(Classes._OclMessage, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclMessage__OclMessage = new ExecutorFragment(Classes._OclMessage, PivotTables.Classes._OclMessage, null, null);
		
		public static final ExecutorFragment _OclSelf__OclAny = new ExecutorFragment(Classes._OclSelf, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclSelf__OclSelf = new ExecutorFragment(Classes._OclSelf, PivotTables.Classes._OclSelf, null, null);
		
		public static final ExecutorFragment _OclState__OclAny = new ExecutorFragment(Classes._OclState, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclState__OclState = new ExecutorFragment(Classes._OclState, PivotTables.Classes._OclState, null, null);
		
		public static final ExecutorFragment _OclTuple__OclAny = new ExecutorFragment(Classes._OclTuple, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclTuple__OclTuple = new ExecutorFragment(Classes._OclTuple, PivotTables.Classes._OclTuple, null, null);
		
		public static final ExecutorFragment _OclVoid__OclAny = new ExecutorFragment(Classes._OclVoid, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclVoid__OclVoid = new ExecutorFragment(Classes._OclVoid, PivotTables.Classes._OclVoid, null, null);
		
		public static final ExecutorFragment _OpaqueExpression__Classifier = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _OpaqueExpression__Element = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _OpaqueExpression__MonikeredElement = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _OpaqueExpression__Nameable = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _OpaqueExpression__NamedElement = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _OpaqueExpression__OclAny = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OpaqueExpression__OpaqueExpression = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._OpaqueExpression, null, null);
		public static final ExecutorFragment _OpaqueExpression__ParameterableElement = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _OpaqueExpression__TypedElement = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _OpaqueExpression__ValueSpecification = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._ValueSpecification, null, null);
		public static final ExecutorFragment _OpaqueExpression__Visitable = new ExecutorFragment(Classes._OpaqueExpression, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Operation__Classifier = new ExecutorFragment(Classes._Operation, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Operation__Element = new ExecutorFragment(Classes._Operation, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Operation__Feature = new ExecutorFragment(Classes._Operation, PivotTables.Classes._Feature, null, null);
		public static final ExecutorFragment _Operation__MonikeredElement = new ExecutorFragment(Classes._Operation, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Operation__MultiplicityElement = new ExecutorFragment(Classes._Operation, PivotTables.Classes._MultiplicityElement, null, null);
		public static final ExecutorFragment _Operation__Nameable = new ExecutorFragment(Classes._Operation, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Operation__NamedElement = new ExecutorFragment(Classes._Operation, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Operation__Namespace = new ExecutorFragment(Classes._Operation, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _Operation__OclAny = new ExecutorFragment(Classes._Operation, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Operation__Operation = new ExecutorFragment(Classes._Operation, PivotTables.Classes._Operation, null, null);
		public static final ExecutorFragment _Operation__ParameterableElement = new ExecutorFragment(Classes._Operation, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _Operation__TemplateableElement = new ExecutorFragment(Classes._Operation, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _Operation__TypedElement = new ExecutorFragment(Classes._Operation, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _Operation__TypedMultiplicityElement = new ExecutorFragment(Classes._Operation, PivotTables.Classes._TypedMultiplicityElement, null, null);
		public static final ExecutorFragment _Operation__Visitable = new ExecutorFragment(Classes._Operation, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _OperationCallExp__CallExp = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _OperationCallExp__Classifier = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _OperationCallExp__Element = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _OperationCallExp__FeatureCallExp = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._FeatureCallExp, null, null);
		public static final ExecutorFragment _OperationCallExp__MonikeredElement = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _OperationCallExp__Nameable = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _OperationCallExp__NamedElement = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _OperationCallExp__OclAny = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OperationCallExp__OclExpression = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _OperationCallExp__OperationCallExp = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._OperationCallExp, null, null);
		public static final ExecutorFragment _OperationCallExp__TypedElement = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _OperationCallExp__Visitable = new ExecutorFragment(Classes._OperationCallExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _OperationTemplateParameter__Classifier = new ExecutorFragment(Classes._OperationTemplateParameter, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _OperationTemplateParameter__Element = new ExecutorFragment(Classes._OperationTemplateParameter, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _OperationTemplateParameter__OclAny = new ExecutorFragment(Classes._OperationTemplateParameter, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OperationTemplateParameter__OperationTemplateParameter = new ExecutorFragment(Classes._OperationTemplateParameter, PivotTables.Classes._OperationTemplateParameter, null, null);
		public static final ExecutorFragment _OperationTemplateParameter__TemplateParameter = new ExecutorFragment(Classes._OperationTemplateParameter, PivotTables.Classes._TemplateParameter, null, null);
		public static final ExecutorFragment _OperationTemplateParameter__Visitable = new ExecutorFragment(Classes._OperationTemplateParameter, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _OrderedCollection__Collection = new ExecutorFragment(Classes._OrderedCollection, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _OrderedCollection__OclAny = new ExecutorFragment(Classes._OrderedCollection, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OrderedCollection__OrderedCollection = new ExecutorFragment(Classes._OrderedCollection, PivotTables.Classes._OrderedCollection, null, null);
		
		public static final ExecutorFragment _OrderedSet__Collection = new ExecutorFragment(Classes._OrderedSet, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _OrderedSet__OclAny = new ExecutorFragment(Classes._OrderedSet, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OrderedSet__OrderedCollection = new ExecutorFragment(Classes._OrderedSet, PivotTables.Classes._OrderedCollection, null, null);
		public static final ExecutorFragment _OrderedSet__OrderedSet = new ExecutorFragment(Classes._OrderedSet, PivotTables.Classes._OrderedSet, null, null);
		public static final ExecutorFragment _OrderedSet__UniqueCollection = new ExecutorFragment(Classes._OrderedSet, PivotTables.Classes._UniqueCollection, null, null);
		
		public static final ExecutorFragment _OrderedSetType__Class = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _OrderedSetType__Classifier = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _OrderedSetType__CollectionType = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._CollectionType, null, null);
		public static final ExecutorFragment _OrderedSetType__DataType = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _OrderedSetType__Element = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _OrderedSetType__MonikeredElement = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _OrderedSetType__Nameable = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _OrderedSetType__NamedElement = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _OrderedSetType__Namespace = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _OrderedSetType__OclAny = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OrderedSetType__OrderedSetType = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._OrderedSetType, null, null);
		public static final ExecutorFragment _OrderedSetType__ParameterableElement = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _OrderedSetType__TemplateableElement = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _OrderedSetType__Type = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _OrderedSetType__Visitable = new ExecutorFragment(Classes._OrderedSetType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Package__Classifier = new ExecutorFragment(Classes._Package, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Package__Element = new ExecutorFragment(Classes._Package, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Package__MonikeredElement = new ExecutorFragment(Classes._Package, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Package__Nameable = new ExecutorFragment(Classes._Package, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Package__NamedElement = new ExecutorFragment(Classes._Package, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Package__Namespace = new ExecutorFragment(Classes._Package, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _Package__OclAny = new ExecutorFragment(Classes._Package, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Package__Package = new ExecutorFragment(Classes._Package, PivotTables.Classes._Package, null, null);
		public static final ExecutorFragment _Package__TemplateableElement = new ExecutorFragment(Classes._Package, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _Package__Visitable = new ExecutorFragment(Classes._Package, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _PackageableElement__Classifier = new ExecutorFragment(Classes._PackageableElement, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _PackageableElement__Element = new ExecutorFragment(Classes._PackageableElement, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _PackageableElement__MonikeredElement = new ExecutorFragment(Classes._PackageableElement, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _PackageableElement__OclAny = new ExecutorFragment(Classes._PackageableElement, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _PackageableElement__PackageableElement = new ExecutorFragment(Classes._PackageableElement, PivotTables.Classes._PackageableElement, null, null);
		public static final ExecutorFragment _PackageableElement__ParameterableElement = new ExecutorFragment(Classes._PackageableElement, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _PackageableElement__Visitable = new ExecutorFragment(Classes._PackageableElement, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Parameter__Classifier = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Parameter__Element = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Parameter__MonikeredElement = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Parameter__MultiplicityElement = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._MultiplicityElement, null, null);
		public static final ExecutorFragment _Parameter__Nameable = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Parameter__NamedElement = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._Parameter, null, null);
		public static final ExecutorFragment _Parameter__TypedElement = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _Parameter__TypedMultiplicityElement = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._TypedMultiplicityElement, null, null);
		public static final ExecutorFragment _Parameter__VariableDeclaration = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._VariableDeclaration, null, null);
		public static final ExecutorFragment _Parameter__Visitable = new ExecutorFragment(Classes._Parameter, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _ParameterableElement__Classifier = new ExecutorFragment(Classes._ParameterableElement, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _ParameterableElement__Element = new ExecutorFragment(Classes._ParameterableElement, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _ParameterableElement__MonikeredElement = new ExecutorFragment(Classes._ParameterableElement, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _ParameterableElement__OclAny = new ExecutorFragment(Classes._ParameterableElement, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _ParameterableElement__ParameterableElement = new ExecutorFragment(Classes._ParameterableElement, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _ParameterableElement__Visitable = new ExecutorFragment(Classes._ParameterableElement, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Pivotable__Classifier = new ExecutorFragment(Classes._Pivotable, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Pivotable__OclAny = new ExecutorFragment(Classes._Pivotable, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Pivotable__Pivotable = new ExecutorFragment(Classes._Pivotable, PivotTables.Classes._Pivotable, null, null);
		
		public static final ExecutorFragment _Precedence__Classifier = new ExecutorFragment(Classes._Precedence, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Precedence__Element = new ExecutorFragment(Classes._Precedence, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Precedence__MonikeredElement = new ExecutorFragment(Classes._Precedence, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Precedence__Nameable = new ExecutorFragment(Classes._Precedence, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Precedence__NamedElement = new ExecutorFragment(Classes._Precedence, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Precedence__OclAny = new ExecutorFragment(Classes._Precedence, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Precedence__Precedence = new ExecutorFragment(Classes._Precedence, PivotTables.Classes._Precedence, null, null);
		public static final ExecutorFragment _Precedence__Visitable = new ExecutorFragment(Classes._Precedence, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _PrimitiveLiteralExp__Classifier = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__Element = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__LiteralExp = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__MonikeredElement = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__Nameable = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__NamedElement = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__OclAny = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__OclExpression = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__TypedElement = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _PrimitiveLiteralExp__Visitable = new ExecutorFragment(Classes._PrimitiveLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _PrimitiveType__Class = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _PrimitiveType__Classifier = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _PrimitiveType__DataType = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _PrimitiveType__Element = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _PrimitiveType__MonikeredElement = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _PrimitiveType__Nameable = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _PrimitiveType__NamedElement = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _PrimitiveType__Namespace = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _PrimitiveType__OclAny = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _PrimitiveType__ParameterableElement = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _PrimitiveType__PrimitiveType = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._PrimitiveType, null, null);
		public static final ExecutorFragment _PrimitiveType__TemplateableElement = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _PrimitiveType__Type = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _PrimitiveType__Visitable = new ExecutorFragment(Classes._PrimitiveType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Property__Classifier = new ExecutorFragment(Classes._Property, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Property__Element = new ExecutorFragment(Classes._Property, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Property__Feature = new ExecutorFragment(Classes._Property, PivotTables.Classes._Feature, null, null);
		public static final ExecutorFragment _Property__MonikeredElement = new ExecutorFragment(Classes._Property, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Property__MultiplicityElement = new ExecutorFragment(Classes._Property, PivotTables.Classes._MultiplicityElement, null, null);
		public static final ExecutorFragment _Property__Nameable = new ExecutorFragment(Classes._Property, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Property__NamedElement = new ExecutorFragment(Classes._Property, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Property__OclAny = new ExecutorFragment(Classes._Property, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Property__ParameterableElement = new ExecutorFragment(Classes._Property, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _Property__Property = new ExecutorFragment(Classes._Property, PivotTables.Classes._Property, null, null);
		public static final ExecutorFragment _Property__TypedElement = new ExecutorFragment(Classes._Property, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _Property__TypedMultiplicityElement = new ExecutorFragment(Classes._Property, PivotTables.Classes._TypedMultiplicityElement, null, null);
		public static final ExecutorFragment _Property__Visitable = new ExecutorFragment(Classes._Property, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _PropertyCallExp__CallExp = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._CallExp, null, null);
		public static final ExecutorFragment _PropertyCallExp__Classifier = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _PropertyCallExp__Element = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _PropertyCallExp__FeatureCallExp = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._FeatureCallExp, null, null);
		public static final ExecutorFragment _PropertyCallExp__MonikeredElement = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _PropertyCallExp__Nameable = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _PropertyCallExp__NamedElement = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _PropertyCallExp__NavigationCallExp = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._NavigationCallExp, null, null);
		public static final ExecutorFragment _PropertyCallExp__OclAny = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _PropertyCallExp__OclExpression = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _PropertyCallExp__PropertyCallExp = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._PropertyCallExp, null, null);
		public static final ExecutorFragment _PropertyCallExp__TypedElement = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _PropertyCallExp__Visitable = new ExecutorFragment(Classes._PropertyCallExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Real__OclAny = new ExecutorFragment(Classes._Real, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Real__Real = new ExecutorFragment(Classes._Real, PivotTables.Classes._Real, null, null);
		
		public static final ExecutorFragment _RealLiteralExp__Classifier = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _RealLiteralExp__Element = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _RealLiteralExp__LiteralExp = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _RealLiteralExp__MonikeredElement = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _RealLiteralExp__Nameable = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _RealLiteralExp__NamedElement = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _RealLiteralExp__NumericLiteralExp = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._NumericLiteralExp, null, null);
		public static final ExecutorFragment _RealLiteralExp__OclAny = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _RealLiteralExp__OclExpression = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _RealLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _RealLiteralExp__RealLiteralExp = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._RealLiteralExp, null, null);
		public static final ExecutorFragment _RealLiteralExp__TypedElement = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _RealLiteralExp__Visitable = new ExecutorFragment(Classes._RealLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _SelfType__Class = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _SelfType__Classifier = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _SelfType__Element = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _SelfType__MonikeredElement = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _SelfType__Nameable = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _SelfType__NamedElement = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _SelfType__Namespace = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _SelfType__OclAny = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _SelfType__ParameterableElement = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _SelfType__SelfType = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._SelfType, null, null);
		public static final ExecutorFragment _SelfType__TemplateableElement = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _SelfType__Type = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _SelfType__Visitable = new ExecutorFragment(Classes._SelfType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _SendSignalAction__Classifier = new ExecutorFragment(Classes._SendSignalAction, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _SendSignalAction__Element = new ExecutorFragment(Classes._SendSignalAction, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _SendSignalAction__MonikeredElement = new ExecutorFragment(Classes._SendSignalAction, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _SendSignalAction__Nameable = new ExecutorFragment(Classes._SendSignalAction, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _SendSignalAction__NamedElement = new ExecutorFragment(Classes._SendSignalAction, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _SendSignalAction__OclAny = new ExecutorFragment(Classes._SendSignalAction, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _SendSignalAction__SendSignalAction = new ExecutorFragment(Classes._SendSignalAction, PivotTables.Classes._SendSignalAction, null, null);
		public static final ExecutorFragment _SendSignalAction__Visitable = new ExecutorFragment(Classes._SendSignalAction, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Sequence__Collection = new ExecutorFragment(Classes._Sequence, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _Sequence__NonUniqueCollection = new ExecutorFragment(Classes._Sequence, PivotTables.Classes._NonUniqueCollection, null, null);
		public static final ExecutorFragment _Sequence__OclAny = new ExecutorFragment(Classes._Sequence, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Sequence__OrderedCollection = new ExecutorFragment(Classes._Sequence, PivotTables.Classes._OrderedCollection, null, null);
		public static final ExecutorFragment _Sequence__Sequence = new ExecutorFragment(Classes._Sequence, PivotTables.Classes._Sequence, null, null);
		
		public static final ExecutorFragment _SequenceType__Class = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _SequenceType__Classifier = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _SequenceType__CollectionType = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._CollectionType, null, null);
		public static final ExecutorFragment _SequenceType__DataType = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _SequenceType__Element = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _SequenceType__MonikeredElement = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _SequenceType__Nameable = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _SequenceType__NamedElement = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _SequenceType__Namespace = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _SequenceType__OclAny = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _SequenceType__ParameterableElement = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _SequenceType__SequenceType = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._SequenceType, null, null);
		public static final ExecutorFragment _SequenceType__TemplateableElement = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _SequenceType__Type = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _SequenceType__Visitable = new ExecutorFragment(Classes._SequenceType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Set__Collection = new ExecutorFragment(Classes._Set, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _Set__NonOrderedCollection = new ExecutorFragment(Classes._Set, PivotTables.Classes._NonOrderedCollection, null, null);
		public static final ExecutorFragment _Set__OclAny = new ExecutorFragment(Classes._Set, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Set__Set = new ExecutorFragment(Classes._Set, PivotTables.Classes._Set, null, null);
		public static final ExecutorFragment _Set__UniqueCollection = new ExecutorFragment(Classes._Set, PivotTables.Classes._UniqueCollection, null, null);
		
		public static final ExecutorFragment _SetType__Class = new ExecutorFragment(Classes._SetType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _SetType__Classifier = new ExecutorFragment(Classes._SetType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _SetType__CollectionType = new ExecutorFragment(Classes._SetType, PivotTables.Classes._CollectionType, null, null);
		public static final ExecutorFragment _SetType__DataType = new ExecutorFragment(Classes._SetType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _SetType__Element = new ExecutorFragment(Classes._SetType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _SetType__MonikeredElement = new ExecutorFragment(Classes._SetType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _SetType__Nameable = new ExecutorFragment(Classes._SetType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _SetType__NamedElement = new ExecutorFragment(Classes._SetType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _SetType__Namespace = new ExecutorFragment(Classes._SetType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _SetType__OclAny = new ExecutorFragment(Classes._SetType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _SetType__ParameterableElement = new ExecutorFragment(Classes._SetType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _SetType__SetType = new ExecutorFragment(Classes._SetType, PivotTables.Classes._SetType, null, null);
		public static final ExecutorFragment _SetType__TemplateableElement = new ExecutorFragment(Classes._SetType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _SetType__Type = new ExecutorFragment(Classes._SetType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _SetType__Visitable = new ExecutorFragment(Classes._SetType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Signal__Classifier = new ExecutorFragment(Classes._Signal, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Signal__Element = new ExecutorFragment(Classes._Signal, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Signal__MonikeredElement = new ExecutorFragment(Classes._Signal, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Signal__Nameable = new ExecutorFragment(Classes._Signal, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Signal__NamedElement = new ExecutorFragment(Classes._Signal, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Signal__OclAny = new ExecutorFragment(Classes._Signal, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Signal__Signal = new ExecutorFragment(Classes._Signal, PivotTables.Classes._Signal, null, null);
		public static final ExecutorFragment _Signal__Visitable = new ExecutorFragment(Classes._Signal, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _State__Classifier = new ExecutorFragment(Classes._State, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _State__Element = new ExecutorFragment(Classes._State, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _State__MonikeredElement = new ExecutorFragment(Classes._State, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _State__Nameable = new ExecutorFragment(Classes._State, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _State__NamedElement = new ExecutorFragment(Classes._State, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _State__OclAny = new ExecutorFragment(Classes._State, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _State__State = new ExecutorFragment(Classes._State, PivotTables.Classes._State, null, null);
		public static final ExecutorFragment _State__Visitable = new ExecutorFragment(Classes._State, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _StateExp__Classifier = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _StateExp__Element = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _StateExp__MonikeredElement = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _StateExp__Nameable = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _StateExp__NamedElement = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _StateExp__OclAny = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _StateExp__OclExpression = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _StateExp__StateExp = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._StateExp, null, null);
		public static final ExecutorFragment _StateExp__TypedElement = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _StateExp__Visitable = new ExecutorFragment(Classes._StateExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _String__OclAny = new ExecutorFragment(Classes._String, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _String__String = new ExecutorFragment(Classes._String, PivotTables.Classes._String, null, null);
		
		public static final ExecutorFragment _StringLiteralExp__Classifier = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _StringLiteralExp__Element = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _StringLiteralExp__LiteralExp = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _StringLiteralExp__MonikeredElement = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _StringLiteralExp__Nameable = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _StringLiteralExp__NamedElement = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _StringLiteralExp__OclAny = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _StringLiteralExp__OclExpression = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _StringLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _StringLiteralExp__StringLiteralExp = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._StringLiteralExp, null, null);
		public static final ExecutorFragment _StringLiteralExp__TypedElement = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _StringLiteralExp__Visitable = new ExecutorFragment(Classes._StringLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TemplateBinding__Classifier = new ExecutorFragment(Classes._TemplateBinding, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TemplateBinding__Element = new ExecutorFragment(Classes._TemplateBinding, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TemplateBinding__OclAny = new ExecutorFragment(Classes._TemplateBinding, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TemplateBinding__TemplateBinding = new ExecutorFragment(Classes._TemplateBinding, PivotTables.Classes._TemplateBinding, null, null);
		public static final ExecutorFragment _TemplateBinding__Visitable = new ExecutorFragment(Classes._TemplateBinding, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TemplateParameter__Classifier = new ExecutorFragment(Classes._TemplateParameter, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TemplateParameter__Element = new ExecutorFragment(Classes._TemplateParameter, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TemplateParameter__OclAny = new ExecutorFragment(Classes._TemplateParameter, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TemplateParameter__TemplateParameter = new ExecutorFragment(Classes._TemplateParameter, PivotTables.Classes._TemplateParameter, null, null);
		public static final ExecutorFragment _TemplateParameter__Visitable = new ExecutorFragment(Classes._TemplateParameter, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TemplateParameterSubstitution__Classifier = new ExecutorFragment(Classes._TemplateParameterSubstitution, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TemplateParameterSubstitution__Element = new ExecutorFragment(Classes._TemplateParameterSubstitution, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TemplateParameterSubstitution__OclAny = new ExecutorFragment(Classes._TemplateParameterSubstitution, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TemplateParameterSubstitution__TemplateParameterSubstitution = new ExecutorFragment(Classes._TemplateParameterSubstitution, PivotTables.Classes._TemplateParameterSubstitution, null, null);
		public static final ExecutorFragment _TemplateParameterSubstitution__Visitable = new ExecutorFragment(Classes._TemplateParameterSubstitution, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TemplateParameterType__Classifier = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TemplateParameterType__Element = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TemplateParameterType__MonikeredElement = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TemplateParameterType__Nameable = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _TemplateParameterType__NamedElement = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _TemplateParameterType__OclAny = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TemplateParameterType__ParameterableElement = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _TemplateParameterType__TemplateParameterType = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._TemplateParameterType, null, null);
		public static final ExecutorFragment _TemplateParameterType__TemplateableElement = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _TemplateParameterType__Type = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _TemplateParameterType__Visitable = new ExecutorFragment(Classes._TemplateParameterType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TemplateSignature__Classifier = new ExecutorFragment(Classes._TemplateSignature, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TemplateSignature__Element = new ExecutorFragment(Classes._TemplateSignature, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TemplateSignature__MonikeredElement = new ExecutorFragment(Classes._TemplateSignature, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TemplateSignature__OclAny = new ExecutorFragment(Classes._TemplateSignature, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TemplateSignature__TemplateSignature = new ExecutorFragment(Classes._TemplateSignature, PivotTables.Classes._TemplateSignature, null, null);
		public static final ExecutorFragment _TemplateSignature__Visitable = new ExecutorFragment(Classes._TemplateSignature, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TemplateableElement__Classifier = new ExecutorFragment(Classes._TemplateableElement, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TemplateableElement__Element = new ExecutorFragment(Classes._TemplateableElement, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TemplateableElement__MonikeredElement = new ExecutorFragment(Classes._TemplateableElement, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TemplateableElement__OclAny = new ExecutorFragment(Classes._TemplateableElement, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TemplateableElement__TemplateableElement = new ExecutorFragment(Classes._TemplateableElement, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _TemplateableElement__Visitable = new ExecutorFragment(Classes._TemplateableElement, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Throwable__Throwable = new ExecutorFragment(Classes._Throwable, PivotTables.Classes._Throwable, null, null);
		
		public static final ExecutorFragment _Tuple__OclAny = new ExecutorFragment(Classes._Tuple, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Tuple__Tuple = new ExecutorFragment(Classes._Tuple, PivotTables.Classes._Tuple, null, null);
		
		public static final ExecutorFragment _TupleLiteralExp__Classifier = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TupleLiteralExp__Element = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TupleLiteralExp__LiteralExp = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _TupleLiteralExp__MonikeredElement = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TupleLiteralExp__Nameable = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _TupleLiteralExp__NamedElement = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _TupleLiteralExp__OclAny = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TupleLiteralExp__OclExpression = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _TupleLiteralExp__TupleLiteralExp = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._TupleLiteralExp, null, null);
		public static final ExecutorFragment _TupleLiteralExp__TypedElement = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _TupleLiteralExp__Visitable = new ExecutorFragment(Classes._TupleLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TupleLiteralPart__Classifier = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TupleLiteralPart__Element = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TupleLiteralPart__MonikeredElement = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TupleLiteralPart__Nameable = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _TupleLiteralPart__NamedElement = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _TupleLiteralPart__OclAny = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TupleLiteralPart__TupleLiteralPart = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._TupleLiteralPart, null, null);
		public static final ExecutorFragment _TupleLiteralPart__TypedElement = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _TupleLiteralPart__VariableDeclaration = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._VariableDeclaration, null, null);
		public static final ExecutorFragment _TupleLiteralPart__Visitable = new ExecutorFragment(Classes._TupleLiteralPart, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TupleType__Class = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _TupleType__Classifier = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TupleType__DataType = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._DataType, null, null);
		public static final ExecutorFragment _TupleType__Element = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TupleType__MonikeredElement = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TupleType__Nameable = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _TupleType__NamedElement = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _TupleType__Namespace = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _TupleType__OclAny = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TupleType__ParameterableElement = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _TupleType__TemplateableElement = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _TupleType__TupleType = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._TupleType, null, null);
		public static final ExecutorFragment _TupleType__Type = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _TupleType__Visitable = new ExecutorFragment(Classes._TupleType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Type__Classifier = new ExecutorFragment(Classes._Type, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Type__Element = new ExecutorFragment(Classes._Type, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Type__MonikeredElement = new ExecutorFragment(Classes._Type, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Type__Nameable = new ExecutorFragment(Classes._Type, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Type__NamedElement = new ExecutorFragment(Classes._Type, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Type__OclAny = new ExecutorFragment(Classes._Type, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Type__ParameterableElement = new ExecutorFragment(Classes._Type, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _Type__TemplateableElement = new ExecutorFragment(Classes._Type, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _Type__Type = new ExecutorFragment(Classes._Type, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _Type__Visitable = new ExecutorFragment(Classes._Type, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TypeExp__Classifier = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TypeExp__Element = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TypeExp__MonikeredElement = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TypeExp__Nameable = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _TypeExp__NamedElement = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _TypeExp__OclAny = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TypeExp__OclExpression = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _TypeExp__TypeExp = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._TypeExp, null, null);
		public static final ExecutorFragment _TypeExp__TypedElement = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _TypeExp__Visitable = new ExecutorFragment(Classes._TypeExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TypeTemplateParameter__Classifier = new ExecutorFragment(Classes._TypeTemplateParameter, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TypeTemplateParameter__Element = new ExecutorFragment(Classes._TypeTemplateParameter, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TypeTemplateParameter__OclAny = new ExecutorFragment(Classes._TypeTemplateParameter, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TypeTemplateParameter__TemplateParameter = new ExecutorFragment(Classes._TypeTemplateParameter, PivotTables.Classes._TemplateParameter, null, null);
		public static final ExecutorFragment _TypeTemplateParameter__TypeTemplateParameter = new ExecutorFragment(Classes._TypeTemplateParameter, PivotTables.Classes._TypeTemplateParameter, null, null);
		public static final ExecutorFragment _TypeTemplateParameter__Visitable = new ExecutorFragment(Classes._TypeTemplateParameter, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TypedElement__Classifier = new ExecutorFragment(Classes._TypedElement, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TypedElement__Element = new ExecutorFragment(Classes._TypedElement, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TypedElement__MonikeredElement = new ExecutorFragment(Classes._TypedElement, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TypedElement__Nameable = new ExecutorFragment(Classes._TypedElement, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _TypedElement__NamedElement = new ExecutorFragment(Classes._TypedElement, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _TypedElement__OclAny = new ExecutorFragment(Classes._TypedElement, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TypedElement__TypedElement = new ExecutorFragment(Classes._TypedElement, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _TypedElement__Visitable = new ExecutorFragment(Classes._TypedElement, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _TypedMultiplicityElement__Classifier = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__Element = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__MonikeredElement = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__MultiplicityElement = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._MultiplicityElement, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__Nameable = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__NamedElement = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__OclAny = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__TypedElement = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__TypedMultiplicityElement = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._TypedMultiplicityElement, null, null);
		public static final ExecutorFragment _TypedMultiplicityElement__Visitable = new ExecutorFragment(Classes._TypedMultiplicityElement, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _UniqueCollection__Collection = new ExecutorFragment(Classes._UniqueCollection, PivotTables.Classes._Collection, null, null);
		public static final ExecutorFragment _UniqueCollection__OclAny = new ExecutorFragment(Classes._UniqueCollection, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _UniqueCollection__UniqueCollection = new ExecutorFragment(Classes._UniqueCollection, PivotTables.Classes._UniqueCollection, null, null);
		
		public static final ExecutorFragment _UnlimitedNatural__Integer = new ExecutorFragment(Classes._UnlimitedNatural, PivotTables.Classes._Integer, null, null);
		public static final ExecutorFragment _UnlimitedNatural__OclAny = new ExecutorFragment(Classes._UnlimitedNatural, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _UnlimitedNatural__Real = new ExecutorFragment(Classes._UnlimitedNatural, PivotTables.Classes._Real, null, null);
		public static final ExecutorFragment _UnlimitedNatural__UnlimitedNatural = new ExecutorFragment(Classes._UnlimitedNatural, PivotTables.Classes._UnlimitedNatural, null, null);
		
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__Classifier = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__Element = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__LiteralExp = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._LiteralExp, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__MonikeredElement = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__Nameable = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__NamedElement = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__NumericLiteralExp = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._NumericLiteralExp, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__OclAny = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__OclExpression = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._PrimitiveLiteralExp, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__TypedElement = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._UnlimitedNaturalLiteralExp, null, null);
		public static final ExecutorFragment _UnlimitedNaturalLiteralExp__Visitable = new ExecutorFragment(Classes._UnlimitedNaturalLiteralExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _UnspecifiedType__Class = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _UnspecifiedType__Classifier = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _UnspecifiedType__Element = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _UnspecifiedType__MonikeredElement = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _UnspecifiedType__Nameable = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _UnspecifiedType__NamedElement = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _UnspecifiedType__Namespace = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _UnspecifiedType__OclAny = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _UnspecifiedType__ParameterableElement = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _UnspecifiedType__TemplateableElement = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _UnspecifiedType__Type = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _UnspecifiedType__UnspecifiedType = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._UnspecifiedType, null, null);
		public static final ExecutorFragment _UnspecifiedType__Visitable = new ExecutorFragment(Classes._UnspecifiedType, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _UnspecifiedValueExp__Classifier = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__Element = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__MonikeredElement = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__Nameable = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__NamedElement = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__OclAny = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__OclExpression = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__TypedElement = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__UnspecifiedValueExp = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._UnspecifiedValueExp, null, null);
		public static final ExecutorFragment _UnspecifiedValueExp__Visitable = new ExecutorFragment(Classes._UnspecifiedValueExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _ValueSpecification__Classifier = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _ValueSpecification__Element = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _ValueSpecification__MonikeredElement = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _ValueSpecification__Nameable = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _ValueSpecification__NamedElement = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _ValueSpecification__OclAny = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _ValueSpecification__ParameterableElement = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _ValueSpecification__TypedElement = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _ValueSpecification__ValueSpecification = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._ValueSpecification, null, null);
		public static final ExecutorFragment _ValueSpecification__Visitable = new ExecutorFragment(Classes._ValueSpecification, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Variable__Classifier = new ExecutorFragment(Classes._Variable, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Variable__Element = new ExecutorFragment(Classes._Variable, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _Variable__MonikeredElement = new ExecutorFragment(Classes._Variable, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _Variable__Nameable = new ExecutorFragment(Classes._Variable, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _Variable__NamedElement = new ExecutorFragment(Classes._Variable, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _Variable__OclAny = new ExecutorFragment(Classes._Variable, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Variable__TypedElement = new ExecutorFragment(Classes._Variable, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _Variable__Variable = new ExecutorFragment(Classes._Variable, PivotTables.Classes._Variable, null, null);
		public static final ExecutorFragment _Variable__VariableDeclaration = new ExecutorFragment(Classes._Variable, PivotTables.Classes._VariableDeclaration, null, null);
		public static final ExecutorFragment _Variable__Visitable = new ExecutorFragment(Classes._Variable, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _VariableDeclaration__Classifier = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _VariableDeclaration__Element = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _VariableDeclaration__MonikeredElement = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _VariableDeclaration__Nameable = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _VariableDeclaration__NamedElement = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _VariableDeclaration__OclAny = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _VariableDeclaration__TypedElement = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _VariableDeclaration__VariableDeclaration = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._VariableDeclaration, null, null);
		public static final ExecutorFragment _VariableDeclaration__Visitable = new ExecutorFragment(Classes._VariableDeclaration, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _VariableExp__Classifier = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _VariableExp__Element = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _VariableExp__MonikeredElement = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _VariableExp__Nameable = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _VariableExp__NamedElement = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _VariableExp__OclAny = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _VariableExp__OclExpression = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._OclExpression, null, null);
		public static final ExecutorFragment _VariableExp__TypedElement = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._TypedElement, null, null);
		public static final ExecutorFragment _VariableExp__VariableExp = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._VariableExp, null, null);
		public static final ExecutorFragment _VariableExp__Visitable = new ExecutorFragment(Classes._VariableExp, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Visitable__Classifier = new ExecutorFragment(Classes._Visitable, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Visitable__OclAny = new ExecutorFragment(Classes._Visitable, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Visitable__Visitable = new ExecutorFragment(Classes._Visitable, PivotTables.Classes._Visitable, null, null);
		
		public static final ExecutorFragment _Visitor__Classifier = new ExecutorFragment(Classes._Visitor, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Visitor__OclAny = new ExecutorFragment(Classes._Visitor, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Visitor__Visitor = new ExecutorFragment(Classes._Visitor, PivotTables.Classes._Visitor, null, null);
		
		public static final ExecutorFragment _VoidType__Class = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._Class, null, null);
		public static final ExecutorFragment _VoidType__Classifier = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _VoidType__Element = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._Element, null, null);
		public static final ExecutorFragment _VoidType__MonikeredElement = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._MonikeredElement, null, null);
		public static final ExecutorFragment _VoidType__Nameable = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._Nameable, null, null);
		public static final ExecutorFragment _VoidType__NamedElement = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._NamedElement, null, null);
		public static final ExecutorFragment _VoidType__Namespace = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._Namespace, null, null);
		public static final ExecutorFragment _VoidType__OclAny = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _VoidType__ParameterableElement = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._ParameterableElement, null, null);
		public static final ExecutorFragment _VoidType__TemplateableElement = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._TemplateableElement, null, null);
		public static final ExecutorFragment _VoidType__Type = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._Type, null, null);
		public static final ExecutorFragment _VoidType__Visitable = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._Visitable, null, null);
		public static final ExecutorFragment _VoidType__VoidType = new ExecutorFragment(Classes._VoidType, PivotTables.Classes._VoidType, null, null);
		
	}

	/**
	 *	The operation descriptors for each operation of each class.
	 */
	public static class Operations {
		public static final ExecutorOperation _Bag___lt__gt_ = new ExecutorOperation("<>", Classes._Bag, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _Bag___eq_ = new ExecutorOperation("=", Classes._Bag, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _Bag__excluding = new ExecutorOperation("excluding", Classes._Bag, 2, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
		public static final ExecutorOperation _Bag__flatten = new ExecutorOperation("flatten", Classes._Bag, 3, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Bag__including = new ExecutorOperation("including", Classes._Bag, 4, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
		public static final ExecutorOperation _Bag__reject = new ExecutorOperation("reject", Classes._Bag, 5, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
		public static final ExecutorOperation _Bag__select = new ExecutorOperation("select", Classes._Bag, 6, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
	
		public static final ExecutorOperation _Boolean___lt__gt_ = new ExecutorOperation("<>", Classes._Boolean, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _Boolean___eq_ = new ExecutorOperation("=", Classes._Boolean, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__allInstances = new ExecutorOperation("allInstances", Classes._Boolean, 2, org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__and = new ExecutorOperation("and", Classes._Boolean, 3, org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__implies = new ExecutorOperation("implies", Classes._Boolean, 4, org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__not = new ExecutorOperation("not", Classes._Boolean, 5, org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__or = new ExecutorOperation("or", Classes._Boolean, 6, org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__toString = new ExecutorOperation("toString", Classes._Boolean, 7, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final ExecutorOperation _Boolean__xor = new ExecutorOperation("xor", Classes._Boolean, 8, org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
	
		public static final ExecutorOperation _Classifier__allInstances = new ExecutorOperation("allInstances", Classes._Classifier, 0, org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _Classifier__oclContainer = new ExecutorOperation("oclContainer", Classes._Classifier, 1, org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation.INSTANCE);
		public static final ExecutorOperation _Classifier__oclContents = new ExecutorOperation("oclContents", Classes._Classifier, 2, org.eclipse.ocl.examples.library.classifier.ClassifierOclContentsOperation.INSTANCE);
	
		public static final ExecutorOperation _Collection___lt__gt_ = new ExecutorOperation("<>", Classes._Collection, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _Collection___eq_ = new ExecutorOperation("=", Classes._Collection, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _Collection__any = new ExecutorOperation("any", Classes._Collection, 2, org.eclipse.ocl.examples.library.iterator.AnyIteration.INSTANCE);
		public static final ExecutorOperation _Collection__asBag = new ExecutorOperation("asBag", Classes._Collection, 3, org.eclipse.ocl.examples.library.collection.CollectionAsBagOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asOrderedSet = new ExecutorOperation("asOrderedSet", Classes._Collection, 4, org.eclipse.ocl.examples.library.collection.CollectionAsOrderedSetOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asSequence = new ExecutorOperation("asSequence", Classes._Collection, 5, org.eclipse.ocl.examples.library.collection.CollectionAsSequenceOperation.INSTANCE);
		public static final ExecutorOperation _Collection__asSet = new ExecutorOperation("asSet", Classes._Collection, 6, org.eclipse.ocl.examples.library.collection.CollectionAsSetOperation.INSTANCE);
		public static final ExecutorOperation _Collection__collect = new ExecutorOperation("collect", Classes._Collection, 7, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
		public static final ExecutorOperation _Collection__collectNested = new ExecutorOperation("collectNested", Classes._Collection, 8, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
		public static final ExecutorOperation _Collection__count = new ExecutorOperation("count", Classes._Collection, 9, org.eclipse.ocl.examples.library.collection.CollectionCountOperation.INSTANCE);
		public static final ExecutorOperation _Collection__excludes = new ExecutorOperation("excludes", Classes._Collection, 10, org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation.INSTANCE);
		public static final ExecutorOperation _Collection__excludesAll = new ExecutorOperation("excludesAll", Classes._Collection, 11, org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation.INSTANCE);
		public static final ExecutorOperation _Collection__excluding = new ExecutorOperation("excluding", Classes._Collection, 12, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
		public static final ExecutorOperation _Collection__0_exists = new ExecutorOperation("exists", Classes._Collection, 13, org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
		public static final ExecutorOperation _Collection__1_exists = new ExecutorOperation("exists", Classes._Collection, 14, org.eclipse.ocl.examples.library.iterator.ExistsIteration.INSTANCE);
		public static final ExecutorOperation _Collection__flatten = new ExecutorOperation("flatten", Classes._Collection, 15, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Collection__0_forAll = new ExecutorOperation("forAll", Classes._Collection, 16, org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
		public static final ExecutorOperation _Collection__1_forAll = new ExecutorOperation("forAll", Classes._Collection, 17, org.eclipse.ocl.examples.library.iterator.ForAllIteration.INSTANCE);
		public static final ExecutorOperation _Collection__includes = new ExecutorOperation("includes", Classes._Collection, 18, org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation.INSTANCE);
		public static final ExecutorOperation _Collection__includesAll = new ExecutorOperation("includesAll", Classes._Collection, 19, org.eclipse.ocl.examples.library.collection.CollectionIncludesAllOperation.INSTANCE);
		public static final ExecutorOperation _Collection__including = new ExecutorOperation("including", Classes._Collection, 20, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
		public static final ExecutorOperation _Collection__isEmpty = new ExecutorOperation("isEmpty", Classes._Collection, 21, org.eclipse.ocl.examples.library.collection.CollectionIsEmptyOperation.INSTANCE);
		public static final ExecutorOperation _Collection__isUnique = new ExecutorOperation("isUnique", Classes._Collection, 22, org.eclipse.ocl.examples.library.iterator.IsUniqueIteration.INSTANCE);
		public static final ExecutorOperation _Collection__iterate = new ExecutorOperation("iterate", Classes._Collection, 23, org.eclipse.ocl.examples.library.iterator.IterateIteration.INSTANCE);
		public static final ExecutorOperation _Collection__max = new ExecutorOperation("max", Classes._Collection, 24, org.eclipse.ocl.examples.library.collection.CollectionMaxOperation.INSTANCE);
		public static final ExecutorOperation _Collection__min = new ExecutorOperation("min", Classes._Collection, 25, org.eclipse.ocl.examples.library.collection.CollectionMinOperation.INSTANCE);
		public static final ExecutorOperation _Collection__notEmpty = new ExecutorOperation("notEmpty", Classes._Collection, 26, org.eclipse.ocl.examples.library.collection.CollectionNotEmptyOperation.INSTANCE);
		public static final ExecutorOperation _Collection__one = new ExecutorOperation("one", Classes._Collection, 27, org.eclipse.ocl.examples.library.iterator.OneIteration.INSTANCE);
		public static final ExecutorOperation _Collection__product = new ExecutorOperation("product", Classes._Collection, 28, org.eclipse.ocl.examples.library.collection.CollectionProductOperation.INSTANCE);
		public static final ExecutorOperation _Collection__reject = new ExecutorOperation("reject", Classes._Collection, 29, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
		public static final ExecutorOperation _Collection__select = new ExecutorOperation("select", Classes._Collection, 30, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
		public static final ExecutorOperation _Collection__size = new ExecutorOperation("size", Classes._Collection, 31, org.eclipse.ocl.examples.library.collection.CollectionSizeOperation.INSTANCE);
		public static final ExecutorOperation _Collection__sortedBy = new ExecutorOperation("sortedBy", Classes._Collection, 32, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
		public static final ExecutorOperation _Collection__sum = new ExecutorOperation("sum", Classes._Collection, 33, org.eclipse.ocl.examples.library.collection.CollectionSumOperation.INSTANCE);
	
		public static final ExecutorOperation _Enumeration__allInstances = new ExecutorOperation("allInstances", Classes._Enumeration, 0, org.eclipse.ocl.examples.library.enumeration.EnumerationAllInstancesOperation.INSTANCE);
	
		public static final ExecutorOperation _Integer___mul_ = new ExecutorOperation("*", Classes._Integer, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
		public static final ExecutorOperation _Integer___add_ = new ExecutorOperation("+", Classes._Integer, 1, org.eclipse.ocl.examples.library.integer.IntegerPlusOperation.INSTANCE);
		public static final ExecutorOperation _Integer__0__sub_ = new ExecutorOperation("-", Classes._Integer, 2, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Integer__1__sub_ = new ExecutorOperation("-", Classes._Integer, 3, org.eclipse.ocl.examples.library.integer.IntegerMinusOperation.INSTANCE);
		public static final ExecutorOperation _Integer___div_ = new ExecutorOperation("/", Classes._Integer, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
		public static final ExecutorOperation _Integer___lt_ = new ExecutorOperation("<", Classes._Integer, 5, null);
		public static final ExecutorOperation _Integer___lt__eq_ = new ExecutorOperation("<=", Classes._Integer, 6, null);
		public static final ExecutorOperation _Integer___gt_ = new ExecutorOperation(">", Classes._Integer, 7, null);
		public static final ExecutorOperation _Integer___gt__eq_ = new ExecutorOperation(">=", Classes._Integer, 8, null);
		public static final ExecutorOperation _Integer__abs = new ExecutorOperation("abs", Classes._Integer, 9, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Integer__div = new ExecutorOperation("div", Classes._Integer, 10, org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
		public static final ExecutorOperation _Integer__max = new ExecutorOperation("max", Classes._Integer, 11, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
		public static final ExecutorOperation _Integer__min = new ExecutorOperation("min", Classes._Integer, 12, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
		public static final ExecutorOperation _Integer__mod = new ExecutorOperation("mod", Classes._Integer, 13, org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
		public static final ExecutorOperation _Integer__toString = new ExecutorOperation("toString", Classes._Integer, 14, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _MonikeredElement__hasMoniker = new ExecutorOperation("hasMoniker", Classes._MonikeredElement, 0, null);
	
		public static final ExecutorOperation _MultiplicityElement__includesCardinality = new ExecutorOperation("includesCardinality", Classes._MultiplicityElement, 0, null);
		public static final ExecutorOperation _MultiplicityElement__includesMultiplicity = new ExecutorOperation("includesMultiplicity", Classes._MultiplicityElement, 1, null);
		public static final ExecutorOperation _MultiplicityElement__isMultivalued = new ExecutorOperation("isMultivalued", Classes._MultiplicityElement, 2, null);
		public static final ExecutorOperation _MultiplicityElement__lowerBound = new ExecutorOperation("lowerBound", Classes._MultiplicityElement, 3, null);
		public static final ExecutorOperation _MultiplicityElement__upperBound = new ExecutorOperation("upperBound", Classes._MultiplicityElement, 4, null);
	
		public static final ExecutorOperation _NonOrderedCollection__closure = new ExecutorOperation("closure", Classes._NonOrderedCollection, 0, org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
		public static final ExecutorOperation _NonOrderedCollection__collect = new ExecutorOperation("collect", Classes._NonOrderedCollection, 1, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
		public static final ExecutorOperation _NonOrderedCollection__collectNested = new ExecutorOperation("collectNested", Classes._NonOrderedCollection, 2, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
		public static final ExecutorOperation _NonOrderedCollection__0_intersection = new ExecutorOperation("intersection", Classes._NonOrderedCollection, 3, org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
		public static final ExecutorOperation _NonOrderedCollection__1_intersection = new ExecutorOperation("intersection", Classes._NonOrderedCollection, 4, org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
		public static final ExecutorOperation _NonOrderedCollection__0_union = new ExecutorOperation("union", Classes._NonOrderedCollection, 5, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
		public static final ExecutorOperation _NonOrderedCollection__1_union = new ExecutorOperation("union", Classes._NonOrderedCollection, 6, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
	
		public static final ExecutorOperation _NonUniqueCollection__sortedBy = new ExecutorOperation("sortedBy", Classes._NonUniqueCollection, 0, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
	
		public static final ExecutorOperation _OclAny___lt__gt_ = new ExecutorOperation("<>", Classes._OclAny, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _OclAny___eq_ = new ExecutorOperation("=", Classes._OclAny, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclAsSet = new ExecutorOperation("oclAsSet", Classes._OclAny, 2, org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclAsType = new ExecutorOperation("oclAsType", Classes._OclAny, 3, org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclIsInState = new ExecutorOperation("oclIsInState", Classes._OclAny, 4, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInStateOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclIsInvalid = new ExecutorOperation("oclIsInvalid", Classes._OclAny, 5, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsInvalidOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclIsKindOf = new ExecutorOperation("oclIsKindOf", Classes._OclAny, 6, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsKindOfOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclIsNew = new ExecutorOperation("oclIsNew", Classes._OclAny, 7, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclIsTypeOf = new ExecutorOperation("oclIsTypeOf", Classes._OclAny, 8, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsTypeOfOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclIsUndefined = new ExecutorOperation("oclIsUndefined", Classes._OclAny, 9, org.eclipse.ocl.examples.library.oclany.OclAnyOclIsUndefinedOperation.INSTANCE);
		public static final ExecutorOperation _OclAny__oclType = new ExecutorOperation("oclType", Classes._OclAny, 10, org.eclipse.ocl.examples.library.oclany.OclAnyOclTypeOperation.INSTANCE);
	
		public static final ExecutorOperation _OclInvalid___lt__gt_ = new ExecutorOperation("<>", Classes._OclInvalid, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _OclInvalid___eq_ = new ExecutorOperation("=", Classes._OclInvalid, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _OclInvalid__allInstances = new ExecutorOperation("allInstances", Classes._OclInvalid, 2, org.eclipse.ocl.examples.library.oclinvalid.OclInvalidAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _OclInvalid__oclBadOperation = new ExecutorOperation("oclBadOperation", Classes._OclInvalid, 3, null);
		public static final ExecutorOperation _OclInvalid__toString = new ExecutorOperation("toString", Classes._OclInvalid, 4, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _OclMessage__hasReturned = new ExecutorOperation("hasReturned", Classes._OclMessage, 0, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorOperation _OclMessage__isOperationCall = new ExecutorOperation("isOperationCall", Classes._OclMessage, 1, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorOperation _OclMessage__isSignalSent = new ExecutorOperation("isSignalSent", Classes._OclMessage, 2, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
		public static final ExecutorOperation _OclMessage__result = new ExecutorOperation("result", Classes._OclMessage, 3, org.eclipse.ocl.examples.library.oclany.OclAnyUnsupportedOperation.INSTANCE);
	
		public static final ExecutorOperation _OclTuple___lt__gt_ = new ExecutorOperation("<>", Classes._OclTuple, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _OclTuple___eq_ = new ExecutorOperation("=", Classes._OclTuple, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
	
		public static final ExecutorOperation _OclVoid___lt__gt_ = new ExecutorOperation("<>", Classes._OclVoid, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _OclVoid___eq_ = new ExecutorOperation("=", Classes._OclVoid, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _OclVoid__allInstances = new ExecutorOperation("allInstances", Classes._OclVoid, 2, org.eclipse.ocl.examples.library.oclvoid.OclVoidAllInstancesOperation.INSTANCE);
		public static final ExecutorOperation _OclVoid__and = new ExecutorOperation("and", Classes._OclVoid, 3, org.eclipse.ocl.examples.library.oclvoid.OclVoidAndOperation.INSTANCE);
		public static final ExecutorOperation _OclVoid__implies = new ExecutorOperation("implies", Classes._OclVoid, 4, org.eclipse.ocl.examples.library.oclvoid.OclVoidImpliesOperation.INSTANCE);
		public static final ExecutorOperation _OclVoid__or = new ExecutorOperation("or", Classes._OclVoid, 5, org.eclipse.ocl.examples.library.oclvoid.OclVoidOrOperation.INSTANCE);
		public static final ExecutorOperation _OclVoid__toString = new ExecutorOperation("toString", Classes._OclVoid, 6, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _OrderedCollection__at = new ExecutorOperation("at", Classes._OrderedCollection, 0, org.eclipse.ocl.examples.library.collection.OrderedCollectionAtOperation.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__closure = new ExecutorOperation("closure", Classes._OrderedCollection, 1, org.eclipse.ocl.examples.library.iterator.ClosureIteration.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__collect = new ExecutorOperation("collect", Classes._OrderedCollection, 2, org.eclipse.ocl.examples.library.iterator.CollectIteration.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__collectNested = new ExecutorOperation("collectNested", Classes._OrderedCollection, 3, org.eclipse.ocl.examples.library.iterator.CollectNestedIteration.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__first = new ExecutorOperation("first", Classes._OrderedCollection, 4, org.eclipse.ocl.examples.library.collection.OrderedCollectionFirstOperation.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__indexOf = new ExecutorOperation("indexOf", Classes._OrderedCollection, 5, org.eclipse.ocl.examples.library.collection.OrderedCollectionIndexOfOperation.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__last = new ExecutorOperation("last", Classes._OrderedCollection, 6, org.eclipse.ocl.examples.library.collection.OrderedCollectionLastOperation.INSTANCE);
		public static final ExecutorOperation _OrderedCollection__reverse = new ExecutorOperation("reverse", Classes._OrderedCollection, 7, org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
	
		public static final ExecutorOperation _OrderedSet___sub_ = new ExecutorOperation("-", Classes._OrderedSet, 0, org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet___lt__gt_ = new ExecutorOperation("<>", Classes._OrderedSet, 1, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet___eq_ = new ExecutorOperation("=", Classes._OrderedSet, 2, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__append = new ExecutorOperation("append", Classes._OrderedSet, 3, org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__excluding = new ExecutorOperation("excluding", Classes._OrderedSet, 4, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__flatten = new ExecutorOperation("flatten", Classes._OrderedSet, 5, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__including = new ExecutorOperation("including", Classes._OrderedSet, 6, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__insertAt = new ExecutorOperation("insertAt", Classes._OrderedSet, 7, org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__intersection = new ExecutorOperation("intersection", Classes._OrderedSet, 8, org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__prepend = new ExecutorOperation("prepend", Classes._OrderedSet, 9, org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__reject = new ExecutorOperation("reject", Classes._OrderedSet, 10, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
		public static final ExecutorOperation _OrderedSet__reverse = new ExecutorOperation("reverse", Classes._OrderedSet, 11, org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__select = new ExecutorOperation("select", Classes._OrderedSet, 12, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
		public static final ExecutorOperation _OrderedSet__subOrderedSet = new ExecutorOperation("subOrderedSet", Classes._OrderedSet, 13, org.eclipse.ocl.examples.library.collection.OrderedSetSubOrderedSetOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__symmetricDifference = new ExecutorOperation("symmetricDifference", Classes._OrderedSet, 14, org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__0_union = new ExecutorOperation("union", Classes._OrderedSet, 15, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
		public static final ExecutorOperation _OrderedSet__1_union = new ExecutorOperation("union", Classes._OrderedSet, 16, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
	
		public static final ExecutorOperation _ParameterableElement__isTemplateParameter = new ExecutorOperation("isTemplateParameter", Classes._ParameterableElement, 0, null);
	
		public static final ExecutorOperation _Real___mul_ = new ExecutorOperation("*", Classes._Real, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
		public static final ExecutorOperation _Real___add_ = new ExecutorOperation("+", Classes._Real, 1, org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__sub_ = new ExecutorOperation("-", Classes._Real, 2, org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE);
		public static final ExecutorOperation _Real__1__sub_ = new ExecutorOperation("-", Classes._Real, 3, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Real___div_ = new ExecutorOperation("/", Classes._Real, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__lt_ = new ExecutorOperation("<", Classes._Real, 5, null);
		public static final ExecutorOperation _Real__1__lt_ = new ExecutorOperation("<", Classes._Real, 6, org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__lt__eq_ = new ExecutorOperation("<=", Classes._Real, 7, null);
		public static final ExecutorOperation _Real__1__lt__eq_ = new ExecutorOperation("<=", Classes._Real, 8, org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
		public static final ExecutorOperation _Real___lt__gt_ = new ExecutorOperation("<>", Classes._Real, 9, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _Real___eq_ = new ExecutorOperation("=", Classes._Real, 10, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__gt_ = new ExecutorOperation(">", Classes._Real, 11, null);
		public static final ExecutorOperation _Real__1__gt_ = new ExecutorOperation(">", Classes._Real, 12, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__gt__eq_ = new ExecutorOperation(">=", Classes._Real, 13, null);
		public static final ExecutorOperation _Real__1__gt__eq_ = new ExecutorOperation(">=", Classes._Real, 14, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
		public static final ExecutorOperation _Real__abs = new ExecutorOperation("abs", Classes._Real, 15, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Real__floor = new ExecutorOperation("floor", Classes._Real, 16, org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
		public static final ExecutorOperation _Real__max = new ExecutorOperation("max", Classes._Real, 17, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
		public static final ExecutorOperation _Real__min = new ExecutorOperation("min", Classes._Real, 18, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
		public static final ExecutorOperation _Real__oclAsType = new ExecutorOperation("oclAsType", Classes._Real, 19, org.eclipse.ocl.examples.library.numeric.NumericOclAsTypeOperation.INSTANCE);
		public static final ExecutorOperation _Real__round = new ExecutorOperation("round", Classes._Real, 20, org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
		public static final ExecutorOperation _Real__toString = new ExecutorOperation("toString", Classes._Real, 21, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
		public static final ExecutorOperation _Sequence___lt__gt_ = new ExecutorOperation("<>", Classes._Sequence, 0, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _Sequence___eq_ = new ExecutorOperation("=", Classes._Sequence, 1, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__append = new ExecutorOperation("append", Classes._Sequence, 2, org.eclipse.ocl.examples.library.collection.OrderedCollectionAppendOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__excluding = new ExecutorOperation("excluding", Classes._Sequence, 3, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__flatten = new ExecutorOperation("flatten", Classes._Sequence, 4, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__including = new ExecutorOperation("including", Classes._Sequence, 5, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__insertAt = new ExecutorOperation("insertAt", Classes._Sequence, 6, org.eclipse.ocl.examples.library.collection.OrderedCollectionInsertAtOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__prepend = new ExecutorOperation("prepend", Classes._Sequence, 7, org.eclipse.ocl.examples.library.collection.OrderedCollectionPrependOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__reject = new ExecutorOperation("reject", Classes._Sequence, 8, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
		public static final ExecutorOperation _Sequence__reverse = new ExecutorOperation("reverse", Classes._Sequence, 9, org.eclipse.ocl.examples.library.collection.OrderedCollectionReverseOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__select = new ExecutorOperation("select", Classes._Sequence, 10, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
		public static final ExecutorOperation _Sequence__subSequence = new ExecutorOperation("subSequence", Classes._Sequence, 11, org.eclipse.ocl.examples.library.collection.SequenceSubSequenceOperation.INSTANCE);
		public static final ExecutorOperation _Sequence__union = new ExecutorOperation("union", Classes._Sequence, 12, org.eclipse.ocl.examples.library.collection.CollectionUnionOperation.INSTANCE);
	
		public static final ExecutorOperation _Set___sub_ = new ExecutorOperation("-", Classes._Set, 0, org.eclipse.ocl.examples.library.collection.SetMinusOperation.INSTANCE);
		public static final ExecutorOperation _Set___lt__gt_ = new ExecutorOperation("<>", Classes._Set, 1, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _Set___eq_ = new ExecutorOperation("=", Classes._Set, 2, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _Set__excluding = new ExecutorOperation("excluding", Classes._Set, 3, org.eclipse.ocl.examples.library.collection.CollectionExcludingOperation.INSTANCE);
		public static final ExecutorOperation _Set__flatten = new ExecutorOperation("flatten", Classes._Set, 4, org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation.INSTANCE);
		public static final ExecutorOperation _Set__including = new ExecutorOperation("including", Classes._Set, 5, org.eclipse.ocl.examples.library.collection.CollectionIncludingOperation.INSTANCE);
		public static final ExecutorOperation _Set__intersection = new ExecutorOperation("intersection", Classes._Set, 6, org.eclipse.ocl.examples.library.collection.UniqueCollectionIntersectionOperation.INSTANCE);
		public static final ExecutorOperation _Set__reject = new ExecutorOperation("reject", Classes._Set, 7, org.eclipse.ocl.examples.library.iterator.RejectIteration.INSTANCE);
		public static final ExecutorOperation _Set__select = new ExecutorOperation("select", Classes._Set, 8, org.eclipse.ocl.examples.library.iterator.SelectIteration.INSTANCE);
		public static final ExecutorOperation _Set__symmetricDifference = new ExecutorOperation("symmetricDifference", Classes._Set, 9, org.eclipse.ocl.examples.library.collection.SetSymmetricDifferenceOperation.INSTANCE);
	
		public static final ExecutorOperation _String___add_ = new ExecutorOperation("+", Classes._String, 0, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
		public static final ExecutorOperation _String__0__lt_ = new ExecutorOperation("<", Classes._String, 1, null);
		public static final ExecutorOperation _String__1__lt_ = new ExecutorOperation("<", Classes._String, 2, org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
		public static final ExecutorOperation _String__0__lt__eq_ = new ExecutorOperation("<=", Classes._String, 3, null);
		public static final ExecutorOperation _String__1__lt__eq_ = new ExecutorOperation("<=", Classes._String, 4, org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
		public static final ExecutorOperation _String___lt__gt_ = new ExecutorOperation("<>", Classes._String, 5, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _String___eq_ = new ExecutorOperation("=", Classes._String, 6, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _String__0__gt_ = new ExecutorOperation(">", Classes._String, 7, null);
		public static final ExecutorOperation _String__1__gt_ = new ExecutorOperation(">", Classes._String, 8, org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
		public static final ExecutorOperation _String__0__gt__eq_ = new ExecutorOperation(">=", Classes._String, 9, null);
		public static final ExecutorOperation _String__1__gt__eq_ = new ExecutorOperation(">=", Classes._String, 10, org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
		public static final ExecutorOperation _String__at = new ExecutorOperation("at", Classes._String, 11, org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
		public static final ExecutorOperation _String__characters = new ExecutorOperation("characters", Classes._String, 12, org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
		public static final ExecutorOperation _String__concat = new ExecutorOperation("concat", Classes._String, 13, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
		public static final ExecutorOperation _String__equalsIgnoreCase = new ExecutorOperation("equalsIgnoreCase", Classes._String, 14, org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__indexOf = new ExecutorOperation("indexOf", Classes._String, 15, org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
		public static final ExecutorOperation _String__size = new ExecutorOperation("size", Classes._String, 16, org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
		public static final ExecutorOperation _String__substring = new ExecutorOperation("substring", Classes._String, 17, org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
		public static final ExecutorOperation _String__toBoolean = new ExecutorOperation("toBoolean", Classes._String, 18, org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
		public static final ExecutorOperation _String__toInteger = new ExecutorOperation("toInteger", Classes._String, 19, org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
		public static final ExecutorOperation _String__toLower = new ExecutorOperation("toLower", Classes._String, 20, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toLowerCase = new ExecutorOperation("toLowerCase", Classes._String, 21, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toReal = new ExecutorOperation("toReal", Classes._String, 22, org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
		public static final ExecutorOperation _String__toString = new ExecutorOperation("toString", Classes._String, 23, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpper = new ExecutorOperation("toUpper", Classes._String, 24, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpperCase = new ExecutorOperation("toUpperCase", Classes._String, 25, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
	
		public static final ExecutorOperation _TemplateableElement__isTemplate = new ExecutorOperation("isTemplate", Classes._TemplateableElement, 0, null);
		public static final ExecutorOperation _TemplateableElement__parameterableElements = new ExecutorOperation("parameterableElements", Classes._TemplateableElement, 1, null);
	
		public static final ExecutorOperation _UniqueCollection__sortedBy = new ExecutorOperation("sortedBy", Classes._UniqueCollection, 0, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
	
		public static final ExecutorOperation _UnlimitedNatural___lt_ = new ExecutorOperation("<", Classes._UnlimitedNatural, 0, null);
		public static final ExecutorOperation _UnlimitedNatural___lt__eq_ = new ExecutorOperation("<=", Classes._UnlimitedNatural, 1, null);
		public static final ExecutorOperation _UnlimitedNatural___gt_ = new ExecutorOperation(">", Classes._UnlimitedNatural, 2, null);
		public static final ExecutorOperation _UnlimitedNatural___gt__eq_ = new ExecutorOperation(">=", Classes._UnlimitedNatural, 3, null);
	
		public static final ExecutorOperation _ValueSpecification__booleanValue = new ExecutorOperation("booleanValue", Classes._ValueSpecification, 0, null);
		public static final ExecutorOperation _ValueSpecification__integerValue = new ExecutorOperation("integerValue", Classes._ValueSpecification, 1, null);
		public static final ExecutorOperation _ValueSpecification__isComputable = new ExecutorOperation("isComputable", Classes._ValueSpecification, 2, null);
		public static final ExecutorOperation _ValueSpecification__isNull = new ExecutorOperation("isNull", Classes._ValueSpecification, 3, null);
		public static final ExecutorOperation _ValueSpecification__stringValue = new ExecutorOperation("stringValue", Classes._ValueSpecification, 4, null);
		public static final ExecutorOperation _ValueSpecification__unlimitedValue = new ExecutorOperation("unlimitedValue", Classes._ValueSpecification, 5, null);
	}

	/**
	 *	The property descriptors for each property of each class.
	 */
	public static class Properties {
		public static final ExecutorProperty _Annotation__NamedElement = new ExecutorProperty("NamedElement", Classes._Annotation, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAMED_ELEMENT__OWNED_ANNOTATION));
		public static final ExecutorProperty _Annotation__ownedContent = new ExecutorProperty("ownedContent", Classes._Annotation, 1, new EcoreLibraryProperty(PivotPackage.Literals.ANNOTATION__OWNED_CONTENT));
		public static final ExecutorProperty _Annotation__ownedDetail = new ExecutorProperty("ownedDetail", Classes._Annotation, 2, new EcoreLibraryProperty(PivotPackage.Literals.ANNOTATION__OWNED_DETAIL));
		public static final ExecutorProperty _Annotation__reference = new ExecutorProperty("reference", Classes._Annotation, 3, new EcoreLibraryProperty(PivotPackage.Literals.ANNOTATION__REFERENCE));
	
		public static final ExecutorProperty _AssociationClass__AssociationClassCallExp = new ExecutorProperty("AssociationClassCallExp", Classes._AssociationClass, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS));
		public static final ExecutorProperty _AssociationClass__unownedAttribute = new ExecutorProperty("unownedAttribute", Classes._AssociationClass, 1, new EcoreLibraryProperty(PivotPackage.Literals.ASSOCIATION_CLASS__UNOWNED_ATTRIBUTE));
	
		public static final ExecutorProperty _AssociationClassCallExp__referredAssociationClass = new ExecutorProperty("referredAssociationClass", Classes._AssociationClassCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS));
	
		public static final ExecutorProperty _BooleanLiteralExp__booleanSymbol = new ExecutorProperty("booleanSymbol", Classes._BooleanLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL));
	
		public static final ExecutorProperty _CallExp__implicit = new ExecutorProperty("implicit", Classes._CallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.CALL_EXP__IMPLICIT));
		public static final ExecutorProperty _CallExp__source = new ExecutorProperty("source", Classes._CallExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.CALL_EXP__SOURCE));
	
		public static final ExecutorProperty _CallOperationAction__MessageExp = new ExecutorProperty("MessageExp", Classes._CallOperationAction, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_EXP__CALLED_OPERATION));
		public static final ExecutorProperty _CallOperationAction__operation = new ExecutorProperty("operation", Classes._CallOperationAction, 1, new EcoreLibraryProperty(PivotPackage.Literals.CALL_OPERATION_ACTION__OPERATION));
	
		public static final ExecutorProperty _Class__Class = new ExecutorProperty("Class", Classes._Class, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CLASS__SUPER_CLASS));
		public static final ExecutorProperty _Class__isAbstract = new ExecutorProperty("isAbstract", Classes._Class, 1, new EcoreLibraryProperty(PivotPackage.Literals.CLASS__IS_ABSTRACT));
		public static final ExecutorProperty _Class__isInterface = new ExecutorProperty("isInterface", Classes._Class, 2, new EcoreLibraryProperty(PivotPackage.Literals.CLASS__IS_INTERFACE));
		public static final ExecutorProperty _Class__ownedAttribute = new ExecutorProperty("ownedAttribute", Classes._Class, 3, new EcoreLibraryProperty(PivotPackage.Literals.CLASS__OWNED_ATTRIBUTE));
		public static final ExecutorProperty _Class__ownedOperation = new ExecutorProperty("ownedOperation", Classes._Class, 4, new EcoreLibraryProperty(PivotPackage.Literals.CLASS__OWNED_OPERATION));
		public static final ExecutorProperty _Class__subClass = new ExecutorProperty("subClass", Classes._Class, 5, new EcoreLibraryProperty(PivotPackage.Literals.CLASS__SUB_CLASS));
		public static final ExecutorProperty _Class__superClass = new ExecutorProperty("superClass", Classes._Class, 6, new EcoreLibraryProperty(PivotPackage.Literals.CLASS__SUPER_CLASS));
	
		public static final ExecutorProperty _ClassifierType__instanceType = new ExecutorProperty("instanceType", Classes._ClassifierType, 0, new EcoreLibraryProperty(PivotPackage.Literals.CLASSIFIER_TYPE__INSTANCE_TYPE));
	
		public static final ExecutorProperty _CollectionItem__item = new ExecutorProperty("item", Classes._CollectionItem, 0, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_ITEM__ITEM));
	
		public static final ExecutorProperty _CollectionLiteralExp__kind = new ExecutorProperty("kind", Classes._CollectionLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__KIND));
		public static final ExecutorProperty _CollectionLiteralExp__part = new ExecutorProperty("part", Classes._CollectionLiteralExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__PART));
	
		public static final ExecutorProperty _CollectionLiteralPart__CollectionLiteralExp = new ExecutorProperty("CollectionLiteralExp", Classes._CollectionLiteralPart, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__PART));
	
		public static final ExecutorProperty _CollectionRange__first = new ExecutorProperty("first", Classes._CollectionRange, 0, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_RANGE__FIRST));
		public static final ExecutorProperty _CollectionRange__last = new ExecutorProperty("last", Classes._CollectionRange, 1, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_RANGE__LAST));
	
		public static final ExecutorProperty _CollectionType__elementType = new ExecutorProperty("elementType", Classes._CollectionType, 0, new EcoreLibraryProperty(PivotPackage.Literals.COLLECTION_TYPE__ELEMENT_TYPE));
	
		public static final ExecutorProperty _Comment__Element = new ExecutorProperty("Element", Classes._Comment, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ELEMENT__OWNED_COMMENT));
		public static final ExecutorProperty _Comment__annotatedElement = new ExecutorProperty("annotatedElement", Classes._Comment, 1, new EcoreLibraryProperty(PivotPackage.Literals.COMMENT__ANNOTATED_ELEMENT));
		public static final ExecutorProperty _Comment__body = new ExecutorProperty("body", Classes._Comment, 2, new EcoreLibraryProperty(PivotPackage.Literals.COMMENT__BODY));
	
		public static final ExecutorProperty _Constraint__NamedElement = new ExecutorProperty("NamedElement", Classes._Constraint, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAMED_ELEMENT__OWNED_RULE));
		public static final ExecutorProperty _Constraint__constrainedElement = new ExecutorProperty("constrainedElement", Classes._Constraint, 1, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__CONSTRAINED_ELEMENT));
		public static final ExecutorProperty _Constraint__context = new ExecutorProperty("context", Classes._Constraint, 2, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__CONTEXT));
		public static final ExecutorProperty _Constraint__isCallable = new ExecutorProperty("isCallable", Classes._Constraint, 3, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__IS_CALLABLE));
		public static final ExecutorProperty _Constraint__specification = new ExecutorProperty("specification", Classes._Constraint, 4, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__SPECIFICATION));
		public static final ExecutorProperty _Constraint__stereotype = new ExecutorProperty("stereotype", Classes._Constraint, 5, new EcoreLibraryProperty(PivotPackage.Literals.CONSTRAINT__STEREOTYPE));
	
		public static final ExecutorProperty _DataType__behavioralType = new ExecutorProperty("behavioralType", Classes._DataType, 0, new EcoreLibraryProperty(PivotPackage.Literals.DATA_TYPE__BEHAVIORAL_TYPE));
		public static final ExecutorProperty _DataType__isSerializable = new ExecutorProperty("isSerializable", Classes._DataType, 1, new EcoreLibraryProperty(PivotPackage.Literals.DATA_TYPE__IS_SERIALIZABLE));
	
		public static final ExecutorProperty _Detail__Annotation = new ExecutorProperty("Annotation", Classes._Detail, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ANNOTATION__OWNED_DETAIL));
		public static final ExecutorProperty _Detail__value = new ExecutorProperty("value", Classes._Detail, 1, new EcoreLibraryProperty(PivotPackage.Literals.DETAIL__VALUE));
	
		public static final ExecutorProperty _Element__Comment = new ExecutorProperty("Comment", Classes._Element, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COMMENT__ANNOTATED_ELEMENT));
		public static final ExecutorProperty _Element__Constraint = new ExecutorProperty("Constraint", Classes._Element, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRAINT__CONSTRAINED_ELEMENT));
		public static final ExecutorProperty _Element__ownedComment = new ExecutorProperty("ownedComment", Classes._Element, 2, new EcoreLibraryProperty(PivotPackage.Literals.ELEMENT__OWNED_COMMENT));
	
		public static final ExecutorProperty _EnumLiteralExp__referredEnumLiteral = new ExecutorProperty("referredEnumLiteral", Classes._EnumLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL));
	
		public static final ExecutorProperty _Enumeration__ownedLiteral = new ExecutorProperty("ownedLiteral", Classes._Enumeration, 0, new EcoreLibraryProperty(PivotPackage.Literals.ENUMERATION__OWNED_LITERAL));
	
		public static final ExecutorProperty _EnumerationLiteral__EnumLiteralExp = new ExecutorProperty("EnumLiteralExp", Classes._EnumerationLiteral, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL));
		public static final ExecutorProperty _EnumerationLiteral__enumeration = new ExecutorProperty("enumeration", Classes._EnumerationLiteral, 1, new EcoreLibraryProperty(PivotPackage.Literals.ENUMERATION_LITERAL__ENUMERATION));
		public static final ExecutorProperty _EnumerationLiteral__value = new ExecutorProperty("value", Classes._EnumerationLiteral, 2, new EcoreLibraryProperty(PivotPackage.Literals.ENUMERATION_LITERAL__VALUE));
	
		public static final ExecutorProperty _ExpressionInOcl__bodyExpression = new ExecutorProperty("bodyExpression", Classes._ExpressionInOcl, 0, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION));
		public static final ExecutorProperty _ExpressionInOcl__contextVariable = new ExecutorProperty("contextVariable", Classes._ExpressionInOcl, 1, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE));
		public static final ExecutorProperty _ExpressionInOcl__messageExpression = new ExecutorProperty("messageExpression", Classes._ExpressionInOcl, 2, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__MESSAGE_EXPRESSION));
		public static final ExecutorProperty _ExpressionInOcl__parameterVariable = new ExecutorProperty("parameterVariable", Classes._ExpressionInOcl, 3, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE));
		public static final ExecutorProperty _ExpressionInOcl__resultVariable = new ExecutorProperty("resultVariable", Classes._ExpressionInOcl, 4, new EcoreLibraryProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE));
	
		public static final ExecutorProperty _Feature__implementation = new ExecutorProperty("implementation", Classes._Feature, 0, new EcoreLibraryProperty(PivotPackage.Literals.FEATURE__IMPLEMENTATION));
		public static final ExecutorProperty _Feature__implementationClass = new ExecutorProperty("implementationClass", Classes._Feature, 1, new EcoreLibraryProperty(PivotPackage.Literals.FEATURE__IMPLEMENTATION_CLASS));
	
		public static final ExecutorProperty _FeatureCallExp__isPre = new ExecutorProperty("isPre", Classes._FeatureCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.FEATURE_CALL_EXP__IS_PRE));
	
		public static final ExecutorProperty _IfExp__condition = new ExecutorProperty("condition", Classes._IfExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.IF_EXP__CONDITION));
		public static final ExecutorProperty _IfExp__elseExpression = new ExecutorProperty("elseExpression", Classes._IfExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.IF_EXP__ELSE_EXPRESSION));
		public static final ExecutorProperty _IfExp__thenExpression = new ExecutorProperty("thenExpression", Classes._IfExp, 2, new EcoreLibraryProperty(PivotPackage.Literals.IF_EXP__THEN_EXPRESSION));
	
		public static final ExecutorProperty _IntegerLiteralExp__integerSymbol = new ExecutorProperty("integerSymbol", Classes._IntegerLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.INTEGER_LITERAL_EXP__INTEGER_SYMBOL));
	
		public static final ExecutorProperty _IterateExp__result = new ExecutorProperty("result", Classes._IterateExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.ITERATE_EXP__RESULT));
	
		public static final ExecutorProperty _Iteration__LoopExp = new ExecutorProperty("LoopExp", Classes._Iteration, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__REFERRED_ITERATION));
		public static final ExecutorProperty _Iteration__ownedAccumulator = new ExecutorProperty("ownedAccumulator", Classes._Iteration, 1, new EcoreLibraryProperty(PivotPackage.Literals.ITERATION__OWNED_ACCUMULATOR));
		public static final ExecutorProperty _Iteration__ownedIterator = new ExecutorProperty("ownedIterator", Classes._Iteration, 2, new EcoreLibraryProperty(PivotPackage.Literals.ITERATION__OWNED_ITERATOR));
	
		public static final ExecutorProperty _LambdaType__contextType = new ExecutorProperty("contextType", Classes._LambdaType, 0, new EcoreLibraryProperty(PivotPackage.Literals.LAMBDA_TYPE__CONTEXT_TYPE));
		public static final ExecutorProperty _LambdaType__parameterType = new ExecutorProperty("parameterType", Classes._LambdaType, 1, new EcoreLibraryProperty(PivotPackage.Literals.LAMBDA_TYPE__PARAMETER_TYPE));
		public static final ExecutorProperty _LambdaType__resultType = new ExecutorProperty("resultType", Classes._LambdaType, 2, new EcoreLibraryProperty(PivotPackage.Literals.LAMBDA_TYPE__RESULT_TYPE));
	
		public static final ExecutorProperty _LetExp__in = new ExecutorProperty("in", Classes._LetExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.LET_EXP__IN));
		public static final ExecutorProperty _LetExp__variable = new ExecutorProperty("variable", Classes._LetExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.LET_EXP__VARIABLE));
	
		public static final ExecutorProperty _LoopExp__body = new ExecutorProperty("body", Classes._LoopExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.LOOP_EXP__BODY));
		public static final ExecutorProperty _LoopExp__iterator = new ExecutorProperty("iterator", Classes._LoopExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.LOOP_EXP__ITERATOR));
		public static final ExecutorProperty _LoopExp__referredIteration = new ExecutorProperty("referredIteration", Classes._LoopExp, 2, new EcoreLibraryProperty(PivotPackage.Literals.LOOP_EXP__REFERRED_ITERATION));
	
		public static final ExecutorProperty _MessageExp__argument = new ExecutorProperty("argument", Classes._MessageExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_EXP__ARGUMENT));
		public static final ExecutorProperty _MessageExp__calledOperation = new ExecutorProperty("calledOperation", Classes._MessageExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_EXP__CALLED_OPERATION));
		public static final ExecutorProperty _MessageExp__sentSignal = new ExecutorProperty("sentSignal", Classes._MessageExp, 2, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_EXP__SENT_SIGNAL));
		public static final ExecutorProperty _MessageExp__target = new ExecutorProperty("target", Classes._MessageExp, 3, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_EXP__TARGET));
	
		public static final ExecutorProperty _MessageType__referredOperation = new ExecutorProperty("referredOperation", Classes._MessageType, 0, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_OPERATION));
		public static final ExecutorProperty _MessageType__referredSignal = new ExecutorProperty("referredSignal", Classes._MessageType, 1, new EcoreLibraryProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_SIGNAL));
	
		public static final ExecutorProperty _MonikeredElement__moniker = new ExecutorProperty("moniker", Classes._MonikeredElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.MONIKERED_ELEMENT__MONIKER));
	
		public static final ExecutorProperty _MultiplicityElement__isOrdered = new ExecutorProperty("isOrdered", Classes._MultiplicityElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED));
		public static final ExecutorProperty _MultiplicityElement__isUnique = new ExecutorProperty("isUnique", Classes._MultiplicityElement, 1, new EcoreLibraryProperty(PivotPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE));
		public static final ExecutorProperty _MultiplicityElement__lower = new ExecutorProperty("lower", Classes._MultiplicityElement, 2, new EcoreLibraryProperty(PivotPackage.Literals.MULTIPLICITY_ELEMENT__LOWER));
		public static final ExecutorProperty _MultiplicityElement__upper = new ExecutorProperty("upper", Classes._MultiplicityElement, 3, new EcoreLibraryProperty(PivotPackage.Literals.MULTIPLICITY_ELEMENT__UPPER));
	
		public static final ExecutorProperty _NamedElement__Constraint = new ExecutorProperty("Constraint", Classes._NamedElement, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRAINT__CONTEXT));
		public static final ExecutorProperty _NamedElement__isStatic = new ExecutorProperty("isStatic", Classes._NamedElement, 1, new EcoreLibraryProperty(PivotPackage.Literals.NAMED_ELEMENT__IS_STATIC));
		public static final ExecutorProperty _NamedElement__name = new ExecutorProperty("name", Classes._NamedElement, 2, new EcoreLibraryProperty(PivotPackage.Literals.NAMED_ELEMENT__NAME));
		public static final ExecutorProperty _NamedElement__ownedAnnotation = new ExecutorProperty("ownedAnnotation", Classes._NamedElement, 3, new EcoreLibraryProperty(PivotPackage.Literals.NAMED_ELEMENT__OWNED_ANNOTATION));
		public static final ExecutorProperty _NamedElement__ownedRule = new ExecutorProperty("ownedRule", Classes._NamedElement, 4, new EcoreLibraryProperty(PivotPackage.Literals.NAMED_ELEMENT__OWNED_RULE));
	
		public static final ExecutorProperty _NavigationCallExp__navigationSource = new ExecutorProperty("navigationSource", Classes._NavigationCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__NAVIGATION_SOURCE));
		public static final ExecutorProperty _NavigationCallExp__qualifier = new ExecutorProperty("qualifier", Classes._NavigationCallExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__QUALIFIER));
	
		public static final ExecutorProperty _OclExpression__CallExp = new ExecutorProperty("CallExp", Classes._OclExpression, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CALL_EXP__SOURCE));
		public static final ExecutorProperty _OclExpression__CollectionItem = new ExecutorProperty("CollectionItem", Classes._OclExpression, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_ITEM__ITEM));
		public static final ExecutorProperty _OclExpression__LetExp = new ExecutorProperty("LetExp", Classes._OclExpression, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LET_EXP__IN));
		public static final ExecutorProperty _OclExpression__LoopExp = new ExecutorProperty("LoopExp", Classes._OclExpression, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__BODY));
		public static final ExecutorProperty _OclExpression__NavigationCallExp = new ExecutorProperty("NavigationCallExp", Classes._OclExpression, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__QUALIFIER));
		public static final ExecutorProperty _OclExpression__OperationCallExp = new ExecutorProperty("OperationCallExp", Classes._OclExpression, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT));
		public static final ExecutorProperty _OclExpression__TupleLiteralPart = new ExecutorProperty("TupleLiteralPart", Classes._OclExpression, 6, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TUPLE_LITERAL_PART__INIT_EXPRESSION));
		public static final ExecutorProperty _OclExpression__Variable = new ExecutorProperty("Variable", Classes._OclExpression, 7, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE__INIT_EXPRESSION));
	
		
	
		public static final ExecutorProperty _OpaqueExpression__body = new ExecutorProperty("body", Classes._OpaqueExpression, 0, new EcoreLibraryProperty(PivotPackage.Literals.OPAQUE_EXPRESSION__BODY));
		public static final ExecutorProperty _OpaqueExpression__language = new ExecutorProperty("language", Classes._OpaqueExpression, 1, new EcoreLibraryProperty(PivotPackage.Literals.OPAQUE_EXPRESSION__LANGUAGE));
		public static final ExecutorProperty _OpaqueExpression__message = new ExecutorProperty("message", Classes._OpaqueExpression, 2, new EcoreLibraryProperty(PivotPackage.Literals.OPAQUE_EXPRESSION__MESSAGE));
		public static final ExecutorProperty _OpaqueExpression__valueExpression = new ExecutorProperty("valueExpression", Classes._OpaqueExpression, 3, new EcoreLibraryProperty(PivotPackage.Literals.OPAQUE_EXPRESSION__VALUE_EXPRESSION));
	
		public static final ExecutorProperty _Operation__CallOperationAction = new ExecutorProperty("CallOperationAction", Classes._Operation, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CALL_OPERATION_ACTION__OPERATION));
		public static final ExecutorProperty _Operation__MessageType = new ExecutorProperty("MessageType", Classes._Operation, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_OPERATION));
		public static final ExecutorProperty _Operation__OperationCallExp = new ExecutorProperty("OperationCallExp", Classes._Operation, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION));
		public static final ExecutorProperty _Operation__class = new ExecutorProperty("class", Classes._Operation, 3, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__CLASS));
		public static final ExecutorProperty _Operation__ownedParameter = new ExecutorProperty("ownedParameter", Classes._Operation, 4, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__OWNED_PARAMETER));
		public static final ExecutorProperty _Operation__precedence = new ExecutorProperty("precedence", Classes._Operation, 5, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__PRECEDENCE));
		public static final ExecutorProperty _Operation__raisedException = new ExecutorProperty("raisedException", Classes._Operation, 6, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION__RAISED_EXCEPTION));
	
		public static final ExecutorProperty _OperationCallExp__argument = new ExecutorProperty("argument", Classes._OperationCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT));
		public static final ExecutorProperty _OperationCallExp__referredOperation = new ExecutorProperty("referredOperation", Classes._OperationCallExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION));
	
		public static final ExecutorProperty _Package__nestedPackage = new ExecutorProperty("nestedPackage", Classes._Package, 0, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__NESTED_PACKAGE));
		public static final ExecutorProperty _Package__nestingPackage = new ExecutorProperty("nestingPackage", Classes._Package, 1, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__NESTING_PACKAGE));
		public static final ExecutorProperty _Package__nsPrefix = new ExecutorProperty("nsPrefix", Classes._Package, 2, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__NS_PREFIX));
		public static final ExecutorProperty _Package__nsURI = new ExecutorProperty("nsURI", Classes._Package, 3, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__NS_URI));
		public static final ExecutorProperty _Package__ownedPrecedence = new ExecutorProperty("ownedPrecedence", Classes._Package, 4, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__OWNED_PRECEDENCE));
		public static final ExecutorProperty _Package__ownedType = new ExecutorProperty("ownedType", Classes._Package, 5, new EcoreLibraryProperty(PivotPackage.Literals.PACKAGE__OWNED_TYPE));
	
		public static final ExecutorProperty _Parameter__Variable = new ExecutorProperty("Variable", Classes._Parameter, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE__REPRESENTED_PARAMETER));
		public static final ExecutorProperty _Parameter__operation = new ExecutorProperty("operation", Classes._Parameter, 1, new EcoreLibraryProperty(PivotPackage.Literals.PARAMETER__OPERATION));
	
		public static final ExecutorProperty _ParameterableElement__owningTemplateParameter = new ExecutorProperty("owningTemplateParameter", Classes._ParameterableElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER));
		public static final ExecutorProperty _ParameterableElement__templateParameter = new ExecutorProperty("templateParameter", Classes._ParameterableElement, 1, new EcoreLibraryProperty(PivotPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER));
	
		public static final ExecutorProperty _Precedence__Operation = new ExecutorProperty("Operation", Classes._Precedence, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION__PRECEDENCE));
		public static final ExecutorProperty _Precedence__Package = new ExecutorProperty("Package", Classes._Precedence, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PACKAGE__OWNED_PRECEDENCE));
		public static final ExecutorProperty _Precedence__associativity = new ExecutorProperty("associativity", Classes._Precedence, 2, new EcoreLibraryProperty(PivotPackage.Literals.PRECEDENCE__ASSOCIATIVITY));
		public static final ExecutorProperty _Precedence__order = new ExecutorProperty("order", Classes._Precedence, 3, new EcoreLibraryProperty(PivotPackage.Literals.PRECEDENCE__ORDER));
	
		public static final ExecutorProperty _Property__NavigationCallExp = new ExecutorProperty("NavigationCallExp", Classes._Property, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__NAVIGATION_SOURCE));
		public static final ExecutorProperty _Property__PropertyCallExp = new ExecutorProperty("PropertyCallExp", Classes._Property, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY_CALL_EXP__REFERRED_PROPERTY));
		public static final ExecutorProperty _Property__association = new ExecutorProperty("association", Classes._Property, 2, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__ASSOCIATION));
		public static final ExecutorProperty _Property__class = new ExecutorProperty("class", Classes._Property, 3, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__CLASS));
		public static final ExecutorProperty _Property__default = new ExecutorProperty("default", Classes._Property, 4, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__DEFAULT));
		public static final ExecutorProperty _Property__implicit = new ExecutorProperty("implicit", Classes._Property, 5, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IMPLICIT));
		public static final ExecutorProperty _Property__isComposite = new ExecutorProperty("isComposite", Classes._Property, 6, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_COMPOSITE));
		public static final ExecutorProperty _Property__isDerived = new ExecutorProperty("isDerived", Classes._Property, 7, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_DERIVED));
		public static final ExecutorProperty _Property__isID = new ExecutorProperty("isID", Classes._Property, 8, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_ID));
		public static final ExecutorProperty _Property__isReadOnly = new ExecutorProperty("isReadOnly", Classes._Property, 9, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_READ_ONLY));
		public static final ExecutorProperty _Property__isResolveProxies = new ExecutorProperty("isResolveProxies", Classes._Property, 10, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_RESOLVE_PROXIES));
		public static final ExecutorProperty _Property__isTransient = new ExecutorProperty("isTransient", Classes._Property, 11, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_TRANSIENT));
		public static final ExecutorProperty _Property__isUnsettable = new ExecutorProperty("isUnsettable", Classes._Property, 12, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_UNSETTABLE));
		public static final ExecutorProperty _Property__isVolatile = new ExecutorProperty("isVolatile", Classes._Property, 13, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__IS_VOLATILE));
		public static final ExecutorProperty _Property__keys = new ExecutorProperty("keys", Classes._Property, 14, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__KEYS));
		public static final ExecutorProperty _Property__opposite = new ExecutorProperty("opposite", Classes._Property, 15, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY__OPPOSITE));
	
		public static final ExecutorProperty _PropertyCallExp__referredProperty = new ExecutorProperty("referredProperty", Classes._PropertyCallExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.PROPERTY_CALL_EXP__REFERRED_PROPERTY));
	
		public static final ExecutorProperty _RealLiteralExp__realSymbol = new ExecutorProperty("realSymbol", Classes._RealLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.REAL_LITERAL_EXP__REAL_SYMBOL));
	
		public static final ExecutorProperty _SendSignalAction__MessageExp = new ExecutorProperty("MessageExp", Classes._SendSignalAction, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_EXP__SENT_SIGNAL));
		public static final ExecutorProperty _SendSignalAction__signal = new ExecutorProperty("signal", Classes._SendSignalAction, 1, new EcoreLibraryProperty(PivotPackage.Literals.SEND_SIGNAL_ACTION__SIGNAL));
	
		public static final ExecutorProperty _Signal__MessageType = new ExecutorProperty("MessageType", Classes._Signal, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_SIGNAL));
		public static final ExecutorProperty _Signal__SendSignalAction = new ExecutorProperty("SendSignalAction", Classes._Signal, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.SEND_SIGNAL_ACTION__SIGNAL));
	
		public static final ExecutorProperty _State__StateExp = new ExecutorProperty("StateExp", Classes._State, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.STATE_EXP__REFERRED_STATE));
	
		public static final ExecutorProperty _StateExp__referredState = new ExecutorProperty("referredState", Classes._StateExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.STATE_EXP__REFERRED_STATE));
	
		public static final ExecutorProperty _StringLiteralExp__stringSymbol = new ExecutorProperty("stringSymbol", Classes._StringLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.STRING_LITERAL_EXP__STRING_SYMBOL));
	
		public static final ExecutorProperty _TemplateBinding__boundElement = new ExecutorProperty("boundElement", Classes._TemplateBinding, 0, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_BINDING__BOUND_ELEMENT));
		public static final ExecutorProperty _TemplateBinding__parameterSubstitution = new ExecutorProperty("parameterSubstitution", Classes._TemplateBinding, 1, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION));
		public static final ExecutorProperty _TemplateBinding__signature = new ExecutorProperty("signature", Classes._TemplateBinding, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_BINDING__SIGNATURE));
	
		public static final ExecutorProperty _TemplateParameter__TemplateParameterSubstitution = new ExecutorProperty("TemplateParameterSubstitution", Classes._TemplateParameter, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL));
		public static final ExecutorProperty _TemplateParameter__TemplateSignature = new ExecutorProperty("TemplateSignature", Classes._TemplateParameter, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER));
		public static final ExecutorProperty _TemplateParameter__default = new ExecutorProperty("default", Classes._TemplateParameter, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__DEFAULT));
		public static final ExecutorProperty _TemplateParameter__ownedDefault = new ExecutorProperty("ownedDefault", Classes._TemplateParameter, 3, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__OWNED_DEFAULT));
		public static final ExecutorProperty _TemplateParameter__ownedParameteredElement = new ExecutorProperty("ownedParameteredElement", Classes._TemplateParameter, 4, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT));
		public static final ExecutorProperty _TemplateParameter__parameteredElement = new ExecutorProperty("parameteredElement", Classes._TemplateParameter, 5, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT));
		public static final ExecutorProperty _TemplateParameter__signature = new ExecutorProperty("signature", Classes._TemplateParameter, 6, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__SIGNATURE));
	
		public static final ExecutorProperty _TemplateParameterSubstitution__actual = new ExecutorProperty("actual", Classes._TemplateParameterSubstitution, 0, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL));
		public static final ExecutorProperty _TemplateParameterSubstitution__formal = new ExecutorProperty("formal", Classes._TemplateParameterSubstitution, 1, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL));
		public static final ExecutorProperty _TemplateParameterSubstitution__ownedActual = new ExecutorProperty("ownedActual", Classes._TemplateParameterSubstitution, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL));
		public static final ExecutorProperty _TemplateParameterSubstitution__templateBinding = new ExecutorProperty("templateBinding", Classes._TemplateParameterSubstitution, 3, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING));
	
		public static final ExecutorProperty _TemplateParameterType__specification = new ExecutorProperty("specification", Classes._TemplateParameterType, 0, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_TYPE__SPECIFICATION));
	
		public static final ExecutorProperty _TemplateSignature__TemplateBinding = new ExecutorProperty("TemplateBinding", Classes._TemplateSignature, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_BINDING__SIGNATURE));
		public static final ExecutorProperty _TemplateSignature__ownedParameter = new ExecutorProperty("ownedParameter", Classes._TemplateSignature, 1, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETER));
		public static final ExecutorProperty _TemplateSignature__parameter = new ExecutorProperty("parameter", Classes._TemplateSignature, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__PARAMETER));
		public static final ExecutorProperty _TemplateSignature__template = new ExecutorProperty("template", Classes._TemplateSignature, 3, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__TEMPLATE));
	
		public static final ExecutorProperty _TemplateableElement__ownedTemplateSignature = new ExecutorProperty("ownedTemplateSignature", Classes._TemplateableElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE));
		public static final ExecutorProperty _TemplateableElement__templateBinding = new ExecutorProperty("templateBinding", Classes._TemplateableElement, 1, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING));
		public static final ExecutorProperty _TemplateableElement__unspecializedElement = new ExecutorProperty("unspecializedElement", Classes._TemplateableElement, 2, new EcoreLibraryProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__UNSPECIALIZED_ELEMENT));
	
		public static final ExecutorProperty _TupleLiteralExp__part = new ExecutorProperty("part", Classes._TupleLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.TUPLE_LITERAL_EXP__PART));
	
		public static final ExecutorProperty _TupleLiteralPart__TupleLiteralExp = new ExecutorProperty("TupleLiteralExp", Classes._TupleLiteralPart, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TUPLE_LITERAL_EXP__PART));
		public static final ExecutorProperty _TupleLiteralPart__initExpression = new ExecutorProperty("initExpression", Classes._TupleLiteralPart, 1, new EcoreLibraryProperty(PivotPackage.Literals.TUPLE_LITERAL_PART__INIT_EXPRESSION));
	
		public static final ExecutorProperty _Type__ClassifierType = new ExecutorProperty("ClassifierType", Classes._Type, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CLASSIFIER_TYPE__INSTANCE_TYPE));
		public static final ExecutorProperty _Type__CollectionType = new ExecutorProperty("CollectionType", Classes._Type, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_TYPE__ELEMENT_TYPE));
		public static final ExecutorProperty _Type__DataType = new ExecutorProperty("DataType", Classes._Type, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.DATA_TYPE__BEHAVIORAL_TYPE));
		public static final ExecutorProperty _Type__Operation = new ExecutorProperty("Operation", Classes._Type, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION__RAISED_EXCEPTION));
		public static final ExecutorProperty _Type__TypeExp = new ExecutorProperty("TypeExp", Classes._Type, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPE_EXP__REFERRED_TYPE));
		public static final ExecutorProperty _Type__TypeTemplateParameter = new ExecutorProperty("TypeTemplateParameter", Classes._Type, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPE_TEMPLATE_PARAMETER__CONSTRAINING_TYPE));
		public static final ExecutorProperty _Type__TypedElement = new ExecutorProperty("TypedElement", Classes._Type, 6, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPED_ELEMENT__TYPE));
		public static final ExecutorProperty _Type__instanceClassName = new ExecutorProperty("instanceClassName", Classes._Type, 7, new EcoreLibraryProperty(PivotPackage.Literals.TYPE__INSTANCE_CLASS_NAME));
		public static final ExecutorProperty _Type__package = new ExecutorProperty("package", Classes._Type, 8, new EcoreLibraryProperty(PivotPackage.Literals.TYPE__PACKAGE));
	
		public static final ExecutorProperty _TypeExp__referredType = new ExecutorProperty("referredType", Classes._TypeExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.TYPE_EXP__REFERRED_TYPE));
	
		public static final ExecutorProperty _TypeTemplateParameter__allowSubstitutable = new ExecutorProperty("allowSubstitutable", Classes._TypeTemplateParameter, 0, new EcoreLibraryProperty(PivotPackage.Literals.TYPE_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE));
		public static final ExecutorProperty _TypeTemplateParameter__constrainingType = new ExecutorProperty("constrainingType", Classes._TypeTemplateParameter, 1, new EcoreLibraryProperty(PivotPackage.Literals.TYPE_TEMPLATE_PARAMETER__CONSTRAINING_TYPE));
	
		public static final ExecutorProperty _TypedElement__type = new ExecutorProperty("type", Classes._TypedElement, 0, new EcoreLibraryProperty(PivotPackage.Literals.TYPED_ELEMENT__TYPE));
	
		public static final ExecutorProperty _UnlimitedNaturalLiteralExp__unlimitedNaturalSymbol = new ExecutorProperty("unlimitedNaturalSymbol", Classes._UnlimitedNaturalLiteralExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL));
	
		public static final ExecutorProperty _UnspecifiedType__lowerBound = new ExecutorProperty("lowerBound", Classes._UnspecifiedType, 0, new EcoreLibraryProperty(PivotPackage.Literals.UNSPECIFIED_TYPE__LOWER_BOUND));
		public static final ExecutorProperty _UnspecifiedType__upperBound = new ExecutorProperty("upperBound", Classes._UnspecifiedType, 1, new EcoreLibraryProperty(PivotPackage.Literals.UNSPECIFIED_TYPE__UPPER_BOUND));
	
		public static final ExecutorProperty _ValueSpecification__Constraint = new ExecutorProperty("Constraint", Classes._ValueSpecification, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRAINT__SPECIFICATION));
	
		public static final ExecutorProperty _Variable__IterateExp = new ExecutorProperty("IterateExp", Classes._Variable, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ITERATE_EXP__RESULT));
		public static final ExecutorProperty _Variable__LetExp = new ExecutorProperty("LetExp", Classes._Variable, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LET_EXP__VARIABLE));
		public static final ExecutorProperty _Variable__LoopExp = new ExecutorProperty("LoopExp", Classes._Variable, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__ITERATOR));
		public static final ExecutorProperty _Variable__implicit = new ExecutorProperty("implicit", Classes._Variable, 3, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE__IMPLICIT));
		public static final ExecutorProperty _Variable__initExpression = new ExecutorProperty("initExpression", Classes._Variable, 4, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE__INIT_EXPRESSION));
		public static final ExecutorProperty _Variable__representedParameter = new ExecutorProperty("representedParameter", Classes._Variable, 5, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE__REPRESENTED_PARAMETER));
	
		public static final ExecutorProperty _VariableDeclaration__VariableExp = new ExecutorProperty("VariableExp", Classes._VariableDeclaration, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE_EXP__REFERRED_VARIABLE));
	
		public static final ExecutorProperty _VariableExp__implicit = new ExecutorProperty("implicit", Classes._VariableExp, 0, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE_EXP__IMPLICIT));
		public static final ExecutorProperty _VariableExp__referredVariable = new ExecutorProperty("referredVariable", Classes._VariableExp, 1, new EcoreLibraryProperty(PivotPackage.Literals.VARIABLE_EXP__REFERRED_VARIABLE));
	}

	/**
	 *	The fragments for all base classes in depth order: OclAny first, OclSelf last.
	 */
	public static class ClassFragments {
		private static final ExecutorFragment[] _Annotation =
		{
		    Fragments._Annotation__OclAny /* 0 */,
		    Fragments._Annotation__Classifier /* 1 */,
		    Fragments._Annotation__Nameable /* 2 */,
		    Fragments._Annotation__Visitable /* 2 */,
		    Fragments._Annotation__Element /* 3 */,
		    Fragments._Annotation__MonikeredElement /* 4 */,
		    Fragments._Annotation__NamedElement /* 5 */,
		    Fragments._Annotation__Annotation /* 6 */
		};
		private static final int[] __Annotation = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _AnyType =
		{
		    Fragments._AnyType__OclAny /* 0 */,
		    Fragments._AnyType__Classifier /* 1 */,
		    Fragments._AnyType__Nameable /* 2 */,
		    Fragments._AnyType__Visitable /* 2 */,
		    Fragments._AnyType__Element /* 3 */,
		    Fragments._AnyType__MonikeredElement /* 4 */,
		    Fragments._AnyType__TemplateableElement /* 5 */,
		    Fragments._AnyType__NamedElement /* 5 */,
		    Fragments._AnyType__ParameterableElement /* 5 */,
		    Fragments._AnyType__Type /* 6 */,
		    Fragments._AnyType__Namespace /* 6 */,
		    Fragments._AnyType__Class /* 7 */,
		    Fragments._AnyType__AnyType /* 8 */
		};
		private static final int[] __AnyType = { 1,1,2,1,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _AssociationClass =
		{
		    Fragments._AssociationClass__OclAny /* 0 */,
		    Fragments._AssociationClass__Classifier /* 1 */,
		    Fragments._AssociationClass__Nameable /* 2 */,
		    Fragments._AssociationClass__Visitable /* 2 */,
		    Fragments._AssociationClass__Element /* 3 */,
		    Fragments._AssociationClass__MonikeredElement /* 4 */,
		    Fragments._AssociationClass__TemplateableElement /* 5 */,
		    Fragments._AssociationClass__NamedElement /* 5 */,
		    Fragments._AssociationClass__ParameterableElement /* 5 */,
		    Fragments._AssociationClass__Type /* 6 */,
		    Fragments._AssociationClass__Namespace /* 6 */,
		    Fragments._AssociationClass__Class /* 7 */,
		    Fragments._AssociationClass__AssociationClass /* 8 */
		};
		private static final int[] __AssociationClass = { 1,1,2,1,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _AssociationClassCallExp =
		{
		    Fragments._AssociationClassCallExp__OclAny /* 0 */,
		    Fragments._AssociationClassCallExp__Classifier /* 1 */,
		    Fragments._AssociationClassCallExp__Nameable /* 2 */,
		    Fragments._AssociationClassCallExp__Visitable /* 2 */,
		    Fragments._AssociationClassCallExp__Element /* 3 */,
		    Fragments._AssociationClassCallExp__MonikeredElement /* 4 */,
		    Fragments._AssociationClassCallExp__NamedElement /* 5 */,
		    Fragments._AssociationClassCallExp__TypedElement /* 6 */,
		    Fragments._AssociationClassCallExp__OclExpression /* 7 */,
		    Fragments._AssociationClassCallExp__CallExp /* 8 */,
		    Fragments._AssociationClassCallExp__FeatureCallExp /* 9 */,
		    Fragments._AssociationClassCallExp__NavigationCallExp /* 10 */,
		    Fragments._AssociationClassCallExp__AssociationClassCallExp /* 11 */
		};
		private static final int[] __AssociationClassCallExp = { 1,1,2,1,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _AssociativityKind =
		{
		    Fragments._AssociativityKind__AssociativityKind /* 0 */
		};
		private static final int[] __AssociativityKind = { 1 };
	
		private static final ExecutorFragment[] _Bag =
		{
		    Fragments._Bag__OclAny /* 0 */,
		    Fragments._Bag__Collection /* 1 */,
		    Fragments._Bag__NonOrderedCollection /* 2 */,
		    Fragments._Bag__NonUniqueCollection /* 2 */,
		    Fragments._Bag__Bag /* 3 */
		};
		private static final int[] __Bag = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _BagType =
		{
		    Fragments._BagType__OclAny /* 0 */,
		    Fragments._BagType__Classifier /* 1 */,
		    Fragments._BagType__Nameable /* 2 */,
		    Fragments._BagType__Visitable /* 2 */,
		    Fragments._BagType__Element /* 3 */,
		    Fragments._BagType__MonikeredElement /* 4 */,
		    Fragments._BagType__TemplateableElement /* 5 */,
		    Fragments._BagType__NamedElement /* 5 */,
		    Fragments._BagType__ParameterableElement /* 5 */,
		    Fragments._BagType__Type /* 6 */,
		    Fragments._BagType__Namespace /* 6 */,
		    Fragments._BagType__Class /* 7 */,
		    Fragments._BagType__DataType /* 8 */,
		    Fragments._BagType__CollectionType /* 9 */,
		    Fragments._BagType__BagType /* 10 */
		};
		private static final int[] __BagType = { 1,1,2,1,1,3,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Boolean =
		{
		    Fragments._Boolean__OclAny /* 0 */,
		    Fragments._Boolean__Boolean /* 1 */
		};
		private static final int[] __Boolean = { 1,1 };
	
		private static final ExecutorFragment[] _BooleanLiteralExp =
		{
		    Fragments._BooleanLiteralExp__OclAny /* 0 */,
		    Fragments._BooleanLiteralExp__Classifier /* 1 */,
		    Fragments._BooleanLiteralExp__Nameable /* 2 */,
		    Fragments._BooleanLiteralExp__Visitable /* 2 */,
		    Fragments._BooleanLiteralExp__Element /* 3 */,
		    Fragments._BooleanLiteralExp__MonikeredElement /* 4 */,
		    Fragments._BooleanLiteralExp__NamedElement /* 5 */,
		    Fragments._BooleanLiteralExp__TypedElement /* 6 */,
		    Fragments._BooleanLiteralExp__OclExpression /* 7 */,
		    Fragments._BooleanLiteralExp__LiteralExp /* 8 */,
		    Fragments._BooleanLiteralExp__PrimitiveLiteralExp /* 9 */,
		    Fragments._BooleanLiteralExp__BooleanLiteralExp /* 10 */
		};
		private static final int[] __BooleanLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CallExp =
		{
		    Fragments._CallExp__OclAny /* 0 */,
		    Fragments._CallExp__Classifier /* 1 */,
		    Fragments._CallExp__Nameable /* 2 */,
		    Fragments._CallExp__Visitable /* 2 */,
		    Fragments._CallExp__Element /* 3 */,
		    Fragments._CallExp__MonikeredElement /* 4 */,
		    Fragments._CallExp__NamedElement /* 5 */,
		    Fragments._CallExp__TypedElement /* 6 */,
		    Fragments._CallExp__OclExpression /* 7 */,
		    Fragments._CallExp__CallExp /* 8 */
		};
		private static final int[] __CallExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CallOperationAction =
		{
		    Fragments._CallOperationAction__OclAny /* 0 */,
		    Fragments._CallOperationAction__Classifier /* 1 */,
		    Fragments._CallOperationAction__Nameable /* 2 */,
		    Fragments._CallOperationAction__Visitable /* 2 */,
		    Fragments._CallOperationAction__Element /* 3 */,
		    Fragments._CallOperationAction__MonikeredElement /* 4 */,
		    Fragments._CallOperationAction__NamedElement /* 5 */,
		    Fragments._CallOperationAction__CallOperationAction /* 6 */
		};
		private static final int[] __CallOperationAction = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Class =
		{
		    Fragments._Class__OclAny /* 0 */,
		    Fragments._Class__Classifier /* 1 */,
		    Fragments._Class__Nameable /* 2 */,
		    Fragments._Class__Visitable /* 2 */,
		    Fragments._Class__Element /* 3 */,
		    Fragments._Class__MonikeredElement /* 4 */,
		    Fragments._Class__ParameterableElement /* 5 */,
		    Fragments._Class__TemplateableElement /* 5 */,
		    Fragments._Class__NamedElement /* 5 */,
		    Fragments._Class__Namespace /* 6 */,
		    Fragments._Class__Type /* 6 */,
		    Fragments._Class__Class /* 7 */
		};
		private static final int[] __Class = { 1,1,2,1,1,3,2,1 };
	
		private static final ExecutorFragment[] _Classifier =
		{
		    Fragments._Classifier__OclAny /* 0 */,
		    Fragments._Classifier__Classifier /* 1 */
		};
		private static final int[] __Classifier = { 1,1 };
	
		private static final ExecutorFragment[] _ClassifierType =
		{
		    Fragments._ClassifierType__OclAny /* 0 */,
		    Fragments._ClassifierType__Classifier /* 1 */,
		    Fragments._ClassifierType__Nameable /* 2 */,
		    Fragments._ClassifierType__Visitable /* 2 */,
		    Fragments._ClassifierType__Element /* 3 */,
		    Fragments._ClassifierType__MonikeredElement /* 4 */,
		    Fragments._ClassifierType__TemplateableElement /* 5 */,
		    Fragments._ClassifierType__NamedElement /* 5 */,
		    Fragments._ClassifierType__ParameterableElement /* 5 */,
		    Fragments._ClassifierType__Type /* 6 */,
		    Fragments._ClassifierType__Namespace /* 6 */,
		    Fragments._ClassifierType__Class /* 7 */,
		    Fragments._ClassifierType__DataType /* 8 */,
		    Fragments._ClassifierType__ClassifierType /* 9 */
		};
		private static final int[] __ClassifierType = { 1,1,2,1,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _Collection =
		{
		    Fragments._Collection__OclAny /* 0 */,
		    Fragments._Collection__Collection /* 1 */
		};
		private static final int[] __Collection = { 1,1 };
	
		private static final ExecutorFragment[] _CollectionItem =
		{
		    Fragments._CollectionItem__OclAny /* 0 */,
		    Fragments._CollectionItem__Classifier /* 1 */,
		    Fragments._CollectionItem__Nameable /* 2 */,
		    Fragments._CollectionItem__Visitable /* 2 */,
		    Fragments._CollectionItem__Element /* 3 */,
		    Fragments._CollectionItem__MonikeredElement /* 4 */,
		    Fragments._CollectionItem__NamedElement /* 5 */,
		    Fragments._CollectionItem__TypedElement /* 6 */,
		    Fragments._CollectionItem__CollectionLiteralPart /* 7 */,
		    Fragments._CollectionItem__CollectionItem /* 8 */
		};
		private static final int[] __CollectionItem = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionKind =
		{
		    Fragments._CollectionKind__CollectionKind /* 0 */
		};
		private static final int[] __CollectionKind = { 1 };
	
		private static final ExecutorFragment[] _CollectionLiteralExp =
		{
		    Fragments._CollectionLiteralExp__OclAny /* 0 */,
		    Fragments._CollectionLiteralExp__Classifier /* 1 */,
		    Fragments._CollectionLiteralExp__Nameable /* 2 */,
		    Fragments._CollectionLiteralExp__Visitable /* 2 */,
		    Fragments._CollectionLiteralExp__Element /* 3 */,
		    Fragments._CollectionLiteralExp__MonikeredElement /* 4 */,
		    Fragments._CollectionLiteralExp__NamedElement /* 5 */,
		    Fragments._CollectionLiteralExp__TypedElement /* 6 */,
		    Fragments._CollectionLiteralExp__OclExpression /* 7 */,
		    Fragments._CollectionLiteralExp__LiteralExp /* 8 */,
		    Fragments._CollectionLiteralExp__CollectionLiteralExp /* 9 */
		};
		private static final int[] __CollectionLiteralExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionLiteralPart =
		{
		    Fragments._CollectionLiteralPart__OclAny /* 0 */,
		    Fragments._CollectionLiteralPart__Classifier /* 1 */,
		    Fragments._CollectionLiteralPart__Nameable /* 2 */,
		    Fragments._CollectionLiteralPart__Visitable /* 2 */,
		    Fragments._CollectionLiteralPart__Element /* 3 */,
		    Fragments._CollectionLiteralPart__MonikeredElement /* 4 */,
		    Fragments._CollectionLiteralPart__NamedElement /* 5 */,
		    Fragments._CollectionLiteralPart__TypedElement /* 6 */,
		    Fragments._CollectionLiteralPart__CollectionLiteralPart /* 7 */
		};
		private static final int[] __CollectionLiteralPart = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionRange =
		{
		    Fragments._CollectionRange__OclAny /* 0 */,
		    Fragments._CollectionRange__Classifier /* 1 */,
		    Fragments._CollectionRange__Nameable /* 2 */,
		    Fragments._CollectionRange__Visitable /* 2 */,
		    Fragments._CollectionRange__Element /* 3 */,
		    Fragments._CollectionRange__MonikeredElement /* 4 */,
		    Fragments._CollectionRange__NamedElement /* 5 */,
		    Fragments._CollectionRange__TypedElement /* 6 */,
		    Fragments._CollectionRange__CollectionLiteralPart /* 7 */,
		    Fragments._CollectionRange__CollectionRange /* 8 */
		};
		private static final int[] __CollectionRange = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _CollectionType =
		{
		    Fragments._CollectionType__OclAny /* 0 */,
		    Fragments._CollectionType__Classifier /* 1 */,
		    Fragments._CollectionType__Nameable /* 2 */,
		    Fragments._CollectionType__Visitable /* 2 */,
		    Fragments._CollectionType__Element /* 3 */,
		    Fragments._CollectionType__MonikeredElement /* 4 */,
		    Fragments._CollectionType__TemplateableElement /* 5 */,
		    Fragments._CollectionType__NamedElement /* 5 */,
		    Fragments._CollectionType__ParameterableElement /* 5 */,
		    Fragments._CollectionType__Type /* 6 */,
		    Fragments._CollectionType__Namespace /* 6 */,
		    Fragments._CollectionType__Class /* 7 */,
		    Fragments._CollectionType__DataType /* 8 */,
		    Fragments._CollectionType__CollectionType /* 9 */
		};
		private static final int[] __CollectionType = { 1,1,2,1,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _Comment =
		{
		    Fragments._Comment__OclAny /* 0 */,
		    Fragments._Comment__Classifier /* 1 */,
		    Fragments._Comment__Visitable /* 2 */,
		    Fragments._Comment__Element /* 3 */,
		    Fragments._Comment__Comment /* 4 */
		};
		private static final int[] __Comment = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Constraint =
		{
		    Fragments._Constraint__OclAny /* 0 */,
		    Fragments._Constraint__Classifier /* 1 */,
		    Fragments._Constraint__Nameable /* 2 */,
		    Fragments._Constraint__Visitable /* 2 */,
		    Fragments._Constraint__Element /* 3 */,
		    Fragments._Constraint__MonikeredElement /* 4 */,
		    Fragments._Constraint__NamedElement /* 5 */,
		    Fragments._Constraint__Constraint /* 6 */
		};
		private static final int[] __Constraint = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _DataType =
		{
		    Fragments._DataType__OclAny /* 0 */,
		    Fragments._DataType__Classifier /* 1 */,
		    Fragments._DataType__Nameable /* 2 */,
		    Fragments._DataType__Visitable /* 2 */,
		    Fragments._DataType__Element /* 3 */,
		    Fragments._DataType__MonikeredElement /* 4 */,
		    Fragments._DataType__TemplateableElement /* 5 */,
		    Fragments._DataType__NamedElement /* 5 */,
		    Fragments._DataType__ParameterableElement /* 5 */,
		    Fragments._DataType__Type /* 6 */,
		    Fragments._DataType__Namespace /* 6 */,
		    Fragments._DataType__Class /* 7 */,
		    Fragments._DataType__DataType /* 8 */
		};
		private static final int[] __DataType = { 1,1,2,1,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _Detail =
		{
		    Fragments._Detail__OclAny /* 0 */,
		    Fragments._Detail__Classifier /* 1 */,
		    Fragments._Detail__Nameable /* 2 */,
		    Fragments._Detail__Visitable /* 2 */,
		    Fragments._Detail__Element /* 3 */,
		    Fragments._Detail__MonikeredElement /* 4 */,
		    Fragments._Detail__NamedElement /* 5 */,
		    Fragments._Detail__Detail /* 6 */
		};
		private static final int[] __Detail = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Element =
		{
		    Fragments._Element__OclAny /* 0 */,
		    Fragments._Element__Classifier /* 1 */,
		    Fragments._Element__Visitable /* 2 */,
		    Fragments._Element__Element /* 3 */
		};
		private static final int[] __Element = { 1,1,1,1 };
	
		private static final ExecutorFragment[] _EnumLiteralExp =
		{
		    Fragments._EnumLiteralExp__OclAny /* 0 */,
		    Fragments._EnumLiteralExp__Classifier /* 1 */,
		    Fragments._EnumLiteralExp__Nameable /* 2 */,
		    Fragments._EnumLiteralExp__Visitable /* 2 */,
		    Fragments._EnumLiteralExp__Element /* 3 */,
		    Fragments._EnumLiteralExp__MonikeredElement /* 4 */,
		    Fragments._EnumLiteralExp__NamedElement /* 5 */,
		    Fragments._EnumLiteralExp__TypedElement /* 6 */,
		    Fragments._EnumLiteralExp__OclExpression /* 7 */,
		    Fragments._EnumLiteralExp__LiteralExp /* 8 */,
		    Fragments._EnumLiteralExp__EnumLiteralExp /* 9 */
		};
		private static final int[] __EnumLiteralExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Enumeration =
		{
		    Fragments._Enumeration__OclAny /* 0 */,
		    Fragments._Enumeration__Classifier /* 1 */,
		    Fragments._Enumeration__Nameable /* 2 */,
		    Fragments._Enumeration__Visitable /* 2 */,
		    Fragments._Enumeration__Element /* 3 */,
		    Fragments._Enumeration__MonikeredElement /* 4 */,
		    Fragments._Enumeration__TemplateableElement /* 5 */,
		    Fragments._Enumeration__NamedElement /* 5 */,
		    Fragments._Enumeration__ParameterableElement /* 5 */,
		    Fragments._Enumeration__Type /* 6 */,
		    Fragments._Enumeration__Namespace /* 6 */,
		    Fragments._Enumeration__Class /* 7 */,
		    Fragments._Enumeration__DataType /* 8 */,
		    Fragments._Enumeration__Enumeration /* 9 */
		};
		private static final int[] __Enumeration = { 1,1,2,1,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _EnumerationLiteral =
		{
		    Fragments._EnumerationLiteral__OclAny /* 0 */,
		    Fragments._EnumerationLiteral__Classifier /* 1 */,
		    Fragments._EnumerationLiteral__Nameable /* 2 */,
		    Fragments._EnumerationLiteral__Visitable /* 2 */,
		    Fragments._EnumerationLiteral__Element /* 3 */,
		    Fragments._EnumerationLiteral__MonikeredElement /* 4 */,
		    Fragments._EnumerationLiteral__NamedElement /* 5 */,
		    Fragments._EnumerationLiteral__EnumerationLiteral /* 6 */
		};
		private static final int[] __EnumerationLiteral = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _ExpressionInOcl =
		{
		    Fragments._ExpressionInOcl__OclAny /* 0 */,
		    Fragments._ExpressionInOcl__Classifier /* 1 */,
		    Fragments._ExpressionInOcl__Visitable /* 2 */,
		    Fragments._ExpressionInOcl__Nameable /* 2 */,
		    Fragments._ExpressionInOcl__Element /* 3 */,
		    Fragments._ExpressionInOcl__MonikeredElement /* 4 */,
		    Fragments._ExpressionInOcl__ParameterableElement /* 5 */,
		    Fragments._ExpressionInOcl__NamedElement /* 5 */,
		    Fragments._ExpressionInOcl__TypedElement /* 6 */,
		    Fragments._ExpressionInOcl__ValueSpecification /* 7 */,
		    Fragments._ExpressionInOcl__OpaqueExpression /* 8 */,
		    Fragments._ExpressionInOcl__ExpressionInOcl /* 9 */
		};
		private static final int[] __ExpressionInOcl = { 1,1,2,1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Feature =
		{
		    Fragments._Feature__OclAny /* 0 */,
		    Fragments._Feature__Classifier /* 1 */,
		    Fragments._Feature__Nameable /* 2 */,
		    Fragments._Feature__Visitable /* 2 */,
		    Fragments._Feature__Element /* 3 */,
		    Fragments._Feature__MonikeredElement /* 4 */,
		    Fragments._Feature__NamedElement /* 5 */,
		    Fragments._Feature__MultiplicityElement /* 5 */,
		    Fragments._Feature__TypedElement /* 6 */,
		    Fragments._Feature__TypedMultiplicityElement /* 7 */,
		    Fragments._Feature__Feature /* 8 */
		};
		private static final int[] __Feature = { 1,1,2,1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _FeatureCallExp =
		{
		    Fragments._FeatureCallExp__OclAny /* 0 */,
		    Fragments._FeatureCallExp__Classifier /* 1 */,
		    Fragments._FeatureCallExp__Nameable /* 2 */,
		    Fragments._FeatureCallExp__Visitable /* 2 */,
		    Fragments._FeatureCallExp__Element /* 3 */,
		    Fragments._FeatureCallExp__MonikeredElement /* 4 */,
		    Fragments._FeatureCallExp__NamedElement /* 5 */,
		    Fragments._FeatureCallExp__TypedElement /* 6 */,
		    Fragments._FeatureCallExp__OclExpression /* 7 */,
		    Fragments._FeatureCallExp__CallExp /* 8 */,
		    Fragments._FeatureCallExp__FeatureCallExp /* 9 */
		};
		private static final int[] __FeatureCallExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _IfExp =
		{
		    Fragments._IfExp__OclAny /* 0 */,
		    Fragments._IfExp__Classifier /* 1 */,
		    Fragments._IfExp__Nameable /* 2 */,
		    Fragments._IfExp__Visitable /* 2 */,
		    Fragments._IfExp__Element /* 3 */,
		    Fragments._IfExp__MonikeredElement /* 4 */,
		    Fragments._IfExp__NamedElement /* 5 */,
		    Fragments._IfExp__TypedElement /* 6 */,
		    Fragments._IfExp__OclExpression /* 7 */,
		    Fragments._IfExp__IfExp /* 8 */
		};
		private static final int[] __IfExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Int =
		{
		    Fragments._Int__Int /* 0 */
		};
		private static final int[] __Int = { 1 };
	
		private static final ExecutorFragment[] _Integer =
		{
		    Fragments._Integer__OclAny /* 0 */,
		    Fragments._Integer__Real /* 1 */,
		    Fragments._Integer__Integer /* 2 */
		};
		private static final int[] __Integer = { 1,1,1 };
	
		private static final ExecutorFragment[] _IntegerLiteralExp =
		{
		    Fragments._IntegerLiteralExp__OclAny /* 0 */,
		    Fragments._IntegerLiteralExp__Classifier /* 1 */,
		    Fragments._IntegerLiteralExp__Nameable /* 2 */,
		    Fragments._IntegerLiteralExp__Visitable /* 2 */,
		    Fragments._IntegerLiteralExp__Element /* 3 */,
		    Fragments._IntegerLiteralExp__MonikeredElement /* 4 */,
		    Fragments._IntegerLiteralExp__NamedElement /* 5 */,
		    Fragments._IntegerLiteralExp__TypedElement /* 6 */,
		    Fragments._IntegerLiteralExp__OclExpression /* 7 */,
		    Fragments._IntegerLiteralExp__LiteralExp /* 8 */,
		    Fragments._IntegerLiteralExp__PrimitiveLiteralExp /* 9 */,
		    Fragments._IntegerLiteralExp__NumericLiteralExp /* 10 */,
		    Fragments._IntegerLiteralExp__IntegerLiteralExp /* 11 */
		};
		private static final int[] __IntegerLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _InvalidLiteralExp =
		{
		    Fragments._InvalidLiteralExp__OclAny /* 0 */,
		    Fragments._InvalidLiteralExp__Classifier /* 1 */,
		    Fragments._InvalidLiteralExp__Nameable /* 2 */,
		    Fragments._InvalidLiteralExp__Visitable /* 2 */,
		    Fragments._InvalidLiteralExp__Element /* 3 */,
		    Fragments._InvalidLiteralExp__MonikeredElement /* 4 */,
		    Fragments._InvalidLiteralExp__NamedElement /* 5 */,
		    Fragments._InvalidLiteralExp__TypedElement /* 6 */,
		    Fragments._InvalidLiteralExp__OclExpression /* 7 */,
		    Fragments._InvalidLiteralExp__LiteralExp /* 8 */,
		    Fragments._InvalidLiteralExp__PrimitiveLiteralExp /* 9 */,
		    Fragments._InvalidLiteralExp__InvalidLiteralExp /* 10 */
		};
		private static final int[] __InvalidLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _InvalidType =
		{
		    Fragments._InvalidType__OclAny /* 0 */,
		    Fragments._InvalidType__Classifier /* 1 */,
		    Fragments._InvalidType__Nameable /* 2 */,
		    Fragments._InvalidType__Visitable /* 2 */,
		    Fragments._InvalidType__Element /* 3 */,
		    Fragments._InvalidType__MonikeredElement /* 4 */,
		    Fragments._InvalidType__TemplateableElement /* 5 */,
		    Fragments._InvalidType__NamedElement /* 5 */,
		    Fragments._InvalidType__ParameterableElement /* 5 */,
		    Fragments._InvalidType__Type /* 6 */,
		    Fragments._InvalidType__Namespace /* 6 */,
		    Fragments._InvalidType__Class /* 7 */,
		    Fragments._InvalidType__InvalidType /* 8 */
		};
		private static final int[] __InvalidType = { 1,1,2,1,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _IterateExp =
		{
		    Fragments._IterateExp__OclAny /* 0 */,
		    Fragments._IterateExp__Classifier /* 1 */,
		    Fragments._IterateExp__Nameable /* 2 */,
		    Fragments._IterateExp__Visitable /* 2 */,
		    Fragments._IterateExp__Element /* 3 */,
		    Fragments._IterateExp__MonikeredElement /* 4 */,
		    Fragments._IterateExp__NamedElement /* 5 */,
		    Fragments._IterateExp__TypedElement /* 6 */,
		    Fragments._IterateExp__OclExpression /* 7 */,
		    Fragments._IterateExp__CallExp /* 8 */,
		    Fragments._IterateExp__LoopExp /* 9 */,
		    Fragments._IterateExp__IterateExp /* 10 */
		};
		private static final int[] __IterateExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Iteration =
		{
		    Fragments._Iteration__OclAny /* 0 */,
		    Fragments._Iteration__Classifier /* 1 */,
		    Fragments._Iteration__Nameable /* 2 */,
		    Fragments._Iteration__Visitable /* 2 */,
		    Fragments._Iteration__Element /* 3 */,
		    Fragments._Iteration__MonikeredElement /* 4 */,
		    Fragments._Iteration__TemplateableElement /* 5 */,
		    Fragments._Iteration__NamedElement /* 5 */,
		    Fragments._Iteration__ParameterableElement /* 5 */,
		    Fragments._Iteration__MultiplicityElement /* 5 */,
		    Fragments._Iteration__TypedElement /* 6 */,
		    Fragments._Iteration__Namespace /* 6 */,
		    Fragments._Iteration__TypedMultiplicityElement /* 7 */,
		    Fragments._Iteration__Feature /* 8 */,
		    Fragments._Iteration__Operation /* 9 */,
		    Fragments._Iteration__Iteration /* 10 */
		};
		private static final int[] __Iteration = { 1,1,2,1,1,4,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _IteratorExp =
		{
		    Fragments._IteratorExp__OclAny /* 0 */,
		    Fragments._IteratorExp__Classifier /* 1 */,
		    Fragments._IteratorExp__Nameable /* 2 */,
		    Fragments._IteratorExp__Visitable /* 2 */,
		    Fragments._IteratorExp__Element /* 3 */,
		    Fragments._IteratorExp__MonikeredElement /* 4 */,
		    Fragments._IteratorExp__NamedElement /* 5 */,
		    Fragments._IteratorExp__TypedElement /* 6 */,
		    Fragments._IteratorExp__OclExpression /* 7 */,
		    Fragments._IteratorExp__CallExp /* 8 */,
		    Fragments._IteratorExp__LoopExp /* 9 */,
		    Fragments._IteratorExp__IteratorExp /* 10 */
		};
		private static final int[] __IteratorExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _LambdaType =
		{
		    Fragments._LambdaType__OclAny /* 0 */,
		    Fragments._LambdaType__Classifier /* 1 */,
		    Fragments._LambdaType__Nameable /* 2 */,
		    Fragments._LambdaType__Visitable /* 2 */,
		    Fragments._LambdaType__Element /* 3 */,
		    Fragments._LambdaType__MonikeredElement /* 4 */,
		    Fragments._LambdaType__TemplateableElement /* 5 */,
		    Fragments._LambdaType__NamedElement /* 5 */,
		    Fragments._LambdaType__ParameterableElement /* 5 */,
		    Fragments._LambdaType__Type /* 6 */,
		    Fragments._LambdaType__Namespace /* 6 */,
		    Fragments._LambdaType__Class /* 7 */,
		    Fragments._LambdaType__DataType /* 8 */,
		    Fragments._LambdaType__LambdaType /* 9 */
		};
		private static final int[] __LambdaType = { 1,1,2,1,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _LetExp =
		{
		    Fragments._LetExp__OclAny /* 0 */,
		    Fragments._LetExp__Classifier /* 1 */,
		    Fragments._LetExp__Nameable /* 2 */,
		    Fragments._LetExp__Visitable /* 2 */,
		    Fragments._LetExp__Element /* 3 */,
		    Fragments._LetExp__MonikeredElement /* 4 */,
		    Fragments._LetExp__NamedElement /* 5 */,
		    Fragments._LetExp__TypedElement /* 6 */,
		    Fragments._LetExp__OclExpression /* 7 */,
		    Fragments._LetExp__LetExp /* 8 */
		};
		private static final int[] __LetExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Library =
		{
		    Fragments._Library__OclAny /* 0 */,
		    Fragments._Library__Classifier /* 1 */,
		    Fragments._Library__Visitable /* 2 */,
		    Fragments._Library__Nameable /* 2 */,
		    Fragments._Library__Element /* 3 */,
		    Fragments._Library__MonikeredElement /* 4 */,
		    Fragments._Library__TemplateableElement /* 5 */,
		    Fragments._Library__NamedElement /* 5 */,
		    Fragments._Library__Namespace /* 6 */,
		    Fragments._Library__Package /* 7 */,
		    Fragments._Library__Library /* 8 */
		};
		private static final int[] __Library = { 1,1,2,1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _LibraryFeature =
		{
		    Fragments._LibraryFeature__LibraryFeature /* 0 */
		};
		private static final int[] __LibraryFeature = { 1 };
	
		private static final ExecutorFragment[] _LiteralExp =
		{
		    Fragments._LiteralExp__OclAny /* 0 */,
		    Fragments._LiteralExp__Classifier /* 1 */,
		    Fragments._LiteralExp__Nameable /* 2 */,
		    Fragments._LiteralExp__Visitable /* 2 */,
		    Fragments._LiteralExp__Element /* 3 */,
		    Fragments._LiteralExp__MonikeredElement /* 4 */,
		    Fragments._LiteralExp__NamedElement /* 5 */,
		    Fragments._LiteralExp__TypedElement /* 6 */,
		    Fragments._LiteralExp__OclExpression /* 7 */,
		    Fragments._LiteralExp__LiteralExp /* 8 */
		};
		private static final int[] __LiteralExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _LoopExp =
		{
		    Fragments._LoopExp__OclAny /* 0 */,
		    Fragments._LoopExp__Classifier /* 1 */,
		    Fragments._LoopExp__Nameable /* 2 */,
		    Fragments._LoopExp__Visitable /* 2 */,
		    Fragments._LoopExp__Element /* 3 */,
		    Fragments._LoopExp__MonikeredElement /* 4 */,
		    Fragments._LoopExp__NamedElement /* 5 */,
		    Fragments._LoopExp__TypedElement /* 6 */,
		    Fragments._LoopExp__OclExpression /* 7 */,
		    Fragments._LoopExp__CallExp /* 8 */,
		    Fragments._LoopExp__LoopExp /* 9 */
		};
		private static final int[] __LoopExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _MessageExp =
		{
		    Fragments._MessageExp__OclAny /* 0 */,
		    Fragments._MessageExp__Classifier /* 1 */,
		    Fragments._MessageExp__Nameable /* 2 */,
		    Fragments._MessageExp__Visitable /* 2 */,
		    Fragments._MessageExp__Element /* 3 */,
		    Fragments._MessageExp__MonikeredElement /* 4 */,
		    Fragments._MessageExp__NamedElement /* 5 */,
		    Fragments._MessageExp__TypedElement /* 6 */,
		    Fragments._MessageExp__OclExpression /* 7 */,
		    Fragments._MessageExp__MessageExp /* 8 */
		};
		private static final int[] __MessageExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _MessageType =
		{
		    Fragments._MessageType__OclAny /* 0 */,
		    Fragments._MessageType__Classifier /* 1 */,
		    Fragments._MessageType__Visitable /* 2 */,
		    Fragments._MessageType__Nameable /* 2 */,
		    Fragments._MessageType__Element /* 3 */,
		    Fragments._MessageType__MonikeredElement /* 4 */,
		    Fragments._MessageType__ParameterableElement /* 5 */,
		    Fragments._MessageType__TemplateableElement /* 5 */,
		    Fragments._MessageType__NamedElement /* 5 */,
		    Fragments._MessageType__Type /* 6 */,
		    Fragments._MessageType__MessageType /* 7 */
		};
		private static final int[] __MessageType = { 1,1,2,1,1,3,1,1 };
	
		private static final ExecutorFragment[] _MonikeredElement =
		{
		    Fragments._MonikeredElement__OclAny /* 0 */,
		    Fragments._MonikeredElement__Classifier /* 1 */,
		    Fragments._MonikeredElement__Visitable /* 2 */,
		    Fragments._MonikeredElement__Element /* 3 */,
		    Fragments._MonikeredElement__MonikeredElement /* 4 */
		};
		private static final int[] __MonikeredElement = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _MultiplicityElement =
		{
		    Fragments._MultiplicityElement__OclAny /* 0 */,
		    Fragments._MultiplicityElement__Classifier /* 1 */,
		    Fragments._MultiplicityElement__Visitable /* 2 */,
		    Fragments._MultiplicityElement__Element /* 3 */,
		    Fragments._MultiplicityElement__MonikeredElement /* 4 */,
		    Fragments._MultiplicityElement__MultiplicityElement /* 5 */
		};
		private static final int[] __MultiplicityElement = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Nameable =
		{
		    Fragments._Nameable__OclAny /* 0 */,
		    Fragments._Nameable__Classifier /* 1 */,
		    Fragments._Nameable__Nameable /* 2 */
		};
		private static final int[] __Nameable = { 1,1,1 };
	
		private static final ExecutorFragment[] _NamedElement =
		{
		    Fragments._NamedElement__OclAny /* 0 */,
		    Fragments._NamedElement__Classifier /* 1 */,
		    Fragments._NamedElement__Nameable /* 2 */,
		    Fragments._NamedElement__Visitable /* 2 */,
		    Fragments._NamedElement__Element /* 3 */,
		    Fragments._NamedElement__MonikeredElement /* 4 */,
		    Fragments._NamedElement__NamedElement /* 5 */
		};
		private static final int[] __NamedElement = { 1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _Namespace =
		{
		    Fragments._Namespace__OclAny /* 0 */,
		    Fragments._Namespace__Classifier /* 1 */,
		    Fragments._Namespace__Nameable /* 2 */,
		    Fragments._Namespace__Visitable /* 2 */,
		    Fragments._Namespace__Element /* 3 */,
		    Fragments._Namespace__MonikeredElement /* 4 */,
		    Fragments._Namespace__NamedElement /* 5 */,
		    Fragments._Namespace__Namespace /* 6 */
		};
		private static final int[] __Namespace = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _NavigationCallExp =
		{
		    Fragments._NavigationCallExp__OclAny /* 0 */,
		    Fragments._NavigationCallExp__Classifier /* 1 */,
		    Fragments._NavigationCallExp__Nameable /* 2 */,
		    Fragments._NavigationCallExp__Visitable /* 2 */,
		    Fragments._NavigationCallExp__Element /* 3 */,
		    Fragments._NavigationCallExp__MonikeredElement /* 4 */,
		    Fragments._NavigationCallExp__NamedElement /* 5 */,
		    Fragments._NavigationCallExp__TypedElement /* 6 */,
		    Fragments._NavigationCallExp__OclExpression /* 7 */,
		    Fragments._NavigationCallExp__CallExp /* 8 */,
		    Fragments._NavigationCallExp__FeatureCallExp /* 9 */,
		    Fragments._NavigationCallExp__NavigationCallExp /* 10 */
		};
		private static final int[] __NavigationCallExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _NonOrderedCollection =
		{
		    Fragments._NonOrderedCollection__OclAny /* 0 */,
		    Fragments._NonOrderedCollection__Collection /* 1 */,
		    Fragments._NonOrderedCollection__NonOrderedCollection /* 2 */
		};
		private static final int[] __NonOrderedCollection = { 1,1,1 };
	
		private static final ExecutorFragment[] _NonUniqueCollection =
		{
		    Fragments._NonUniqueCollection__OclAny /* 0 */,
		    Fragments._NonUniqueCollection__Collection /* 1 */,
		    Fragments._NonUniqueCollection__NonUniqueCollection /* 2 */
		};
		private static final int[] __NonUniqueCollection = { 1,1,1 };
	
		private static final ExecutorFragment[] _NullLiteralExp =
		{
		    Fragments._NullLiteralExp__OclAny /* 0 */,
		    Fragments._NullLiteralExp__Classifier /* 1 */,
		    Fragments._NullLiteralExp__Nameable /* 2 */,
		    Fragments._NullLiteralExp__Visitable /* 2 */,
		    Fragments._NullLiteralExp__Element /* 3 */,
		    Fragments._NullLiteralExp__MonikeredElement /* 4 */,
		    Fragments._NullLiteralExp__NamedElement /* 5 */,
		    Fragments._NullLiteralExp__TypedElement /* 6 */,
		    Fragments._NullLiteralExp__OclExpression /* 7 */,
		    Fragments._NullLiteralExp__LiteralExp /* 8 */,
		    Fragments._NullLiteralExp__PrimitiveLiteralExp /* 9 */,
		    Fragments._NullLiteralExp__NullLiteralExp /* 10 */
		};
		private static final int[] __NullLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _NumericLiteralExp =
		{
		    Fragments._NumericLiteralExp__OclAny /* 0 */,
		    Fragments._NumericLiteralExp__Classifier /* 1 */,
		    Fragments._NumericLiteralExp__Nameable /* 2 */,
		    Fragments._NumericLiteralExp__Visitable /* 2 */,
		    Fragments._NumericLiteralExp__Element /* 3 */,
		    Fragments._NumericLiteralExp__MonikeredElement /* 4 */,
		    Fragments._NumericLiteralExp__NamedElement /* 5 */,
		    Fragments._NumericLiteralExp__TypedElement /* 6 */,
		    Fragments._NumericLiteralExp__OclExpression /* 7 */,
		    Fragments._NumericLiteralExp__LiteralExp /* 8 */,
		    Fragments._NumericLiteralExp__PrimitiveLiteralExp /* 9 */,
		    Fragments._NumericLiteralExp__NumericLiteralExp /* 10 */
		};
		private static final int[] __NumericLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Object =
		{
		    Fragments._Object__Object /* 0 */
		};
		private static final int[] __Object = { 1 };
	
		private static final ExecutorFragment[] _OclAny =
		{
		    Fragments._OclAny__OclAny /* 0 */
		};
		private static final int[] __OclAny = { 1 };
	
		private static final ExecutorFragment[] _OclExpression =
		{
		    Fragments._OclExpression__OclAny /* 0 */,
		    Fragments._OclExpression__Classifier /* 1 */,
		    Fragments._OclExpression__Nameable /* 2 */,
		    Fragments._OclExpression__Visitable /* 2 */,
		    Fragments._OclExpression__Element /* 3 */,
		    Fragments._OclExpression__MonikeredElement /* 4 */,
		    Fragments._OclExpression__NamedElement /* 5 */,
		    Fragments._OclExpression__TypedElement /* 6 */,
		    Fragments._OclExpression__OclExpression /* 7 */
		};
		private static final int[] __OclExpression = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _OclInvalid =
		{
		    Fragments._OclInvalid__OclAny /* 0 */,
		    Fragments._OclInvalid__OclVoid /* 1 */,
		    Fragments._OclInvalid__OclInvalid /* 2 */
		};
		private static final int[] __OclInvalid = { 1,1,1 };
	
		private static final ExecutorFragment[] _OclMessage =
		{
		    Fragments._OclMessage__OclAny /* 0 */,
		    Fragments._OclMessage__OclMessage /* 1 */
		};
		private static final int[] __OclMessage = { 1,1 };
	
		private static final ExecutorFragment[] _OclSelf =
		{
		    Fragments._OclSelf__OclAny /* 0 */,
		    Fragments._OclSelf__OclSelf /* 1 */
		};
		private static final int[] __OclSelf = { 1,1 };
	
		private static final ExecutorFragment[] _OclState =
		{
		    Fragments._OclState__OclAny /* 0 */,
		    Fragments._OclState__OclState /* 1 */
		};
		private static final int[] __OclState = { 1,1 };
	
		private static final ExecutorFragment[] _OclTuple =
		{
		    Fragments._OclTuple__OclAny /* 0 */,
		    Fragments._OclTuple__OclTuple /* 1 */
		};
		private static final int[] __OclTuple = { 1,1 };
	
		private static final ExecutorFragment[] _OclVoid =
		{
		    Fragments._OclVoid__OclAny /* 0 */,
		    Fragments._OclVoid__OclVoid /* 1 */
		};
		private static final int[] __OclVoid = { 1,1 };
	
		private static final ExecutorFragment[] _OpaqueExpression =
		{
		    Fragments._OpaqueExpression__OclAny /* 0 */,
		    Fragments._OpaqueExpression__Classifier /* 1 */,
		    Fragments._OpaqueExpression__Visitable /* 2 */,
		    Fragments._OpaqueExpression__Nameable /* 2 */,
		    Fragments._OpaqueExpression__Element /* 3 */,
		    Fragments._OpaqueExpression__MonikeredElement /* 4 */,
		    Fragments._OpaqueExpression__ParameterableElement /* 5 */,
		    Fragments._OpaqueExpression__NamedElement /* 5 */,
		    Fragments._OpaqueExpression__TypedElement /* 6 */,
		    Fragments._OpaqueExpression__ValueSpecification /* 7 */,
		    Fragments._OpaqueExpression__OpaqueExpression /* 8 */
		};
		private static final int[] __OpaqueExpression = { 1,1,2,1,1,2,1,1,1 };
	
		private static final ExecutorFragment[] _Operation =
		{
		    Fragments._Operation__OclAny /* 0 */,
		    Fragments._Operation__Classifier /* 1 */,
		    Fragments._Operation__Nameable /* 2 */,
		    Fragments._Operation__Visitable /* 2 */,
		    Fragments._Operation__Element /* 3 */,
		    Fragments._Operation__MonikeredElement /* 4 */,
		    Fragments._Operation__TemplateableElement /* 5 */,
		    Fragments._Operation__NamedElement /* 5 */,
		    Fragments._Operation__ParameterableElement /* 5 */,
		    Fragments._Operation__MultiplicityElement /* 5 */,
		    Fragments._Operation__TypedElement /* 6 */,
		    Fragments._Operation__Namespace /* 6 */,
		    Fragments._Operation__TypedMultiplicityElement /* 7 */,
		    Fragments._Operation__Feature /* 8 */,
		    Fragments._Operation__Operation /* 9 */
		};
		private static final int[] __Operation = { 1,1,2,1,1,4,2,1,1,1 };
	
		private static final ExecutorFragment[] _OperationCallExp =
		{
		    Fragments._OperationCallExp__OclAny /* 0 */,
		    Fragments._OperationCallExp__Classifier /* 1 */,
		    Fragments._OperationCallExp__Nameable /* 2 */,
		    Fragments._OperationCallExp__Visitable /* 2 */,
		    Fragments._OperationCallExp__Element /* 3 */,
		    Fragments._OperationCallExp__MonikeredElement /* 4 */,
		    Fragments._OperationCallExp__NamedElement /* 5 */,
		    Fragments._OperationCallExp__TypedElement /* 6 */,
		    Fragments._OperationCallExp__OclExpression /* 7 */,
		    Fragments._OperationCallExp__CallExp /* 8 */,
		    Fragments._OperationCallExp__FeatureCallExp /* 9 */,
		    Fragments._OperationCallExp__OperationCallExp /* 10 */
		};
		private static final int[] __OperationCallExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _OperationTemplateParameter =
		{
		    Fragments._OperationTemplateParameter__OclAny /* 0 */,
		    Fragments._OperationTemplateParameter__Classifier /* 1 */,
		    Fragments._OperationTemplateParameter__Visitable /* 2 */,
		    Fragments._OperationTemplateParameter__Element /* 3 */,
		    Fragments._OperationTemplateParameter__TemplateParameter /* 4 */,
		    Fragments._OperationTemplateParameter__OperationTemplateParameter /* 5 */
		};
		private static final int[] __OperationTemplateParameter = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _OrderedCollection =
		{
		    Fragments._OrderedCollection__OclAny /* 0 */,
		    Fragments._OrderedCollection__Collection /* 1 */,
		    Fragments._OrderedCollection__OrderedCollection /* 2 */
		};
		private static final int[] __OrderedCollection = { 1,1,1 };
	
		private static final ExecutorFragment[] _OrderedSet =
		{
		    Fragments._OrderedSet__OclAny /* 0 */,
		    Fragments._OrderedSet__Collection /* 1 */,
		    Fragments._OrderedSet__UniqueCollection /* 2 */,
		    Fragments._OrderedSet__OrderedCollection /* 2 */,
		    Fragments._OrderedSet__OrderedSet /* 3 */
		};
		private static final int[] __OrderedSet = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _OrderedSetType =
		{
		    Fragments._OrderedSetType__OclAny /* 0 */,
		    Fragments._OrderedSetType__Classifier /* 1 */,
		    Fragments._OrderedSetType__Nameable /* 2 */,
		    Fragments._OrderedSetType__Visitable /* 2 */,
		    Fragments._OrderedSetType__Element /* 3 */,
		    Fragments._OrderedSetType__MonikeredElement /* 4 */,
		    Fragments._OrderedSetType__TemplateableElement /* 5 */,
		    Fragments._OrderedSetType__NamedElement /* 5 */,
		    Fragments._OrderedSetType__ParameterableElement /* 5 */,
		    Fragments._OrderedSetType__Type /* 6 */,
		    Fragments._OrderedSetType__Namespace /* 6 */,
		    Fragments._OrderedSetType__Class /* 7 */,
		    Fragments._OrderedSetType__DataType /* 8 */,
		    Fragments._OrderedSetType__CollectionType /* 9 */,
		    Fragments._OrderedSetType__OrderedSetType /* 10 */
		};
		private static final int[] __OrderedSetType = { 1,1,2,1,1,3,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Package =
		{
		    Fragments._Package__OclAny /* 0 */,
		    Fragments._Package__Classifier /* 1 */,
		    Fragments._Package__Visitable /* 2 */,
		    Fragments._Package__Nameable /* 2 */,
		    Fragments._Package__Element /* 3 */,
		    Fragments._Package__MonikeredElement /* 4 */,
		    Fragments._Package__TemplateableElement /* 5 */,
		    Fragments._Package__NamedElement /* 5 */,
		    Fragments._Package__Namespace /* 6 */,
		    Fragments._Package__Package /* 7 */
		};
		private static final int[] __Package = { 1,1,2,1,1,2,1,1 };
	
		private static final ExecutorFragment[] _PackageableElement =
		{
		    Fragments._PackageableElement__OclAny /* 0 */,
		    Fragments._PackageableElement__Classifier /* 1 */,
		    Fragments._PackageableElement__Visitable /* 2 */,
		    Fragments._PackageableElement__Element /* 3 */,
		    Fragments._PackageableElement__MonikeredElement /* 4 */,
		    Fragments._PackageableElement__ParameterableElement /* 5 */,
		    Fragments._PackageableElement__PackageableElement /* 6 */
		};
		private static final int[] __PackageableElement = { 1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Parameter =
		{
		    Fragments._Parameter__OclAny /* 0 */,
		    Fragments._Parameter__Classifier /* 1 */,
		    Fragments._Parameter__Nameable /* 2 */,
		    Fragments._Parameter__Visitable /* 2 */,
		    Fragments._Parameter__Element /* 3 */,
		    Fragments._Parameter__MonikeredElement /* 4 */,
		    Fragments._Parameter__NamedElement /* 5 */,
		    Fragments._Parameter__MultiplicityElement /* 5 */,
		    Fragments._Parameter__TypedElement /* 6 */,
		    Fragments._Parameter__VariableDeclaration /* 7 */,
		    Fragments._Parameter__TypedMultiplicityElement /* 7 */,
		    Fragments._Parameter__Parameter /* 8 */
		};
		private static final int[] __Parameter = { 1,1,2,1,1,2,1,2,1 };
	
		private static final ExecutorFragment[] _ParameterableElement =
		{
		    Fragments._ParameterableElement__OclAny /* 0 */,
		    Fragments._ParameterableElement__Classifier /* 1 */,
		    Fragments._ParameterableElement__Visitable /* 2 */,
		    Fragments._ParameterableElement__Element /* 3 */,
		    Fragments._ParameterableElement__MonikeredElement /* 4 */,
		    Fragments._ParameterableElement__ParameterableElement /* 5 */
		};
		private static final int[] __ParameterableElement = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Pivotable =
		{
		    Fragments._Pivotable__OclAny /* 0 */,
		    Fragments._Pivotable__Classifier /* 1 */,
		    Fragments._Pivotable__Pivotable /* 2 */
		};
		private static final int[] __Pivotable = { 1,1,1 };
	
		private static final ExecutorFragment[] _Precedence =
		{
		    Fragments._Precedence__OclAny /* 0 */,
		    Fragments._Precedence__Classifier /* 1 */,
		    Fragments._Precedence__Nameable /* 2 */,
		    Fragments._Precedence__Visitable /* 2 */,
		    Fragments._Precedence__Element /* 3 */,
		    Fragments._Precedence__MonikeredElement /* 4 */,
		    Fragments._Precedence__NamedElement /* 5 */,
		    Fragments._Precedence__Precedence /* 6 */
		};
		private static final int[] __Precedence = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _PrimitiveLiteralExp =
		{
		    Fragments._PrimitiveLiteralExp__OclAny /* 0 */,
		    Fragments._PrimitiveLiteralExp__Classifier /* 1 */,
		    Fragments._PrimitiveLiteralExp__Nameable /* 2 */,
		    Fragments._PrimitiveLiteralExp__Visitable /* 2 */,
		    Fragments._PrimitiveLiteralExp__Element /* 3 */,
		    Fragments._PrimitiveLiteralExp__MonikeredElement /* 4 */,
		    Fragments._PrimitiveLiteralExp__NamedElement /* 5 */,
		    Fragments._PrimitiveLiteralExp__TypedElement /* 6 */,
		    Fragments._PrimitiveLiteralExp__OclExpression /* 7 */,
		    Fragments._PrimitiveLiteralExp__LiteralExp /* 8 */,
		    Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp /* 9 */
		};
		private static final int[] __PrimitiveLiteralExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _PrimitiveType =
		{
		    Fragments._PrimitiveType__OclAny /* 0 */,
		    Fragments._PrimitiveType__Classifier /* 1 */,
		    Fragments._PrimitiveType__Nameable /* 2 */,
		    Fragments._PrimitiveType__Visitable /* 2 */,
		    Fragments._PrimitiveType__Element /* 3 */,
		    Fragments._PrimitiveType__MonikeredElement /* 4 */,
		    Fragments._PrimitiveType__TemplateableElement /* 5 */,
		    Fragments._PrimitiveType__NamedElement /* 5 */,
		    Fragments._PrimitiveType__ParameterableElement /* 5 */,
		    Fragments._PrimitiveType__Type /* 6 */,
		    Fragments._PrimitiveType__Namespace /* 6 */,
		    Fragments._PrimitiveType__Class /* 7 */,
		    Fragments._PrimitiveType__DataType /* 8 */,
		    Fragments._PrimitiveType__PrimitiveType /* 9 */
		};
		private static final int[] __PrimitiveType = { 1,1,2,1,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _Property =
		{
		    Fragments._Property__OclAny /* 0 */,
		    Fragments._Property__Classifier /* 1 */,
		    Fragments._Property__Nameable /* 2 */,
		    Fragments._Property__Visitable /* 2 */,
		    Fragments._Property__Element /* 3 */,
		    Fragments._Property__MonikeredElement /* 4 */,
		    Fragments._Property__NamedElement /* 5 */,
		    Fragments._Property__ParameterableElement /* 5 */,
		    Fragments._Property__MultiplicityElement /* 5 */,
		    Fragments._Property__TypedElement /* 6 */,
		    Fragments._Property__TypedMultiplicityElement /* 7 */,
		    Fragments._Property__Feature /* 8 */,
		    Fragments._Property__Property /* 9 */
		};
		private static final int[] __Property = { 1,1,2,1,1,3,1,1,1,1 };
	
		private static final ExecutorFragment[] _PropertyCallExp =
		{
		    Fragments._PropertyCallExp__OclAny /* 0 */,
		    Fragments._PropertyCallExp__Classifier /* 1 */,
		    Fragments._PropertyCallExp__Nameable /* 2 */,
		    Fragments._PropertyCallExp__Visitable /* 2 */,
		    Fragments._PropertyCallExp__Element /* 3 */,
		    Fragments._PropertyCallExp__MonikeredElement /* 4 */,
		    Fragments._PropertyCallExp__NamedElement /* 5 */,
		    Fragments._PropertyCallExp__TypedElement /* 6 */,
		    Fragments._PropertyCallExp__OclExpression /* 7 */,
		    Fragments._PropertyCallExp__CallExp /* 8 */,
		    Fragments._PropertyCallExp__FeatureCallExp /* 9 */,
		    Fragments._PropertyCallExp__NavigationCallExp /* 10 */,
		    Fragments._PropertyCallExp__PropertyCallExp /* 11 */
		};
		private static final int[] __PropertyCallExp = { 1,1,2,1,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Real =
		{
		    Fragments._Real__OclAny /* 0 */,
		    Fragments._Real__Real /* 1 */
		};
		private static final int[] __Real = { 1,1 };
	
		private static final ExecutorFragment[] _RealLiteralExp =
		{
		    Fragments._RealLiteralExp__OclAny /* 0 */,
		    Fragments._RealLiteralExp__Classifier /* 1 */,
		    Fragments._RealLiteralExp__Nameable /* 2 */,
		    Fragments._RealLiteralExp__Visitable /* 2 */,
		    Fragments._RealLiteralExp__Element /* 3 */,
		    Fragments._RealLiteralExp__MonikeredElement /* 4 */,
		    Fragments._RealLiteralExp__NamedElement /* 5 */,
		    Fragments._RealLiteralExp__TypedElement /* 6 */,
		    Fragments._RealLiteralExp__OclExpression /* 7 */,
		    Fragments._RealLiteralExp__LiteralExp /* 8 */,
		    Fragments._RealLiteralExp__PrimitiveLiteralExp /* 9 */,
		    Fragments._RealLiteralExp__NumericLiteralExp /* 10 */,
		    Fragments._RealLiteralExp__RealLiteralExp /* 11 */
		};
		private static final int[] __RealLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _SelfType =
		{
		    Fragments._SelfType__OclAny /* 0 */,
		    Fragments._SelfType__Classifier /* 1 */,
		    Fragments._SelfType__Nameable /* 2 */,
		    Fragments._SelfType__Visitable /* 2 */,
		    Fragments._SelfType__Element /* 3 */,
		    Fragments._SelfType__MonikeredElement /* 4 */,
		    Fragments._SelfType__TemplateableElement /* 5 */,
		    Fragments._SelfType__NamedElement /* 5 */,
		    Fragments._SelfType__ParameterableElement /* 5 */,
		    Fragments._SelfType__Type /* 6 */,
		    Fragments._SelfType__Namespace /* 6 */,
		    Fragments._SelfType__Class /* 7 */,
		    Fragments._SelfType__SelfType /* 8 */
		};
		private static final int[] __SelfType = { 1,1,2,1,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _SendSignalAction =
		{
		    Fragments._SendSignalAction__OclAny /* 0 */,
		    Fragments._SendSignalAction__Classifier /* 1 */,
		    Fragments._SendSignalAction__Nameable /* 2 */,
		    Fragments._SendSignalAction__Visitable /* 2 */,
		    Fragments._SendSignalAction__Element /* 3 */,
		    Fragments._SendSignalAction__MonikeredElement /* 4 */,
		    Fragments._SendSignalAction__NamedElement /* 5 */,
		    Fragments._SendSignalAction__SendSignalAction /* 6 */
		};
		private static final int[] __SendSignalAction = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Sequence =
		{
		    Fragments._Sequence__OclAny /* 0 */,
		    Fragments._Sequence__Collection /* 1 */,
		    Fragments._Sequence__OrderedCollection /* 2 */,
		    Fragments._Sequence__NonUniqueCollection /* 2 */,
		    Fragments._Sequence__Sequence /* 3 */
		};
		private static final int[] __Sequence = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _SequenceType =
		{
		    Fragments._SequenceType__OclAny /* 0 */,
		    Fragments._SequenceType__Classifier /* 1 */,
		    Fragments._SequenceType__Nameable /* 2 */,
		    Fragments._SequenceType__Visitable /* 2 */,
		    Fragments._SequenceType__Element /* 3 */,
		    Fragments._SequenceType__MonikeredElement /* 4 */,
		    Fragments._SequenceType__TemplateableElement /* 5 */,
		    Fragments._SequenceType__NamedElement /* 5 */,
		    Fragments._SequenceType__ParameterableElement /* 5 */,
		    Fragments._SequenceType__Type /* 6 */,
		    Fragments._SequenceType__Namespace /* 6 */,
		    Fragments._SequenceType__Class /* 7 */,
		    Fragments._SequenceType__DataType /* 8 */,
		    Fragments._SequenceType__CollectionType /* 9 */,
		    Fragments._SequenceType__SequenceType /* 10 */
		};
		private static final int[] __SequenceType = { 1,1,2,1,1,3,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Set =
		{
		    Fragments._Set__OclAny /* 0 */,
		    Fragments._Set__Collection /* 1 */,
		    Fragments._Set__UniqueCollection /* 2 */,
		    Fragments._Set__NonOrderedCollection /* 2 */,
		    Fragments._Set__Set /* 3 */
		};
		private static final int[] __Set = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _SetType =
		{
		    Fragments._SetType__OclAny /* 0 */,
		    Fragments._SetType__Classifier /* 1 */,
		    Fragments._SetType__Nameable /* 2 */,
		    Fragments._SetType__Visitable /* 2 */,
		    Fragments._SetType__Element /* 3 */,
		    Fragments._SetType__MonikeredElement /* 4 */,
		    Fragments._SetType__TemplateableElement /* 5 */,
		    Fragments._SetType__NamedElement /* 5 */,
		    Fragments._SetType__ParameterableElement /* 5 */,
		    Fragments._SetType__Type /* 6 */,
		    Fragments._SetType__Namespace /* 6 */,
		    Fragments._SetType__Class /* 7 */,
		    Fragments._SetType__DataType /* 8 */,
		    Fragments._SetType__CollectionType /* 9 */,
		    Fragments._SetType__SetType /* 10 */
		};
		private static final int[] __SetType = { 1,1,2,1,1,3,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _Signal =
		{
		    Fragments._Signal__OclAny /* 0 */,
		    Fragments._Signal__Classifier /* 1 */,
		    Fragments._Signal__Nameable /* 2 */,
		    Fragments._Signal__Visitable /* 2 */,
		    Fragments._Signal__Element /* 3 */,
		    Fragments._Signal__MonikeredElement /* 4 */,
		    Fragments._Signal__NamedElement /* 5 */,
		    Fragments._Signal__Signal /* 6 */
		};
		private static final int[] __Signal = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _State =
		{
		    Fragments._State__OclAny /* 0 */,
		    Fragments._State__Classifier /* 1 */,
		    Fragments._State__Nameable /* 2 */,
		    Fragments._State__Visitable /* 2 */,
		    Fragments._State__Element /* 3 */,
		    Fragments._State__MonikeredElement /* 4 */,
		    Fragments._State__NamedElement /* 5 */,
		    Fragments._State__State /* 6 */
		};
		private static final int[] __State = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _StateExp =
		{
		    Fragments._StateExp__OclAny /* 0 */,
		    Fragments._StateExp__Classifier /* 1 */,
		    Fragments._StateExp__Nameable /* 2 */,
		    Fragments._StateExp__Visitable /* 2 */,
		    Fragments._StateExp__Element /* 3 */,
		    Fragments._StateExp__MonikeredElement /* 4 */,
		    Fragments._StateExp__NamedElement /* 5 */,
		    Fragments._StateExp__TypedElement /* 6 */,
		    Fragments._StateExp__OclExpression /* 7 */,
		    Fragments._StateExp__StateExp /* 8 */
		};
		private static final int[] __StateExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _String =
		{
		    Fragments._String__OclAny /* 0 */,
		    Fragments._String__String /* 1 */
		};
		private static final int[] __String = { 1,1 };
	
		private static final ExecutorFragment[] _StringLiteralExp =
		{
		    Fragments._StringLiteralExp__OclAny /* 0 */,
		    Fragments._StringLiteralExp__Classifier /* 1 */,
		    Fragments._StringLiteralExp__Nameable /* 2 */,
		    Fragments._StringLiteralExp__Visitable /* 2 */,
		    Fragments._StringLiteralExp__Element /* 3 */,
		    Fragments._StringLiteralExp__MonikeredElement /* 4 */,
		    Fragments._StringLiteralExp__NamedElement /* 5 */,
		    Fragments._StringLiteralExp__TypedElement /* 6 */,
		    Fragments._StringLiteralExp__OclExpression /* 7 */,
		    Fragments._StringLiteralExp__LiteralExp /* 8 */,
		    Fragments._StringLiteralExp__PrimitiveLiteralExp /* 9 */,
		    Fragments._StringLiteralExp__StringLiteralExp /* 10 */
		};
		private static final int[] __StringLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateBinding =
		{
		    Fragments._TemplateBinding__OclAny /* 0 */,
		    Fragments._TemplateBinding__Classifier /* 1 */,
		    Fragments._TemplateBinding__Visitable /* 2 */,
		    Fragments._TemplateBinding__Element /* 3 */,
		    Fragments._TemplateBinding__TemplateBinding /* 4 */
		};
		private static final int[] __TemplateBinding = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateParameter =
		{
		    Fragments._TemplateParameter__OclAny /* 0 */,
		    Fragments._TemplateParameter__Classifier /* 1 */,
		    Fragments._TemplateParameter__Visitable /* 2 */,
		    Fragments._TemplateParameter__Element /* 3 */,
		    Fragments._TemplateParameter__TemplateParameter /* 4 */
		};
		private static final int[] __TemplateParameter = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateParameterSubstitution =
		{
		    Fragments._TemplateParameterSubstitution__OclAny /* 0 */,
		    Fragments._TemplateParameterSubstitution__Classifier /* 1 */,
		    Fragments._TemplateParameterSubstitution__Visitable /* 2 */,
		    Fragments._TemplateParameterSubstitution__Element /* 3 */,
		    Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution /* 4 */
		};
		private static final int[] __TemplateParameterSubstitution = { 1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateParameterType =
		{
		    Fragments._TemplateParameterType__OclAny /* 0 */,
		    Fragments._TemplateParameterType__Classifier /* 1 */,
		    Fragments._TemplateParameterType__Visitable /* 2 */,
		    Fragments._TemplateParameterType__Nameable /* 2 */,
		    Fragments._TemplateParameterType__Element /* 3 */,
		    Fragments._TemplateParameterType__MonikeredElement /* 4 */,
		    Fragments._TemplateParameterType__ParameterableElement /* 5 */,
		    Fragments._TemplateParameterType__TemplateableElement /* 5 */,
		    Fragments._TemplateParameterType__NamedElement /* 5 */,
		    Fragments._TemplateParameterType__Type /* 6 */,
		    Fragments._TemplateParameterType__TemplateParameterType /* 7 */
		};
		private static final int[] __TemplateParameterType = { 1,1,2,1,1,3,1,1 };
	
		private static final ExecutorFragment[] _TemplateSignature =
		{
		    Fragments._TemplateSignature__OclAny /* 0 */,
		    Fragments._TemplateSignature__Classifier /* 1 */,
		    Fragments._TemplateSignature__Visitable /* 2 */,
		    Fragments._TemplateSignature__Element /* 3 */,
		    Fragments._TemplateSignature__MonikeredElement /* 4 */,
		    Fragments._TemplateSignature__TemplateSignature /* 5 */
		};
		private static final int[] __TemplateSignature = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TemplateableElement =
		{
		    Fragments._TemplateableElement__OclAny /* 0 */,
		    Fragments._TemplateableElement__Classifier /* 1 */,
		    Fragments._TemplateableElement__Visitable /* 2 */,
		    Fragments._TemplateableElement__Element /* 3 */,
		    Fragments._TemplateableElement__MonikeredElement /* 4 */,
		    Fragments._TemplateableElement__TemplateableElement /* 5 */
		};
		private static final int[] __TemplateableElement = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Throwable =
		{
		    Fragments._Throwable__Throwable /* 0 */
		};
		private static final int[] __Throwable = { 1 };
	
		private static final ExecutorFragment[] _Tuple =
		{
		    Fragments._Tuple__OclAny /* 0 */,
		    Fragments._Tuple__Tuple /* 1 */
		};
		private static final int[] __Tuple = { 1,1 };
	
		private static final ExecutorFragment[] _TupleLiteralExp =
		{
		    Fragments._TupleLiteralExp__OclAny /* 0 */,
		    Fragments._TupleLiteralExp__Classifier /* 1 */,
		    Fragments._TupleLiteralExp__Nameable /* 2 */,
		    Fragments._TupleLiteralExp__Visitable /* 2 */,
		    Fragments._TupleLiteralExp__Element /* 3 */,
		    Fragments._TupleLiteralExp__MonikeredElement /* 4 */,
		    Fragments._TupleLiteralExp__NamedElement /* 5 */,
		    Fragments._TupleLiteralExp__TypedElement /* 6 */,
		    Fragments._TupleLiteralExp__OclExpression /* 7 */,
		    Fragments._TupleLiteralExp__LiteralExp /* 8 */,
		    Fragments._TupleLiteralExp__TupleLiteralExp /* 9 */
		};
		private static final int[] __TupleLiteralExp = { 1,1,2,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TupleLiteralPart =
		{
		    Fragments._TupleLiteralPart__OclAny /* 0 */,
		    Fragments._TupleLiteralPart__Classifier /* 1 */,
		    Fragments._TupleLiteralPart__Nameable /* 2 */,
		    Fragments._TupleLiteralPart__Visitable /* 2 */,
		    Fragments._TupleLiteralPart__Element /* 3 */,
		    Fragments._TupleLiteralPart__MonikeredElement /* 4 */,
		    Fragments._TupleLiteralPart__NamedElement /* 5 */,
		    Fragments._TupleLiteralPart__TypedElement /* 6 */,
		    Fragments._TupleLiteralPart__VariableDeclaration /* 7 */,
		    Fragments._TupleLiteralPart__TupleLiteralPart /* 8 */
		};
		private static final int[] __TupleLiteralPart = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TupleType =
		{
		    Fragments._TupleType__OclAny /* 0 */,
		    Fragments._TupleType__Classifier /* 1 */,
		    Fragments._TupleType__Nameable /* 2 */,
		    Fragments._TupleType__Visitable /* 2 */,
		    Fragments._TupleType__Element /* 3 */,
		    Fragments._TupleType__MonikeredElement /* 4 */,
		    Fragments._TupleType__TemplateableElement /* 5 */,
		    Fragments._TupleType__NamedElement /* 5 */,
		    Fragments._TupleType__ParameterableElement /* 5 */,
		    Fragments._TupleType__Type /* 6 */,
		    Fragments._TupleType__Namespace /* 6 */,
		    Fragments._TupleType__Class /* 7 */,
		    Fragments._TupleType__DataType /* 8 */,
		    Fragments._TupleType__TupleType /* 9 */
		};
		private static final int[] __TupleType = { 1,1,2,1,1,3,2,1,1,1 };
	
		private static final ExecutorFragment[] _Type =
		{
		    Fragments._Type__OclAny /* 0 */,
		    Fragments._Type__Classifier /* 1 */,
		    Fragments._Type__Visitable /* 2 */,
		    Fragments._Type__Nameable /* 2 */,
		    Fragments._Type__Element /* 3 */,
		    Fragments._Type__MonikeredElement /* 4 */,
		    Fragments._Type__ParameterableElement /* 5 */,
		    Fragments._Type__TemplateableElement /* 5 */,
		    Fragments._Type__NamedElement /* 5 */,
		    Fragments._Type__Type /* 6 */
		};
		private static final int[] __Type = { 1,1,2,1,1,3,1 };
	
		private static final ExecutorFragment[] _TypeExp =
		{
		    Fragments._TypeExp__OclAny /* 0 */,
		    Fragments._TypeExp__Classifier /* 1 */,
		    Fragments._TypeExp__Nameable /* 2 */,
		    Fragments._TypeExp__Visitable /* 2 */,
		    Fragments._TypeExp__Element /* 3 */,
		    Fragments._TypeExp__MonikeredElement /* 4 */,
		    Fragments._TypeExp__NamedElement /* 5 */,
		    Fragments._TypeExp__TypedElement /* 6 */,
		    Fragments._TypeExp__OclExpression /* 7 */,
		    Fragments._TypeExp__TypeExp /* 8 */
		};
		private static final int[] __TypeExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TypeTemplateParameter =
		{
		    Fragments._TypeTemplateParameter__OclAny /* 0 */,
		    Fragments._TypeTemplateParameter__Classifier /* 1 */,
		    Fragments._TypeTemplateParameter__Visitable /* 2 */,
		    Fragments._TypeTemplateParameter__Element /* 3 */,
		    Fragments._TypeTemplateParameter__TemplateParameter /* 4 */,
		    Fragments._TypeTemplateParameter__TypeTemplateParameter /* 5 */
		};
		private static final int[] __TypeTemplateParameter = { 1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _TypedElement =
		{
		    Fragments._TypedElement__OclAny /* 0 */,
		    Fragments._TypedElement__Classifier /* 1 */,
		    Fragments._TypedElement__Nameable /* 2 */,
		    Fragments._TypedElement__Visitable /* 2 */,
		    Fragments._TypedElement__Element /* 3 */,
		    Fragments._TypedElement__MonikeredElement /* 4 */,
		    Fragments._TypedElement__NamedElement /* 5 */,
		    Fragments._TypedElement__TypedElement /* 6 */
		};
		private static final int[] __TypedElement = { 1,1,2,1,1,1,1 };
	
		private static final ExecutorFragment[] _TypedMultiplicityElement =
		{
		    Fragments._TypedMultiplicityElement__OclAny /* 0 */,
		    Fragments._TypedMultiplicityElement__Classifier /* 1 */,
		    Fragments._TypedMultiplicityElement__Nameable /* 2 */,
		    Fragments._TypedMultiplicityElement__Visitable /* 2 */,
		    Fragments._TypedMultiplicityElement__Element /* 3 */,
		    Fragments._TypedMultiplicityElement__MonikeredElement /* 4 */,
		    Fragments._TypedMultiplicityElement__NamedElement /* 5 */,
		    Fragments._TypedMultiplicityElement__MultiplicityElement /* 5 */,
		    Fragments._TypedMultiplicityElement__TypedElement /* 6 */,
		    Fragments._TypedMultiplicityElement__TypedMultiplicityElement /* 7 */
		};
		private static final int[] __TypedMultiplicityElement = { 1,1,2,1,1,2,1,1 };
	
		private static final ExecutorFragment[] _UniqueCollection =
		{
		    Fragments._UniqueCollection__OclAny /* 0 */,
		    Fragments._UniqueCollection__Collection /* 1 */,
		    Fragments._UniqueCollection__UniqueCollection /* 2 */
		};
		private static final int[] __UniqueCollection = { 1,1,1 };
	
		private static final ExecutorFragment[] _UnlimitedNatural =
		{
		    Fragments._UnlimitedNatural__OclAny /* 0 */,
		    Fragments._UnlimitedNatural__Real /* 1 */,
		    Fragments._UnlimitedNatural__Integer /* 2 */,
		    Fragments._UnlimitedNatural__UnlimitedNatural /* 3 */
		};
		private static final int[] __UnlimitedNatural = { 1,1,1,1 };
	
		private static final ExecutorFragment[] _UnlimitedNaturalLiteralExp =
		{
		    Fragments._UnlimitedNaturalLiteralExp__OclAny /* 0 */,
		    Fragments._UnlimitedNaturalLiteralExp__Classifier /* 1 */,
		    Fragments._UnlimitedNaturalLiteralExp__Nameable /* 2 */,
		    Fragments._UnlimitedNaturalLiteralExp__Visitable /* 2 */,
		    Fragments._UnlimitedNaturalLiteralExp__Element /* 3 */,
		    Fragments._UnlimitedNaturalLiteralExp__MonikeredElement /* 4 */,
		    Fragments._UnlimitedNaturalLiteralExp__NamedElement /* 5 */,
		    Fragments._UnlimitedNaturalLiteralExp__TypedElement /* 6 */,
		    Fragments._UnlimitedNaturalLiteralExp__OclExpression /* 7 */,
		    Fragments._UnlimitedNaturalLiteralExp__LiteralExp /* 8 */,
		    Fragments._UnlimitedNaturalLiteralExp__PrimitiveLiteralExp /* 9 */,
		    Fragments._UnlimitedNaturalLiteralExp__NumericLiteralExp /* 10 */,
		    Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp /* 11 */
		};
		private static final int[] __UnlimitedNaturalLiteralExp = { 1,1,2,1,1,1,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _UnspecifiedType =
		{
		    Fragments._UnspecifiedType__OclAny /* 0 */,
		    Fragments._UnspecifiedType__Classifier /* 1 */,
		    Fragments._UnspecifiedType__Nameable /* 2 */,
		    Fragments._UnspecifiedType__Visitable /* 2 */,
		    Fragments._UnspecifiedType__Element /* 3 */,
		    Fragments._UnspecifiedType__MonikeredElement /* 4 */,
		    Fragments._UnspecifiedType__TemplateableElement /* 5 */,
		    Fragments._UnspecifiedType__NamedElement /* 5 */,
		    Fragments._UnspecifiedType__ParameterableElement /* 5 */,
		    Fragments._UnspecifiedType__Type /* 6 */,
		    Fragments._UnspecifiedType__Namespace /* 6 */,
		    Fragments._UnspecifiedType__Class /* 7 */,
		    Fragments._UnspecifiedType__UnspecifiedType /* 8 */
		};
		private static final int[] __UnspecifiedType = { 1,1,2,1,1,3,2,1,1 };
	
		private static final ExecutorFragment[] _UnspecifiedValueExp =
		{
		    Fragments._UnspecifiedValueExp__OclAny /* 0 */,
		    Fragments._UnspecifiedValueExp__Classifier /* 1 */,
		    Fragments._UnspecifiedValueExp__Nameable /* 2 */,
		    Fragments._UnspecifiedValueExp__Visitable /* 2 */,
		    Fragments._UnspecifiedValueExp__Element /* 3 */,
		    Fragments._UnspecifiedValueExp__MonikeredElement /* 4 */,
		    Fragments._UnspecifiedValueExp__NamedElement /* 5 */,
		    Fragments._UnspecifiedValueExp__TypedElement /* 6 */,
		    Fragments._UnspecifiedValueExp__OclExpression /* 7 */,
		    Fragments._UnspecifiedValueExp__UnspecifiedValueExp /* 8 */
		};
		private static final int[] __UnspecifiedValueExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _ValueSpecification =
		{
		    Fragments._ValueSpecification__OclAny /* 0 */,
		    Fragments._ValueSpecification__Classifier /* 1 */,
		    Fragments._ValueSpecification__Visitable /* 2 */,
		    Fragments._ValueSpecification__Nameable /* 2 */,
		    Fragments._ValueSpecification__Element /* 3 */,
		    Fragments._ValueSpecification__MonikeredElement /* 4 */,
		    Fragments._ValueSpecification__ParameterableElement /* 5 */,
		    Fragments._ValueSpecification__NamedElement /* 5 */,
		    Fragments._ValueSpecification__TypedElement /* 6 */,
		    Fragments._ValueSpecification__ValueSpecification /* 7 */
		};
		private static final int[] __ValueSpecification = { 1,1,2,1,1,2,1,1 };
	
		private static final ExecutorFragment[] _Variable =
		{
		    Fragments._Variable__OclAny /* 0 */,
		    Fragments._Variable__Classifier /* 1 */,
		    Fragments._Variable__Nameable /* 2 */,
		    Fragments._Variable__Visitable /* 2 */,
		    Fragments._Variable__Element /* 3 */,
		    Fragments._Variable__MonikeredElement /* 4 */,
		    Fragments._Variable__NamedElement /* 5 */,
		    Fragments._Variable__TypedElement /* 6 */,
		    Fragments._Variable__VariableDeclaration /* 7 */,
		    Fragments._Variable__Variable /* 8 */
		};
		private static final int[] __Variable = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _VariableDeclaration =
		{
		    Fragments._VariableDeclaration__OclAny /* 0 */,
		    Fragments._VariableDeclaration__Classifier /* 1 */,
		    Fragments._VariableDeclaration__Nameable /* 2 */,
		    Fragments._VariableDeclaration__Visitable /* 2 */,
		    Fragments._VariableDeclaration__Element /* 3 */,
		    Fragments._VariableDeclaration__MonikeredElement /* 4 */,
		    Fragments._VariableDeclaration__NamedElement /* 5 */,
		    Fragments._VariableDeclaration__TypedElement /* 6 */,
		    Fragments._VariableDeclaration__VariableDeclaration /* 7 */
		};
		private static final int[] __VariableDeclaration = { 1,1,2,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _VariableExp =
		{
		    Fragments._VariableExp__OclAny /* 0 */,
		    Fragments._VariableExp__Classifier /* 1 */,
		    Fragments._VariableExp__Nameable /* 2 */,
		    Fragments._VariableExp__Visitable /* 2 */,
		    Fragments._VariableExp__Element /* 3 */,
		    Fragments._VariableExp__MonikeredElement /* 4 */,
		    Fragments._VariableExp__NamedElement /* 5 */,
		    Fragments._VariableExp__TypedElement /* 6 */,
		    Fragments._VariableExp__OclExpression /* 7 */,
		    Fragments._VariableExp__VariableExp /* 8 */
		};
		private static final int[] __VariableExp = { 1,1,2,1,1,1,1,1,1 };
	
		private static final ExecutorFragment[] _Visitable =
		{
		    Fragments._Visitable__OclAny /* 0 */,
		    Fragments._Visitable__Classifier /* 1 */,
		    Fragments._Visitable__Visitable /* 2 */
		};
		private static final int[] __Visitable = { 1,1,1 };
	
		private static final ExecutorFragment[] _Visitor =
		{
		    Fragments._Visitor__OclAny /* 0 */,
		    Fragments._Visitor__Classifier /* 1 */,
		    Fragments._Visitor__Visitor /* 2 */
		};
		private static final int[] __Visitor = { 1,1,1 };
	
		private static final ExecutorFragment[] _VoidType =
		{
		    Fragments._VoidType__OclAny /* 0 */,
		    Fragments._VoidType__Classifier /* 1 */,
		    Fragments._VoidType__Nameable /* 2 */,
		    Fragments._VoidType__Visitable /* 2 */,
		    Fragments._VoidType__Element /* 3 */,
		    Fragments._VoidType__MonikeredElement /* 4 */,
		    Fragments._VoidType__TemplateableElement /* 5 */,
		    Fragments._VoidType__NamedElement /* 5 */,
		    Fragments._VoidType__ParameterableElement /* 5 */,
		    Fragments._VoidType__Type /* 6 */,
		    Fragments._VoidType__Namespace /* 6 */,
		    Fragments._VoidType__Class /* 7 */,
		    Fragments._VoidType__VoidType /* 8 */
		};
		private static final int[] __VoidType = { 1,1,2,1,1,3,2,1,1 };
	
		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Classes._Annotation.initFragments(_Annotation, __Annotation);
			Classes._AnyType.initFragments(_AnyType, __AnyType);
			Classes._AssociationClass.initFragments(_AssociationClass, __AssociationClass);
			Classes._AssociationClassCallExp.initFragments(_AssociationClassCallExp, __AssociationClassCallExp);
			Classes._AssociativityKind.initFragments(_AssociativityKind, __AssociativityKind);
			Classes._Bag.initFragments(_Bag, __Bag);
			Classes._BagType.initFragments(_BagType, __BagType);
			Classes._Boolean.initFragments(_Boolean, __Boolean);
			Classes._BooleanLiteralExp.initFragments(_BooleanLiteralExp, __BooleanLiteralExp);
			Classes._CallExp.initFragments(_CallExp, __CallExp);
			Classes._CallOperationAction.initFragments(_CallOperationAction, __CallOperationAction);
			Classes._Class.initFragments(_Class, __Class);
			Classes._Classifier.initFragments(_Classifier, __Classifier);
			Classes._ClassifierType.initFragments(_ClassifierType, __ClassifierType);
			Classes._Collection.initFragments(_Collection, __Collection);
			Classes._CollectionItem.initFragments(_CollectionItem, __CollectionItem);
			Classes._CollectionKind.initFragments(_CollectionKind, __CollectionKind);
			Classes._CollectionLiteralExp.initFragments(_CollectionLiteralExp, __CollectionLiteralExp);
			Classes._CollectionLiteralPart.initFragments(_CollectionLiteralPart, __CollectionLiteralPart);
			Classes._CollectionRange.initFragments(_CollectionRange, __CollectionRange);
			Classes._CollectionType.initFragments(_CollectionType, __CollectionType);
			Classes._Comment.initFragments(_Comment, __Comment);
			Classes._Constraint.initFragments(_Constraint, __Constraint);
			Classes._DataType.initFragments(_DataType, __DataType);
			Classes._Detail.initFragments(_Detail, __Detail);
			Classes._Element.initFragments(_Element, __Element);
			Classes._EnumLiteralExp.initFragments(_EnumLiteralExp, __EnumLiteralExp);
			Classes._Enumeration.initFragments(_Enumeration, __Enumeration);
			Classes._EnumerationLiteral.initFragments(_EnumerationLiteral, __EnumerationLiteral);
			Classes._ExpressionInOcl.initFragments(_ExpressionInOcl, __ExpressionInOcl);
			Classes._Feature.initFragments(_Feature, __Feature);
			Classes._FeatureCallExp.initFragments(_FeatureCallExp, __FeatureCallExp);
			Classes._IfExp.initFragments(_IfExp, __IfExp);
			Classes._Int.initFragments(_Int, __Int);
			Classes._Integer.initFragments(_Integer, __Integer);
			Classes._IntegerLiteralExp.initFragments(_IntegerLiteralExp, __IntegerLiteralExp);
			Classes._InvalidLiteralExp.initFragments(_InvalidLiteralExp, __InvalidLiteralExp);
			Classes._InvalidType.initFragments(_InvalidType, __InvalidType);
			Classes._IterateExp.initFragments(_IterateExp, __IterateExp);
			Classes._Iteration.initFragments(_Iteration, __Iteration);
			Classes._IteratorExp.initFragments(_IteratorExp, __IteratorExp);
			Classes._LambdaType.initFragments(_LambdaType, __LambdaType);
			Classes._LetExp.initFragments(_LetExp, __LetExp);
			Classes._Library.initFragments(_Library, __Library);
			Classes._LibraryFeature.initFragments(_LibraryFeature, __LibraryFeature);
			Classes._LiteralExp.initFragments(_LiteralExp, __LiteralExp);
			Classes._LoopExp.initFragments(_LoopExp, __LoopExp);
			Classes._MessageExp.initFragments(_MessageExp, __MessageExp);
			Classes._MessageType.initFragments(_MessageType, __MessageType);
			Classes._MonikeredElement.initFragments(_MonikeredElement, __MonikeredElement);
			Classes._MultiplicityElement.initFragments(_MultiplicityElement, __MultiplicityElement);
			Classes._Nameable.initFragments(_Nameable, __Nameable);
			Classes._NamedElement.initFragments(_NamedElement, __NamedElement);
			Classes._Namespace.initFragments(_Namespace, __Namespace);
			Classes._NavigationCallExp.initFragments(_NavigationCallExp, __NavigationCallExp);
			Classes._NonOrderedCollection.initFragments(_NonOrderedCollection, __NonOrderedCollection);
			Classes._NonUniqueCollection.initFragments(_NonUniqueCollection, __NonUniqueCollection);
			Classes._NullLiteralExp.initFragments(_NullLiteralExp, __NullLiteralExp);
			Classes._NumericLiteralExp.initFragments(_NumericLiteralExp, __NumericLiteralExp);
			Classes._Object.initFragments(_Object, __Object);
			Classes._OclAny.initFragments(_OclAny, __OclAny);
			Classes._OclExpression.initFragments(_OclExpression, __OclExpression);
			Classes._OclInvalid.initFragments(_OclInvalid, __OclInvalid);
			Classes._OclMessage.initFragments(_OclMessage, __OclMessage);
			Classes._OclSelf.initFragments(_OclSelf, __OclSelf);
			Classes._OclState.initFragments(_OclState, __OclState);
			Classes._OclTuple.initFragments(_OclTuple, __OclTuple);
			Classes._OclVoid.initFragments(_OclVoid, __OclVoid);
			Classes._OpaqueExpression.initFragments(_OpaqueExpression, __OpaqueExpression);
			Classes._Operation.initFragments(_Operation, __Operation);
			Classes._OperationCallExp.initFragments(_OperationCallExp, __OperationCallExp);
			Classes._OperationTemplateParameter.initFragments(_OperationTemplateParameter, __OperationTemplateParameter);
			Classes._OrderedCollection.initFragments(_OrderedCollection, __OrderedCollection);
			Classes._OrderedSet.initFragments(_OrderedSet, __OrderedSet);
			Classes._OrderedSetType.initFragments(_OrderedSetType, __OrderedSetType);
			Classes._Package.initFragments(_Package, __Package);
			Classes._PackageableElement.initFragments(_PackageableElement, __PackageableElement);
			Classes._Parameter.initFragments(_Parameter, __Parameter);
			Classes._ParameterableElement.initFragments(_ParameterableElement, __ParameterableElement);
			Classes._Pivotable.initFragments(_Pivotable, __Pivotable);
			Classes._Precedence.initFragments(_Precedence, __Precedence);
			Classes._PrimitiveLiteralExp.initFragments(_PrimitiveLiteralExp, __PrimitiveLiteralExp);
			Classes._PrimitiveType.initFragments(_PrimitiveType, __PrimitiveType);
			Classes._Property.initFragments(_Property, __Property);
			Classes._PropertyCallExp.initFragments(_PropertyCallExp, __PropertyCallExp);
			Classes._Real.initFragments(_Real, __Real);
			Classes._RealLiteralExp.initFragments(_RealLiteralExp, __RealLiteralExp);
			Classes._SelfType.initFragments(_SelfType, __SelfType);
			Classes._SendSignalAction.initFragments(_SendSignalAction, __SendSignalAction);
			Classes._Sequence.initFragments(_Sequence, __Sequence);
			Classes._SequenceType.initFragments(_SequenceType, __SequenceType);
			Classes._Set.initFragments(_Set, __Set);
			Classes._SetType.initFragments(_SetType, __SetType);
			Classes._Signal.initFragments(_Signal, __Signal);
			Classes._State.initFragments(_State, __State);
			Classes._StateExp.initFragments(_StateExp, __StateExp);
			Classes._String.initFragments(_String, __String);
			Classes._StringLiteralExp.initFragments(_StringLiteralExp, __StringLiteralExp);
			Classes._TemplateBinding.initFragments(_TemplateBinding, __TemplateBinding);
			Classes._TemplateParameter.initFragments(_TemplateParameter, __TemplateParameter);
			Classes._TemplateParameterSubstitution.initFragments(_TemplateParameterSubstitution, __TemplateParameterSubstitution);
			Classes._TemplateParameterType.initFragments(_TemplateParameterType, __TemplateParameterType);
			Classes._TemplateSignature.initFragments(_TemplateSignature, __TemplateSignature);
			Classes._TemplateableElement.initFragments(_TemplateableElement, __TemplateableElement);
			Classes._Throwable.initFragments(_Throwable, __Throwable);
			Classes._Tuple.initFragments(_Tuple, __Tuple);
			Classes._TupleLiteralExp.initFragments(_TupleLiteralExp, __TupleLiteralExp);
			Classes._TupleLiteralPart.initFragments(_TupleLiteralPart, __TupleLiteralPart);
			Classes._TupleType.initFragments(_TupleType, __TupleType);
			Classes._Type.initFragments(_Type, __Type);
			Classes._TypeExp.initFragments(_TypeExp, __TypeExp);
			Classes._TypeTemplateParameter.initFragments(_TypeTemplateParameter, __TypeTemplateParameter);
			Classes._TypedElement.initFragments(_TypedElement, __TypedElement);
			Classes._TypedMultiplicityElement.initFragments(_TypedMultiplicityElement, __TypedMultiplicityElement);
			Classes._UniqueCollection.initFragments(_UniqueCollection, __UniqueCollection);
			Classes._UnlimitedNatural.initFragments(_UnlimitedNatural, __UnlimitedNatural);
			Classes._UnlimitedNaturalLiteralExp.initFragments(_UnlimitedNaturalLiteralExp, __UnlimitedNaturalLiteralExp);
			Classes._UnspecifiedType.initFragments(_UnspecifiedType, __UnspecifiedType);
			Classes._UnspecifiedValueExp.initFragments(_UnspecifiedValueExp, __UnspecifiedValueExp);
			Classes._ValueSpecification.initFragments(_ValueSpecification, __ValueSpecification);
			Classes._Variable.initFragments(_Variable, __Variable);
			Classes._VariableDeclaration.initFragments(_VariableDeclaration, __VariableDeclaration);
			Classes._VariableExp.initFragments(_VariableExp, __VariableExp);
			Classes._Visitable.initFragments(_Visitable, __Visitable);
			Classes._Visitor.initFragments(_Visitor, __Visitor);
			Classes._VoidType.initFragments(_VoidType, __VoidType);
		}
	
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each class.
	 */
	public static class FragmentOperations {
		private static final ExecutorOperation[] _Annotation__Annotation = {};
		private static final ExecutorOperation[] _Annotation__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Annotation__Element = {};
		private static final ExecutorOperation[] _Annotation__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Annotation__Nameable = {};
		private static final ExecutorOperation[] _Annotation__NamedElement = {};
		private static final ExecutorOperation[] _Annotation__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Annotation__Visitable = {};
	
		private static final ExecutorOperation[] _AnyType__AnyType = {};
		private static final ExecutorOperation[] _AnyType__Class = {};
		private static final ExecutorOperation[] _AnyType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _AnyType__Element = {};
		private static final ExecutorOperation[] _AnyType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _AnyType__Nameable = {};
		private static final ExecutorOperation[] _AnyType__NamedElement = {};
		private static final ExecutorOperation[] _AnyType__Namespace = {};
		private static final ExecutorOperation[] _AnyType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _AnyType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _AnyType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _AnyType__Type = {};
		private static final ExecutorOperation[] _AnyType__Visitable = {};
	
		private static final ExecutorOperation[] _AssociationClass__AssociationClass = {};
		private static final ExecutorOperation[] _AssociationClass__Class = {};
		private static final ExecutorOperation[] _AssociationClass__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _AssociationClass__Element = {};
		private static final ExecutorOperation[] _AssociationClass__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _AssociationClass__Nameable = {};
		private static final ExecutorOperation[] _AssociationClass__NamedElement = {};
		private static final ExecutorOperation[] _AssociationClass__Namespace = {};
		private static final ExecutorOperation[] _AssociationClass__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _AssociationClass__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _AssociationClass__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _AssociationClass__Type = {};
		private static final ExecutorOperation[] _AssociationClass__Visitable = {};
	
		private static final ExecutorOperation[] _AssociationClassCallExp__AssociationClassCallExp = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__CallExp = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _AssociationClassCallExp__Element = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _AssociationClassCallExp__Nameable = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__NamedElement = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__NavigationCallExp = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _AssociationClassCallExp__OclExpression = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__TypedElement = {};
		private static final ExecutorOperation[] _AssociationClassCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _AssociativityKind__AssociativityKind = {};
	
		private static final ExecutorOperation[] _Bag__Bag = {
		    PivotTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Bag__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Bag__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Bag__including /* including(Bag(T)::T) */,
		    PivotTables.Operations._Bag__reject /* reject(Bag(T)::T|Lambda Bag(T)::T() : Boolean) */,
		    PivotTables.Operations._Bag__select /* select(Bag(T)::T|Lambda Bag(T)::T() : Boolean) */
		};
		private static final ExecutorOperation[] _Bag__Collection = {
		    PivotTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Bag__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Bag__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Bag__NonOrderedCollection = {
		    PivotTables.Operations._NonOrderedCollection__closure /* closure(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : Set(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    PivotTables.Operations._NonOrderedCollection__collect /* collect<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    PivotTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__1_intersection /* intersection(Set(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__0_union /* union(Bag(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__1_union /* union(Set(NonOrderedCollection(T)::T)) */
		};
		private static final ExecutorOperation[] _Bag__NonUniqueCollection = {
		    PivotTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(NonUniqueCollection(T)::T|Lambda NonUniqueCollection(T)::T() : OclAny) */
		};
		private static final ExecutorOperation[] _Bag__OclAny = {
		    PivotTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _BagType__BagType = {};
		private static final ExecutorOperation[] _BagType__Class = {};
		private static final ExecutorOperation[] _BagType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _BagType__CollectionType = {};
		private static final ExecutorOperation[] _BagType__DataType = {};
		private static final ExecutorOperation[] _BagType__Element = {};
		private static final ExecutorOperation[] _BagType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _BagType__Nameable = {};
		private static final ExecutorOperation[] _BagType__NamedElement = {};
		private static final ExecutorOperation[] _BagType__Namespace = {};
		private static final ExecutorOperation[] _BagType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _BagType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _BagType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _BagType__Type = {};
		private static final ExecutorOperation[] _BagType__Visitable = {};
	
		private static final ExecutorOperation[] _Boolean__Boolean = {
		    PivotTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Boolean__allInstances /* allInstances() */,
		    PivotTables.Operations._Boolean__and /* _'and'(Boolean) */,
		    PivotTables.Operations._Boolean__implies /* _'implies'(Boolean) */,
		    PivotTables.Operations._Boolean__not /* _'not'() */,
		    PivotTables.Operations._Boolean__or /* _'or'(Boolean) */,
		    PivotTables.Operations._Boolean__toString /* toString() */,
		    PivotTables.Operations._Boolean__xor /* _'xor'(Boolean) */
		};
		private static final ExecutorOperation[] _Boolean__OclAny = {
		    PivotTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _BooleanLiteralExp__BooleanLiteralExp = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _BooleanLiteralExp__Element = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _BooleanLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _BooleanLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _BooleanLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _CallExp__CallExp = {};
		private static final ExecutorOperation[] _CallExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _CallExp__Element = {};
		private static final ExecutorOperation[] _CallExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _CallExp__Nameable = {};
		private static final ExecutorOperation[] _CallExp__NamedElement = {};
		private static final ExecutorOperation[] _CallExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CallExp__OclExpression = {};
		private static final ExecutorOperation[] _CallExp__TypedElement = {};
		private static final ExecutorOperation[] _CallExp__Visitable = {};
	
		private static final ExecutorOperation[] _CallOperationAction__CallOperationAction = {};
		private static final ExecutorOperation[] _CallOperationAction__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _CallOperationAction__Element = {};
		private static final ExecutorOperation[] _CallOperationAction__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _CallOperationAction__Nameable = {};
		private static final ExecutorOperation[] _CallOperationAction__NamedElement = {};
		private static final ExecutorOperation[] _CallOperationAction__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CallOperationAction__Visitable = {};
	
		private static final ExecutorOperation[] _Class__Class = {};
		private static final ExecutorOperation[] _Class__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Class__Element = {};
		private static final ExecutorOperation[] _Class__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Class__Nameable = {};
		private static final ExecutorOperation[] _Class__NamedElement = {};
		private static final ExecutorOperation[] _Class__Namespace = {};
		private static final ExecutorOperation[] _Class__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Class__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Class__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Class__Type = {};
		private static final ExecutorOperation[] _Class__Visitable = {};
	
		private static final ExecutorOperation[] _Classifier__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Classifier__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _ClassifierType__ClassifierType = {};
		private static final ExecutorOperation[] _ClassifierType__Class = {};
		private static final ExecutorOperation[] _ClassifierType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _ClassifierType__DataType = {};
		private static final ExecutorOperation[] _ClassifierType__Element = {};
		private static final ExecutorOperation[] _ClassifierType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _ClassifierType__Nameable = {};
		private static final ExecutorOperation[] _ClassifierType__NamedElement = {};
		private static final ExecutorOperation[] _ClassifierType__Namespace = {};
		private static final ExecutorOperation[] _ClassifierType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ClassifierType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _ClassifierType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _ClassifierType__Type = {};
		private static final ExecutorOperation[] _ClassifierType__Visitable = {};
	
		private static final ExecutorOperation[] _Collection__Collection = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Collection__OclAny = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _CollectionItem__CollectionItem = {};
		private static final ExecutorOperation[] _CollectionItem__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _CollectionItem__CollectionLiteralPart = {};
		private static final ExecutorOperation[] _CollectionItem__Element = {};
		private static final ExecutorOperation[] _CollectionItem__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _CollectionItem__Nameable = {};
		private static final ExecutorOperation[] _CollectionItem__NamedElement = {};
		private static final ExecutorOperation[] _CollectionItem__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionItem__TypedElement = {};
		private static final ExecutorOperation[] _CollectionItem__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionKind__CollectionKind = {};
	
		private static final ExecutorOperation[] _CollectionLiteralExp__CollectionLiteralExp = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _CollectionLiteralExp__Element = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _CollectionLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _CollectionLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionLiteralPart__CollectionLiteralPart = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _CollectionLiteralPart__Element = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _CollectionLiteralPart__Nameable = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__NamedElement = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionLiteralPart__TypedElement = {};
		private static final ExecutorOperation[] _CollectionLiteralPart__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionRange__CollectionRange = {};
		private static final ExecutorOperation[] _CollectionRange__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _CollectionRange__CollectionLiteralPart = {};
		private static final ExecutorOperation[] _CollectionRange__Element = {};
		private static final ExecutorOperation[] _CollectionRange__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _CollectionRange__Nameable = {};
		private static final ExecutorOperation[] _CollectionRange__NamedElement = {};
		private static final ExecutorOperation[] _CollectionRange__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionRange__TypedElement = {};
		private static final ExecutorOperation[] _CollectionRange__Visitable = {};
	
		private static final ExecutorOperation[] _CollectionType__CollectionType = {};
		private static final ExecutorOperation[] _CollectionType__Class = {};
		private static final ExecutorOperation[] _CollectionType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _CollectionType__DataType = {};
		private static final ExecutorOperation[] _CollectionType__Element = {};
		private static final ExecutorOperation[] _CollectionType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _CollectionType__Nameable = {};
		private static final ExecutorOperation[] _CollectionType__NamedElement = {};
		private static final ExecutorOperation[] _CollectionType__Namespace = {};
		private static final ExecutorOperation[] _CollectionType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _CollectionType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _CollectionType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _CollectionType__Type = {};
		private static final ExecutorOperation[] _CollectionType__Visitable = {};
	
		private static final ExecutorOperation[] _Comment__Comment = {};
		private static final ExecutorOperation[] _Comment__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Comment__Element = {};
		private static final ExecutorOperation[] _Comment__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Comment__Visitable = {};
	
		private static final ExecutorOperation[] _Constraint__Constraint = {};
		private static final ExecutorOperation[] _Constraint__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Constraint__Element = {};
		private static final ExecutorOperation[] _Constraint__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Constraint__Nameable = {};
		private static final ExecutorOperation[] _Constraint__NamedElement = {};
		private static final ExecutorOperation[] _Constraint__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Constraint__Visitable = {};
	
		private static final ExecutorOperation[] _DataType__DataType = {};
		private static final ExecutorOperation[] _DataType__Class = {};
		private static final ExecutorOperation[] _DataType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _DataType__Element = {};
		private static final ExecutorOperation[] _DataType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _DataType__Nameable = {};
		private static final ExecutorOperation[] _DataType__NamedElement = {};
		private static final ExecutorOperation[] _DataType__Namespace = {};
		private static final ExecutorOperation[] _DataType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _DataType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _DataType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _DataType__Type = {};
		private static final ExecutorOperation[] _DataType__Visitable = {};
	
		private static final ExecutorOperation[] _Detail__Detail = {};
		private static final ExecutorOperation[] _Detail__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Detail__Element = {};
		private static final ExecutorOperation[] _Detail__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Detail__Nameable = {};
		private static final ExecutorOperation[] _Detail__NamedElement = {};
		private static final ExecutorOperation[] _Detail__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Detail__Visitable = {};
	
		private static final ExecutorOperation[] _Element__Element = {};
		private static final ExecutorOperation[] _Element__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Element__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Element__Visitable = {};
	
		private static final ExecutorOperation[] _EnumLiteralExp__EnumLiteralExp = {};
		private static final ExecutorOperation[] _EnumLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _EnumLiteralExp__Element = {};
		private static final ExecutorOperation[] _EnumLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _EnumLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _EnumLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _EnumLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _EnumLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _EnumLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _EnumLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _EnumLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _Enumeration__Enumeration = {
		    PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation[] _Enumeration__Class = {};
		private static final ExecutorOperation[] _Enumeration__Classifier = {
		    PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Enumeration__DataType = {};
		private static final ExecutorOperation[] _Enumeration__Element = {};
		private static final ExecutorOperation[] _Enumeration__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Enumeration__Nameable = {};
		private static final ExecutorOperation[] _Enumeration__NamedElement = {};
		private static final ExecutorOperation[] _Enumeration__Namespace = {};
		private static final ExecutorOperation[] _Enumeration__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Enumeration__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Enumeration__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Enumeration__Type = {};
		private static final ExecutorOperation[] _Enumeration__Visitable = {};
	
		private static final ExecutorOperation[] _EnumerationLiteral__EnumerationLiteral = {};
		private static final ExecutorOperation[] _EnumerationLiteral__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _EnumerationLiteral__Element = {};
		private static final ExecutorOperation[] _EnumerationLiteral__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _EnumerationLiteral__Nameable = {};
		private static final ExecutorOperation[] _EnumerationLiteral__NamedElement = {};
		private static final ExecutorOperation[] _EnumerationLiteral__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _EnumerationLiteral__Visitable = {};
	
		private static final ExecutorOperation[] _ExpressionInOcl__ExpressionInOcl = {};
		private static final ExecutorOperation[] _ExpressionInOcl__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__Element = {};
		private static final ExecutorOperation[] _ExpressionInOcl__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__Nameable = {};
		private static final ExecutorOperation[] _ExpressionInOcl__NamedElement = {};
		private static final ExecutorOperation[] _ExpressionInOcl__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__OpaqueExpression = {};
		private static final ExecutorOperation[] _ExpressionInOcl__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__TypedElement = {};
		private static final ExecutorOperation[] _ExpressionInOcl__ValueSpecification = {
		    PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
		    PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
		    PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
		    PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
		    PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
		    PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};
		private static final ExecutorOperation[] _ExpressionInOcl__Visitable = {};
	
		private static final ExecutorOperation[] _Feature__Feature = {};
		private static final ExecutorOperation[] _Feature__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Feature__Element = {};
		private static final ExecutorOperation[] _Feature__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Feature__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Feature__Nameable = {};
		private static final ExecutorOperation[] _Feature__NamedElement = {};
		private static final ExecutorOperation[] _Feature__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Feature__TypedElement = {};
		private static final ExecutorOperation[] _Feature__TypedMultiplicityElement = {};
		private static final ExecutorOperation[] _Feature__Visitable = {};
	
		private static final ExecutorOperation[] _FeatureCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _FeatureCallExp__CallExp = {};
		private static final ExecutorOperation[] _FeatureCallExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _FeatureCallExp__Element = {};
		private static final ExecutorOperation[] _FeatureCallExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _FeatureCallExp__Nameable = {};
		private static final ExecutorOperation[] _FeatureCallExp__NamedElement = {};
		private static final ExecutorOperation[] _FeatureCallExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _FeatureCallExp__OclExpression = {};
		private static final ExecutorOperation[] _FeatureCallExp__TypedElement = {};
		private static final ExecutorOperation[] _FeatureCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _IfExp__IfExp = {};
		private static final ExecutorOperation[] _IfExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _IfExp__Element = {};
		private static final ExecutorOperation[] _IfExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _IfExp__Nameable = {};
		private static final ExecutorOperation[] _IfExp__NamedElement = {};
		private static final ExecutorOperation[] _IfExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _IfExp__OclExpression = {};
		private static final ExecutorOperation[] _IfExp__TypedElement = {};
		private static final ExecutorOperation[] _IfExp__Visitable = {};
	
		private static final ExecutorOperation[] _Int__Int = {};
	
		private static final ExecutorOperation[] _Integer__Integer = {
		    PivotTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    PivotTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    PivotTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    PivotTables.Operations._Integer__0__sub_ /* _'-'() */,
		    PivotTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    PivotTables.Operations._Integer__abs /* abs() */,
		    PivotTables.Operations._Integer__div /* div(Integer) */,
		    PivotTables.Operations._Integer__max /* max(OclSelf) */,
		    PivotTables.Operations._Integer__min /* min(OclSelf) */,
		    PivotTables.Operations._Integer__mod /* mod(Integer) */,
		    PivotTables.Operations._Integer__toString /* toString() */,
		    PivotTables.Operations._Integer___lt_ /* _'<'(OclAny) */,
		    PivotTables.Operations._Integer___lt__eq_ /* _'<='(OclAny) */,
		    PivotTables.Operations._Integer___gt_ /* _'>'(OclAny) */,
		    PivotTables.Operations._Integer___gt__eq_ /* _'>='(OclAny) */
		};
		private static final ExecutorOperation[] _Integer__OclAny = {
		    PivotTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Integer__Real = {
		    PivotTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    PivotTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    PivotTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    PivotTables.Operations._Integer__0__sub_ /* _'-'() */,
		    PivotTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    PivotTables.Operations._Real__1__lt_ /* _'<'(OclSelf) */,
		    PivotTables.Operations._Real__1__lt__eq_ /* _'<='(OclSelf) */,
		    PivotTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Real__1__gt_ /* _'>'(OclSelf) */,
		    PivotTables.Operations._Real__1__gt__eq_ /* _'>='(OclSelf) */,
		    PivotTables.Operations._Integer__abs /* abs() */,
		    PivotTables.Operations._Real__floor /* floor() */,
		    PivotTables.Operations._Integer__max /* max(OclSelf) */,
		    PivotTables.Operations._Integer__min /* min(OclSelf) */,
		    PivotTables.Operations._Real__oclAsType /* oclAsType<TT>(Classifier<Real::TT>) */,
		    PivotTables.Operations._Real__round /* round() */,
		    PivotTables.Operations._Integer__toString /* toString() */,
		    PivotTables.Operations._Integer___lt_ /* _'<'(OclAny) */,
		    PivotTables.Operations._Integer___lt__eq_ /* _'<='(OclAny) */,
		    PivotTables.Operations._Integer___gt_ /* _'>'(OclAny) */,
		    PivotTables.Operations._Integer___gt__eq_ /* _'>='(OclAny) */
		};
	
		private static final ExecutorOperation[] _IntegerLiteralExp__IntegerLiteralExp = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _IntegerLiteralExp__Element = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _IntegerLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__NumericLiteralExp = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _IntegerLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _IntegerLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _InvalidLiteralExp__InvalidLiteralExp = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _InvalidLiteralExp__Element = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _InvalidLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _InvalidLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _InvalidLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _InvalidType__InvalidType = {};
		private static final ExecutorOperation[] _InvalidType__Class = {};
		private static final ExecutorOperation[] _InvalidType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _InvalidType__Element = {};
		private static final ExecutorOperation[] _InvalidType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _InvalidType__Nameable = {};
		private static final ExecutorOperation[] _InvalidType__NamedElement = {};
		private static final ExecutorOperation[] _InvalidType__Namespace = {};
		private static final ExecutorOperation[] _InvalidType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _InvalidType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _InvalidType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _InvalidType__Type = {};
		private static final ExecutorOperation[] _InvalidType__Visitable = {};
	
		private static final ExecutorOperation[] _IterateExp__IterateExp = {};
		private static final ExecutorOperation[] _IterateExp__CallExp = {};
		private static final ExecutorOperation[] _IterateExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _IterateExp__Element = {};
		private static final ExecutorOperation[] _IterateExp__LoopExp = {};
		private static final ExecutorOperation[] _IterateExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _IterateExp__Nameable = {};
		private static final ExecutorOperation[] _IterateExp__NamedElement = {};
		private static final ExecutorOperation[] _IterateExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _IterateExp__OclExpression = {};
		private static final ExecutorOperation[] _IterateExp__TypedElement = {};
		private static final ExecutorOperation[] _IterateExp__Visitable = {};
	
		private static final ExecutorOperation[] _Iteration__Iteration = {};
		private static final ExecutorOperation[] _Iteration__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Iteration__Element = {};
		private static final ExecutorOperation[] _Iteration__Feature = {};
		private static final ExecutorOperation[] _Iteration__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Iteration__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Iteration__Nameable = {};
		private static final ExecutorOperation[] _Iteration__NamedElement = {};
		private static final ExecutorOperation[] _Iteration__Namespace = {};
		private static final ExecutorOperation[] _Iteration__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Iteration__Operation = {};
		private static final ExecutorOperation[] _Iteration__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Iteration__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Iteration__TypedElement = {};
		private static final ExecutorOperation[] _Iteration__TypedMultiplicityElement = {};
		private static final ExecutorOperation[] _Iteration__Visitable = {};
	
		private static final ExecutorOperation[] _IteratorExp__IteratorExp = {};
		private static final ExecutorOperation[] _IteratorExp__CallExp = {};
		private static final ExecutorOperation[] _IteratorExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _IteratorExp__Element = {};
		private static final ExecutorOperation[] _IteratorExp__LoopExp = {};
		private static final ExecutorOperation[] _IteratorExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _IteratorExp__Nameable = {};
		private static final ExecutorOperation[] _IteratorExp__NamedElement = {};
		private static final ExecutorOperation[] _IteratorExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _IteratorExp__OclExpression = {};
		private static final ExecutorOperation[] _IteratorExp__TypedElement = {};
		private static final ExecutorOperation[] _IteratorExp__Visitable = {};
	
		private static final ExecutorOperation[] _LambdaType__LambdaType = {};
		private static final ExecutorOperation[] _LambdaType__Class = {};
		private static final ExecutorOperation[] _LambdaType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _LambdaType__DataType = {};
		private static final ExecutorOperation[] _LambdaType__Element = {};
		private static final ExecutorOperation[] _LambdaType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _LambdaType__Nameable = {};
		private static final ExecutorOperation[] _LambdaType__NamedElement = {};
		private static final ExecutorOperation[] _LambdaType__Namespace = {};
		private static final ExecutorOperation[] _LambdaType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _LambdaType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _LambdaType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _LambdaType__Type = {};
		private static final ExecutorOperation[] _LambdaType__Visitable = {};
	
		private static final ExecutorOperation[] _LetExp__LetExp = {};
		private static final ExecutorOperation[] _LetExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _LetExp__Element = {};
		private static final ExecutorOperation[] _LetExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _LetExp__Nameable = {};
		private static final ExecutorOperation[] _LetExp__NamedElement = {};
		private static final ExecutorOperation[] _LetExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _LetExp__OclExpression = {};
		private static final ExecutorOperation[] _LetExp__TypedElement = {};
		private static final ExecutorOperation[] _LetExp__Visitable = {};
	
		private static final ExecutorOperation[] _Library__Library = {};
		private static final ExecutorOperation[] _Library__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Library__Element = {};
		private static final ExecutorOperation[] _Library__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Library__Nameable = {};
		private static final ExecutorOperation[] _Library__NamedElement = {};
		private static final ExecutorOperation[] _Library__Namespace = {};
		private static final ExecutorOperation[] _Library__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Library__Package = {};
		private static final ExecutorOperation[] _Library__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Library__Visitable = {};
	
		private static final ExecutorOperation[] _LibraryFeature__LibraryFeature = {};
	
		private static final ExecutorOperation[] _LiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _LiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _LiteralExp__Element = {};
		private static final ExecutorOperation[] _LiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _LiteralExp__Nameable = {};
		private static final ExecutorOperation[] _LiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _LiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _LiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _LiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _LiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _LoopExp__LoopExp = {};
		private static final ExecutorOperation[] _LoopExp__CallExp = {};
		private static final ExecutorOperation[] _LoopExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _LoopExp__Element = {};
		private static final ExecutorOperation[] _LoopExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _LoopExp__Nameable = {};
		private static final ExecutorOperation[] _LoopExp__NamedElement = {};
		private static final ExecutorOperation[] _LoopExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _LoopExp__OclExpression = {};
		private static final ExecutorOperation[] _LoopExp__TypedElement = {};
		private static final ExecutorOperation[] _LoopExp__Visitable = {};
	
		private static final ExecutorOperation[] _MessageExp__MessageExp = {};
		private static final ExecutorOperation[] _MessageExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _MessageExp__Element = {};
		private static final ExecutorOperation[] _MessageExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _MessageExp__Nameable = {};
		private static final ExecutorOperation[] _MessageExp__NamedElement = {};
		private static final ExecutorOperation[] _MessageExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _MessageExp__OclExpression = {};
		private static final ExecutorOperation[] _MessageExp__TypedElement = {};
		private static final ExecutorOperation[] _MessageExp__Visitable = {};
	
		private static final ExecutorOperation[] _MessageType__MessageType = {};
		private static final ExecutorOperation[] _MessageType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _MessageType__Element = {};
		private static final ExecutorOperation[] _MessageType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _MessageType__Nameable = {};
		private static final ExecutorOperation[] _MessageType__NamedElement = {};
		private static final ExecutorOperation[] _MessageType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _MessageType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _MessageType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _MessageType__Type = {};
		private static final ExecutorOperation[] _MessageType__Visitable = {};
	
		private static final ExecutorOperation[] _MonikeredElement__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _MonikeredElement__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _MonikeredElement__Element = {};
		private static final ExecutorOperation[] _MonikeredElement__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _MonikeredElement__Visitable = {};
	
		private static final ExecutorOperation[] _MultiplicityElement__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _MultiplicityElement__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _MultiplicityElement__Element = {};
		private static final ExecutorOperation[] _MultiplicityElement__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _MultiplicityElement__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _MultiplicityElement__Visitable = {};
	
		private static final ExecutorOperation[] _Nameable__Nameable = {};
		private static final ExecutorOperation[] _Nameable__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Nameable__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _NamedElement__NamedElement = {};
		private static final ExecutorOperation[] _NamedElement__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _NamedElement__Element = {};
		private static final ExecutorOperation[] _NamedElement__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _NamedElement__Nameable = {};
		private static final ExecutorOperation[] _NamedElement__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _NamedElement__Visitable = {};
	
		private static final ExecutorOperation[] _Namespace__Namespace = {};
		private static final ExecutorOperation[] _Namespace__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Namespace__Element = {};
		private static final ExecutorOperation[] _Namespace__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Namespace__Nameable = {};
		private static final ExecutorOperation[] _Namespace__NamedElement = {};
		private static final ExecutorOperation[] _Namespace__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Namespace__Visitable = {};
	
		private static final ExecutorOperation[] _NavigationCallExp__NavigationCallExp = {};
		private static final ExecutorOperation[] _NavigationCallExp__CallExp = {};
		private static final ExecutorOperation[] _NavigationCallExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _NavigationCallExp__Element = {};
		private static final ExecutorOperation[] _NavigationCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _NavigationCallExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _NavigationCallExp__Nameable = {};
		private static final ExecutorOperation[] _NavigationCallExp__NamedElement = {};
		private static final ExecutorOperation[] _NavigationCallExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _NavigationCallExp__OclExpression = {};
		private static final ExecutorOperation[] _NavigationCallExp__TypedElement = {};
		private static final ExecutorOperation[] _NavigationCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _NonOrderedCollection__NonOrderedCollection = {
		    PivotTables.Operations._NonOrderedCollection__closure /* closure(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : Set(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    PivotTables.Operations._NonOrderedCollection__collect /* collect<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    PivotTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__1_intersection /* intersection(Set(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__0_union /* union(Bag(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__1_union /* union(Set(NonOrderedCollection(T)::T)) */
		};
		private static final ExecutorOperation[] _NonOrderedCollection__Collection = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _NonOrderedCollection__OclAny = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _NonUniqueCollection__NonUniqueCollection = {
		    PivotTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(NonUniqueCollection(T)::T|Lambda NonUniqueCollection(T)::T() : OclAny) */
		};
		private static final ExecutorOperation[] _NonUniqueCollection__Collection = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _NonUniqueCollection__OclAny = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _NullLiteralExp__NullLiteralExp = {};
		private static final ExecutorOperation[] _NullLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _NullLiteralExp__Element = {};
		private static final ExecutorOperation[] _NullLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _NullLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _NullLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _NullLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _NullLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _NullLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _NullLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _NullLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _NullLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _NumericLiteralExp__NumericLiteralExp = {};
		private static final ExecutorOperation[] _NumericLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _NumericLiteralExp__Element = {};
		private static final ExecutorOperation[] _NumericLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _NumericLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _NumericLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _NumericLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _NumericLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _NumericLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _NumericLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _NumericLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _NumericLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _Object__Object = {};
	
		private static final ExecutorOperation[] _OclAny__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclExpression__OclExpression = {};
		private static final ExecutorOperation[] _OclExpression__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _OclExpression__Element = {};
		private static final ExecutorOperation[] _OclExpression__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _OclExpression__Nameable = {};
		private static final ExecutorOperation[] _OclExpression__NamedElement = {};
		private static final ExecutorOperation[] _OclExpression__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OclExpression__TypedElement = {};
		private static final ExecutorOperation[] _OclExpression__Visitable = {};
	
		private static final ExecutorOperation[] _OclInvalid__OclInvalid = {
		    PivotTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclInvalid__allInstances /* allInstances() */,
		    PivotTables.Operations._OclInvalid__oclBadOperation /* oclBadOperation() */,
		    PivotTables.Operations._OclInvalid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclInvalid__OclAny = {
		    PivotTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OclInvalid__OclVoid = {
		    PivotTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclInvalid__allInstances /* allInstances() */,
		    PivotTables.Operations._OclVoid__and /* _'and'(Boolean) */,
		    PivotTables.Operations._OclVoid__implies /* _'implies'(Boolean) */,
		    PivotTables.Operations._OclVoid__or /* _'or'(Boolean) */,
		    PivotTables.Operations._OclInvalid__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclMessage__OclMessage = {
		    PivotTables.Operations._OclMessage__hasReturned /* hasReturned() */,
		    PivotTables.Operations._OclMessage__isOperationCall /* isOperationCall() */,
		    PivotTables.Operations._OclMessage__isSignalSent /* isSignalSent() */,
		    PivotTables.Operations._OclMessage__result /* result() */
		};
		private static final ExecutorOperation[] _OclMessage__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclSelf__OclSelf = {};
		private static final ExecutorOperation[] _OclSelf__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclState__OclState = {};
		private static final ExecutorOperation[] _OclState__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclTuple__OclTuple = {
		    PivotTables.Operations._OclTuple___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclTuple___eq_ /* _'='(OclSelf) */
		};
		private static final ExecutorOperation[] _OclTuple__OclAny = {
		    PivotTables.Operations._OclTuple___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclTuple___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclVoid__OclVoid = {
		    PivotTables.Operations._OclVoid___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclVoid___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclVoid__allInstances /* allInstances() */,
		    PivotTables.Operations._OclVoid__and /* _'and'(Boolean) */,
		    PivotTables.Operations._OclVoid__implies /* _'implies'(Boolean) */,
		    PivotTables.Operations._OclVoid__or /* _'or'(Boolean) */,
		    PivotTables.Operations._OclVoid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclVoid__OclAny = {
		    PivotTables.Operations._OclVoid___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclVoid___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OpaqueExpression__OpaqueExpression = {};
		private static final ExecutorOperation[] _OpaqueExpression__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__Element = {};
		private static final ExecutorOperation[] _OpaqueExpression__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__Nameable = {};
		private static final ExecutorOperation[] _OpaqueExpression__NamedElement = {};
		private static final ExecutorOperation[] _OpaqueExpression__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__TypedElement = {};
		private static final ExecutorOperation[] _OpaqueExpression__ValueSpecification = {
		    PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
		    PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
		    PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
		    PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
		    PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
		    PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};
		private static final ExecutorOperation[] _OpaqueExpression__Visitable = {};
	
		private static final ExecutorOperation[] _Operation__Operation = {};
		private static final ExecutorOperation[] _Operation__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Operation__Element = {};
		private static final ExecutorOperation[] _Operation__Feature = {};
		private static final ExecutorOperation[] _Operation__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Operation__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Operation__Nameable = {};
		private static final ExecutorOperation[] _Operation__NamedElement = {};
		private static final ExecutorOperation[] _Operation__Namespace = {};
		private static final ExecutorOperation[] _Operation__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Operation__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Operation__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Operation__TypedElement = {};
		private static final ExecutorOperation[] _Operation__TypedMultiplicityElement = {};
		private static final ExecutorOperation[] _Operation__Visitable = {};
	
		private static final ExecutorOperation[] _OperationCallExp__OperationCallExp = {};
		private static final ExecutorOperation[] _OperationCallExp__CallExp = {};
		private static final ExecutorOperation[] _OperationCallExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _OperationCallExp__Element = {};
		private static final ExecutorOperation[] _OperationCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _OperationCallExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _OperationCallExp__Nameable = {};
		private static final ExecutorOperation[] _OperationCallExp__NamedElement = {};
		private static final ExecutorOperation[] _OperationCallExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OperationCallExp__OclExpression = {};
		private static final ExecutorOperation[] _OperationCallExp__TypedElement = {};
		private static final ExecutorOperation[] _OperationCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _OperationTemplateParameter__OperationTemplateParameter = {};
		private static final ExecutorOperation[] _OperationTemplateParameter__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _OperationTemplateParameter__Element = {};
		private static final ExecutorOperation[] _OperationTemplateParameter__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OperationTemplateParameter__TemplateParameter = {};
		private static final ExecutorOperation[] _OperationTemplateParameter__Visitable = {};
	
		private static final ExecutorOperation[] _OrderedCollection__OrderedCollection = {
		    PivotTables.Operations._OrderedCollection__at /* at(Integer) */,
		    PivotTables.Operations._OrderedCollection__closure /* closure(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedSet(OrderedCollection(T)::T)) */,
		    PivotTables.Operations._OrderedCollection__collectNested /* collectNested<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    PivotTables.Operations._OrderedCollection__collect /* collect<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    PivotTables.Operations._OrderedCollection__first /* first() */,
		    PivotTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    PivotTables.Operations._OrderedCollection__last /* last() */,
		    PivotTables.Operations._OrderedCollection__reverse /* reverse() */
		};
		private static final ExecutorOperation[] _OrderedCollection__Collection = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _OrderedCollection__OclAny = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OrderedSet__OrderedSet = {
		    PivotTables.Operations._OrderedSet___sub_ /* _'-'(Set(OclAny)) */,
		    PivotTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OrderedSet__append /* append(OrderedSet(T)::T) */,
		    PivotTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._OrderedSet__flatten /* flatten<T2>() */,
		    PivotTables.Operations._OrderedSet__including /* including(OrderedSet(T)::T) */,
		    PivotTables.Operations._OrderedSet__insertAt /* insertAt(Integer,OrderedSet(T)::T) */,
		    PivotTables.Operations._OrderedSet__intersection /* intersection(Set(OrderedSet(T)::T)) */,
		    PivotTables.Operations._OrderedSet__prepend /* prepend(OrderedSet(T)::T) */,
		    PivotTables.Operations._OrderedSet__reject /* reject(OrderedSet(T)::T|Lambda OrderedSet(T)::T() : Boolean) */,
		    PivotTables.Operations._OrderedSet__reverse /* reverse() */,
		    PivotTables.Operations._OrderedSet__select /* select(OrderedSet(T)::T|Lambda OrderedSet(T)::T() : Boolean) */,
		    PivotTables.Operations._OrderedSet__subOrderedSet /* subOrderedSet(Integer,Integer) */,
		    PivotTables.Operations._OrderedSet__symmetricDifference /* symmetricDifference(Set(OclAny)) */,
		    PivotTables.Operations._OrderedSet__0_union /* union(OrderedSet(OrderedSet(T)::T)) */,
		    PivotTables.Operations._OrderedSet__1_union /* union(Set(OrderedSet(T)::T)) */
		};
		private static final ExecutorOperation[] _OrderedSet__Collection = {
		    PivotTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._OrderedSet__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _OrderedSet__OclAny = {
		    PivotTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OrderedSet__OrderedCollection = {
		    PivotTables.Operations._OrderedCollection__at /* at(Integer) */,
		    PivotTables.Operations._OrderedCollection__closure /* closure(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedSet(OrderedCollection(T)::T)) */,
		    PivotTables.Operations._OrderedCollection__collectNested /* collectNested<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    PivotTables.Operations._OrderedCollection__collect /* collect<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    PivotTables.Operations._OrderedCollection__first /* first() */,
		    PivotTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    PivotTables.Operations._OrderedCollection__last /* last() */,
		    PivotTables.Operations._OrderedSet__reverse /* reverse() */
		};
		private static final ExecutorOperation[] _OrderedSet__UniqueCollection = {
		    PivotTables.Operations._UniqueCollection__sortedBy /* sortedBy(UniqueCollection(T)::T|Lambda UniqueCollection(T)::T() : OclAny) */
		};
	
		private static final ExecutorOperation[] _OrderedSetType__OrderedSetType = {};
		private static final ExecutorOperation[] _OrderedSetType__Class = {};
		private static final ExecutorOperation[] _OrderedSetType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _OrderedSetType__CollectionType = {};
		private static final ExecutorOperation[] _OrderedSetType__DataType = {};
		private static final ExecutorOperation[] _OrderedSetType__Element = {};
		private static final ExecutorOperation[] _OrderedSetType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _OrderedSetType__Nameable = {};
		private static final ExecutorOperation[] _OrderedSetType__NamedElement = {};
		private static final ExecutorOperation[] _OrderedSetType__Namespace = {};
		private static final ExecutorOperation[] _OrderedSetType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OrderedSetType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _OrderedSetType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _OrderedSetType__Type = {};
		private static final ExecutorOperation[] _OrderedSetType__Visitable = {};
	
		private static final ExecutorOperation[] _Package__Package = {};
		private static final ExecutorOperation[] _Package__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Package__Element = {};
		private static final ExecutorOperation[] _Package__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Package__Nameable = {};
		private static final ExecutorOperation[] _Package__NamedElement = {};
		private static final ExecutorOperation[] _Package__Namespace = {};
		private static final ExecutorOperation[] _Package__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Package__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Package__Visitable = {};
	
		private static final ExecutorOperation[] _PackageableElement__PackageableElement = {};
		private static final ExecutorOperation[] _PackageableElement__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _PackageableElement__Element = {};
		private static final ExecutorOperation[] _PackageableElement__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _PackageableElement__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _PackageableElement__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _PackageableElement__Visitable = {};
	
		private static final ExecutorOperation[] _Parameter__Parameter = {};
		private static final ExecutorOperation[] _Parameter__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Parameter__Element = {};
		private static final ExecutorOperation[] _Parameter__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Parameter__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Parameter__Nameable = {};
		private static final ExecutorOperation[] _Parameter__NamedElement = {};
		private static final ExecutorOperation[] _Parameter__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Parameter__TypedElement = {};
		private static final ExecutorOperation[] _Parameter__TypedMultiplicityElement = {};
		private static final ExecutorOperation[] _Parameter__VariableDeclaration = {};
		private static final ExecutorOperation[] _Parameter__Visitable = {};
	
		private static final ExecutorOperation[] _ParameterableElement__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _ParameterableElement__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _ParameterableElement__Element = {};
		private static final ExecutorOperation[] _ParameterableElement__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _ParameterableElement__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ParameterableElement__Visitable = {};
	
		private static final ExecutorOperation[] _Pivotable__Pivotable = {};
		private static final ExecutorOperation[] _Pivotable__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Pivotable__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Precedence__Precedence = {};
		private static final ExecutorOperation[] _Precedence__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Precedence__Element = {};
		private static final ExecutorOperation[] _Precedence__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Precedence__Nameable = {};
		private static final ExecutorOperation[] _Precedence__NamedElement = {};
		private static final ExecutorOperation[] _Precedence__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Precedence__Visitable = {};
	
		private static final ExecutorOperation[] _PrimitiveLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__Element = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _PrimitiveLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _PrimitiveType__PrimitiveType = {};
		private static final ExecutorOperation[] _PrimitiveType__Class = {};
		private static final ExecutorOperation[] _PrimitiveType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _PrimitiveType__DataType = {};
		private static final ExecutorOperation[] _PrimitiveType__Element = {};
		private static final ExecutorOperation[] _PrimitiveType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _PrimitiveType__Nameable = {};
		private static final ExecutorOperation[] _PrimitiveType__NamedElement = {};
		private static final ExecutorOperation[] _PrimitiveType__Namespace = {};
		private static final ExecutorOperation[] _PrimitiveType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _PrimitiveType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _PrimitiveType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _PrimitiveType__Type = {};
		private static final ExecutorOperation[] _PrimitiveType__Visitable = {};
	
		private static final ExecutorOperation[] _Property__Property = {};
		private static final ExecutorOperation[] _Property__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Property__Element = {};
		private static final ExecutorOperation[] _Property__Feature = {};
		private static final ExecutorOperation[] _Property__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Property__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _Property__Nameable = {};
		private static final ExecutorOperation[] _Property__NamedElement = {};
		private static final ExecutorOperation[] _Property__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Property__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Property__TypedElement = {};
		private static final ExecutorOperation[] _Property__TypedMultiplicityElement = {};
		private static final ExecutorOperation[] _Property__Visitable = {};
	
		private static final ExecutorOperation[] _PropertyCallExp__PropertyCallExp = {};
		private static final ExecutorOperation[] _PropertyCallExp__CallExp = {};
		private static final ExecutorOperation[] _PropertyCallExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _PropertyCallExp__Element = {};
		private static final ExecutorOperation[] _PropertyCallExp__FeatureCallExp = {};
		private static final ExecutorOperation[] _PropertyCallExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _PropertyCallExp__Nameable = {};
		private static final ExecutorOperation[] _PropertyCallExp__NamedElement = {};
		private static final ExecutorOperation[] _PropertyCallExp__NavigationCallExp = {};
		private static final ExecutorOperation[] _PropertyCallExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _PropertyCallExp__OclExpression = {};
		private static final ExecutorOperation[] _PropertyCallExp__TypedElement = {};
		private static final ExecutorOperation[] _PropertyCallExp__Visitable = {};
	
		private static final ExecutorOperation[] _Real__Real = {
		    PivotTables.Operations._Real___mul_ /* _'*'(OclSelf) */,
		    PivotTables.Operations._Real___add_ /* _'+'(OclSelf) */,
		    PivotTables.Operations._Real__0__sub_ /* _'-'(OclSelf) */,
		    PivotTables.Operations._Real__1__sub_ /* _'-'() */,
		    PivotTables.Operations._Real___div_ /* _'/'(OclSelf) */,
		    PivotTables.Operations._Real__1__lt_ /* _'<'(OclSelf) */,
		    PivotTables.Operations._Real__1__lt__eq_ /* _'<='(OclSelf) */,
		    PivotTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Real__1__gt_ /* _'>'(OclSelf) */,
		    PivotTables.Operations._Real__1__gt__eq_ /* _'>='(OclSelf) */,
		    PivotTables.Operations._Real__abs /* abs() */,
		    PivotTables.Operations._Real__floor /* floor() */,
		    PivotTables.Operations._Real__max /* max(OclSelf) */,
		    PivotTables.Operations._Real__min /* min(OclSelf) */,
		    PivotTables.Operations._Real__oclAsType /* oclAsType<TT>(Classifier<Real::TT>) */,
		    PivotTables.Operations._Real__round /* round() */,
		    PivotTables.Operations._Real__toString /* toString() */,
		    PivotTables.Operations._Real__0__lt_ /* _'<'(OclAny) */,
		    PivotTables.Operations._Real__0__lt__eq_ /* _'<='(OclAny) */,
		    PivotTables.Operations._Real__0__gt_ /* _'>'(OclAny) */,
		    PivotTables.Operations._Real__0__gt__eq_ /* _'>='(OclAny) */
		};
		private static final ExecutorOperation[] _Real__OclAny = {
		    PivotTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _RealLiteralExp__RealLiteralExp = {};
		private static final ExecutorOperation[] _RealLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _RealLiteralExp__Element = {};
		private static final ExecutorOperation[] _RealLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _RealLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _RealLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _RealLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _RealLiteralExp__NumericLiteralExp = {};
		private static final ExecutorOperation[] _RealLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _RealLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _RealLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _RealLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _RealLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _SelfType__SelfType = {};
		private static final ExecutorOperation[] _SelfType__Class = {};
		private static final ExecutorOperation[] _SelfType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _SelfType__Element = {};
		private static final ExecutorOperation[] _SelfType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _SelfType__Nameable = {};
		private static final ExecutorOperation[] _SelfType__NamedElement = {};
		private static final ExecutorOperation[] _SelfType__Namespace = {};
		private static final ExecutorOperation[] _SelfType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _SelfType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _SelfType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _SelfType__Type = {};
		private static final ExecutorOperation[] _SelfType__Visitable = {};
	
		private static final ExecutorOperation[] _SendSignalAction__SendSignalAction = {};
		private static final ExecutorOperation[] _SendSignalAction__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _SendSignalAction__Element = {};
		private static final ExecutorOperation[] _SendSignalAction__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _SendSignalAction__Nameable = {};
		private static final ExecutorOperation[] _SendSignalAction__NamedElement = {};
		private static final ExecutorOperation[] _SendSignalAction__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _SendSignalAction__Visitable = {};
	
		private static final ExecutorOperation[] _Sequence__Sequence = {
		    PivotTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Sequence__append /* append(Sequence(T)::T) */,
		    PivotTables.Operations._Sequence__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Sequence__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Sequence__including /* including(Sequence(T)::T) */,
		    PivotTables.Operations._Sequence__insertAt /* insertAt(Integer,Sequence(T)::T) */,
		    PivotTables.Operations._Sequence__prepend /* prepend(Sequence(T)::T) */,
		    PivotTables.Operations._Sequence__reject /* reject(Sequence(T)::T|Lambda Sequence(T)::T() : Boolean) */,
		    PivotTables.Operations._Sequence__reverse /* reverse() */,
		    PivotTables.Operations._Sequence__select /* select(Sequence(T)::T|Lambda Sequence(T)::T() : Boolean) */,
		    PivotTables.Operations._Sequence__subSequence /* subSequence(Integer,Integer) */,
		    PivotTables.Operations._Sequence__union /* union(Sequence(Sequence(T)::T)) */
		};
		private static final ExecutorOperation[] _Sequence__Collection = {
		    PivotTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Sequence__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Sequence__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Sequence__NonUniqueCollection = {
		    PivotTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(NonUniqueCollection(T)::T|Lambda NonUniqueCollection(T)::T() : OclAny) */
		};
		private static final ExecutorOperation[] _Sequence__OclAny = {
		    PivotTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Sequence__OrderedCollection = {
		    PivotTables.Operations._OrderedCollection__at /* at(Integer) */,
		    PivotTables.Operations._OrderedCollection__closure /* closure(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedSet(OrderedCollection(T)::T)) */,
		    PivotTables.Operations._OrderedCollection__collectNested /* collectNested<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    PivotTables.Operations._OrderedCollection__collect /* collect<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    PivotTables.Operations._OrderedCollection__first /* first() */,
		    PivotTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    PivotTables.Operations._OrderedCollection__last /* last() */,
		    PivotTables.Operations._Sequence__reverse /* reverse() */
		};
	
		private static final ExecutorOperation[] _SequenceType__SequenceType = {};
		private static final ExecutorOperation[] _SequenceType__Class = {};
		private static final ExecutorOperation[] _SequenceType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _SequenceType__CollectionType = {};
		private static final ExecutorOperation[] _SequenceType__DataType = {};
		private static final ExecutorOperation[] _SequenceType__Element = {};
		private static final ExecutorOperation[] _SequenceType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _SequenceType__Nameable = {};
		private static final ExecutorOperation[] _SequenceType__NamedElement = {};
		private static final ExecutorOperation[] _SequenceType__Namespace = {};
		private static final ExecutorOperation[] _SequenceType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _SequenceType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _SequenceType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _SequenceType__Type = {};
		private static final ExecutorOperation[] _SequenceType__Visitable = {};
	
		private static final ExecutorOperation[] _Set__Set = {
		    PivotTables.Operations._Set___sub_ /* _'-'(Set(OclAny)) */,
		    PivotTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Set__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Set__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Set__including /* including(Set(T)::T) */,
		    PivotTables.Operations._Set__intersection /* intersection(Set(Set(T)::T)) */,
		    PivotTables.Operations._Set__reject /* reject(Set(T)::T|Lambda Set(T)::T() : Boolean) */,
		    PivotTables.Operations._Set__select /* select(Set(T)::T|Lambda Set(T)::T() : Boolean) */,
		    PivotTables.Operations._Set__symmetricDifference /* symmetricDifference(Set(OclAny)) */
		};
		private static final ExecutorOperation[] _Set__Collection = {
		    PivotTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Set__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Set__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Set__NonOrderedCollection = {
		    PivotTables.Operations._NonOrderedCollection__closure /* closure(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : Set(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    PivotTables.Operations._NonOrderedCollection__collect /* collect<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    PivotTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__1_intersection /* intersection(Set(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__0_union /* union(Bag(NonOrderedCollection(T)::T)) */,
		    PivotTables.Operations._NonOrderedCollection__1_union /* union(Set(NonOrderedCollection(T)::T)) */
		};
		private static final ExecutorOperation[] _Set__OclAny = {
		    PivotTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Set__UniqueCollection = {
		    PivotTables.Operations._UniqueCollection__sortedBy /* sortedBy(UniqueCollection(T)::T|Lambda UniqueCollection(T)::T() : OclAny) */
		};
	
		private static final ExecutorOperation[] _SetType__SetType = {};
		private static final ExecutorOperation[] _SetType__Class = {};
		private static final ExecutorOperation[] _SetType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _SetType__CollectionType = {};
		private static final ExecutorOperation[] _SetType__DataType = {};
		private static final ExecutorOperation[] _SetType__Element = {};
		private static final ExecutorOperation[] _SetType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _SetType__Nameable = {};
		private static final ExecutorOperation[] _SetType__NamedElement = {};
		private static final ExecutorOperation[] _SetType__Namespace = {};
		private static final ExecutorOperation[] _SetType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _SetType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _SetType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _SetType__Type = {};
		private static final ExecutorOperation[] _SetType__Visitable = {};
	
		private static final ExecutorOperation[] _Signal__Signal = {};
		private static final ExecutorOperation[] _Signal__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Signal__Element = {};
		private static final ExecutorOperation[] _Signal__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Signal__Nameable = {};
		private static final ExecutorOperation[] _Signal__NamedElement = {};
		private static final ExecutorOperation[] _Signal__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Signal__Visitable = {};
	
		private static final ExecutorOperation[] _State__State = {};
		private static final ExecutorOperation[] _State__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _State__Element = {};
		private static final ExecutorOperation[] _State__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _State__Nameable = {};
		private static final ExecutorOperation[] _State__NamedElement = {};
		private static final ExecutorOperation[] _State__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _State__Visitable = {};
	
		private static final ExecutorOperation[] _StateExp__StateExp = {};
		private static final ExecutorOperation[] _StateExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _StateExp__Element = {};
		private static final ExecutorOperation[] _StateExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _StateExp__Nameable = {};
		private static final ExecutorOperation[] _StateExp__NamedElement = {};
		private static final ExecutorOperation[] _StateExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _StateExp__OclExpression = {};
		private static final ExecutorOperation[] _StateExp__TypedElement = {};
		private static final ExecutorOperation[] _StateExp__Visitable = {};
	
		private static final ExecutorOperation[] _String__String = {
		    PivotTables.Operations._String___add_ /* _'+'(String) */,
		    PivotTables.Operations._String__1__lt_ /* _'<'(OclSelf) */,
		    PivotTables.Operations._String__1__lt__eq_ /* _'<='(OclSelf) */,
		    PivotTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._String___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._String__1__gt_ /* _'>'(OclSelf) */,
		    PivotTables.Operations._String__1__gt__eq_ /* _'>='(OclSelf) */,
		    PivotTables.Operations._String__at /* at(Integer) */,
		    PivotTables.Operations._String__characters /* characters() */,
		    PivotTables.Operations._String__concat /* concat(String) */,
		    PivotTables.Operations._String__equalsIgnoreCase /* equalsIgnoreCase(String) */,
		    PivotTables.Operations._String__indexOf /* indexOf(String) */,
		    PivotTables.Operations._String__size /* size() */,
		    PivotTables.Operations._String__substring /* substring(Integer,Integer) */,
		    PivotTables.Operations._String__toBoolean /* toBoolean() */,
		    PivotTables.Operations._String__toInteger /* toInteger() */,
		    PivotTables.Operations._String__toLower /* toLower() */,
		    PivotTables.Operations._String__toLowerCase /* toLowerCase() */,
		    PivotTables.Operations._String__toReal /* toReal() */,
		    PivotTables.Operations._String__toString /* toString() */,
		    PivotTables.Operations._String__toUpper /* toUpper() */,
		    PivotTables.Operations._String__toUpperCase /* toUpperCase() */,
		    PivotTables.Operations._String__0__lt_ /* _'<'(OclAny) */,
		    PivotTables.Operations._String__0__lt__eq_ /* _'<='(OclAny) */,
		    PivotTables.Operations._String__0__gt_ /* _'>'(OclAny) */,
		    PivotTables.Operations._String__0__gt__eq_ /* _'>='(OclAny) */
		};
		private static final ExecutorOperation[] _String__OclAny = {
		    PivotTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._String___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _StringLiteralExp__StringLiteralExp = {};
		private static final ExecutorOperation[] _StringLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _StringLiteralExp__Element = {};
		private static final ExecutorOperation[] _StringLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _StringLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _StringLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _StringLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _StringLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _StringLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _StringLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _StringLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _StringLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateBinding__TemplateBinding = {};
		private static final ExecutorOperation[] _TemplateBinding__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TemplateBinding__Element = {};
		private static final ExecutorOperation[] _TemplateBinding__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateBinding__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateParameter__TemplateParameter = {};
		private static final ExecutorOperation[] _TemplateParameter__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TemplateParameter__Element = {};
		private static final ExecutorOperation[] _TemplateParameter__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateParameter__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateParameterSubstitution__TemplateParameterSubstitution = {};
		private static final ExecutorOperation[] _TemplateParameterSubstitution__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TemplateParameterSubstitution__Element = {};
		private static final ExecutorOperation[] _TemplateParameterSubstitution__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateParameterSubstitution__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateParameterType__TemplateParameterType = {};
		private static final ExecutorOperation[] _TemplateParameterType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__Element = {};
		private static final ExecutorOperation[] _TemplateParameterType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__Nameable = {};
		private static final ExecutorOperation[] _TemplateParameterType__NamedElement = {};
		private static final ExecutorOperation[] _TemplateParameterType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _TemplateParameterType__Type = {};
		private static final ExecutorOperation[] _TemplateParameterType__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateSignature__TemplateSignature = {};
		private static final ExecutorOperation[] _TemplateSignature__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TemplateSignature__Element = {};
		private static final ExecutorOperation[] _TemplateSignature__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TemplateSignature__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateSignature__Visitable = {};
	
		private static final ExecutorOperation[] _TemplateableElement__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _TemplateableElement__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TemplateableElement__Element = {};
		private static final ExecutorOperation[] _TemplateableElement__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TemplateableElement__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TemplateableElement__Visitable = {};
	
		private static final ExecutorOperation[] _Throwable__Throwable = {};
	
		private static final ExecutorOperation[] _Tuple__Tuple = {};
		private static final ExecutorOperation[] _Tuple__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _TupleLiteralExp__TupleLiteralExp = {};
		private static final ExecutorOperation[] _TupleLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TupleLiteralExp__Element = {};
		private static final ExecutorOperation[] _TupleLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _TupleLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TupleLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _TupleLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _TupleLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TupleLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _TupleLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _TupleLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _TupleLiteralPart__TupleLiteralPart = {};
		private static final ExecutorOperation[] _TupleLiteralPart__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TupleLiteralPart__Element = {};
		private static final ExecutorOperation[] _TupleLiteralPart__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TupleLiteralPart__Nameable = {};
		private static final ExecutorOperation[] _TupleLiteralPart__NamedElement = {};
		private static final ExecutorOperation[] _TupleLiteralPart__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TupleLiteralPart__TypedElement = {};
		private static final ExecutorOperation[] _TupleLiteralPart__VariableDeclaration = {};
		private static final ExecutorOperation[] _TupleLiteralPart__Visitable = {};
	
		private static final ExecutorOperation[] _TupleType__TupleType = {};
		private static final ExecutorOperation[] _TupleType__Class = {};
		private static final ExecutorOperation[] _TupleType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TupleType__DataType = {};
		private static final ExecutorOperation[] _TupleType__Element = {};
		private static final ExecutorOperation[] _TupleType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TupleType__Nameable = {};
		private static final ExecutorOperation[] _TupleType__NamedElement = {};
		private static final ExecutorOperation[] _TupleType__Namespace = {};
		private static final ExecutorOperation[] _TupleType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TupleType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _TupleType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _TupleType__Type = {};
		private static final ExecutorOperation[] _TupleType__Visitable = {};
	
		private static final ExecutorOperation[] _Type__Type = {};
		private static final ExecutorOperation[] _Type__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Type__Element = {};
		private static final ExecutorOperation[] _Type__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Type__Nameable = {};
		private static final ExecutorOperation[] _Type__NamedElement = {};
		private static final ExecutorOperation[] _Type__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Type__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _Type__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _Type__Visitable = {};
	
		private static final ExecutorOperation[] _TypeExp__TypeExp = {};
		private static final ExecutorOperation[] _TypeExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TypeExp__Element = {};
		private static final ExecutorOperation[] _TypeExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TypeExp__Nameable = {};
		private static final ExecutorOperation[] _TypeExp__NamedElement = {};
		private static final ExecutorOperation[] _TypeExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TypeExp__OclExpression = {};
		private static final ExecutorOperation[] _TypeExp__TypedElement = {};
		private static final ExecutorOperation[] _TypeExp__Visitable = {};
	
		private static final ExecutorOperation[] _TypeTemplateParameter__TypeTemplateParameter = {};
		private static final ExecutorOperation[] _TypeTemplateParameter__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TypeTemplateParameter__Element = {};
		private static final ExecutorOperation[] _TypeTemplateParameter__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TypeTemplateParameter__TemplateParameter = {};
		private static final ExecutorOperation[] _TypeTemplateParameter__Visitable = {};
	
		private static final ExecutorOperation[] _TypedElement__TypedElement = {};
		private static final ExecutorOperation[] _TypedElement__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TypedElement__Element = {};
		private static final ExecutorOperation[] _TypedElement__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TypedElement__Nameable = {};
		private static final ExecutorOperation[] _TypedElement__NamedElement = {};
		private static final ExecutorOperation[] _TypedElement__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TypedElement__Visitable = {};
	
		private static final ExecutorOperation[] _TypedMultiplicityElement__TypedMultiplicityElement = {};
		private static final ExecutorOperation[] _TypedMultiplicityElement__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__Element = {};
		private static final ExecutorOperation[] _TypedMultiplicityElement__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__MultiplicityElement = {
		    PivotTables.Operations._MultiplicityElement__includesCardinality /* includesCardinality(Integer) */,
		    PivotTables.Operations._MultiplicityElement__includesMultiplicity /* includesMultiplicity(MultiplicityElement) */,
		    PivotTables.Operations._MultiplicityElement__isMultivalued /* isMultivalued() */,
		    PivotTables.Operations._MultiplicityElement__lowerBound /* lowerBound() */,
		    PivotTables.Operations._MultiplicityElement__upperBound /* upperBound() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__Nameable = {};
		private static final ExecutorOperation[] _TypedMultiplicityElement__NamedElement = {};
		private static final ExecutorOperation[] _TypedMultiplicityElement__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _TypedMultiplicityElement__TypedElement = {};
		private static final ExecutorOperation[] _TypedMultiplicityElement__Visitable = {};
	
		private static final ExecutorOperation[] _UniqueCollection__UniqueCollection = {
		    PivotTables.Operations._UniqueCollection__sortedBy /* sortedBy(UniqueCollection(T)::T|Lambda UniqueCollection(T)::T() : OclAny) */
		};
		private static final ExecutorOperation[] _UniqueCollection__Collection = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__asBag /* asBag() */,
		    PivotTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    PivotTables.Operations._Collection__asSequence /* asSequence() */,
		    PivotTables.Operations._Collection__asSet /* asSet() */,
		    PivotTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    PivotTables.Operations._Collection__count /* count(OclAny) */,
		    PivotTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    PivotTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    PivotTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__flatten /* flatten<T2>() */,
		    PivotTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__includes /* includes(OclAny) */,
		    PivotTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    PivotTables.Operations._Collection__isEmpty /* isEmpty() */,
		    PivotTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    PivotTables.Operations._Collection__max /* max() */,
		    PivotTables.Operations._Collection__min /* min() */,
		    PivotTables.Operations._Collection__notEmpty /* notEmpty() */,
		    PivotTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    PivotTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    PivotTables.Operations._Collection__size /* size() */,
		    PivotTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    PivotTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _UniqueCollection__OclAny = {
		    PivotTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _UnlimitedNatural__UnlimitedNatural = {
		    PivotTables.Operations._UnlimitedNatural___lt_ /* _'<'(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___lt__eq_ /* _'<='(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___gt_ /* _'>'(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___gt__eq_ /* _'>='(OclAny) */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__Integer = {
		    PivotTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    PivotTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    PivotTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    PivotTables.Operations._Integer__0__sub_ /* _'-'() */,
		    PivotTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    PivotTables.Operations._Integer__abs /* abs() */,
		    PivotTables.Operations._Integer__div /* div(Integer) */,
		    PivotTables.Operations._Integer__max /* max(OclSelf) */,
		    PivotTables.Operations._Integer__min /* min(OclSelf) */,
		    PivotTables.Operations._Integer__mod /* mod(Integer) */,
		    PivotTables.Operations._Integer__toString /* toString() */,
		    PivotTables.Operations._UnlimitedNatural___lt_ /* _'<'(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___lt__eq_ /* _'<='(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___gt_ /* _'>'(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___gt__eq_ /* _'>='(OclAny) */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__OclAny = {
		    PivotTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__Real = {
		    PivotTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    PivotTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    PivotTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    PivotTables.Operations._Integer__0__sub_ /* _'-'() */,
		    PivotTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    PivotTables.Operations._Real__1__lt_ /* _'<'(OclSelf) */,
		    PivotTables.Operations._Real__1__lt__eq_ /* _'<='(OclSelf) */,
		    PivotTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._Real__1__gt_ /* _'>'(OclSelf) */,
		    PivotTables.Operations._Real__1__gt__eq_ /* _'>='(OclSelf) */,
		    PivotTables.Operations._Integer__abs /* abs() */,
		    PivotTables.Operations._Real__floor /* floor() */,
		    PivotTables.Operations._Integer__max /* max(OclSelf) */,
		    PivotTables.Operations._Integer__min /* min(OclSelf) */,
		    PivotTables.Operations._Real__oclAsType /* oclAsType<TT>(Classifier<Real::TT>) */,
		    PivotTables.Operations._Real__round /* round() */,
		    PivotTables.Operations._Integer__toString /* toString() */,
		    PivotTables.Operations._UnlimitedNatural___lt_ /* _'<'(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___lt__eq_ /* _'<='(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___gt_ /* _'>'(OclAny) */,
		    PivotTables.Operations._UnlimitedNatural___gt__eq_ /* _'>='(OclAny) */
		};
	
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__Element = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__LiteralExp = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__Nameable = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__NamedElement = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__NumericLiteralExp = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__OclExpression = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__PrimitiveLiteralExp = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__TypedElement = {};
		private static final ExecutorOperation[] _UnlimitedNaturalLiteralExp__Visitable = {};
	
		private static final ExecutorOperation[] _UnspecifiedType__UnspecifiedType = {};
		private static final ExecutorOperation[] _UnspecifiedType__Class = {};
		private static final ExecutorOperation[] _UnspecifiedType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__Element = {};
		private static final ExecutorOperation[] _UnspecifiedType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__Nameable = {};
		private static final ExecutorOperation[] _UnspecifiedType__NamedElement = {};
		private static final ExecutorOperation[] _UnspecifiedType__Namespace = {};
		private static final ExecutorOperation[] _UnspecifiedType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _UnspecifiedType__Type = {};
		private static final ExecutorOperation[] _UnspecifiedType__Visitable = {};
	
		private static final ExecutorOperation[] _UnspecifiedValueExp__UnspecifiedValueExp = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _UnspecifiedValueExp__Element = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _UnspecifiedValueExp__Nameable = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__NamedElement = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnspecifiedValueExp__OclExpression = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__TypedElement = {};
		private static final ExecutorOperation[] _UnspecifiedValueExp__Visitable = {};
	
		private static final ExecutorOperation[] _ValueSpecification__ValueSpecification = {
		    PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
		    PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
		    PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
		    PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
		    PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
		    PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};
		private static final ExecutorOperation[] _ValueSpecification__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _ValueSpecification__Element = {};
		private static final ExecutorOperation[] _ValueSpecification__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _ValueSpecification__Nameable = {};
		private static final ExecutorOperation[] _ValueSpecification__NamedElement = {};
		private static final ExecutorOperation[] _ValueSpecification__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _ValueSpecification__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _ValueSpecification__TypedElement = {};
		private static final ExecutorOperation[] _ValueSpecification__Visitable = {};
	
		private static final ExecutorOperation[] _Variable__Variable = {};
		private static final ExecutorOperation[] _Variable__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Variable__Element = {};
		private static final ExecutorOperation[] _Variable__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _Variable__Nameable = {};
		private static final ExecutorOperation[] _Variable__NamedElement = {};
		private static final ExecutorOperation[] _Variable__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Variable__TypedElement = {};
		private static final ExecutorOperation[] _Variable__VariableDeclaration = {};
		private static final ExecutorOperation[] _Variable__Visitable = {};
	
		private static final ExecutorOperation[] _VariableDeclaration__VariableDeclaration = {};
		private static final ExecutorOperation[] _VariableDeclaration__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _VariableDeclaration__Element = {};
		private static final ExecutorOperation[] _VariableDeclaration__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _VariableDeclaration__Nameable = {};
		private static final ExecutorOperation[] _VariableDeclaration__NamedElement = {};
		private static final ExecutorOperation[] _VariableDeclaration__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _VariableDeclaration__TypedElement = {};
		private static final ExecutorOperation[] _VariableDeclaration__Visitable = {};
	
		private static final ExecutorOperation[] _VariableExp__VariableExp = {};
		private static final ExecutorOperation[] _VariableExp__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _VariableExp__Element = {};
		private static final ExecutorOperation[] _VariableExp__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _VariableExp__Nameable = {};
		private static final ExecutorOperation[] _VariableExp__NamedElement = {};
		private static final ExecutorOperation[] _VariableExp__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _VariableExp__OclExpression = {};
		private static final ExecutorOperation[] _VariableExp__TypedElement = {};
		private static final ExecutorOperation[] _VariableExp__Visitable = {};
	
		private static final ExecutorOperation[] _Visitable__Visitable = {};
		private static final ExecutorOperation[] _Visitable__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Visitable__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Visitor__Visitor = {};
		private static final ExecutorOperation[] _Visitor__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Visitor__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _VoidType__VoidType = {};
		private static final ExecutorOperation[] _VoidType__Class = {};
		private static final ExecutorOperation[] _VoidType__Classifier = {
		    PivotTables.Operations._Classifier__allInstances /* allInstances() */,
		    PivotTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    PivotTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _VoidType__Element = {};
		private static final ExecutorOperation[] _VoidType__MonikeredElement = {
		    PivotTables.Operations._MonikeredElement__hasMoniker /* hasMoniker() */
		};
		private static final ExecutorOperation[] _VoidType__Nameable = {};
		private static final ExecutorOperation[] _VoidType__NamedElement = {};
		private static final ExecutorOperation[] _VoidType__Namespace = {};
		private static final ExecutorOperation[] _VoidType__OclAny = {
		    PivotTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    PivotTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    PivotTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    PivotTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    PivotTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    PivotTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    PivotTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    PivotTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    PivotTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    PivotTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _VoidType__ParameterableElement = {
		    PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final ExecutorOperation[] _VoidType__TemplateableElement = {
		    PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
		    PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final ExecutorOperation[] _VoidType__Type = {};
		private static final ExecutorOperation[] _VoidType__Visitable = {};
	
		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Annotation__Annotation.initOperations(_Annotation__Annotation);
			Fragments._Annotation__Classifier.initOperations(_Annotation__Classifier);
			Fragments._Annotation__Element.initOperations(_Annotation__Element);
			Fragments._Annotation__MonikeredElement.initOperations(_Annotation__MonikeredElement);
			Fragments._Annotation__Nameable.initOperations(_Annotation__Nameable);
			Fragments._Annotation__NamedElement.initOperations(_Annotation__NamedElement);
			Fragments._Annotation__OclAny.initOperations(_Annotation__OclAny);
			Fragments._Annotation__Visitable.initOperations(_Annotation__Visitable);
	
			Fragments._AnyType__AnyType.initOperations(_AnyType__AnyType);
			Fragments._AnyType__Class.initOperations(_AnyType__Class);
			Fragments._AnyType__Classifier.initOperations(_AnyType__Classifier);
			Fragments._AnyType__Element.initOperations(_AnyType__Element);
			Fragments._AnyType__MonikeredElement.initOperations(_AnyType__MonikeredElement);
			Fragments._AnyType__Nameable.initOperations(_AnyType__Nameable);
			Fragments._AnyType__NamedElement.initOperations(_AnyType__NamedElement);
			Fragments._AnyType__Namespace.initOperations(_AnyType__Namespace);
			Fragments._AnyType__OclAny.initOperations(_AnyType__OclAny);
			Fragments._AnyType__ParameterableElement.initOperations(_AnyType__ParameterableElement);
			Fragments._AnyType__TemplateableElement.initOperations(_AnyType__TemplateableElement);
			Fragments._AnyType__Type.initOperations(_AnyType__Type);
			Fragments._AnyType__Visitable.initOperations(_AnyType__Visitable);
	
			Fragments._AssociationClass__AssociationClass.initOperations(_AssociationClass__AssociationClass);
			Fragments._AssociationClass__Class.initOperations(_AssociationClass__Class);
			Fragments._AssociationClass__Classifier.initOperations(_AssociationClass__Classifier);
			Fragments._AssociationClass__Element.initOperations(_AssociationClass__Element);
			Fragments._AssociationClass__MonikeredElement.initOperations(_AssociationClass__MonikeredElement);
			Fragments._AssociationClass__Nameable.initOperations(_AssociationClass__Nameable);
			Fragments._AssociationClass__NamedElement.initOperations(_AssociationClass__NamedElement);
			Fragments._AssociationClass__Namespace.initOperations(_AssociationClass__Namespace);
			Fragments._AssociationClass__OclAny.initOperations(_AssociationClass__OclAny);
			Fragments._AssociationClass__ParameterableElement.initOperations(_AssociationClass__ParameterableElement);
			Fragments._AssociationClass__TemplateableElement.initOperations(_AssociationClass__TemplateableElement);
			Fragments._AssociationClass__Type.initOperations(_AssociationClass__Type);
			Fragments._AssociationClass__Visitable.initOperations(_AssociationClass__Visitable);
	
			Fragments._AssociationClassCallExp__AssociationClassCallExp.initOperations(_AssociationClassCallExp__AssociationClassCallExp);
			Fragments._AssociationClassCallExp__CallExp.initOperations(_AssociationClassCallExp__CallExp);
			Fragments._AssociationClassCallExp__Classifier.initOperations(_AssociationClassCallExp__Classifier);
			Fragments._AssociationClassCallExp__Element.initOperations(_AssociationClassCallExp__Element);
			Fragments._AssociationClassCallExp__FeatureCallExp.initOperations(_AssociationClassCallExp__FeatureCallExp);
			Fragments._AssociationClassCallExp__MonikeredElement.initOperations(_AssociationClassCallExp__MonikeredElement);
			Fragments._AssociationClassCallExp__Nameable.initOperations(_AssociationClassCallExp__Nameable);
			Fragments._AssociationClassCallExp__NamedElement.initOperations(_AssociationClassCallExp__NamedElement);
			Fragments._AssociationClassCallExp__NavigationCallExp.initOperations(_AssociationClassCallExp__NavigationCallExp);
			Fragments._AssociationClassCallExp__OclAny.initOperations(_AssociationClassCallExp__OclAny);
			Fragments._AssociationClassCallExp__OclExpression.initOperations(_AssociationClassCallExp__OclExpression);
			Fragments._AssociationClassCallExp__TypedElement.initOperations(_AssociationClassCallExp__TypedElement);
			Fragments._AssociationClassCallExp__Visitable.initOperations(_AssociationClassCallExp__Visitable);
	
			Fragments._AssociativityKind__AssociativityKind.initOperations(_AssociativityKind__AssociativityKind);
	
			Fragments._Bag__Bag.initOperations(_Bag__Bag);
			Fragments._Bag__Collection.initOperations(_Bag__Collection);
			Fragments._Bag__NonOrderedCollection.initOperations(_Bag__NonOrderedCollection);
			Fragments._Bag__NonUniqueCollection.initOperations(_Bag__NonUniqueCollection);
			Fragments._Bag__OclAny.initOperations(_Bag__OclAny);
	
			Fragments._BagType__BagType.initOperations(_BagType__BagType);
			Fragments._BagType__Class.initOperations(_BagType__Class);
			Fragments._BagType__Classifier.initOperations(_BagType__Classifier);
			Fragments._BagType__CollectionType.initOperations(_BagType__CollectionType);
			Fragments._BagType__DataType.initOperations(_BagType__DataType);
			Fragments._BagType__Element.initOperations(_BagType__Element);
			Fragments._BagType__MonikeredElement.initOperations(_BagType__MonikeredElement);
			Fragments._BagType__Nameable.initOperations(_BagType__Nameable);
			Fragments._BagType__NamedElement.initOperations(_BagType__NamedElement);
			Fragments._BagType__Namespace.initOperations(_BagType__Namespace);
			Fragments._BagType__OclAny.initOperations(_BagType__OclAny);
			Fragments._BagType__ParameterableElement.initOperations(_BagType__ParameterableElement);
			Fragments._BagType__TemplateableElement.initOperations(_BagType__TemplateableElement);
			Fragments._BagType__Type.initOperations(_BagType__Type);
			Fragments._BagType__Visitable.initOperations(_BagType__Visitable);
	
			Fragments._Boolean__Boolean.initOperations(_Boolean__Boolean);
			Fragments._Boolean__OclAny.initOperations(_Boolean__OclAny);
	
			Fragments._BooleanLiteralExp__BooleanLiteralExp.initOperations(_BooleanLiteralExp__BooleanLiteralExp);
			Fragments._BooleanLiteralExp__Classifier.initOperations(_BooleanLiteralExp__Classifier);
			Fragments._BooleanLiteralExp__Element.initOperations(_BooleanLiteralExp__Element);
			Fragments._BooleanLiteralExp__LiteralExp.initOperations(_BooleanLiteralExp__LiteralExp);
			Fragments._BooleanLiteralExp__MonikeredElement.initOperations(_BooleanLiteralExp__MonikeredElement);
			Fragments._BooleanLiteralExp__Nameable.initOperations(_BooleanLiteralExp__Nameable);
			Fragments._BooleanLiteralExp__NamedElement.initOperations(_BooleanLiteralExp__NamedElement);
			Fragments._BooleanLiteralExp__OclAny.initOperations(_BooleanLiteralExp__OclAny);
			Fragments._BooleanLiteralExp__OclExpression.initOperations(_BooleanLiteralExp__OclExpression);
			Fragments._BooleanLiteralExp__PrimitiveLiteralExp.initOperations(_BooleanLiteralExp__PrimitiveLiteralExp);
			Fragments._BooleanLiteralExp__TypedElement.initOperations(_BooleanLiteralExp__TypedElement);
			Fragments._BooleanLiteralExp__Visitable.initOperations(_BooleanLiteralExp__Visitable);
	
			Fragments._CallExp__CallExp.initOperations(_CallExp__CallExp);
			Fragments._CallExp__Classifier.initOperations(_CallExp__Classifier);
			Fragments._CallExp__Element.initOperations(_CallExp__Element);
			Fragments._CallExp__MonikeredElement.initOperations(_CallExp__MonikeredElement);
			Fragments._CallExp__Nameable.initOperations(_CallExp__Nameable);
			Fragments._CallExp__NamedElement.initOperations(_CallExp__NamedElement);
			Fragments._CallExp__OclAny.initOperations(_CallExp__OclAny);
			Fragments._CallExp__OclExpression.initOperations(_CallExp__OclExpression);
			Fragments._CallExp__TypedElement.initOperations(_CallExp__TypedElement);
			Fragments._CallExp__Visitable.initOperations(_CallExp__Visitable);
	
			Fragments._CallOperationAction__CallOperationAction.initOperations(_CallOperationAction__CallOperationAction);
			Fragments._CallOperationAction__Classifier.initOperations(_CallOperationAction__Classifier);
			Fragments._CallOperationAction__Element.initOperations(_CallOperationAction__Element);
			Fragments._CallOperationAction__MonikeredElement.initOperations(_CallOperationAction__MonikeredElement);
			Fragments._CallOperationAction__Nameable.initOperations(_CallOperationAction__Nameable);
			Fragments._CallOperationAction__NamedElement.initOperations(_CallOperationAction__NamedElement);
			Fragments._CallOperationAction__OclAny.initOperations(_CallOperationAction__OclAny);
			Fragments._CallOperationAction__Visitable.initOperations(_CallOperationAction__Visitable);
	
			Fragments._Class__Class.initOperations(_Class__Class);
			Fragments._Class__Classifier.initOperations(_Class__Classifier);
			Fragments._Class__Element.initOperations(_Class__Element);
			Fragments._Class__MonikeredElement.initOperations(_Class__MonikeredElement);
			Fragments._Class__Nameable.initOperations(_Class__Nameable);
			Fragments._Class__NamedElement.initOperations(_Class__NamedElement);
			Fragments._Class__Namespace.initOperations(_Class__Namespace);
			Fragments._Class__OclAny.initOperations(_Class__OclAny);
			Fragments._Class__ParameterableElement.initOperations(_Class__ParameterableElement);
			Fragments._Class__TemplateableElement.initOperations(_Class__TemplateableElement);
			Fragments._Class__Type.initOperations(_Class__Type);
			Fragments._Class__Visitable.initOperations(_Class__Visitable);
	
			Fragments._Classifier__Classifier.initOperations(_Classifier__Classifier);
			Fragments._Classifier__OclAny.initOperations(_Classifier__OclAny);
	
			Fragments._ClassifierType__Class.initOperations(_ClassifierType__Class);
			Fragments._ClassifierType__Classifier.initOperations(_ClassifierType__Classifier);
			Fragments._ClassifierType__ClassifierType.initOperations(_ClassifierType__ClassifierType);
			Fragments._ClassifierType__DataType.initOperations(_ClassifierType__DataType);
			Fragments._ClassifierType__Element.initOperations(_ClassifierType__Element);
			Fragments._ClassifierType__MonikeredElement.initOperations(_ClassifierType__MonikeredElement);
			Fragments._ClassifierType__Nameable.initOperations(_ClassifierType__Nameable);
			Fragments._ClassifierType__NamedElement.initOperations(_ClassifierType__NamedElement);
			Fragments._ClassifierType__Namespace.initOperations(_ClassifierType__Namespace);
			Fragments._ClassifierType__OclAny.initOperations(_ClassifierType__OclAny);
			Fragments._ClassifierType__ParameterableElement.initOperations(_ClassifierType__ParameterableElement);
			Fragments._ClassifierType__TemplateableElement.initOperations(_ClassifierType__TemplateableElement);
			Fragments._ClassifierType__Type.initOperations(_ClassifierType__Type);
			Fragments._ClassifierType__Visitable.initOperations(_ClassifierType__Visitable);
	
			Fragments._Collection__Collection.initOperations(_Collection__Collection);
			Fragments._Collection__OclAny.initOperations(_Collection__OclAny);
	
			Fragments._CollectionItem__Classifier.initOperations(_CollectionItem__Classifier);
			Fragments._CollectionItem__CollectionItem.initOperations(_CollectionItem__CollectionItem);
			Fragments._CollectionItem__CollectionLiteralPart.initOperations(_CollectionItem__CollectionLiteralPart);
			Fragments._CollectionItem__Element.initOperations(_CollectionItem__Element);
			Fragments._CollectionItem__MonikeredElement.initOperations(_CollectionItem__MonikeredElement);
			Fragments._CollectionItem__Nameable.initOperations(_CollectionItem__Nameable);
			Fragments._CollectionItem__NamedElement.initOperations(_CollectionItem__NamedElement);
			Fragments._CollectionItem__OclAny.initOperations(_CollectionItem__OclAny);
			Fragments._CollectionItem__TypedElement.initOperations(_CollectionItem__TypedElement);
			Fragments._CollectionItem__Visitable.initOperations(_CollectionItem__Visitable);
	
			Fragments._CollectionKind__CollectionKind.initOperations(_CollectionKind__CollectionKind);
	
			Fragments._CollectionLiteralExp__Classifier.initOperations(_CollectionLiteralExp__Classifier);
			Fragments._CollectionLiteralExp__CollectionLiteralExp.initOperations(_CollectionLiteralExp__CollectionLiteralExp);
			Fragments._CollectionLiteralExp__Element.initOperations(_CollectionLiteralExp__Element);
			Fragments._CollectionLiteralExp__LiteralExp.initOperations(_CollectionLiteralExp__LiteralExp);
			Fragments._CollectionLiteralExp__MonikeredElement.initOperations(_CollectionLiteralExp__MonikeredElement);
			Fragments._CollectionLiteralExp__Nameable.initOperations(_CollectionLiteralExp__Nameable);
			Fragments._CollectionLiteralExp__NamedElement.initOperations(_CollectionLiteralExp__NamedElement);
			Fragments._CollectionLiteralExp__OclAny.initOperations(_CollectionLiteralExp__OclAny);
			Fragments._CollectionLiteralExp__OclExpression.initOperations(_CollectionLiteralExp__OclExpression);
			Fragments._CollectionLiteralExp__TypedElement.initOperations(_CollectionLiteralExp__TypedElement);
			Fragments._CollectionLiteralExp__Visitable.initOperations(_CollectionLiteralExp__Visitable);
	
			Fragments._CollectionLiteralPart__Classifier.initOperations(_CollectionLiteralPart__Classifier);
			Fragments._CollectionLiteralPart__CollectionLiteralPart.initOperations(_CollectionLiteralPart__CollectionLiteralPart);
			Fragments._CollectionLiteralPart__Element.initOperations(_CollectionLiteralPart__Element);
			Fragments._CollectionLiteralPart__MonikeredElement.initOperations(_CollectionLiteralPart__MonikeredElement);
			Fragments._CollectionLiteralPart__Nameable.initOperations(_CollectionLiteralPart__Nameable);
			Fragments._CollectionLiteralPart__NamedElement.initOperations(_CollectionLiteralPart__NamedElement);
			Fragments._CollectionLiteralPart__OclAny.initOperations(_CollectionLiteralPart__OclAny);
			Fragments._CollectionLiteralPart__TypedElement.initOperations(_CollectionLiteralPart__TypedElement);
			Fragments._CollectionLiteralPart__Visitable.initOperations(_CollectionLiteralPart__Visitable);
	
			Fragments._CollectionRange__Classifier.initOperations(_CollectionRange__Classifier);
			Fragments._CollectionRange__CollectionLiteralPart.initOperations(_CollectionRange__CollectionLiteralPart);
			Fragments._CollectionRange__CollectionRange.initOperations(_CollectionRange__CollectionRange);
			Fragments._CollectionRange__Element.initOperations(_CollectionRange__Element);
			Fragments._CollectionRange__MonikeredElement.initOperations(_CollectionRange__MonikeredElement);
			Fragments._CollectionRange__Nameable.initOperations(_CollectionRange__Nameable);
			Fragments._CollectionRange__NamedElement.initOperations(_CollectionRange__NamedElement);
			Fragments._CollectionRange__OclAny.initOperations(_CollectionRange__OclAny);
			Fragments._CollectionRange__TypedElement.initOperations(_CollectionRange__TypedElement);
			Fragments._CollectionRange__Visitable.initOperations(_CollectionRange__Visitable);
	
			Fragments._CollectionType__Class.initOperations(_CollectionType__Class);
			Fragments._CollectionType__Classifier.initOperations(_CollectionType__Classifier);
			Fragments._CollectionType__CollectionType.initOperations(_CollectionType__CollectionType);
			Fragments._CollectionType__DataType.initOperations(_CollectionType__DataType);
			Fragments._CollectionType__Element.initOperations(_CollectionType__Element);
			Fragments._CollectionType__MonikeredElement.initOperations(_CollectionType__MonikeredElement);
			Fragments._CollectionType__Nameable.initOperations(_CollectionType__Nameable);
			Fragments._CollectionType__NamedElement.initOperations(_CollectionType__NamedElement);
			Fragments._CollectionType__Namespace.initOperations(_CollectionType__Namespace);
			Fragments._CollectionType__OclAny.initOperations(_CollectionType__OclAny);
			Fragments._CollectionType__ParameterableElement.initOperations(_CollectionType__ParameterableElement);
			Fragments._CollectionType__TemplateableElement.initOperations(_CollectionType__TemplateableElement);
			Fragments._CollectionType__Type.initOperations(_CollectionType__Type);
			Fragments._CollectionType__Visitable.initOperations(_CollectionType__Visitable);
	
			Fragments._Comment__Classifier.initOperations(_Comment__Classifier);
			Fragments._Comment__Comment.initOperations(_Comment__Comment);
			Fragments._Comment__Element.initOperations(_Comment__Element);
			Fragments._Comment__OclAny.initOperations(_Comment__OclAny);
			Fragments._Comment__Visitable.initOperations(_Comment__Visitable);
	
			Fragments._Constraint__Classifier.initOperations(_Constraint__Classifier);
			Fragments._Constraint__Constraint.initOperations(_Constraint__Constraint);
			Fragments._Constraint__Element.initOperations(_Constraint__Element);
			Fragments._Constraint__MonikeredElement.initOperations(_Constraint__MonikeredElement);
			Fragments._Constraint__Nameable.initOperations(_Constraint__Nameable);
			Fragments._Constraint__NamedElement.initOperations(_Constraint__NamedElement);
			Fragments._Constraint__OclAny.initOperations(_Constraint__OclAny);
			Fragments._Constraint__Visitable.initOperations(_Constraint__Visitable);
	
			Fragments._DataType__Class.initOperations(_DataType__Class);
			Fragments._DataType__Classifier.initOperations(_DataType__Classifier);
			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__Element.initOperations(_DataType__Element);
			Fragments._DataType__MonikeredElement.initOperations(_DataType__MonikeredElement);
			Fragments._DataType__Nameable.initOperations(_DataType__Nameable);
			Fragments._DataType__NamedElement.initOperations(_DataType__NamedElement);
			Fragments._DataType__Namespace.initOperations(_DataType__Namespace);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__ParameterableElement.initOperations(_DataType__ParameterableElement);
			Fragments._DataType__TemplateableElement.initOperations(_DataType__TemplateableElement);
			Fragments._DataType__Type.initOperations(_DataType__Type);
			Fragments._DataType__Visitable.initOperations(_DataType__Visitable);
	
			Fragments._Detail__Classifier.initOperations(_Detail__Classifier);
			Fragments._Detail__Detail.initOperations(_Detail__Detail);
			Fragments._Detail__Element.initOperations(_Detail__Element);
			Fragments._Detail__MonikeredElement.initOperations(_Detail__MonikeredElement);
			Fragments._Detail__Nameable.initOperations(_Detail__Nameable);
			Fragments._Detail__NamedElement.initOperations(_Detail__NamedElement);
			Fragments._Detail__OclAny.initOperations(_Detail__OclAny);
			Fragments._Detail__Visitable.initOperations(_Detail__Visitable);
	
			Fragments._Element__Classifier.initOperations(_Element__Classifier);
			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__Visitable.initOperations(_Element__Visitable);
	
			Fragments._EnumLiteralExp__Classifier.initOperations(_EnumLiteralExp__Classifier);
			Fragments._EnumLiteralExp__Element.initOperations(_EnumLiteralExp__Element);
			Fragments._EnumLiteralExp__EnumLiteralExp.initOperations(_EnumLiteralExp__EnumLiteralExp);
			Fragments._EnumLiteralExp__LiteralExp.initOperations(_EnumLiteralExp__LiteralExp);
			Fragments._EnumLiteralExp__MonikeredElement.initOperations(_EnumLiteralExp__MonikeredElement);
			Fragments._EnumLiteralExp__Nameable.initOperations(_EnumLiteralExp__Nameable);
			Fragments._EnumLiteralExp__NamedElement.initOperations(_EnumLiteralExp__NamedElement);
			Fragments._EnumLiteralExp__OclAny.initOperations(_EnumLiteralExp__OclAny);
			Fragments._EnumLiteralExp__OclExpression.initOperations(_EnumLiteralExp__OclExpression);
			Fragments._EnumLiteralExp__TypedElement.initOperations(_EnumLiteralExp__TypedElement);
			Fragments._EnumLiteralExp__Visitable.initOperations(_EnumLiteralExp__Visitable);
	
			Fragments._Enumeration__Class.initOperations(_Enumeration__Class);
			Fragments._Enumeration__Classifier.initOperations(_Enumeration__Classifier);
			Fragments._Enumeration__DataType.initOperations(_Enumeration__DataType);
			Fragments._Enumeration__Element.initOperations(_Enumeration__Element);
			Fragments._Enumeration__Enumeration.initOperations(_Enumeration__Enumeration);
			Fragments._Enumeration__MonikeredElement.initOperations(_Enumeration__MonikeredElement);
			Fragments._Enumeration__Nameable.initOperations(_Enumeration__Nameable);
			Fragments._Enumeration__NamedElement.initOperations(_Enumeration__NamedElement);
			Fragments._Enumeration__Namespace.initOperations(_Enumeration__Namespace);
			Fragments._Enumeration__OclAny.initOperations(_Enumeration__OclAny);
			Fragments._Enumeration__ParameterableElement.initOperations(_Enumeration__ParameterableElement);
			Fragments._Enumeration__TemplateableElement.initOperations(_Enumeration__TemplateableElement);
			Fragments._Enumeration__Type.initOperations(_Enumeration__Type);
			Fragments._Enumeration__Visitable.initOperations(_Enumeration__Visitable);
	
			Fragments._EnumerationLiteral__Classifier.initOperations(_EnumerationLiteral__Classifier);
			Fragments._EnumerationLiteral__Element.initOperations(_EnumerationLiteral__Element);
			Fragments._EnumerationLiteral__EnumerationLiteral.initOperations(_EnumerationLiteral__EnumerationLiteral);
			Fragments._EnumerationLiteral__MonikeredElement.initOperations(_EnumerationLiteral__MonikeredElement);
			Fragments._EnumerationLiteral__Nameable.initOperations(_EnumerationLiteral__Nameable);
			Fragments._EnumerationLiteral__NamedElement.initOperations(_EnumerationLiteral__NamedElement);
			Fragments._EnumerationLiteral__OclAny.initOperations(_EnumerationLiteral__OclAny);
			Fragments._EnumerationLiteral__Visitable.initOperations(_EnumerationLiteral__Visitable);
	
			Fragments._ExpressionInOcl__Classifier.initOperations(_ExpressionInOcl__Classifier);
			Fragments._ExpressionInOcl__Element.initOperations(_ExpressionInOcl__Element);
			Fragments._ExpressionInOcl__ExpressionInOcl.initOperations(_ExpressionInOcl__ExpressionInOcl);
			Fragments._ExpressionInOcl__MonikeredElement.initOperations(_ExpressionInOcl__MonikeredElement);
			Fragments._ExpressionInOcl__Nameable.initOperations(_ExpressionInOcl__Nameable);
			Fragments._ExpressionInOcl__NamedElement.initOperations(_ExpressionInOcl__NamedElement);
			Fragments._ExpressionInOcl__OclAny.initOperations(_ExpressionInOcl__OclAny);
			Fragments._ExpressionInOcl__OpaqueExpression.initOperations(_ExpressionInOcl__OpaqueExpression);
			Fragments._ExpressionInOcl__ParameterableElement.initOperations(_ExpressionInOcl__ParameterableElement);
			Fragments._ExpressionInOcl__TypedElement.initOperations(_ExpressionInOcl__TypedElement);
			Fragments._ExpressionInOcl__ValueSpecification.initOperations(_ExpressionInOcl__ValueSpecification);
			Fragments._ExpressionInOcl__Visitable.initOperations(_ExpressionInOcl__Visitable);
	
			Fragments._Feature__Classifier.initOperations(_Feature__Classifier);
			Fragments._Feature__Element.initOperations(_Feature__Element);
			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__MonikeredElement.initOperations(_Feature__MonikeredElement);
			Fragments._Feature__MultiplicityElement.initOperations(_Feature__MultiplicityElement);
			Fragments._Feature__Nameable.initOperations(_Feature__Nameable);
			Fragments._Feature__NamedElement.initOperations(_Feature__NamedElement);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__TypedElement.initOperations(_Feature__TypedElement);
			Fragments._Feature__TypedMultiplicityElement.initOperations(_Feature__TypedMultiplicityElement);
			Fragments._Feature__Visitable.initOperations(_Feature__Visitable);
	
			Fragments._FeatureCallExp__CallExp.initOperations(_FeatureCallExp__CallExp);
			Fragments._FeatureCallExp__Classifier.initOperations(_FeatureCallExp__Classifier);
			Fragments._FeatureCallExp__Element.initOperations(_FeatureCallExp__Element);
			Fragments._FeatureCallExp__FeatureCallExp.initOperations(_FeatureCallExp__FeatureCallExp);
			Fragments._FeatureCallExp__MonikeredElement.initOperations(_FeatureCallExp__MonikeredElement);
			Fragments._FeatureCallExp__Nameable.initOperations(_FeatureCallExp__Nameable);
			Fragments._FeatureCallExp__NamedElement.initOperations(_FeatureCallExp__NamedElement);
			Fragments._FeatureCallExp__OclAny.initOperations(_FeatureCallExp__OclAny);
			Fragments._FeatureCallExp__OclExpression.initOperations(_FeatureCallExp__OclExpression);
			Fragments._FeatureCallExp__TypedElement.initOperations(_FeatureCallExp__TypedElement);
			Fragments._FeatureCallExp__Visitable.initOperations(_FeatureCallExp__Visitable);
	
			Fragments._IfExp__Classifier.initOperations(_IfExp__Classifier);
			Fragments._IfExp__Element.initOperations(_IfExp__Element);
			Fragments._IfExp__IfExp.initOperations(_IfExp__IfExp);
			Fragments._IfExp__MonikeredElement.initOperations(_IfExp__MonikeredElement);
			Fragments._IfExp__Nameable.initOperations(_IfExp__Nameable);
			Fragments._IfExp__NamedElement.initOperations(_IfExp__NamedElement);
			Fragments._IfExp__OclAny.initOperations(_IfExp__OclAny);
			Fragments._IfExp__OclExpression.initOperations(_IfExp__OclExpression);
			Fragments._IfExp__TypedElement.initOperations(_IfExp__TypedElement);
			Fragments._IfExp__Visitable.initOperations(_IfExp__Visitable);
	
			Fragments._Int__Int.initOperations(_Int__Int);
	
			Fragments._Integer__Integer.initOperations(_Integer__Integer);
			Fragments._Integer__OclAny.initOperations(_Integer__OclAny);
			Fragments._Integer__Real.initOperations(_Integer__Real);
	
			Fragments._IntegerLiteralExp__Classifier.initOperations(_IntegerLiteralExp__Classifier);
			Fragments._IntegerLiteralExp__Element.initOperations(_IntegerLiteralExp__Element);
			Fragments._IntegerLiteralExp__IntegerLiteralExp.initOperations(_IntegerLiteralExp__IntegerLiteralExp);
			Fragments._IntegerLiteralExp__LiteralExp.initOperations(_IntegerLiteralExp__LiteralExp);
			Fragments._IntegerLiteralExp__MonikeredElement.initOperations(_IntegerLiteralExp__MonikeredElement);
			Fragments._IntegerLiteralExp__Nameable.initOperations(_IntegerLiteralExp__Nameable);
			Fragments._IntegerLiteralExp__NamedElement.initOperations(_IntegerLiteralExp__NamedElement);
			Fragments._IntegerLiteralExp__NumericLiteralExp.initOperations(_IntegerLiteralExp__NumericLiteralExp);
			Fragments._IntegerLiteralExp__OclAny.initOperations(_IntegerLiteralExp__OclAny);
			Fragments._IntegerLiteralExp__OclExpression.initOperations(_IntegerLiteralExp__OclExpression);
			Fragments._IntegerLiteralExp__PrimitiveLiteralExp.initOperations(_IntegerLiteralExp__PrimitiveLiteralExp);
			Fragments._IntegerLiteralExp__TypedElement.initOperations(_IntegerLiteralExp__TypedElement);
			Fragments._IntegerLiteralExp__Visitable.initOperations(_IntegerLiteralExp__Visitable);
	
			Fragments._InvalidLiteralExp__Classifier.initOperations(_InvalidLiteralExp__Classifier);
			Fragments._InvalidLiteralExp__Element.initOperations(_InvalidLiteralExp__Element);
			Fragments._InvalidLiteralExp__InvalidLiteralExp.initOperations(_InvalidLiteralExp__InvalidLiteralExp);
			Fragments._InvalidLiteralExp__LiteralExp.initOperations(_InvalidLiteralExp__LiteralExp);
			Fragments._InvalidLiteralExp__MonikeredElement.initOperations(_InvalidLiteralExp__MonikeredElement);
			Fragments._InvalidLiteralExp__Nameable.initOperations(_InvalidLiteralExp__Nameable);
			Fragments._InvalidLiteralExp__NamedElement.initOperations(_InvalidLiteralExp__NamedElement);
			Fragments._InvalidLiteralExp__OclAny.initOperations(_InvalidLiteralExp__OclAny);
			Fragments._InvalidLiteralExp__OclExpression.initOperations(_InvalidLiteralExp__OclExpression);
			Fragments._InvalidLiteralExp__PrimitiveLiteralExp.initOperations(_InvalidLiteralExp__PrimitiveLiteralExp);
			Fragments._InvalidLiteralExp__TypedElement.initOperations(_InvalidLiteralExp__TypedElement);
			Fragments._InvalidLiteralExp__Visitable.initOperations(_InvalidLiteralExp__Visitable);
	
			Fragments._InvalidType__Class.initOperations(_InvalidType__Class);
			Fragments._InvalidType__Classifier.initOperations(_InvalidType__Classifier);
			Fragments._InvalidType__Element.initOperations(_InvalidType__Element);
			Fragments._InvalidType__InvalidType.initOperations(_InvalidType__InvalidType);
			Fragments._InvalidType__MonikeredElement.initOperations(_InvalidType__MonikeredElement);
			Fragments._InvalidType__Nameable.initOperations(_InvalidType__Nameable);
			Fragments._InvalidType__NamedElement.initOperations(_InvalidType__NamedElement);
			Fragments._InvalidType__Namespace.initOperations(_InvalidType__Namespace);
			Fragments._InvalidType__OclAny.initOperations(_InvalidType__OclAny);
			Fragments._InvalidType__ParameterableElement.initOperations(_InvalidType__ParameterableElement);
			Fragments._InvalidType__TemplateableElement.initOperations(_InvalidType__TemplateableElement);
			Fragments._InvalidType__Type.initOperations(_InvalidType__Type);
			Fragments._InvalidType__Visitable.initOperations(_InvalidType__Visitable);
	
			Fragments._IterateExp__CallExp.initOperations(_IterateExp__CallExp);
			Fragments._IterateExp__Classifier.initOperations(_IterateExp__Classifier);
			Fragments._IterateExp__Element.initOperations(_IterateExp__Element);
			Fragments._IterateExp__IterateExp.initOperations(_IterateExp__IterateExp);
			Fragments._IterateExp__LoopExp.initOperations(_IterateExp__LoopExp);
			Fragments._IterateExp__MonikeredElement.initOperations(_IterateExp__MonikeredElement);
			Fragments._IterateExp__Nameable.initOperations(_IterateExp__Nameable);
			Fragments._IterateExp__NamedElement.initOperations(_IterateExp__NamedElement);
			Fragments._IterateExp__OclAny.initOperations(_IterateExp__OclAny);
			Fragments._IterateExp__OclExpression.initOperations(_IterateExp__OclExpression);
			Fragments._IterateExp__TypedElement.initOperations(_IterateExp__TypedElement);
			Fragments._IterateExp__Visitable.initOperations(_IterateExp__Visitable);
	
			Fragments._Iteration__Classifier.initOperations(_Iteration__Classifier);
			Fragments._Iteration__Element.initOperations(_Iteration__Element);
			Fragments._Iteration__Feature.initOperations(_Iteration__Feature);
			Fragments._Iteration__Iteration.initOperations(_Iteration__Iteration);
			Fragments._Iteration__MonikeredElement.initOperations(_Iteration__MonikeredElement);
			Fragments._Iteration__MultiplicityElement.initOperations(_Iteration__MultiplicityElement);
			Fragments._Iteration__Nameable.initOperations(_Iteration__Nameable);
			Fragments._Iteration__NamedElement.initOperations(_Iteration__NamedElement);
			Fragments._Iteration__Namespace.initOperations(_Iteration__Namespace);
			Fragments._Iteration__OclAny.initOperations(_Iteration__OclAny);
			Fragments._Iteration__Operation.initOperations(_Iteration__Operation);
			Fragments._Iteration__ParameterableElement.initOperations(_Iteration__ParameterableElement);
			Fragments._Iteration__TemplateableElement.initOperations(_Iteration__TemplateableElement);
			Fragments._Iteration__TypedElement.initOperations(_Iteration__TypedElement);
			Fragments._Iteration__TypedMultiplicityElement.initOperations(_Iteration__TypedMultiplicityElement);
			Fragments._Iteration__Visitable.initOperations(_Iteration__Visitable);
	
			Fragments._IteratorExp__CallExp.initOperations(_IteratorExp__CallExp);
			Fragments._IteratorExp__Classifier.initOperations(_IteratorExp__Classifier);
			Fragments._IteratorExp__Element.initOperations(_IteratorExp__Element);
			Fragments._IteratorExp__IteratorExp.initOperations(_IteratorExp__IteratorExp);
			Fragments._IteratorExp__LoopExp.initOperations(_IteratorExp__LoopExp);
			Fragments._IteratorExp__MonikeredElement.initOperations(_IteratorExp__MonikeredElement);
			Fragments._IteratorExp__Nameable.initOperations(_IteratorExp__Nameable);
			Fragments._IteratorExp__NamedElement.initOperations(_IteratorExp__NamedElement);
			Fragments._IteratorExp__OclAny.initOperations(_IteratorExp__OclAny);
			Fragments._IteratorExp__OclExpression.initOperations(_IteratorExp__OclExpression);
			Fragments._IteratorExp__TypedElement.initOperations(_IteratorExp__TypedElement);
			Fragments._IteratorExp__Visitable.initOperations(_IteratorExp__Visitable);
	
			Fragments._LambdaType__Class.initOperations(_LambdaType__Class);
			Fragments._LambdaType__Classifier.initOperations(_LambdaType__Classifier);
			Fragments._LambdaType__DataType.initOperations(_LambdaType__DataType);
			Fragments._LambdaType__Element.initOperations(_LambdaType__Element);
			Fragments._LambdaType__LambdaType.initOperations(_LambdaType__LambdaType);
			Fragments._LambdaType__MonikeredElement.initOperations(_LambdaType__MonikeredElement);
			Fragments._LambdaType__Nameable.initOperations(_LambdaType__Nameable);
			Fragments._LambdaType__NamedElement.initOperations(_LambdaType__NamedElement);
			Fragments._LambdaType__Namespace.initOperations(_LambdaType__Namespace);
			Fragments._LambdaType__OclAny.initOperations(_LambdaType__OclAny);
			Fragments._LambdaType__ParameterableElement.initOperations(_LambdaType__ParameterableElement);
			Fragments._LambdaType__TemplateableElement.initOperations(_LambdaType__TemplateableElement);
			Fragments._LambdaType__Type.initOperations(_LambdaType__Type);
			Fragments._LambdaType__Visitable.initOperations(_LambdaType__Visitable);
	
			Fragments._LetExp__Classifier.initOperations(_LetExp__Classifier);
			Fragments._LetExp__Element.initOperations(_LetExp__Element);
			Fragments._LetExp__LetExp.initOperations(_LetExp__LetExp);
			Fragments._LetExp__MonikeredElement.initOperations(_LetExp__MonikeredElement);
			Fragments._LetExp__Nameable.initOperations(_LetExp__Nameable);
			Fragments._LetExp__NamedElement.initOperations(_LetExp__NamedElement);
			Fragments._LetExp__OclAny.initOperations(_LetExp__OclAny);
			Fragments._LetExp__OclExpression.initOperations(_LetExp__OclExpression);
			Fragments._LetExp__TypedElement.initOperations(_LetExp__TypedElement);
			Fragments._LetExp__Visitable.initOperations(_LetExp__Visitable);
	
			Fragments._Library__Classifier.initOperations(_Library__Classifier);
			Fragments._Library__Element.initOperations(_Library__Element);
			Fragments._Library__Library.initOperations(_Library__Library);
			Fragments._Library__MonikeredElement.initOperations(_Library__MonikeredElement);
			Fragments._Library__Nameable.initOperations(_Library__Nameable);
			Fragments._Library__NamedElement.initOperations(_Library__NamedElement);
			Fragments._Library__Namespace.initOperations(_Library__Namespace);
			Fragments._Library__OclAny.initOperations(_Library__OclAny);
			Fragments._Library__Package.initOperations(_Library__Package);
			Fragments._Library__TemplateableElement.initOperations(_Library__TemplateableElement);
			Fragments._Library__Visitable.initOperations(_Library__Visitable);
	
			Fragments._LibraryFeature__LibraryFeature.initOperations(_LibraryFeature__LibraryFeature);
	
			Fragments._LiteralExp__Classifier.initOperations(_LiteralExp__Classifier);
			Fragments._LiteralExp__Element.initOperations(_LiteralExp__Element);
			Fragments._LiteralExp__LiteralExp.initOperations(_LiteralExp__LiteralExp);
			Fragments._LiteralExp__MonikeredElement.initOperations(_LiteralExp__MonikeredElement);
			Fragments._LiteralExp__Nameable.initOperations(_LiteralExp__Nameable);
			Fragments._LiteralExp__NamedElement.initOperations(_LiteralExp__NamedElement);
			Fragments._LiteralExp__OclAny.initOperations(_LiteralExp__OclAny);
			Fragments._LiteralExp__OclExpression.initOperations(_LiteralExp__OclExpression);
			Fragments._LiteralExp__TypedElement.initOperations(_LiteralExp__TypedElement);
			Fragments._LiteralExp__Visitable.initOperations(_LiteralExp__Visitable);
	
			Fragments._LoopExp__CallExp.initOperations(_LoopExp__CallExp);
			Fragments._LoopExp__Classifier.initOperations(_LoopExp__Classifier);
			Fragments._LoopExp__Element.initOperations(_LoopExp__Element);
			Fragments._LoopExp__LoopExp.initOperations(_LoopExp__LoopExp);
			Fragments._LoopExp__MonikeredElement.initOperations(_LoopExp__MonikeredElement);
			Fragments._LoopExp__Nameable.initOperations(_LoopExp__Nameable);
			Fragments._LoopExp__NamedElement.initOperations(_LoopExp__NamedElement);
			Fragments._LoopExp__OclAny.initOperations(_LoopExp__OclAny);
			Fragments._LoopExp__OclExpression.initOperations(_LoopExp__OclExpression);
			Fragments._LoopExp__TypedElement.initOperations(_LoopExp__TypedElement);
			Fragments._LoopExp__Visitable.initOperations(_LoopExp__Visitable);
	
			Fragments._MessageExp__Classifier.initOperations(_MessageExp__Classifier);
			Fragments._MessageExp__Element.initOperations(_MessageExp__Element);
			Fragments._MessageExp__MessageExp.initOperations(_MessageExp__MessageExp);
			Fragments._MessageExp__MonikeredElement.initOperations(_MessageExp__MonikeredElement);
			Fragments._MessageExp__Nameable.initOperations(_MessageExp__Nameable);
			Fragments._MessageExp__NamedElement.initOperations(_MessageExp__NamedElement);
			Fragments._MessageExp__OclAny.initOperations(_MessageExp__OclAny);
			Fragments._MessageExp__OclExpression.initOperations(_MessageExp__OclExpression);
			Fragments._MessageExp__TypedElement.initOperations(_MessageExp__TypedElement);
			Fragments._MessageExp__Visitable.initOperations(_MessageExp__Visitable);
	
			Fragments._MessageType__Classifier.initOperations(_MessageType__Classifier);
			Fragments._MessageType__Element.initOperations(_MessageType__Element);
			Fragments._MessageType__MessageType.initOperations(_MessageType__MessageType);
			Fragments._MessageType__MonikeredElement.initOperations(_MessageType__MonikeredElement);
			Fragments._MessageType__Nameable.initOperations(_MessageType__Nameable);
			Fragments._MessageType__NamedElement.initOperations(_MessageType__NamedElement);
			Fragments._MessageType__OclAny.initOperations(_MessageType__OclAny);
			Fragments._MessageType__ParameterableElement.initOperations(_MessageType__ParameterableElement);
			Fragments._MessageType__TemplateableElement.initOperations(_MessageType__TemplateableElement);
			Fragments._MessageType__Type.initOperations(_MessageType__Type);
			Fragments._MessageType__Visitable.initOperations(_MessageType__Visitable);
	
			Fragments._MonikeredElement__Classifier.initOperations(_MonikeredElement__Classifier);
			Fragments._MonikeredElement__Element.initOperations(_MonikeredElement__Element);
			Fragments._MonikeredElement__MonikeredElement.initOperations(_MonikeredElement__MonikeredElement);
			Fragments._MonikeredElement__OclAny.initOperations(_MonikeredElement__OclAny);
			Fragments._MonikeredElement__Visitable.initOperations(_MonikeredElement__Visitable);
	
			Fragments._MultiplicityElement__Classifier.initOperations(_MultiplicityElement__Classifier);
			Fragments._MultiplicityElement__Element.initOperations(_MultiplicityElement__Element);
			Fragments._MultiplicityElement__MonikeredElement.initOperations(_MultiplicityElement__MonikeredElement);
			Fragments._MultiplicityElement__MultiplicityElement.initOperations(_MultiplicityElement__MultiplicityElement);
			Fragments._MultiplicityElement__OclAny.initOperations(_MultiplicityElement__OclAny);
			Fragments._MultiplicityElement__Visitable.initOperations(_MultiplicityElement__Visitable);
	
			Fragments._Nameable__Classifier.initOperations(_Nameable__Classifier);
			Fragments._Nameable__Nameable.initOperations(_Nameable__Nameable);
			Fragments._Nameable__OclAny.initOperations(_Nameable__OclAny);
	
			Fragments._NamedElement__Classifier.initOperations(_NamedElement__Classifier);
			Fragments._NamedElement__Element.initOperations(_NamedElement__Element);
			Fragments._NamedElement__MonikeredElement.initOperations(_NamedElement__MonikeredElement);
			Fragments._NamedElement__Nameable.initOperations(_NamedElement__Nameable);
			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__Visitable.initOperations(_NamedElement__Visitable);
	
			Fragments._Namespace__Classifier.initOperations(_Namespace__Classifier);
			Fragments._Namespace__Element.initOperations(_Namespace__Element);
			Fragments._Namespace__MonikeredElement.initOperations(_Namespace__MonikeredElement);
			Fragments._Namespace__Nameable.initOperations(_Namespace__Nameable);
			Fragments._Namespace__NamedElement.initOperations(_Namespace__NamedElement);
			Fragments._Namespace__Namespace.initOperations(_Namespace__Namespace);
			Fragments._Namespace__OclAny.initOperations(_Namespace__OclAny);
			Fragments._Namespace__Visitable.initOperations(_Namespace__Visitable);
	
			Fragments._NavigationCallExp__CallExp.initOperations(_NavigationCallExp__CallExp);
			Fragments._NavigationCallExp__Classifier.initOperations(_NavigationCallExp__Classifier);
			Fragments._NavigationCallExp__Element.initOperations(_NavigationCallExp__Element);
			Fragments._NavigationCallExp__FeatureCallExp.initOperations(_NavigationCallExp__FeatureCallExp);
			Fragments._NavigationCallExp__MonikeredElement.initOperations(_NavigationCallExp__MonikeredElement);
			Fragments._NavigationCallExp__Nameable.initOperations(_NavigationCallExp__Nameable);
			Fragments._NavigationCallExp__NamedElement.initOperations(_NavigationCallExp__NamedElement);
			Fragments._NavigationCallExp__NavigationCallExp.initOperations(_NavigationCallExp__NavigationCallExp);
			Fragments._NavigationCallExp__OclAny.initOperations(_NavigationCallExp__OclAny);
			Fragments._NavigationCallExp__OclExpression.initOperations(_NavigationCallExp__OclExpression);
			Fragments._NavigationCallExp__TypedElement.initOperations(_NavigationCallExp__TypedElement);
			Fragments._NavigationCallExp__Visitable.initOperations(_NavigationCallExp__Visitable);
	
			Fragments._NonOrderedCollection__Collection.initOperations(_NonOrderedCollection__Collection);
			Fragments._NonOrderedCollection__NonOrderedCollection.initOperations(_NonOrderedCollection__NonOrderedCollection);
			Fragments._NonOrderedCollection__OclAny.initOperations(_NonOrderedCollection__OclAny);
	
			Fragments._NonUniqueCollection__Collection.initOperations(_NonUniqueCollection__Collection);
			Fragments._NonUniqueCollection__NonUniqueCollection.initOperations(_NonUniqueCollection__NonUniqueCollection);
			Fragments._NonUniqueCollection__OclAny.initOperations(_NonUniqueCollection__OclAny);
	
			Fragments._NullLiteralExp__Classifier.initOperations(_NullLiteralExp__Classifier);
			Fragments._NullLiteralExp__Element.initOperations(_NullLiteralExp__Element);
			Fragments._NullLiteralExp__LiteralExp.initOperations(_NullLiteralExp__LiteralExp);
			Fragments._NullLiteralExp__MonikeredElement.initOperations(_NullLiteralExp__MonikeredElement);
			Fragments._NullLiteralExp__Nameable.initOperations(_NullLiteralExp__Nameable);
			Fragments._NullLiteralExp__NamedElement.initOperations(_NullLiteralExp__NamedElement);
			Fragments._NullLiteralExp__NullLiteralExp.initOperations(_NullLiteralExp__NullLiteralExp);
			Fragments._NullLiteralExp__OclAny.initOperations(_NullLiteralExp__OclAny);
			Fragments._NullLiteralExp__OclExpression.initOperations(_NullLiteralExp__OclExpression);
			Fragments._NullLiteralExp__PrimitiveLiteralExp.initOperations(_NullLiteralExp__PrimitiveLiteralExp);
			Fragments._NullLiteralExp__TypedElement.initOperations(_NullLiteralExp__TypedElement);
			Fragments._NullLiteralExp__Visitable.initOperations(_NullLiteralExp__Visitable);
	
			Fragments._NumericLiteralExp__Classifier.initOperations(_NumericLiteralExp__Classifier);
			Fragments._NumericLiteralExp__Element.initOperations(_NumericLiteralExp__Element);
			Fragments._NumericLiteralExp__LiteralExp.initOperations(_NumericLiteralExp__LiteralExp);
			Fragments._NumericLiteralExp__MonikeredElement.initOperations(_NumericLiteralExp__MonikeredElement);
			Fragments._NumericLiteralExp__Nameable.initOperations(_NumericLiteralExp__Nameable);
			Fragments._NumericLiteralExp__NamedElement.initOperations(_NumericLiteralExp__NamedElement);
			Fragments._NumericLiteralExp__NumericLiteralExp.initOperations(_NumericLiteralExp__NumericLiteralExp);
			Fragments._NumericLiteralExp__OclAny.initOperations(_NumericLiteralExp__OclAny);
			Fragments._NumericLiteralExp__OclExpression.initOperations(_NumericLiteralExp__OclExpression);
			Fragments._NumericLiteralExp__PrimitiveLiteralExp.initOperations(_NumericLiteralExp__PrimitiveLiteralExp);
			Fragments._NumericLiteralExp__TypedElement.initOperations(_NumericLiteralExp__TypedElement);
			Fragments._NumericLiteralExp__Visitable.initOperations(_NumericLiteralExp__Visitable);
	
			Fragments._Object__Object.initOperations(_Object__Object);
	
			Fragments._OclAny__OclAny.initOperations(_OclAny__OclAny);
	
			Fragments._OclExpression__Classifier.initOperations(_OclExpression__Classifier);
			Fragments._OclExpression__Element.initOperations(_OclExpression__Element);
			Fragments._OclExpression__MonikeredElement.initOperations(_OclExpression__MonikeredElement);
			Fragments._OclExpression__Nameable.initOperations(_OclExpression__Nameable);
			Fragments._OclExpression__NamedElement.initOperations(_OclExpression__NamedElement);
			Fragments._OclExpression__OclAny.initOperations(_OclExpression__OclAny);
			Fragments._OclExpression__OclExpression.initOperations(_OclExpression__OclExpression);
			Fragments._OclExpression__TypedElement.initOperations(_OclExpression__TypedElement);
			Fragments._OclExpression__Visitable.initOperations(_OclExpression__Visitable);
	
			Fragments._OclInvalid__OclAny.initOperations(_OclInvalid__OclAny);
			Fragments._OclInvalid__OclInvalid.initOperations(_OclInvalid__OclInvalid);
			Fragments._OclInvalid__OclVoid.initOperations(_OclInvalid__OclVoid);
	
			Fragments._OclMessage__OclAny.initOperations(_OclMessage__OclAny);
			Fragments._OclMessage__OclMessage.initOperations(_OclMessage__OclMessage);
	
			Fragments._OclSelf__OclAny.initOperations(_OclSelf__OclAny);
			Fragments._OclSelf__OclSelf.initOperations(_OclSelf__OclSelf);
	
			Fragments._OclState__OclAny.initOperations(_OclState__OclAny);
			Fragments._OclState__OclState.initOperations(_OclState__OclState);
	
			Fragments._OclTuple__OclAny.initOperations(_OclTuple__OclAny);
			Fragments._OclTuple__OclTuple.initOperations(_OclTuple__OclTuple);
	
			Fragments._OclVoid__OclAny.initOperations(_OclVoid__OclAny);
			Fragments._OclVoid__OclVoid.initOperations(_OclVoid__OclVoid);
	
			Fragments._OpaqueExpression__Classifier.initOperations(_OpaqueExpression__Classifier);
			Fragments._OpaqueExpression__Element.initOperations(_OpaqueExpression__Element);
			Fragments._OpaqueExpression__MonikeredElement.initOperations(_OpaqueExpression__MonikeredElement);
			Fragments._OpaqueExpression__Nameable.initOperations(_OpaqueExpression__Nameable);
			Fragments._OpaqueExpression__NamedElement.initOperations(_OpaqueExpression__NamedElement);
			Fragments._OpaqueExpression__OclAny.initOperations(_OpaqueExpression__OclAny);
			Fragments._OpaqueExpression__OpaqueExpression.initOperations(_OpaqueExpression__OpaqueExpression);
			Fragments._OpaqueExpression__ParameterableElement.initOperations(_OpaqueExpression__ParameterableElement);
			Fragments._OpaqueExpression__TypedElement.initOperations(_OpaqueExpression__TypedElement);
			Fragments._OpaqueExpression__ValueSpecification.initOperations(_OpaqueExpression__ValueSpecification);
			Fragments._OpaqueExpression__Visitable.initOperations(_OpaqueExpression__Visitable);
	
			Fragments._Operation__Classifier.initOperations(_Operation__Classifier);
			Fragments._Operation__Element.initOperations(_Operation__Element);
			Fragments._Operation__Feature.initOperations(_Operation__Feature);
			Fragments._Operation__MonikeredElement.initOperations(_Operation__MonikeredElement);
			Fragments._Operation__MultiplicityElement.initOperations(_Operation__MultiplicityElement);
			Fragments._Operation__Nameable.initOperations(_Operation__Nameable);
			Fragments._Operation__NamedElement.initOperations(_Operation__NamedElement);
			Fragments._Operation__Namespace.initOperations(_Operation__Namespace);
			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);
			Fragments._Operation__ParameterableElement.initOperations(_Operation__ParameterableElement);
			Fragments._Operation__TemplateableElement.initOperations(_Operation__TemplateableElement);
			Fragments._Operation__TypedElement.initOperations(_Operation__TypedElement);
			Fragments._Operation__TypedMultiplicityElement.initOperations(_Operation__TypedMultiplicityElement);
			Fragments._Operation__Visitable.initOperations(_Operation__Visitable);
	
			Fragments._OperationCallExp__CallExp.initOperations(_OperationCallExp__CallExp);
			Fragments._OperationCallExp__Classifier.initOperations(_OperationCallExp__Classifier);
			Fragments._OperationCallExp__Element.initOperations(_OperationCallExp__Element);
			Fragments._OperationCallExp__FeatureCallExp.initOperations(_OperationCallExp__FeatureCallExp);
			Fragments._OperationCallExp__MonikeredElement.initOperations(_OperationCallExp__MonikeredElement);
			Fragments._OperationCallExp__Nameable.initOperations(_OperationCallExp__Nameable);
			Fragments._OperationCallExp__NamedElement.initOperations(_OperationCallExp__NamedElement);
			Fragments._OperationCallExp__OclAny.initOperations(_OperationCallExp__OclAny);
			Fragments._OperationCallExp__OclExpression.initOperations(_OperationCallExp__OclExpression);
			Fragments._OperationCallExp__OperationCallExp.initOperations(_OperationCallExp__OperationCallExp);
			Fragments._OperationCallExp__TypedElement.initOperations(_OperationCallExp__TypedElement);
			Fragments._OperationCallExp__Visitable.initOperations(_OperationCallExp__Visitable);
	
			Fragments._OperationTemplateParameter__Classifier.initOperations(_OperationTemplateParameter__Classifier);
			Fragments._OperationTemplateParameter__Element.initOperations(_OperationTemplateParameter__Element);
			Fragments._OperationTemplateParameter__OclAny.initOperations(_OperationTemplateParameter__OclAny);
			Fragments._OperationTemplateParameter__OperationTemplateParameter.initOperations(_OperationTemplateParameter__OperationTemplateParameter);
			Fragments._OperationTemplateParameter__TemplateParameter.initOperations(_OperationTemplateParameter__TemplateParameter);
			Fragments._OperationTemplateParameter__Visitable.initOperations(_OperationTemplateParameter__Visitable);
	
			Fragments._OrderedCollection__Collection.initOperations(_OrderedCollection__Collection);
			Fragments._OrderedCollection__OclAny.initOperations(_OrderedCollection__OclAny);
			Fragments._OrderedCollection__OrderedCollection.initOperations(_OrderedCollection__OrderedCollection);
	
			Fragments._OrderedSet__Collection.initOperations(_OrderedSet__Collection);
			Fragments._OrderedSet__OclAny.initOperations(_OrderedSet__OclAny);
			Fragments._OrderedSet__OrderedCollection.initOperations(_OrderedSet__OrderedCollection);
			Fragments._OrderedSet__OrderedSet.initOperations(_OrderedSet__OrderedSet);
			Fragments._OrderedSet__UniqueCollection.initOperations(_OrderedSet__UniqueCollection);
	
			Fragments._OrderedSetType__Class.initOperations(_OrderedSetType__Class);
			Fragments._OrderedSetType__Classifier.initOperations(_OrderedSetType__Classifier);
			Fragments._OrderedSetType__CollectionType.initOperations(_OrderedSetType__CollectionType);
			Fragments._OrderedSetType__DataType.initOperations(_OrderedSetType__DataType);
			Fragments._OrderedSetType__Element.initOperations(_OrderedSetType__Element);
			Fragments._OrderedSetType__MonikeredElement.initOperations(_OrderedSetType__MonikeredElement);
			Fragments._OrderedSetType__Nameable.initOperations(_OrderedSetType__Nameable);
			Fragments._OrderedSetType__NamedElement.initOperations(_OrderedSetType__NamedElement);
			Fragments._OrderedSetType__Namespace.initOperations(_OrderedSetType__Namespace);
			Fragments._OrderedSetType__OclAny.initOperations(_OrderedSetType__OclAny);
			Fragments._OrderedSetType__OrderedSetType.initOperations(_OrderedSetType__OrderedSetType);
			Fragments._OrderedSetType__ParameterableElement.initOperations(_OrderedSetType__ParameterableElement);
			Fragments._OrderedSetType__TemplateableElement.initOperations(_OrderedSetType__TemplateableElement);
			Fragments._OrderedSetType__Type.initOperations(_OrderedSetType__Type);
			Fragments._OrderedSetType__Visitable.initOperations(_OrderedSetType__Visitable);
	
			Fragments._Package__Classifier.initOperations(_Package__Classifier);
			Fragments._Package__Element.initOperations(_Package__Element);
			Fragments._Package__MonikeredElement.initOperations(_Package__MonikeredElement);
			Fragments._Package__Nameable.initOperations(_Package__Nameable);
			Fragments._Package__NamedElement.initOperations(_Package__NamedElement);
			Fragments._Package__Namespace.initOperations(_Package__Namespace);
			Fragments._Package__OclAny.initOperations(_Package__OclAny);
			Fragments._Package__Package.initOperations(_Package__Package);
			Fragments._Package__TemplateableElement.initOperations(_Package__TemplateableElement);
			Fragments._Package__Visitable.initOperations(_Package__Visitable);
	
			Fragments._PackageableElement__Classifier.initOperations(_PackageableElement__Classifier);
			Fragments._PackageableElement__Element.initOperations(_PackageableElement__Element);
			Fragments._PackageableElement__MonikeredElement.initOperations(_PackageableElement__MonikeredElement);
			Fragments._PackageableElement__OclAny.initOperations(_PackageableElement__OclAny);
			Fragments._PackageableElement__PackageableElement.initOperations(_PackageableElement__PackageableElement);
			Fragments._PackageableElement__ParameterableElement.initOperations(_PackageableElement__ParameterableElement);
			Fragments._PackageableElement__Visitable.initOperations(_PackageableElement__Visitable);
	
			Fragments._Parameter__Classifier.initOperations(_Parameter__Classifier);
			Fragments._Parameter__Element.initOperations(_Parameter__Element);
			Fragments._Parameter__MonikeredElement.initOperations(_Parameter__MonikeredElement);
			Fragments._Parameter__MultiplicityElement.initOperations(_Parameter__MultiplicityElement);
			Fragments._Parameter__Nameable.initOperations(_Parameter__Nameable);
			Fragments._Parameter__NamedElement.initOperations(_Parameter__NamedElement);
			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);
			Fragments._Parameter__TypedElement.initOperations(_Parameter__TypedElement);
			Fragments._Parameter__TypedMultiplicityElement.initOperations(_Parameter__TypedMultiplicityElement);
			Fragments._Parameter__VariableDeclaration.initOperations(_Parameter__VariableDeclaration);
			Fragments._Parameter__Visitable.initOperations(_Parameter__Visitable);
	
			Fragments._ParameterableElement__Classifier.initOperations(_ParameterableElement__Classifier);
			Fragments._ParameterableElement__Element.initOperations(_ParameterableElement__Element);
			Fragments._ParameterableElement__MonikeredElement.initOperations(_ParameterableElement__MonikeredElement);
			Fragments._ParameterableElement__OclAny.initOperations(_ParameterableElement__OclAny);
			Fragments._ParameterableElement__ParameterableElement.initOperations(_ParameterableElement__ParameterableElement);
			Fragments._ParameterableElement__Visitable.initOperations(_ParameterableElement__Visitable);
	
			Fragments._Pivotable__Classifier.initOperations(_Pivotable__Classifier);
			Fragments._Pivotable__OclAny.initOperations(_Pivotable__OclAny);
			Fragments._Pivotable__Pivotable.initOperations(_Pivotable__Pivotable);
	
			Fragments._Precedence__Classifier.initOperations(_Precedence__Classifier);
			Fragments._Precedence__Element.initOperations(_Precedence__Element);
			Fragments._Precedence__MonikeredElement.initOperations(_Precedence__MonikeredElement);
			Fragments._Precedence__Nameable.initOperations(_Precedence__Nameable);
			Fragments._Precedence__NamedElement.initOperations(_Precedence__NamedElement);
			Fragments._Precedence__OclAny.initOperations(_Precedence__OclAny);
			Fragments._Precedence__Precedence.initOperations(_Precedence__Precedence);
			Fragments._Precedence__Visitable.initOperations(_Precedence__Visitable);
	
			Fragments._PrimitiveLiteralExp__Classifier.initOperations(_PrimitiveLiteralExp__Classifier);
			Fragments._PrimitiveLiteralExp__Element.initOperations(_PrimitiveLiteralExp__Element);
			Fragments._PrimitiveLiteralExp__LiteralExp.initOperations(_PrimitiveLiteralExp__LiteralExp);
			Fragments._PrimitiveLiteralExp__MonikeredElement.initOperations(_PrimitiveLiteralExp__MonikeredElement);
			Fragments._PrimitiveLiteralExp__Nameable.initOperations(_PrimitiveLiteralExp__Nameable);
			Fragments._PrimitiveLiteralExp__NamedElement.initOperations(_PrimitiveLiteralExp__NamedElement);
			Fragments._PrimitiveLiteralExp__OclAny.initOperations(_PrimitiveLiteralExp__OclAny);
			Fragments._PrimitiveLiteralExp__OclExpression.initOperations(_PrimitiveLiteralExp__OclExpression);
			Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp.initOperations(_PrimitiveLiteralExp__PrimitiveLiteralExp);
			Fragments._PrimitiveLiteralExp__TypedElement.initOperations(_PrimitiveLiteralExp__TypedElement);
			Fragments._PrimitiveLiteralExp__Visitable.initOperations(_PrimitiveLiteralExp__Visitable);
	
			Fragments._PrimitiveType__Class.initOperations(_PrimitiveType__Class);
			Fragments._PrimitiveType__Classifier.initOperations(_PrimitiveType__Classifier);
			Fragments._PrimitiveType__DataType.initOperations(_PrimitiveType__DataType);
			Fragments._PrimitiveType__Element.initOperations(_PrimitiveType__Element);
			Fragments._PrimitiveType__MonikeredElement.initOperations(_PrimitiveType__MonikeredElement);
			Fragments._PrimitiveType__Nameable.initOperations(_PrimitiveType__Nameable);
			Fragments._PrimitiveType__NamedElement.initOperations(_PrimitiveType__NamedElement);
			Fragments._PrimitiveType__Namespace.initOperations(_PrimitiveType__Namespace);
			Fragments._PrimitiveType__OclAny.initOperations(_PrimitiveType__OclAny);
			Fragments._PrimitiveType__ParameterableElement.initOperations(_PrimitiveType__ParameterableElement);
			Fragments._PrimitiveType__PrimitiveType.initOperations(_PrimitiveType__PrimitiveType);
			Fragments._PrimitiveType__TemplateableElement.initOperations(_PrimitiveType__TemplateableElement);
			Fragments._PrimitiveType__Type.initOperations(_PrimitiveType__Type);
			Fragments._PrimitiveType__Visitable.initOperations(_PrimitiveType__Visitable);
	
			Fragments._Property__Classifier.initOperations(_Property__Classifier);
			Fragments._Property__Element.initOperations(_Property__Element);
			Fragments._Property__Feature.initOperations(_Property__Feature);
			Fragments._Property__MonikeredElement.initOperations(_Property__MonikeredElement);
			Fragments._Property__MultiplicityElement.initOperations(_Property__MultiplicityElement);
			Fragments._Property__Nameable.initOperations(_Property__Nameable);
			Fragments._Property__NamedElement.initOperations(_Property__NamedElement);
			Fragments._Property__OclAny.initOperations(_Property__OclAny);
			Fragments._Property__ParameterableElement.initOperations(_Property__ParameterableElement);
			Fragments._Property__Property.initOperations(_Property__Property);
			Fragments._Property__TypedElement.initOperations(_Property__TypedElement);
			Fragments._Property__TypedMultiplicityElement.initOperations(_Property__TypedMultiplicityElement);
			Fragments._Property__Visitable.initOperations(_Property__Visitable);
	
			Fragments._PropertyCallExp__CallExp.initOperations(_PropertyCallExp__CallExp);
			Fragments._PropertyCallExp__Classifier.initOperations(_PropertyCallExp__Classifier);
			Fragments._PropertyCallExp__Element.initOperations(_PropertyCallExp__Element);
			Fragments._PropertyCallExp__FeatureCallExp.initOperations(_PropertyCallExp__FeatureCallExp);
			Fragments._PropertyCallExp__MonikeredElement.initOperations(_PropertyCallExp__MonikeredElement);
			Fragments._PropertyCallExp__Nameable.initOperations(_PropertyCallExp__Nameable);
			Fragments._PropertyCallExp__NamedElement.initOperations(_PropertyCallExp__NamedElement);
			Fragments._PropertyCallExp__NavigationCallExp.initOperations(_PropertyCallExp__NavigationCallExp);
			Fragments._PropertyCallExp__OclAny.initOperations(_PropertyCallExp__OclAny);
			Fragments._PropertyCallExp__OclExpression.initOperations(_PropertyCallExp__OclExpression);
			Fragments._PropertyCallExp__PropertyCallExp.initOperations(_PropertyCallExp__PropertyCallExp);
			Fragments._PropertyCallExp__TypedElement.initOperations(_PropertyCallExp__TypedElement);
			Fragments._PropertyCallExp__Visitable.initOperations(_PropertyCallExp__Visitable);
	
			Fragments._Real__OclAny.initOperations(_Real__OclAny);
			Fragments._Real__Real.initOperations(_Real__Real);
	
			Fragments._RealLiteralExp__Classifier.initOperations(_RealLiteralExp__Classifier);
			Fragments._RealLiteralExp__Element.initOperations(_RealLiteralExp__Element);
			Fragments._RealLiteralExp__LiteralExp.initOperations(_RealLiteralExp__LiteralExp);
			Fragments._RealLiteralExp__MonikeredElement.initOperations(_RealLiteralExp__MonikeredElement);
			Fragments._RealLiteralExp__Nameable.initOperations(_RealLiteralExp__Nameable);
			Fragments._RealLiteralExp__NamedElement.initOperations(_RealLiteralExp__NamedElement);
			Fragments._RealLiteralExp__NumericLiteralExp.initOperations(_RealLiteralExp__NumericLiteralExp);
			Fragments._RealLiteralExp__OclAny.initOperations(_RealLiteralExp__OclAny);
			Fragments._RealLiteralExp__OclExpression.initOperations(_RealLiteralExp__OclExpression);
			Fragments._RealLiteralExp__PrimitiveLiteralExp.initOperations(_RealLiteralExp__PrimitiveLiteralExp);
			Fragments._RealLiteralExp__RealLiteralExp.initOperations(_RealLiteralExp__RealLiteralExp);
			Fragments._RealLiteralExp__TypedElement.initOperations(_RealLiteralExp__TypedElement);
			Fragments._RealLiteralExp__Visitable.initOperations(_RealLiteralExp__Visitable);
	
			Fragments._SelfType__Class.initOperations(_SelfType__Class);
			Fragments._SelfType__Classifier.initOperations(_SelfType__Classifier);
			Fragments._SelfType__Element.initOperations(_SelfType__Element);
			Fragments._SelfType__MonikeredElement.initOperations(_SelfType__MonikeredElement);
			Fragments._SelfType__Nameable.initOperations(_SelfType__Nameable);
			Fragments._SelfType__NamedElement.initOperations(_SelfType__NamedElement);
			Fragments._SelfType__Namespace.initOperations(_SelfType__Namespace);
			Fragments._SelfType__OclAny.initOperations(_SelfType__OclAny);
			Fragments._SelfType__ParameterableElement.initOperations(_SelfType__ParameterableElement);
			Fragments._SelfType__SelfType.initOperations(_SelfType__SelfType);
			Fragments._SelfType__TemplateableElement.initOperations(_SelfType__TemplateableElement);
			Fragments._SelfType__Type.initOperations(_SelfType__Type);
			Fragments._SelfType__Visitable.initOperations(_SelfType__Visitable);
	
			Fragments._SendSignalAction__Classifier.initOperations(_SendSignalAction__Classifier);
			Fragments._SendSignalAction__Element.initOperations(_SendSignalAction__Element);
			Fragments._SendSignalAction__MonikeredElement.initOperations(_SendSignalAction__MonikeredElement);
			Fragments._SendSignalAction__Nameable.initOperations(_SendSignalAction__Nameable);
			Fragments._SendSignalAction__NamedElement.initOperations(_SendSignalAction__NamedElement);
			Fragments._SendSignalAction__OclAny.initOperations(_SendSignalAction__OclAny);
			Fragments._SendSignalAction__SendSignalAction.initOperations(_SendSignalAction__SendSignalAction);
			Fragments._SendSignalAction__Visitable.initOperations(_SendSignalAction__Visitable);
	
			Fragments._Sequence__Collection.initOperations(_Sequence__Collection);
			Fragments._Sequence__NonUniqueCollection.initOperations(_Sequence__NonUniqueCollection);
			Fragments._Sequence__OclAny.initOperations(_Sequence__OclAny);
			Fragments._Sequence__OrderedCollection.initOperations(_Sequence__OrderedCollection);
			Fragments._Sequence__Sequence.initOperations(_Sequence__Sequence);
	
			Fragments._SequenceType__Class.initOperations(_SequenceType__Class);
			Fragments._SequenceType__Classifier.initOperations(_SequenceType__Classifier);
			Fragments._SequenceType__CollectionType.initOperations(_SequenceType__CollectionType);
			Fragments._SequenceType__DataType.initOperations(_SequenceType__DataType);
			Fragments._SequenceType__Element.initOperations(_SequenceType__Element);
			Fragments._SequenceType__MonikeredElement.initOperations(_SequenceType__MonikeredElement);
			Fragments._SequenceType__Nameable.initOperations(_SequenceType__Nameable);
			Fragments._SequenceType__NamedElement.initOperations(_SequenceType__NamedElement);
			Fragments._SequenceType__Namespace.initOperations(_SequenceType__Namespace);
			Fragments._SequenceType__OclAny.initOperations(_SequenceType__OclAny);
			Fragments._SequenceType__ParameterableElement.initOperations(_SequenceType__ParameterableElement);
			Fragments._SequenceType__SequenceType.initOperations(_SequenceType__SequenceType);
			Fragments._SequenceType__TemplateableElement.initOperations(_SequenceType__TemplateableElement);
			Fragments._SequenceType__Type.initOperations(_SequenceType__Type);
			Fragments._SequenceType__Visitable.initOperations(_SequenceType__Visitable);
	
			Fragments._Set__Collection.initOperations(_Set__Collection);
			Fragments._Set__NonOrderedCollection.initOperations(_Set__NonOrderedCollection);
			Fragments._Set__OclAny.initOperations(_Set__OclAny);
			Fragments._Set__Set.initOperations(_Set__Set);
			Fragments._Set__UniqueCollection.initOperations(_Set__UniqueCollection);
	
			Fragments._SetType__Class.initOperations(_SetType__Class);
			Fragments._SetType__Classifier.initOperations(_SetType__Classifier);
			Fragments._SetType__CollectionType.initOperations(_SetType__CollectionType);
			Fragments._SetType__DataType.initOperations(_SetType__DataType);
			Fragments._SetType__Element.initOperations(_SetType__Element);
			Fragments._SetType__MonikeredElement.initOperations(_SetType__MonikeredElement);
			Fragments._SetType__Nameable.initOperations(_SetType__Nameable);
			Fragments._SetType__NamedElement.initOperations(_SetType__NamedElement);
			Fragments._SetType__Namespace.initOperations(_SetType__Namespace);
			Fragments._SetType__OclAny.initOperations(_SetType__OclAny);
			Fragments._SetType__ParameterableElement.initOperations(_SetType__ParameterableElement);
			Fragments._SetType__SetType.initOperations(_SetType__SetType);
			Fragments._SetType__TemplateableElement.initOperations(_SetType__TemplateableElement);
			Fragments._SetType__Type.initOperations(_SetType__Type);
			Fragments._SetType__Visitable.initOperations(_SetType__Visitable);
	
			Fragments._Signal__Classifier.initOperations(_Signal__Classifier);
			Fragments._Signal__Element.initOperations(_Signal__Element);
			Fragments._Signal__MonikeredElement.initOperations(_Signal__MonikeredElement);
			Fragments._Signal__Nameable.initOperations(_Signal__Nameable);
			Fragments._Signal__NamedElement.initOperations(_Signal__NamedElement);
			Fragments._Signal__OclAny.initOperations(_Signal__OclAny);
			Fragments._Signal__Signal.initOperations(_Signal__Signal);
			Fragments._Signal__Visitable.initOperations(_Signal__Visitable);
	
			Fragments._State__Classifier.initOperations(_State__Classifier);
			Fragments._State__Element.initOperations(_State__Element);
			Fragments._State__MonikeredElement.initOperations(_State__MonikeredElement);
			Fragments._State__Nameable.initOperations(_State__Nameable);
			Fragments._State__NamedElement.initOperations(_State__NamedElement);
			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__State.initOperations(_State__State);
			Fragments._State__Visitable.initOperations(_State__Visitable);
	
			Fragments._StateExp__Classifier.initOperations(_StateExp__Classifier);
			Fragments._StateExp__Element.initOperations(_StateExp__Element);
			Fragments._StateExp__MonikeredElement.initOperations(_StateExp__MonikeredElement);
			Fragments._StateExp__Nameable.initOperations(_StateExp__Nameable);
			Fragments._StateExp__NamedElement.initOperations(_StateExp__NamedElement);
			Fragments._StateExp__OclAny.initOperations(_StateExp__OclAny);
			Fragments._StateExp__OclExpression.initOperations(_StateExp__OclExpression);
			Fragments._StateExp__StateExp.initOperations(_StateExp__StateExp);
			Fragments._StateExp__TypedElement.initOperations(_StateExp__TypedElement);
			Fragments._StateExp__Visitable.initOperations(_StateExp__Visitable);
	
			Fragments._String__OclAny.initOperations(_String__OclAny);
			Fragments._String__String.initOperations(_String__String);
	
			Fragments._StringLiteralExp__Classifier.initOperations(_StringLiteralExp__Classifier);
			Fragments._StringLiteralExp__Element.initOperations(_StringLiteralExp__Element);
			Fragments._StringLiteralExp__LiteralExp.initOperations(_StringLiteralExp__LiteralExp);
			Fragments._StringLiteralExp__MonikeredElement.initOperations(_StringLiteralExp__MonikeredElement);
			Fragments._StringLiteralExp__Nameable.initOperations(_StringLiteralExp__Nameable);
			Fragments._StringLiteralExp__NamedElement.initOperations(_StringLiteralExp__NamedElement);
			Fragments._StringLiteralExp__OclAny.initOperations(_StringLiteralExp__OclAny);
			Fragments._StringLiteralExp__OclExpression.initOperations(_StringLiteralExp__OclExpression);
			Fragments._StringLiteralExp__PrimitiveLiteralExp.initOperations(_StringLiteralExp__PrimitiveLiteralExp);
			Fragments._StringLiteralExp__StringLiteralExp.initOperations(_StringLiteralExp__StringLiteralExp);
			Fragments._StringLiteralExp__TypedElement.initOperations(_StringLiteralExp__TypedElement);
			Fragments._StringLiteralExp__Visitable.initOperations(_StringLiteralExp__Visitable);
	
			Fragments._TemplateBinding__Classifier.initOperations(_TemplateBinding__Classifier);
			Fragments._TemplateBinding__Element.initOperations(_TemplateBinding__Element);
			Fragments._TemplateBinding__OclAny.initOperations(_TemplateBinding__OclAny);
			Fragments._TemplateBinding__TemplateBinding.initOperations(_TemplateBinding__TemplateBinding);
			Fragments._TemplateBinding__Visitable.initOperations(_TemplateBinding__Visitable);
	
			Fragments._TemplateParameter__Classifier.initOperations(_TemplateParameter__Classifier);
			Fragments._TemplateParameter__Element.initOperations(_TemplateParameter__Element);
			Fragments._TemplateParameter__OclAny.initOperations(_TemplateParameter__OclAny);
			Fragments._TemplateParameter__TemplateParameter.initOperations(_TemplateParameter__TemplateParameter);
			Fragments._TemplateParameter__Visitable.initOperations(_TemplateParameter__Visitable);
	
			Fragments._TemplateParameterSubstitution__Classifier.initOperations(_TemplateParameterSubstitution__Classifier);
			Fragments._TemplateParameterSubstitution__Element.initOperations(_TemplateParameterSubstitution__Element);
			Fragments._TemplateParameterSubstitution__OclAny.initOperations(_TemplateParameterSubstitution__OclAny);
			Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution.initOperations(_TemplateParameterSubstitution__TemplateParameterSubstitution);
			Fragments._TemplateParameterSubstitution__Visitable.initOperations(_TemplateParameterSubstitution__Visitable);
	
			Fragments._TemplateParameterType__Classifier.initOperations(_TemplateParameterType__Classifier);
			Fragments._TemplateParameterType__Element.initOperations(_TemplateParameterType__Element);
			Fragments._TemplateParameterType__MonikeredElement.initOperations(_TemplateParameterType__MonikeredElement);
			Fragments._TemplateParameterType__Nameable.initOperations(_TemplateParameterType__Nameable);
			Fragments._TemplateParameterType__NamedElement.initOperations(_TemplateParameterType__NamedElement);
			Fragments._TemplateParameterType__OclAny.initOperations(_TemplateParameterType__OclAny);
			Fragments._TemplateParameterType__ParameterableElement.initOperations(_TemplateParameterType__ParameterableElement);
			Fragments._TemplateParameterType__TemplateParameterType.initOperations(_TemplateParameterType__TemplateParameterType);
			Fragments._TemplateParameterType__TemplateableElement.initOperations(_TemplateParameterType__TemplateableElement);
			Fragments._TemplateParameterType__Type.initOperations(_TemplateParameterType__Type);
			Fragments._TemplateParameterType__Visitable.initOperations(_TemplateParameterType__Visitable);
	
			Fragments._TemplateSignature__Classifier.initOperations(_TemplateSignature__Classifier);
			Fragments._TemplateSignature__Element.initOperations(_TemplateSignature__Element);
			Fragments._TemplateSignature__MonikeredElement.initOperations(_TemplateSignature__MonikeredElement);
			Fragments._TemplateSignature__OclAny.initOperations(_TemplateSignature__OclAny);
			Fragments._TemplateSignature__TemplateSignature.initOperations(_TemplateSignature__TemplateSignature);
			Fragments._TemplateSignature__Visitable.initOperations(_TemplateSignature__Visitable);
	
			Fragments._TemplateableElement__Classifier.initOperations(_TemplateableElement__Classifier);
			Fragments._TemplateableElement__Element.initOperations(_TemplateableElement__Element);
			Fragments._TemplateableElement__MonikeredElement.initOperations(_TemplateableElement__MonikeredElement);
			Fragments._TemplateableElement__OclAny.initOperations(_TemplateableElement__OclAny);
			Fragments._TemplateableElement__TemplateableElement.initOperations(_TemplateableElement__TemplateableElement);
			Fragments._TemplateableElement__Visitable.initOperations(_TemplateableElement__Visitable);
	
			Fragments._Throwable__Throwable.initOperations(_Throwable__Throwable);
	
			Fragments._Tuple__OclAny.initOperations(_Tuple__OclAny);
			Fragments._Tuple__Tuple.initOperations(_Tuple__Tuple);
	
			Fragments._TupleLiteralExp__Classifier.initOperations(_TupleLiteralExp__Classifier);
			Fragments._TupleLiteralExp__Element.initOperations(_TupleLiteralExp__Element);
			Fragments._TupleLiteralExp__LiteralExp.initOperations(_TupleLiteralExp__LiteralExp);
			Fragments._TupleLiteralExp__MonikeredElement.initOperations(_TupleLiteralExp__MonikeredElement);
			Fragments._TupleLiteralExp__Nameable.initOperations(_TupleLiteralExp__Nameable);
			Fragments._TupleLiteralExp__NamedElement.initOperations(_TupleLiteralExp__NamedElement);
			Fragments._TupleLiteralExp__OclAny.initOperations(_TupleLiteralExp__OclAny);
			Fragments._TupleLiteralExp__OclExpression.initOperations(_TupleLiteralExp__OclExpression);
			Fragments._TupleLiteralExp__TupleLiteralExp.initOperations(_TupleLiteralExp__TupleLiteralExp);
			Fragments._TupleLiteralExp__TypedElement.initOperations(_TupleLiteralExp__TypedElement);
			Fragments._TupleLiteralExp__Visitable.initOperations(_TupleLiteralExp__Visitable);
	
			Fragments._TupleLiteralPart__Classifier.initOperations(_TupleLiteralPart__Classifier);
			Fragments._TupleLiteralPart__Element.initOperations(_TupleLiteralPart__Element);
			Fragments._TupleLiteralPart__MonikeredElement.initOperations(_TupleLiteralPart__MonikeredElement);
			Fragments._TupleLiteralPart__Nameable.initOperations(_TupleLiteralPart__Nameable);
			Fragments._TupleLiteralPart__NamedElement.initOperations(_TupleLiteralPart__NamedElement);
			Fragments._TupleLiteralPart__OclAny.initOperations(_TupleLiteralPart__OclAny);
			Fragments._TupleLiteralPart__TupleLiteralPart.initOperations(_TupleLiteralPart__TupleLiteralPart);
			Fragments._TupleLiteralPart__TypedElement.initOperations(_TupleLiteralPart__TypedElement);
			Fragments._TupleLiteralPart__VariableDeclaration.initOperations(_TupleLiteralPart__VariableDeclaration);
			Fragments._TupleLiteralPart__Visitable.initOperations(_TupleLiteralPart__Visitable);
	
			Fragments._TupleType__Class.initOperations(_TupleType__Class);
			Fragments._TupleType__Classifier.initOperations(_TupleType__Classifier);
			Fragments._TupleType__DataType.initOperations(_TupleType__DataType);
			Fragments._TupleType__Element.initOperations(_TupleType__Element);
			Fragments._TupleType__MonikeredElement.initOperations(_TupleType__MonikeredElement);
			Fragments._TupleType__Nameable.initOperations(_TupleType__Nameable);
			Fragments._TupleType__NamedElement.initOperations(_TupleType__NamedElement);
			Fragments._TupleType__Namespace.initOperations(_TupleType__Namespace);
			Fragments._TupleType__OclAny.initOperations(_TupleType__OclAny);
			Fragments._TupleType__ParameterableElement.initOperations(_TupleType__ParameterableElement);
			Fragments._TupleType__TemplateableElement.initOperations(_TupleType__TemplateableElement);
			Fragments._TupleType__TupleType.initOperations(_TupleType__TupleType);
			Fragments._TupleType__Type.initOperations(_TupleType__Type);
			Fragments._TupleType__Visitable.initOperations(_TupleType__Visitable);
	
			Fragments._Type__Classifier.initOperations(_Type__Classifier);
			Fragments._Type__Element.initOperations(_Type__Element);
			Fragments._Type__MonikeredElement.initOperations(_Type__MonikeredElement);
			Fragments._Type__Nameable.initOperations(_Type__Nameable);
			Fragments._Type__NamedElement.initOperations(_Type__NamedElement);
			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__ParameterableElement.initOperations(_Type__ParameterableElement);
			Fragments._Type__TemplateableElement.initOperations(_Type__TemplateableElement);
			Fragments._Type__Type.initOperations(_Type__Type);
			Fragments._Type__Visitable.initOperations(_Type__Visitable);
	
			Fragments._TypeExp__Classifier.initOperations(_TypeExp__Classifier);
			Fragments._TypeExp__Element.initOperations(_TypeExp__Element);
			Fragments._TypeExp__MonikeredElement.initOperations(_TypeExp__MonikeredElement);
			Fragments._TypeExp__Nameable.initOperations(_TypeExp__Nameable);
			Fragments._TypeExp__NamedElement.initOperations(_TypeExp__NamedElement);
			Fragments._TypeExp__OclAny.initOperations(_TypeExp__OclAny);
			Fragments._TypeExp__OclExpression.initOperations(_TypeExp__OclExpression);
			Fragments._TypeExp__TypeExp.initOperations(_TypeExp__TypeExp);
			Fragments._TypeExp__TypedElement.initOperations(_TypeExp__TypedElement);
			Fragments._TypeExp__Visitable.initOperations(_TypeExp__Visitable);
	
			Fragments._TypeTemplateParameter__Classifier.initOperations(_TypeTemplateParameter__Classifier);
			Fragments._TypeTemplateParameter__Element.initOperations(_TypeTemplateParameter__Element);
			Fragments._TypeTemplateParameter__OclAny.initOperations(_TypeTemplateParameter__OclAny);
			Fragments._TypeTemplateParameter__TemplateParameter.initOperations(_TypeTemplateParameter__TemplateParameter);
			Fragments._TypeTemplateParameter__TypeTemplateParameter.initOperations(_TypeTemplateParameter__TypeTemplateParameter);
			Fragments._TypeTemplateParameter__Visitable.initOperations(_TypeTemplateParameter__Visitable);
	
			Fragments._TypedElement__Classifier.initOperations(_TypedElement__Classifier);
			Fragments._TypedElement__Element.initOperations(_TypedElement__Element);
			Fragments._TypedElement__MonikeredElement.initOperations(_TypedElement__MonikeredElement);
			Fragments._TypedElement__Nameable.initOperations(_TypedElement__Nameable);
			Fragments._TypedElement__NamedElement.initOperations(_TypedElement__NamedElement);
			Fragments._TypedElement__OclAny.initOperations(_TypedElement__OclAny);
			Fragments._TypedElement__TypedElement.initOperations(_TypedElement__TypedElement);
			Fragments._TypedElement__Visitable.initOperations(_TypedElement__Visitable);
	
			Fragments._TypedMultiplicityElement__Classifier.initOperations(_TypedMultiplicityElement__Classifier);
			Fragments._TypedMultiplicityElement__Element.initOperations(_TypedMultiplicityElement__Element);
			Fragments._TypedMultiplicityElement__MonikeredElement.initOperations(_TypedMultiplicityElement__MonikeredElement);
			Fragments._TypedMultiplicityElement__MultiplicityElement.initOperations(_TypedMultiplicityElement__MultiplicityElement);
			Fragments._TypedMultiplicityElement__Nameable.initOperations(_TypedMultiplicityElement__Nameable);
			Fragments._TypedMultiplicityElement__NamedElement.initOperations(_TypedMultiplicityElement__NamedElement);
			Fragments._TypedMultiplicityElement__OclAny.initOperations(_TypedMultiplicityElement__OclAny);
			Fragments._TypedMultiplicityElement__TypedElement.initOperations(_TypedMultiplicityElement__TypedElement);
			Fragments._TypedMultiplicityElement__TypedMultiplicityElement.initOperations(_TypedMultiplicityElement__TypedMultiplicityElement);
			Fragments._TypedMultiplicityElement__Visitable.initOperations(_TypedMultiplicityElement__Visitable);
	
			Fragments._UniqueCollection__Collection.initOperations(_UniqueCollection__Collection);
			Fragments._UniqueCollection__OclAny.initOperations(_UniqueCollection__OclAny);
			Fragments._UniqueCollection__UniqueCollection.initOperations(_UniqueCollection__UniqueCollection);
	
			Fragments._UnlimitedNatural__Integer.initOperations(_UnlimitedNatural__Integer);
			Fragments._UnlimitedNatural__OclAny.initOperations(_UnlimitedNatural__OclAny);
			Fragments._UnlimitedNatural__Real.initOperations(_UnlimitedNatural__Real);
			Fragments._UnlimitedNatural__UnlimitedNatural.initOperations(_UnlimitedNatural__UnlimitedNatural);
	
			Fragments._UnlimitedNaturalLiteralExp__Classifier.initOperations(_UnlimitedNaturalLiteralExp__Classifier);
			Fragments._UnlimitedNaturalLiteralExp__Element.initOperations(_UnlimitedNaturalLiteralExp__Element);
			Fragments._UnlimitedNaturalLiteralExp__LiteralExp.initOperations(_UnlimitedNaturalLiteralExp__LiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__MonikeredElement.initOperations(_UnlimitedNaturalLiteralExp__MonikeredElement);
			Fragments._UnlimitedNaturalLiteralExp__Nameable.initOperations(_UnlimitedNaturalLiteralExp__Nameable);
			Fragments._UnlimitedNaturalLiteralExp__NamedElement.initOperations(_UnlimitedNaturalLiteralExp__NamedElement);
			Fragments._UnlimitedNaturalLiteralExp__NumericLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__NumericLiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__OclAny.initOperations(_UnlimitedNaturalLiteralExp__OclAny);
			Fragments._UnlimitedNaturalLiteralExp__OclExpression.initOperations(_UnlimitedNaturalLiteralExp__OclExpression);
			Fragments._UnlimitedNaturalLiteralExp__PrimitiveLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__PrimitiveLiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__TypedElement.initOperations(_UnlimitedNaturalLiteralExp__TypedElement);
			Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__Visitable.initOperations(_UnlimitedNaturalLiteralExp__Visitable);
	
			Fragments._UnspecifiedType__Class.initOperations(_UnspecifiedType__Class);
			Fragments._UnspecifiedType__Classifier.initOperations(_UnspecifiedType__Classifier);
			Fragments._UnspecifiedType__Element.initOperations(_UnspecifiedType__Element);
			Fragments._UnspecifiedType__MonikeredElement.initOperations(_UnspecifiedType__MonikeredElement);
			Fragments._UnspecifiedType__Nameable.initOperations(_UnspecifiedType__Nameable);
			Fragments._UnspecifiedType__NamedElement.initOperations(_UnspecifiedType__NamedElement);
			Fragments._UnspecifiedType__Namespace.initOperations(_UnspecifiedType__Namespace);
			Fragments._UnspecifiedType__OclAny.initOperations(_UnspecifiedType__OclAny);
			Fragments._UnspecifiedType__ParameterableElement.initOperations(_UnspecifiedType__ParameterableElement);
			Fragments._UnspecifiedType__TemplateableElement.initOperations(_UnspecifiedType__TemplateableElement);
			Fragments._UnspecifiedType__Type.initOperations(_UnspecifiedType__Type);
			Fragments._UnspecifiedType__UnspecifiedType.initOperations(_UnspecifiedType__UnspecifiedType);
			Fragments._UnspecifiedType__Visitable.initOperations(_UnspecifiedType__Visitable);
	
			Fragments._UnspecifiedValueExp__Classifier.initOperations(_UnspecifiedValueExp__Classifier);
			Fragments._UnspecifiedValueExp__Element.initOperations(_UnspecifiedValueExp__Element);
			Fragments._UnspecifiedValueExp__MonikeredElement.initOperations(_UnspecifiedValueExp__MonikeredElement);
			Fragments._UnspecifiedValueExp__Nameable.initOperations(_UnspecifiedValueExp__Nameable);
			Fragments._UnspecifiedValueExp__NamedElement.initOperations(_UnspecifiedValueExp__NamedElement);
			Fragments._UnspecifiedValueExp__OclAny.initOperations(_UnspecifiedValueExp__OclAny);
			Fragments._UnspecifiedValueExp__OclExpression.initOperations(_UnspecifiedValueExp__OclExpression);
			Fragments._UnspecifiedValueExp__TypedElement.initOperations(_UnspecifiedValueExp__TypedElement);
			Fragments._UnspecifiedValueExp__UnspecifiedValueExp.initOperations(_UnspecifiedValueExp__UnspecifiedValueExp);
			Fragments._UnspecifiedValueExp__Visitable.initOperations(_UnspecifiedValueExp__Visitable);
	
			Fragments._ValueSpecification__Classifier.initOperations(_ValueSpecification__Classifier);
			Fragments._ValueSpecification__Element.initOperations(_ValueSpecification__Element);
			Fragments._ValueSpecification__MonikeredElement.initOperations(_ValueSpecification__MonikeredElement);
			Fragments._ValueSpecification__Nameable.initOperations(_ValueSpecification__Nameable);
			Fragments._ValueSpecification__NamedElement.initOperations(_ValueSpecification__NamedElement);
			Fragments._ValueSpecification__OclAny.initOperations(_ValueSpecification__OclAny);
			Fragments._ValueSpecification__ParameterableElement.initOperations(_ValueSpecification__ParameterableElement);
			Fragments._ValueSpecification__TypedElement.initOperations(_ValueSpecification__TypedElement);
			Fragments._ValueSpecification__ValueSpecification.initOperations(_ValueSpecification__ValueSpecification);
			Fragments._ValueSpecification__Visitable.initOperations(_ValueSpecification__Visitable);
	
			Fragments._Variable__Classifier.initOperations(_Variable__Classifier);
			Fragments._Variable__Element.initOperations(_Variable__Element);
			Fragments._Variable__MonikeredElement.initOperations(_Variable__MonikeredElement);
			Fragments._Variable__Nameable.initOperations(_Variable__Nameable);
			Fragments._Variable__NamedElement.initOperations(_Variable__NamedElement);
			Fragments._Variable__OclAny.initOperations(_Variable__OclAny);
			Fragments._Variable__TypedElement.initOperations(_Variable__TypedElement);
			Fragments._Variable__Variable.initOperations(_Variable__Variable);
			Fragments._Variable__VariableDeclaration.initOperations(_Variable__VariableDeclaration);
			Fragments._Variable__Visitable.initOperations(_Variable__Visitable);
	
			Fragments._VariableDeclaration__Classifier.initOperations(_VariableDeclaration__Classifier);
			Fragments._VariableDeclaration__Element.initOperations(_VariableDeclaration__Element);
			Fragments._VariableDeclaration__MonikeredElement.initOperations(_VariableDeclaration__MonikeredElement);
			Fragments._VariableDeclaration__Nameable.initOperations(_VariableDeclaration__Nameable);
			Fragments._VariableDeclaration__NamedElement.initOperations(_VariableDeclaration__NamedElement);
			Fragments._VariableDeclaration__OclAny.initOperations(_VariableDeclaration__OclAny);
			Fragments._VariableDeclaration__TypedElement.initOperations(_VariableDeclaration__TypedElement);
			Fragments._VariableDeclaration__VariableDeclaration.initOperations(_VariableDeclaration__VariableDeclaration);
			Fragments._VariableDeclaration__Visitable.initOperations(_VariableDeclaration__Visitable);
	
			Fragments._VariableExp__Classifier.initOperations(_VariableExp__Classifier);
			Fragments._VariableExp__Element.initOperations(_VariableExp__Element);
			Fragments._VariableExp__MonikeredElement.initOperations(_VariableExp__MonikeredElement);
			Fragments._VariableExp__Nameable.initOperations(_VariableExp__Nameable);
			Fragments._VariableExp__NamedElement.initOperations(_VariableExp__NamedElement);
			Fragments._VariableExp__OclAny.initOperations(_VariableExp__OclAny);
			Fragments._VariableExp__OclExpression.initOperations(_VariableExp__OclExpression);
			Fragments._VariableExp__TypedElement.initOperations(_VariableExp__TypedElement);
			Fragments._VariableExp__VariableExp.initOperations(_VariableExp__VariableExp);
			Fragments._VariableExp__Visitable.initOperations(_VariableExp__Visitable);
	
			Fragments._Visitable__Classifier.initOperations(_Visitable__Classifier);
			Fragments._Visitable__OclAny.initOperations(_Visitable__OclAny);
			Fragments._Visitable__Visitable.initOperations(_Visitable__Visitable);
	
			Fragments._Visitor__Classifier.initOperations(_Visitor__Classifier);
			Fragments._Visitor__OclAny.initOperations(_Visitor__OclAny);
			Fragments._Visitor__Visitor.initOperations(_Visitor__Visitor);
	
			Fragments._VoidType__Class.initOperations(_VoidType__Class);
			Fragments._VoidType__Classifier.initOperations(_VoidType__Classifier);
			Fragments._VoidType__Element.initOperations(_VoidType__Element);
			Fragments._VoidType__MonikeredElement.initOperations(_VoidType__MonikeredElement);
			Fragments._VoidType__Nameable.initOperations(_VoidType__Nameable);
			Fragments._VoidType__NamedElement.initOperations(_VoidType__NamedElement);
			Fragments._VoidType__Namespace.initOperations(_VoidType__Namespace);
			Fragments._VoidType__OclAny.initOperations(_VoidType__OclAny);
			Fragments._VoidType__ParameterableElement.initOperations(_VoidType__ParameterableElement);
			Fragments._VoidType__TemplateableElement.initOperations(_VoidType__TemplateableElement);
			Fragments._VoidType__Type.initOperations(_VoidType__Type);
			Fragments._VoidType__Visitable.initOperations(_VoidType__Visitable);
			Fragments._VoidType__VoidType.initOperations(_VoidType__VoidType);
		}
	
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each class.
	 */
	public static class FragmentProperties {
		private static final ExecutorProperty[] _Annotation = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Annotation__NamedElement,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Annotation__ownedContent,
		    PivotTables.Properties._Annotation__ownedDetail,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._Annotation__reference
		};
	
		private static final ExecutorProperty[] _AnyType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _AssociationClass = {
		    PivotTables.Properties._AssociationClass__AssociationClassCallExp,
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._AssociationClass__unownedAttribute,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _AssociationClassCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NavigationCallExp__navigationSource,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._NavigationCallExp__qualifier,
		    PivotTables.Properties._AssociationClassCallExp__referredAssociationClass,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _AssociativityKind = {};
	
		private static final ExecutorProperty[] _Bag = {};
	
		private static final ExecutorProperty[] _BagType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Boolean = {};
	
		private static final ExecutorProperty[] _BooleanLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._BooleanLiteralExp__booleanSymbol,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CallOperationAction = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._CallOperationAction__MessageExp,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._CallOperationAction__operation,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _Class = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Classifier = {};
	
		private static final ExecutorProperty[] _ClassifierType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._ClassifierType__instanceType,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Collection = {};
	
		private static final ExecutorProperty[] _CollectionItem = {
		    PivotTables.Properties._CollectionLiteralPart__CollectionLiteralExp,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._CollectionItem__item,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CollectionKind = {};
	
		private static final ExecutorProperty[] _CollectionLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._CollectionLiteralExp__kind,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._CollectionLiteralExp__part,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CollectionLiteralPart = {
		    PivotTables.Properties._CollectionLiteralPart__CollectionLiteralExp,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CollectionRange = {
		    PivotTables.Properties._CollectionLiteralPart__CollectionLiteralExp,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._CollectionRange__first,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._CollectionRange__last,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _CollectionType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Comment = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Comment__Element,
		    PivotTables.Properties._Comment__annotatedElement,
		    PivotTables.Properties._Comment__body,
		    PivotTables.Properties._Element__ownedComment
		};
	
		private static final ExecutorProperty[] _Constraint = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Constraint__NamedElement,
		    PivotTables.Properties._Constraint__constrainedElement,
		    PivotTables.Properties._Constraint__context,
		    PivotTables.Properties._Constraint__isCallable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._Constraint__specification,
		    PivotTables.Properties._Constraint__stereotype
		};
	
		private static final ExecutorProperty[] _DataType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Detail = {
		    PivotTables.Properties._Detail__Annotation,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._Detail__value
		};
	
		private static final ExecutorProperty[] _Element = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._Element__ownedComment
		};
	
		private static final ExecutorProperty[] _EnumLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._EnumLiteralExp__referredEnumLiteral,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Enumeration = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Enumeration__ownedLiteral,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _EnumerationLiteral = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._EnumerationLiteral__EnumLiteralExp,
		    PivotTables.Properties._EnumerationLiteral__enumeration,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._EnumerationLiteral__value
		};
	
		private static final ExecutorProperty[] _ExpressionInOcl = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._ValueSpecification__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OpaqueExpression__body,
		    PivotTables.Properties._ExpressionInOcl__bodyExpression,
		    PivotTables.Properties._ExpressionInOcl__contextVariable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._OpaqueExpression__language,
		    PivotTables.Properties._OpaqueExpression__message,
		    PivotTables.Properties._ExpressionInOcl__messageExpression,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ExpressionInOcl__parameterVariable,
		    PivotTables.Properties._ExpressionInOcl__resultVariable,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._OpaqueExpression__valueExpression
		};
	
		private static final ExecutorProperty[] _Feature = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Feature__implementation,
		    PivotTables.Properties._Feature__implementationClass,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _FeatureCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _IfExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._IfExp__condition,
		    PivotTables.Properties._IfExp__elseExpression,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._IfExp__thenExpression,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Int = {};
	
		private static final ExecutorProperty[] _Integer = {};
	
		private static final ExecutorProperty[] _IntegerLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._IntegerLiteralExp__integerSymbol,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _InvalidLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _InvalidType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _IterateExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._LoopExp__body,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._LoopExp__iterator,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._LoopExp__referredIteration,
		    PivotTables.Properties._IterateExp__result,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Iteration = {
		    PivotTables.Properties._Operation__CallOperationAction,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Iteration__LoopExp,
		    PivotTables.Properties._Operation__MessageType,
		    PivotTables.Properties._Operation__OperationCallExp,
		    PivotTables.Properties._Operation__class,
		    PivotTables.Properties._Feature__implementation,
		    PivotTables.Properties._Feature__implementationClass,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Iteration__ownedAccumulator,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Iteration__ownedIterator,
		    PivotTables.Properties._Operation__ownedParameter,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Operation__precedence,
		    PivotTables.Properties._Operation__raisedException,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._TemplateableElement__unspecializedElement,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _IteratorExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._LoopExp__body,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._LoopExp__iterator,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._LoopExp__referredIteration,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _LambdaType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._LambdaType__contextType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._LambdaType__parameterType,
		    PivotTables.Properties._LambdaType__resultType,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _LetExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._LetExp__in,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._LetExp__variable
		};
	
		private static final ExecutorProperty[] _Library = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Package__nestedPackage,
		    PivotTables.Properties._Package__nestingPackage,
		    PivotTables.Properties._Package__nsPrefix,
		    PivotTables.Properties._Package__nsURI,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Package__ownedPrecedence,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._Package__ownedType,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _LibraryFeature = {};
	
		private static final ExecutorProperty[] _LiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _LoopExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._LoopExp__body,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._LoopExp__iterator,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._LoopExp__referredIteration,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _MessageExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._MessageExp__argument,
		    PivotTables.Properties._MessageExp__calledOperation,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._MessageExp__sentSignal,
		    PivotTables.Properties._MessageExp__target,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _MessageType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._MessageType__referredOperation,
		    PivotTables.Properties._MessageType__referredSignal,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _MonikeredElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._Element__ownedComment
		};
	
		private static final ExecutorProperty[] _MultiplicityElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _Nameable = {};
	
		private static final ExecutorProperty[] _NamedElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _Namespace = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _NavigationCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NavigationCallExp__navigationSource,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._NavigationCallExp__qualifier,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _NonOrderedCollection = {};
	
		private static final ExecutorProperty[] _NonUniqueCollection = {};
	
		private static final ExecutorProperty[] _NullLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _NumericLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Object = {};
	
		private static final ExecutorProperty[] _OclAny = {};
	
		private static final ExecutorProperty[] _OclExpression = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _OclInvalid = {};
	
		private static final ExecutorProperty[] _OclMessage = {};
	
		private static final ExecutorProperty[] _OclSelf = {};
	
		private static final ExecutorProperty[] _OclState = {};
	
		private static final ExecutorProperty[] _OclTuple = {};
	
		private static final ExecutorProperty[] _OclVoid = {};
	
		private static final ExecutorProperty[] _OpaqueExpression = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._ValueSpecification__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OpaqueExpression__body,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._OpaqueExpression__language,
		    PivotTables.Properties._OpaqueExpression__message,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._OpaqueExpression__valueExpression
		};
	
		private static final ExecutorProperty[] _Operation = {
		    PivotTables.Properties._Operation__CallOperationAction,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Operation__MessageType,
		    PivotTables.Properties._Operation__OperationCallExp,
		    PivotTables.Properties._Operation__class,
		    PivotTables.Properties._Feature__implementation,
		    PivotTables.Properties._Feature__implementationClass,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Operation__ownedParameter,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Operation__precedence,
		    PivotTables.Properties._Operation__raisedException,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._TemplateableElement__unspecializedElement,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _OperationCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._OperationCallExp__argument,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._OperationCallExp__referredOperation,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _OperationTemplateParameter = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateParameter__TemplateParameterSubstitution,
		    PivotTables.Properties._TemplateParameter__TemplateSignature,
		    PivotTables.Properties._TemplateParameter__default,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateParameter__ownedDefault,
		    PivotTables.Properties._TemplateParameter__ownedParameteredElement,
		    PivotTables.Properties._TemplateParameter__parameteredElement,
		    PivotTables.Properties._TemplateParameter__signature
		};
	
		private static final ExecutorProperty[] _OrderedCollection = {};
	
		private static final ExecutorProperty[] _OrderedSet = {};
	
		private static final ExecutorProperty[] _OrderedSetType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Package = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Package__nestedPackage,
		    PivotTables.Properties._Package__nestingPackage,
		    PivotTables.Properties._Package__nsPrefix,
		    PivotTables.Properties._Package__nsURI,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Package__ownedPrecedence,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._Package__ownedType,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _PackageableElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter
		};
	
		private static final ExecutorProperty[] _Parameter = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Parameter__Variable,
		    PivotTables.Properties._VariableDeclaration__VariableExp,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Parameter__operation,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _ParameterableElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter
		};
	
		private static final ExecutorProperty[] _Pivotable = {};
	
		private static final ExecutorProperty[] _Precedence = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Precedence__Operation,
		    PivotTables.Properties._Precedence__Package,
		    PivotTables.Properties._Precedence__associativity,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Precedence__order,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _PrimitiveLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _PrimitiveType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Property = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Property__NavigationCallExp,
		    PivotTables.Properties._Property__PropertyCallExp,
		    PivotTables.Properties._Property__association,
		    PivotTables.Properties._Property__class,
		    PivotTables.Properties._Property__default,
		    PivotTables.Properties._Feature__implementation,
		    PivotTables.Properties._Feature__implementationClass,
		    PivotTables.Properties._Property__implicit,
		    PivotTables.Properties._Property__isComposite,
		    PivotTables.Properties._Property__isDerived,
		    PivotTables.Properties._Property__isID,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._Property__isReadOnly,
		    PivotTables.Properties._Property__isResolveProxies,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._Property__isTransient,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._Property__isUnsettable,
		    PivotTables.Properties._Property__isVolatile,
		    PivotTables.Properties._Property__keys,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._Property__opposite,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _PropertyCallExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._CallExp__implicit,
		    PivotTables.Properties._FeatureCallExp__isPre,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NavigationCallExp__navigationSource,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._NavigationCallExp__qualifier,
		    PivotTables.Properties._PropertyCallExp__referredProperty,
		    PivotTables.Properties._CallExp__source,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Real = {};
	
		private static final ExecutorProperty[] _RealLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._RealLiteralExp__realSymbol,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _SelfType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _SendSignalAction = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._SendSignalAction__MessageExp,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._SendSignalAction__signal
		};
	
		private static final ExecutorProperty[] _Sequence = {};
	
		private static final ExecutorProperty[] _SequenceType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Set = {};
	
		private static final ExecutorProperty[] _SetType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._CollectionType__elementType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Signal = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Signal__MessageType,
		    PivotTables.Properties._Signal__SendSignalAction,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _State = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._State__StateExp,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule
		};
	
		private static final ExecutorProperty[] _StateExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._StateExp__referredState,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _String = {};
	
		private static final ExecutorProperty[] _StringLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._StringLiteralExp__stringSymbol,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TemplateBinding = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateBinding__boundElement,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateBinding__parameterSubstitution,
		    PivotTables.Properties._TemplateBinding__signature
		};
	
		private static final ExecutorProperty[] _TemplateParameter = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateParameter__TemplateParameterSubstitution,
		    PivotTables.Properties._TemplateParameter__TemplateSignature,
		    PivotTables.Properties._TemplateParameter__default,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateParameter__ownedDefault,
		    PivotTables.Properties._TemplateParameter__ownedParameteredElement,
		    PivotTables.Properties._TemplateParameter__parameteredElement,
		    PivotTables.Properties._TemplateParameter__signature
		};
	
		private static final ExecutorProperty[] _TemplateParameterSubstitution = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateParameterSubstitution__actual,
		    PivotTables.Properties._TemplateParameterSubstitution__formal,
		    PivotTables.Properties._TemplateParameterSubstitution__ownedActual,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateParameterSubstitution__templateBinding
		};
	
		private static final ExecutorProperty[] _TemplateParameterType = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._TemplateParameterType__specification,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _TemplateSignature = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateSignature__TemplateBinding,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateSignature__ownedParameter,
		    PivotTables.Properties._TemplateSignature__parameter,
		    PivotTables.Properties._TemplateSignature__template
		};
	
		private static final ExecutorProperty[] _TemplateableElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Throwable = {};
	
		private static final ExecutorProperty[] _Tuple = {};
	
		private static final ExecutorProperty[] _TupleLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TupleLiteralExp__part,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TupleLiteralPart = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._TupleLiteralPart__TupleLiteralExp,
		    PivotTables.Properties._VariableDeclaration__VariableExp,
		    PivotTables.Properties._TupleLiteralPart__initExpression,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TupleType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._DataType__behavioralType,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._DataType__isSerializable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _Type = {
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		private static final ExecutorProperty[] _TypeExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypeExp__referredType,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TypeTemplateParameter = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._TemplateParameter__TemplateParameterSubstitution,
		    PivotTables.Properties._TemplateParameter__TemplateSignature,
		    PivotTables.Properties._TypeTemplateParameter__allowSubstitutable,
		    PivotTables.Properties._TypeTemplateParameter__constrainingType,
		    PivotTables.Properties._TemplateParameter__default,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._TemplateParameter__ownedDefault,
		    PivotTables.Properties._TemplateParameter__ownedParameteredElement,
		    PivotTables.Properties._TemplateParameter__parameteredElement,
		    PivotTables.Properties._TemplateParameter__signature
		};
	
		private static final ExecutorProperty[] _TypedElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _TypedMultiplicityElement = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._MultiplicityElement__isOrdered,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MultiplicityElement__isUnique,
		    PivotTables.Properties._MultiplicityElement__lower,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._MultiplicityElement__upper
		};
	
		private static final ExecutorProperty[] _UniqueCollection = {};
	
		private static final ExecutorProperty[] _UnlimitedNatural = {};
	
		private static final ExecutorProperty[] _UnlimitedNaturalLiteralExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type,
		    PivotTables.Properties._UnlimitedNaturalLiteralExp__unlimitedNaturalSymbol
		};
	
		private static final ExecutorProperty[] _UnspecifiedType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._UnspecifiedType__lowerBound,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement,
		    PivotTables.Properties._UnspecifiedType__upperBound
		};
	
		private static final ExecutorProperty[] _UnspecifiedValueExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _ValueSpecification = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._ValueSpecification__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Variable = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Variable__IterateExp,
		    PivotTables.Properties._Variable__LetExp,
		    PivotTables.Properties._Variable__LoopExp,
		    PivotTables.Properties._VariableDeclaration__VariableExp,
		    PivotTables.Properties._Variable__implicit,
		    PivotTables.Properties._Variable__initExpression,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._Variable__representedParameter,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _VariableDeclaration = {
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._VariableDeclaration__VariableExp,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _VariableExp = {
		    PivotTables.Properties._OclExpression__CallExp,
		    PivotTables.Properties._OclExpression__CollectionItem,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._OclExpression__LetExp,
		    PivotTables.Properties._OclExpression__LoopExp,
		    PivotTables.Properties._OclExpression__NavigationCallExp,
		    PivotTables.Properties._OclExpression__OperationCallExp,
		    PivotTables.Properties._OclExpression__TupleLiteralPart,
		    PivotTables.Properties._OclExpression__Variable,
		    PivotTables.Properties._VariableExp__implicit,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._VariableExp__referredVariable,
		    PivotTables.Properties._TypedElement__type
		};
	
		private static final ExecutorProperty[] _Visitable = {};
	
		private static final ExecutorProperty[] _Visitor = {};
	
		private static final ExecutorProperty[] _VoidType = {
		    PivotTables.Properties._Class__Class,
		    PivotTables.Properties._Type__ClassifierType,
		    PivotTables.Properties._Type__CollectionType,
		    PivotTables.Properties._Element__Comment,
		    PivotTables.Properties._Element__Constraint,
		    PivotTables.Properties._NamedElement__Constraint,
		    PivotTables.Properties._Type__DataType,
		    PivotTables.Properties._Type__Operation,
		    PivotTables.Properties._Type__TypeExp,
		    PivotTables.Properties._Type__TypeTemplateParameter,
		    PivotTables.Properties._Type__TypedElement,
		    PivotTables.Properties._Type__instanceClassName,
		    PivotTables.Properties._Class__isAbstract,
		    PivotTables.Properties._Class__isInterface,
		    PivotTables.Properties._NamedElement__isStatic,
		    PivotTables.Properties._MonikeredElement__moniker,
		    PivotTables.Properties._NamedElement__name,
		    PivotTables.Properties._NamedElement__ownedAnnotation,
		    PivotTables.Properties._Class__ownedAttribute,
		    PivotTables.Properties._Element__ownedComment,
		    PivotTables.Properties._Class__ownedOperation,
		    PivotTables.Properties._NamedElement__ownedRule,
		    PivotTables.Properties._TemplateableElement__ownedTemplateSignature,
		    PivotTables.Properties._ParameterableElement__owningTemplateParameter,
		    PivotTables.Properties._Type__package,
		    PivotTables.Properties._Class__subClass,
		    PivotTables.Properties._Class__superClass,
		    PivotTables.Properties._TemplateableElement__templateBinding,
		    PivotTables.Properties._ParameterableElement__templateParameter,
		    PivotTables.Properties._TemplateableElement__unspecializedElement
		};
	
		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
	  	 	Fragments._Annotation__Annotation.initProperties(_Annotation);
	  	 	Fragments._AnyType__AnyType.initProperties(_AnyType);
	  	 	Fragments._AssociationClass__AssociationClass.initProperties(_AssociationClass);
	  	 	Fragments._AssociationClassCallExp__AssociationClassCallExp.initProperties(_AssociationClassCallExp);
	  	 	Fragments._AssociativityKind__AssociativityKind.initProperties(_AssociativityKind);
	  	 	Fragments._Bag__Bag.initProperties(_Bag);
	  	 	Fragments._BagType__BagType.initProperties(_BagType);
	  	 	Fragments._Boolean__Boolean.initProperties(_Boolean);
	  	 	Fragments._BooleanLiteralExp__BooleanLiteralExp.initProperties(_BooleanLiteralExp);
	  	 	Fragments._CallExp__CallExp.initProperties(_CallExp);
	  	 	Fragments._CallOperationAction__CallOperationAction.initProperties(_CallOperationAction);
	  	 	Fragments._Class__Class.initProperties(_Class);
	  	 	Fragments._Classifier__Classifier.initProperties(_Classifier);
	  	 	Fragments._ClassifierType__ClassifierType.initProperties(_ClassifierType);
	  	 	Fragments._Collection__Collection.initProperties(_Collection);
	  	 	Fragments._CollectionItem__CollectionItem.initProperties(_CollectionItem);
	  	 	Fragments._CollectionKind__CollectionKind.initProperties(_CollectionKind);
	  	 	Fragments._CollectionLiteralExp__CollectionLiteralExp.initProperties(_CollectionLiteralExp);
	  	 	Fragments._CollectionLiteralPart__CollectionLiteralPart.initProperties(_CollectionLiteralPart);
	  	 	Fragments._CollectionRange__CollectionRange.initProperties(_CollectionRange);
	  	 	Fragments._CollectionType__CollectionType.initProperties(_CollectionType);
	  	 	Fragments._Comment__Comment.initProperties(_Comment);
	  	 	Fragments._Constraint__Constraint.initProperties(_Constraint);
	  	 	Fragments._DataType__DataType.initProperties(_DataType);
	  	 	Fragments._Detail__Detail.initProperties(_Detail);
	  	 	Fragments._Element__Element.initProperties(_Element);
	  	 	Fragments._EnumLiteralExp__EnumLiteralExp.initProperties(_EnumLiteralExp);
	  	 	Fragments._Enumeration__Enumeration.initProperties(_Enumeration);
	  	 	Fragments._EnumerationLiteral__EnumerationLiteral.initProperties(_EnumerationLiteral);
	  	 	Fragments._ExpressionInOcl__ExpressionInOcl.initProperties(_ExpressionInOcl);
	  	 	Fragments._Feature__Feature.initProperties(_Feature);
	  	 	Fragments._FeatureCallExp__FeatureCallExp.initProperties(_FeatureCallExp);
	  	 	Fragments._IfExp__IfExp.initProperties(_IfExp);
	  	 	Fragments._Int__Int.initProperties(_Int);
	  	 	Fragments._Integer__Integer.initProperties(_Integer);
	  	 	Fragments._IntegerLiteralExp__IntegerLiteralExp.initProperties(_IntegerLiteralExp);
	  	 	Fragments._InvalidLiteralExp__InvalidLiteralExp.initProperties(_InvalidLiteralExp);
	  	 	Fragments._InvalidType__InvalidType.initProperties(_InvalidType);
	  	 	Fragments._IterateExp__IterateExp.initProperties(_IterateExp);
	  	 	Fragments._Iteration__Iteration.initProperties(_Iteration);
	  	 	Fragments._IteratorExp__IteratorExp.initProperties(_IteratorExp);
	  	 	Fragments._LambdaType__LambdaType.initProperties(_LambdaType);
	  	 	Fragments._LetExp__LetExp.initProperties(_LetExp);
	  	 	Fragments._Library__Library.initProperties(_Library);
	  	 	Fragments._LibraryFeature__LibraryFeature.initProperties(_LibraryFeature);
	  	 	Fragments._LiteralExp__LiteralExp.initProperties(_LiteralExp);
	  	 	Fragments._LoopExp__LoopExp.initProperties(_LoopExp);
	  	 	Fragments._MessageExp__MessageExp.initProperties(_MessageExp);
	  	 	Fragments._MessageType__MessageType.initProperties(_MessageType);
	  	 	Fragments._MonikeredElement__MonikeredElement.initProperties(_MonikeredElement);
	  	 	Fragments._MultiplicityElement__MultiplicityElement.initProperties(_MultiplicityElement);
	  	 	Fragments._Nameable__Nameable.initProperties(_Nameable);
	  	 	Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
	  	 	Fragments._Namespace__Namespace.initProperties(_Namespace);
	  	 	Fragments._NavigationCallExp__NavigationCallExp.initProperties(_NavigationCallExp);
	  	 	Fragments._NonOrderedCollection__NonOrderedCollection.initProperties(_NonOrderedCollection);
	  	 	Fragments._NonUniqueCollection__NonUniqueCollection.initProperties(_NonUniqueCollection);
	  	 	Fragments._NullLiteralExp__NullLiteralExp.initProperties(_NullLiteralExp);
	  	 	Fragments._NumericLiteralExp__NumericLiteralExp.initProperties(_NumericLiteralExp);
	  	 	Fragments._Object__Object.initProperties(_Object);
	  	 	Fragments._OclAny__OclAny.initProperties(_OclAny);
	  	 	Fragments._OclExpression__OclExpression.initProperties(_OclExpression);
	  	 	Fragments._OclInvalid__OclInvalid.initProperties(_OclInvalid);
	  	 	Fragments._OclMessage__OclMessage.initProperties(_OclMessage);
	  	 	Fragments._OclSelf__OclSelf.initProperties(_OclSelf);
	  	 	Fragments._OclState__OclState.initProperties(_OclState);
	  	 	Fragments._OclTuple__OclTuple.initProperties(_OclTuple);
	  	 	Fragments._OclVoid__OclVoid.initProperties(_OclVoid);
	  	 	Fragments._OpaqueExpression__OpaqueExpression.initProperties(_OpaqueExpression);
	  	 	Fragments._Operation__Operation.initProperties(_Operation);
	  	 	Fragments._OperationCallExp__OperationCallExp.initProperties(_OperationCallExp);
	  	 	Fragments._OperationTemplateParameter__OperationTemplateParameter.initProperties(_OperationTemplateParameter);
	  	 	Fragments._OrderedCollection__OrderedCollection.initProperties(_OrderedCollection);
	  	 	Fragments._OrderedSet__OrderedSet.initProperties(_OrderedSet);
	  	 	Fragments._OrderedSetType__OrderedSetType.initProperties(_OrderedSetType);
	  	 	Fragments._Package__Package.initProperties(_Package);
	  	 	Fragments._PackageableElement__PackageableElement.initProperties(_PackageableElement);
	  	 	Fragments._Parameter__Parameter.initProperties(_Parameter);
	  	 	Fragments._ParameterableElement__ParameterableElement.initProperties(_ParameterableElement);
	  	 	Fragments._Pivotable__Pivotable.initProperties(_Pivotable);
	  	 	Fragments._Precedence__Precedence.initProperties(_Precedence);
	  	 	Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp.initProperties(_PrimitiveLiteralExp);
	  	 	Fragments._PrimitiveType__PrimitiveType.initProperties(_PrimitiveType);
	  	 	Fragments._Property__Property.initProperties(_Property);
	  	 	Fragments._PropertyCallExp__PropertyCallExp.initProperties(_PropertyCallExp);
	  	 	Fragments._Real__Real.initProperties(_Real);
	  	 	Fragments._RealLiteralExp__RealLiteralExp.initProperties(_RealLiteralExp);
	  	 	Fragments._SelfType__SelfType.initProperties(_SelfType);
	  	 	Fragments._SendSignalAction__SendSignalAction.initProperties(_SendSignalAction);
	  	 	Fragments._Sequence__Sequence.initProperties(_Sequence);
	  	 	Fragments._SequenceType__SequenceType.initProperties(_SequenceType);
	  	 	Fragments._Set__Set.initProperties(_Set);
	  	 	Fragments._SetType__SetType.initProperties(_SetType);
	  	 	Fragments._Signal__Signal.initProperties(_Signal);
	  	 	Fragments._State__State.initProperties(_State);
	  	 	Fragments._StateExp__StateExp.initProperties(_StateExp);
	  	 	Fragments._String__String.initProperties(_String);
	  	 	Fragments._StringLiteralExp__StringLiteralExp.initProperties(_StringLiteralExp);
	  	 	Fragments._TemplateBinding__TemplateBinding.initProperties(_TemplateBinding);
	  	 	Fragments._TemplateParameter__TemplateParameter.initProperties(_TemplateParameter);
	  	 	Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution.initProperties(_TemplateParameterSubstitution);
	  	 	Fragments._TemplateParameterType__TemplateParameterType.initProperties(_TemplateParameterType);
	  	 	Fragments._TemplateSignature__TemplateSignature.initProperties(_TemplateSignature);
	  	 	Fragments._TemplateableElement__TemplateableElement.initProperties(_TemplateableElement);
	  	 	Fragments._Throwable__Throwable.initProperties(_Throwable);
	  	 	Fragments._Tuple__Tuple.initProperties(_Tuple);
	  	 	Fragments._TupleLiteralExp__TupleLiteralExp.initProperties(_TupleLiteralExp);
	  	 	Fragments._TupleLiteralPart__TupleLiteralPart.initProperties(_TupleLiteralPart);
	  	 	Fragments._TupleType__TupleType.initProperties(_TupleType);
	  	 	Fragments._Type__Type.initProperties(_Type);
	  	 	Fragments._TypeExp__TypeExp.initProperties(_TypeExp);
	  	 	Fragments._TypeTemplateParameter__TypeTemplateParameter.initProperties(_TypeTemplateParameter);
	  	 	Fragments._TypedElement__TypedElement.initProperties(_TypedElement);
	  	 	Fragments._TypedMultiplicityElement__TypedMultiplicityElement.initProperties(_TypedMultiplicityElement);
	  	 	Fragments._UniqueCollection__UniqueCollection.initProperties(_UniqueCollection);
	  	 	Fragments._UnlimitedNatural__UnlimitedNatural.initProperties(_UnlimitedNatural);
	  	 	Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp.initProperties(_UnlimitedNaturalLiteralExp);
	  	 	Fragments._UnspecifiedType__UnspecifiedType.initProperties(_UnspecifiedType);
	  	 	Fragments._UnspecifiedValueExp__UnspecifiedValueExp.initProperties(_UnspecifiedValueExp);
	  	 	Fragments._ValueSpecification__ValueSpecification.initProperties(_ValueSpecification);
	  	 	Fragments._Variable__Variable.initProperties(_Variable);
	  	 	Fragments._VariableDeclaration__VariableDeclaration.initProperties(_VariableDeclaration);
	  	 	Fragments._VariableExp__VariableExp.initProperties(_VariableExp);
	  	 	Fragments._Visitable__Visitable.initProperties(_Visitable);
	  	 	Fragments._Visitor__Visitor.initProperties(_Visitor);
	  	 	Fragments._VoidType__VoidType.initProperties(_VoidType);
		}
	
		public static void init() {}
	}
}
