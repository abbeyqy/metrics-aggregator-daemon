/*
 * Copyright 2014 Groupon.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arpnetworking.metrics.common.tailer;

import java.io.IOException;
import java.util.Optional;

/**
 * A {@link PositionStore} that always returns absent.
 *
 * @author Brandon Arp (brandon dot arp at inscopemetrics dot io)
 */
public class NoPositionStore implements PositionStore {
    @Override
    public Optional<Long> getPosition(final String identifier) {
        return Optional.empty();
    }

    @Override
    public void setPosition(final String identifier, final long position) {
        // No need to do anything
    }

    @Override
    public void close() throws IOException {
        // No need to do anything
    }
}
