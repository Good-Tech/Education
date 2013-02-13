package org.good.education.information.instructions;



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
 * Created 1/29/13 3:24 PM
 */
public class DocumentLeaf
{
    private String id;
    private Label  label;
    private String value;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public String getValue()
    {

        return value;
    }


    public void setValue(String value)
    {

        this.value = value;
    }


    public Label getLabel()
    {

        return label;
    }


    public void setLabel(Label label)
    {

        this.label = label;
    }
}
