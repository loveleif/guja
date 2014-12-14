package com.wadpam.guja.oauth2.providers;

/*
 * #%L
 * guja-core
 * %%
 * Copyright (C) 2014 Wadpam
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.google.appengine.api.utils.SystemProperty;
import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.ext.Provider;

/**
 * Provide basic information about the current server environment.
 *
 * @author mattiaslevin
 */
@Singleton
@Provider
public class ServerEnvironmentProvider {

  public boolean isDevEnvironment() {
    return SystemProperty.Environment.Value.Development == SystemProperty.environment.value();
  }

}
