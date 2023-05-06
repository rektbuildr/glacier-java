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
import io.swagger.client.model.Asset;
import io.swagger.client.model.EVMOutput;
import io.swagger.client.model.Utxo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * CChainImportTransaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class CChainImportTransaction implements InlineResponse2001, AnyOfListCChainAtomicTransactionsResponseTransactionsItems {
  @SerializedName("txHash")
  private String txHash = null;

  @SerializedName("blockHeight")
  private BigDecimal blockHeight = null;

  @SerializedName("blockHash")
  private String blockHash = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("amountUnlocked")
  private List<Asset> amountUnlocked = new ArrayList<Asset>();

  @SerializedName("amountCreated")
  private List<Asset> amountCreated = new ArrayList<Asset>();

  @SerializedName("sourceChain")
  private String sourceChain = null;

  @SerializedName("destinationChain")
  private String destinationChain = null;

  /**
   * Type of transaction.
   */
  @JsonAdapter(TxTypeEnum.Adapter.class)
  public enum TxTypeEnum {
    IMPORTTX("ImportTx");

    private String value;

    TxTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TxTypeEnum fromValue(String input) {
      for (TxTypeEnum b : TxTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TxTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TxTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TxTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("txType")
  private TxTypeEnum txType = null;

  @SerializedName("evmOutputs")
  private List<EVMOutput> evmOutputs = new ArrayList<EVMOutput>();

  @SerializedName("consumedUtxos")
  private List<Utxo> consumedUtxos = new ArrayList<Utxo>();

  public CChainImportTransaction txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Unique ID for this transaction.
   * @return txHash
  **/
  @Schema(example = "3j9JpF1aGuQtLLbo3YkvvKkWrCZViXZjdeJQWUSEY5hcqUn2c", required = true, description = "Unique ID for this transaction.")
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public CChainImportTransaction blockHeight(BigDecimal blockHeight) {
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * Height of the block this transaction belongs to.
   * @return blockHeight
  **/
  @Schema(example = "1005", required = true, description = "Height of the block this transaction belongs to.")
  public BigDecimal getBlockHeight() {
    return blockHeight;
  }

  public void setBlockHeight(BigDecimal blockHeight) {
    this.blockHeight = blockHeight;
  }

  public CChainImportTransaction blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Hash of the block this transaction belongs to.
   * @return blockHash
  **/
  @Schema(example = "0x57a5cb7704561d1d59bd563b6421021b7563960c05ba3ae0e36fc36917c742ee", required = true, description = "Hash of the block this transaction belongs to.")
  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public CChainImportTransaction timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Latest timestamp in seconds this transaction was accepted.
   * @return timestamp
  **/
  @Schema(example = "1600762738", required = true, description = "Latest timestamp in seconds this transaction was accepted.")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public CChainImportTransaction memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Hex encoded memo bytes for this transaction.
   * @return memo
  **/
  @Schema(example = "0x546865204176616c616e6368652050726f6a656374", required = true, description = "Hex encoded memo bytes for this transaction.")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public CChainImportTransaction amountUnlocked(List<Asset> amountUnlocked) {
    this.amountUnlocked = amountUnlocked;
    return this;
  }

  public CChainImportTransaction addAmountUnlockedItem(Asset amountUnlockedItem) {
    this.amountUnlocked.add(amountUnlockedItem);
    return this;
  }

   /**
   * Assets unlocked by inputs of this transaction.
   * @return amountUnlocked
  **/
  @Schema(required = true, description = "Assets unlocked by inputs of this transaction.")
  public List<Asset> getAmountUnlocked() {
    return amountUnlocked;
  }

  public void setAmountUnlocked(List<Asset> amountUnlocked) {
    this.amountUnlocked = amountUnlocked;
  }

  public CChainImportTransaction amountCreated(List<Asset> amountCreated) {
    this.amountCreated = amountCreated;
    return this;
  }

  public CChainImportTransaction addAmountCreatedItem(Asset amountCreatedItem) {
    this.amountCreated.add(amountCreatedItem);
    return this;
  }

   /**
   * Assets created by outputs of this transaction.
   * @return amountCreated
  **/
  @Schema(required = true, description = "Assets created by outputs of this transaction.")
  public List<Asset> getAmountCreated() {
    return amountCreated;
  }

  public void setAmountCreated(List<Asset> amountCreated) {
    this.amountCreated = amountCreated;
  }

  public CChainImportTransaction sourceChain(String sourceChain) {
    this.sourceChain = sourceChain;
    return this;
  }

   /**
   * Source chain for an atomic transaction.
   * @return sourceChain
  **/
  @Schema(example = "2oYMBNV4eNHyqk2fjjV5nVQLDbtmNJzq5s3qs3Lo6ftnC6FByM", required = true, description = "Source chain for an atomic transaction.")
  public String getSourceChain() {
    return sourceChain;
  }

  public void setSourceChain(String sourceChain) {
    this.sourceChain = sourceChain;
  }

  public CChainImportTransaction destinationChain(String destinationChain) {
    this.destinationChain = destinationChain;
    return this;
  }

   /**
   * Destination chain for an atomic transaction.
   * @return destinationChain
  **/
  @Schema(example = "2oYMBNV4eNHyqk2fjjV5nVQLDbtmNJzq5s3qs3Lo6ftnC6FByM", required = true, description = "Destination chain for an atomic transaction.")
  public String getDestinationChain() {
    return destinationChain;
  }

  public void setDestinationChain(String destinationChain) {
    this.destinationChain = destinationChain;
  }

  public CChainImportTransaction txType(TxTypeEnum txType) {
    this.txType = txType;
    return this;
  }

   /**
   * Type of transaction.
   * @return txType
  **/
  @Schema(example = "ImportTx", required = true, description = "Type of transaction.")
  public TxTypeEnum getTxType() {
    return txType;
  }

  public void setTxType(TxTypeEnum txType) {
    this.txType = txType;
  }

  public CChainImportTransaction evmOutputs(List<EVMOutput> evmOutputs) {
    this.evmOutputs = evmOutputs;
    return this;
  }

  public CChainImportTransaction addEvmOutputsItem(EVMOutput evmOutputsItem) {
    this.evmOutputs.add(evmOutputsItem);
    return this;
  }

   /**
   * Get evmOutputs
   * @return evmOutputs
  **/
  @Schema(required = true, description = "")
  public List<EVMOutput> getEvmOutputs() {
    return evmOutputs;
  }

  public void setEvmOutputs(List<EVMOutput> evmOutputs) {
    this.evmOutputs = evmOutputs;
  }

  public CChainImportTransaction consumedUtxos(List<Utxo> consumedUtxos) {
    this.consumedUtxos = consumedUtxos;
    return this;
  }

  public CChainImportTransaction addConsumedUtxosItem(Utxo consumedUtxosItem) {
    this.consumedUtxos.add(consumedUtxosItem);
    return this;
  }

   /**
   * Get consumedUtxos
   * @return consumedUtxos
  **/
  @Schema(required = true, description = "")
  public List<Utxo> getConsumedUtxos() {
    return consumedUtxos;
  }

  public void setConsumedUtxos(List<Utxo> consumedUtxos) {
    this.consumedUtxos = consumedUtxos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CChainImportTransaction cchainImportTransaction = (CChainImportTransaction) o;
    return Objects.equals(this.txHash, cchainImportTransaction.txHash) &&
        Objects.equals(this.blockHeight, cchainImportTransaction.blockHeight) &&
        Objects.equals(this.blockHash, cchainImportTransaction.blockHash) &&
        Objects.equals(this.timestamp, cchainImportTransaction.timestamp) &&
        Objects.equals(this.memo, cchainImportTransaction.memo) &&
        Objects.equals(this.amountUnlocked, cchainImportTransaction.amountUnlocked) &&
        Objects.equals(this.amountCreated, cchainImportTransaction.amountCreated) &&
        Objects.equals(this.sourceChain, cchainImportTransaction.sourceChain) &&
        Objects.equals(this.destinationChain, cchainImportTransaction.destinationChain) &&
        Objects.equals(this.txType, cchainImportTransaction.txType) &&
        Objects.equals(this.evmOutputs, cchainImportTransaction.evmOutputs) &&
        Objects.equals(this.consumedUtxos, cchainImportTransaction.consumedUtxos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHash, blockHeight, blockHash, timestamp, memo, amountUnlocked, amountCreated, sourceChain, destinationChain, txType, evmOutputs, consumedUtxos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CChainImportTransaction {\n");
    
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    amountUnlocked: ").append(toIndentedString(amountUnlocked)).append("\n");
    sb.append("    amountCreated: ").append(toIndentedString(amountCreated)).append("\n");
    sb.append("    sourceChain: ").append(toIndentedString(sourceChain)).append("\n");
    sb.append("    destinationChain: ").append(toIndentedString(destinationChain)).append("\n");
    sb.append("    txType: ").append(toIndentedString(txType)).append("\n");
    sb.append("    evmOutputs: ").append(toIndentedString(evmOutputs)).append("\n");
    sb.append("    consumedUtxos: ").append(toIndentedString(consumedUtxos)).append("\n");
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
