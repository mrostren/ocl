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
 * from: ocl
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateJavaTables
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateJavaTables.mtl
 *
 * Do not edit it.
 *
 * $Id$
 */
package org.eclipse.ocl.examples.library.ocl;

import org.eclipse.ocl.examples.library.executor.ExecutorClass;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorPackage;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;

/**
 * OCLTables provides the dispatch tables for the ocl for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class OCLTables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final ExecutorPackage PACKAGE = new ExecutorPackage("ocl", null);

	/**
	 *	The class descriptors for each class.
	 */
	public static class Classes {
	    public static final ExecutorClass _Bag = new ExecutorClass("Bag", PACKAGE, null, null); // NonOrderedCollection,NonUniqueCollection
	    public static final ExecutorClass _Boolean = new ExecutorClass("Boolean", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _Classifier = new ExecutorClass("Classifier", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _Collection = new ExecutorClass("Collection", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _Enumeration = new ExecutorClass("Enumeration", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _Integer = new ExecutorClass("Integer", PACKAGE, null, null); // Real
	    public static final ExecutorClass _NonOrderedCollection = new ExecutorClass("NonOrderedCollection", PACKAGE, null, null); // Collection
	    public static final ExecutorClass _NonUniqueCollection = new ExecutorClass("NonUniqueCollection", PACKAGE, null, null); // Collection
	    public static final ExecutorClass _OclAny = new ExecutorClass("OclAny", PACKAGE, null, null);
	    public static final ExecutorClass _OclInvalid = new ExecutorClass("OclInvalid", PACKAGE, null, null); // OclVoid
	    public static final ExecutorClass _OclMessage = new ExecutorClass("OclMessage", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OclSelf = new ExecutorClass("OclSelf", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OclState = new ExecutorClass("OclState", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OclTuple = new ExecutorClass("OclTuple", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OclVoid = new ExecutorClass("OclVoid", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _OrderedCollection = new ExecutorClass("OrderedCollection", PACKAGE, null, null); // Collection
	    public static final ExecutorClass _OrderedSet = new ExecutorClass("OrderedSet", PACKAGE, null, null); // OrderedCollection,UniqueCollection
	    public static final ExecutorClass _Real = new ExecutorClass("Real", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _Sequence = new ExecutorClass("Sequence", PACKAGE, null, null); // NonUniqueCollection,OrderedCollection
	    public static final ExecutorClass _Set = new ExecutorClass("Set", PACKAGE, null, null); // NonOrderedCollection,UniqueCollection
	    public static final ExecutorClass _String = new ExecutorClass("String", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _Tuple = new ExecutorClass("Tuple", PACKAGE, null, null); // OclAny
	    public static final ExecutorClass _UniqueCollection = new ExecutorClass("UniqueCollection", PACKAGE, null, null); // Collection
	    public static final ExecutorClass _UnlimitedNatural = new ExecutorClass("UnlimitedNatural", PACKAGE, null, null); // Integer
	    public static final ExecutorClass __Dummy = new ExecutorClass("_Dummy", PACKAGE, null, null);
	
		private static final ExecutorClass[] classes = {
		    _Bag,
		    _Classifier,
		    _Collection,
		    _Enumeration,
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
		    _Boolean,
		    _Integer,
		    _Real,
		    _String,
		    _UnlimitedNatural,
		    _Tuple,
		    __Dummy
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
		public static final ExecutorFragment _Bag__Bag = new ExecutorFragment(Classes._Bag, OCLTables.Classes._Bag, null, null);
		public static final ExecutorFragment _Bag__Collection = new ExecutorFragment(Classes._Bag, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _Bag__NonOrderedCollection = new ExecutorFragment(Classes._Bag, OCLTables.Classes._NonOrderedCollection, null, null);
		public static final ExecutorFragment _Bag__NonUniqueCollection = new ExecutorFragment(Classes._Bag, OCLTables.Classes._NonUniqueCollection, null, null);
		public static final ExecutorFragment _Bag__OclAny = new ExecutorFragment(Classes._Bag, OCLTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _Boolean__Boolean = new ExecutorFragment(Classes._Boolean, OCLTables.Classes._Boolean, null, null);
		public static final ExecutorFragment _Boolean__OclAny = new ExecutorFragment(Classes._Boolean, OCLTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _Classifier__Classifier = new ExecutorFragment(Classes._Classifier, OCLTables.Classes._Classifier, null, null);
		public static final ExecutorFragment _Classifier__OclAny = new ExecutorFragment(Classes._Classifier, OCLTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _Collection__Collection = new ExecutorFragment(Classes._Collection, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _Collection__OclAny = new ExecutorFragment(Classes._Collection, OCLTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _Enumeration__Enumeration = new ExecutorFragment(Classes._Enumeration, OCLTables.Classes._Enumeration, null, null);
		public static final ExecutorFragment _Enumeration__OclAny = new ExecutorFragment(Classes._Enumeration, OCLTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _Integer__Integer = new ExecutorFragment(Classes._Integer, OCLTables.Classes._Integer, null, null);
		public static final ExecutorFragment _Integer__OclAny = new ExecutorFragment(Classes._Integer, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Integer__Real = new ExecutorFragment(Classes._Integer, OCLTables.Classes._Real, null, null);
		
		public static final ExecutorFragment _NonOrderedCollection__Collection = new ExecutorFragment(Classes._NonOrderedCollection, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _NonOrderedCollection__NonOrderedCollection = new ExecutorFragment(Classes._NonOrderedCollection, OCLTables.Classes._NonOrderedCollection, null, null);
		public static final ExecutorFragment _NonOrderedCollection__OclAny = new ExecutorFragment(Classes._NonOrderedCollection, OCLTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _NonUniqueCollection__Collection = new ExecutorFragment(Classes._NonUniqueCollection, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _NonUniqueCollection__NonUniqueCollection = new ExecutorFragment(Classes._NonUniqueCollection, OCLTables.Classes._NonUniqueCollection, null, null);
		public static final ExecutorFragment _NonUniqueCollection__OclAny = new ExecutorFragment(Classes._NonUniqueCollection, OCLTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _OclAny__OclAny = new ExecutorFragment(Classes._OclAny, OCLTables.Classes._OclAny, null, null);
		
		public static final ExecutorFragment _OclInvalid__OclAny = new ExecutorFragment(Classes._OclInvalid, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclInvalid__OclInvalid = new ExecutorFragment(Classes._OclInvalid, OCLTables.Classes._OclInvalid, null, null);
		public static final ExecutorFragment _OclInvalid__OclVoid = new ExecutorFragment(Classes._OclInvalid, OCLTables.Classes._OclVoid, null, null);
		
		public static final ExecutorFragment _OclMessage__OclAny = new ExecutorFragment(Classes._OclMessage, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclMessage__OclMessage = new ExecutorFragment(Classes._OclMessage, OCLTables.Classes._OclMessage, null, null);
		
		public static final ExecutorFragment _OclSelf__OclAny = new ExecutorFragment(Classes._OclSelf, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclSelf__OclSelf = new ExecutorFragment(Classes._OclSelf, OCLTables.Classes._OclSelf, null, null);
		
		public static final ExecutorFragment _OclState__OclAny = new ExecutorFragment(Classes._OclState, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclState__OclState = new ExecutorFragment(Classes._OclState, OCLTables.Classes._OclState, null, null);
		
		public static final ExecutorFragment _OclTuple__OclAny = new ExecutorFragment(Classes._OclTuple, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclTuple__OclTuple = new ExecutorFragment(Classes._OclTuple, OCLTables.Classes._OclTuple, null, null);
		
		public static final ExecutorFragment _OclVoid__OclAny = new ExecutorFragment(Classes._OclVoid, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OclVoid__OclVoid = new ExecutorFragment(Classes._OclVoid, OCLTables.Classes._OclVoid, null, null);
		
		public static final ExecutorFragment _OrderedCollection__Collection = new ExecutorFragment(Classes._OrderedCollection, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _OrderedCollection__OclAny = new ExecutorFragment(Classes._OrderedCollection, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OrderedCollection__OrderedCollection = new ExecutorFragment(Classes._OrderedCollection, OCLTables.Classes._OrderedCollection, null, null);
		
		public static final ExecutorFragment _OrderedSet__Collection = new ExecutorFragment(Classes._OrderedSet, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _OrderedSet__OclAny = new ExecutorFragment(Classes._OrderedSet, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _OrderedSet__OrderedCollection = new ExecutorFragment(Classes._OrderedSet, OCLTables.Classes._OrderedCollection, null, null);
		public static final ExecutorFragment _OrderedSet__OrderedSet = new ExecutorFragment(Classes._OrderedSet, OCLTables.Classes._OrderedSet, null, null);
		public static final ExecutorFragment _OrderedSet__UniqueCollection = new ExecutorFragment(Classes._OrderedSet, OCLTables.Classes._UniqueCollection, null, null);
		
		public static final ExecutorFragment _Real__OclAny = new ExecutorFragment(Classes._Real, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Real__Real = new ExecutorFragment(Classes._Real, OCLTables.Classes._Real, null, null);
		
		public static final ExecutorFragment _Sequence__Collection = new ExecutorFragment(Classes._Sequence, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _Sequence__NonUniqueCollection = new ExecutorFragment(Classes._Sequence, OCLTables.Classes._NonUniqueCollection, null, null);
		public static final ExecutorFragment _Sequence__OclAny = new ExecutorFragment(Classes._Sequence, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Sequence__OrderedCollection = new ExecutorFragment(Classes._Sequence, OCLTables.Classes._OrderedCollection, null, null);
		public static final ExecutorFragment _Sequence__Sequence = new ExecutorFragment(Classes._Sequence, OCLTables.Classes._Sequence, null, null);
		
		public static final ExecutorFragment _Set__Collection = new ExecutorFragment(Classes._Set, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _Set__NonOrderedCollection = new ExecutorFragment(Classes._Set, OCLTables.Classes._NonOrderedCollection, null, null);
		public static final ExecutorFragment _Set__OclAny = new ExecutorFragment(Classes._Set, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Set__Set = new ExecutorFragment(Classes._Set, OCLTables.Classes._Set, null, null);
		public static final ExecutorFragment _Set__UniqueCollection = new ExecutorFragment(Classes._Set, OCLTables.Classes._UniqueCollection, null, null);
		
		public static final ExecutorFragment _String__OclAny = new ExecutorFragment(Classes._String, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _String__String = new ExecutorFragment(Classes._String, OCLTables.Classes._String, null, null);
		
		public static final ExecutorFragment _Tuple__OclAny = new ExecutorFragment(Classes._Tuple, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _Tuple__Tuple = new ExecutorFragment(Classes._Tuple, OCLTables.Classes._Tuple, null, null);
		
		public static final ExecutorFragment _UniqueCollection__Collection = new ExecutorFragment(Classes._UniqueCollection, OCLTables.Classes._Collection, null, null);
		public static final ExecutorFragment _UniqueCollection__OclAny = new ExecutorFragment(Classes._UniqueCollection, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _UniqueCollection__UniqueCollection = new ExecutorFragment(Classes._UniqueCollection, OCLTables.Classes._UniqueCollection, null, null);
		
		public static final ExecutorFragment _UnlimitedNatural__Integer = new ExecutorFragment(Classes._UnlimitedNatural, OCLTables.Classes._Integer, null, null);
		public static final ExecutorFragment _UnlimitedNatural__OclAny = new ExecutorFragment(Classes._UnlimitedNatural, OCLTables.Classes._OclAny, null, null);
		public static final ExecutorFragment _UnlimitedNatural__Real = new ExecutorFragment(Classes._UnlimitedNatural, OCLTables.Classes._Real, null, null);
		public static final ExecutorFragment _UnlimitedNatural__UnlimitedNatural = new ExecutorFragment(Classes._UnlimitedNatural, OCLTables.Classes._UnlimitedNatural, null, null);
		
		public static final ExecutorFragment __Dummy___Dummy = new ExecutorFragment(Classes.__Dummy, OCLTables.Classes.__Dummy, null, null);
		
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
		public static final ExecutorOperation _Integer__abs = new ExecutorOperation("abs", Classes._Integer, 5, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Integer__div = new ExecutorOperation("div", Classes._Integer, 6, org.eclipse.ocl.examples.library.numeric.NumericDivOperation.INSTANCE);
		public static final ExecutorOperation _Integer__max = new ExecutorOperation("max", Classes._Integer, 7, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
		public static final ExecutorOperation _Integer__min = new ExecutorOperation("min", Classes._Integer, 8, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
		public static final ExecutorOperation _Integer__mod = new ExecutorOperation("mod", Classes._Integer, 9, org.eclipse.ocl.examples.library.numeric.NumericModOperation.INSTANCE);
		public static final ExecutorOperation _Integer__toString = new ExecutorOperation("toString", Classes._Integer, 10, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
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
	
		public static final ExecutorOperation _Real___mul_ = new ExecutorOperation("*", Classes._Real, 0, org.eclipse.ocl.examples.library.numeric.NumericTimesOperation.INSTANCE);
		public static final ExecutorOperation _Real___add_ = new ExecutorOperation("+", Classes._Real, 1, org.eclipse.ocl.examples.library.real.RealPlusOperation.INSTANCE);
		public static final ExecutorOperation _Real__0__sub_ = new ExecutorOperation("-", Classes._Real, 2, org.eclipse.ocl.examples.library.real.RealMinusOperation.INSTANCE);
		public static final ExecutorOperation _Real__1__sub_ = new ExecutorOperation("-", Classes._Real, 3, org.eclipse.ocl.examples.library.numeric.NumericNegateOperation.INSTANCE);
		public static final ExecutorOperation _Real___div_ = new ExecutorOperation("/", Classes._Real, 4, org.eclipse.ocl.examples.library.numeric.NumericDivideOperation.INSTANCE);
		public static final ExecutorOperation _Real___lt_ = new ExecutorOperation("<", Classes._Real, 5, org.eclipse.ocl.examples.library.numeric.NumericLessThanOperation.INSTANCE);
		public static final ExecutorOperation _Real___lt__eq_ = new ExecutorOperation("<=", Classes._Real, 6, org.eclipse.ocl.examples.library.numeric.NumericLessThanEqualOperation.INSTANCE);
		public static final ExecutorOperation _Real___lt__gt_ = new ExecutorOperation("<>", Classes._Real, 7, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _Real___eq_ = new ExecutorOperation("=", Classes._Real, 8, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _Real___gt_ = new ExecutorOperation(">", Classes._Real, 9, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanOperation.INSTANCE);
		public static final ExecutorOperation _Real___gt__eq_ = new ExecutorOperation(">=", Classes._Real, 10, org.eclipse.ocl.examples.library.numeric.NumericGreaterThanEqualOperation.INSTANCE);
		public static final ExecutorOperation _Real__abs = new ExecutorOperation("abs", Classes._Real, 11, org.eclipse.ocl.examples.library.numeric.NumericAbsOperation.INSTANCE);
		public static final ExecutorOperation _Real__floor = new ExecutorOperation("floor", Classes._Real, 12, org.eclipse.ocl.examples.library.numeric.NumericFloorOperation.INSTANCE);
		public static final ExecutorOperation _Real__max = new ExecutorOperation("max", Classes._Real, 13, org.eclipse.ocl.examples.library.numeric.NumericMaxOperation.INSTANCE);
		public static final ExecutorOperation _Real__min = new ExecutorOperation("min", Classes._Real, 14, org.eclipse.ocl.examples.library.numeric.NumericMinOperation.INSTANCE);
		public static final ExecutorOperation _Real__oclAsType = new ExecutorOperation("oclAsType", Classes._Real, 15, org.eclipse.ocl.examples.library.numeric.NumericOclAsTypeOperation.INSTANCE);
		public static final ExecutorOperation _Real__round = new ExecutorOperation("round", Classes._Real, 16, org.eclipse.ocl.examples.library.numeric.NumericRoundOperation.INSTANCE);
		public static final ExecutorOperation _Real__toString = new ExecutorOperation("toString", Classes._Real, 17, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
	
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
		public static final ExecutorOperation _String___lt_ = new ExecutorOperation("<", Classes._String, 1, org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
		public static final ExecutorOperation _String___lt__eq_ = new ExecutorOperation("<=", Classes._String, 2, org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
		public static final ExecutorOperation _String___lt__gt_ = new ExecutorOperation("<>", Classes._String, 3, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final ExecutorOperation _String___eq_ = new ExecutorOperation("=", Classes._String, 4, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final ExecutorOperation _String___gt_ = new ExecutorOperation(">", Classes._String, 5, org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
		public static final ExecutorOperation _String___gt__eq_ = new ExecutorOperation(">=", Classes._String, 6, org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
		public static final ExecutorOperation _String__at = new ExecutorOperation("at", Classes._String, 7, org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
		public static final ExecutorOperation _String__characters = new ExecutorOperation("characters", Classes._String, 8, org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
		public static final ExecutorOperation _String__concat = new ExecutorOperation("concat", Classes._String, 9, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
		public static final ExecutorOperation _String__equalsIgnoreCase = new ExecutorOperation("equalsIgnoreCase", Classes._String, 10, org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__indexOf = new ExecutorOperation("indexOf", Classes._String, 11, org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
		public static final ExecutorOperation _String__size = new ExecutorOperation("size", Classes._String, 12, org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
		public static final ExecutorOperation _String__substring = new ExecutorOperation("substring", Classes._String, 13, org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
		public static final ExecutorOperation _String__toBoolean = new ExecutorOperation("toBoolean", Classes._String, 14, org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
		public static final ExecutorOperation _String__toInteger = new ExecutorOperation("toInteger", Classes._String, 15, org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
		public static final ExecutorOperation _String__toLower = new ExecutorOperation("toLower", Classes._String, 16, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toLowerCase = new ExecutorOperation("toLowerCase", Classes._String, 17, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toReal = new ExecutorOperation("toReal", Classes._String, 18, org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
		public static final ExecutorOperation _String__toString = new ExecutorOperation("toString", Classes._String, 19, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpper = new ExecutorOperation("toUpper", Classes._String, 20, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final ExecutorOperation _String__toUpperCase = new ExecutorOperation("toUpperCase", Classes._String, 21, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
	
		public static final ExecutorOperation _UniqueCollection__sortedBy = new ExecutorOperation("sortedBy", Classes._UniqueCollection, 0, org.eclipse.ocl.examples.library.iterator.SortedByIteration.INSTANCE);
	}

	/**
	 *	The property descriptors for each property of each class.
	 */
	public static class Properties {
		
	}

	/**
	 *	The fragments for all base classes in depth order: OclAny first, OclSelf last.
	 */
	public static class ClassFragments {
		private static final ExecutorFragment[] _Bag =
		{
		    Fragments._Bag__OclAny /* 0 */,
		    Fragments._Bag__Collection /* 1 */,
		    Fragments._Bag__NonOrderedCollection /* 2 */,
		    Fragments._Bag__NonUniqueCollection /* 2 */,
		    Fragments._Bag__Bag /* 3 */
		};
		private static final int[] __Bag = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _Boolean =
		{
		    Fragments._Boolean__OclAny /* 0 */,
		    Fragments._Boolean__Boolean /* 1 */
		};
		private static final int[] __Boolean = { 1,1 };
	
		private static final ExecutorFragment[] _Classifier =
		{
		    Fragments._Classifier__OclAny /* 0 */,
		    Fragments._Classifier__Classifier /* 1 */
		};
		private static final int[] __Classifier = { 1,1 };
	
		private static final ExecutorFragment[] _Collection =
		{
		    Fragments._Collection__OclAny /* 0 */,
		    Fragments._Collection__Collection /* 1 */
		};
		private static final int[] __Collection = { 1,1 };
	
		private static final ExecutorFragment[] _Enumeration =
		{
		    Fragments._Enumeration__OclAny /* 0 */,
		    Fragments._Enumeration__Enumeration /* 1 */
		};
		private static final int[] __Enumeration = { 1,1 };
	
		private static final ExecutorFragment[] _Integer =
		{
		    Fragments._Integer__OclAny /* 0 */,
		    Fragments._Integer__Real /* 1 */,
		    Fragments._Integer__Integer /* 2 */
		};
		private static final int[] __Integer = { 1,1,1 };
	
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
	
		private static final ExecutorFragment[] _OclAny =
		{
		    Fragments._OclAny__OclAny /* 0 */
		};
		private static final int[] __OclAny = { 1 };
	
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
	
		private static final ExecutorFragment[] _Real =
		{
		    Fragments._Real__OclAny /* 0 */,
		    Fragments._Real__Real /* 1 */
		};
		private static final int[] __Real = { 1,1 };
	
		private static final ExecutorFragment[] _Sequence =
		{
		    Fragments._Sequence__OclAny /* 0 */,
		    Fragments._Sequence__Collection /* 1 */,
		    Fragments._Sequence__OrderedCollection /* 2 */,
		    Fragments._Sequence__NonUniqueCollection /* 2 */,
		    Fragments._Sequence__Sequence /* 3 */
		};
		private static final int[] __Sequence = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _Set =
		{
		    Fragments._Set__OclAny /* 0 */,
		    Fragments._Set__Collection /* 1 */,
		    Fragments._Set__UniqueCollection /* 2 */,
		    Fragments._Set__NonOrderedCollection /* 2 */,
		    Fragments._Set__Set /* 3 */
		};
		private static final int[] __Set = { 1,1,2,1 };
	
		private static final ExecutorFragment[] _String =
		{
		    Fragments._String__OclAny /* 0 */,
		    Fragments._String__String /* 1 */
		};
		private static final int[] __String = { 1,1 };
	
		private static final ExecutorFragment[] _Tuple =
		{
		    Fragments._Tuple__OclAny /* 0 */,
		    Fragments._Tuple__Tuple /* 1 */
		};
		private static final int[] __Tuple = { 1,1 };
	
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
	
		private static final ExecutorFragment[] __Dummy =
		{
		    Fragments.__Dummy___Dummy /* 0 */
		};
		private static final int[] ___Dummy = { 1 };
	
		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Classes._Bag.initFragments(_Bag, __Bag);
			Classes._Boolean.initFragments(_Boolean, __Boolean);
			Classes._Classifier.initFragments(_Classifier, __Classifier);
			Classes._Collection.initFragments(_Collection, __Collection);
			Classes._Enumeration.initFragments(_Enumeration, __Enumeration);
			Classes._Integer.initFragments(_Integer, __Integer);
			Classes._NonOrderedCollection.initFragments(_NonOrderedCollection, __NonOrderedCollection);
			Classes._NonUniqueCollection.initFragments(_NonUniqueCollection, __NonUniqueCollection);
			Classes._OclAny.initFragments(_OclAny, __OclAny);
			Classes._OclInvalid.initFragments(_OclInvalid, __OclInvalid);
			Classes._OclMessage.initFragments(_OclMessage, __OclMessage);
			Classes._OclSelf.initFragments(_OclSelf, __OclSelf);
			Classes._OclState.initFragments(_OclState, __OclState);
			Classes._OclTuple.initFragments(_OclTuple, __OclTuple);
			Classes._OclVoid.initFragments(_OclVoid, __OclVoid);
			Classes._OrderedCollection.initFragments(_OrderedCollection, __OrderedCollection);
			Classes._OrderedSet.initFragments(_OrderedSet, __OrderedSet);
			Classes._Real.initFragments(_Real, __Real);
			Classes._Sequence.initFragments(_Sequence, __Sequence);
			Classes._Set.initFragments(_Set, __Set);
			Classes._String.initFragments(_String, __String);
			Classes._Tuple.initFragments(_Tuple, __Tuple);
			Classes._UniqueCollection.initFragments(_UniqueCollection, __UniqueCollection);
			Classes._UnlimitedNatural.initFragments(_UnlimitedNatural, __UnlimitedNatural);
			Classes.__Dummy.initFragments(__Dummy, ___Dummy);
		}
	
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each class.
	 */
	public static class FragmentOperations {
		private static final ExecutorOperation[] _Bag__Bag = {
		    OCLTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Bag__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Bag__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Bag__including /* including(Bag(T)::T) */,
		    OCLTables.Operations._Bag__reject /* reject(Bag(T)::T|Lambda Bag(T)::T() : Boolean) */,
		    OCLTables.Operations._Bag__select /* select(Bag(T)::T|Lambda Bag(T)::T() : Boolean) */
		};
		private static final ExecutorOperation[] _Bag__Collection = {
		    OCLTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Bag__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Bag__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Bag__NonOrderedCollection = {
		    OCLTables.Operations._NonOrderedCollection__closure /* closure(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : Set(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    OCLTables.Operations._NonOrderedCollection__collect /* collect<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    OCLTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__1_intersection /* intersection(Set(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__0_union /* union(Bag(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__1_union /* union(Set(NonOrderedCollection(T)::T)) */
		};
		private static final ExecutorOperation[] _Bag__NonUniqueCollection = {
		    OCLTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(NonUniqueCollection(T)::T|Lambda NonUniqueCollection(T)::T() : OclAny) */
		};
		private static final ExecutorOperation[] _Bag__OclAny = {
		    OCLTables.Operations._Bag___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Bag___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Boolean__Boolean = {
		    OCLTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Boolean__allInstances /* allInstances() */,
		    OCLTables.Operations._Boolean__and /* _'and'(Boolean) */,
		    OCLTables.Operations._Boolean__implies /* _'implies'(Boolean) */,
		    OCLTables.Operations._Boolean__not /* _'not'() */,
		    OCLTables.Operations._Boolean__or /* _'or'(Boolean) */,
		    OCLTables.Operations._Boolean__toString /* toString() */,
		    OCLTables.Operations._Boolean__xor /* _'xor'(Boolean) */
		};
		private static final ExecutorOperation[] _Boolean__OclAny = {
		    OCLTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Classifier__Classifier = {
		    OCLTables.Operations._Classifier__allInstances /* allInstances() */,
		    OCLTables.Operations._Classifier__oclContainer /* oclContainer<U>() */,
		    OCLTables.Operations._Classifier__oclContents /* oclContents<U>() */
		};
		private static final ExecutorOperation[] _Classifier__OclAny = {
		    OCLTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Collection__Collection = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Collection__OclAny = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Enumeration__Enumeration = {
		    OCLTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation[] _Enumeration__OclAny = {
		    OCLTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Integer__Integer = {
		    OCLTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    OCLTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    OCLTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    OCLTables.Operations._Integer__0__sub_ /* _'-'() */,
		    OCLTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    OCLTables.Operations._Integer__abs /* abs() */,
		    OCLTables.Operations._Integer__div /* div(Integer) */,
		    OCLTables.Operations._Integer__max /* max(OclSelf) */,
		    OCLTables.Operations._Integer__min /* min(OclSelf) */,
		    OCLTables.Operations._Integer__mod /* mod(Integer) */,
		    OCLTables.Operations._Integer__toString /* toString() */
		};
		private static final ExecutorOperation[] _Integer__OclAny = {
		    OCLTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Integer__Real = {
		    OCLTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    OCLTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    OCLTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    OCLTables.Operations._Integer__0__sub_ /* _'-'() */,
		    OCLTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    OCLTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLTables.Operations._Integer__abs /* abs() */,
		    OCLTables.Operations._Real__floor /* floor() */,
		    OCLTables.Operations._Integer__max /* max(OclSelf) */,
		    OCLTables.Operations._Integer__min /* min(OclSelf) */,
		    OCLTables.Operations._Real__oclAsType /* oclAsType<TT>(Classifier<Real::TT>) */,
		    OCLTables.Operations._Real__round /* round() */,
		    OCLTables.Operations._Integer__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _NonOrderedCollection__NonOrderedCollection = {
		    OCLTables.Operations._NonOrderedCollection__closure /* closure(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : Set(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    OCLTables.Operations._NonOrderedCollection__collect /* collect<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    OCLTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__1_intersection /* intersection(Set(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__0_union /* union(Bag(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__1_union /* union(Set(NonOrderedCollection(T)::T)) */
		};
		private static final ExecutorOperation[] _NonOrderedCollection__Collection = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _NonOrderedCollection__OclAny = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _NonUniqueCollection__NonUniqueCollection = {
		    OCLTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(NonUniqueCollection(T)::T|Lambda NonUniqueCollection(T)::T() : OclAny) */
		};
		private static final ExecutorOperation[] _NonUniqueCollection__Collection = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _NonUniqueCollection__OclAny = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclAny__OclAny = {
		    OCLTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclInvalid__OclInvalid = {
		    OCLTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclInvalid__allInstances /* allInstances() */,
		    OCLTables.Operations._OclInvalid__oclBadOperation /* oclBadOperation() */,
		    OCLTables.Operations._OclInvalid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclInvalid__OclAny = {
		    OCLTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OclInvalid__OclVoid = {
		    OCLTables.Operations._OclInvalid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclInvalid___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclInvalid__allInstances /* allInstances() */,
		    OCLTables.Operations._OclVoid__and /* _'and'(Boolean) */,
		    OCLTables.Operations._OclVoid__implies /* _'implies'(Boolean) */,
		    OCLTables.Operations._OclVoid__or /* _'or'(Boolean) */,
		    OCLTables.Operations._OclInvalid__toString /* toString() */
		};
	
		private static final ExecutorOperation[] _OclMessage__OclMessage = {
		    OCLTables.Operations._OclMessage__hasReturned /* hasReturned() */,
		    OCLTables.Operations._OclMessage__isOperationCall /* isOperationCall() */,
		    OCLTables.Operations._OclMessage__isSignalSent /* isSignalSent() */,
		    OCLTables.Operations._OclMessage__result /* result() */
		};
		private static final ExecutorOperation[] _OclMessage__OclAny = {
		    OCLTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclSelf__OclSelf = {};
		private static final ExecutorOperation[] _OclSelf__OclAny = {
		    OCLTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclState__OclState = {};
		private static final ExecutorOperation[] _OclState__OclAny = {
		    OCLTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclTuple__OclTuple = {
		    OCLTables.Operations._OclTuple___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclTuple___eq_ /* _'='(OclSelf) */
		};
		private static final ExecutorOperation[] _OclTuple__OclAny = {
		    OCLTables.Operations._OclTuple___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclTuple___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OclVoid__OclVoid = {
		    OCLTables.Operations._OclVoid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclVoid___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclVoid__allInstances /* allInstances() */,
		    OCLTables.Operations._OclVoid__and /* _'and'(Boolean) */,
		    OCLTables.Operations._OclVoid__implies /* _'implies'(Boolean) */,
		    OCLTables.Operations._OclVoid__or /* _'or'(Boolean) */,
		    OCLTables.Operations._OclVoid__toString /* toString() */
		};
		private static final ExecutorOperation[] _OclVoid__OclAny = {
		    OCLTables.Operations._OclVoid___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclVoid___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OrderedCollection__OrderedCollection = {
		    OCLTables.Operations._OrderedCollection__at /* at(Integer) */,
		    OCLTables.Operations._OrderedCollection__closure /* closure(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedSet(OrderedCollection(T)::T)) */,
		    OCLTables.Operations._OrderedCollection__collectNested /* collectNested<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    OCLTables.Operations._OrderedCollection__collect /* collect<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    OCLTables.Operations._OrderedCollection__first /* first() */,
		    OCLTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    OCLTables.Operations._OrderedCollection__last /* last() */,
		    OCLTables.Operations._OrderedCollection__reverse /* reverse() */
		};
		private static final ExecutorOperation[] _OrderedCollection__Collection = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _OrderedCollection__OclAny = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _OrderedSet__OrderedSet = {
		    OCLTables.Operations._OrderedSet___sub_ /* _'-'(Set(OclAny)) */,
		    OCLTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OrderedSet__append /* append(OrderedSet(T)::T) */,
		    OCLTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._OrderedSet__flatten /* flatten<T2>() */,
		    OCLTables.Operations._OrderedSet__including /* including(OrderedSet(T)::T) */,
		    OCLTables.Operations._OrderedSet__insertAt /* insertAt(Integer,OrderedSet(T)::T) */,
		    OCLTables.Operations._OrderedSet__intersection /* intersection(Set(OrderedSet(T)::T)) */,
		    OCLTables.Operations._OrderedSet__prepend /* prepend(OrderedSet(T)::T) */,
		    OCLTables.Operations._OrderedSet__reject /* reject(OrderedSet(T)::T|Lambda OrderedSet(T)::T() : Boolean) */,
		    OCLTables.Operations._OrderedSet__reverse /* reverse() */,
		    OCLTables.Operations._OrderedSet__select /* select(OrderedSet(T)::T|Lambda OrderedSet(T)::T() : Boolean) */,
		    OCLTables.Operations._OrderedSet__subOrderedSet /* subOrderedSet(Integer,Integer) */,
		    OCLTables.Operations._OrderedSet__symmetricDifference /* symmetricDifference(Set(OclAny)) */,
		    OCLTables.Operations._OrderedSet__0_union /* union(OrderedSet(OrderedSet(T)::T)) */,
		    OCLTables.Operations._OrderedSet__1_union /* union(Set(OrderedSet(T)::T)) */
		};
		private static final ExecutorOperation[] _OrderedSet__Collection = {
		    OCLTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._OrderedSet__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._OrderedSet__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _OrderedSet__OclAny = {
		    OCLTables.Operations._OrderedSet___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OrderedSet___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _OrderedSet__OrderedCollection = {
		    OCLTables.Operations._OrderedCollection__at /* at(Integer) */,
		    OCLTables.Operations._OrderedCollection__closure /* closure(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedSet(OrderedCollection(T)::T)) */,
		    OCLTables.Operations._OrderedCollection__collectNested /* collectNested<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    OCLTables.Operations._OrderedCollection__collect /* collect<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    OCLTables.Operations._OrderedCollection__first /* first() */,
		    OCLTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    OCLTables.Operations._OrderedCollection__last /* last() */,
		    OCLTables.Operations._OrderedSet__reverse /* reverse() */
		};
		private static final ExecutorOperation[] _OrderedSet__UniqueCollection = {
		    OCLTables.Operations._UniqueCollection__sortedBy /* sortedBy(UniqueCollection(T)::T|Lambda UniqueCollection(T)::T() : OclAny) */
		};
	
		private static final ExecutorOperation[] _Real__Real = {
		    OCLTables.Operations._Real___mul_ /* _'*'(OclSelf) */,
		    OCLTables.Operations._Real___add_ /* _'+'(OclSelf) */,
		    OCLTables.Operations._Real__0__sub_ /* _'-'(OclSelf) */,
		    OCLTables.Operations._Real__1__sub_ /* _'-'() */,
		    OCLTables.Operations._Real___div_ /* _'/'(OclSelf) */,
		    OCLTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLTables.Operations._Real__abs /* abs() */,
		    OCLTables.Operations._Real__floor /* floor() */,
		    OCLTables.Operations._Real__max /* max(OclSelf) */,
		    OCLTables.Operations._Real__min /* min(OclSelf) */,
		    OCLTables.Operations._Real__oclAsType /* oclAsType<TT>(Classifier<Real::TT>) */,
		    OCLTables.Operations._Real__round /* round() */,
		    OCLTables.Operations._Real__toString /* toString() */
		};
		private static final ExecutorOperation[] _Real__OclAny = {
		    OCLTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Sequence__Sequence = {
		    OCLTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Sequence__append /* append(Sequence(T)::T) */,
		    OCLTables.Operations._Sequence__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Sequence__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Sequence__including /* including(Sequence(T)::T) */,
		    OCLTables.Operations._Sequence__insertAt /* insertAt(Integer,Sequence(T)::T) */,
		    OCLTables.Operations._Sequence__prepend /* prepend(Sequence(T)::T) */,
		    OCLTables.Operations._Sequence__reject /* reject(Sequence(T)::T|Lambda Sequence(T)::T() : Boolean) */,
		    OCLTables.Operations._Sequence__reverse /* reverse() */,
		    OCLTables.Operations._Sequence__select /* select(Sequence(T)::T|Lambda Sequence(T)::T() : Boolean) */,
		    OCLTables.Operations._Sequence__subSequence /* subSequence(Integer,Integer) */,
		    OCLTables.Operations._Sequence__union /* union(Sequence(Sequence(T)::T)) */
		};
		private static final ExecutorOperation[] _Sequence__Collection = {
		    OCLTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Sequence__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Sequence__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Sequence__NonUniqueCollection = {
		    OCLTables.Operations._NonUniqueCollection__sortedBy /* sortedBy(NonUniqueCollection(T)::T|Lambda NonUniqueCollection(T)::T() : OclAny) */
		};
		private static final ExecutorOperation[] _Sequence__OclAny = {
		    OCLTables.Operations._Sequence___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Sequence___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Sequence__OrderedCollection = {
		    OCLTables.Operations._OrderedCollection__at /* at(Integer) */,
		    OCLTables.Operations._OrderedCollection__closure /* closure(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedSet(OrderedCollection(T)::T)) */,
		    OCLTables.Operations._OrderedCollection__collectNested /* collectNested<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    OCLTables.Operations._OrderedCollection__collect /* collect<V>(OrderedCollection(T)::T|Lambda OrderedCollection(T)::T() : OrderedCollection(T)::V) */,
		    OCLTables.Operations._OrderedCollection__first /* first() */,
		    OCLTables.Operations._OrderedCollection__indexOf /* indexOf(OclAny) */,
		    OCLTables.Operations._OrderedCollection__last /* last() */,
		    OCLTables.Operations._Sequence__reverse /* reverse() */
		};
	
		private static final ExecutorOperation[] _Set__Set = {
		    OCLTables.Operations._Set___sub_ /* _'-'(Set(OclAny)) */,
		    OCLTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Set__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Set__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Set__including /* including(Set(T)::T) */,
		    OCLTables.Operations._Set__intersection /* intersection(Set(Set(T)::T)) */,
		    OCLTables.Operations._Set__reject /* reject(Set(T)::T|Lambda Set(T)::T() : Boolean) */,
		    OCLTables.Operations._Set__select /* select(Set(T)::T|Lambda Set(T)::T() : Boolean) */,
		    OCLTables.Operations._Set__symmetricDifference /* symmetricDifference(Set(OclAny)) */
		};
		private static final ExecutorOperation[] _Set__Collection = {
		    OCLTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Set__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Set__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _Set__NonOrderedCollection = {
		    OCLTables.Operations._NonOrderedCollection__closure /* closure(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : Set(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__collectNested /* collectNested<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    OCLTables.Operations._NonOrderedCollection__collect /* collect<V>(NonOrderedCollection(T)::T|Lambda NonOrderedCollection(T)::T() : NonOrderedCollection(T)::V) */,
		    OCLTables.Operations._NonOrderedCollection__0_intersection /* intersection(Bag(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__1_intersection /* intersection(Set(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__0_union /* union(Bag(NonOrderedCollection(T)::T)) */,
		    OCLTables.Operations._NonOrderedCollection__1_union /* union(Set(NonOrderedCollection(T)::T)) */
		};
		private static final ExecutorOperation[] _Set__OclAny = {
		    OCLTables.Operations._Set___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Set___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _Set__UniqueCollection = {
		    OCLTables.Operations._UniqueCollection__sortedBy /* sortedBy(UniqueCollection(T)::T|Lambda UniqueCollection(T)::T() : OclAny) */
		};
	
		private static final ExecutorOperation[] _String__String = {
		    OCLTables.Operations._String___add_ /* _'+'(String) */,
		    OCLTables.Operations._String___lt_ /* _'<'(OclSelf) */,
		    OCLTables.Operations._String___lt__eq_ /* _'<='(OclSelf) */,
		    OCLTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._String___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._String___gt_ /* _'>'(OclSelf) */,
		    OCLTables.Operations._String___gt__eq_ /* _'>='(OclSelf) */,
		    OCLTables.Operations._String__at /* at(Integer) */,
		    OCLTables.Operations._String__characters /* characters() */,
		    OCLTables.Operations._String__concat /* concat(String) */,
		    OCLTables.Operations._String__equalsIgnoreCase /* equalsIgnoreCase(String) */,
		    OCLTables.Operations._String__indexOf /* indexOf(String) */,
		    OCLTables.Operations._String__size /* size() */,
		    OCLTables.Operations._String__substring /* substring(Integer,Integer) */,
		    OCLTables.Operations._String__toBoolean /* toBoolean() */,
		    OCLTables.Operations._String__toInteger /* toInteger() */,
		    OCLTables.Operations._String__toLower /* toLower() */,
		    OCLTables.Operations._String__toLowerCase /* toLowerCase() */,
		    OCLTables.Operations._String__toReal /* toReal() */,
		    OCLTables.Operations._String__toString /* toString() */,
		    OCLTables.Operations._String__toUpper /* toUpper() */,
		    OCLTables.Operations._String__toUpperCase /* toUpperCase() */
		};
		private static final ExecutorOperation[] _String__OclAny = {
		    OCLTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._String___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _Tuple__Tuple = {};
		private static final ExecutorOperation[] _Tuple__OclAny = {
		    OCLTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _UniqueCollection__UniqueCollection = {
		    OCLTables.Operations._UniqueCollection__sortedBy /* sortedBy(UniqueCollection(T)::T|Lambda UniqueCollection(T)::T() : OclAny) */
		};
		private static final ExecutorOperation[] _UniqueCollection__Collection = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Collection__any /* any(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__asBag /* asBag() */,
		    OCLTables.Operations._Collection__asOrderedSet /* asOrderedSet() */,
		    OCLTables.Operations._Collection__asSequence /* asSequence() */,
		    OCLTables.Operations._Collection__asSet /* asSet() */,
		    OCLTables.Operations._Collection__collectNested /* collectNested<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__collect /* collect<V>(Collection(T)::T|Lambda Collection(T)::T() : Collection(T)::V) */,
		    OCLTables.Operations._Collection__count /* count(OclAny) */,
		    OCLTables.Operations._Collection__excludes /* excludes(OclAny) */,
		    OCLTables.Operations._Collection__excludesAll /* excludesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__excluding /* excluding(OclAny) */,
		    OCLTables.Operations._Collection__1_exists /* exists(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_exists /* exists(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__flatten /* flatten<T2>() */,
		    OCLTables.Operations._Collection__1_forAll /* forAll(Collection(T)::T,Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__0_forAll /* forAll(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__includes /* includes(OclAny) */,
		    OCLTables.Operations._Collection__includesAll /* includesAll<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__including /* including(Collection(T)::T) */,
		    OCLTables.Operations._Collection__isEmpty /* isEmpty() */,
		    OCLTables.Operations._Collection__isUnique /* isUnique(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__iterate /* iterate<Tacc>(Collection(T)::T;Collection(T)::Tacc) */,
		    OCLTables.Operations._Collection__max /* max() */,
		    OCLTables.Operations._Collection__min /* min() */,
		    OCLTables.Operations._Collection__notEmpty /* notEmpty() */,
		    OCLTables.Operations._Collection__one /* one(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__product /* product<T2>(Collection(Collection(T)::T2)) */,
		    OCLTables.Operations._Collection__reject /* reject(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__select /* select(Collection(T)::T|Lambda Collection(T)::T() : Boolean) */,
		    OCLTables.Operations._Collection__size /* size() */,
		    OCLTables.Operations._Collection__sortedBy /* sortedBy(Collection(T)::T|Lambda Collection(T)::T() : OclAny) */,
		    OCLTables.Operations._Collection__sum /* sum() */
		};
		private static final ExecutorOperation[] _UniqueCollection__OclAny = {
		    OCLTables.Operations._Collection___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Collection___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
	
		private static final ExecutorOperation[] _UnlimitedNatural__UnlimitedNatural = {};
		private static final ExecutorOperation[] _UnlimitedNatural__Integer = {
		    OCLTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    OCLTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    OCLTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    OCLTables.Operations._Integer__0__sub_ /* _'-'() */,
		    OCLTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    OCLTables.Operations._Integer__abs /* abs() */,
		    OCLTables.Operations._Integer__div /* div(Integer) */,
		    OCLTables.Operations._Integer__max /* max(OclSelf) */,
		    OCLTables.Operations._Integer__min /* min(OclSelf) */,
		    OCLTables.Operations._Integer__mod /* mod(Integer) */,
		    OCLTables.Operations._Integer__toString /* toString() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__OclAny = {
		    OCLTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
		    OCLTables.Operations._OclAny__oclAsType /* oclAsType<TT>(Classifier<OclAny::TT>) */,
		    OCLTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
		    OCLTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
		    OCLTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
		    OCLTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf<T>(Classifier<OclAny::T>) */,
		    OCLTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
		    OCLTables.Operations._OclAny__oclType /* oclType() */
		};
		private static final ExecutorOperation[] _UnlimitedNatural__Real = {
		    OCLTables.Operations._Integer___mul_ /* _'*'(OclSelf) */,
		    OCLTables.Operations._Integer___add_ /* _'+'(OclSelf) */,
		    OCLTables.Operations._Integer__1__sub_ /* _'-'(OclSelf) */,
		    OCLTables.Operations._Integer__0__sub_ /* _'-'() */,
		    OCLTables.Operations._Integer___div_ /* _'/'(OclSelf) */,
		    OCLTables.Operations._Real___lt_ /* _'<'(OclSelf) */,
		    OCLTables.Operations._Real___lt__eq_ /* _'<='(OclSelf) */,
		    OCLTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf) */,
		    OCLTables.Operations._Real___eq_ /* _'='(OclSelf) */,
		    OCLTables.Operations._Real___gt_ /* _'>'(OclSelf) */,
		    OCLTables.Operations._Real___gt__eq_ /* _'>='(OclSelf) */,
		    OCLTables.Operations._Integer__abs /* abs() */,
		    OCLTables.Operations._Real__floor /* floor() */,
		    OCLTables.Operations._Integer__max /* max(OclSelf) */,
		    OCLTables.Operations._Integer__min /* min(OclSelf) */,
		    OCLTables.Operations._Real__oclAsType /* oclAsType<TT>(Classifier<Real::TT>) */,
		    OCLTables.Operations._Real__round /* round() */,
		    OCLTables.Operations._Integer__toString /* toString() */
		};
	
		private static final ExecutorOperation[] __Dummy___Dummy = {};
	
		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bag__Bag.initOperations(_Bag__Bag);
			Fragments._Bag__Collection.initOperations(_Bag__Collection);
			Fragments._Bag__NonOrderedCollection.initOperations(_Bag__NonOrderedCollection);
			Fragments._Bag__NonUniqueCollection.initOperations(_Bag__NonUniqueCollection);
			Fragments._Bag__OclAny.initOperations(_Bag__OclAny);
	
			Fragments._Boolean__Boolean.initOperations(_Boolean__Boolean);
			Fragments._Boolean__OclAny.initOperations(_Boolean__OclAny);
	
			Fragments._Classifier__Classifier.initOperations(_Classifier__Classifier);
			Fragments._Classifier__OclAny.initOperations(_Classifier__OclAny);
	
			Fragments._Collection__Collection.initOperations(_Collection__Collection);
			Fragments._Collection__OclAny.initOperations(_Collection__OclAny);
	
			Fragments._Enumeration__Enumeration.initOperations(_Enumeration__Enumeration);
			Fragments._Enumeration__OclAny.initOperations(_Enumeration__OclAny);
	
			Fragments._Integer__Integer.initOperations(_Integer__Integer);
			Fragments._Integer__OclAny.initOperations(_Integer__OclAny);
			Fragments._Integer__Real.initOperations(_Integer__Real);
	
			Fragments._NonOrderedCollection__Collection.initOperations(_NonOrderedCollection__Collection);
			Fragments._NonOrderedCollection__NonOrderedCollection.initOperations(_NonOrderedCollection__NonOrderedCollection);
			Fragments._NonOrderedCollection__OclAny.initOperations(_NonOrderedCollection__OclAny);
	
			Fragments._NonUniqueCollection__Collection.initOperations(_NonUniqueCollection__Collection);
			Fragments._NonUniqueCollection__NonUniqueCollection.initOperations(_NonUniqueCollection__NonUniqueCollection);
			Fragments._NonUniqueCollection__OclAny.initOperations(_NonUniqueCollection__OclAny);
	
			Fragments._OclAny__OclAny.initOperations(_OclAny__OclAny);
	
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
	
			Fragments._OrderedCollection__Collection.initOperations(_OrderedCollection__Collection);
			Fragments._OrderedCollection__OclAny.initOperations(_OrderedCollection__OclAny);
			Fragments._OrderedCollection__OrderedCollection.initOperations(_OrderedCollection__OrderedCollection);
	
			Fragments._OrderedSet__Collection.initOperations(_OrderedSet__Collection);
			Fragments._OrderedSet__OclAny.initOperations(_OrderedSet__OclAny);
			Fragments._OrderedSet__OrderedCollection.initOperations(_OrderedSet__OrderedCollection);
			Fragments._OrderedSet__OrderedSet.initOperations(_OrderedSet__OrderedSet);
			Fragments._OrderedSet__UniqueCollection.initOperations(_OrderedSet__UniqueCollection);
	
			Fragments._Real__OclAny.initOperations(_Real__OclAny);
			Fragments._Real__Real.initOperations(_Real__Real);
	
			Fragments._Sequence__Collection.initOperations(_Sequence__Collection);
			Fragments._Sequence__NonUniqueCollection.initOperations(_Sequence__NonUniqueCollection);
			Fragments._Sequence__OclAny.initOperations(_Sequence__OclAny);
			Fragments._Sequence__OrderedCollection.initOperations(_Sequence__OrderedCollection);
			Fragments._Sequence__Sequence.initOperations(_Sequence__Sequence);
	
			Fragments._Set__Collection.initOperations(_Set__Collection);
			Fragments._Set__NonOrderedCollection.initOperations(_Set__NonOrderedCollection);
			Fragments._Set__OclAny.initOperations(_Set__OclAny);
			Fragments._Set__Set.initOperations(_Set__Set);
			Fragments._Set__UniqueCollection.initOperations(_Set__UniqueCollection);
	
			Fragments._String__OclAny.initOperations(_String__OclAny);
			Fragments._String__String.initOperations(_String__String);
	
			Fragments._Tuple__OclAny.initOperations(_Tuple__OclAny);
			Fragments._Tuple__Tuple.initOperations(_Tuple__Tuple);
	
			Fragments._UniqueCollection__Collection.initOperations(_UniqueCollection__Collection);
			Fragments._UniqueCollection__OclAny.initOperations(_UniqueCollection__OclAny);
			Fragments._UniqueCollection__UniqueCollection.initOperations(_UniqueCollection__UniqueCollection);
	
			Fragments._UnlimitedNatural__Integer.initOperations(_UnlimitedNatural__Integer);
			Fragments._UnlimitedNatural__OclAny.initOperations(_UnlimitedNatural__OclAny);
			Fragments._UnlimitedNatural__Real.initOperations(_UnlimitedNatural__Real);
			Fragments._UnlimitedNatural__UnlimitedNatural.initOperations(_UnlimitedNatural__UnlimitedNatural);
	
			Fragments.__Dummy___Dummy.initOperations(__Dummy___Dummy);
		}
	
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each class.
	 */
	public static class FragmentProperties {
		private static final ExecutorProperty[] _Bag = {};
	
		private static final ExecutorProperty[] _Boolean = {};
	
		private static final ExecutorProperty[] _Classifier = {};
	
		private static final ExecutorProperty[] _Collection = {};
	
		private static final ExecutorProperty[] _Enumeration = {};
	
		private static final ExecutorProperty[] _Integer = {};
	
		private static final ExecutorProperty[] _NonOrderedCollection = {};
	
		private static final ExecutorProperty[] _NonUniqueCollection = {};
	
		private static final ExecutorProperty[] _OclAny = {};
	
		private static final ExecutorProperty[] _OclInvalid = {};
	
		private static final ExecutorProperty[] _OclMessage = {};
	
		private static final ExecutorProperty[] _OclSelf = {};
	
		private static final ExecutorProperty[] _OclState = {};
	
		private static final ExecutorProperty[] _OclTuple = {};
	
		private static final ExecutorProperty[] _OclVoid = {};
	
		private static final ExecutorProperty[] _OrderedCollection = {};
	
		private static final ExecutorProperty[] _OrderedSet = {};
	
		private static final ExecutorProperty[] _Real = {};
	
		private static final ExecutorProperty[] _Sequence = {};
	
		private static final ExecutorProperty[] _Set = {};
	
		private static final ExecutorProperty[] _String = {};
	
		private static final ExecutorProperty[] _Tuple = {};
	
		private static final ExecutorProperty[] _UniqueCollection = {};
	
		private static final ExecutorProperty[] _UnlimitedNatural = {};
	
		private static final ExecutorProperty[] __Dummy = {};
	
		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
	  	 	Fragments._Bag__Bag.initProperties(_Bag);
	  	 	Fragments._Boolean__Boolean.initProperties(_Boolean);
	  	 	Fragments._Classifier__Classifier.initProperties(_Classifier);
	  	 	Fragments._Collection__Collection.initProperties(_Collection);
	  	 	Fragments._Enumeration__Enumeration.initProperties(_Enumeration);
	  	 	Fragments._Integer__Integer.initProperties(_Integer);
	  	 	Fragments._NonOrderedCollection__NonOrderedCollection.initProperties(_NonOrderedCollection);
	  	 	Fragments._NonUniqueCollection__NonUniqueCollection.initProperties(_NonUniqueCollection);
	  	 	Fragments._OclAny__OclAny.initProperties(_OclAny);
	  	 	Fragments._OclInvalid__OclInvalid.initProperties(_OclInvalid);
	  	 	Fragments._OclMessage__OclMessage.initProperties(_OclMessage);
	  	 	Fragments._OclSelf__OclSelf.initProperties(_OclSelf);
	  	 	Fragments._OclState__OclState.initProperties(_OclState);
	  	 	Fragments._OclTuple__OclTuple.initProperties(_OclTuple);
	  	 	Fragments._OclVoid__OclVoid.initProperties(_OclVoid);
	  	 	Fragments._OrderedCollection__OrderedCollection.initProperties(_OrderedCollection);
	  	 	Fragments._OrderedSet__OrderedSet.initProperties(_OrderedSet);
	  	 	Fragments._Real__Real.initProperties(_Real);
	  	 	Fragments._Sequence__Sequence.initProperties(_Sequence);
	  	 	Fragments._Set__Set.initProperties(_Set);
	  	 	Fragments._String__String.initProperties(_String);
	  	 	Fragments._Tuple__Tuple.initProperties(_Tuple);
	  	 	Fragments._UniqueCollection__UniqueCollection.initProperties(_UniqueCollection);
	  	 	Fragments._UnlimitedNatural__UnlimitedNatural.initProperties(_UnlimitedNatural);
	  	 	Fragments.__Dummy___Dummy.initProperties(__Dummy);
		}
	
		public static void init() {}
	}
}
