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
import io.swagger.client.model.Method;
import io.swagger.client.model.RichAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * NativeTransaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class NativeTransaction {
  @SerializedName("blockNumber")
  private String blockNumber = null;

  @SerializedName("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @SerializedName("blockHash")
  private String blockHash = null;

  @SerializedName("blockIndex")
  private BigDecimal blockIndex = null;

  @SerializedName("txHash")
  private String txHash = null;

  @SerializedName("txStatus")
  private String txStatus = null;

  @SerializedName("txType")
  private BigDecimal txType = null;

  @SerializedName("gasLimit")
  private String gasLimit = null;

  @SerializedName("gasUsed")
  private String gasUsed = null;

  @SerializedName("gasPrice")
  private String gasPrice = null;

  @SerializedName("nonce")
  private String nonce = null;

  @SerializedName("from")
  private RichAddress from = null;

  @SerializedName("to")
  private RichAddress to = null;

  @SerializedName("method")
  private Method method = null;

  @SerializedName("value")
  private String value = null;

  public NativeTransaction blockNumber(String blockNumber) {
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

  public NativeTransaction blockTimestamp(BigDecimal blockTimestamp) {
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

  public NativeTransaction blockHash(String blockHash) {
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

  public NativeTransaction blockIndex(BigDecimal blockIndex) {
    this.blockIndex = blockIndex;
    return this;
  }

   /**
   * The index at which the transaction occured in the block (0-indexed).
   * @return blockIndex
  **/
  @Schema(example = "0", required = true, description = "The index at which the transaction occured in the block (0-indexed).")
  public BigDecimal getBlockIndex() {
    return blockIndex;
  }

  public void setBlockIndex(BigDecimal blockIndex) {
    this.blockIndex = blockIndex;
  }

  public NativeTransaction txHash(String txHash) {
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

  public NativeTransaction txStatus(String txStatus) {
    this.txStatus = txStatus;
    return this;
  }

   /**
   * The transaction status, which is either 0 (failed) or 1 (successful).
   * @return txStatus
  **/
  @Schema(example = "1", required = true, description = "The transaction status, which is either 0 (failed) or 1 (successful).")
  public String getTxStatus() {
    return txStatus;
  }

  public void setTxStatus(String txStatus) {
    this.txStatus = txStatus;
  }

  public NativeTransaction txType(BigDecimal txType) {
    this.txType = txType;
    return this;
  }

   /**
   * The transaction type.
   * @return txType
  **/
  @Schema(example = "1", required = true, description = "The transaction type.")
  public BigDecimal getTxType() {
    return txType;
  }

  public void setTxType(BigDecimal txType) {
    this.txType = txType;
  }

  public NativeTransaction gasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * The gas limit set for the transaction.
   * @return gasLimit
  **/
  @Schema(example = "51373", required = true, description = "The gas limit set for the transaction.")
  public String getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }

  public NativeTransaction gasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * The amount of gas used.
   * @return gasUsed
  **/
  @Schema(example = "51373", required = true, description = "The amount of gas used.")
  public String getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  public NativeTransaction gasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * The gas price denominated by the number of decimals of the native token.
   * @return gasPrice
  **/
  @Schema(example = "470000000000", required = true, description = "The gas price denominated by the number of decimals of the native token.")
  public String getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }

  public NativeTransaction nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * The nonce used by the sender of the transaction.
   * @return nonce
  **/
  @Schema(example = "1", required = true, description = "The nonce used by the sender of the transaction.")
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  public NativeTransaction from(RichAddress from) {
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

  public NativeTransaction to(RichAddress to) {
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

  public NativeTransaction method(Method method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public Method getMethod() {
    return method;
  }

  public void setMethod(Method method) {
    this.method = method;
  }

  public NativeTransaction value(String value) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeTransaction nativeTransaction = (NativeTransaction) o;
    return Objects.equals(this.blockNumber, nativeTransaction.blockNumber) &&
        Objects.equals(this.blockTimestamp, nativeTransaction.blockTimestamp) &&
        Objects.equals(this.blockHash, nativeTransaction.blockHash) &&
        Objects.equals(this.blockIndex, nativeTransaction.blockIndex) &&
        Objects.equals(this.txHash, nativeTransaction.txHash) &&
        Objects.equals(this.txStatus, nativeTransaction.txStatus) &&
        Objects.equals(this.txType, nativeTransaction.txType) &&
        Objects.equals(this.gasLimit, nativeTransaction.gasLimit) &&
        Objects.equals(this.gasUsed, nativeTransaction.gasUsed) &&
        Objects.equals(this.gasPrice, nativeTransaction.gasPrice) &&
        Objects.equals(this.nonce, nativeTransaction.nonce) &&
        Objects.equals(this.from, nativeTransaction.from) &&
        Objects.equals(this.to, nativeTransaction.to) &&
        Objects.equals(this.method, nativeTransaction.method) &&
        Objects.equals(this.value, nativeTransaction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockNumber, blockTimestamp, blockHash, blockIndex, txHash, txStatus, txType, gasLimit, gasUsed, gasPrice, nonce, from, to, method, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeTransaction {\n");
    
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    blockIndex: ").append(toIndentedString(blockIndex)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    txStatus: ").append(toIndentedString(txStatus)).append("\n");
    sb.append("    txType: ").append(toIndentedString(txType)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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