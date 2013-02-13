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
 * <p/>
 * This vigor test is an expansion of the standard germination test (SGT). The normal seedlings obtained from the SGT
 * results are further classified into ‘strong’ and ‘weak’ categories. This test has been used for corn, garden beans,
 * soybean, cotton, peanuts and other crops.
 * <p/>
 * The principle of the test
 * <p/>
 * Seedlings have four significant morphological sites for evaluating vigor:
 * <p/>
 * Root system.
 * Hypocotyl (the embryonic axis between cotyledons and root).
 * Cotyledons (storage tissue of reserve food for seedling development).
 * Epicotyl (the embryonic axis above the cotyledons).
 * In this test, seedlings are classified as ‘strong’ if the above four areas are well developed and free from defects,
 * which is indication of satisfactory performance over a wide range of field conditions. On the other hand, normal
 * seedlings with some deficiencies such as missing part of the root, one cotyledon missing, hypocotyl with breaks,
 * lesions, necrosis, twisting, or curling are classified as ‘weak’.
 */
public class SeedlingVigorClassification
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
