/**
 * Copyright 2013 Netflix, Inc.
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
package com.netflix.dynomitemanager.sidecore;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.google.inject.ImplementedBy;
import com.netflix.dynomitemanager.sidecore.aws.ClearCredential;

/**
 * Credential file interface for services supporting 
 * Access ID and key authentication
 */
@ImplementedBy(ClearCredential.class)
public interface ICredential
{
    
    public AWSCredentialsProvider getAwsCredentialProvider();
}
