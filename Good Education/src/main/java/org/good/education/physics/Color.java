package org.good.education.physics;



import org.foundation.Foundation;
import org.foundation.ml.Label;

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
 * Created 2/1/13 1:29 AM
 */
public class Color extends Foundation
{
    private String id;
    private Label  name;

    private double wavelength;
    private double minimumWavelength;
    private double maximumWavelength;
    private double amplitude;


    public Color()
    {

        registerListnersOfClass(this);

    }


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Label getName()
    {

        return name;
    }


    public void setName(Label name)
    {

        this.name = name;
    }


    public double getMinimumWavelength()
    {

        return minimumWavelength;
    }


    public void setMinimumWavelength(double minimumWavelength)
    {

        this.minimumWavelength = minimumWavelength;
    }


    public double getMaximumWavelength()
    {

        return maximumWavelength;
    }


    public void setMaximumWavelength(double maximumWavelength)
    {

        this.maximumWavelength = maximumWavelength;
    }


    public double getAmplitude()
    {

        return amplitude;
    }


    public void setAmplitude(double amplitude)
    {

        this.amplitude = amplitude;
    }


    public double getWavelength()
    {

        return wavelength;
    }


    public void setWavelength(double wavelength)
    {

        this.wavelength = wavelength;
    }
}
