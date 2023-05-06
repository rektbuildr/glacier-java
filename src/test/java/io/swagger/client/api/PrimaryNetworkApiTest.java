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

package io.swagger.client.api;

import io.swagger.client.model.Block;
import io.swagger.client.model.BlockchainId;
import io.swagger.client.model.ChainAddressChainIdMapListResponse;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.ListBlocksResponse;
import io.swagger.client.model.ListPChainTransactionsResponse;
import io.swagger.client.model.ListXChainTransactionsResponse;
import io.swagger.client.model.ListXChainVerticesResponse;
import io.swagger.client.model.Network;
import io.swagger.client.model.PChainId;
import io.swagger.client.model.SortOrder;
import io.swagger.client.model.XChainAssetDetails;
import io.swagger.client.model.XChainId;
import io.swagger.client.model.XChainVertex;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PrimaryNetworkApi
 */
@Ignore
public class PrimaryNetworkApiTest {

    private final PrimaryNetworkApi api = new PrimaryNetworkApi();

    /**
     * Returns asset details corresponding to the asset id on X-Chain.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAssetDetailsTest() throws Exception {
        String assetId = null;
        XChainAssetDetails response = api.getAssetDetails(assetId);

        // TODO: test validations
    }
    /**
     * Returns asset transactions corresponding to the asset id on X-Chain.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAssetTransactionsTest() throws Exception {
        XChainId blockchainId = null;
        Network network = null;
        String assetId = null;
        Integer pageSize = null;
        String pageToken = null;
        ListXChainTransactionsResponse response = api.getAssetTransactions(blockchainId, network, assetId, pageSize, pageToken);

        // TODO: test validations
    }
    /**
     * Returns balance for P-Chain, X-Chain, and C-Chain (only shared memory balance for C-Chain).
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBalancesByAddressesTest() throws Exception {
        BlockchainId blockchainId = null;
        Network network = null;
        String addresses = null;
        InlineResponse2004 response = api.getBalancesByAddresses(blockchainId, network, addresses);

        // TODO: test validations
    }
    /**
     * Returns block by block_height or block_hash on P-Chain, X-Chain (Cortina), C-Chain (hexadecimal for C-Chain).
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBlockByIdTest() throws Exception {
        BlockchainId blockchainId = null;
        Network network = null;
        String blockId = null;
        Block response = api.getBlockById(blockchainId, network, blockId);

        // TODO: test validations
    }
    /**
     * Return all address-mapped chain IDs that an address has been seen on chain before.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getChainAddressesTest() throws Exception {
        String addresses = null;
        Network network = null;
        ChainAddressChainIdMapListResponse response = api.getChainAddresses(addresses, network);

        // TODO: test validations
    }
    /**
     * Returns the details of the supplied transaction hash.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTxByHashTest() throws Exception {
        BlockchainId blockchainId = null;
        Network network = null;
        String txHash = null;
        InlineResponse2001 response = api.getTxByHash(blockchainId, network, txHash);

        // TODO: test validations
    }
    /**
     * Returns a list of UTXOs for the supplied addresses.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUtxosByAddressesTest() throws Exception {
        BlockchainId blockchainId = null;
        Network network = null;
        String addresses = null;
        Integer pageSize = null;
        String pageToken = null;
        String assetId = null;
        SortOrder sortOrder = null;
        InlineResponse2003 response = api.getUtxosByAddresses(blockchainId, network, addresses, pageSize, pageToken, assetId, sortOrder);

        // TODO: test validations
    }
    /**
     * Returns one vertex with the provided vertex hash on X-Chain.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVertexByHashTest() throws Exception {
        String vertexHash = null;
        XChainId blockchainId = null;
        Network network = null;
        XChainVertex response = api.getVertexByHash(vertexHash, blockchainId, network);

        // TODO: test validations
    }
    /**
     * Returns vertices with the provided vertex height on X-Chain.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVertexByHeightTest() throws Exception {
        Integer vertexHeight = null;
        XChainId blockchainId = null;
        Network network = null;
        Integer pageSize = null;
        String pageToken = null;
        SortOrder sortOrder = null;
        ListXChainVerticesResponse response = api.getVertexByHeight(vertexHeight, blockchainId, network, pageSize, pageToken, sortOrder);

        // TODO: test validations
    }
    /**
     * Returns active staking transactions for supplied addresses.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listActivePrimaryNetworkStakingTransactionsTest() throws Exception {
        PChainId blockchainId = null;
        Network network = null;
        String addresses = null;
        Integer pageSize = null;
        String pageToken = null;
        SortOrder sortOrder = null;
        ListPChainTransactionsResponse response = api.listActivePrimaryNetworkStakingTransactions(blockchainId, network, addresses, pageSize, pageToken, sortOrder);

        // TODO: test validations
    }
    /**
     * Returns latest blocks, up to user defined limit on P-Chain, X-Chain or C-Chain.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listLatestPrimaryNetworkBlocksTest() throws Exception {
        BlockchainId blockchainId = null;
        Network network = null;
        Integer pageSize = null;
        String pageToken = null;
        ListBlocksResponse response = api.listLatestPrimaryNetworkBlocks(blockchainId, network, pageSize, pageToken);

        // TODO: test validations
    }
    /**
     * Returns latest transactions. If addresses are supplied, returns transactions for those addresses.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listLatestPrimaryNetworkTransactionsTest() throws Exception {
        BlockchainId blockchainId = null;
        Network network = null;
        String addresses = null;
        Integer pageSize = null;
        String pageToken = null;
        SortOrder sortOrder = null;
        InlineResponse2002 response = api.listLatestPrimaryNetworkTransactions(blockchainId, network, addresses, pageSize, pageToken, sortOrder);

        // TODO: test validations
    }
    /**
     * Returns latest vertices, up to user defined limit on X-Chain.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listLatestXChainVerticesTest() throws Exception {
        XChainId blockchainId = null;
        Network network = null;
        Integer pageSize = null;
        String pageToken = null;
        ListXChainVerticesResponse response = api.listLatestXChainVertices(blockchainId, network, pageSize, pageToken);

        // TODO: test validations
    }
    /**
     * Returns latest blocks proposed by a given NodeID, up to user defined limit.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listPrimaryNetworkBlocksByNodeIdTest() throws Exception {
        BlockchainId blockchainId = null;
        Network network = null;
        String nodeId = null;
        Integer pageSize = null;
        String pageToken = null;
        ListBlocksResponse response = api.listPrimaryNetworkBlocksByNodeId(blockchainId, network, nodeId, pageSize, pageToken);

        // TODO: test validations
    }
}
