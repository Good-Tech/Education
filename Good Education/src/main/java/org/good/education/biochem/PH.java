package org.good.education.biochem;



import org.foundation.framework.mcl.persistence.IModel;

import javax.persistence.Entity;


/**
 * Hydrogen Ion Concentration
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
 * Created 1/28/13 3:12 AM
 */
@Entity
public class PH implements IModel<String>
{
    private String id;
    private double value;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Object getVersion()
    {

        return 1;
    }


    public double getValue()
    {

        return value;
    }


    public void setValue(double value)
    {

        this.value = value;
    }


    public int compareTo(IModel<String> o)
    {

        return o.compareTo(this);
    }
}
