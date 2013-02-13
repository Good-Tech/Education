package org.good.education.nutrition.miniral;



import org.good.education.biochem.Chemical;
import org.good.education.physics.Density;

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
 * Created 2/1/13 11:11 PM
 */
public class MiniralCharactaristics
{
    private String id;

    private Chemical     chemical;
    private MohsHardness hardness;
    private Density      density;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Chemical getChemical()
    {

        return chemical;
    }


    public void setChemical(Chemical chemical)
    {

        this.chemical = chemical;
    }


    public MohsHardness getHardness()
    {

        return hardness;
    }


    public void setHardness(MohsHardness hardness)
    {

        this.hardness = hardness;
    }


    public Density getDensity()
    {

        return density;
    }


    public void setDensity(Density density)
    {

        this.density = density;
    }
}
