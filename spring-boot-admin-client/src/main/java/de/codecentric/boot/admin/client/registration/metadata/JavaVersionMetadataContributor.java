/*
 * Copyright 2014-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.codecentric.boot.admin.client.registration.metadata;

import java.util.HashMap;
import java.util.Map;

public class JavaVersionMetadataContributor implements MetadataContributor {

    @Override
    public Map<String, String> getMetadata() {
        Map<String, String> metadata = new HashMap<>();
        metadata.put("java.version", System.getProperty("java.version"));
        metadata.put("java.vendor", System.getProperty("java.vendor"));
        return metadata;
    }

}
