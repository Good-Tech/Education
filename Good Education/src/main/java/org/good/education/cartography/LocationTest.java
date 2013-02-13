package org.good.education.cartography;



import org.foundation.warehouse.ActivePersistenceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Copyright (C) 2013 by Scott Byrns
 * http://github.com/scottbyrns
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * <p/>
 * Created 2/11/13 2:49 AM
 */
public class LocationTest
{
    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void save () throws Exception
    {

        Location location = new Location();
        location.setLatitude(20.064518);
        location.setLongitude(-155.405517);
        location.setAltitude(800);

        ActivePersistenceImpl.getInstance().create(location);
    }

    @After
    public void tearDown() throws Exception
    {

    }
}
