/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.keycloak.social;

import java.util.Map;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class RequestDetails {

    private String providerId;

    private Map<String, String> clientAttributes;

    private Map<String, String> socialAttributes;

    RequestDetails(String providerId, Map<String, String> clientAttributes, Map<String, String> socialAttributes) {
        this.providerId = providerId;
        this.clientAttributes = clientAttributes;
        this.socialAttributes = socialAttributes;
    }

    public String getProviderId() {
        return providerId;
    }

    public String getClientAttribute(String name) {
        return clientAttributes.get(name);
    }

    public Map<String, String> getClientAttributes() {
        return clientAttributes;
    }

    public String getSocialAttribute(String name) {
        return socialAttributes.get(name);
    }

    public Map<String, String> getSocialAttributes() {
        return socialAttributes;
    }

}
