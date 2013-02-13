package org.good.education.ecology.plant.reproduction;



import org.foundation.Foundation;
import org.foundation.ml.Label;
import org.good.education.ecology.weather.Season;

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
 * Created 2/1/13 1:43 AM
 */
public class Reproduction extends Foundation
{

    private String id;
    private Label  name;


    public Reproduction()
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
     * Bloom Period: During what seasonal period in the U.S. does the plant bloom the most? The bloom period is defined
     * as the time when pollen is shed and stigmas are receptive.
     */
    private Season bloomPeriod;

    /**
     * Fruit/Seed Period Begin: Season in which the earliest fruit or seed of the fruit/seed period is visually
     * obvious.
     */
    private Season periodBegin;

    /**
     * Fruit/Seed Period End: Season in which the latest fruit or seed of the fruit/seed period is visually obvious.
     */
    private Season periodEnd;

    /**
     * Fruit/Seed Persistence: Are the fruit or seed generally recognized as being persistent on the plant?
     */
    private boolean fruitSeedPersistence;

    /**
     * Propagated By Bare Root: Is it practical to propagate this plant as a bare root product?
     */
    private boolean propogatedByBareRoot;

    /**
     * Propagated By Bulbs: Is it practical to propagate this plant as bulbs?
     */
    private boolean propogatedByBulb;

    /**
     * Propagated By Container: Does the plant lend itself to being developed as a container product?
     */
    private boolean propogatedByContainer;

    /**
     * Propagated By Corms: Is it practical to propagate this plant as corms?
     */
    private boolean propogatedByCorm;

    /**
     * Propagated By Cuttings: Is it practical to propagate this plant as either stem or root cuttings?
     */
    private boolean propogatedByCuttings;

    /**
     * Propagated By Seed: Is it practical to propagate this plant by seed?
     */
    private boolean propogatedBySeed;

    /**
     * Propagated By Sod: Does the plant lend itself to being developed as a sod product?
     */
    private boolean propogatedBySod;

    /**
     * Propagated By Sprigs: Is it practical to propagate this plant by sprigs?
     */
    private boolean propogatedBySprigs;

    /**
     * Propagated By Tubers: Is it practical to propagate this plant by tubers?
     */
    private boolean propogatedByByTubers;

    /**
     * Seed Per Pound: How many seeds per pound are in an average seed lot?
     */
    private double seedsPerKg;

    /**
     * Seed Spread Rate: What is the capability of the plant to spread through its seed production compared to other
     * species with the same growth habit?
     */
    private SpreadRate seedSpreadRate;

    /**
     * Seedling Vigor: What is the expected seedling survival percentage of the plant compared to other species with the
     * same growth habit?
     */
    private SeedlingVigor seedlingVigor;

    /**
     * Small Grain: Is this plant a small grain?
     */
    private boolean smallGrain;

    /**
     * Vegetative Spread Rate: At what rate can this plant can spread compared to other species with the same growth
     * habit?
     */
    private SpreadRate vegetativeSpreadRate;


    public Season getBloomPeriod()
    {

        return bloomPeriod;
    }


    public void setBloomPeriod(Season bloomPeriod)
    {

        this.bloomPeriod = bloomPeriod;
    }


    public Season getPeriodBegin()
    {

        return periodBegin;
    }


    public void setPeriodBegin(Season periodBegin)
    {

        this.periodBegin = periodBegin;
    }


    public Season getPeriodEnd()
    {

        return periodEnd;
    }


    public void setPeriodEnd(Season periodEnd)
    {

        this.periodEnd = periodEnd;
    }


    public boolean isFruitSeedPersistence()
    {

        return fruitSeedPersistence;
    }


    public void setFruitSeedPersistence(boolean fruitSeedPersistence)
    {

        this.fruitSeedPersistence = fruitSeedPersistence;
    }


    public boolean isPropogatedByBareRoot()
    {

        return propogatedByBareRoot;
    }


    public void setPropogatedByBareRoot(boolean propogatedByBareRoot)
    {

        this.propogatedByBareRoot = propogatedByBareRoot;
    }


    public boolean isPropogatedByBulb()
    {

        return propogatedByBulb;
    }


    public void setPropogatedByBulb(boolean propogatedByBulb)
    {

        this.propogatedByBulb = propogatedByBulb;
    }


    public boolean isPropogatedByContainer()
    {

        return propogatedByContainer;
    }


    public void setPropogatedByContainer(boolean propogatedByContainer)
    {

        this.propogatedByContainer = propogatedByContainer;
    }


    public boolean isPropogatedByCorm()
    {

        return propogatedByCorm;
    }


    public void setPropogatedByCorm(boolean propogatedByCorm)
    {

        this.propogatedByCorm = propogatedByCorm;
    }


    public boolean isPropogatedByCuttings()
    {

        return propogatedByCuttings;
    }


    public void setPropogatedByCuttings(boolean propogatedByCuttings)
    {

        this.propogatedByCuttings = propogatedByCuttings;
    }


    public boolean isPropogatedBySeed()
    {

        return propogatedBySeed;
    }


    public void setPropogatedBySeed(boolean propogatedBySeed)
    {

        this.propogatedBySeed = propogatedBySeed;
    }


    public boolean isPropogatedBySod()
    {

        return propogatedBySod;
    }


    public void setPropogatedBySod(boolean propogatedBySod)
    {

        this.propogatedBySod = propogatedBySod;
    }


    public boolean isPropogatedBySprigs()
    {

        return propogatedBySprigs;
    }


    public void setPropogatedBySprigs(boolean propogatedBySprigs)
    {

        this.propogatedBySprigs = propogatedBySprigs;
    }


    public boolean isPropogatedByByTubers()
    {

        return propogatedByByTubers;
    }


    public void setPropogatedByByTubers(boolean propogatedByByTubers)
    {

        this.propogatedByByTubers = propogatedByByTubers;
    }


    public double getSeedsPerKg()
    {

        return seedsPerKg;
    }


    public void setSeedsPerKg(double seedsPerKg)
    {

        this.seedsPerKg = seedsPerKg;
    }


    public SpreadRate getSeedSpreadRate()
    {

        return seedSpreadRate;
    }


    public void setSeedSpreadRate(SpreadRate seedSpreadRate)
    {

        this.seedSpreadRate = seedSpreadRate;
    }


    public SeedlingVigor getSeedlingVigor()
    {

        return seedlingVigor;
    }


    public void setSeedlingVigor(SeedlingVigor seedlingVigor)
    {

        this.seedlingVigor = seedlingVigor;
    }


    public boolean isSmallGrain()
    {

        return smallGrain;
    }


    public void setSmallGrain(boolean smallGrain)
    {

        this.smallGrain = smallGrain;
    }


    public SpreadRate getVegetativeSpreadRate()
    {

        return vegetativeSpreadRate;
    }


    public void setVegetativeSpreadRate(SpreadRate vegetativeSpreadRate)
    {

        this.vegetativeSpreadRate = vegetativeSpreadRate;
    }
}
