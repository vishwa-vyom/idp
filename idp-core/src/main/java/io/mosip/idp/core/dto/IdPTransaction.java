/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.idp.core.dto;

import lombok.Data;

import java.util.List;

@Data
public class IdPTransaction {

    String clientId;
    String relyingPartyId;
    String redirectUri;
    Claims requestedClaims;
    String claimsLocales;

    String kycToken;
    String partnerSpecificUserToken;
    long authTimeInSeconds;
    String code;

    List<String> acceptedClaims;
    List<String> permittedScopes;
    String encryptedKyc;
    String aHash;

    String error;

    String nonce;
}
