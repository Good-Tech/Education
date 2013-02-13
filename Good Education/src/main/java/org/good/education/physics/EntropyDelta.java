package org.good.education.physics;



/**
 * A representation of the energy delta between an anode and a cathode.
 * This is descried as a pair of waves representing the angular momentum, wavelength, velocity, frequency
 *
 * Deltas are calculated as a the combined wave function of the anode and cathode.
 *
 *
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
 * Created 1/28/13 3:26 AM
 */
public class EntropyDelta
{
    private String id;
    private Wave anode;
    private Wave cathode;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Wave getAnode()
    {

        return anode;
    }


    public void setAnode(Wave anode)
    {

        this.anode = anode;
    }


    public Wave getCathode()
    {

        return cathode;
    }


    public void setCathode(Wave cathode)
    {

        this.cathode = cathode;
    }
}
