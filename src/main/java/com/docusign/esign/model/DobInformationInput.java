package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class DobInformationInput   {
  
  private String dateOfBirth = null;
  private String displayLevelCode = null;
  private String receiveInResponse = null;

  
  /**
   * Specifies the recipient’s date, month, and year of birth.
   **/
  
  @ApiModelProperty(value = "Specifies the recipient’s date, month, and year of birth.")
  @JsonProperty("dateOfBirth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  /**
   * Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay
   **/
  
  @ApiModelProperty(value = "Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay")
  @JsonProperty("displayLevelCode")
  public String getDisplayLevelCode() {
    return displayLevelCode;
  }
  public void setDisplayLevelCode(String displayLevelCode) {
    this.displayLevelCode = displayLevelCode;
  }

  
  /**
   * When set to **true**, the information needs to be returned in the response.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the information needs to be returned in the response.")
  @JsonProperty("receiveInResponse")
  public String getReceiveInResponse() {
    return receiveInResponse;
  }
  public void setReceiveInResponse(String receiveInResponse) {
    this.receiveInResponse = receiveInResponse;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DobInformationInput dobInformationInput = (DobInformationInput) o;

    return true && Objects.equals(dateOfBirth, dobInformationInput.dateOfBirth) &&
        Objects.equals(displayLevelCode, dobInformationInput.displayLevelCode) &&
        Objects.equals(receiveInResponse, dobInformationInput.receiveInResponse)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, displayLevelCode, receiveInResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DobInformationInput {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
    sb.append("    receiveInResponse: ").append(toIndentedString(receiveInResponse)).append("\n");
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
