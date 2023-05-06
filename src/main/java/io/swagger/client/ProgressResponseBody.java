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

package io.swagger.client;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class ProgressResponseBody extends ResponseBody {

    public interface ProgressListener {
        void update(long bytesRead, long contentLength, boolean done);
    }

    private final ResponseBody responseBody;
    private final ProgressListener progressListener;
    private BufferedSource bufferedSource;

    public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
        this.responseBody = responseBody;
        this.progressListener = progressListener;
    }

    @Override
    public MediaType contentType() {
        return responseBody.contentType();
    }

    @Override
    public long contentLength() throws IOException {
        return responseBody.contentLength();
    }

    @Override
    public BufferedSource source() throws IOException {
        if (bufferedSource == null) {
            bufferedSource = Okio.buffer(source(responseBody.source()));
        }
        return bufferedSource;
    }

    private Source source(Source source) {
        return new ForwardingSource(source) {
            long totalBytesRead = 0L;

            @Override
            public long read(Buffer sink, long byteCount) throws IOException {
                long bytesRead = super.read(sink, byteCount);
                // read() returns the number of bytes read, or -1 if this source is exhausted.
                totalBytesRead += bytesRead != -1 ? bytesRead : 0;
                progressListener.update(totalBytesRead, responseBody.contentLength(), bytesRead == -1);
                return bytesRead;
            }
        };
    }
}


