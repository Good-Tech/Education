package org.good.education.nutrition;



import org.foundation.Foundation;
import org.foundation.ml.Label;
import org.good.education.nutrition.aminoacid.AmminoAcid;
import org.good.education.nutrition.enzyme.Enzyme;
import org.good.education.nutrition.miniral.Miniral;
import org.good.education.nutrition.protein.Protein;
import org.good.education.nutrition.vitamin.Vitamin;

import javax.persistence.Entity;
import java.util.List;

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
 * Created 1/28/13 3:45 AM
 */
@Entity
public class Nutrition extends Foundation
{
    private String           id;
    private List<Protein>    proteins;
    private List<Enzyme>     enzymes;
    private List<Vitamin>    vitamins;
    private List<Miniral>    minirals;
    private List<AmminoAcid> amminoAcids;

    private Label name;


    public Nutrition()
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


    public List<Protein> getProteins()
    {

        return proteins;
    }


    public void setProteins(List<Protein> proteins)
    {

        this.proteins = proteins;
    }


    public List<Vitamin> getVitamins()
    {

        return vitamins;
    }


    public void setVitamins(List<Vitamin> vitamins)
    {

        this.vitamins = vitamins;
    }


    public List<Enzyme> getEnzymes()
    {

        return enzymes;
    }


    public void setEnzymes(List<Enzyme> enzymes)
    {

        this.enzymes = enzymes;
    }


    public List<Miniral> getMinirals()
    {

        return minirals;
    }


    public void setMinirals(List<Miniral> minirals)
    {

        this.minirals = minirals;
    }


    public List<AmminoAcid> getAmminoAcids()
    {

        return amminoAcids;
    }


    public void setAmminoAcids(List<AmminoAcid> amminoAcids)
    {

        this.amminoAcids = amminoAcids;
    }
}
