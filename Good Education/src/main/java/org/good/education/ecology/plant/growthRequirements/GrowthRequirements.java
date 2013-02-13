package org.good.education.ecology.plant.growthRequirements;



import org.foundation.Foundation;
import org.foundation.ml.Label;
import org.good.education.biochem.PH;
import org.good.education.ecology.weather.Percipitation;
import org.good.education.physics.Temperature;

import javax.persistence.Entity;

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
 * Created 2/1/13 1:31 AM
 */
@Entity
public class GrowthRequirements extends Foundation
{

    private String id;
    private Label  name;


    public GrowthRequirements()
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


    /**
     * Adapted To Coarse Textured Soils: Can this plant establish and grow in soil with a coarse textured surface layer?
     * See table below for more information.
     */
    private boolean adaptdToCourseTexturedSoils;

    /**
     * Adapted To Medium Textured Soils: Can this plant establish and grow in soil with a medium textured surface layer?
     * See table below for more information.
     */
    private boolean adpatedToFineTexturedSoils;

    /**
     * Adapted To Fine Textured Soils: Can this plant establish and grow in soil with a fine textured surface layer? See
     * table below for more information.
     */
    private boolean adaptedToMediumTexturedSoils;

    /**
     * Anaerobic Tolerance: What is the relative tolerance to anaerobic soil conditions?
     */
    private Tolerance anerobicTolerance;

    /**
     * CaCO3 Tolerance: What is the relative tolerance to calcareous soil? We define calcareous soil as soil containing
     * sufficient free CaCO3 and other carbonates to effervesce visibly or audibly when treated with cold 0.1M HCl.
     * These soils usually contain from 10 to almost 1000g/kg CaCO3 equivalent.
     */
    private Tolerance caCO3Tolerance;

    /**
     * Cold Stratification Required: Will cold stratification significantly increase the seed germination percentage of
     * this plant?
     */
    private boolean coldStratificationRequired;

    /**
     * Drought Tolerance: What is the relative tolerance of the plant to drought conditions compared to other species
     * with the same growth habit from the same geographical region? Drought tolerance is defined here in the following
     * fashion: Imagine that in an acre of land there are low areas that have heavy soil and tend to accumulate more
     * soil moisture, and higher areas that have course textured soil and tend to accumulate less soil moisture. Some
     * plant species are most frequently found growing in the higher areas with the course soil texture. These plant
     * species are considered to be more drought tolerant than the species that are frequently found in the low areas
     * with fine textured soil.
     */
    private Tolerance droughtTolerance;

    /**
     * Fertility Requirement: What relative level of nutrition (N, P, K) is required for normal growth and development?
     */
    private FertilityRequirement fertilityRequirement;

    /**
     * Fire Tolerance: What is the relative ability to resprout, regrow, or reestablish from residual seed after a
     * fire?
     */
    private Tolerance fireTolerance;

    /**
     * Frost Free Days, Minimum: The minimum average number of frost-free days within the plant’s known geographical
     * range. For cultivars, the geographical range is defined as the area to which the cultivar is well adapted rather
     * than marginally adapted.
     */
    private long minimumFrostFreeDays;

    /**
     * Hedge Tolerance: What is the relative tolerance of woody perennials to hedging (close cropping) by livestock or
     * wildlife? Herbaceous plants are scored "None” here by default.
     */
    private Tolerance hedgeTolerance;

    /**
     * Moisture Use: Ability to use (i.e., remove) available soil moisture relative to other species in the same (or
     * similar) soil moisture availability region.
     */
    private MoistureUse moistureUse;

    /**
     * pH, Minimum: The minimum soil pH, of the top 12 inches of soil, within the plant’s known geographical range. For
     * cultivars, the geographical range is defined as the area to which the cultivar is well adapted rather than
     * marginally adapted.
     */
    private PH phMinimum;

    /**
     * pH, Maximum: The maximum soil pH, of the top 12 inches of soil, within the plant’s known geographical range. For
     * cultivars, the geographical range is defined as the area to which the cultivar is well adapted rather than
     * marginally adapted.
     */
    private PH phMaximum;

    /**
     * Planting Density Per Acre, Minimum: Recommended minimum number of individual plants to plant per acre.
     * <p/>
     * Planting Density Per Acre, Maximum: Recommended maximum number of individual plants to plant per acre.
     */
    private PlantingDensity plantingDensity;

    /**
     * Precipitation, Minimum: Minimum tolerable rainfall (in inches), expressed as the average annual minimum
     * precipitation that occurs 20% of the time (i.e., the probability of it being this dry in any given year is 20%)
     * at the driest climate station within the known geographical range of the plant. For cultivars, the geographical
     * range is defined as the area to which the cultivar is well adapted rather than marginally adapted.
     */
    private Percipitation percipitationMinimum;

    /**
     * Precipitation, Maximum: Maximum tolerable rainfall (in inches), expressed as the annual average precipitation of
     * the wettest climate station within the known geographical range of the plant. For cultivars, the geographical
     * range is defined as the area to which the cultivar is well adapted rather than marginally adapted.
     */
    private Percipitation percipitationMaximum;

    /**
     * Root Depth, Minimum: The minimum depth of soil (in inches) required for good growth. Plants that do not have
     * roots such as rootless aquatic plants (floating or submerged) and epiphytes are assigned a minimum root depth
     * value of zero.
     */
    private double minimumRootDepth;

    /**
     * Salinity Tolerance: What is the plant’s tolerance to soil salinity? Tolerance to a soil salinity level is defined
     * as only a slight reduction (not greater than 10%) in plant growth. None = tolerant to a soil with an electrical
     * conductivity of the soil solution extract of 0-2 dS/m; Low = tolerant to 2.1-4.0 dS/m; Medium = tolerant to
     * 4.1-8.0 dS/m; High = tolerant to greater than 8.0 dS/m.
     */
    private Tolerance salinityTolerance;

