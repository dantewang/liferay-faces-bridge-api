/**
 * Copyright (c) 2000-2025 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.faces.bridge.context;

import jakarta.faces.FacesException;
import jakarta.faces.context.FacesContext;
import jakarta.faces.context.FacesContextFactory;
import jakarta.faces.lifecycle.Lifecycle;
import jakarta.portlet.PortletContext;
import jakarta.portlet.PortletRequest;
import jakarta.portlet.PortletResponse;
import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Dante Wang
 */
@ProviderType
public interface BridgeFacesContextFactory {

	public FacesContext getFacesContext(
			FacesContextFactory facesContextFactory, PortletContext portletContext,
			PortletRequest portletRequest, PortletResponse portletResponse, Lifecycle lifecycle)
		throws FacesException;

}