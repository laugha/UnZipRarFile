/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gstarcad.unrar.library.org.apache.tika.sax.xpath;

/**
 * Final evaluation state of an XPath expression that targets an element.
 * Matches the current element.
 */
public class ElementMatcher extends Matcher {

    public static final Matcher INSTANCE = new ElementMatcher();

    public boolean matchesElement() {
        return true;
    }

}
