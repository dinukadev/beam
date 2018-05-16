/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.apache.beam.sdk.extensions.euphoria.core.client.io;

import java.util.Collections;
import java.util.List;
import org.apache.beam.sdk.extensions.euphoria.core.annotation.audience.Audience;

/** A {@code BoundedPartition} that cannot be split into smaller pieces. */
@Audience(Audience.Type.EXECUTOR)
public abstract class UnsplittableBoundedSource<T> implements BoundedDataSource<T> {

  @Override
  public List<BoundedDataSource<T>> split(long desiredSplitBytes) {
    return Collections.singletonList(this);
  }
}