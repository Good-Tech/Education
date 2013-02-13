package org.good.education.nutrition.protein;



import org.good.education.biochem.MaterialSafetyDataSheet;
import org.good.education.nutrition.enzyme.Enzyme;

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
 * Created 2/1/13 10:40 PM
 */
public class ProteinCharactaristics
{

    private String id;

    private ProteinType  type;

    private MaterialSafetyDataSheet materialSafetyDataSheet;

    private List<Enzyme> enzymeList;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public ProteinType getType()
    {

        return type;
    }


    public void setType(ProteinType type)
    {

        this.type = type;
    }


    public List<Enzyme> getEnzymeList()
    {

        return enzymeList;
    }


    public void setEnzymeList(List<Enzyme> enzymeList)
    {

        this.enzymeList = enzymeList;
    }


    public MaterialSafetyDataSheet getMaterialSafetyDataSheet()
    {

        return materialSafetyDataSheet;
    }


    public void setMaterialSafetyDataSheet(MaterialSafetyDataSheet materialSafetyDataSheet)
    {

        this.materialSafetyDataSheet = materialSafetyDataSheet;
    }
}
