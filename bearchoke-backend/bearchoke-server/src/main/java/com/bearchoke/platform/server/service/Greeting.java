/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bearchoke.platform.server.service;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by Bjorn Harvold
 * Date: 8/12/14
 * Time: 4:02 PM
 * Responsibility:
 */
@Data
public class Greeting {
    private Long id = 0l;
    private String content = "";
    private Float version = 0.0f;
    private String input = "";
    public Greeting() {}

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("content", content)
                .append("version", version)
                .append("input", input)
                .toString();
    }
}
