/**
 * Copyright (c) 2009 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.ocl.ecore.tests;

import org.eclipse.ocl.options.EvaluationOptions;

//FIXME we're missing oclIsNew and oclIsInState
/**
 * This unit test focuses on the Standard library's OclAny operations.
 * 
 * @author Laurent Goubet (lgoubet)
 */
@SuppressWarnings("nls")
public class EvaluationOclAnyOperationTest
		extends AbstractEvaluationTest {

	public EvaluationOclAnyOperationTest(String name) {
		super(name);
	}

	public void testEqualInvalid() {
		/*
		 * FIXME we're expecting here results as specified in 2.0 : (11.2.4) any
		 * call on invalid results in invalid. Note that 2.1 didn't alter
		 * this statement but added in 11.2.5 an override of '=' so that it
		 * returns "true if object is invalid". Which should we respect in the
		 * implementation? respecting 11.2.4 is better as far as error handling
		 * is concerned ... but then we should probably respect 11.2.3 and have
		 * '=' fail on 'null'.
		 */
		assertResultInvalid("invalid = 3");
		assertResultInvalid("3 = invalid");
		assertResultInvalid("invalid = 3.0");
		assertResultInvalid("3.0 = invalid");

		assertResultInvalid("invalid = 'test'");
		assertResultInvalid("'test' = invalid");
		assertResultInvalid("invalid = true");
		assertResultInvalid("false = invalid");
		assertResultInvalid("invalid = Sequence{}");
		assertResultInvalid("Sequence{} = invalid");

		assertResultInvalid("invalid = invalid");
	}

	public void testEqualNull() {
		assertResultFalse("null = 3");
		assertResultFalse("3 = null");
		assertResultFalse("null = 3.0");
		assertResultFalse("3.0 = null");

		assertResultFalse("null = 'test'");
		assertResultFalse("'test' = null");
		assertResultFalse("null = true");
		assertResultFalse("false = null");
		assertResultFalse("null = Sequence{}");
		assertResultFalse("Sequence{} = null");

		assertResultTrue("null = null");
	}

	public void testGreaterThanInvalid() {
		assertResultInvalid("invalid > 0");
		assertResultInvalid("0 > invalid");
		assertResultInvalid("invalid > invalid");
	}

	public void testGreaterThanNull() {
		assertResultInvalid("null > 0");
		assertResultInvalid("0 > null");
		assertResultInvalid("null > null");
	}

	public void testGreaterThanOrEqualInvalid() {
		assertResultInvalid("invalid >= 0");
		assertResultInvalid("0 >= invalid");
		assertResultInvalid("invalid >= invalid");
	}

	public void testGreaterThanOrEqualNull() {
		assertResultInvalid("null >= 0");
		assertResultInvalid("0 >= null");
		assertResultInvalid("null >= null");
	}

	public void testLessThanInvalid() {
		assertResultInvalid("invalid < 0");
		assertResultInvalid("0 < invalid");
		assertResultInvalid("invalid < invalid");
	}

	public void testLessThanNull() {
		// FIXME '=' is defined for null ... why not <? at least <= should be.
		assertResultInvalid("null < 0");
		assertResultInvalid("0 < null");
		assertResultInvalid("null < null");
	}

	public void testLessThanOrEqualInvalid() {
		assertResultInvalid("invalid <= 0");
		assertResultInvalid("0 <= invalid");
		assertResultInvalid("invalid <= invalid");
	}

	public void testLessThanOrEqualNull() {
		assertResultInvalid("null <= 0");
		assertResultInvalid("0 <= null");
		assertResultInvalid("null <= null");
	}

	public void testNotEqualInvalid() {
		/*
		 * FIXME we're expecting here results as specified in 2.0 : (11.2.4) any
		 * call on invalid results in invalid. Note that 2.1 didn't alter
		 * this statement but added in 11.2.5 an override of '=' so that it
		 * returns "true if object is invalid". Which should we respect in the
		 * implementation? respecting 11.2.4 is better as far as error handling
		 * is concerned ... but then we should probably respect 11.2.3 and have
		 * '=' fail on 'null'.
		 */
		assertResultInvalid("invalid <> 3");
		assertResultInvalid("3 <> invalid");
		assertResultInvalid("invalid <> 3.0");
		assertResultInvalid("3.0 <> invalid");

		assertResultInvalid("invalid <> 'test'");
		assertResultInvalid("'test' <> invalid");
		assertResultInvalid("invalid <> true");
		assertResultInvalid("false <> invalid");
		assertResultInvalid("invalid <> Sequence{}");
		assertResultInvalid("Sequence{} <> invalid");

		assertResultInvalid("invalid <> invalid");
	}

	public void testNotEqualNull() {
		assertResultTrue("null <> 3");
		assertResultTrue("3 <> null");
		assertResultTrue("null <> 3.0");
		assertResultTrue("3.0 <> null");

		assertResultTrue("null <> 'test'");
		assertResultTrue("'test' <> null");
		assertResultTrue("null <> true");
		assertResultTrue("false <> null");
		assertResultTrue("null <> Sequence{}");
		assertResultTrue("Sequence{} <> null");

		assertResultFalse("null <> null");
	}

	public void testOclAsTypeInvalidLaxNullHandlingInvalid() {
		assertResultInvalid("invalid.oclAsType(String)");
		assertResultInvalid("invalid.oclAsType(EClass)");
		assertResultInvalid("invalid.oclAsType(OclVoid)");
		assertResultInvalid("invalid.oclAsType(OclInvalid)");
	}

	public void testOclAsTypeLaxNullHandlingNull() {
		/*
		 * FIXME EvaluationOptions.LAX_NULL_HANDLING is on, its javadoc tells us
		 * "null" is the expected result whatever the given type. We should
		 * either fix the evaluation or the javadoc.
		 */
		assertResult(null, "null.oclAsType(String)");
		assertResult(null, "null.oclAsType(Integer)");
		assertResult(null, "null.oclAsType(EClass)");
		assertResult(null, "null.oclAsType(OclVoid)");
		assertResult(null, "null.oclAsType(OclInvalid)");
	}

	public void testOclAsTypeNoLaxNullHandlingInvalid() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertResultInvalid("invalid.oclAsType(String)");
		assertResultInvalid("invalid.oclAsType(Integer)");
		assertResultInvalid("invalid.oclAsType(EClass)");
		assertResultInvalid("invalid.oclAsType(OclVoid)");
		assertResultInvalid("invalid.oclAsType(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	}

	public void testOclAsTypeNoLaxNullHandlingNull() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertResultInvalid("null.oclAsType(String)");
		assertResultInvalid("null.oclAsType(Integer)");
		assertResultInvalid("null.oclAsType(EClass)");
		assertResultInvalid("null.oclAsType(OclVoid)");
		assertResultInvalid("null.oclAsType(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	}

	public void testOclIsInvalidInvalid() {
		assertResultTrue("invalid.oclIsInvalid()");
	}

	public void testOclIsInvalidNull() {
		assertResultFalse("null.oclIsInvalid()");
	}

	public void testOclIsKindOfInvalidLaxNullHandling() {
		/*
		 * FIXME why is the evaluation of oclIsKindOf altered for invalid
		 * with LAX_NULL_HANDLING off? That is no documented behavior.
		 */
		assertResultInvalid("invalid.oclIsKindOf(String)");
		assertResultInvalid("invalid.oclIsKindOf(EClass)");
		assertResultInvalid("invalid.oclIsKindOf(OclVoid)");
		assertResultInvalid("invalid.oclIsKindOf(OclInvalid)");
	}

	public void testOclIsKindOfInvalidNoLaxHandling() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertResultInvalid("invalid.oclIsKindOf(String)");
		assertResultInvalid("invalid.oclIsKindOf(Integer)");
		assertResultInvalid("invalid.oclIsKindOf(EClass)");
		assertResultInvalid("invalid.oclIsKindOf(OclVoid)");
		assertResultInvalid("invalid.oclIsKindOf(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	}

	public void testOclIsKindOfNullLaxNullHandling() {
		/*
		 * FIXME EvaluationOptions.LAX_NULL_HANDLING is on, its javadoc tells us
		 * "true" is the expected result whatever the given type. We should
		 * either fix the evaluation or the javadoc.
		 */
		assertResultTrue("null.oclIsKindOf(String)");
		assertResultTrue("null.oclIsKindOf(Integer)");
		assertResultTrue("null.oclIsKindOf(EClass)");
		assertResultTrue("null.oclIsKindOf(OclVoid)");
		assertResultTrue("null.oclIsKindOf(OclInvalid)");
	}

	public void testOclIsKindOfNullNoLaxHandling() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertResultInvalid("null.oclIsKindOf(String)");
		assertResultInvalid("null.oclIsKindOf(Integer)");
		assertResultInvalid("null.oclIsKindOf(EClass)");
		assertResultInvalid("null.oclIsKindOf(OclVoid)");
		assertResultInvalid("null.oclIsKindOf(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	}

	public void testOclIsTypeOfInvalidLaxNullHandling() {
		/*
		 * FIXME why is the evaluation of oclIsTypeOf altered for invalid
		 * with LAX_NULL_HANDLING off? That is no documented behavior.
		 */
		assertResultInvalid("invalid.oclIsTypeOf(String)");
		assertResultInvalid("invalid.oclIsTypeOf(EClass)");
		assertResultInvalid("invalid.oclIsTypeOf(OclVoid)");
		assertResultInvalid("invalid.oclIsTypeOf(OclInvalid)");
	}

	public void testOclIsTypeOfInvalidNoLaxNullHandling() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertResultInvalid("invalid.oclIsTypeOf(String)");
		assertResultInvalid("invalid.oclIsTypeOf(Integer)");
		assertResultInvalid("invalid.oclIsTypeOf(EClass)");
		assertResultInvalid("invalid.oclIsTypeOf(OclVoid)");
		assertResultInvalid("invalid.oclIsTypeOf(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	}

	public void testOclIsTypeOfNullLaxNullHandling() {
		/*
		 * FIXME EvaluationOptions.LAX_NULL_HANDLING is on, its javadoc tells us
		 * "true" is the expected result whatever the given type. We should
		 * either fix the evaluation or the javadoc.
		 */
		assertResultTrue("null.oclIsTypeOf(String)");
		assertResultTrue("null.oclIsTypeOf(Integer)");
		assertResultTrue("null.oclIsTypeOf(EClass)");
		assertResultTrue("null.oclIsTypeOf(OclVoid)");
		assertResultTrue("null.oclIsTypeOf(OclInvalid)");
	}

	public void testOclIsTypeOfNullNoLaxNullHandling() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertResultInvalid("null.oclIsTypeOf(String)");
		assertResultInvalid("null.oclIsTypeOf(Integer)");
		assertResultInvalid("null.oclIsTypeOf(EClass)");
		assertResultInvalid("null.oclIsTypeOf(OclVoid)");
		assertResultInvalid("null.oclIsTypeOf(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	}

	public void testOclIsUndefinedInvalid() {
		assertResultTrue("invalid.oclIsUndefined()");
	}

	public void testOclIsUndefinedNull() {
		assertResultTrue("null.oclIsUndefined()");
	}
}