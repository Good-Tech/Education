package org.good.education.ecology.plant.reproduction;



import org.good.education.ecology.plant.reproduction.seedvigor.*;

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
 * Created 2/1/13 1:47 AM
 *
 * @NOTES Cold test, accelerated aging test, electric conductivity test, seedling vigor classification, and seedling
 * growth rate are among the tests that are used to measure seed vigor. In addition, the tetrazolium (TZ test) can be
 * used as a vigor test by classifying the pattern of stained seeds into high, medium and low quality. The AOSA Seed
 * Vigor Testing Handbook is a good source of information on seed vigor testing.
 */
public class SeedlingVigor
{

    private String id;

    private ColdTest                    coldTestResults;
    private AcceleratedAgingTest        acceleratedAgingTestResults;
    private ElectricalConductivityTest  electricalConductivityTestResults;
    private SeedlingVigorClassification seedlingVigorClassification;
    private SeedlingGrowthRate          seedlingGrowthRate;


}
