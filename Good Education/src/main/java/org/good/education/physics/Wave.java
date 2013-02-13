package org.good.education.physics;



/**
 * Waves can interact with over waves to create analogue flow.
 *
 *
 * angular momentum, wavelength, velocity, frequency
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
 * Created 1/28/13 3:27 AM
 */
public class Wave
{
    private String id;
    private double spin;
    private double wavelength;
    private double velocity;
    private double frequency;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public double getSpin()
    {

        return spin;
    }


    public void setSpin(double spin)
    {

        this.spin = spin;
    }


    public double getWavelength()
    {

        return wavelength;
    }


    public void setWavelength(double wavelength)
    {

        this.wavelength = wavelength;
    }


    public double getVelocity()
    {

        return velocity;
    }


    public void setVelocity(double velocity)
    {

        this.velocity = velocity;
    }


    public double getFrequency()
    {

        return frequency;
    }


    public void setFrequency(double frequency)
    {

        this.frequency = frequency;
    }
}
