/*
 * Copyright 2014-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.keyvalue.core;

import org.springframework.data.util.TypeInformation;

/**
 * API for components generating identifiers.
 *
 * @author Christoph Strobl
 * @author Oliver Gierke
 */
public interface IdentifierGenerator {

	/**
	 * Creates an identifier of the given type.
	 *
	 * @param type must not be {@literal null}.
	 * @return an identifier of the given type.
	 */
	<T> T generateIdentifierOfType(TypeInformation<T> type);
}
