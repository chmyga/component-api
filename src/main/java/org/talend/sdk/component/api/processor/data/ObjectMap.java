/**
 * Copyright (C) 2006-2018 Talend Inc. - www.talend.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.api.processor.data;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.Set;

public interface ObjectMap extends Serializable {

    Object get(String location);

    ObjectMap getMap(String location);

    Collection<ObjectMap> getCollection(String location);

    Set<String> keys();

    // todo: think about map?

    /**
     * Mark a {@link java.util.Map}&lt;String, Object&gt; field as containing virtual fields
     * accessible using objectMap.get(x) directly.
     */
    @Target(FIELD)
    @Retention(RUNTIME)
    @interface Any {
    }
}
