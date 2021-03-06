package org.good.education.ecology.plant.growthRequirements;



import org.goodeducation.physics.Density;

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
 * Created 2/1/13 1:37 AM
 */
public class PlantingDensity
{
    private Density minimum;
    private Density maximum;


    public Density getMinimum()
    {

        return minimum;
    }


    public void setMinimum(Density minimum)
    {

        this.minimum = minimum;
    }


    public Density getMaximum()
    {

        return maximum;
    }


    public void setMaximum(Density maximum)
    {

        this.maximum = maximum;
    }
}
