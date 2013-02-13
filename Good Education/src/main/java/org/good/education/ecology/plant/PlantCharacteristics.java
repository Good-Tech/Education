package org.good.education.ecology.plant;



import org.foundation.Foundation;
import org.foundation.ml.Label;
import org.good.education.ecology.information.Biome;
import org.good.education.ecology.information.Soil;
import org.good.education.ecology.plant.growthRequirements.GrowthRequirements;
import org.good.education.ecology.plant.physiology.PlantPhysiology;
import org.good.education.ecology.plant.reproduction.Reproduction;
import org.good.education.ecology.weather.Climate;
import org.good.education.nutrition.Nutrition;

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
 * Created 2/1/13 1:18 AM
 *
 * @NOTES Source: http://plants.usda.gov/charinfo.html
 */
public class PlantCharacteristics extends Foundation
{

    private String id;

    private Duration           duration;
    private PlantPhysiology    plantPhysiology;
    private GrowthHabit        growthHabit;
    private GrowthRequirements growthRequirements;
    private Reproduction       reproduction;
    private Nutrition          nutrition;

    private Biome biome;
    private Soil  soil;
    private Climate climate;

    private Label name;


    public Label getName()
    {

        return name;
    }


    public void setName(Label name)
    {

        this.name = name;
    }

    public PlantCharacteristics()
    {
        registerListnersOfClass(this);
    }


    public Soil getSoil()
    {

        return soil;
    }


    public void setSoil(Soil soil)
    {

        this.soil = soil;
    }


    public Climate getClimate()
    {

        return climate;
    }


    public void setClimate(Climate climate)
    {

        this.climate = climate;
    }


    public Biome getBiome()
    {

        return biome;
    }


    public void setBiome(Biome biome)
    {

        this.biome = biome;
    }


    public GrowthRequirements getGrowthRequirements()
    {

        return growthRequirements;
    }


    public void setGrowthRequirements(GrowthRequirements growthRequirements)
    {

        this.growthRequirements = growthRequirements;
    }


    public Duration getDuration()
    {

        return duration;
    }


    public void setDuration(Duration duration)
    {

        this.duration = duration;
    }


    public PlantPhysiology getPlantPhysiology()
    {

        return plantPhysiology;
    }


    public void setPlantPhysiology(PlantPhysiology plantPhysiology)
    {

        this.plantPhysiology = plantPhysiology;
    }


    public GrowthHabit getGrowthHabit()
    {

        return growthHabit;
    }


    public void setGrowthHabit(GrowthHabit growthHabit)
    {

        this.growthHabit = growthHabit;
    }


    public Reproduction getReproduction()
    {

        return reproduction;
    }


    public void setReproduction(Reproduction reproduction)
    {

        this.reproduction = reproduction;
    }


    public Nutrition getNutrition()
    {

        return nutrition;
    }


    public void setNutrition(Nutrition nutrition)
    {

        this.nutrition = nutrition;
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
