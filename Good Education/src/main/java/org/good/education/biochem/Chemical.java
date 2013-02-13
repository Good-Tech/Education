package org.good.education.biochem;



import org.foundation.ml.Label;

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
 * Created 1/28/13 3:34 AM
 */
public class Chemical
{
    private String                  id;
    private Label                   label;
    private MaterialSafetyDataSheet materialSafetyDataSheet;
    private String                  forumula;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Label getLabel()
    {

        return label;
    }


    public void setLabel(Label label)
    {

        this.label = label;
    }


    public MaterialSafetyDataSheet getMaterialSafetyDataSheet()
    {

        return materialSafetyDataSheet;
    }


    public void setMaterialSafetyDataSheet(MaterialSafetyDataSheet materialSafetyDataSheet)
    {

        this.materialSafetyDataSheet = materialSafetyDataSheet;
    }


    public String getForumula()
    {

        return forumula;
    }


    public void setForumula(String forumula)
    {

        this.forumula = forumula;
    }
}

