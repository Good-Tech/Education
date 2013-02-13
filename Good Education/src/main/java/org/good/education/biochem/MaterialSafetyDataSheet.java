package org.good.education.biochem;



import org.foundation.ml.Label;
import org.good.education.information.instructions.Document;

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
 * Created 1/28/13 3:36 AM
 */
public class MaterialSafetyDataSheet
{
    private String id;
    private Label  label;
    private String productName;
    private String casNumber;
    /**
     * TODO Resolve manufacturer dependency.
     * TODO This property is required. Comes from the Business package.
     */
    //    private Manufacturer manufacturer;
    private String productCode;

    private Document document;


    public String getId()
    {

        return id;
    }


    public void setId(String id)
    {

        this.id = id;
    }


    public String getProductName()
    {

        return productName;
    }


    public void setProductName(String productName)
    {

        this.productName = productName;
    }


    public String getCasNumber()
    {

        return casNumber;
    }


    public void setCasNumber(String casNumber)
    {

        this.casNumber = casNumber;
    }


    //    public Manufacturer getManufacturer()
    //    {
    //
    //        return manufacturer;
    //    }
    //
    //
    //    public void setManufacturer(Manufacturer manufacturer)
//    {
//
//        this.manufacturer = manufacturer;
//    }


    public String getProductCode()
    {

        return productCode;
    }


    public void setProductCode(String productCode)
    {

        this.productCode = productCode;
    }


    public Document getDocument()
    {

        return document;
    }


    public void setDocument(Document document)
    {

        this.document = document;
    }


    public Label getLabel()
    {

        return label;
    }


    public void setLabel(Label label)
    {

        this.label = label;
    }
}
