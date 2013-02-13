package org.good.education.ecology.plant.physiology;



import org.foundation.Foundation;
import org.foundation.ml.Label;
import org.goodeducation.physics.Color;

import javax.persistence.Entity;

/**
 * The physiology of a plant. This is a mapping of key attributes of what a plant is.
 *
 *
 * Copyright (C) 2013 by Scott Byrns
 * http://github.com/scottbyrns
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the
 * in compliance with
 * the License. You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License
 * is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 *S OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * <p/>
 * Created 2/1/13 1:19 AM
 *
 * @NOTES Attributes from:
 * http://plants.usda.gov/java/charProfile?symbol=PEST2
 */
@Entity
public class PlantPhysiology extends Foundation
{

    public PlantPhysiology()
    {
        registerListenersOfClass(PlantPhysiology.class, this);
    }


    private String id;

    private Label name;


    public Label getName()
    {

        return name;
    }


    public void setName(Label name)
    {

        this.name = name;
    }


    /**
     * Active Growth Period: Plants have their most active growth in which seasonal period?
     */
    private ActiveGrowthPeriod activeGrowthPeriod;


    /**
     * After Harvest Regrowth Rate: What is the relative rate of regrowth of a herbaceous plant after a harvest of
     * above
     * ground herbage? Woody plants are left blank here.
     */
    private AfterHarvestGrowthRate afterHarvestGrowthRate;


    /**
     * Bloat: What is the relative potential of an herbaceous plant to cause bloat in livestock? Woody plants are
     * scored
     * "None” here by default.
     */
    private Bloat bloat;


    /**
     * C:N Ratio: C:N ratio is the percentage of orga nitrogen in organic
     * material. We specify the organic material as either the above ground biomass of an herbaceous plant or the above
     * ground herbaceous material of a woody plant. Our relative values correspond to theselant. Our relative values correspond to these numerical ranges: Low: <23;
     * Medium: 23 – 59; High: >59.
     */
    private CarbonNitrogenRatio carbonNitrogenRatio;

    /**
     * Coppice Potential: Is the tree or shrub sui Coppicing completely
     * removes the canopy of woody plants, cutting them at or just above ground level. Plants otherm at or just above ground level. Plants other than trees and
     * shrubs are scored "No" here by default.
     */
    private boolean coppicePotential;


    /**
     * Fall Conspicuous: Are the leaves or fruits conspicuous during Autumn from a landscaping aesthetics standpoint?
     */
    private boolean fallConspicuous;

    /**
     * Fire Resistant: Is the plant known to resist burning? If the plant can carry a fire—and most can—this value will
     * be no. This characteristic is best evaluated with reference to problem fires in California.
     */
    private boolean fireResistant;

    /**
     * Flower Color.hbm.xml: What is the predominant color of the flowers?
     */
    private Color flowerColor;

    /**
     * Flower Conspicuous: Are the flowers conspicuous from a landscaping aesthetics standpoint?
     */
    private boolean flowerConspicuous;

    /**
     * Foliage Color.hbm.xml: What is the predominant color of the foliage?
     */
    private Color foliageColor;

    /**
     * Foliage Porosity Summer: How porous is the foliage during the summer months?
     */
    private Porosity foliagePorositySummer;

    /**
     * Foliage Porosity Winter: How porous is the foliage during the winter months?
     */
    private Porosity foliagePorosityWinter;

    /**
     * Foliage Texture: What is the general texture of the plant’s foliage relative to other species with the same
     * growth habit?
     */
    private FoliageTexture foliageTexture;

    /**
     * Fruit/Seed Color.hbm.xml: What is the predominant and conspicuous color of the mature fruit or seed from a landscaping
     * aesthetics standpoint?
     */
    private Color fruitSeedColor;

    /**
     * Fruit/Seed Conspicuous: Is the fruit or seed conspicuous from a landscaping aesthetics standpoint?
     */
    private boolean fruitSeedConspicuous;

    /**
     * Growth Form: What is the primary gro stabilization on slopes and
     * streamsides? Each plant species is assigned the single growth form that most enhances itsthe single growth form that most enhances its ability to stabilize
     * soil.
     */
    private GrowthForm growthForm;

    /**
     * Growth Rate: What is the growth rate after successful establishment relative to other species with the same
     * growth habit?
     */
    private GrowthRate growthRate;