    /**
     * Shade Tolerance: What is the relative tolerance to shade conditions?
     */
    private Tolerance shadeTolerance;

    /**
     * Temperature, Minimum (°F): The minimum tolerable temperature is the lowest temperature recorded in the plant’s
     * historical range. If this is not available, the record low January temperature recorded at climate stations
     * within the current geographical range of the plant is used. This definition does not apply to summer annuals.
     */
    private Temperature minimumTemperature;


    public boolean isAdaptdToCourseTexturedSoils()
    {

        return adaptdToCourseTexturedSoils;
    }


    public void setAdaptdToCourseTexturedSoils(boolean adaptdToCourseTexturedSoils)
    {

        this.adaptdToCourseTexturedSoils = adaptdToCourseTexturedSoils;
    }


    public boolean isAdpatedToFineTexturedSoils()
    {

        return adpatedToFineTexturedSoils;
    }


    public void setAdpatedToFineTexturedSoils(boolean adpatedToFineTexturedSoils)
    {

        this.adpatedToFineTexturedSoils = adpatedToFineTexturedSoils;
    }


    public boolean isAdaptedToMediumTexturedSoils()
    {

        return adaptedToMediumTexturedSoils;
    }


    public void setAdaptedToMediumTexturedSoils(boolean adaptedToMediumTexturedSoils)
    {

        this.adaptedToMediumTexturedSoils = adaptedToMediumTexturedSoils;
    }


    public Tolerance getAnerobicTolerance()
    {

        return anerobicTolerance;
    }


    public void setAnerobicTolerance(Tolerance anerobicTolerance)
    {

        this.anerobicTolerance = anerobicTolerance;
    }


    public Tolerance getCaCO3Tolerance()
    {

        return caCO3Tolerance;
    }


    public void setCaCO3Tolerance(Tolerance caCO3Tolerance)
    {

        this.caCO3Tolerance = caCO3Tolerance;
    }


    public boolean isColdStratificationRequired()
    {

        return coldStratificationRequired;
    }


    public void setColdStratificationRequired(boolean coldStratificationRequired)
    {

        this.coldStratificationRequired = coldStratificationRequired;
    }


    public Tolerance getDroughtTolerance()
    {

        return droughtTolerance;
    }


    public void setDroughtTolerance(Tolerance droughtTolerance)
    {

        this.droughtTolerance = droughtTolerance;
    }


    public FertilityRequirement getFertilityRequirement()
    {

        return fertilityRequirement;
    }


    public void setFertilityRequirement(FertilityRequirement fertilityRequirement)
    {

        this.fertilityRequirement = fertilityRequirement;
    }


    public Tolerance getFireTolerance()
    {

        return fireTolerance;
    }


    public void setFireTolerance(Tolerance fireTolerance)
    {

        this.fireTolerance = fireTolerance;
    }


    public long getMinimumFrostFreeDays()
    {

        return minimumFrostFreeDays;
    }


    public void setMinimumFrostFreeDays(long minimumFrostFreeDays)
    {

        this.minimumFrostFreeDays = minimumFrostFreeDays;
    }


    public Tolerance getHedgeTolerance()
    {

        return hedgeTolerance;
    }


    public void setHedgeTolerance(Tolerance hedgeTolerance)
    {

        this.hedgeTolerance = hedgeTolerance;
    }


    public MoistureUse getMoistureUse()
    {

        return moistureUse;
    }


    public void setMoistureUse(MoistureUse moistureUse)
    {

        this.moistureUse = moistureUse;
    }


    public PH getPhMinimum()
    {

        return phMinimum;
    }


    public void setPhMinimum(PH phMinimum)
    {

        this.phMinimum = phMinimum;
    }


    public PH getPhMaximum()
    {

        return phMaximum;
    }


    public void setPhMaximum(PH phMaximum)
    {

        this.phMaximum = phMaximum;
    }


    public PlantingDensity getPlantingDensity()
    {

        return plantingDensity;
    }


    public void setPlantingDensity(PlantingDensity plantingDensity)
    {

        this.plantingDensity = plantingDensity;
    }


    public Percipitation getPercipitationMinimum()
    {

        return percipitationMinimum;
    }


    public void setPercipitationMinimum(Percipitation percipitationMinimum)
    {

        this.percipitationMinimum = percipitationMinimum;
    }


    public Percipitation getPercipitationMaximum()
    {

        return percipitationMaximum;
    }


    public void setPercipitationMaximum(Percipitation percipitationMaximum)
    {

        this.percipitationMaximum = percipitationMaximum;
    }


    public double getMinimumRootDepth()
    {

        return minimumRootDepth;
    }


    public void setMinimumRootDepth(double minimumRootDepth)
    {

        this.minimumRootDepth = minimumRootDepth;
    }


    public Tolerance getSalinityTolerance()
    {

        return salinityTolerance;
    }


    public void setSalinityTolerance(Tolerance salinityTolerance)
    {

        this.salinityTolerance = salinityTolerance;
    }


    public Tolerance getShadeTolerance()
    {

        return shadeTolerance;
    }


    public void setShadeTolerance(Tolerance shadeTolerance)
    {

        this.shadeTolerance = shadeTolerance;
    }


    public Temperature getMinimumTemperature()
    {

        return minimumTemperature;
    }


    public void setMinimumTemperature(Temperature minimumTemperature)
    {

        this.minimumTemperature = minimumTemperature;
    }
}
