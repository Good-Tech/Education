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
 *
 * @NOTES The cold test simulates early spring field conditions by germinating the seeds in wet soils (»70% water
 * holding capacity) and incubating them at 5-10°C/41-51°F for a specified period. At the end of the cold period, the
 * test is transferred to a favorable temperature for germination (e.g., 25°C/77°F in case of sweet corn). The
 * percentage of normal seedlings is considered as an indication of seed vigor. Vigorous seeds germinate better under
 * cold environments.
 * <p/>
 * When can the cold test be used?
 * <p/>
 * Select cultivars with the best ability to perform under cold wet soils for early spring planting.
 * Provide basis for adjusting planting rates for individual seed lots.
 * Evaluate the effects of adverse storage conditions, mechanical damage, drying injuries or other causes on seed
 * germination in cold wet soils.
 */
public class ColdTest
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