    /**
     * Height at Base Age, Maximum: Maximum height ( ideal conditions, at
     * a
     * base age. The base age is 20 years for trees in temperate areas (>30 degrees north latitude), 10 years for trees
     * in tropical areas (≤30 degrees north latitude), and 10 years for all shrubs and sub-shrubs. Ideal conditions are
     * defined as soil pH = 5.0-7.8; soil salinity ≤ 4 mmhos/cm; soil depth ≥ 40 inches; effective average annual
     * precipitation ≥ 30 inches; soil texture class = medium; no ponding; rare or no annual flooding; and high water
     * table depth ≥ 1 foot during plant active growth period. Plants other than trees, shrubs, and period. Plants other than trees, shrubs, and sub-shrubs are left
     * blank here.
     */
    private double heightAtTwentyYearsYearsMeters;


    /**
     * Height at Maturity: Expected height (in feet) the median mature
     * height of all plants of a species or cultivar. Within a species mature height is quiteivar. Within a species mature height is quite variable, so this
     * estimate
     * is provided only to give a rough idea for planning purposes.
     */
    private double matureHeightMeters;

    /**
     * Known Allelopath: Has this plant species been shown to be allelopathic to at least one other species?
     */
    private boolean knownAllelopath;

    /**
     * Leaf Retention: Does the tree, shrub, or sub-shrub retain its leaves year round? Plants with other growth habits
     * are scored "No" here by default.
     */
    private boolean leafRetention;

    /**
     * Lifespan: What is the expected lifespan (in  species with the same
     * growth habit? For the Tree growth habit: Short: < 100; Moderate: 100 - 250; Long: >250. Life < 100; Moderate: 100 - 250; Long: >250. Life spans for other
     * growth habits are not quantified.
     */
    private Lifespan lifespan;


    /**
     * Low Growing Grass: Does the growing point (terminal meristem) of the vegetative grass tiller remain either at or
     * near the crown? Plants other than grasses are scored "No" here by default.
     */
    private boolean lowGrowingGrass;

    /**
     * Nitrogen Fixation: How much nitrogen is fixed by this plant in monoculture? Our relative values correspond to
     * these numerical ranges: None: 0 lb. N/acre/year; 0<Low<85; Medium: 85-160; High: >160.
     */
    private NitrogenFixation nitrogenFixation;

    /**
     * Resprout Ability: Will the woody perennial resprout following top (above ground biomass) removal? Herbaceous
     * plants are scored "No” here by default.
     */
    private boolean resproutAbility;

    /**
     * Shape and Orientation: What is the growth form or predominant shape of an individual plant? (This characteristic
     * is especially useful for selecting species for windbreaks.)
     */
    private ShapeAndOrientation shapeAndOrientation;

    /**
     * Toxicity: What is the relative toxicity of the plant to either humans or livestock?
     */
    private Toxicity toxicity;


    public ActiveGrowthPeriod getActiveGrowthPeriod()
    {

        return activeGrowthPeriod;
    }


    public void setActiveGrowthPeriod(ActiveGrowthPeriod activeGrowthPeriod)
    {

        this.activeGrowthPeriod = activeGrowthPeriod;
    }


    public AfterHarvestGrowthRate getAfterHarvestGrowthRate()
    {

        return afterHarvestGrowthRate;
    }


    public void setAfterHarvestGrowthRate(AfterHarvestGrowthRate afterHarvestGrowthRate)
    {

        this.afterHarvestGrowthRate = afterHarvestGrowthRate;
    }


    public Bloat getBloat()
    {

        return bloat;
    }


    public void setBloat(Bloat bloat)
    {

        this.bloat = bloat;
    }


    public CarbonNitrogenRatio getCarbonNitrogenRatio()
    {

        return carbonNitrogenRatio;
    }


    public void setCarbonNitrogenRatio(CarbonNitrogenRatio carbonNitrogenRatio)
    {

        this.carbonNitrogenRatio = carbonNitrogenRatio;
    }


    public boolean isCoppicePotential()
    {

        return coppicePotential;
    }


    public void setCoppicePotential(boolean coppicePotential)
    {

        this.coppicePotential = coppicePotential;
    }


    public boolean isFallConspicuous()
    {

        return fallConspicuous;
    }


    public void setFallConspicuous(boolean fallConspicuous)
    {

        this.fallConspicuous = fallConspicuous;
    }


    public boolean isFireResistant()
    {

        return fireResistant;
    }


    public void setFireResistant(boolean fireResistant)
    {

        this.fireResistant = fireResistant;
    }


