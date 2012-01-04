/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.ajax.attributes;

/**
 * The JavaScript that will be executed before the Ajax call and will decide whether the Ajax
 * should be aborted.
 * The script will be executed in a function that receives the following parameters:
 * <ol>
 *     <li>attrs - the AjaxRequestAttributes as JSON</li>
 *     <li>jqXHR - the jQuery XMLHttpRequest object</li>
 *     <li>settings - the settings used for the jQuery.ajax() call</li>
 * </ol>
 */
public class JavaScriptPrecondition extends JavaScriptFunctionBody
{
	/**
	 * Constructor.
	 *
	 * @param functionBody
	 */
	public JavaScriptPrecondition(final CharSequence functionBody)
	{
		super(functionBody);
	}
}
