/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package javax.security.auth.message.callback;

import javax.security.auth.callback.Callback;
import java.security.KeyStore;

/**
 * A Callback enabling an authentication module to request a truststore from the runtime.
 *
 * @version $Rev: 617352 $ $Date: 2008-02-01 00:16:16 -0500 (Fri, 01 Feb 2008) $
 */
public class TrustStoreCallback implements Callback {

    private KeyStore trustStore;

    public KeyStore getTrustStore() {
        return trustStore;
    }

    public void setTrustStore(KeyStore trustStore) {
        this.trustStore = trustStore;
    }
}
