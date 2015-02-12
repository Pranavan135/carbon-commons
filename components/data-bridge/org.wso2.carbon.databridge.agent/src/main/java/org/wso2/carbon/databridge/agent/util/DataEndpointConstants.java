/*
*  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.databridge.agent.util;

import org.wso2.carbon.utils.CarbonUtils;

import java.io.File;

public class DataEndpointConstants {
    private DataEndpointConstants() {
    }

    public static final String DATA_AGENT_CONF_FILE_NAME = "ha-data-agent-conf.xml";
    public static final String DATA_AGENT_CONF_FILE_PATH = CarbonUtils.getCarbonConfigDirPath() + File.separator
            + "data-bridge" + File.separator + DATA_AGENT_CONF_FILE_NAME;
    public static final String DATA_AGENT_ENDPOINT_NAME = "Name";
    public static final String DATA_AGENT_ENDPOINT_CLASS = "DataEndpointClass";
    public static final String DATA_AGENT_TRUST_STORE_LOCATION = "TrustSore";
    public static final String DATA_AGENT_TRUST_STORE_PASSWORD = "TrustSorePassword";
    public static final String DATA_AGENT_QUEUE_SIZE = "QueueSize";
    public static final String DATA_AGENT_BATCH_SIZE = "BatchSize";
    public static final String DATA_AGENT_CLIENT_POOL_FACTORY_CLASS = "ClientPoolFactoryClass";
    public static final String DATA_AGENT_SECURE_CLIENT_POOL_FACTORY_CLASS = "SecureClientPoolFactoryClass";

    public static final int DEFAULT_DATA_AGENT_QUEUE_SIZE = 100000;
    public static final int DEFAULT_DATA_AGENT_BATCH_SIZE = 100;

    public static final String LB_URL_GROUP_SEPARATOR = ",";
    public static final String FAILOVER_URL_GROUP_SEPARATOR = "|";

    public static final int DEFAULT_DATA_AGENT_MAX_TRANSPORT_POOL_SIZE = 250;
    public static final String DATA_AGENT_MAX_TRANSPORT_POOL_SIZE = "MaxTransportPoolSize";

    public static final int DEFAULT_DATA_AGENT_MAX_IDLE_CONNECTIONS = 250;
    public static final String DATA_AGENT_MAX_IDLE_CONNECTIONS = "MaxIdleConnections";

    public static final int DEFAULT_DATA_AGENT_EVICTION_TIME_PERIOD = 5500;
    public static final String DATA_AGENT_EVICTION_TIME_PERIOD = "EvictionTimePeriod";

    public static final int DEFAULT_DATA_AGENT_MIN_IDLE_TIME_IN_POOL = 5500;
    public static final String DATA_AGENT_MIN_IDLE_TIME_IN_POOL = "MinIdleTimeInPool";

    public static final int DEFAULT_DATA_AGENT_SECURE_MAX_TRANSPORT_POOL_SIZE = 5500;
    public static final String DATA_AGENT_SECURE_MAX_TRANSPORT_POOL_SIZE = "SecureMaxTransportPoolSize";

    public static final int DEFAULT_DATA_AGENT_SECURE_MAX_IDLE_CONNECTIONS = 250;
    public static final String DATA_AGENT_SECURE_MAX_IDLE_CONNECTIONS = "SecureMaxIdleConnections";

    public static final int DEFAULT_DATA_AGENT_SECURE_EVICTION_TIME_PERIOD = 5500;
    public static final String DATA_AGENT_SECURE_EVICTION_TIME_PERIOD = "SecureEvictionTimePeriod";

    public static final int DEFAULT_DATA_AGENT_SECURE_MIN_IDLE_TIME_IN_POOL = 5500;
    public static final String DATA_AGENT_SECURE_MIN_IDLE_TIME_IN_POOL = "SecureMinIdleTimeInPool";

    public static final int DEFAULT_DATA_AGENT_RECONNECTION_INTERVAL = 30;
    public static final String DATA_AGENT_RECONNECTION_INTERVAL = "ReconnectionInterval";

    public static final int DEFAULT_AUTH_PORT_OFFSET = 100;

    public static final String SEPARATOR = "##";

}
