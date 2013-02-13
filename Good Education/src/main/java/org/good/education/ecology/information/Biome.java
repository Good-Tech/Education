package org.good.education.ecology.information;



import org.good.education.ecology.weather.Climate;

/**
 * a grouping of terrestrial ecosystems on a given continent that are similar in vegetation structure, physiognomy,
 * features of the environment and characteristics of their animal communities
 * <p/>
 * <p/>
 * <p/>
 * Whittaker's biome-type classification scheme
 * Whittaker appreciated biome-types as a representation of the great diversity of the living world, and saw the need
 * to
 * establish a simple way to classify them. He based his classification scheme on two abiotic factors: precipitation
 * and
 * temperature. His scheme can be seen as a simplification of Holdridge's, one more readily accessible, but perhaps
 * missing the greater specificity that Holdridge's provides.
 * <p/>
 * Whittaker based his representation of global biomes on both previous theoretical assertions and an ever-increasing
 * empirical sampling of global ecosystems. He was in a unique position to make such a holistic assertion because he
 * had
 * previously compiled a review of biome classification.[4]
 * <p/>
 * [edit]Key definitions for understanding Whittaker's scheme
 * Physiognomy: The apparent characteristics, outward features, or appearance of ecological communities or species
 * Biome: a grouping of terrestrial ecosystems on a given continent that are similar in vegetation structure,
 * physiognomy, features of the environment and characteristics of their animal communities
 * Formation: a major kind of community of plants on a given continent
 * Biome-type: grouping of convergent biomes or formations of different continents, defined by physiognomy
 * Formation-type: a grouping of convergent formations
 * Whittaker's distinction between biome and formation can be simplified: formation is used when applied to plant
 * communities only, while biome is used when concerned with both plants and animals. Whittaker's convention of
 * biome-type or formation-type is simply a broader method to categorize similar communities.[5]
 * <p/>
 * [edit]Whittaker's parameters for classifying biome-types
 * Whittaker, seeing the need for a simpler way to express the relationship of community structure to the environment,
 * used what he called “gradient analysis” of ecocline patterns to relate communities to climate on a worldwide scale.
 * Whittaker considered four main ecoclines in the terrestrial realm.[6]
 * <p/>
 * Intertidal levels: The wetness gradient of areas that are exposed to alternating water and dryness with intensities
 * that vary by location from high to low tide
 * Climatic moisture gradient
 * Temperature gradient by altitude
 * Temperature gradient by latitude
 * Along these gradients, Whittaker noted several trends that allowed him to qualitatively establish biome-types.
 * <p/>
 * The gradient runs from favorable to extreme, with corresponding changes in productivity.
 * Changes in physiognomic complexity vary with the favorability of the environment (decreasing community structure and
 * reduction of stratal differentiation as the environment becomes less favorable).
 * Trends in diversity of structure follow trends in species diversity; alpha and beta species diversities decrease
 * from
 * favorable to extreme environments.
 * Each growth-form (i.e. grasses, shrubs, etc.) has its characteristic place of maximum importance along the
 * ecoclines.
 * The same growth forms may be dominant in similar environments in widely different parts of the world.
 * Whittaker summed the effects of gradients (3) and (4) to get an overall temperature gradient, and combined this with
 * gradient (2), the moisture gradient, to express the above conclusions in what is known as the Whittaker
 * classification scheme. The scheme graphs average annual precipitation (x-axis) versus average annual temperature
 * (y-axis) to classify biome-types.
 * <p/>
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
 * Created 1/29/13 11:27 PM
 */
public class Biome
{
    private Soil soil;


    private Climate weather;


    public Climate getWeather()
    {

        return weather;
    }


    public void setWeather(Climate weather)
    {

        this.weather = weather;
    }


    public Soil getSoil()
    {

        return soil;
    }


    public void setSoil(Soil soil)
    {

        this.soil = soil;
    }
}
