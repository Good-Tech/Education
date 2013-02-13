package org.good.education.ecology.plant.reproduction.seedvigor;



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
 * Created 2/2/13 2:18 AM
 * <p/>
 * This test measures the integrity of cell membranes, which is correlated with seed vigor. It is well established that
 * this test is useful for garden beans and peas. It has been also reported that the conductivity test results are
 * significantly correlated with field emergence for corn, and soybean. As seeds lose vigor, nutrients exude from their
 * membranes, and so low quality seeds leak electrolytes such as amino acids, organic acids while high quality seeds
 * contains their nutrients within well structured membranes. Therefore, seeds with higher conductivity measurement are
 * indication of low quality seeds as vice versa.
 */
public class ElectricalConductivityTest
{
    private String id;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }
}
