/*
 * Copyright 2019 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.eventstreams.connect.cossink.completion;

/**
 * AsyncCompleter allows for the completion of an object to be triggered
 * from outside of the {@code ObjectCompletionCriteria#test(org.apache.kafka.connect.sink.SinkRecord, AsyncCompleter, long)}
 * method.
 */
public interface AsyncCompleter {

    /**
     * Invoked to indicate that the object is now complete.
     */
    void asyncComplete();

}
