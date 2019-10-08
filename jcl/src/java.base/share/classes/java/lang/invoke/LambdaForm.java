/*[INCLUDE-IF Sidecar18-SE-OpenJ9]*/

/*******************************************************************************
 * Copyright (c) 2017, 2017 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] http://openjdk.java.net/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/

package java.lang.invoke;

import java.lang.reflect.Method;

/*
 * Stub class to compile OpenJDK j.l.i.MethodHandleImpl
 */

class LambdaForm {

	LambdaForm(String str, int num1, Name[] names, int num2) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(String str, int num, Name[] names) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(String str, int num, Name[] names, boolean flag) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	/*[IF Java10]*/
	LambdaForm(int a, Name[] b, int c) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(int a, Name[] b, int c, Kind d) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(int a, Name[] b, int c, boolean d, MethodHandle e) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(int a, Name[] b, int c, boolean d, MethodHandle e, Kind f) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(int a, Name[] b) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(int a, Name[] b, Kind c) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(int a, Name[] b, boolean c) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(int a, Name[] b, boolean c, Kind d) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(Name[] a, Name[] b, Name c) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	LambdaForm(Name[] a, Name[] b, Name c, boolean d) {
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	/*[ENDIF]*/
	
	static class NamedFunction {
		NamedFunction(MethodHandle mh) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		NamedFunction(MethodType mt) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		NamedFunction(MemberName mn, MethodHandle mh) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		NamedFunction(Method m) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		/*[IF Java10]*/
		NamedFunction(MethodHandle a, MethodHandleImpl.Intrinsic b){
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		NamedFunction(MemberName a, MethodHandle b, MethodHandleImpl.Intrinsic c){
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		/*[ENDIF]*/
		
		MethodHandle resolvedHandle() {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		/*[IF Sidecar18-SE-OpenJ9&!Sidecar19-SE-OpenJ9]*/
		MethodHandle resolve() {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		/*[ENDIF]*/
	}
	
	enum BasicType {
		L_TYPE;
		
		static BasicType basicType(Class<?> cls) {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
	}
	/*[IF Java10]*/
	enum Kind {
		GENERIC("invoke"),
		ZERO("zero"),
		IDENTITY("indentity"),
		BOUND_REINVOKER("BMH.reinvoke", "reinvoke"),
		REINVOKER("MH.reinvoke", "reinvoke"),
		DELEGATE("MH.delegate", "delegate"),
		EXACT_LINKER("MH.invokeExact_MT", "invokeExact_MT"),
		EXACT_INVOKER("MH.exactInvoker", "exactInvoker"),
		GENERIC_LINKER("MH.invoke_MT"),
		GENERIC_INVOKER("MH.invoker"),
		LINK_TO_TARGET_METHOD("linkToTargetMethod"),
		LINK_TO_CALL_SITE("linkToCallSite"),
		DIRECT_INVOKE_VIRTUAL("DMH.invokeVirtual"),
		DIRECT_INVOKE_SPECIAL("DMH.invokeSpecial"),
		DIRECT_INVOKE_SPECIAL_IFC("DMH.invokeSpecialIFC"),
		DIRECT_INVOKE_STATIC("DMH.invokeStatic"),
		DIRECT_NEW_INVOKE_SPECIAL("DMH.newInvokeSpecial"),
		DIRECT_INVOKE_INTERFACE("DMH.invokeInterface"),
		DIRECT_INVOKE_STATIC_INIT("DMH.invokeStaticInit"),
		GET_OBJECT("getObject"),
		PUT_OBJECT("putObject"),
		GET_OBJECT_VOLATILE("getObjectVolatile"),
		PUT_OBJECT_VOLATILE("putObjectVolatile"),
		GET_INT("getInt"),
		PUT_INT("putInt"),
		GET_INT_VOLATILE("getIntVolatile"),
		PUT_INT_VOLATILE("putIntVolatile"),
		GET_BOOLEAN("getBoolean"),
		PUT_BOOLEAN("putBoolean"),
		GET_BOOLEAN_VOLATILE("getBooleanVolatile"),
		PUT_BOOLEAN_VOLATILE("putBooleanVolatile"),
		GET_BYTE("getByte"),
		PUT_BYTE("putByte"),
		GET_BYTE_VOLATILE("getByteVolatile"),
		PUT_BYTE_VOLATILE("putByteVolatile"),
		GET_CHAR("getChar"),
		PUT_CHAR("putChar"),
		GET_CHAR_VOLATILE("getCharVolatile"),
		PUT_CHAR_VOLATILE("putCharVolatile"),
		GET_SHORT("getShort"),
		PUT_SHORT("putShort"),
		GET_SHORT_VOLATILE("getShortVolatile"),
		PUT_SHORT_VOLATILE("putShortVolatile"),
		GET_LONG("getLong"),
		PUT_LONG("putLong"),
		GET_LONG_VOLATILE("getLongVolatile"),
		PUT_LONG_VOLATILE("putLongVolatile"),
		GET_FLOAT("getFloat"),
		PUT_FLOAT("putFloat"),
		GET_FLOAT_VOLATILE("getFloatVolatile"),
		PUT_FLOAT_VOLATILE("putFloatVolatile"),
		GET_DOUBLE("getDouble"),
		PUT_DOUBLE("putDouble"),
		GET_DOUBLE_VOLATILE("getDoubleVolatile"),
		PUT_DOUBLE_VOLATILE("putDoubleVolatile"),
		TRY_FINALLY("tryFinally"),
		COLLECT("collect"),
		CONVERT("convert"),
		SPREAD("spread"),
		LOOP("loop"),
		FIELD("field"),
		GUARD("guard"),
		GUARD_WITH_CATCH("guardWithCatch"),
		VARHANDLE_EXACT_INVOKER("VH.exactInvoker"),
		VARHANDLE_INVOKER("VH.invoker", "invoker"),
		VARHANDLE_LINKER("VH.invoke_MT", "invoke_MT");

		final String methodName;
		final String defaultLambdaName;

		Kind(String defaultLambdaName) {
			this(defaultLambdaName, defaultLambdaName);
		}
		Kind(String defaultLambdaName, String methodName) {
			this.defaultLambdaName = defaultLambdaName;
			this.methodName = methodName;
		}
	}
	/*[ENDIF]*/
	
	@interface Hidden{
	}
	
	static final class Name {
		Name(MethodHandle mh, Object... objs) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		Name(MethodType mt, Object... objs) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		Name(NamedFunction nf,Object... objs) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		Name(int which, Object obj) {
			OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		
		Name withConstraint(Object obj) {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
	}
	
	static LambdaForm.Name[] arguments(int num, MethodType mt) {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	static NamedFunction constantZero(BasicType bt) {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	
	void compileToBytecode() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	
	LambdaFormEditor editor() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	@interface Compiled {
	}

	MemberName vmentry = null;

	static LambdaForm.Name argument(int which, Object obj) {
		return new LambdaForm.Name(which, obj);
	}

	static boolean debugNames() {
		return false;
	}

}
