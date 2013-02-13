package org.good.education.cartography;



import org.foundation.Foundation;
import org.foundation.ml.Label;

/**
 * A geographic location.
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
 * Created 1/28/13 3:06 AM
 */
public class Location extends Foundation
{
    private String       id;
    private Label        name;
    private double       latitude;
    private double       longitude;
    private double       altitude;
    private GeoidicModel geoidicModel;


    public Location()
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


    public double getLatitude()
    {

        return latitude;
    }


    public void setLatitude(double latitude)
    {

        this.latitude = latitude;
    }


    public double getLongitude()
    {

        return longitude;
    }


    public void setLongitude(double longitude)
    {

        this.longitude = longitude;
    }


    public double getAltitude()
    {

        return altitude;
    }


    public void setAltitude(double altitude)
    {

        this.altitude = altitude;
    }


    public GeoidicModel getGeoidicModel()
    {

        return geoidicModel;
    }


    public void setGeoidicModel(GeoidicModel geoidicModel)
    {

        this.geoidicModel = geoidicModel;
    }
}
