/*
 * Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesis.clientlibrary.lib.checkpoint;

/**
 * Enumeration of the sentinel values of checkpoints.
 * Used during initialization of ShardConsumers to determine the starting point
 * in the shard and to flag that a shard has been completely processed.
 */
public enum SentinelCheckpoint {
    /**
     * Start from the first available record in the shard.
     */
    TRIM_HORIZON,
    /**
     * Start from the latest record in the shard.
     */
    LATEST,
    /**
     * We've completely processed all records in this shard.
     */
    SHARD_END,
    /**
     * Start from the record at or after the specified server-side timestamp.
     */
    AT_TIMESTAMP
}
