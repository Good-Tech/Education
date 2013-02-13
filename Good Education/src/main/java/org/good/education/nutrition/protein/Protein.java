package org.good.education.nutrition.protein;



import org.foundation.Foundation;
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
 * Created 1/28/13 3:34 AM
 * <p/>
 * <p/>
 * <p/>
 * <p/>
 * In view of the unsatisfactory state of the old classification, it is preferable to classify the proteins according
 * to
 * their biological function. Such a classification is far from ideal, however, because one protein can have more than
 * one function. The contractile protein myosin, for example, also acts as an ATPase (adenosine triphosphatase), an
 * enzyme that hydrolyzes adenosine triphosphate (removes a phosphate group from ATP by introducing a water molecule).
 * Another problem with functional classification is that the definite function of a protein frequently is not known. A
 * protein cannot be called an enzyme as long as its substrate (the specific compound upon which it acts) is not known.
 * It cannot even be tested for its enzymatic action when its substrate is not known.
 *
 * There are three types of protein:
 * mRNA, tRNA, and rRNA
 */
public class Protein extends Foundation
{
    private String id;
    private Label name;

    private Label label;

    private ProteinCharactaristics proteinCharactaristics;


    public Protein()
    {
        unregisterListenersOfClass(Protein.class);
    }


    public Label getName()
    {

        return name;
    }


    public void setName(Label name)
    {

        this.name = name;
    }


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public Label getLabel()
    {

        return label;
    }


    public void setLabel(Label label)
    {

        this.label = label;
    }


    public ProteinCharactaristics getProteinCharactaristics()
    {

        return proteinCharactaristics;
    }


    public void setProteinCharactaristics(ProteinCharactaristics proteinCharactaristics)
    {

        this.proteinCharactaristics = proteinCharactaristics;
    }
}
