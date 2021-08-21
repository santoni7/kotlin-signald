package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A local account in signald
 */
@Serializable
public data class Account(
    /**
     * The address of this account
     */
    public val address: JsonAddress? = null,
    /**
     * The Signal device ID. Official Signal mobile clients (iPhone and Android) have device ID = 1,
     * while linked devices such as Signal Desktop or Signal iPad have higher device IDs.
     */
    @SerialName("device_id")
    public val deviceId: Int? = null,
    /**
     * The primary identifier on the account, included with all requests to signald for this
     * account. Previously called 'username'
     */
    @SerialName("account_id")
    public val accountId: String? = null
) : SignaldResponseBodyV1()
