/*
 * Copyright 2009 Toni Menzel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.swissbox.tinybundles.dp.intern;

import java.io.InputStream;
import java.util.Map;

/**
 * Default implementation will (not done yet) probably keep content in memory.
 * Others may sit on top of this and cache this on disk / db instead.
 */
public class DefaultCache implements StreamCache
{

    public String[] getBundles()
    {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String[] getOtherResources()
    {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String[] getLocalizationFiles()
    {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String[] getMetaInfResources()
    {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void add( String name, InputStream resourceContent )
    {

    }

    public Map<String, String> getHeaders( String name )
    {
        return null; 
    }

    public InputStream getStream( String name )
    {
        return null;
    }


}