/*
 * (C) Copyright 2015 Nuxeo SA (http://nuxeo.com/) and others.
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
 *
 * Contributors:
 *     Antoine Taillefer <ataillefer@nuxeo.com>
 */
package org.nuxeo.elasticsearch.audit;

import java.io.Serializable;

import org.nuxeo.ecm.platform.audit.api.ExtendedInfo;

/**
 * Extended info for the {@link ESAuditBackend}.
 * 
 * @since 7.10
 */
public class ESExtendedInfo implements ExtendedInfo {

    private static final long serialVersionUID = -8946082235160679850L;

    protected Serializable value;

    public ESExtendedInfo(Serializable value) {
        this.value = value;
    }

    @Override
    public Long getId() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setId(Long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Serializable getSerializableValue() {
        return value;
    }

    @Override
    public <T> T getValue(Class<T> clazz) {
        return clazz.cast(getSerializableValue());
    }

}
