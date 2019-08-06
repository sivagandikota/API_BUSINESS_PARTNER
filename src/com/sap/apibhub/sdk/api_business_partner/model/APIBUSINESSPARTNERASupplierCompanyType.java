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
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfASupplierDunningType;
import com.sap.apibhub.sdk.api_business_partner.model.CollectionOfASupplierWithHoldingTaxType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Supplier Company
 */
@ApiModel(description = "Supplier Company")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T06:30:25.755Z")
public class APIBUSINESSPARTNERASupplierCompanyType {
  @SerializedName("Supplier")
  private String supplier = null;

  @SerializedName("CompanyCode")
  private String companyCode = null;

  @SerializedName("to_SupplierDunning")
  private CollectionOfASupplierDunningType toSupplierDunning = null;

  @SerializedName("to_SupplierWithHoldingTax")
  private CollectionOfASupplierWithHoldingTaxType toSupplierWithHoldingTax = null;

  public APIBUSINESSPARTNERASupplierCompanyType supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system.
   * @return supplier
  **/
  @ApiModelProperty(value = "Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system.")
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public APIBUSINESSPARTNERASupplierCompanyType companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

   /**
   * The company code is an organizational unit within financial accounting.
   * @return companyCode
  **/
  @ApiModelProperty(value = "The company code is an organizational unit within financial accounting.")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public APIBUSINESSPARTNERASupplierCompanyType toSupplierDunning(CollectionOfASupplierDunningType toSupplierDunning) {
    this.toSupplierDunning = toSupplierDunning;
    return this;
  }

   /**
   * Get toSupplierDunning
   * @return toSupplierDunning
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASupplierDunningType getToSupplierDunning() {
    return toSupplierDunning;
  }

  public void setToSupplierDunning(CollectionOfASupplierDunningType toSupplierDunning) {
    this.toSupplierDunning = toSupplierDunning;
  }

  public APIBUSINESSPARTNERASupplierCompanyType toSupplierWithHoldingTax(CollectionOfASupplierWithHoldingTaxType toSupplierWithHoldingTax) {
    this.toSupplierWithHoldingTax = toSupplierWithHoldingTax;
    return this;
  }

   /**
   * Get toSupplierWithHoldingTax
   * @return toSupplierWithHoldingTax
  **/
  @ApiModelProperty(value = "")
  public CollectionOfASupplierWithHoldingTaxType getToSupplierWithHoldingTax() {
    return toSupplierWithHoldingTax;
  }

  public void setToSupplierWithHoldingTax(CollectionOfASupplierWithHoldingTaxType toSupplierWithHoldingTax) {
    this.toSupplierWithHoldingTax = toSupplierWithHoldingTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIBUSINESSPARTNERASupplierCompanyType apIBUSINESSPARTNERASupplierCompanyType = (APIBUSINESSPARTNERASupplierCompanyType) o;
    return Objects.equals(this.supplier, apIBUSINESSPARTNERASupplierCompanyType.supplier) &&
        Objects.equals(this.companyCode, apIBUSINESSPARTNERASupplierCompanyType.companyCode) &&
        Objects.equals(this.toSupplierDunning, apIBUSINESSPARTNERASupplierCompanyType.toSupplierDunning) &&
        Objects.equals(this.toSupplierWithHoldingTax, apIBUSINESSPARTNERASupplierCompanyType.toSupplierWithHoldingTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplier, companyCode, toSupplierDunning, toSupplierWithHoldingTax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIBUSINESSPARTNERASupplierCompanyType {\n");
    
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    toSupplierDunning: ").append(toIndentedString(toSupplierDunning)).append("\n");
    sb.append("    toSupplierWithHoldingTax: ").append(toIndentedString(toSupplierWithHoldingTax)).append("\n");
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

