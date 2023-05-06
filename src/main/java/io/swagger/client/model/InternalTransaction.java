/*
 * Glacier API
 * The Glacier API provides web3 application developers with multi-chain        data related to Avalanche's primary network, Avalanche subnets, and        Ethereum. With Glacier, you can easily build products that leverage        real-time and historical transaction and transfer history, native and        token balances, and various types of token metadata. The API is in Beta        and may be subject to change.        </br></br>        If you have feedback or feature requests for the API, please submit them        <a href=\"https://portal.productboard.com/dndv9ahlkdfye4opdm8ksafi/tabs/4-glacier-api\">here</a>. Bug reports can be submitted        <a href=\"https://docs.google.com/forms/d/e/1FAIpQLSeJQrcp7QoNiqozMDKrVJGX5wpU827d3cVTgF8qa7t_J1Pb-g/viewform\">here</a>, and any potential security        issues can be reported <a href=\"https://hackenproof.com/avalanche\">here</a>.
 *
 * OpenAPI spec version: Beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.InternalTransactionOpCall;
import io.swagger.client.model.RichAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * InternalTransaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class InternalTransaction {
  @SerializedName("blockNumber")
  private String blockNumber = null;

  @SerializedName("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @SerializedName("blockHash")
  private String blockHash = null;

  @SerializedName("txHash")
  private String txHash = null;

  @SerializedName("from")
  private RichAddress from = null;

  @SerializedName("to")
  private RichAddress to = null;

  @SerializedName("internalTxType")
  private InternalTransactionOpCall internalTxType = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("isReverted")
  private Boolean isReverted = null;

  @SerializedName("gasUsed")
  private String gasUsed = null;

  @SerializedName("gasLimit")
  private String gasLimit = null;

  public InternalTransaction blockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * The block number on the chain.
   * @return blockNumber
  **/
  @Schema(example = "339", required = true, description = "The block number on the chain.")
  public String getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
  }

  public InternalTransaction blockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
    return this;
  }

   /**
   * The block finality timestamp.
   * @return blockTimestamp
  **/
  @Schema(example = "1648672486", required = true, description = "The block finality timestamp.")
  public BigDecimal getBlockTimestamp() {
    return blockTimestamp;
  }

  public void setBlockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
  }

  public InternalTransaction blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * The block hash identifier.
   * @return blockHash
  **/
  @Schema(example = "0x17533aeb5193378b9ff441d61728e7a2ebaf10f61fd5310759451627dfca2e7c", required = true, description = "The block hash identifier.")
  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public InternalTransaction txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * The transaction hash identifier.
   * @return txHash
  **/
  @Schema(example = "0x3e9303f81be00b4af28515dab7b914bf3dbff209ea10e7071fa24d4af0a112d4", required = true, description = "The transaction hash identifier.")
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public InternalTransaction from(RichAddress from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @Schema(required = true, description = "")
  public RichAddress getFrom() {
    return from;
  }

  public void setFrom(RichAddress from) {
    this.from = from;
  }

  public InternalTransaction to(RichAddress to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(required = true, description = "")
  public RichAddress getTo() {
    return to;
  }

  public void setTo(RichAddress to) {
    this.to = to;
  }

  public InternalTransaction internalTxType(InternalTransactionOpCall internalTxType) {
    this.internalTxType = internalTxType;
    return this;
  }

   /**
   * Get internalTxType
   * @return internalTxType
  **/
  @Schema(required = true, description = "")
  public InternalTransactionOpCall getInternalTxType() {
    return internalTxType;
  }

  public void setInternalTxType(InternalTransactionOpCall internalTxType) {
    this.internalTxType = internalTxType;
  }

  public InternalTransaction value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(example = "10000000000000000000", required = true, description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public InternalTransaction isReverted(Boolean isReverted) {
    this.isReverted = isReverted;
    return this;
  }

   /**
   * True if the internal transaction was reverted.
   * @return isReverted
  **/
  @Schema(required = true, description = "True if the internal transaction was reverted.")
  public Boolean isIsReverted() {
    return isReverted;
  }

  public void setIsReverted(Boolean isReverted) {
    this.isReverted = isReverted;
  }

  public InternalTransaction gasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Get gasUsed
   * @return gasUsed
  **/
  @Schema(required = true, description = "")
  public String getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  public InternalTransaction gasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Get gasLimit
   * @return gasLimit
  **/
  @Schema(required = true, description = "")
  public String getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalTransaction internalTransaction = (InternalTransaction) o;
    return Objects.equals(this.blockNumber, internalTransaction.blockNumber) &&
        Objects.equals(this.blockTimestamp, internalTransaction.blockTimestamp) &&
        Objects.equals(this.blockHash, internalTransaction.blockHash) &&
        Objects.equals(this.txHash, internalTransaction.txHash) &&
        Objects.equals(this.from, internalTransaction.from) &&
        Objects.equals(this.to, internalTransaction.to) &&
        Objects.equals(this.internalTxType, internalTransaction.internalTxType) &&
        Objects.equals(this.value, internalTransaction.value) &&
        Objects.equals(this.isReverted, internalTransaction.isReverted) &&
        Objects.equals(this.gasUsed, internalTransaction.gasUsed) &&
        Objects.equals(this.gasLimit, internalTransaction.gasLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockNumber, blockTimestamp, blockHash, txHash, from, to, internalTxType, value, isReverted, gasUsed, gasLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalTransaction {\n");
    
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    internalTxType: ").append(toIndentedString(internalTxType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isReverted: ").append(toIndentedString(isReverted)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
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
