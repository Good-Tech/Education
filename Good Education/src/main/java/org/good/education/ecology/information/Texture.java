package org.good.education.ecology.information;



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
 * Created 2/1/13 3:30 AM
 *
 * @NOTES http://www.viscometers.org/PDF/Brochures/texture/What_Is_Texture.pdf
 */
public class Texture
{
    /**
     * Particle volume in a sample material.
     */
    private double           volume;
    private Density          hardness;
    private SpringinessIndex springinessIndex;
    /**
     * Resilience is the ratio of work returned by the
     * sample as compressive strain is removed (known as
     * recoverable work done A
     * 2
     * ), to the work required for
     * compression (known as hardness work done A
     * 1
     * ).
     */
    private double           resilience;

    /**
     * The work necessary to overcome the attractive forces
     * between this surface and the surface of
     * other materials with which this comes into contact
     * <p/>
     * Positive charge and negative charged represented as + / - values respectively.
     */
    private double adhesiveness;

    /**
     * Force required to separate the adhesiveness measurement apparatus.
     * This is the batch value of the sample measured as an average force.
     * <p/>
     * This information is requested to maintain record of source information used to create
     * abstracted averages.
     */
    private double adhesiveForce;


    /**
     * A measurement of how well the structure of a product withstands compression
     * <p/>
     * The strength of internal bonds making up the body of the product (greater the value the greater the
     * cohesiveness)
     * <p/>
     * The ratio of the work during compression (downward stroke only) of the second cycle  B divided by that of the
     * first cycle A
     */
    private double cohesiveness;


    public Density getHardness()
    {

        return hardness;
    }


    public void setHardness(Density hardness)
    {

        this.hardness = hardness;
    }


    public SpringinessIndex getSpringinessIndex()
    {

        return springinessIndex;
    }


    public void setSpringinessIndex(SpringinessIndex springinessIndex)
    {

        this.springinessIndex = springinessIndex;
    }


    public double getResilience()
    {

        return resilience;
    }


    public void setResilience(double resilience)
    {

        this.resilience = resilience;
    }


    public double getAdhesiveness()
    {

        return adhesiveness;
    }


    public void setAdhesiveness(double adhesiveness)
    {

        this.adhesiveness = adhesiveness;
    }


    public double getAdhesiveForce()
    {

        return adhesiveForce;
    }


    public void setAdhesiveForce(double adhesiveForce)
    {

        this.adhesiveForce = adhesiveForce;
    }


    public double getCohesiveness()
    {

        return cohesiveness;
    }


    public void setCohesiveness(double cohesiveness)
    {

        this.cohesiveness = cohesiveness;
    }
}
