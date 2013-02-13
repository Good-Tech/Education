package org.good.education.ecology.plant;



import org.foundation.Foundation;
import org.foundation.ml.Label;
import org.good.education.ecology.classification.Classification;

import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

/**
 * A plant is a type of life that has a set of characteristics and can be classified as form of life.
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
 * Created 2/2/13 1:56 AM
 */
@Entity
public class Plant extends Foundation
{

    private String id = UUID.randomUUID().toString();
    private Label name;

    private Date plantedDate;
    private long daysToHarvest;

    private Classification       classification;
    private PlantCharacteristics plantCharacteristics;

    private double weight;


    public Plant()
    {

        registerListnersOfClass(this);
    }


    public Label getName()
    {

        return name;
    }


    public void setName(Label name)
    {

        this.name = name;
    }


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Date getPlantedDate()
    {

        return plantedDate;
    }


    public void setPlantedDate(Date plantedDate)
    {

        this.plantedDate = plantedDate;
    }


    public long getDaysToHarvest()
    {

        return daysToHarvest;
    }


    public void setDaysToHarvest(long daysToHarvest)
    {

        this.daysToHarvest = daysToHarvest;
    }


    public Classification getClassification()
    {

        return classification;
    }


    public void setClassification(Classification classification)
    {

        this.classification = classification;
    }


    public PlantCharacteristics getPlantCharacteristics()
    {

        return plantCharacteristics;
    }


    public void setPlantCharacteristics(PlantCharacteristics plantCharacteristics)
    {

        this.plantCharacteristics = plantCharacteristics;
    }


    public double getWeight()
    {

        return weight;
    }


    public void setWeight(double weight)
    {

        this.weight = weight;
    }
}
