/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiException;
import Model.Body;
import Model.Body1;
import Model.InlineResponse2007;
import Model.InlineResponse2008;
import Model.InlineResponse4006;
import Model.InlineResponse409;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstrumentIdentifierApi
 */
@Ignore
public class InstrumentIdentifierApiTest {

    private final InstrumentIdentifierApi api = new InstrumentIdentifierApi();

    
    /**
     * Create an Instrument Identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentidentifiersPostTest() throws ApiException {
        String profileId = null;
        Body body = null;
        InlineResponse2007 response = api.instrumentidentifiersPost(profileId, body);

        // TODO: test validations
    }
    
    /**
     * Delete an Instrument Identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentidentifiersTokenIdDeleteTest() throws ApiException {
        String profileId = null;
        String tokenId = null;
        api.instrumentidentifiersTokenIdDelete(profileId, tokenId);

        // TODO: test validations
    }
    
    /**
     * Retrieve an Instrument Identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentidentifiersTokenIdGetTest() throws ApiException {
        String profileId = null;
        String tokenId = null;
        InlineResponse2007 response = api.instrumentidentifiersTokenIdGet(profileId, tokenId);

        // TODO: test validations
    }
    
    /**
     * Update a Instrument Identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentidentifiersTokenIdPatchTest() throws ApiException {
        String profileId = null;
        String tokenId = null;
        Body1 body = null;
        InlineResponse2007 response = api.instrumentidentifiersTokenIdPatch(profileId, tokenId, body);

        // TODO: test validations
    }
    
    /**
     * Retrieve all Payment Instruments associated with an Instrument Identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void instrumentidentifiersTokenIdPaymentinstrumentsGetTest() throws ApiException {
        String profileId = null;
        String tokenId = null;
        String offset = null;
        String limit = null;
        InlineResponse2008 response = api.instrumentidentifiersTokenIdPaymentinstrumentsGet(profileId, tokenId, offset, limit);

        // TODO: test validations
    }
    
}