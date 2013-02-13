package org.good.education.ecology.classification;



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
 * Created 2/1/13 9:50 PM
 */
public class ClassificationBuilder
{

    public static Classification buildClassification (String kingdom, String division, String classOfLife, String order, String family, String phylum, String genus, String species) {
        Classification classification = new Classification();
        classification.setName(species + " classification");

        Label kingdomLabel = new Label();
        Label divisionLabel = new Label();
        Label classOfLifeLabel = new Label();
        Label orderLabel = new Label();
        Label familyLabel = new Label();
        Label genusLabel = new Label();
        Label speciesLabel = new Label();
        Label phylumLabel = new Label();

        kingdomLabel.setValue(kingdom);
        divisionLabel.setValue(division);
        classOfLifeLabel.setValue(classOfLife);
        orderLabel.setValue(order);
        familyLabel.setValue(family);
        genusLabel.setValue(genus);
        speciesLabel.setValue(species);
        phylumLabel.setValue(phylum);

        Kingdom kingdom1 = new Kingdom();
        Division division1 = new Division();
        ClassOfLife classOfLife1 = new ClassOfLife();
        Order order1 = new Order();
        Family family1 = new Family();
        Genus genus1 = new Genus();
        Species species1 = new Species();
        Phylum phylum1 = new Phylum();

        kingdom1.setName(kingdomLabel);
        division1.setLabel(divisionLabel);
        classOfLife1.setLabel(classOfLifeLabel);
        order1.setName(orderLabel);
        family1.setName(familyLabel);
        genus1.setLabel(genusLabel);
        species1.setName(speciesLabel);
        phylum1.setName(phylumLabel);

        classification.setClassOfLife(classOfLife1);
        classification.setKingdom(kingdom1);
        classification.setFamily(family1);
        classification.setGenus(genus1);
        classification.setOrder(order1);
        classification.setPhylum(phylum1);
        classification.setSpecies(species1);
        classification.setDivision(division1);

        return classification;
    }

    public static Classification buildClassification() {
        return ClassificationBuilder.buildClassification("Plante", "Magnoliophyta", "Magnoliopsida", "Apiales", "Araliaceae", "Rosidae", "Tetraplasandra A. Gray", "Tetraplasandra kavaiensis (H. Mann) Sherff");
    }

}
