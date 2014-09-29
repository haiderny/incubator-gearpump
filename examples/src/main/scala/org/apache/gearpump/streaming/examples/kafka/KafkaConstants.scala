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

package org.apache.gearpump.streaming.examples.kafka

object KafkaConstants {

  // consumer configs
  val ZOOKEEPER = "zookeeper"
  val KAFKA_ROOT = "kafka_root"
  val CONSUMER_TOPIC = "consumer_topic"
  val CLIENT_ID = "client_id"
  val SO_TIMEOUT = "socket.timeout.ms"
  val SO_BUFFERSIZE = "socket.receive.buffer.size"
  val FETCH_SIZE = "fetch.message.max.bytes"

  // producer configs
  val PRODUCER_TOPIC = "producer_topic"
  val BROKER_LIST = "metadata.broker.list"
  val PRODUCER_TYPE = "producer.type"
  val SERIALIZER_CLASS = "serializer.class"
  val REQUIRED_ACKS = "request.required.acks"


  // message configs
  val BATCH_SIZE = "batch_size"
}