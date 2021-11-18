/*[INCLUDE-IF JAVA_SPEC_VERSION >= 16]*/
/*******************************************************************************
 * Copyright (c) 2020, 2020 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be madpe available under the following
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
package java.lang;

import java.util.Set;

public class Continuation {
	//creation APIs
	/**
	 * @param scope
	 * @param target
	 */
	public Continuation(ContinuationScope scope, Runnable target) {
	}
	
	/**
	 * @param scope
	 * @param stackSize
	 * @param target
	 */
	public Continuation(ContinuationScope scope, int stackSize, Runnable target) {
	}
	
	/**
	 * @param scope
	 * @return
	 */
	public static Continuation getCurrentContinuation(ContinuationScope scope) {
		return null;
	}
	
	
	//Essential API
	/**
	 * 
	 */
	public final void run() { // mount VThread on carrier

	}

	/**
	 * @return
	 */
	public static boolean yield(ContinuationScope scope) { //unmount Vthread off carrier
		return false;
	}

	/**
	 * @return
	 */
	public boolean isDone() { // true if runnable has completed
		return true;
	}

	/**
	 * 
	 */
	public static void pin() { // not sure if these are used
	}

	/**
	 * 
	 */
	public static void unpin() { // not sure if these are used
	}

	public static boolean isPinned(ContinuationScope scope) { //is pinned
		return false;
	}

	//proposed fields - we could just have an enum called ContinuationState
	enum ContinuationState {
		notStarted,
		started,
		pinned,
		running,
		done
	}

	ContinuationState state;

	public enum PreemptStatus {
	}

	public enum Pinned {
	}

	//proposed natives
	private native void createVirtualThreadJ9VMthread();
	private native boolean isPinned(); //also might just be a field
	private native boolean mountVitrualThread();
	private native boolean unMountVirtualThread();
	
	
	//preemption
	/**
	 * @return
	 */
	public boolean isPreempted() { // is yielded
		return false;
	}

	/**
	 * @param thread
	 * @return
	 */
	public PreemptStatus tryPreempt(Thread thread) { //attempts yield
		return null;
	}
	
	//Stackwalker APIs
	/**
	 * @return
	 */
	public StackWalker stackWalker() {
		return null;
	}

	/**
	 * @param option
	 * @return
	 */
	public StackWalker stackWalker(StackWalker.Option option) {
		return null;
	}

	/**
	 * @param optionSet
	 * @return
	 */
	public StackWalker stackWalker(Set<StackWalker.Option> optionSet) {
		return null;
	}

	/**
	 * @param optionSet
	 * @param scope
	 * @return
	 */
	public StackWalker stackWalker(java.util.Set<java.lang.StackWalker.Option> optionSet, ContinuationScope scope) {
		return null;
	}

	/**
	 * @return
	 */
	public StackTraceElement[] getStackTrace() {
		return null;
	}

	/**
	 * @param reason
	 */
	protected void onPinned(Pinned reason) {
		throw new IllegalStateException("Pinned: " + reason); //$NON-NLS-1$
	}

}
