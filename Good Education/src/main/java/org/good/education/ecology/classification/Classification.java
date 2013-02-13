package org.good.education.ecology.classification;



import org.foundation.Foundation;
import org.foundation.ml.Label;

import javax.persistence.Entity;
import java.util.List;

/**
 * A taxonomic label for categorizing life.
 *
 * Life is characterized by the following properties:
 *
 * - Kingdom
 * - Division
 * - Phylum
 * - Class
 * - Order
 * - Family
 * - Genus
 * - Species
 *
 * TODO Account for sub divisions etc.
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
 * Created 2/1/13 3:01 AM
 */
@Entity
public class Classification extends Foundation
{
    private String      id;
    private Label       name;
    private List<Label> labels;

    private Kingdom     kingdom;
    private Division    division;
    private Phylum      phylum;
    private ClassOfLife classOfLife;
    private Order       order;
    private Family      family;
    private Genus       genus;
    private Species     species;


    public Classification()
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


    public List<Label> getLabels()
    {

        return labels;
    }


    public void setLabels(List<Label> labels)
    {

        this.labels = labels;
    }


    public Kingdom getKingdom()
    {

        return kingdom;
    }


    public void setKingdom(Kingdom kingdom)
    {

        this.kingdom = kingdom;
    }


    public Phylum getPhylum()
    {

        return phylum;
    }


    public void setPhylum(Phylum phylum)
    {

        this.phylum = phylum;
    }


    public ClassOfLife getClassOfLife()
    {

        return classOfLife;
    }


    public void setClassOfLife(ClassOfLife classOfLife)
    {

        this.classOfLife = classOfLife;
    }


    public Order getOrder()
    {

        return order;
    }


    public void setOrder(Order order)
    {

        this.order = order;
    }


    public Family getFamily()
    {

        return family;
    }


    public void setFamily(Family family)
    {

        this.family = family;
    }


    public Genus getGenus()
    {

        return genus;
    }


    public void setGenus(Genus genus)
    {

        this.genus = genus;
    }


    public Species getSpecies()
    {

        return species;
    }


    public void setSpecies(Species species)
    {

        this.species = species;
    }


    public Division getDivision()
    {

        return division;
    }


    public void setDivision(Division division)
    {

        this.division = division;
    }
}
