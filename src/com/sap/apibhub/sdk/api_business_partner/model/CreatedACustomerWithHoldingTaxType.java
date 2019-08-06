/*
 * OData Service for Business Partner
 * This service enables you to create, read, update, and    delete master data related to Business Partners,    Suppliers, and Customers in an SAP S/4HANA system.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_business_partner.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sap.apibhub.sdk.api_business_partner.model.APIBUSINESSPARTNERACustomerWithHoldingTaxType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreatedACustomerWithHoldingTaxType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T06:30:25.755Z")
public class CreatedACustomerWithHoldingTaxType {
  @SerializedName("d")
  private APIBUSINESSPARTNERACustomerWithHoldingTaxType d = null;

  public CreatedACustomerWithHoldingTaxType d(APIBUSINESSPARTNERACustomerWithHoldingTaxType d) {
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @ApiModelProperty(value = "")
  public APIBUSINESSPARTNERACustomerWithHoldingTaxType getD() {
    return d;
  }

  public void setD(APIBUSINESSPARTNERACustomerWithHoldingTaxType d) {
    this.d = d;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedACustomerWithHoldingTaxType createdACustomerWithHoldingTaxType = (CreatedACustomerWithHoldingTaxType) o;
    return Objects.equals(this.d, createdACustomerWithHoldingTaxType.d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedACustomerWithHoldingTaxType {\n");
    
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

