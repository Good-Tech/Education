package org.good.education.nutrition.enzyme;



import org.good.education.biochem.PH;
import org.good.education.physics.Temperature;

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
 * Created 2/1/13 11:08 PM
 *
 * @NOTES
 * Resources:
 * http://www.brenda-enzymes.org/php/result_flat.php4?ecno=4.4.1.5&UniProtAcc=Q9ZS21&OrganismID=2483&ShowAll=True
 *
 */
public class EnzymeCharactaristics
{
    private String       id;
    private Temperature  optimalReactionTemperatureThreshold;
    private PH           optimalMinimumReactionPHThreshold;
    private PH           optimalMaximumReactionPHThreshold;
    private List<Enzyme> coenzymes;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Temperature getOptimalReactionTemperatureThreshold()
    {

        return optimalReactionTemperatureThreshold;
    }


    public void setOptimalReactionTemperatureThreshold(Temperature optimalReactionTemperatureThreshold)
    {

        this.optimalReactionTemperatureThreshold = optimalReactionTemperatureThreshold;
    }


    public PH getOptimalMinimumReactionPHThreshold()
    {

        return optimalMinimumReactionPHThreshold;
    }


    public void setOptimalMinimumReactionPHThreshold(PH optimalMinimumReactionPHThreshold)
    {

        this.optimalMinimumReactionPHThreshold = optimalMinimumReactionPHThreshold;
    }


    public PH getOptimalMaximumReactionPHThreshold()
    {

        return optimalMaximumReactionPHThreshold;
    }


    public void setOptimalMaximumReactionPHThreshold(PH optimalMaximumReactionPHThreshold)
    {

        this.optimalMaximumReactionPHThreshold = optimalMaximumReactionPHThreshold;
    }


    public List<Enzyme> getCoenzymes()
    {

        return coenzymes;
    }


    public void setCoenzymes(List<Enzyme> coenzymes)
    {

        this.coenzymes = coenzymes;
    }
}