    public Color getFlowerColor()
    {

        return flowerColor;
    }


    public void setFlowerColor(Color flowerColor)
    {

        this.flowerColor = flowerColor;
    }


    public boolean isFlowerConspicuous()
    {

        return flowerConspicuous;
    }


    public void setFlowerConspicuous(boolean flowerConspicuous)
    {

        this.flowerConspicuous = flowerConspicuous;
    }


    public Color getFoliageColor()
    {

        return foliageColor;
    }


    public void setFoliageColor(Color foliageColor)
    {

        this.foliageColor = foliageColor;
    }


    public Porosity getFoliagePorositySummer()
    {

        return foliagePorositySummer;
    }


    public void setFoliagePorositySummer(Porosity foliagePorositySummer)
    {

        this.foliagePorositySummer = foliagePorositySummer;
    }


    public Porosity getFoliagePorosityWinter()
    {

        return foliagePorosityWinter;
    }


    public void setFoliagePorosityWinter(Porosity foliagePorosityWinter)
    {

        this.foliagePorosityWinter = foliagePorosityWinter;
    }


    public FoliageTexture getFoliageTexture()
    {

        return foliageTexture;
    }


    public void setFoliageTexture(FoliageTexture foliageTexture)
    {

        this.foliageTexture = foliageTexture;
    }


    public Color getFruitSeedColor()
    {

        return fruitSeedColor;
    }


    public void setFruitSeedColor(Color fruitSeedColor)
    {

        this.fruitSeedColor = fruitSeedColor;
    }


    public boolean isFruitSeedConspicuous()
    {

        return fruitSeedConspicuous;
    }


    public void setFruitSeedConspicuous(boolean fruitSeedConspicuous)
    {

        this.fruitSeedConspicuous = fruitSeedConspicuous;
    }


    public GrowthForm getGrowthForm()
    {

        return growthForm;
    }


    public void setGrowthForm(GrowthForm growthForm)
    {

        this.growthForm = growthForm;
    }


    public GrowthRate getGrowthRate()
    {

        return growthRate;
    }


    public void setGrowthRate(GrowthRate growthRate)
    {

        this.growthRate = growthRate;
    }


    public double getHeightAtTwentyYearsYearsMeters()
    {

        return heightAtTwentyYearsYearsMeters;
    }


    public void setHeightAtTwentyYearsYearsMeters(double heightAtTwentyYearsYearsMeters)
    {

        this.heightAtTwentyYearsYearsMeters = heightAtTwentyYearsYearsMeters;
    }


    public double getMatureHeightMeters()
    {

        return matureHeightMeters;
    }


    public void setMatureHeightMeters(double matureHeightMeters)
    {

        this.matureHeightMeters = matureHeightMeters;
    }


    public boolean isKnownAllelopath()
    {

        return knownAllelopath;
    }


    public void setKnownAllelopath(boolean knownAllelopath)
    {

        this.knownAllelopath = knownAllelopath;
    }


    public boolean isLeafRetention()
    {

        return leafRetention;
    }


    public void setLeafRetention(boolean leafRetention)
    {

        this.leafRetention = leafRetention;
    }


    public Lifespan getLifespan()
    {

        return lifespan;
    }


    public void setLifespan(Lifespan lifespan)
    {

        this.lifespan = lifespan;
    }


    public boolean isLowGrowingGrass()
    {

        return lowGrowingGrass;
    }


    public void setLowGrowingGrass(boolean lowGrowingGrass)
    {

        this.lowGrowingGrass = lowGrowingGrass;
    }


    public NitrogenFixation getNitrogenFixation()
    {

        return nitrogenFixation;
    }


    public void setNitrogenFixation(NitrogenFixation nitrogenFixation)
    {

        this.nitrogenFixation = nitrogenFixation;
    }


    public boolean getResproutAbility()
    {

        return resproutAbility;
    }


    public void setResproutAbility(boolean resproutAbility)
    {

        this.resproutAbility = resproutAbility;
    }


    public ShapeAndOrientation getShapeAndOrientation()
    {

        return shapeAndOrientation;
    }


    public void setShapeAndOrientation(ShapeAndOrientation shapeAndOrientation)
    {

        this.shapeAndOrientation = shapeAndOrientation;
    }


    public Toxicity getToxicity()
    {

        return toxicity;
    }


    public void setToxicity(Toxicity toxicity)
    {

        this.toxicity = toxicity;
    }


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }
}
