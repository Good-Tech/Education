package org.good.education.geometry;



import org.good.education.physics.EntropyDelta;

import java.util.Map;

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
 * Created 1/28/13 3:24 AM
 */
public class ThreeDimensionalPath
{
    private String id;
    private Map<Point, EntropyDelta> pointEntropyDeltaMap;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Map<Point, EntropyDelta> getPointEntropyDeltaMap()
    {

        return pointEntropyDeltaMap;
    }


    public void setPointEntropyDeltaMap(Map<Point, EntropyDelta> pointEntropyDeltaMap)
    {

        this.pointEntropyDeltaMap = pointEntropyDeltaMap;
    }
}
